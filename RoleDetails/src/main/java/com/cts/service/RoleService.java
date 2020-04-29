package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.model.RoleModel;
import com.cts.repository.RoleRepository;

@Service
@Transactional
public class RoleService implements IRoleService{

	@Autowired
	RoleRepository roleRepository;
	
	public List<RoleModel> getAllRoleDetails(){
		return (List<RoleModel>) roleRepository.findAll();
	}
	
	public void saveRoleDetails(RoleModel roleModel) {
		roleRepository.save(roleModel);
	}
}
