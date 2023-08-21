package kadai_014;

public class Car_Chapter14 {
	
	private int  gear = 1;//1速から5速のギアを表す
	private int speed = 10;//ギアチェンジ後の速度を表す

	
	//コンストラクタ(初期化)
	public Car_Chapter14( int gear, int speed) {
		
		this.gear = gear;
		this.speed = speed;
	
	}
	//メソッド作成
	public void gearChange(int afterGear) {
		switch(afterGear) {
		
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		case 6 -> this.speed = 60;
		default -> this.speed = 10;
		}
		System.out.println("ギア" + gear +"から" + afterGear +"に切り替えました");
		
		}
	public void run() {
		
		System.out.println("速度は時速" + this.speed +"kmです");
		
	}
		
	}
	
