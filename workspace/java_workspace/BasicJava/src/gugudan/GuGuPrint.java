package gugudan;

public class GuGuPrint {

		public void guGuDan(int dansu) {
			
			int result; //변수선언만 한 상태, 초기화x
			System.out.println("구구단" + dansu + "단 출력");
		
			for(int i = 1; i <= 9; i++) {
				 result = dansu * i;
				System.out.println(dansu + " x "+ i + " = " + result);
			}//for
		}//구구단
	
}//클래스
