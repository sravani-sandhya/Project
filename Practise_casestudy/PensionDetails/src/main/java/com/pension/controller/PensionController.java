package com.pension.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pension.model.PensionerDetail;
import com.pension.service.PensionService;

@RestController
public class PensionController {

	
	@Autowired
	private PensionService pensionService;
	
	@PostMapping("/savePensionDetails")
	public String savePension(PensionerDetail pensionerDetail) {
		return pensionService.savePensionDetails(pensionerDetail);
	}
	
	@GetMapping("/getByAadhar/{aadhar}")
	public Optional<PensionerDetail> getPensionByAadhar(@PathVariable String aadhar) {
		return pensionService.getPensionByAadhar(aadhar);
	}
	
	@GetMapping("/all")
	public List<PensionerDetail> pensionerDetails(){
		System.out.println(pensionService.pensionerDetails());
		return pensionService.pensionerDetails();
	}
}
