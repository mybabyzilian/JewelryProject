package com.example.admin.jewelry.login;

/**
 * Created by admin on 2016/8/30.
 */
public class UserLoginBean {

    /**
     * status : 0
     * msg : 无效账号!
     * object : null
     */

    private String status;
    private String msg;
    private Object object;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
