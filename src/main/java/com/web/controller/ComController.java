package com.web.controller;

import com.web.model.*;
import com.web.service.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Com")
public class ComController {
    @Autowired
    Userservice userservice;
    @Autowired
    Afficheservice afficheservice;
    @Autowired
    notbookservice notbookservices;
    @Autowired
    Usercontroller usercontroller;
    @Autowired
    RCGLservice rcgLservice;
    @Autowired
    customerservice customerservices;
    @Autowired
    FWBGservice fwbGservice;
    @Autowired
    CJWTKservice cjwtKservice;
    @Autowired
    FXFWFSservice fxfwfSservice;
    @Autowired
    YXHDservice yxhDservice;
    @Autowired
    SCFXservice scfXservice;
    @Autowired
    KHJRJLservice khjrjLservice;
    @Autowired
    KHLXXXservice khlxxXservice;
    @Autowired
    QZKHXXservice qzkhxXservice;
    /**
     * 跳转到公海池的界面
     * @return
     */
    @RequestMapping("/ghc")
    public String ghc(HttpSession httpSession){
        String cx = "公海池";
        List<customer> customers = customerservices.selecttjcx(cx);
        httpSession.setAttribute("custs1",customers);
        return "ghc";
    }

    /**
     * 跳转到重要客户界面
     * @return
     */
    @RequestMapping("/zykh")
    public String zykh(HttpSession httpSession){
        String cx = "重要客户";
        List<customer> customers = customerservices.selecttjcx(cx);
        httpSession.setAttribute("custs2",customers);
        return "zykh";
    }

    /**
     * 跳转到核心客户界面
     * @return
     */
    @RequestMapping("/hxkh")
    public String hxkh(HttpSession httpSession){
        String cx = "核心客户";
        List<customer> customers = customerservices.selecttjcx(cx);
        httpSession.setAttribute("custs3",customers);
        return "hxkh";
    }

    /**
     * 跳转到普通用户
     * @return
     */
    @RequestMapping("/ptkh")
    public String ptyh(HttpSession httpSession){
        String cx = "普通客户";
        List<customer> customers = customerservices.selecttjcx(cx);
        httpSession.setAttribute("custs4",customers);
        return "ptkh";
    }

    /**
     * 跳转到客户信息界面
     * @return
     */
    @RequestMapping("/khxx")
    public String khxx(HttpSession httpSession) throws Exception {
        List<customer> customers = customerservices.selectcus();
        httpSession.setAttribute("custromer",customers);
        return "khxx";
    }

    /**
     * 跳转到用户信息
     * @return
     */
    @RequestMapping("/yhxx")
    public String yhxx(HttpSession session)throws Exception{
       List<User> users = userservice.Userall();
       session.setAttribute("user",users);
        return "yhxx";
    }

    /**
     * 添加用户的界面
     * @return
     */
    @RequestMapping("/useradd")
    public String useradd(){
        return "useradd";
    }

    /**
     * 主页
     * @return
     */
    @RequestMapping("/welcome")
    public String welcome(Model model){
        String lx1 = "普通公告";
        String lx2 = "紧急通知";
        Affiche affiche = afficheservice.selgglx(lx1);
        model.addAttribute("ptgg",affiche);
//        session.setAttribute("ptgg",affiche);
        Affiche affiche1 = afficheservice.selgglx(lx2);
        model.addAttribute("jjtz",affiche1);
//        session.setAttribute("jjtz",affiche1);
        return "welcome";
    }

    /**
     * 跳转到用户修改密码
     * @return
     */
    @RequestMapping("/editpwd")
    public String editpwd(){
        return "editpwd";
    }

    /**
     * 跳转到个人记事本
     * @return
     */
    @RequestMapping("/grjsb")
    public String grjsb(HttpSession httpSession) throws Exception {
        List<notbook> notbooks = notbookservices.selectnk(usercontroller.username1);
        httpSession.setAttribute("notbook",notbooks);
        return "grjsb";
    }

    /**
     * 跳转到联系人信息管理
     * @return
     */
    @RequestMapping("/lxrgl")
    public String lxrgl(HttpSession httpSession) throws Exception {
        List<KHLXXX> khlxxxes = khlxxXservice.selectKHLXXX();
        httpSession.setAttribute("KHLXXX",khlxxxes);
        return "lxrgl";
    }

    /**
     * 跳转到日程管理界面
     * @return
     */
    @RequestMapping("/rcgl")
    public String rcgl(HttpSession httpSession) throws Exception {
        List<RCGL> rcgls = rcgLservice.selectrc(usercontroller.username1);
        httpSession.setAttribute("RCGL",rcgls);
        return "rcgl";
    }

    /**
     * 跳转到主页管理
     * @return
     */
    @RequestMapping("/zygl")
    public String zygl(HttpSession httpSession) throws Exception{
        List<Affiche> aff;
        System.out.println("啦啦啦");
        aff = afficheservice.selAff();
        httpSession.setAttribute("Affiche",aff);
        return "zygl";
    }

    /**
     * 跳转到用户权限管理
     * @return
     */
    @RequestMapping("/yhqxgl")
    public String yhqxgl(){
        return "yhqxgl";
    }

    /**
     * 跳转到服务报告
     * @return
     */
    @RequestMapping("/fwbg")
    public String fwbg(HttpSession httpSession) throws Exception {
        List<FWBG> fwbgs = fwbGservice.selectfw();
        httpSession.setAttribute("FWBG",fwbgs);
        return "fwbg";
    }

    /**
     * 跳转到常见问题库
     * @return
     */
    @RequestMapping("/cjwtk")
    public String cjwtk(HttpSession httpSession) throws Exception {
        List<CJWTK> cjwtks = cjwtKservice.selectcjwt();
        httpSession.setAttribute("CJWTK",cjwtks);
        return "cjwtk";
    }

    /**
     * 跳到服务方式分享
     * @return
     */
    @RequestMapping("/fwfsfx")
    public String fwfsfx(HttpSession httpSession) throws Exception {
        List<FXFWFS> fxfwfs = fxfwfSservice.selectfxfw();
        httpSession.setAttribute("FXFWFS",fxfwfs);
        return "fwfsfx";
    }

    /**
     * 跳转到报价管理
     * @return
     */
    @RequestMapping("/bjgl")
    public String bjgl(){
        return "bjgl";
    }

    /**
     * 跳转到营销活动管理
     * @return
     */
    @RequestMapping("/yxhdgl")
    public String yxhdgl(HttpSession httpSession) throws Exception {
        List<YXHD> yxhds = yxhDservice.selectyxhd();
        httpSession.setAttribute("YXHD",yxhds);
        return "yxhdgl";
    }

    /**
     * 跳转到市场分析
     * @return
     */
    @RequestMapping("/scfx")
    public String scfx(HttpSession httpSession) throws Exception {
        List<SCFX> scfxes = scfXservice.selectsc();
        httpSession.setAttribute("SCFX",scfxes);
        return "scfx";
    }

    /**
     * 跳转到客户节日记录
     * @return
     */
    @RequestMapping("/khjrjl")
    public String khjrjl(HttpSession httpSession) throws Exception {
        List<KHJRJL> khjrjls = khjrjLservice.selectKH();
        httpSession.setAttribute("KHJRJL",khjrjls);
        return "khjrjl";
    }

    /**
     * 跳转到潜在客户信息
     * @return
     */
    @RequestMapping("/qzkhxx")
    public String qzkhxx(HttpSession httpSession) throws Exception {
        List<QZKHXX> qzkhxxes = qzkhxXservice.selectqzkhxx();
        httpSession.setAttribute("qzkhxx",qzkhxxes);
        return "qzkhxx";
    }

    /**
     * 跳转到潜在客户分析
     * @return
     */
    @RequestMapping("/qzkhfx")
    public String qzkhfx(){
        return "qzkhfx";
    }

    /**
     * 添加常见问题
     * @return
     */
    @RequestMapping("/tjcjwt")
    public String tjcjwt(){
        return "tj/tjcjwt";
    }

    /**
     * 添加服务报告
     * @return
     */
    @RequestMapping("/tjfwbg")
    public String tjfwbg(){
        return "tj/tjfwbg";
    }

    /**
     * 添加服务方式分享
     * @return
     */
    @RequestMapping("/tjfxfwfs")
    public String tjfxfwfs(){
        return "tj/tjfxfwfs";
    }

    /**
     * 添加公告
     * @return
     */
    @RequestMapping("/tjgg")
    public String tjgg(){
        return "tj/tjgg";
    }

    /**
     * 添加客户
     * @return
     */
    @RequestMapping("/tjkh")
    public String tjkh(){
        return "tj/tjkh";
    }

    /**
     * 添加客户节日记录
      * @return
     */
    @RequestMapping("/tjkhjrjl")
    public String tjkhjrjl(){
        return "tj/tjkhjrjl";
    }

    /**
     * 添加联系信息
     * @return
     */
    @RequestMapping("/tjlxxx")
    public String tjlxxx(){
        return "tj/tjlxxx";
    }

    /**
     * 添加潜在客户
     * @return
     */
    @RequestMapping("/tjqzkh")
    public String tjqzkh(){
        return "tj/tjqzkh";
    }

    /**
     * 添加日程
     * @return
     */
    @RequestMapping("/tjrc")
    public String tjrc(){
        return "tj/tjrc";
    }

    /**
     * 添加市场分析
     * @return
     */
    @RequestMapping("/tjscfx")
    public String tjscfx(){
        return "tj/tjscfx";
    }

    /**
     * 添加商品信息
     * @return
     */
    @RequestMapping("/tjspxx")
    public String tjspxx(){
        return "tj/tjspxx";
    }

    /**
     * 添加我的记事
     * @return
     */
    @RequestMapping("/tjwdjs")
    public String tjwdjs(){
        return "tj/tjwdjs";
    }

    /**
     * 添加营销活动
     * @return
     */
    @RequestMapping("/tjyxhd")
    public String tjyxhd(){
        return "tj/tjyxhd";
    }
}
