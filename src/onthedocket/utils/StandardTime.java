package onthedocket.utils;

public class StandardTime extends Time {
	private boolean isAM;
	
	public StandardTime(int hourComponent, int minuteComponent, boolean isAM) {
		super(hourComponent, minuteComponent);
		this.isAM = isAM;
	}
	
	@Override
	public String toString() {
		if(isAM) {
			return super.toString() + " AM";
		}
		return super.toString() + " PM";
	}
	
	public boolean isAM() {
		return isAM;
	}
}
