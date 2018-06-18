package com.inc.dayary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inc.dayary.domain.Diary;

public interface DiaryService {
	public List<Diary> list();
}
