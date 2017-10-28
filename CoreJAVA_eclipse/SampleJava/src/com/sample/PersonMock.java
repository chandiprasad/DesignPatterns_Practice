package com.sample;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class PersonMock {
	
	private Person person;
 
	@Before
	public void setUp(){
		person =  mock(Person.class);
	}
	
	@Test
	public void testPersonData(){
		when(person.getDob()).thenReturn(Calendar.getInstance().getTime());
		System.out.println(verify(person.getDob()));
	}
	
	
	
}
