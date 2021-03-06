/**
 * @Title: Resp.java
 * @Package com.iresearch.core.utils
 * @Description: TODO
 * Copyright: Copyright (c) 2016
 * Company:艾瑞咨询
 * @author Iresearch-billzhuang
 * @date 2016年3月24日 上午9:35:49
 * @version V1.0.0
 */
package com.ecnu.trivia.web.utils;

import com.ecnu.trivia.common.component.web.HttpRespCode;

import java.io.Serializable;
import java.util.Date;

public class QuestionResp implements Serializable {
    private static final long serialVersionUID = -8660197629749596025L;

    protected String resCode;
    protected String resMsg;
    protected Integer count;

    /**
     * @return the resTime
     */
    public Long getResTime() {
        if (resTime == null) {
            return 0L;
        }
        return resTime.getTime();
    }

    /**
     * @param resTime the resTime to set
     */
    public void setResTime(Date resTime) {
        this.resTime = resTime;
    }

    protected Date resTime;
    protected Object data;

    public QuestionResp() {

    }


    public QuestionResp(HttpRespCode resCode) {
        this.resCode = resCode.getCode();
        this.resMsg = resCode.getText();
        this.resTime = new Date();
    }

    public QuestionResp(HttpRespCode resCode, Object data,Integer count) {
        this.resCode = resCode.getCode();
        this.resMsg = resCode.getText();
        this.resTime = new Date();
        this.data = data;
        this.count = count;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCount() { return count; }

    public void setCount(Integer count) { this.count = count; }
}
