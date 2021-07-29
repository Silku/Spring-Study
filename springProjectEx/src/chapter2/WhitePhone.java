package chapter2;

public class WhitePhone implements Phone{
	private Battery battery;
	
	public WhitePhone() {
		battery = new Battery("화이트폰 배터리");
	}
	@Override
	public void show() {
		System.out.println(this.getClass().getSimpleName() + ":" + battery.getBatteryName());
	}
}
