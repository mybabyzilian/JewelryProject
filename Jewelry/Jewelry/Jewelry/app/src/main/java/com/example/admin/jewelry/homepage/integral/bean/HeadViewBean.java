package com.example.admin.jewelry.homepage.integral.bean;

import java.util.List;

/**
 * Created by JINDAPENG on 2016/8/18.
 */
public class HeadViewBean {

    /**
     * status : 1
     * msg : 获取数据成功！
     * object : {"categorylist":[{"entity_id":"1","category_name":"珠宝饰品","seq":"1","state":"1"},{"entity_id":"2","category_name":"相关配品","seq":"2","state":"1"},{"entity_id":"3","category_name":"专业刊物","seq":"3","state":"1"}],"advertlist":[{"entity_id":"4","advert_pic":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/advert04.jpg","advert_href":"http://www.baidu.com","create_time":"2016-08-04 12:34:45"},{"entity_id":"3","advert_pic":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/advert03.jpg","advert_href":"http://www.baidu.com","create_time":"2016-08-03 12:34:45"},{"entity_id":"2","advert_pic":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/advert02.jpg","advert_href":"http://www.baidu.com","create_time":"2016-08-02 12:34:45"},{"entity_id":"1","advert_pic":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/advert01.jpg","advert_href":"http://www.baidu.com","create_time":"2016-08-01 12:34:45"}]}
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
         * category_name : 珠宝饰品
         * seq : 1
         * state : 1
         */

        private List<CategorylistBean> categorylist;
        /**
         * entity_id : 4
         * advert_pic : http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/advert04.jpg
         * advert_href : http://www.baidu.com
         * create_time : 2016-08-04 12:34:45
         */

        private List<AdvertlistBean> advertlist;

        public List<CategorylistBean> getCategorylist() {
            return categorylist;
        }

        public void setCategorylist(List<CategorylistBean> categorylist) {
            this.categorylist = categorylist;
        }

        public List<AdvertlistBean> getAdvertlist() {
            return advertlist;
        }

        public void setAdvertlist(List<AdvertlistBean> advertlist) {
            this.advertlist = advertlist;
        }

        public static class CategorylistBean {
            private String entity_id;
            private String category_name;
            private String seq;
            private String state;

            public String getEntity_id() {
                return entity_id;
            }

            public void setEntity_id(String entity_id) {
                this.entity_id = entity_id;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
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

        public static class AdvertlistBean {
            private String entity_id;
            private String advert_pic;
            private String advert_href;
            private String create_time;

            public String getEntity_id() {
                return entity_id;
            }

            public void setEntity_id(String entity_id) {
                this.entity_id = entity_id;
            }

            public String getAdvert_pic() {
                return advert_pic;
            }

            public void setAdvert_pic(String advert_pic) {
                this.advert_pic = advert_pic;
            }

            public String getAdvert_href() {
                return advert_href;
            }

            public void setAdvert_href(String advert_href) {
                this.advert_href = advert_href;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }
        }
    }
}
