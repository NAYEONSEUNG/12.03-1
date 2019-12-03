package chapter05;

public class SmartCar {
	//변수에 private를 선언하면
	//캡슐화가되어 해당class에서만 사용가능
	//외부에서는 접근 불가능!
		private int speed;//전역변수 선언, 자동차 속도
		private boolean breakcar;
		//엑셀을 밟을때 동작하는 메서드!
		
		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		public boolean isBreakcar() {
			return breakcar;
		}

		public void setBreakcar(boolean breakcar) {
			this.breakcar = breakcar;
		}

		public void drive() {
			System.out.println(speed);
		}
	
		
		
		
		
}//class
