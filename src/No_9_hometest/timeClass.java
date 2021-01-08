package No_9_hometest;

public class timeClass {
	private long startTime;
	private long endTime;
	//…Ë÷√StopWatch¿‡
	public timeClass() {
		java.util.Date date=new java.util.Date();
		startTime=date.getTime();
	}
	
	public void start(long startTime) {
		 this.startTime=startTime;
	}
	
	public void Stop(long endTime) {
		this.endTime=endTime;
	}
	
	
	public long getElapsedTime() {
		java.util.Date time=new java.util.Date(); 
		return time.getTime();
		
	}
	
	public long getStartTime() {
		return startTime;
		
	}
	
	public long getEndTime() {
		return endTime;
		
	}
}
