package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.model.Affiche;
import com.web.service.Afficheservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/Aff")
@SessionAttributes("Affiche")
public class AfficheController {
    @Autowired
    Afficheservice afficheservice;
    @Autowired
    Usercontroller usercontroller;

    /**
     * 这个用于查询公告类型
     * @return
     */
   @RequestMapping("/selaff")
   public @ResponseBody Affiche selaff() {
       Affiche affiche = null;
       affiche.setTitle("你说吧");
       affiche.setAfficheuser("snjdsnknjnknksnk ");

       return affiche;
    }

    /**
     * 用于添加公告
     * @param title
     * @param context
     * @param gglx
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/insertaff")
    public String SelectAff(String title, String context, String gglx, Model model) throws Exception {
       afficheservice.addgg(title,context,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),gglx,usercontroller.username1);
       model.addAttribute("affmsg","1");
       return "tj/tjgg";
    }


    /**
     * 用于删除公告
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/dlgg")
    public JSONObject delgg(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String rcmc = request.getParameter("aa");

        String s = afficheservice.dlgg(rcmc);
        if(s.isEmpty()){
            jsonObject.put("affmsg","删除用户失败,请重试!");

            return jsonObject;
        }else {
            jsonObject.put("affmsg","删除成功!");

            return jsonObject;
        }

    }
}
