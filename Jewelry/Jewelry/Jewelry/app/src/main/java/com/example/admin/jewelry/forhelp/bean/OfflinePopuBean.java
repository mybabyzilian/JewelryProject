package com.example.admin.jewelry.forhelp.bean;

import java.util.List;

/**
 * Created by JINDAPENG on 2016/8/25.
 */
public class OfflinePopuBean {

    /**
     * status : 1
     * msg : 获取数据成功！
     * object : {"citylist":[{"codes":"","names":"区域"},{"codes":"51","names":"长春市"}],"alist":[{"codes":"","names":"状态"},{"codes":"W","names":"等待求助"},{"codes":"OVER","names":"已完成"}],"clist":[{"codes":"","names":"分类"},{"codes":"1","names":"玉石"},{"codes":"2","names":"宝石"},{"codes":"3","names":"文玩"},{"codes":"4","names":"其他"}],"addlist":[{"codes":"1","names":"玉石"},{"codes":"2","names":"宝石"},{"codes":"3","names":"文玩"},{"codes":"4","names":"其他"}]}
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
         * names : 区域
         */

        private List<CitylistBean> citylist;
        /**
         * codes :
         * names : 状态
         */

        private List<AlistBean> alist;
        /**
         * codes :
         * names : 分类
         */

        private List<ClistBean> clist;
        /**
         * codes : 1
         * names : 玉石
         */

        private List<AddlistBean> addlist;

        public List<CitylistBean> getCitylist() {
            return citylist;
        }

        public void setCitylist(List<CitylistBean> citylist) {
            this.citylist = citylist;
        }

        public List<AlistBean> getAlist() {
            return alist;
        }

        public void setAlist(List<AlistBean> alist) {
            this.alist = alist;
        }

        public List<ClistBean> getClist() {
            return clist;
        }

        public void setClist(List<ClistBean> clist) {
            this.clist = clist;
        }

        public List<AddlistBean> getAddlist() {
            return addlist;
        }

        public void setAddlist(List<AddlistBean> addlist) {
            this.addlist = addlist;
        }

        public static class CitylistBean {
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

        public static class AlistBean {
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

        public static class ClistBean {
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

        public static class AddlistBean {
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
