package com.rest.service.impl;

import com.rest.entity.Dollar;
import com.rest.repository.DollarRepository;
import com.rest.service.DollarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Daniel Mezzavilla
 */
@Service
public class DollarServiceImpl implements DollarService {

    private final DollarRepository dollarRepository;

    @Autowired
    public DollarServiceImpl(DollarRepository dollarRepository) {
        this.dollarRepository = dollarRepository;
    }

    @Override
    public void saveAll() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Iterable<Dollar>> response = restTemplate.exchange(
                "https://economia.awesomeapi.com.br/json/USD-BRL",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Iterable<Dollar>>() {
                });
        Iterable<Dollar> cotacaoDollar = response.getBody();

        dollarRepository.saveAll(cotacaoDollar);
    }
}
