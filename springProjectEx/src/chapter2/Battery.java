package chapter2;

public class Battery {
	private String batteryName;
	public Battery() {
		// TODO Auto-generated constructor stub
	}
//	alt shift s => Constructor using Fields
	public Battery(String batteryName) {
		super();
		this.batteryName = batteryName;
	}
	
	public String getBatteryName() {
		return batteryName;
	}
	public void setBatteryName(String batteryName) {
		this.batteryName = batteryName;
	}
	
}
