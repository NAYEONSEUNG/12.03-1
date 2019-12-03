package chapter05;

//Java에서 사용하는 다양한 변수들

public class ManyFields {
		int all; //필드(멤버변수), 전역변수, 멤버변수  //지역변수는 반드시 초기화해서 사용해야함
													   //전역변수는 초기화 해도되고 안해도되고
													   //초기화안하면 default값으로 자동으로 해줌 자바가
		static String stt; // 필드(멤버변수), 전역변수
							//static (정적)변수, 클래스변수
		
							//밑에놈도 지역변수,매개변수
		public void sum(int a, int b) { //매개변수, 지역변수 매개변수라고 하는게 더 맞다.(매개체가되는 변수)
			int localNum = 30;//지역변수
		}
		
		public void test() {
				ManyFields mf = new ManyFields();
				mf.all = 5;//인스턴스변수
		}
		
}//class
