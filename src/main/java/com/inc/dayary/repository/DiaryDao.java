package com.inc.dayary.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inc.dayary.domain.Diary;

@Repository
public class DiaryDao {
	@Autowired
	private SqlSession sqlsession;

	public List<Diary> list() {
		return sqlsession.selectList("diary.list");
	}

	public void insert(Diary diary) {		
		sqlsession.insert("diary.insert", diary);		
	}

	public List<Diary> list(String id) {
		return sqlsession.selectList("diary.list", id);
	}
}
