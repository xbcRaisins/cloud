package com.xbc.web.xbcweb.util;

/**
 * 描述：
 *
 * @author weizeng
 * @date 2019/4/29 16:37
 */
public class HttpClientResult {
    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应数据
     */
    private String content;

    public HttpClientResult(int code, String content) {
        this.code = code;
        this.content = content;
    }

    public HttpClientResult(int code) {
        this.code = code;
    }

}
