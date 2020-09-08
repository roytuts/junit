package com.roytuts.junit.mockito.doreturn;

import java.util.UUID;

public class ActivityService {

	private ActivityDao activityDao;

	public ActivityService() {
		activityDao = new ActivityDao();
	}

	public ActivityModel getActivity(String id) {
		ActivityModel activity = activityDao.getActivity(id);
		final String newName = getActivityGeneratedName();
		activity = updateActivityName(activity, newName);
		return activity;
	}

	private String getActivityGeneratedName() {
		String newName = "Activity_" + UUID.randomUUID().toString();
		return newName;
	}

	private ActivityModel updateActivityName(ActivityModel activity, String name) {
		ActivityModel activityModel = new ActivityModel();
		activityModel.setId(activity.getId());
		activityModel.setName(name);
		return activityModel;
	}

}
