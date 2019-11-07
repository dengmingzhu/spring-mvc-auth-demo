package com.shopp.service;


import com.shopp.entity.SysUser;

import java.util.List;

/**
 * @Author DengMingZhu
 * @Date 2019/10/28 21:41
 * @Version 1.0
 */
public interface AuthorityService {

     void insert(SysUser sysUser) ;

     List<SysUser> SelectAll(SysUser sysUser) throws Exception;


     int updateByPrimaryKey(Long id, SysUser user) throws Exception;

}
