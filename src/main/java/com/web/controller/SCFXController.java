package com.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.web.model.SCFX;
import com.web.service.SCFXservice;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

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
     * @param fxfj
     * @return
     */
    @RequestMapping("/insertscfx")
    public String scfx(HttpServletRequest request, Model model, String fxzt, String fxnr, String fxr, String fxsj, MultipartFile fxfj){

        //配置上传文件的路径
        String path = "C:/uploadfile";
        System.out.println(path);
        File file = new File(path);
        //如果文件不存在就创建
        if(!file.exists()){
            file.mkdir();
        }
        //获取文件名
        String filename = fxfj.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-","");
        filename = uuid+"_"+filename;
        try{
            fxfj.transferTo(new File(path,filename));
            String s = scfXservice.insertscfx(fxzt,fxnr,fxr,fxsj,filename);
            if(s.isEmpty()){
                model.addAttribute("scmsg","0");
                return "tj/tjscfx";
            }else {
                model.addAttribute("scmsg","1");
                return "tj/tjscfx";
            }
        }catch (Exception e){
            e.printStackTrace();
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


    /**
     * 文件下载
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/filedownload")
    public static ResponseEntity<byte[]> filedownload(HttpServletRequest request ) throws Exception{
        String filename = request.getParameter("scfx");
        System.out.println(filename);

        ServletContext servletContext = request.getServletContext();
        String fileName=filename;
        String realPath = "C:/uploadfile/"+fileName;//得到文件所在位置
        InputStream in=new FileInputStream(new File(realPath));//将该文件加入到输入流之中
        byte[] body=null;
        body=new byte[in.available()];// 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数
        in.read(body);//读入到输入流里面

        fileName=new String(fileName.getBytes("gbk"),"iso8859-1");//防止中文乱码
        HttpHeaders headers=new HttpHeaders();//设置响应头
        headers.add("Content-Disposition", "attachment;filename="+fileName);
        HttpStatus statusCode = HttpStatus.OK;//设置响应吗
        ResponseEntity<byte[]> response=new ResponseEntity<byte[]>(body, headers, statusCode);
        return response;

    }
}
