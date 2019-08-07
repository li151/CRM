package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.model.customer;
import com.web.service.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/cus")
@SessionAttributes("customer")
public class customerController {
    @Autowired
    customerservice customerservice;
    private String khaa="";

    /**
     * 用于添加客户
     * @param model
     * @param khmc
     * @param khlx
     * @param dh
     * @param cz
     * @param fzr
     * @param dq
     * @param hy
     * @param jyxm
     * @param lxr
     * @param qydz
     * @param yx
     * @param qyxz
     * @return
     */
    @RequestMapping("/insertcus")
    public String insertcustrom(Model model,String khmc, String khlx, String dh, String cz, String fzr, String dq, String hy, String jyxm, String lxr, String qydz, String yx, String qyxz){
        String khjb="";
        String sf="";
        String lxrdh="";
        String khxz="";
        String s = customerservice.insertcus(khmc,khlx,khjb,new Date(),qyxz,dh,cz,fzr,sf,dq,hy,jyxm,lxr,lxrdh,qydz,yx,qyxz);

        if(s.isEmpty()){
            model.addAttribute("khmsg","0");
            return "tj/tjkh";
        }else{
            model.addAttribute("khmsg","1");
            return "tj/tjkh";
        }
    }

    /**
     * 用于删除客户
     * @param req
     * @return
     */
    @ResponseBody
    @RequestMapping("/deletecus")
    public JSONObject ajaxdelete(HttpServletRequest req){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","删除失败");

        String pm = req.getParameter("aa");

        String s = customerservice.deletekh(pm);
        if(s.isEmpty()){
            return jsonObject;
        }else {
            jsonObject.put("cg","删除成功");
            return jsonObject;
        }
    }

    /**
     * 公海池的条件查询
     * @param httpSession
     * @param khmc
     * @param dq
     * @param fzr
     * @param hy
     * @param lxr
     * @param datemin
     * @param datemax
     * @return
     */
    @RequestMapping("/tjcx")
    public String tjcx(HttpSession httpSession,String khmc, String dq, String fzr, String hy, String lxr, String datemin, String datemax){
        String lx = "公海池";
        List<customer> customers = customerservice.tjcxkh(lx,khmc,dq,fzr,hy,lxr,datemin,datemax);
        httpSession.setAttribute("custs1",customers);
        return "ghc";
    }

    /**
     * 重要客户的查询条件
     * @param httpSession
     * @param khmc
     * @param dq
     * @param fzr
     * @param hy
     * @param lxr
     * @param datemin
     * @param datemax
     * @return
     */
    @RequestMapping("/tjcx1")
    public String tjcx1(HttpSession httpSession,String khmc, String dq, String fzr, String hy, String lxr, String datemin, String datemax){
        String lx = "重要客户";
        List<customer> customers = customerservice.tjcxkh(lx,khmc,dq,fzr,hy,lxr,datemin,datemax);
        httpSession.setAttribute("custs2",customers);
        return "zykh";
    }

    /**
     * 核心客户的查询条件
     * @param httpSession
     * @param khmc
     * @param dq
     * @param fzr
     * @param hy
     * @param lxr
     * @param datemin
     * @param datemax
     * @return
     */
    @RequestMapping("/tjcx2")
    public String tjcx2(HttpSession httpSession,String khmc, String dq, String fzr, String hy, String lxr, String datemin, String datemax){
        String lx = "核心客户";
        List<customer> customers = customerservice.tjcxkh(lx,khmc,dq,fzr,hy,lxr,datemin,datemax);
        httpSession.setAttribute("custs3",customers);
        return "hxkh";
    }

    /**
     * 普通客户的查询条件
     * @param httpSession
     * @param khmc
     * @param dq
     * @param fzr
     * @param hy
     * @param lxr
     * @param datemin
     * @param datemax
     * @return
     */
    @RequestMapping("/tjcx3")
    public String tjcx3(HttpSession httpSession,String khmc, String dq, String fzr, String hy, String lxr, String datemin, String datemax){
        String lx = "普通客户";
        List<customer> customers = customerservice.tjcxkh(lx,khmc,dq,fzr,hy,lxr,datemin,datemax);
        httpSession.setAttribute("custs4",customers);
        return "ptkh";
    }

    /**
     * 客户信息的查询条件
     * @param httpSession
     * @param khmc
     * @param dq
     * @param fzr
     * @param hy
     * @param lxr
     * @param datemin
     * @param datemax
     * @return
     */
    @RequestMapping("/tjcx4")
    public String tjcx4(HttpSession httpSession,String khmc, String dq, String fzr, String hy, String lxr, String datemin, String datemax){
        String lx = "";
        List<customer> customers = customerservice.tjcxkh(lx,khmc,dq,fzr,hy,lxr,datemin,datemax);
        httpSession.setAttribute("custromer",customers);
        return "khxx";
    }


    /**
     * 查看客户信息ajax交互传客户名称
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/ajaxkh")
    public JSONObject ajaxkh(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        khaa = request.getParameter("aa");
        jsonObject.put("msg","成功");

        return jsonObject;
    }

    @RequestMapping("/selectkhcx")
    public String selectkhcx(Model model){
        customer customerr = customerservice.selectkhxx(khaa);

        model.addAttribute("customer",customerr);
        return "ck/ckkhxx";
    }
}
