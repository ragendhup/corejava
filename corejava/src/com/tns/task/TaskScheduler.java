package com.tns.task;

public class TaskScheduler {
	public void scheduleTask(Task task, int interval) {//method
		new Thread(() -> //Lamda expression
		{
			while (interval >= 0) 
		      {
		        try 
		        {
		          task.execute();
		          Thread.sleep(interval * 1000); //interval in 1 seconds converted to 1000 milliseconds
		        } 
		        catch (Exception e) 
		        {
		          System.out.println("Exception raised "+e.getMessage());
		          break;
		        }
		      }
		}
		).start();//intervals
	}
}
