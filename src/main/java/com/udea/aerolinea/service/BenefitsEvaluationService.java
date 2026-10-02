package com.udea.aerolinea.service;

import com.udea.aerolinea.model.BenefitsRequest;
import com.udea.aerolinea.model.BenefitsResponse;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BenefitsEvaluationService {

    @Autowired
    private KieContainer kieContainer;

    public BenefitsResponse evaluate(BenefitsRequest request) {
        BenefitsResponse response = new BenefitsResponse();
        KieSession kieSession = kieContainer.newKieSession();
        try {
            // Insertamos los hechos: pasajero, vuelo y la respuesta
            kieSession.insert(request.getPassenger());
            kieSession.insert(request.getFlight());
            kieSession.insert(response);

            // Ejecutamos todas las reglas
            kieSession.fireAllRules();
        } finally {
            kieSession.dispose();
        }
        return response;
    }
}