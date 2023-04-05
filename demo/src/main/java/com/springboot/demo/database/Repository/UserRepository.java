package com.springboot.demo.database.Repository;

import com.springboot.demo.database.domain.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
    // 获取作者的密码
    // 查看作者的密码
    // 查看作者的邮箱
    // 验证作者
}
