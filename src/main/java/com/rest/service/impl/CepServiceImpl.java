package com.rest.service.impl;

import com.rest.entity.Cep;
import com.rest.repository.CepRepository;
import com.rest.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class CepServiceImpl implements CepService {

    private final CepRepository cepRepository;

    @Autowired
    public CepServiceImpl(CepRepository cepRepository) {
        this.cepRepository = cepRepository;
    }

    @Transactional
    @Override
    public void save() {
        RestTemplate restTemplate = new RestTemplate();
        Cep cep = restTemplate.getForObject("https://viacep.com.br/ws/01001000/json/", Cep.class);
        cepRepository.save(cep);

    }
}
