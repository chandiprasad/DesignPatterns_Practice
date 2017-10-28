package com.mockito.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.mockito.dao.DataAccessException;
import com.mockito.dao.PersonDao;
import com.mockito.model.Person;
/**
 * 
 * @RunWith(MockitoJUnitRunner.class)
 * Compatible with JUnit 4.4 and higher, this runner adds following behavior: 
• Initializes mocks annotated with Mock, so that explicit usage of MockitoAnnotations.initMocks(Object) is not necessary. Mocks are initialized before each test method. 
• validates framework usage after each test method. See javadoc for Mockito.validateMockitoUsage(). 
 * @author csannidh
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonDaoTest {

	@Mock
	private DataSource ds;

	@Mock
	private Connection c;

	@Mock
	private PreparedStatement stmt;

	@Mock
	private ResultSet rs;

	private Person p;

	
	@Before
	public void setUp() throws Exception {
		assertNotNull(ds);
		//stubbing
		when(c.prepareStatement(any(String.class))).thenReturn(stmt);
		when(ds.getConnection()).thenReturn(c);
		
		p = new Person();
		p.setId(1);
		p.setFirstName("Johannes");
		p.setLastName("Smythe");
		//Stubbing
		when(rs.first()).thenReturn(true);
		when(rs.getInt(1)).thenReturn(1);
		when(rs.getString(2)).thenReturn(p.getFirstName());
		when(rs.getString(3)).thenReturn(p.getLastName());
		when(stmt.executeQuery()).thenReturn(rs);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nullCreateThrowsException() throws DataAccessException {
		new PersonDao(ds).create(null);
	}
	@Test
	public void createPerson() throws DataAccessException {
		new PersonDao(ds).create(p);
	}
	@Test
	public void createAndRetrievePerson() throws Exception {
		PersonDao dao = new PersonDao(ds);
		dao.create(p);
		Person r = dao.retrieve(1);
		assertEquals(p.getId(), r.getId());
	}

}