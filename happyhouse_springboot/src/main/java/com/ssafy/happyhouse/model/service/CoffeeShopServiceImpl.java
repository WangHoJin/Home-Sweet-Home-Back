package com.ssafy.happyhouse.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.model.CoffeeShopDto;
import com.ssafy.happyhouse.model.dao.CoffeeShopDao;

@Service
public class CoffeeShopServiceImpl implements CoffeeShopService{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<CoffeeShopDto> listCoffeeShopInfo() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CoffeeShopDao.class).listCoffeeShopInfo();
	}

	@Override
	public List<CoffeeShopDto> getCoffeeShopInDong(String dong) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CoffeeShopDao.class).getCoffeeShopInDong(dong);
	}

	@Override
	public List<CoffeeShopDto> getCoffeeShopRadius(String aptName) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CoffeeShopDao.class).getCoffeeShopRadius(aptName);
	}

}
