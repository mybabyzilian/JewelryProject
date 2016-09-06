package com.example.admin.jewelry.mine.my_baby;

import java.util.List;

/**
 * Created by JINDAPENG on 2016/8/31.
 */
public class BabyPopuBean {

    /**
     * status : 1
     * msg : 获取数据成功！
     * object : {"categorylist":[{"codes":"","names":"分类"},{"codes":"1","names":"玉石"},{"codes":"2","names":"宝石"},{"codes":"3","names":"文玩"},{"codes":"4","names":"其他"}],"statuslist":[{"codes":"","names":"状态"},{"codes":"UP","names":"上架"},{"codes":"DOWN","names":"下架"},{"codes":"NO","names":"审核失败"},{"codes":"WAIT","names":"等待审核"}]}
     */

    private String status;
    private String msg;
    private ObjectBean object;

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

    public ObjectBean getObject() {
        return object;
    }

    public void setObject(ObjectBean object) {
        this.object = object;
    }

    public static class ObjectBean {
        /**
         * codes :
         * names : 分类
         */

        private List<CategorylistBean> categorylist;
        /**
         * codes :
         * names : 状态
         */

        private List<StatuslistBean> statuslist;

        public List<CategorylistBean> getCategorylist() {
            return categorylist;
        }

        public void setCategorylist(List<CategorylistBean> categorylist) {
            this.categorylist = categorylist;
        }

        public List<StatuslistBean> getStatuslist() {
            return statuslist;
        }

        public void setStatuslist(List<StatuslistBean> statuslist) {
            this.statuslist = statuslist;
        }

        public static class CategorylistBean {
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

        public static class StatuslistBean {
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
}
