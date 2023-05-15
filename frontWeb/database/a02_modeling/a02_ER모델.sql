/*
# ER모델
1. 세상의 사물을 개체(entity)와 개체 간의의 관계(relationship)로
	표현한다.
2. 개체
	독립적인 의미를 지니고 있는 유무형의 사람 또는 사물
	개체의 특성을 나타내는 속성(attribute)에 의해 식별	 
	개체끼리는 서로 관계를 가짐
	ex)
	사람(개체)		사람(개체)
	
	남편(역할)		부인(역할)
		
			결혼(관계)
3. ER 다이어그램 : ER모델은 개체와 개체 간의 관계를 표준된 그림으로
	나타낸다.
	1) 개체/관계
		직원(개체)		작업(관계)		프로젝트(개체)
		
	2) 속성
		직원의 속성 : 직원번호 이름 직위 전화번호
		프로젝트의 속성 : 과제번호 예산
4. 개체(entity)
	1) 사람, 사물, 장소, 개념, 사건과 같이 유무형의 정보를
		가지고 있는 독립적인 실체
	2) 데이터베이스에서 주로 다루는 객체 - (낱개로 구성된 것,
		낱개가 각각 데이터 값을 가지는 것, 데이터 값이 변하는 것)
	3) 비슷한 속성의 객체 타입(entity type)을 구성하며,
		개체 집합(entity set)으로 묶임
		
			도서 : 개체 타입
			
			축구 아는 여자 ==> 개체
			축구의 이해 ==> 개체    ====> 개체의 집합
			축구의 역사 ==> 개체
5. 속성(attribute)
	1) 개체가 가진 성질
		개체 타입 :도서 ==> 테이블
		속성 	: 도서이름, 출판사, 도서단가 ==> 컬럼
	2) 속성의 ER다이어그램 표현
		속성은 기본적으로 타원으로 표현, 개체 타입을 나타내는
			직사각형과 실선으로 연결됨
		속성의 이름은 타원의 중앙에 표기함
		속성이 개체를 유일하게 식별할 수 있는 키일 경우 속성 이름에
			밑줄을 그음
						도서		
			속성 	키속성	도서이름	출판사 도서단가(일반속성)
			   	
ex) 학사 관리 시스템에서 
    - entity가 무엇이 있는 정리
      학생, 교수, (강의), (학과), (수강신청), (성적)
    - 이것을 속성으로 구분하여 질 내용 무엇이 있는지				   	
      학생 : 학번, 이름, 주소, 전화번호, 이메일, 전공
      교수 : 교수번호, 이름, 전공분야, 이메일
      강의 : 강의번호, 강의명, 학점, 강의 시간,(교수번호)
      학과 : 학과코드, 학과명...., (학번, 교수번호)
      수강신청 : 수강신청일, 수강신청상태, (학번, 강의번호)
      성적 : 학점, 성적, (학번)
    - entity type의 이름을 정하고,
      학생정보, 교수정보, 강의 ==> 강좌정보, 학과정보,
      수강신청정보, 성적정보
    - exerd모델링으로 테이블명 컬럼명을 정해보자.
      위 entity type과 속성정보를 혼합하여 erd를 작성한다.
      
    
			
						
								
											
																	
		
		
		
		
	
				
										
	
	
 */