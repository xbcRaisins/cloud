package com.xbc.cloud.xbcsystem.dao;



import com.xbc.cloud.xbcsystem.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述：
 *
 * @author weizeng
 * @date 2019/4/30 16:39
 */
@Repository
public interface UserDao {

    List<User> findAll();
}
