package com.web.board.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.board.member.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByLoginId(String username);
}
