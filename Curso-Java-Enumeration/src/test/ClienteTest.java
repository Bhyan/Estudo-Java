package test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.Client;

public class ClienteTest {
	Client client;
	
	@Before
	public void setUp() {
		Date now = new Date();
		client = new Client("Test", "test@test.com", now);
	}
	
	@Test
	public void nameTest() {
		assertEquals(client.getName(), "Test");
	}
	
}
