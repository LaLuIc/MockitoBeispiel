package de.dhbw.se;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class ServiceTest {
	
	Service service;
	
	
	@Before
	public void setup(){
		Addierer addierer = mock(Addierer.class);
		when(addierer.add(3, 3)).thenReturn(6);
		service =new Service();
		service.setAddierer(addierer);
	}

	@Test
	public void testAddTwoNumbers(){
		Assert.assertEquals(6, service.addTwoNumbers(3,3));
	}
	

	
	@Test
	public void testVerify()  {
		Addierer addierer = mock(Addierer.class);
		when(addierer.add(3, 3)).thenReturn(6);
		service =new Service();
		service.getAddierer();
		
		verify(addierer, times(1));
	}
	
	@Test
	public void testSpy() {
		Addierer addierer = mock(Addierer.class);
		when(addierer.add(3, 3)).thenReturn(6);
		service =new Service();
		service.setAddierer(addierer);
		
		Service serviceSpy = spy(service);
		
		Assert.assertEquals(6, serviceSpy.addTwoNumbers(3, 3));
	}
}
