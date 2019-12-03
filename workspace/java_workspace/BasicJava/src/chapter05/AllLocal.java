package chapter05;

// 전역 & 지역
public class AllLocal {
 static	int num = 5;//전역변수
	
	public static void main(String[] args) {
		System.out.println(num);
		//지역변수는 지역내에서만 사용 가능
		int num = 10; // 지역변수
		System.out.println(num);
	}
	
}
