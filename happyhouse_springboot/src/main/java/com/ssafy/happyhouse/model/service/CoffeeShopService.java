package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.CoffeeShopDto;

public interface CoffeeShopService {
		// 전체 카페 검색
		List<CoffeeShopDto> listCoffeeShopInfo();
		
		// 해당 동 카페 검색
		List<CoffeeShopDto> getCoffeeShopInDong(String dong);
}
