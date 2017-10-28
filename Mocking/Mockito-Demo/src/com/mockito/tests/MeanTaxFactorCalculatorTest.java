package com.mockito.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mockito.model.Person;
import com.mockito.service.MeanTaxFactorCalculator;
import com.mockito.service.TaxService;
/**
 * 
 * mock()/@Mock: create mock

    optionally specify how it should behave via Answer/ReturnValues/MockSettings
    when()/given() to specify how a mock should behave
    If the provided answers don’t fit your needs, write one yourself extending the Answer interface

	spy()/@Spy: partial mocking, real methods are invoked but still can be verified and stubbed
	@InjectMocks: automatically inject mocks/spies fields annotated with @Spy or @Mock
	verify(): to check methods were called with given arguments
	
	    can use flexible argument matching, for example any expression via the any()
	    or capture what arguments where called using @Captor instead

 * 
 * 
 * 
 * @author csannidh
 *
 */

public class MeanTaxFactorCalculatorTest {

    static final double TAX_FACTOR = 10;

    @Mock TaxService taxService;
    @InjectMocks MeanTaxFactorCalculator systemUnderTest;  //@InjectMocks: automatically inject mocks/spies fields annotated with @Spy or @Mock

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);//Initializes objects annotated with Mockito annotations for given testClass
    }

    @Test
    public void should_calculate_mean_tax_factor() {

        // given
        given(taxService.getCurrentTaxFactorFor(any(Person.class))).willReturn(TAX_FACTOR);

        // when
        double meanTaxFactor = systemUnderTest.calculateMeanTaxFactorFor(new Person());

        // then
	    assertThat(meanTaxFactor, equalTo(TAX_FACTOR));
    }

}
