package com.webjava.kernel.mybatis.mapper;

import com.webjava.kernel.entity.IMAdmin;
import com.webjava.kernel.entity.IMUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IMAdminMapper {

    IMAdmin selectAdminById(@Param("id") Integer id);

    IMAdmin selectAdminByName(@Param("username") String userName);

    List<IMAdmin> selectAllAdmin();

    int updatePasswordSelective(IMAdmin record);
}