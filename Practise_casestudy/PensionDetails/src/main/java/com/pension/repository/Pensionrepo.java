package com.pension.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pension.model.PensionerDetail;

@Repository
public interface Pensionrepo extends JpaRepository<PensionerDetail, String>{
//
//	@Query("select p1_0.aadhar,p1_0.DOB,p1_0.Pan,p1_0.allowance,p1_0.acc_num,p1_0.bank_name,p1_0.bank_type,p1_0.name,p1_0.pension_class,p1_0.salary from PensionerDetail p1_0 where p1_0.aadhar=?1")
	public List<PensionerDetail> findByAadhar(String adhar);

}