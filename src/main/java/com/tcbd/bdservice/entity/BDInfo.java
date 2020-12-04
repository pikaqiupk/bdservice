package com.tcbd.bdservice.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * BD卡
 * */
@EntityScan
public class BDInfo {
    protected  String  bdID;    //北斗卡号
    protected  String  bdDevcID;    //北斗产品ID
    protected  String  message;     //信息内容

    public BDInfo() {
    }

    public BDInfo(String bdID, String message) {
        this.bdID = bdID;
        this.message = message;
    }

    public BDInfo(String bdID, String bdDevcID, String message) {
        this.bdID = bdID;
        this.bdDevcID = bdDevcID;
        this.message = message;
    }

    public String getBdID() {
        return bdID;
    }

    public void setBdID(String bdID) {
        this.bdID = bdID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBdDevcID() {
        return bdDevcID;
    }

    public void setBdDevcID(String bdDevcID) {
        this.bdDevcID = bdDevcID;
    }
}
