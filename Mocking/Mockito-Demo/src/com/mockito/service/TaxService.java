package com.mockito.service;

import com.mockito.model.Person;

public interface TaxService {

    double getCurrentTaxFactorFor(Person person);
}
