package com.mockito.service;

import com.mockito.model.Person;

public class MeanTaxFactorCalculator {

    private final TaxService taxService;

    public MeanTaxFactorCalculator(TaxService taxService) {
        this.taxService = taxService;
    }

    public double calculateMeanTaxFactorFor(Person person) {
        double currentTaxFactor = taxService.getCurrentTaxFactorFor(person);
        double anotherTaxFactor = taxService.getCurrentTaxFactorFor(person);
        System.out.println("currentTaxFactor :"+currentTaxFactor+" anotherTaxFactor :"+anotherTaxFactor);
        return (currentTaxFactor + anotherTaxFactor) / 2;
    }

}
