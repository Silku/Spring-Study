package chapter2;

public class WhitePhone implements Phone{
	private Battery battery;
	
	public WhitePhone() {
		
	}
	
	
	
	public Battery getBattery() {
		return battery;
	}



	public void setBattery(Battery battery) {
		this.battery = battery;
	}



	public WhitePhone(Battery battery) {
		super();
		this.battery = battery;
	}



	@Override
	public void show() {
		System.out.println(this.getClass().getSimpleName() + ":" + battery.getBatteryName());
	}
}
