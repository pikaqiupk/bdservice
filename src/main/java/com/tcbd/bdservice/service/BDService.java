package com.tcbd.bdservice.service;

import com.tcbd.bdservice.entity.BDInfo;

public interface BDService {

    String getDevcIdByBDId(String bdId);
    int sendMessage(BDInfo bdInfo);  //发送

}
