package com.capg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.bean.Merchants;
import com.capg.bean.ThirdPartyMerchants;
import com.capg.repo.ThirdPartyMerchantRepo;

@Service
public class ThirdPartyMerchantServiceImpl implements ThirdPartyMerchantService{

	@Autowired
	private ThirdPartyMerchantRepo repo3;

	@Override
	public Optional<ThirdPartyMerchants> getThirdPartyMerchantById(int id) {
	
		return repo3.findById(id);
	}

	@Override
	public Iterable<ThirdPartyMerchants> findAll() {
		
		return repo3.findAll();
	}

	@Override
	public void addThirdPartyMerchant(int id, String name, String organization) {
		ThirdPartyMerchants m1 = new ThirdPartyMerchants();
		m1.setId(id);
		m1.setName(name);
		m1.setOrganisation(organization);
		repo3.save(m1);
		
	}

	@Override
	public void deleteThirdPartyMerchantById(int id) {
		repo3.deleteById(id);
		
	}

	
	
}
