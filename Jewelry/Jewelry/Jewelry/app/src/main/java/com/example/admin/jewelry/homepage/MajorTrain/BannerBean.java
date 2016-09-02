package com.example.admin.jewelry.homepage.MajorTrain;

import java.util.List;

/**
 * Created by admin on 2016/9/2.
 */
public class BannerBean {

    /**
     * status : 1
     * msg : 获取成功!
     * object : [{"banner_id":"1","banner_image_url":"http://192.168.31.10:8911/resources/boastjewelry/train/banner/banner_1.jpg","banner_jump_url":"https://www.baidu.com/","banner_seq":"1"},{"banner_id":"2","banner_image_url":"http://192.168.31.10:8911/resources/boastjewelry/train/banner/banner_2.jpg","banner_jump_url":"https://www.baidu.com/","banner_seq":"2"},{"banner_id":"3","banner_image_url":"http://192.168.31.10:8911/resources/boastjewelry/train/banner/banner_3.jpg","banner_jump_url":"https://www.baidu.com/","banner_seq":"3"}]
     */

    private String status;
    private String msg;
    /**
     * banner_id : 1
     * banner_image_url : http://192.168.31.10:8911/resources/boastjewelry/train/banner/banner_1.jpg
     * banner_jump_url : https://www.baidu.com/
     * banner_seq : 1
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
        private String banner_id;
        private String banner_image_url;
        private String banner_jump_url;
        private String banner_seq;

        public String getBanner_id() {
            return banner_id;
        }

        public void setBanner_id(String banner_id) {
            this.banner_id = banner_id;
        }

        public String getBanner_image_url() {
            return banner_image_url;
        }

        public void setBanner_image_url(String banner_image_url) {
            this.banner_image_url = banner_image_url;
        }

        public String getBanner_jump_url() {
            return banner_jump_url;
        }

        public void setBanner_jump_url(String banner_jump_url) {
            this.banner_jump_url = banner_jump_url;
        }

        public String getBanner_seq() {
            return banner_seq;
        }

        public void setBanner_seq(String banner_seq) {
            this.banner_seq = banner_seq;
        }
    }
}
