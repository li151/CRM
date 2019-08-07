package com.web.service;

import com.web.model.RCGL;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 日程管理
 */
@Transactional
public interface RCGLservice {

    List<RCGL> selectrc(String cjr)throws Exception;

    String tjrc(String rcmc,String kssj,String jssj,String rcnr,String qtgz,String qwdd,String cjr);

    String rcsc(String rcmc,String cjr);
}
