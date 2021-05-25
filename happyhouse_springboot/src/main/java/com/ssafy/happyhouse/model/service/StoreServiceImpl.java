package com.ssafy.happyhouse.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.model.StoreDto;
import com.ssafy.happyhouse.model.dao.StoreDao;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<StoreDto> listStoreInfo() {
		return sqlSession.getMapper(StoreDao.class).listStoreInfo();
	}

	@Override
	public List<StoreDto> getStoreInDong(String dong) {
		return sqlSession.getMapper(StoreDao.class).getStoreInDong(dong);
	}

	@Override
	public List<StoreDto> getStoreRadius(int no, double radius) {
		StoreDto storeDto=new StoreDto();
		storeDto.setNo(no);
		storeDto.setRadius(radius);
		return sqlSession.getMapper(StoreDao.class).getStoreRadius(storeDto);
	}

	@Override
	public List<StoreDto> getStoreRadiusRank(int no, double radius) {
		StoreDto storeDto=new StoreDto();
		storeDto.setNo(no);
		storeDto.setRadius(radius);
		return sqlSession.getMapper(StoreDao.class).getStoreRadiusRank(storeDto);
	}

	@Override
	public List<StoreDto> getDongRank() {
		return sqlSession.getMapper(StoreDao.class).getDongRank();
	}

	@Override
	public List<StoreDto> getStoreRank(String dong) {
		return sqlSession.getMapper(StoreDao.class).getStoreRank(dong);
	}

	@Override
	public List<StoreDto> getStoreMarkerInfo(StoreDto storeDto) {
		return sqlSession.getMapper(StoreDao.class).getStoreMarkerInfo(storeDto);
	}

}