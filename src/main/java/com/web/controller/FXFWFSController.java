package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.service.FXFWFSservice;
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
@RequestMapping("/fxfwfs")
@SessionAttributes("FXFWFS")
public class FXFWFSController {
    @Autowired
    FXFWFSservice fxfwfSservice;
    @Autowired
    Usercontroller usercontroller;

    /**
     * 添加分享服务方式
     * @param model
     * @param fwfsmc
     * @param fwdx
     * @param fwnr
     * @param khfwfs
     * @return
     */
    @RequestMapping("/insertfwfs")
    public String insertfwfs(Model model,String fwfsmc, String fwdx, String fwnr, String khfwfs){
        String s = fxfwfSservice.insertfx(fwfsmc,fwdx,fwnr,khfwfs,usercontroller.username1,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

        if(s.isEmpty()){
            model.addAttribute("fxmsg","0");
            return "tj/tjfxfwfs";
        }else{
            model.addAttribute("fxmsg","1");
            return "tj/tjfxfwfs";
        }
    }

    @ResponseBody
    @RequestMapping("/deletefx")
    public JSONObject deletefx(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String aa = request.getParameter("aa");

        String s = fxfwfSservice.deletefx(aa);

        jsonObject.put("msg","成功!");
        if(s.isEmpty()){
            return jsonObject;
        }else {
            return jsonObject;
        }
    }
}
