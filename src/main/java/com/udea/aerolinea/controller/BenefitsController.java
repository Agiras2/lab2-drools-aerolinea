package com.udea.aerolinea.controller;

import com.udea.aerolinea.model.BenefitsRequest;
import com.udea.aerolinea.model.BenefitsResponse;
import com.udea.aerolinea.service.BenefitsEvaluationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airline")
public class BenefitsController {

    @Autowired
    private BenefitsEvaluationService evaluationService;

    @PostMapping("/evaluate")
    public BenefitsResponse evaluate(@Valid @RequestBody BenefitsRequest request) {
        return evaluationService.evaluate(request);
    }
}