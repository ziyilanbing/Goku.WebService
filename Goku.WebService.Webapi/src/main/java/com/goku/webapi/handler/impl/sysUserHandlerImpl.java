package com.goku.webapi.handler.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.goku.service.sysUserService;
import com.goku.webapi.handler.sysUserHandler;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/15.
 */
@Component
public class sysUserHandlerImpl implements sysUserHandler {

    @Reference
    sysUserService sysuserservice;

    @Override
    public List<Map<String, String>> selectUserByOrgid(String orgid, Integer pageNo, Integer pageSize, String orderSort, String orderFiled)
    {
        return sysuserservice.selectUserByOrgid(orgid,pageNo,pageSize,orderSort,orderFiled);
    }
}
