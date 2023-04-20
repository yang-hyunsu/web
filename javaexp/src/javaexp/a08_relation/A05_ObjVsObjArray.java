package javaexp.a08_relation;

import javaexp.a08_relation.vo.Mart;
import javaexp.a08_relation.vo.Product;

public class A05_ObjVsObjArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mart m01 = new Mart("행복마트");
		// 예외 내용 확인1
		m01.buyList();
		// 예외 내용 확인2
		m01.buyProduct(new Product("사과",3000,2));
		m01.buyProdPlan("홍길동", 3);
		m01.buyProduct(new Product("오렌지",1200,5));
		m01.buyProduct(new Product("딸기",8800,2));
		m01.buyProduct(new Product("수박",15000,4));
		// 예외 내용 확인3
		m01.buyProduct(new Product("키위",1200,5));
		m01.buyList();
		
		
	}

}
