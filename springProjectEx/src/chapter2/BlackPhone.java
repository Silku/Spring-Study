package chapter2;

public class BlackPhone implements Phone{
	private Battery battery;
	
	public BlackPhone() {
		battery = new Battery("블랙폰 배터리");
	}	
	
	
//	종속성 낮은 것의 차이점 - 생성자와 세터가 있다.
	public BlackPhone(Battery battery) {
		super();
		this.battery = battery;
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public void show() {
		System.out.println(this.getClass().getSimpleName() + ":" + battery.getBatteryName());
	}
}
