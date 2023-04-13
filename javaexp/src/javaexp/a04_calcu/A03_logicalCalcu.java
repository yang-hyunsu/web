package javaexp.a04_calcu;

public class A03_logicalCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		7. 논리연산자
			- 비교연산식이 2개이상, 또는 not(!) 연산자를
			이용할 때 논리연산자를 이용해서 처리한다.
			&& : (and) 논리합 두가지 비교연산자가 모두 true
				일 때, true 그외는 false
				ex) 나이에 따라 청소년요금제 적용 여부
				boolean isAdolPay = age>=14 && age<18
			|| : (or) 논리곱 두가지 비교연산자중 하나이상 true
				이면 true, 둘다 false일 때 false
				ex) 놀이공원 나이에 따라 무료입장 적용 여부
				boolean isFree = age<5 || age>=65
			 ! : 비교연산식이나 논리연산식의 결과가 true이면
			 	false로, false이면 true로 처리
			 	boolean isPass = point>=60; 합격하는 경우 
			 	boolean isNotPass = !(point>=60); 불합격하는 경우
			 	boolean isNotPass = !isPass; 불합격하는 경우
			 	booleans isPay = !isFree; 유료인 경우		
		 * */
		int age = 25;
		boolean isAdol = age>=14&&age<18;
		// && and 두개의 비교연산자가 모두다 true일 때 처리
		System.out.println("청소년 여부:"+isAdol);
		String inputId = "himan";
		String inputPass = "777";
		boolean isMemValid = inputId.equals("himan") && 
				inputPass.equals("7777");
		System.out.println("로그인 성공여부:"+isMemValid);
		age = 67;
		boolean isFree = age<5 || age>=65;
		System.out.println("무료여부:"+isFree);
		// ex) 국어, 영어 할당해서 
		//     모두 다 80점 이상이면  상금 50000 여부
		//     두 중에 하나만 90점이상 상금 30000 여부를 처리한다고
		//     할 때, 변수를 선언하고 상금 여부를 출력..
		int kor = 90;
		boolean is80Over = kor>=80;
		System.out.println("국어점수가 80이상여부:"+is80Over);
		int eng = 79;
		boolean isGift50000 = kor>=80&&eng>=80;
		System.out.println("상금 50000 여부:"+isGift50000);
		boolean isGift30000 = kor>=90||eng>=90;
		System.out.println("상금 30000 여부:"+isGift30000);
		int point = 50;
		boolean isPass = point>=60;
		boolean isNotPass = !isPass;
		System.out.println("합격여부:"+isPass);
		System.out.println("불합격여부:"+isNotPass);
		int age1 = 17;
		boolean isAdol1 = age1>=14&&age1<18;
		boolean isNotAdol1 = !isAdol1;
		boolean isNotAdol2 = !(age1>=14&&age1<18);
		boolean isNotAdol3 = age1<14||age1>=18;
		System.out.println("청소년인지여부?"+isAdol1);
		System.out.println("청소년인지 아닌지 여부?"+isNotAdol1);
		System.out.println("청소년인지 아닌지 여부?"+isNotAdol2);
		System.out.println("청소년인지 아닌지 여부?"+isNotAdol3);
		// ex) 나이가 5미만이거나 65이상이면 무료요금제이다.
		//     무료요금제가 아닌 경우(유료요금)를 
		//		위 !(not)활용하거나
		//     논리연산식을 사용하여 출력하세요.
		int age2 = 20;
		boolean isFree2 = age2<5 || age2>=65;
		System.out.println("무료요금 여부:"+isFree2);
		boolean isNotFree2 = !isFree2;
		boolean isNotFree3 = !( age2<5 || age2>=65);
		boolean isNotFree4 = age2>=5 && age2<65;
		System.out.println("무료요금이 아닌 경우:"+isNotFree2);
		System.out.println("무료요금이 아닌 경우:"+isNotFree3);
		System.out.println("무료요금이 아닌 경우:"+isNotFree4);
		// 17:05~
		
		
		
		
		
		
	}

}
