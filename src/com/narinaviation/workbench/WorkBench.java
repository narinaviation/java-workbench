package com.narinaviation.workbench;

import java.util.Arrays;
import java.util.Date;

public class WorkBench {
	public static void main(String[] args) {
		Date now = new Date();
		Date past = new Date();
		past.setTime(1635673487640L);
		System.out.println(now);
		System.out.println(past);
		System.out.println(now.before(past));
	}
}
