package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.model.QXGL;
import com.web.service.QXGLservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;

/**
 * 权限管理
 */
@Controller
@RequestMapping("/qxgl")
@SessionAttributes("QXGL")
public class QXGLController {
    @Autowired
    QXGLservice qxgLservice;
    private String yhm;
    @ResponseBody
    @RequestMapping("/yhqx")
    public JSONObject qxgl(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

         yhm = request.getParameter("aa");

        jsonObject.put("msg","传送成功");
        return jsonObject;
    }

    @RequestMapping("/ckqxgl")
    public String qxgl(Model model){
        QXGL qxgl = qxgLservice.selectqx(yhm);

        model.addAttribute("qxgl",qxgl);
        return "ck/ckqxgl";
    }

    @RequestMapping("/xgyhqx")
    public String xg(Model model){
        model.addAttribute("qx",yhm);
        return "tj/tjqxgl";
    }

    @RequestMapping("/gxyhqx")
    public String gengxin(Model model,String zygl,String tjgg,String scgg,String yhlx,String tjyh,
                          String scyh,String yhqx,String ghc,String tjkh,String sckh,
                          String dcsj,String zykh,String hxkh,String ptkh,String khxx,
                          String qzkhgl,String scqzkh,String fwbg,String scfwbg,
                          String cjwtk,String sccjwt,String fxfwfs,String scfxfwfs,
                          String yxhd,String scyxhd,String scfx,String scscfx,String khjrgl,
                          String sckhjrgl,String khlxfs,String sckhlxfs){

        qxgLservice.updateqx( zygl, tjgg, scgg, yhlx, tjyh,
                 scyh, yhqx, ghc, tjkh, sckh,
                 dcsj, zykh, hxkh, ptkh, khxx,
                 qzkhgl, scqzkh, fwbg, scfwbg,
                 cjwtk, sccjwt, fxfwfs, scfxfwfs,
                 yxhd, scyxhd, scfx, scscfx, khjrgl,
                 sckhjrgl, khlxfs, sckhlxfs,yhm);

        model.addAttribute("tjmsg","1");
        return "tj/tjqxgl";

    }
}
