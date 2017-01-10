package com.mxiaixy.mapper;

import com.mxiaixy.pojo.User;

/**
 * Created by Mxia on 2017/1/10.
 */
public interface UserMapper {

    void save(User user);

    User findById(Integer id);


}
