package com.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.web.service.notbookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/notbook")
@SessionAttributes("notbook")
public class notbookController {
    @Autowired
    notbookservice notbookservices;
    @Autowired
    Usercontroller usercontroller;

    /**
     * 用于插入个人记事本
     * @param jsbt
     * @param jsnr
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/insertbk")
    public String insernb(String jsbt, String jsnr, Model model) throws Exception {
        String s = notbookservices.insertnk(jsbt,usercontroller.username1,jsnr,new Date());
        if(s.isEmpty()){
            model.addAttribute("bkmsg","0");
            return "tj/tjwdjs";
        }else {
            model.addAttribute("bkmsg","1");
            return "tj/tjwdjs";
        }

    }

    /**
     * 用于删除记事本
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/deletejsb")
    public JSONObject deletejsb(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String jsbt = request.getParameter("aa");

        String s = notbookservices.deletegrjs(jsbt,usercontroller.username1);
        if(s.isEmpty()){
            jsonObject.put("Rmsg","删除失败!");
            return jsonObject;
        }else {
            jsonObject.put("msg","删除成功!");
            return jsonObject;
        }
    }
}
