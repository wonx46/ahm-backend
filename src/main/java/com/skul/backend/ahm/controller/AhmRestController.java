package com.skul.backend.ahm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skul.backend.ahm.domain.AhmsdnisMstbrnd;
import com.skul.backend.ahm.repository.MstBrndRepository;
import com.skul.backend.util.ObjectUtiliti;

import id.co.ahm.jxf.constant.StatusMsgEnum;
import id.co.ahm.jxf.dto.DtoResponse;
import id.co.ahm.jxf.util.DtoHelper;

@RestController
@RequestMapping("brand/")
public class AhmRestController {

private final MstBrndRepository brandRepo;
	
	
	@Autowired
	public AhmRestController(MstBrndRepository brandRepox){
		this.brandRepo     = brandRepox;
		
	}
	
	@RequestMapping(value="/retrieve", method = RequestMethod.GET)
	public DtoResponse getProduk(){
		List<AhmsdnisMstbrnd> list = brandRepo.findAll();
		 return DtoHelper.constructResponse(StatusMsgEnum.SUKSES, null, list);
	}
	
	@RequestMapping(value="/findbycode", method = RequestMethod.GET)
	public DtoResponse getBrandbycode(@Param(value = "code") String code){
		List<AhmsdnisMstbrnd> list = new ArrayList<AhmsdnisMstbrnd>();
		AhmsdnisMstbrnd brand = brandRepo.findByCode(code);
		list.add(brand);
		 return DtoHelper.constructResponse(StatusMsgEnum.SUKSES, null, list);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public DtoResponse delete(@PathVariable String id){
		
		try {
			brandRepo.deletebrand(id);
			 return DtoHelper.constructResponse(StatusMsgEnum.SUKSES, null, null);
		} catch (Exception e) {
			e.printStackTrace();
			 return DtoHelper.constructResponse(StatusMsgEnum.GAGAL, null, null);
		}
		
	}
	
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public DtoResponse save(@RequestBody AhmsdnisMstbrnd obj){
		System.out.println(obj.getVbrndcd()+" - "+obj.getVbrndnm());
		try {
			brandRepo.saveAndFlush(obj);
			 return DtoHelper.constructResponse(StatusMsgEnum.SUKSES, null, null);
		} catch (Exception e) {
			e.printStackTrace();
			 return DtoHelper.constructResponse(StatusMsgEnum.GAGAL, null, null);
		}
		
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public DtoResponse update(@RequestBody AhmsdnisMstbrnd obj){
		System.out.println(obj.getVbrndcd()+" - "+obj.getVbrndnm());
		try {
			AhmsdnisMstbrnd exist  = brandRepo.findByCode(obj.getVbrndcd());
			if(exist != null){
				exist = (AhmsdnisMstbrnd) ObjectUtiliti.copyObject(obj, exist);
				brandRepo.saveAndFlush(obj);
				 return DtoHelper.constructResponse(StatusMsgEnum.SUKSES, null, null);
			}else{
				 return DtoHelper.constructResponse(StatusMsgEnum.GAGAL, null, null);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			 return DtoHelper.constructResponse(StatusMsgEnum.GAGAL, null, null);
		}
		
	}
}
