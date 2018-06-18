package com.inc.dayary.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inc.dayary.domain.Diary;

@Service
public class DiaryServiceImpl implements DiaryService {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Diary> list() {
		return sqlSession.selectList("diary.list");
	}
	
}
