package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.service.CJWTKservice;
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
@RequestMapping("/cjwtk")
@SessionAttributes("CJWTK")
public class CJWTKController {
    @Autowired
    CJWTKservice cjwtKservice;
    @Autowired
    Usercontroller usercontroller;

    /**
     * 添加常见问题库
     * @param model
     * @param wtms
     * @param jjff
     * @param jjr
     * @param datemin
     * @param datemax
     * @return
     */
    @RequestMapping("/insertcjwt")
    public String cjwtk(Model model,String wtms, String jjff, String jjr, String datemin, String datemax){
        String s = cjwtKservice.insertcjwt(wtms,jjff,jjr,datemin,datemax,usercontroller.username1,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

        if(s.isEmpty()){
            model.addAttribute("wtmsg","0");
            return "tj/tjcjwt";
        }else{
            model.addAttribute("wtmsg","1");
            return "tj/tjcjwt";
        }
    }

    @ResponseBody
    @RequestMapping("/deletecjwt")
    public JSONObject deletecjwt(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String aa = request.getParameter("aa");
        String s = cjwtKservice.deletecjwt(aa);
        jsonObject.put("msg","成功!");
        if(s.isEmpty()){
            return jsonObject;
        }else {
            return jsonObject;
        }
    }
}
