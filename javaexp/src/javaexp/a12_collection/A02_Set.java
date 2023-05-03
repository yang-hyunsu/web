package javaexp.a12_collection;

import java.util.HashSet;
import java.util.Set;

public class A02_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# Set 컬렉션
		1. 특징
			수학의 집합에 비유
			*저장 순서가 유지되지 않음
			*객체를 중복 저장 불가
			하나의 null만 저장 가능
		2. 구현 실제 클래스
			HashSet, LinkedHashSet, TreeSet
		3. 주요 메서드
			add() : 추가
			contains() : 내용포함여부
			isEmpty() : 비어있는지여부
			Iterator<E> iterator() 
			size() : 크기
			clear() : 비우기
			remove(Object ob) : 객체 삭제
		4. 기본 형식
			 Set<E> set = new HashSet<E>();
			 
		*/
		Set<String> set = new HashSet<String>();
		set.add("오렌지");
		set.add("오렌지");
		set.add("수박");
		set.add("수박");
		set.add("딸기");
		set.add("딸기");
		set.add("딸기");
		System.out.println("# 저장된 set 데이터 #");
		for(String fruit:set) {
			System.out.println(fruit);
		}
		// ex) 주머니 속에 빨강 구슬 2개, 파랑 구슬3개, 노랑 구슬 
		// 2개를 Set으로 할당해서 넣고, 현재 주머니 속의 구슬의
		// 종류를 출력하세요.
		Set<String> pouch = new HashSet<String>();
		pouch.add("빨강구슬");
		pouch.add("빨강구슬");
		pouch.add("파랑구슬");
		pouch.add("파랑구슬");
		pouch.add("파랑구슬");
		pouch.add("노랑구슬");
		pouch.add("노랑구슬");
		System.out.println("주머니 속에 있는 구슬의 종류");
		for(String one:pouch) {
			System.out.println(one);
		}
		
		
	}

}
