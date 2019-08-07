package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.model.QXGL;
import com.web.model.User;
import com.web.service.QXGLservice;
import com.web.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;


@Controller
@RequestMapping("/User")
@SessionAttributes("User")
public class Usercontroller {
    @Resource
    @Autowired
    private Userservice userservice;
    public String username1;
    @Autowired
    private QXGLservice qxgLservice;


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/checkLogin")
    public String checklogin(User user, Model model, HttpSession session, RedirectAttributes redirectAttributes) throws Exception {
        if(user.getUsername()!=null && user.getPassword()!=null){
            user = userservice.checkLogin(user.getUsername(),user.getPassword());
            if(user!=null){
                model.addAttribute("name",user.getName());
                session.setAttribute("role",user.getRole());
                username1 = user.getUsername();
                QXGL qxgl = qxgLservice.selectqx(username1);
                session.setAttribute("username2",username1);
                redirectAttributes.addFlashAttribute("qxgl",qxgl);
                model.addAttribute("qx",qxgl);
                redirectAttributes.addFlashAttribute("zygl",qxgl.getZygl());
                redirectAttributes.addFlashAttribute("tjgg",qxgl.getTjgg());
                redirectAttributes.addFlashAttribute("scgg",qxgl.getScgg());
                redirectAttributes.addFlashAttribute("yhxx",qxgl.getYhxx());
                redirectAttributes.addFlashAttribute("tjyh",qxgl.getTjyh());
                redirectAttributes.addFlashAttribute("scyh",qxgl.getScyh());
                redirectAttributes.addFlashAttribute("yhqx",qxgl.getYhqx());
                redirectAttributes.addFlashAttribute("ghc",qxgl.getGhc());
                redirectAttributes.addFlashAttribute("tjkh",qxgl.getTjkh());
                redirectAttributes.addFlashAttribute("sckh",qxgl.getSckh());
                redirectAttributes.addFlashAttribute("dcsj",qxgl.getDcsj());
                redirectAttributes.addFlashAttribute("zykh",qxgl.getZykh());
                redirectAttributes.addFlashAttribute("hxkh",qxgl.getHxkh());
                redirectAttributes.addFlashAttribute("ptkh",qxgl.getPtkh());
                redirectAttributes.addFlashAttribute("khxx",qxgl.getKhxx());
                redirectAttributes.addFlashAttribute("qzkhgl",qxgl.getQzkhgl());
                redirectAttributes.addFlashAttribute("scqzkh",qxgl.getScqzkh());
                redirectAttributes.addFlashAttribute("fwbg",qxgl.getFwbg());
                redirectAttributes.addFlashAttribute("scfwbg",qxgl.getScfwbg());
                redirectAttributes.addFlashAttribute("cjwtk",qxgl.getCjwtk());
                redirectAttributes.addFlashAttribute("sccjwtk",qxgl.getSccjwtk());
                redirectAttributes.addFlashAttribute("fxfwfs",qxgl.getFxfwfs());
                redirectAttributes.addFlashAttribute("scfxfwfs",qxgl.getScfxfwfs());
                redirectAttributes.addFlashAttribute("yxhd",qxgl.getYxhd());
                redirectAttributes.addFlashAttribute("scyxhd",qxgl.getScyxhd());
                redirectAttributes.addFlashAttribute("scfx",qxgl.getScfx());
                redirectAttributes.addFlashAttribute("scscfx",qxgl.getScscfx());
                redirectAttributes.addFlashAttribute("khjrjl",qxgl.getKhjrjl());
                redirectAttributes.addFlashAttribute("sckhjrjl",qxgl.getSckhjrjl());
                redirectAttributes.addFlashAttribute("khlxxx",qxgl.getKhlxxx());
                redirectAttributes.addFlashAttribute("sckhlxxx",qxgl.getSckhlxxx());
                return "main";
            }else {
                //返回标志位
                redirectAttributes.addFlashAttribute("flag1","1");
                redirectAttributes.addFlashAttribute("msg","用户名或密码错误,请重新登陆!");
                //下面的model在重定向之后会失效
//                model.addAttribute("flag1","1");
//                model.addAttribute("msg","用户名或密码错误,请重新登陆!");
                return "redirect:login";
            }
        }else{
            return "redirect:login";
        }
    }
    @RequestMapping("/Useradd")
    public String Useradd(User user,HttpSession session) throws Exception {
        String zygl="否";   //主页管理
        String tjgg="否";   //添加公告
        String scgg="否";    //删除公告
        String yhxx="否";    //用户信息
        String tjyh ="否";    //添加用户
        String scyh ="否";    //删除用户
        String yhqx ="否";    //用户权限管理
        String ghc ="是";     //公海池
        String tjkh ="是";    //添加客户
        String sckh ="否";    //删除客户
        String dcsj ="否";    //导出数据
        String zykh ="否";    //重要客户
        String hxkh ="否";    //核心客户
        String ptkh ="否";    //普通客户
        String khxx ="否";  //客户信息
        String qzkhgl ="是";  //潜在客户管理
        String scqzkh ="否";  //删除潜在客户
        String fwbg ="是";    //服务报告
        String scfwbg ="否";  //删除服务报告
        String cjwtk ="是";   //常见问题库
        String sccjwtk ="否";  //删除常见问题库
        String fxfwfs ="是";   //分享服务方式
        String scfxfwfs ="否";    //删除分享服务方式
        String yxhd ="是";    //营销活动
        String scyxhd ="否";   //删除营销活动
        String scfx ="是";    //市场分析
        String scscfx ="否";   //删除市场分析
        String khjrjl ="是";   //客户节日管理
        String sckhjrjl ="否";  //删除客户节日记录
        String khlxxx ="是";    //客户联系方式
        String sckhlxxx ="否";   //删除客户联系信息
        userservice.inuser(user.getUsername(),user.getPassword(),user.getName(),user.getSex(),user.getRole(),new Date());
        qxgLservice.insertqx(user.getUsername(),zygl ,tjgg ,scgg ,yhxx, tjyh,scyh,yhqx ,ghc,tjkh ,sckh ,dcsj ,zykh ,hxkh ,ptkh ,khxx ,qzkhgl ,scqzkh ,fwbg ,scfwbg ,cjwtk,sccjwtk ,fxfwfs ,scfxfwfs ,yxhd ,scyxhd ,scfx ,scscfx ,khjrjl ,sckhjrjl ,khlxxx ,sckhlxxx);

        session.setAttribute("imsg","1");
       return "useradd";
    }
    @RequestMapping("/editpwd")
    public String Editpwd(User user, String oldpassword, String newpassword, Model model) {
        user.setUsername(username1);
        user.setPassword(oldpassword);
        try {
                User user1 = userservice.selpwd(user.getUsername(), user.getPassword());
                if (user1 != null) {
                    userservice.updpwd(user.getUsername(), newpassword);
                    model.addAttribute("pwdflag", "1");
                    model.addAttribute("pwdmsg", "修改密码成功！");
                    return "editpwd";
                } else {
                    model.addAttribute("pwdflag", "1");
                    model.addAttribute("pwdmsg", "您输入的旧密码不对，请确认后重新输入！");
                    return "editpwd";
                }
            } catch (Exception e) {
                e.printStackTrace();
                return oldpassword;
            }
    }

    /**
     * 删除用户
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/del")
    public JSONObject delyhxx(HttpServletRequest request) throws Exception {
        JSONObject jsonObject = new JSONObject();

        String yhm = request.getParameter("aa");
        userservice.delyhxx(yhm);
        qxgLservice.delqxgl(yhm);
        jsonObject.put("msg","删除成功!");

        return jsonObject;
    }

}
