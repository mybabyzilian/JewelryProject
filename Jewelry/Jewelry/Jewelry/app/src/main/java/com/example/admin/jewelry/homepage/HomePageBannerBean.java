package com.example.admin.jewelry.homepage;

import java.util.List;

/**
 * Created by admin on 2016/9/6.
 */
public class HomePageBannerBean {

    /**
     * status : 1
     * msg : 获取网站首页轮播图成功！
     * object : {"tops":[{"entity_id":"1","web_title":"1","web_src":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/index/pic/01.jpg","web_href":"http://www.baidu.com","type":"homeTop","seq":"1","state":"1"},{"entity_id":"2","web_title":"2","web_src":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/index/pic/02.jpg","web_href":"","type":"homeTop","seq":"2","state":"1"},{"entity_id":"3","web_title":"3","web_src":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/index/pic/03.jpg","web_href":"http://www.baidu.com","type":"homeTop","seq":"3","state":"1"},{"entity_id":"4","web_title":"4","web_src":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/index/pic/04.jpg","web_href":"","type":"homeTop","seq":"4","state":"1"}]}
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
         * entity_id : 1
         * web_title : 1
         * web_src : http://192.168.31.110:8911/resources/boastjewelry/upload/admin/index/pic/01.jpg
         * web_href : http://www.baidu.com
         * type : homeTop
         * seq : 1
         * state : 1
         */

        private List<TopsBean> tops;

        public List<TopsBean> getTops() {
            return tops;
        }

        public void setTops(List<TopsBean> tops) {
            this.tops = tops;
        }

        public static class TopsBean {
            private String entity_id;
            private String web_title;
            private String web_src;
            private String web_href;
            private String type;
            private String seq;
            private String state;

            public String getEntity_id() {
                return entity_id;
            }

            public void setEntity_id(String entity_id) {
                this.entity_id = entity_id;
            }

            public String getWeb_title() {
                return web_title;
            }

            public void setWeb_title(String web_title) {
                this.web_title = web_title;
            }

            public String getWeb_src() {
                return web_src;
            }

            public void setWeb_src(String web_src) {
                this.web_src = web_src;
            }

            public String getWeb_href() {
                return web_href;
            }

            public void setWeb_href(String web_href) {
                this.web_href = web_href;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getSeq() {
                return seq;
            }

            public void setSeq(String seq) {
                this.seq = seq;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }
        }
    }
}
