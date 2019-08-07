package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.model.QZKHFX;
import com.web.service.QZKHFXservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.util.JAXBSource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 潜在客户分析
 */
@Controller
@RequestMapping("/qzkhfx")
@SessionAttributes("QZKHFX")
public class QZKHFXController {
    @Autowired
    private QZKHFXservice qzkhfXservice;
    private String khmc;
    private List<QZKHFX> qzkhfxes;
    @Autowired
    private Usercontroller usercontroller;

    @ResponseBody
    @RequestMapping("/ck")
    public JSONObject ckxx(HttpServletResponse response,HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String name = "JSESSIONID";
        Cookie[] cookies = request.getCookies();
        linkController.cookies(response, name, cookies);
        khmc = request.getParameter("aa");

        System.out.println(khmc);
        jsonObject.put("msg","成功!");

        return jsonObject;
    }

    @RequestMapping("/ckxi")
    public String ckxx(Model model,HttpSession httpSession){
//        model.addAttribute("qzkhfx",qzkhfxes);
        qzkhfxes = qzkhfXservice.selectqzkhfx(khmc);
        httpSession.setAttribute("qzkhfx",qzkhfxes);

        model.addAttribute("khmc",khmc);
        return "ck/ckkhfxjl";
    }

    @RequestMapping("/insertqzkh")
    public String insert(Model model){
        model.addAttribute("khfxmsg",khmc);
        return "tj/tjqzkhfxjl";
    }
    @RequestMapping("/tjqzjljl")
    public  String tjkhjlll(Model model,String khxm,String context){
        String s = qzkhfXservice.insertqzkhfx(khmc,context,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),usercontroller.username1);
        if(s.isEmpty()){
            model.addAttribute("jlmsg","0");
            model.addAttribute("khfxmsg",khmc);
            return "tj/tjqzkhfxjl";
        }else {
            model.addAttribute("jlmsg","1");
            model.addAttribute("khfxmsg",khmc);
            return "tj/tjqzkhfxjl";
        }
    }


}
