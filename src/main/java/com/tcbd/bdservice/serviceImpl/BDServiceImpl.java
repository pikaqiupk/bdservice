package com.tcbd.bdservice.serviceImpl;

import com.tcbd.bdservice.dao.BdDao;
import com.tcbd.bdservice.entity.BDInfo;
import com.tcbd.bdservice.service.BDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BDServiceImpl implements BDService {

    @Autowired
    private BdDao bdDao ;
    @Override
    public String getDevcIdByBDId(String bdId) {
        return bdDao.getDevcIdByBDId(bdId);
    }
    @Override
    public int sendMessage(BDInfo bdInfo) {
        return bdDao.insertTBCommunicationInfo(bdInfo);
    }
}
