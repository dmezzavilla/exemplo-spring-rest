package com.rest.schedule;

import com.rest.controller.DollarRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Mezzavilla
 */
@Component
public class DolarSchedule {

    private final DollarRestController dollarRestController;

    @Autowired
    public DolarSchedule(DollarRestController dollarRestController) {
        this.dollarRestController = dollarRestController;
    }

    @Scheduled(fixedRate = 1000000)
    public void getCotacaoDollar() {
        dollarRestController.save();
    }

}
