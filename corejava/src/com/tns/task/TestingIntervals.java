package com.tns.task;

public class TestingIntervals {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        TaskScheduler scheduler = new TaskScheduler(); // method-scheduler
	        // Lambda expression
	        Task task1 = () -> System.out.println("Task 1 running (every 2 seconds)");
	        Task task2 = () -> System.out.println("Task 2 running (every 5 seconds)");
	        Task task3 = () -> System.out.println("Task 3 running (every 10 seconds)");

	        scheduler.scheduleTask(task1, 2);
	        scheduler.scheduleTask(task2, 5);
	        scheduler.scheduleTask(task3, 10);
	    } 
}
