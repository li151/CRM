package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.service.FWBGservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/fwbg")
@SessionAttributes("FWBG")
public class FWBGController {
    @Autowired
    FWBGservice fwbGservice;
    @Autowired
    Usercontroller usercontroller;

    @RequestMapping("/insertfwbg")
    public String insertfb(Model model,String khwt, String khmc, String fwrxm, String fwlx, String fwdd, String fwjd, String fwjb, String datemin, String datemax, String wtzt){
        String s = fwbGservice.insertfwbg(khwt,khmc,fwrxm,fwlx,fwdd,fwjd,fwjb,datemin,datemax,wtzt,usercontroller.username1,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

        if(s.isEmpty()){
            model.addAttribute("fwbgmsg","0");
            return "tj/tjfwbg";
        }else {
            model.addAttribute("fwbgmsg","1");
            return "tj/tjfwbg";
        }
    }

    @ResponseBody
    @RequestMapping("/deletebg")
    public JSONObject deletebg(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String aa = request.getParameter("aa");

        String s = fwbGservice.deltefwbg(aa);
        jsonObject.put("msg","成功!");
        if(s.isEmpty()){
            return jsonObject;
        }else {
            return jsonObject;
        }
    }
}
