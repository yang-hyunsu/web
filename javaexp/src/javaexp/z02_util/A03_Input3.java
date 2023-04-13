package javaexp.z02_util;

public class A03_Input3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("# 구매한 물건의 가격 #");
		System.out.println("구매한 물건의 갯수:"+args.length);
		int price01 = Integer.parseInt(args[0]);
		int price02 = Integer.parseInt(args[1]);
		int price03 = Integer.parseInt(args[2]);
		System.out.println("물건1의 가격:"+price01);
		System.out.println("물건2의 가격:"+price02);
		System.out.println("물건3의 가격:"+price03);
		int totPrice = price01 + price02 + price03;
		System.out.println("총 비용:"+totPrice);
	}

}
