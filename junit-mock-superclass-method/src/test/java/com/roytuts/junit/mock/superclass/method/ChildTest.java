package com.roytuts.junit.mock.superclass.method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class ChildTest {

	private Child child = Mockito.spy(new Child());

	@Test
	public void testShow() {
		// Child child = Mockito.spy(new Child());

		// Mockito.doNothing().when((Parent) child).display();
		Mockito.doNothing().when(child).display();

		child.show();

		Mockito.verify(child, Mockito.times(1)).show();
	}

	@Test
	public void testGetWelcomeMsg() {
		Mockito.when(child.getMsg(Mockito.anyString())).thenReturn("Soumitra");

		String msg = child.getWelcomeMsg("Roy Tutorials");

		// assertEquals("Hello, Roy Tutorials", msg);

		assertEquals("Soumitra", msg);
	}

}
