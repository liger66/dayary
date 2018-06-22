package com.inc.dayary.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inc.dayary.domain.Member;

@Repository
public class MemberDao {
	@Autowired
	private SqlSession session;

	public Member findOne(String id) {
		Member member = session.selectOne("member.select", id);
		return member;
	}

	public Member getfindOneByEmail(String email) {
		Member member = session.selectOne("member.findOneByEmail", email);
		return null;
	}

	public void signup(Member member) {
		session.insert("member.signup", member);		
	}
}
