package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.CoffeeShopDto;

public interface CoffeeShopService {
		// 전체 카페 검색
		List<CoffeeShopDto> listCoffeeShopInfo();
		
		// 해당 동 카페 검색
		List<CoffeeShopDto> getCoffeeShopInDong(String dong);
		
		// 반경 내 카페 수
		List<CoffeeShopDto> getCoffeeShopRadius(String aptName);
		
		// 커피집이 가장 많은 동네
		List<CoffeeShopDto> getDongRank();
		
		// 해당 동 내 커피샵 순위
		List<CoffeeShopDto> getCoffeeShopRank(String dong);
}
