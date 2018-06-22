package com.inc.dayary.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inc.dayary.domain.Diary;
import com.inc.dayary.repository.DiaryDao;

@Service
public class DiaryServiceImpl implements DiaryService {
	@Autowired
	private DiaryDao diaryDao;

	@Override
	public List<Diary> list() {
		return diaryDao.list();
	}

	@Override
	public void add(Diary diary) {
		diaryDao.insert(diary);
	}

	@Override
	public List<Diary> list(String id) {
		return diaryDao.list(id);
	}
	
}
