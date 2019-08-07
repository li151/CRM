package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.model.SCFX;
import com.web.service.SCFXservice;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/scfx")
@SessionAttributes("SCFX")
public class SCFXController {
    @Autowired
    SCFXservice scfXservice;

    private static String upload="E:"+ File.separator;

    /**
     * 添加市场分析
     * @param model
     * @param fxzt
     * @param fxnr
     * @param fxr
     * @param fxsj
     * @param uploadfile
     * @return
     */
    @RequestMapping("/insertscfx")
    public String scfx(@RequestParam("uploadfile")MultipartFile multipartFile, Model model, String fxzt, String fxnr, String fxr, String fxsj, String uploadfile){
//        当文件补位空的时候上传
        if(multipartFile !=null && !multipartFile.isEmpty()){
                //获取文件名
            String filename = multipartFile.getOriginalFilename();
            System.out.println(filename);
            String newfilename = uploadfile+filename;
            //创建文件对象
            File fIle = new File(uploadfile+filename);

            //文件上传
            try {
                multipartFile.transferTo(fIle);
                String s = scfXservice.insertscfx(fxzt,fxnr,fxr,fxsj,newfilename);
                    return "tj/tjscfx";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            String s = scfXservice.insertscfx(fxzt,fxnr,fxr,fxsj,multipartFile.getOriginalFilename());
            if(s.isEmpty()){
                model.addAttribute("scmsg","0");
                return "tj/tjscfx";
            }else {
                model.addAttribute("scmsg","1");
                return "tj/tjscfx";
            }
        }
        return "tj/tjscfx";
    }

    /**
     * 删除市场分析
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/deletesc")
    public JSONObject delete(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();

        String aa = request.getParameter("aa");

        String s = scfXservice.deletescfx(aa);

        jsonObject.put("msg","成功!");
        if(s.isEmpty()){
            return jsonObject;
        }else {
            return jsonObject;
        }
    }
}
