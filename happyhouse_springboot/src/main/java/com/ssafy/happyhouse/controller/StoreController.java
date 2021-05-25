package com.ssafy.happyhouse.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.model.CoffeeShopDto;
import com.ssafy.happyhouse.model.SidoGugunCodeDto;
import com.ssafy.happyhouse.model.StoreDto;
import com.ssafy.happyhouse.model.service.CoffeeShopService;
import com.ssafy.happyhouse.model.service.StoreService;

@RestController
@RequestMapping("/store")
@CrossOrigin("*")
public class StoreController {
	private static final Logger logger = LoggerFactory.getLogger(HouseSearchController2.class);
	
	@Autowired
	private StoreService sSer;
	
	@GetMapping(value = "/storeall")
	public ResponseEntity<List<StoreDto>> listStore() throws Exception {
		List<StoreDto> list=sSer.listStoreInfo();
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<StoreDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(value = "/storedong/{dong}")
	public ResponseEntity<List<StoreDto>> getStoreInDong(@PathVariable("dong") String dong) throws Exception {
		List<StoreDto> list = sSer.getStoreInDong(dong);
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<StoreDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(value = "/storeradius/{no}/{radius}")
	public ResponseEntity<List<StoreDto>> getStoreCnt(@PathVariable("no") int no, @PathVariable("radius") int radius) throws Exception {
		double dradius = (double)(radius / 1000.0);
		List<StoreDto> list = sSer.getStoreRadius(no, dradius);
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<StoreDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(value = "/storeradiusrank/{no}/{radius}")
	public ResponseEntity<List<StoreDto>> getStoreRadiusRank(@PathVariable("no") int no, @PathVariable("radius") int radius) throws Exception {
		double dradius = (double)(radius / 1000.0);
		List<StoreDto> list = sSer.getStoreRadiusRank(no, dradius);
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<StoreDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(value = "/dongrank")
	public ResponseEntity<List<StoreDto>> getDongRank() throws Exception {
		List<StoreDto> list = sSer.getDongRank();
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<StoreDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	@GetMapping(value = "/storerank/{dong}")
	public ResponseEntity<List<StoreDto>> getStoreRank(@PathVariable("dong") String dong) throws Exception {
		List<StoreDto> list = sSer.getStoreRank(dong);
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<StoreDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(value="/storemarker/{lat}/{lng}")
	public ResponseEntity<List<StoreDto>> getStoreMarkerInfo(@PathVariable("lat") String lat,@PathVariable("lng") String lng) throws Exception{
		CoffeeShopDto coffeeshopDto=new CoffeeShopDto(lat,lng);
		StoreDto storeDto = new StoreDto(lat,lng);
		List<StoreDto> list=sSer.getStoreMarkerInfo(storeDto);
		if(list!=null && !list.isEmpty()) {
			return new ResponseEntity<List<StoreDto>>(list,HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
}
