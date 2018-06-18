package com.inc.dayary.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inc.dayary.domain.Diary;

@Repository
public class DiaryDao {
	@Autowired
	private SqlSession sqlsession;

	List<Diary> list() {
		return sqlsession.selectList("diary.select");
	}
	
	
}
