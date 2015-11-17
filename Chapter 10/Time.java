//Jerry Huang
//Period 4
//Time Class
//Project 10.1

public class Time {
	private int hour, minute, second, totalSeconds;
	//constructors
	public Time() {
		totalSeconds = (int)(System.currentTimeMillis() / 1000);
		hour = totalSeconds / 3600 % 24;
		minute = totalSeconds % 3600 / 60;
		second = totalSeconds % 60;
	}
	public Time(long elapsedTime) {
		totalSeconds = (int)(elapsedTime / 1000);
		hour = totalSeconds / 3600 % 24;
		minute = totalSeconds % 3600 / 60;
		second = totalSeconds % 60;
	}
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//get methods
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	public void setTime(long elapsedTime) {
		totalSeconds = (int)(elapsedTime / 1000);
		hour = totalSeconds / 3600 % 24;
		minute = totalSeconds % 3600 / 60;
		second = totalSeconds % 60;
	}
}
