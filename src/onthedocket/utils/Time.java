package onthedocket.utils;

public class Time {
	private int hourComponent;
	private int minuteComponent;
	
	public Time(int hour, int minute) {
		setHourComponent(hour);
		setMinuteComponent(minute);
	}
	
	@Override
	public String toString() {
		if(minuteComponent < 10) {
			return hourComponent + ":0" + minuteComponent;
		}
		return hourComponent + ":" + minuteComponent;
	}

	public int getHourComponent() {
		return hourComponent;
	}

	public void setHourComponent(int hourComponent) {
		this.hourComponent = hourComponent;
	}

	public int getMinuteComponent() {
		return minuteComponent;
	}

	public void setMinuteComponent(int minuteComponent) {
		this.minuteComponent = minuteComponent;
	}
}
