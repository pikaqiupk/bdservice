package com.tcbd.bdservice.controller;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.tcbd.bdservice.entity.BDInfo;
import com.tcbd.bdservice.service.BDService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class BDController {

    @Autowired
    private BDService bdService ;

    @ResponseBody
    @RequestMapping(value = "/sendMessageByBDId", method = {RequestMethod.POST})
    private String sendMssageByBDId(@RequestBody BDInfo info) throws JSONException {

        JSONObject result = new JSONObject();

        //获取devcid
        String devceid = bdService.getDevcIdByBDId(info.getBdID());
        if(devceid==null){
            result.put("msg","该北斗卡不存在");
            result.put("isOK","flase");
        }else{
            info.setBdDevcID(devceid);
            int i = bdService.sendMessage(info);
            if(i>0){
                result.put("msg","北斗消息下发成功");
                result.put("isOK","true");
            }else{
                result.put("msg","北斗消息下发失败");
                result.put("isOK","flase");
            }
        }
        return result.toJSONString();
    }
}
