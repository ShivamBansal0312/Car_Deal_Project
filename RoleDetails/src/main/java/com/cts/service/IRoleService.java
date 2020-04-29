package com.cts.service;

import java.util.List;

import com.cts.model.RoleModel;

public interface IRoleService {
	
	public List<RoleModel> getAllRoleDetails();
	public void saveRoleDetails(RoleModel roleModel);

}
