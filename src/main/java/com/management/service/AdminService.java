package com.management.service;


import com.management.dao.ProjectCategoryMapper;
import com.management.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *业务员层的各接口Seriver方法
 */
@Service
public class AdminService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private ProjectCategoryMapper projectCategoryMapper;

    /**
     * 创建项目类别
     */


}
