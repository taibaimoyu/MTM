package com.mtm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtm.dao.SysRoleMapper;
import com.mtm.entity.SysRole;

@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
    
    public SysRole selectByName(String name){
        return roleMapper.selectByName(name);
    }
}