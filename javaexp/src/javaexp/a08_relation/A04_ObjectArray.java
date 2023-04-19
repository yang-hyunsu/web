package javaexp.a08_relation;

import javaexp.a08_relation.vo.Emp;
import javaexp.a08_relation.vo.Student;

public class A04_ObjectArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 크기 선언 후, 객체 생성
		// 타입[] 배열명 = new 타입[크기];
		// ex) int[] arr = new int[3]; (기존 int 배열)
		Emp[] empArr = new Emp[3];
		empArr[0] = new Emp(1000,"홍길동","사원",3500,10);
		empArr[1] = new Emp(1001,"김길동","대리",4500,20);
		empArr[2] = new Emp(1002,"신길동","과장",5500,30);
		// 각각의 0부터 시작하는 index별로 객체를 생성해서 할당.
		
		// foreach(향상된 for문)을 통해 getXXX로 간접으로 속성값 호출..
		// for(단위 객체:배열참조)
		for(Emp emp:empArr) {
			System.out.print(emp.getEmpno()+"\t");
			System.out.print(emp.getEname()+"\t");
			System.out.print(emp.getJob()+"\t");
			System.out.print(emp.getSal()+"\t");
			System.out.print(emp.getDeptno()+"\n");
		}
		/*
		ex) 아래의 2차원 데이터기준으로 class를 만들고 객체형 배열에 할당하고 출력하세요
			번호   이름   국어 영어  수학
			1     홍길동  70  80   90
			2     김길동  80  80   95
			3     신길동  90  83   92
		 * */
		Student[] sArry = new Student[3];
		sArry[0] = new Student(1,"홍길동",70,80,90);
		sArry[1] = new Student(2,"김길동",80,80,95);
		sArry[2] = new Student(3,"신길동",90,83,92);
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(Student st:sArry) {
			System.out.print(st.getNo()+"\t");
			System.out.print(st.getName()+"\t");
			System.out.print(st.getKor()+"\t");
			System.out.print(st.getEng()+"\t");
			System.out.print(st.getMath()+"\t");
			int tot = st.getKor()+st.getEng()+st.getMath();
			System.out.print(tot+"\t");
			System.out.print(tot/3+"\n");
		}
		
	}

}
