package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.service.KHJRJLservice;
import com.web.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/khjr")
@SessionAttributes("KHJRJL")
public class KHJRJLController {
    @Autowired
    KHJRJLservice khjrjLservice;
    @Autowired
    Usercontroller usercontroller;

    /**
     * 添加客户节日记录
     * @param model
     * @param khxm
     * @param zpry
     * @param zysx
     * @param ghsj
     * @param ghjrms
     * @param jrlx
     * @return
     */
    @RequestMapping("/insertkhjr")
    public String insertkhjr(Model model,String khxm, String zpry, String zysx, String ghsj, String ghjrms, String jrlx){
        String s = khjrjLservice.insertkhjr(khxm,zpry,zysx,ghsj,ghjrms,jrlx,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),usercontroller.username1);

        if(s.isEmpty()){
            model.addAttribute("jrmsg","0");
            return "tj/tjkhjrjl";
        }else{
            model.addAttribute("jrmsg","1");
            return "tj/tjkhjrjl";
        }
    }

    /**
     *删除客户节日记录
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/deletejr")
    public JSONObject deletejr(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String aa = request.getParameter("aa");

        String s = khjrjLservice.deletekhjr(aa);
        jsonObject.put("msg","成功!");
        if(s.isEmpty()){
            return jsonObject;
        }else {
            return jsonObject;
        }
    }
}
