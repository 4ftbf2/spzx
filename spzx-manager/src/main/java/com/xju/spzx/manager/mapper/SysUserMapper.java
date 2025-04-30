package com.xju.spzx.manager.mapper;

import com.xju.spzx.model.entity.system.SysUser;
import jakarta.validation.constraints.Max;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SysUserMapper {

    /**
     * 根据用户名查询用户数据
     * @param userName
     * @return
     */
    public abstract SysUser selectByUserName(String userName) ;

}