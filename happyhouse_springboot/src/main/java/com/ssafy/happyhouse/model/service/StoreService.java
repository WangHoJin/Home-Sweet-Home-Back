package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.StoreDto;

public interface StoreService {
	// 전체 편의점 검색
	List<StoreDto> listStoreInfo();
	
	// 해당 동 편의점 검색
	List<StoreDto> getStoreInDong(String dong);
	
	// 반경 내 편의점 정보
	List<StoreDto> getStoreRadius(int no,double radius);
	
	// 반경 내 편의점 랭크
	List<StoreDto> getStoreRadiusRank(int no, double radius);
	
	// 편의점이 가장 많은 동네
	List<StoreDto> getDongRank();
	
	// 해당 동 내 편의점 순위
	List<StoreDto> getStoreRank(String dong);
	
	// 마커클릭시 편의점 정보 가져오기
	List<StoreDto> getStoreMarkerInfo(StoreDto storeDto);
}
