package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.model.YXHD;
import com.web.service.YXHDservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/yxhd")
@SessionAttributes("YXHD")
public class YXHDController {
    @Autowired
    YXHDservice yxhDservice;

    /**
     * 添加营销活动
     * @param model
     * @param hdzt
     * @param jhsj
     * @param hdkzdd
     * @param txdcp
     * @param hdfyys
     * @param jhxse
     * @param jhphry
     * @param jhkzts
     * @param hdbz
     * @param hdfzr
     * @return
     */
    @RequestMapping("/insertyxhd")
    public String insertyxhd(Model model,String hdzt, String jhsj, String hdkzdd, String txdcp, String hdfyys, String jhxse, String jhphry, String jhkzts, String hdbz, String hdfzr){
        String s = yxhDservice.insertyxgl(hdzt,jhsj,hdkzdd,txdcp,hdfyys,jhxse,jhphry,jhkzts,hdbz,hdfzr);
        if(s.isEmpty()){
            model.addAttribute("yxhdmsg","0");
            return "tj/tjyxhd";
        }else {
            model.addAttribute("yxhdmsg","1");
            return "tj/tjyxhd";
        }
    }

    @ResponseBody
    @RequestMapping("/deleteyx")
    public JSONObject delete(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String aa = request.getParameter("aa");

        String s = yxhDservice.deleteyxhd(aa);
        jsonObject.put("msg","成功!");
        if(s.isEmpty()){
            return jsonObject;
        }else {
            return jsonObject;
        }
    }
}
