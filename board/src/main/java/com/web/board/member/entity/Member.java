package com.web.board.member.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity // 엔티티 생성시
@Getter
@Setter
@Builder // 추후 Builder 사용시
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "MEMBER_TB")
public class Member {
/*



CREATE TABLE MEMBER_TB (
    MEMBER_ID NUMBER PRIMARY KEY,
    MEMBER_LOGIN_ID VARCHAR2(255 CHAR),
    MEMBER_ROLE VARCHAR2(255 CHAR),
    MEMBER_NAME VARCHAR2(255 CHAR),
    MEMBER_PASSWORD VARCHAR2(255 CHAR),
    MEMBER_EMAIL VARCHAR2(255 CHAR),
    IS_USED VARCHAR2(255 CHAR),
    IS_DEL VARCHAR2(255 CHAR),
    ISRT_DATE TIMESTAMP,
    UPDT_DATE TIMESTAMP
);
INSERT INTO MEMBER_TB (MEMBER_ID,MEMBER_LOGIN_ID,MEMBER_ROLE,MEMBER_NAME,MEMBER_PASSWORD,MEMBER_EMAIL,IS_USED,IS_DEL,ISRT_DATE,UPDT_DATE) VALUES
    (1020,'login123','ADMIN','John Doe','password123','john.doe@example.com','Y','N',TIMESTAMP'2023-08-09 16:29:03.146',TIMESTAMP'2023-08-09 16:29:03.146');



CREATE SEQUENCE MEMBER_SEQ
    START WITH 1
    INCREMENT BY 1
    CACHE 20;
CREATE OR REPLACE TRIGGER MEMBER_TRG 
BEFORE INSERT ON MEMBER 
FOR EACH ROW 
BEGIN 
    SELECT MEMBER_SEQ.NEXTVAL 
    INTO :new.MEMBER_ID 
    FROM DUAL; 
END;




 * */
    @Id // 엔티티 내부에서 아이디임을 선언
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 시퀀스 전략 선언
    @Column(name = "MEMBER_ID") // 아이디에 해당하는 컬럼명 선언
    private Long id;

    @Column(name = "MEMBER_LOGIN_ID")
    private String loginId;

    @Column(name = "MEMBER_ROLE")
    private String role;

    @Column(name = "MEMBER_NAME")
    private String name;

    @Column(name = "MEMBER_PASSWORD")
    private String password;

    @Column(name = "MEMBER_EMAIL")
    private String email;

    @Column(name = "IS_USED")
    private String isUsed;

    @Column(name = "IS_DEL")
    private String isDel;

    @Column(name = "ISRT_DATE")
    private LocalDateTime isrtDate;

    @Column(name = "UPDT_DATE")
    private LocalDateTime updtDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	public LocalDateTime getIsrtDate() {
		return isrtDate;
	}

	public void setIsrtDate(LocalDateTime isrtDate) {
		this.isrtDate = isrtDate;
	}

	public LocalDateTime getUpdtDate() {
		return updtDate;
	}

	public void setUpdtDate(LocalDateTime updtDate) {
		this.updtDate = updtDate;
	}

    
}
