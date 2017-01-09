package com.mxiaixy.dao.impl;

import com.mxiaixy.dao.UserDao;
import com.mxiaixy.pojo.User;
import com.mysql.jdbc.StringUtils;
import jdk.internal.org.objectweb.asm.commons.Remapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Mxia on 2017/1/7.
 */
@Repository
public class UserDaoImpl implements UserDao {
    public UserDaoImpl(){
        System.out.println("userDaoImpl被创建le");
    }

//    获取jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void save(User user) {
        String sql = "insert into t_user(username,password) values(?,?)";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword());

    }

    public void update(User user) {
        String sql = "update t_user set username = ?,password=? where id = ?";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void del(Integer id) {
        String sql = "delete from t_user where id =?";
        jdbcTemplate.update(sql,id);
    }

    public User findById(Integer id) {
        String sql = "select * from t_user where id=?";
       return jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setUsername(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));
                    return user;
            }
        },id);
    }

    public List<User> findAll() {
        String sql = "select * from t_user ";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));

    }

    public Long count() {
        String sql = "select count(*) from t_user";

        return jdbcTemplate.queryForObject(sql,new SingleColumnRowMapper<Long>());
    }
}
