package chapter05;

public class StaticTest {
		// static 지정어
		//1.객체생성 없이 사용 하 수 있다.
		//2.공유(공용)에 개념으로 사용된다.
		//*static을 남발해서 사용하면 메모리에 부하
	
		//static으로 선언된 변수나 메서드는
		//인스턴스명이 아닌 클래스명으로 호출해서 사용할 것!!
	
	
		String name = "체리"; //일반변수, 전역변수, 멤버변수
		static int point = 3000; // static변수, 클래스변수
		
		public StaticTest() {//기본 생성자 메서드
			
		}
		
		public void join() { //일반 메서드
			System.out.println(name); //일반변수 출력
			System.out.println(point);//static변수 출력
		}
		
		public static void search() {//static(정적)메서드
			//static메서드 내에서는 지역분수와 static변수만 사용가능
			System.out.println(point);//static변수 출력
			
			    String hobby = "영화감상";//지역변수
			     System.out.println(hobby);//지역변수 출력
			//전역변수는 객체를 생성해야만 사용가능, static메서드는
			//객체 생성없이 사용 가능한 static메서드를
			//실행하는데 내부에서 객체생성이필요한 전역변수를 사용하면
			//static을 사용하는 의마가 없음1(모순발생)
			//System.out.println(name); //일반변수 출력
		}
	
	
}
