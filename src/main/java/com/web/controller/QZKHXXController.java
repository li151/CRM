package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.service.QZKHFXservice;
import com.web.service.QZKHXXservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.print.DocFlavor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 潜在客户信息控制
 */
@Controller
@RequestMapping("/qzkhxx")
@SessionAttributes("QZKHXX")
public class QZKHXXController {
    @Autowired
    QZKHXXservice qzkhxXservice;

    /**
     * 添加客户
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
     * @throws Exception
     */
    @RequestMapping("/insertqzkh")
    public String qzkh(Model model,String khmc, String khlx, String dh, String cz, String fzr, String dq, String hy, String jyxm, String lxr, String qydz, String yx, String qyxz) throws Exception {
        String s = qzkhxXservice.insertqzkhxx(khmc,khlx,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),dh,cz,fzr,dq,hy,jyxm,lxr,qydz,yx,qyxz);
        if(s.isEmpty()){
            model.addAttribute("qzmsg","0");
            return "tj/tjqzkh";
        }else {
            model.addAttribute("qzmsg","1");
            return "tj/tjqzkh";
        }
    }

    /**
     * 删除客户
     * @param request
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/delkh")
    public JSONObject delkhxx(HttpServletRequest request) throws Exception {
        JSONObject jsonObject = new JSONObject();

        String khmc = request.getParameter("aa");
        String s = qzkhxXservice.deleteqzkh(khmc);
        if(s.isEmpty()){
            jsonObject.put("imsg","删除失败!");
            return jsonObject;
        }else {
            jsonObject.put("imsg","删除成功!");
            return jsonObject;
        }
    }
}
