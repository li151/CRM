package com.web.service;


import com.web.mapper.customerdao;
import com.web.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ExpExclImpl implements ExpExcl {

    @Autowired
    customerdao customerdaos;
    @Override
    public List<Map<String, String>> selectAllAssetInlibraryInfo(String shotid) throws Exception {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        List<customer> customers = customerdaos.selecttjcx(shotid);
        List<Map<String, String>> mapList=new ArrayList<Map<String,String>>();
        mapl(customers,mapList);
//        for (customer assetInlibrary : customers) {
//            Map<String, String> map=new HashMap<String, String>();
//            map.put("客户名称", assetInlibrary.getCustomername()+"");
//            map.put("客户类型", assetInlibrary.getShortid());
//            map.put("添加日期", simpleDateFormat.format(assetInlibrary.getAddtime()));
//            map.put("电话", assetInlibrary.getTelephone());
//            map.put("传真", assetInlibrary.getFax());
//            map.put("负责人", assetInlibrary.getFunctionary());
//            map.put("地区", assetInlibrary.getCity());
//            map.put("行业", assetInlibrary.getIndustry());
//            map.put("经营项目", assetInlibrary.getDealproject());
//            map.put("联系人", assetInlibrary.getLinkman());
//            map.put("企业地址", assetInlibrary.getLinkaddress());
//            map.put("邮箱", assetInlibrary.getEmail());
//            map.put("企业性质", assetInlibrary.getLinktype());
//            mapList.add(map);
//        }
        return mapList;
    }

    @Override
    public List<Map<String, String>> selectAllkhxx() throws Exception {

        List<customer> customers = customerdaos.selectcustom();
        List<Map<String, String>> mapList=new ArrayList<Map<String,String>>();
        mapl(customers,mapList);
        return mapList;
    }

    public void mapl(List<customer> customers,List<Map<String,String>> mapList){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        for (customer ass : customers) {
            Map<String, String> map=new HashMap<String, String>();
            map.put("客户名称", ass.getCustomername()+"");
            map.put("客户类型", ass.getShortid());
            map.put("添加日期", simpleDateFormat.format(ass.getAddtime()));
            map.put("电话", ass.getTelephone());
            map.put("传真", ass.getFax());
            map.put("负责人", ass.getFunctionary());
            map.put("地区", ass.getCity());
            map.put("行业", ass.getIndustry());
            map.put("经营项目", ass.getDealproject());
            map.put("联系人", ass.getLinkman());
            map.put("企业地址", ass.getLinkaddress());
            map.put("邮箱", ass.getEmail());
            map.put("企业性质", ass.getLinktype());
            mapList.add(map);
        }
    }
}
