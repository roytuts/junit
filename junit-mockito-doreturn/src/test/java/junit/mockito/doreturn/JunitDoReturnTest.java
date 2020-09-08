package junit.mockito.doreturn;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import com.roytuts.junit.mockito.doreturn.ActivityDao;
import com.roytuts.junit.mockito.doreturn.ActivityModel;
import com.roytuts.junit.mockito.doreturn.ActivityService;

@RunWith(PowerMockRunner.class)
public class JunitDoReturnTest {

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
		Mockito.doReturn(activity).when(dao).getActivity("0001");
		// call the real service class method
		ActivityModel activityModel = service.getActivity("0001");
		// verify with assert
		assertEquals(activityModel.getId(), activity.getId());
	}

	private ActivityModel getActivityModel() {
		return new ActivityModel("1000", "Activity_TODO");
	}

}
