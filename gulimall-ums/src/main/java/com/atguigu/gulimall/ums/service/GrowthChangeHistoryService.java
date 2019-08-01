package com.atguigu.gulimall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.ums.entity.GrowthChangeHistoryEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 成长值变化历史记录
 *
 * @author chenzinan
 * @email kukuchenzinan@outlook.com
 * @date 2019-08-01 18:54:51
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

