package com.aciel.austin.handler.scipt;

import com.aciel.austin.handler.domain.SmsParam;
import com.aciel.austin.support.domain.SmsRecord;

import java.util.List;

/**
 * @author Aciel
 * @date
 */
public interface SmsScript {
    /**
     * 发送短信
     *
     * @param smsParam 发送短信参数
     * @return 渠道商接口返回值
     */
    List<SmsRecord> send(SmsParam smsParam) throws Exception;
}
