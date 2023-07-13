package a01_diexp.z01_vo;

import java.util.Set;
// a01_diexp.z01_vo.Gamer
public class Gamer {
	private Set<String> bead;

	public Set<String> getPocket() {
		return bead;
	}
	public void setPocket(Set<String> bead) {
		this.bead = bead;
	}
	public void showMyPocket() {
		System.out.println("내 주머니에 있는 구슬들");
		if(bead!=null) {
			for(String bd:bead) {
				System.out.println(bd);
			}
		}else {
			System.out.println("구슬이 없네요.");
		}
	}
	
}
