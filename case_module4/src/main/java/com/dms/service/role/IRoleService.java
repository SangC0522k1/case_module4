package com.dms.service.role;

import com.dms.model.Role;
import com.dms.model.dto.RoleDTO;
import com.dms.service.IGeneralService;

import java.util.List;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);

    List<RoleDTO> getAllRoleDTO();
}
