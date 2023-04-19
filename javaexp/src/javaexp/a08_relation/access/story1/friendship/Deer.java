package javaexp.a08_relation.access.story1.friendship;

public class Deer {
	void callWoodCutterInfo() {
		WoodCutter wc = new WoodCutter();
		System.out.println("default접근 제어:"
				+wc.hiddenDeer);
	}
}
