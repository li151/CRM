package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.service.RCGLservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/rcgl")
@SessionAttributes("RCGL")
public class RCGLController {
    @Autowired
    RCGLservice rcgLservice;
    @Autowired
    Usercontroller usercontroller;

    /**
     * 添加用户日程
     * @param model
     * @param rcmc
     * @param datemin
     * @param datemax
     * @param rcnr
     * @param sfqtgz
     * @param qwdd
     * @return
     * @throws Exception
     */
    @RequestMapping("/insertrc")
    public String inrcgl(Model model,String rcmc, String datemin, String datemax, String rcnr, String sfqtgz, String qwdd) throws Exception{
        String s = rcgLservice.tjrc(rcmc,datemin,datemax,rcnr,sfqtgz,qwdd,usercontroller.username1);
        if(s.isEmpty()){
            model.addAttribute("rcmsg","0");
            return "tj/tjrc";
        }else {
            model.addAttribute("rcmsg","1");
            return "tj/tjrc";
        }
    }

    /**
     * 删除日程
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/delrc")
    public JSONObject delterc(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String rcmc = request.getParameter("aa");

        String s = rcgLservice.rcsc(rcmc,usercontroller.username1);

        if(s.isEmpty()){
            jsonObject.put("rcmsg","删除失败!");
            return jsonObject;
        }else {
            jsonObject.put("msg","删除成功!");
            return jsonObject;
        }
    }
}
