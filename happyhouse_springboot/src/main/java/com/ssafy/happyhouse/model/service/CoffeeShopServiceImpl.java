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
		return sqlSession.getMapper(CoffeeShopDao.class).listCoffeeShopInfo();
	}

	@Override
	public List<CoffeeShopDto> getCoffeeShopInDong(String dong) {
		return sqlSession.getMapper(CoffeeShopDao.class).getCoffeeShopInDong(dong);
	}

	@Override
	public List<CoffeeShopDto> getCoffeeShopRadius(String aptName, double radius) {
		CoffeeShopDto coffeeShopDto = new CoffeeShopDto();
		coffeeShopDto.setAptName(aptName);
		coffeeShopDto.setRadius(radius);
		return sqlSession.getMapper(CoffeeShopDao.class).getCoffeeShopRadius(coffeeShopDto);
	}

	@Override
	public List<CoffeeShopDto> getCoffeeShopRadiusRank(String aptName, double radius) {
		CoffeeShopDto coffeeShopDto = new CoffeeShopDto();
		coffeeShopDto.setAptName(aptName);
		coffeeShopDto.setRadius(radius);
		return sqlSession.getMapper(CoffeeShopDao.class).getCoffeeShopRadiusRank(coffeeShopDto);
	}
	
	@Override
	public List<CoffeeShopDto> getDongRank() {
		return sqlSession.getMapper(CoffeeShopDao.class).getDongRank();
	}
	
	@Override
	public List<CoffeeShopDto> getCoffeeShopRank(String dong) {
		return sqlSession.getMapper(CoffeeShopDao.class).getCoffeeShopRank(dong);
	}
	
	@Override
	public List<CoffeeShopDto> getCoffeeMarkerInfo(CoffeeShopDto coffeeshopDto) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CoffeeShopDao.class).getCoffeeMarkerInfo(coffeeshopDto);
	}


}
