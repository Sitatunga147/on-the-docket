package onthedocket.utils;

public class MilitaryTime extends Time {
	
	public MilitaryTime(StandardTime std) {
		super(std.getHourComponent(), std.getMinuteComponent());
		
		if(!std.isAM() && std.getHourComponent() != 12) {
			setHourComponent(std.getHourComponent() + 12);
		} else if(std.isAM() && std.getHourComponent() == 12) {
			setHourComponent(0);
		}
	}

	public MilitaryTime(int hourComponent, int minuteComponent) {
		super(hourComponent, minuteComponent);
	}
	
	public StandardTime getStandardTime() {
		int hours;
		if(getHourComponent() == 0 || getHourComponent() == 12) {
			hours = 12;
		} else {
			hours = getHourComponent() % 12;
		}
		
		StandardTime std = new StandardTime(hours, getMinuteComponent(), (getHourComponent() < 12));
		return std;
	}
}
