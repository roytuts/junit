package com.roytuts.junit.mockito.donothing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
public class JunitDoNothingTest {

	private ActivityService service;
	private ActivityDao dao;
	private ActivityModel activity;

	@Before
	public void setUp() throws Exception {
		// below object should be real in order to carry out testing on it
		service = new ActivityService();
		// create mock object of DAO instead of using the real object
		dao = Mockito.mock(ActivityDao.class);
		// create new ActivityModel
		activity = getActivityModel();
		// set mock dao object to activityDao in service implementation class
		Whitebox.setInternalState(service, "activityDao", dao);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetActivity() {
		// return mock activity model object instead of real object from dao
		Mockito.doNothing().when(dao).createActivity(activity);
	}

	private ActivityModel getActivityModel() {
		return new ActivityModel("1000", "Activity_TODO");
	}

}
