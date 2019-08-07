package com.web.service;


import com.web.model.notbook;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
public interface notbookservice {

    List<notbook> selectnk(String cjr)throws Exception;

    String insertnk(String jsbt,String createuser,String context,Date addtime)throws Exception;

    String deletegrjs(String jsbt,String createuser);

}
