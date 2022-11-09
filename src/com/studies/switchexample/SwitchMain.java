package com.studies.switchexample;

public class SwitchMain {

	private enum WEEK_DAY {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	};

	public static void main(String[] args) {
		System.out.println(checkWeekDayWithNewSwitch(WEEK_DAY.FRIDAY));
		System.out.println(checkWeekDayWithNewSwitch(WEEK_DAY.SUNDAY));
	}

	private static String checkWeekDayWithNewSwitch(WEEK_DAY day) {
		return switch (day) {
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY: yield day + " is a week day.";
		case SATURDAY, SUNDAY: yield day + " is a weekend day.";
		};
	}

}
