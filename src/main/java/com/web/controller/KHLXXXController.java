package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.service.KHLXXXservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/khlxxx")
@SessionAttributes("KHLXXX")
public class KHLXXXController {
    @Autowired
    KHLXXXservice khlxxXservice;

    /**
     * 添加客户联系信息
     * @param model
     * @param khxm
     * @param khxb
     * @param jg
     * @param szgsbm
     * @param drzw
     * @param yddh
     * @param bgdh
     * @param email
     * @param cggzd
     * @param xg
     * @param yxl
     * @param zt
     * @return
     */
    @RequestMapping("/insertkhlxxx")
    public String insertlxxx(Model model,String khxm, String khxb, String jg, String szgsbm, String drzw, String yddh, String bgdh, String email, String cggzd, String xg, String yxl, String zt){
        String s = khlxxXservice.insertlxxx(khxm,khxb,jg,szgsbm,drzw,yddh,bgdh,email,cggzd,xg,yxl,zt);
        if(s.isEmpty()){
            model.addAttribute("lxmsg","0");
            return "tj/tjlxxx";
        }else{
            model.addAttribute("lxmsg","1");
            return "tj/tjlxxx";
        }
    }

    /**
     * 删除联系人信息
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/deletelxr")
    public JSONObject deletelxr(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String aa = request.getParameter("aa");

        String s = khlxxXservice.deletelxx(aa);
        jsonObject.put("msg","成功!");
        if(s.isEmpty()){
            return jsonObject;
        }else {
            return jsonObject;
        }
    }
}
