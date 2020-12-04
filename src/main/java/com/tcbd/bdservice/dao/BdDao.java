package com.tcbd.bdservice.dao;

import com.tcbd.bdservice.entity.BDInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BdDao {

    String getDevcIdByBDId(String bdId);  // 查询产品ID
    int insertTBCommunicationInfo(BDInfo bdInfo);  //插入实时通讯表

}
