package com.example.admin.jewelry.homepage.jewerydisplay;

import java.util.List;

/**
 * Created by admin on 2016/8/29.
 */
public class DisplayPopuBean {

    /**
     * status : 1
     * msg : 获取数据成功！
     * object : {"citylist":[{"codes":"","names":"区域"}],"categorylist":[{"codes":"","names":"品类"},{"codes":"1","names":"玉石"},{"codes":"2","names":"宝石"},{"codes":"3","names":"文玩"},{"codes":"4","names":"其他"}],"orderlist":[{"codes":"","names":"排序"},{"codes":"DATE_ASC","names":"最新发布"},{"codes":"PRICE_ASC","names":"价格最低"},{"codes":"PRICE_DESC","names":"价格最高"},{"codes":"DISTANCE_ASC","names":"距离最近"}],"stylelist":[{"codes":"","names":"款式"},{"codes":"1","names":"挂件"},{"codes":"2","names":"手镯"},{"codes":"3","names":"手链"},{"codes":"4","names":"戒指"},{"codes":"5","names":"项链"},{"codes":"6","names":"把件"},{"codes":"7","names":"其他"}]}
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
         * names : 品类
         */

        private List<CategorylistBean> categorylist;
        /**
         * codes :
         * names : 排序
         */

        private List<OrderlistBean> orderlist;
        /**
         * codes :
         * names : 款式
         */

        private List<StylelistBean> stylelist;

        public List<CitylistBean> getCitylist() {
            return citylist;
        }

        public void setCitylist(List<CitylistBean> citylist) {
            this.citylist = citylist;
        }

        public List<CategorylistBean> getCategorylist() {
            return categorylist;
        }

        public void setCategorylist(List<CategorylistBean> categorylist) {
            this.categorylist = categorylist;
        }

        public List<OrderlistBean> getOrderlist() {
            return orderlist;
        }

        public void setOrderlist(List<OrderlistBean> orderlist) {
            this.orderlist = orderlist;
        }

        public List<StylelistBean> getStylelist() {
            return stylelist;
        }

        public void setStylelist(List<StylelistBean> stylelist) {
            this.stylelist = stylelist;
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

        public static class OrderlistBean {
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

        public static class StylelistBean {
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
