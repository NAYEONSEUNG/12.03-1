package arrytest;

public class ArryTest01 {

	public static void main(String[] args) {
		//배열: 1개 이상의 값을 저장할때 사용
		//변수: 1개의 값만 저장가능
		
		//배열생성방법 2가지
		//1.배열선언및 초기화
		int[] num = {1, 2, 3};
		
		//2.선언과 초기화를 별개로
		//[3] <= 배열공간의 크기(3칸)
		int[] arrNum2 = new int[3]; //선언
	//  int arrNum2[] = new int[3]; 자료형 뒤에 안붙혀도 괜찮음
		arrNum2[0] = 1; //초기화
		arrNum2[1] = 2; //초기화
		arrNum2[2] = 3; //초기화
	//	arrNum2[index번호]
		
		//배열(Array)의 특징
		//1.배열공간의 수를 반드시 지정해야함
		//2.배열공간은 같은 자료형 값만 저장가능
		//3.배열은 공간마다 index번호를 가짐(0부터시작)
		//※배열의 모든 공간을 꼭 사용해야하는건 아니다.
		//배열공간에 값을입력!1
		//arrNum2[2] = 3;
		
		//배열공간에값을출력
		//System.out.println(arrNum2[2]);
				
		//5명의 학생이름을 저장하는 배열생성
		String [] arrName = new String[5];//사이즈가 5칸
		
		arrName[0] = "오동선";
		arrName[1] = "김혜원";
		arrName[2] = "백진주";
		arrName[3] = "진미경";
		arrName[4] = "이승주";
		
		//System.out.println(arrName[2]);
		//5칸
		//인덱스: 0,1,2,3,4(5칸)
		//배열.length <= 배열의 크기를 반환
		for(int i = 0; i < arrName.length; i++) {//length배열의 사이즈를 알ㄹ
			System.out.println(arrName[i]);
		}
		
		
		
		
		
	}//main

}//class
