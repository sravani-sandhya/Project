package com.pension.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pension.model.PensionerDetail;
import com.pension.repository.Pensionrepo;

@Service
public class PensionService {
	
	@Autowired
	private Pensionrepo pensionrepo;

	public String savePensionDetails(PensionerDetail pensionerDetail) {
		pensionrepo.save(pensionerDetail);
		return "PensionDetails are saved successfully";
	}

	public Optional<PensionerDetail> getPensionByAadhar(String Aadhar) {
		// TODO Auto-generated method stub
		System.out.println(pensionrepo.findById(Aadhar));
		return pensionrepo.findById(Aadhar);
	}

	public List<PensionerDetail> pensionerDetails() {
		// TODO Auto-generated method stub
		return pensionrepo.findAll();
	}
}
