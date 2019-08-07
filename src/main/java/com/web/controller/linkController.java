package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.model.link;
import com.web.service.linkservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/link")
@SessionAttributes("link")
public class linkController {
    @Autowired
    private linkservice linkservices;
    @Autowired
    private Usercontroller usercontroller;
    private String khmc="";
    private List<link> links;

    /**
     * 查询客户交流记录
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/selnk")
    public JSONObject selink( HttpServletResponse response,HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String name = "JSESSIONID";
        Cookie[] cookies = request.getCookies();
        cookies(response, name, cookies);

        khmc = request.getParameter("aa");
        links = linkservices.seletlink(khmc);
        jsonObject.put("khmc",khmc);

        return jsonObject;
    }

    static void cookies(HttpServletResponse response, String name, Cookie[] cookies) {
        if (null==cookies) {
            System.out.println("没有cookie==============");
        } else {
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(name)){
                    cookie.setValue(null);
                    cookie.setMaxAge(0);// 立即销毁cookie
                    cookie.setPath("/");
                    System.out.println("被删除的cookie名字为:"+cookie.getName());
                    response.addCookie(cookie);
                    break;
                }
            }
        }
    }

    /**
     * 显示查询的客户交流记录
     * @param request
     * @param response
     * @param httpSession
     * @param model
     * @return
     */
    @RequestMapping("/sellink")
    public String sellink(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession, Model model){

        //向前端发送客户名称
        model.addAttribute("khmc",khmc);
        httpSession.setAttribute("link",links);
        return "ck/ckjljl";
    }

    @RequestMapping("/insertlink")
    public String insertlink(Model model){
        model.addAttribute("khmcmsg",khmc);

        return "tj/tjjljl";
    }

    /**
     * 用于添加客户交流记录
     * @param model
     * @param khxm
     * @param context
     * @return
     */
    @RequestMapping("/isrtlink")
    public String  insertlin(HttpServletRequest session,Model model, String khxm, String context){
        String kh = (String) session.getAttribute("username2");
        System.out.println("用户名是"+kh);
        System.out.println("原始用户名是"+usercontroller.username1);
            String s = linkservices.insertlink(khmc,context,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),usercontroller.username1);
            if(s.isEmpty()){
                model.addAttribute("jlmsg","0");
                model.addAttribute("khmcmsg",khmc);
                return "tj/tjjljl";
            }else {
                model.addAttribute("jlmsg","1");
                model.addAttribute("khmcmsg",khmc);
                return "tj/tjjljl";
            }
    }
}
