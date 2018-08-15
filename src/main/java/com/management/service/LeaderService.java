package com.management.service;

import com.management.model.jsonrequestbody.IsProjectCategoryPassedPostInfo;
import com.management.model.ov.Result;

/**
 * @program: management
 * @description: 领导层
 * @author: ggmr
 * @create: 2018-07-31 09:33
 */
public interface LeaderService {

    /**
     * @Description: 领导审核一个项目大类
     * @Param: [info]
     * @Return: com.management.model.ov.Result
     * @Author: ggmr
     * @Date: 18-8-15
     */
    Result isProjectCategoryPassed(IsProjectCategoryPassedPostInfo info);

    /**
     * @Description: 查找一个领导手下的所有业务员
     * @Param: [leaderId]
     * @Return: com.management.model.ov.Result
     * @Author: ggmr
     * @Date: 18-8-15
     */
    Result findAllSubordinate(String leaderId);
    
    
    /**
     * @Description: 查看一个领导手下现在需要他进行终审的项目大类或项目申请列表
     * @Param: [userId]
     * @Return: com.management.model.ov.Result
     * @Author: ggmr
     * @Date: 18-8-15
     */
    Result waitJudgeProjectCategoryList(String leaderId);


}