package com.web.controller;

import com.web.gj.ViewExcel;

import com.web.service.ExpExcl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("Ex")
public class Exprot {
    @Autowired
    ExpExcl assetInLibraryService;
    //公海池
    @RequestMapping("/excle")
    public ModelAndView Exprot1(ModelMap map) throws Exception {
        List<Map<String,String>> list = assetInLibraryService.selectAllAssetInlibraryInfo("公海池");
        String[] titles={"客户名称","客户类型","添加日期","电话","传真","负责人","地区","行业","经营项目","联系人","企业地址","邮箱","邮箱"};
        ViewExcel excel=new ViewExcel(titles);
        map.put("excelList", list);
        return new ModelAndView(excel,map);
    }
//重要客户
    @RequestMapping("/zykh")
    public ModelAndView Zykh(ModelMap map) throws Exception {
        List<Map<String,String>> list = assetInLibraryService.selectAllAssetInlibraryInfo("重要客户");
        String[] titles={"客户名称","客户类型","添加日期","电话","传真","负责人","地区","行业","经营项目","联系人","企业地址","邮箱","邮箱"};
        ViewExcel excel=new ViewExcel(titles);
        map.put("excelList", list);
        return new ModelAndView(excel,map);

    }
//核心客户
    @RequestMapping("/hxkh")
    public ModelAndView hxkh(ModelMap map) throws Exception {
        List<Map<String,String>> list = assetInLibraryService.selectAllAssetInlibraryInfo("核心客户");
        String[] titles={"客户名称","客户类型","添加日期","电话","传真","负责人","地区","行业","经营项目","联系人","企业地址","邮箱","邮箱"};
        ViewExcel excel=new ViewExcel(titles);
        map.put("excelList", list);
        return new ModelAndView(excel,map);

    }
//普通客户
    @RequestMapping("/ptkh")
    public ModelAndView ptkh(ModelMap map) throws Exception {
        List<Map<String,String>> list = assetInLibraryService.selectAllAssetInlibraryInfo("普通客户");
        String[] titles={"客户名称","客户类型","添加日期","电话","传真","负责人","地区","行业","经营项目","联系人","企业地址","邮箱","邮箱"};
        ViewExcel excel=new ViewExcel(titles);
        map.put("excelList", list);
        return new ModelAndView(excel,map);

    }
//客户信息
    @RequestMapping("/khxx")
    public ModelAndView khxx(ModelMap map) throws Exception {
        List<Map<String,String>> list = assetInLibraryService.selectAllkhxx();
        String[] titles={"客户名称","客户类型","添加日期","电话","传真","负责人","地区","行业","经营项目","联系人","企业地址","邮箱","邮箱"};
        ViewExcel excel=new ViewExcel(titles);
        map.put("excelList", list);
        return new ModelAndView(excel,map);

    }


}
