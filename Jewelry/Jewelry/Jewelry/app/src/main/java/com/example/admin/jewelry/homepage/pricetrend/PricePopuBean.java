package com.example.admin.jewelry.homepage.pricetrend;

import java.util.List;

/**
 * Created by admin on 2016/8/24.
 */
public class PricePopuBean {

    /**
     * status : 1
     * msg : 获取成功!
     * object : [{"codes":"2","names":"黄金"},{"codes":"3","names":"白银"},{"codes":"5","names":"铂金"}]
     */

    private String status;
    private String msg;
    /**
     * codes : 2
     * names : 黄金
     */

    private List<ObjectBean> object;

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

    public List<ObjectBean> getObject() {
        return object;
    }

    public void setObject(List<ObjectBean> object) {
        this.object = object;
    }

    public static class ObjectBean {
        private String codes;
        private String names;

        public String getCodes() {
            return codes;
        }

        public void setCodes(String codes) {
            this.codes = codes;
        }

        public String getNames() {
            return names;
        }

        public void setNames(String names) {
            this.names = names;
        }
    }
}
