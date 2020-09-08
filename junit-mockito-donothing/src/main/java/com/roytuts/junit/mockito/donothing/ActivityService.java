package com.roytuts.junit.mockito.donothing;

public class ActivityService {

	private ActivityDao activityDao;

	public ActivityService() {
		activityDao = new ActivityDao();
	}

	public void createActivity(final ActivityModel activity) {
		activityDao.createActivity(activity);
	}

}
