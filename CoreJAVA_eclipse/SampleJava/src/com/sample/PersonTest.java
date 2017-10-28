package com.sample;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;
import org.junit.Test;



public class PersonTest {
	
	Person p = new Person("Ram",new Date(),100);

	@Test
	public void test() {
		checkImmutability();
	}

	@Test
	public void testIsNameImmutability() {
		@SuppressWarnings("unused")
		String s = p.getName();
		s = "Laxman"; // reason: name is String and String Immutable
		checkImmutability();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testIsDateImmutability() {
		Date d = p.getDob();
		d.setDate(25);
		checkImmutability();
	}
	
	@Test
	public void testIsIdImmutability() {
		
		checkImmutability();
	}
	
	@SuppressWarnings("deprecation")
	private void checkImmutability(){
		assertEquals("Ram", p.getName());
		assertEquals(Calendar.getInstance().getTime().getDate(), p.getDob().getDate());
		assertEquals(100, p.getId());
	}
}
