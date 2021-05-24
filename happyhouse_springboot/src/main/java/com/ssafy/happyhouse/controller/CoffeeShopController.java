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
import com.ssafy.happyhouse.model.service.CoffeeShopService;

@RestController
@RequestMapping("/coffeeshop")
@CrossOrigin("*")
public class CoffeeShopController {
	private static final Logger logger = LoggerFactory.getLogger(HouseSearchController2.class);
	
	@Autowired
	private CoffeeShopService cSer;
	
	@GetMapping(value = "/coffeeall")
	public ResponseEntity<List<CoffeeShopDto>> listCoffeeShop() throws Exception {
		List<CoffeeShopDto> list = cSer.listCoffeeShopInfo();
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<CoffeeShopDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(value = "/coffee/{dong}")
	public ResponseEntity<List<CoffeeShopDto>> getCoffeeShopInDong(@PathVariable("dong") String dong) throws Exception {
		List<CoffeeShopDto> list = cSer.getCoffeeShopInDong(dong);
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<CoffeeShopDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(value = "/coffeeradius/{aptName}/{radius}")
	public ResponseEntity<List<CoffeeShopDto>> getCoffeeShopCnt(@PathVariable("aptName") String aptName, @PathVariable("radius") int radius) throws Exception {
		double dradius = (double)(radius / 1000.0);
		List<CoffeeShopDto> list = cSer.getCoffeeShopRadius(aptName,dradius);
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<CoffeeShopDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(value = "/coffeeradiusrank/{aptName}/{radius}")
	public ResponseEntity<List<CoffeeShopDto>> getCoffeeShopRadiusRank(@PathVariable("aptName") String aptName, @PathVariable("radius") int radius) throws Exception {
		double dradius = (double)(radius / 1000.0);
		List<CoffeeShopDto> list = cSer.getCoffeeShopRadiusRank(aptName,dradius);
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<CoffeeShopDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(value = "/dongrank")
	public ResponseEntity<List<CoffeeShopDto>> getDongRank() throws Exception {
		List<CoffeeShopDto> list = cSer.getDongRank();
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<CoffeeShopDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	@GetMapping(value = "/coffeeshoprank/{dong}")
	public ResponseEntity<List<CoffeeShopDto>> getCoffeeShopRank(@PathVariable("dong") String dong) throws Exception {
		List<CoffeeShopDto> list = cSer.getCoffeeShopRank(dong);
		if(list != null && !list.isEmpty()) {
			return new ResponseEntity<List<CoffeeShopDto>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(value="/coffeemarker/{lat}/{lng}")
	public ResponseEntity<List<CoffeeShopDto>> getCoffeeMarkerInfo(@PathVariable("lat") String lat,@PathVariable("lng") String lng) throws Exception{
		CoffeeShopDto coffeeshopDto=new CoffeeShopDto(lat,lng);
		List<CoffeeShopDto> list=cSer.getCoffeeMarkerInfo(coffeeshopDto);
		if(list!=null && !list.isEmpty()) {
			return new ResponseEntity<List<CoffeeShopDto>>(list,HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
}
