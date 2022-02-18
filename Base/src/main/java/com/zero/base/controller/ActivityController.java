package com.zero.base.controller;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity 管理工具
 * @author zero
 * */
public class ActivityController {
    public static List<Activity> activityList = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    public static void finishAll() {
        if (activityList.size() > 0) {
            for (Activity activity : activityList) {
                activity.finish();
            }
        }
        activityList.clear();
    }
}
