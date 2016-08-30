package com.example.admin.jewelry.homepage.hot_activity;

import java.util.List;

/**
 * Created by JINDAPENG on 2016/8/26.
 */
public class HotDetailsBean {

    /**
     * status : 1
     * msg : 获取成功!
     * object : [{"activity_log_id":"1","activity_log_activity_id":"1","activity_log_user_id":"1000001","activity_log_user_name":"中国联通","activity_log_user_head_url":"http://192.168.31.10:8911/resources/boastjewelry/default/head/defaultavatar.png","activity_log_picture_urls":"http://img3.cache.netease.com/sports/2016/8/8/20160808004110568bd.jpg","activity_log_picture_content":"12323123123123123","activity_log_like_amount":"104","activity_log_browse_amount":"0","activity_log_create_time":"2016-08-08 16:10:03","is_like":"0"},{"activity_log_id":"2","activity_log_activity_id":"1","activity_log_user_id":"1000002","activity_log_user_name":"","activity_log_user_head_url":"","activity_log_picture_urls":"http://img3.cache.netease.com/sports/2016/8/8/20160808004110568bd.jpg","activity_log_picture_content":"12323123123123123","activity_log_like_amount":"100","activity_log_browse_amount":"0","activity_log_create_time":"2016-08-08 16:10:03","is_like":"0"},{"activity_log_id":"3","activity_log_activity_id":"1","activity_log_user_id":"1000003","activity_log_user_name":"","activity_log_user_head_url":"","activity_log_picture_urls":"http://img3.cache.netease.com/sports/2016/8/8/20160808004110568bd.jpg","activity_log_picture_content":"12323123123123123","activity_log_like_amount":"106","activity_log_browse_amount":"0","activity_log_create_time":"2016-08-08 16:10:03","is_like":"0"},{"activity_log_id":"4","activity_log_activity_id":"1","activity_log_user_id":"1000004","activity_log_user_name":"","activity_log_user_head_url":"","activity_log_picture_urls":"http://img3.cache.netease.com/sports/2016/8/8/20160808004110568bd.jpg","activity_log_picture_content":"12323123123123123","activity_log_like_amount":"98","activity_log_browse_amount":"0","activity_log_create_time":"2016-08-08 16:10:03","is_like":"0"},{"activity_log_id":"5","activity_log_activity_id":"1","activity_log_user_id":"1000005","activity_log_user_name":"中国电信","activity_log_user_head_url":"http://192.168.31.10:8911/resources/boastjewelry/default/head/defaultavatar.png","activity_log_picture_urls":"http://img3.cache.netease.com/sports/2016/8/8/20160808004110568bd.jpg","activity_log_picture_content":"12323123123123123","activity_log_like_amount":"97","activity_log_browse_amount":"0","activity_log_create_time":"2016-08-08 16:10:03","is_like":"0"},{"activity_log_id":"6","activity_log_activity_id":"1","activity_log_user_id":"1000006","activity_log_user_name":"","activity_log_user_head_url":"","activity_log_picture_urls":"http://img3.cache.netease.com/sports/2016/8/8/20160808004110568bd.jpg","activity_log_picture_content":"12323123123123123","activity_log_like_amount":"96","activity_log_browse_amount":"0","activity_log_create_time":"2016-08-08 16:10:03","is_like":"0"},{"activity_log_id":"7","activity_log_activity_id":"1","activity_log_user_id":"1000007","activity_log_user_name":"","activity_log_user_head_url":"","activity_log_picture_urls":"http://img3.cache.netease.com/sports/2016/8/8/20160808004110568bd.jpg","activity_log_picture_content":"12323123123123123","activity_log_like_amount":"95","activity_log_browse_amount":"0","activity_log_create_time":"2016-08-08 16:10:03","is_like":"0"},{"activity_log_id":"8","activity_log_activity_id":"1","activity_log_user_id":"1000008","activity_log_user_name":"","activity_log_user_head_url":"","activity_log_picture_urls":"http://img3.cache.netease.com/sports/2016/8/8/20160808004110568bd.jpg","activity_log_picture_content":"12323123123123123","activity_log_like_amount":"94","activity_log_browse_amount":"0","activity_log_create_time":"2016-08-08 16:10:03","is_like":"0"}]
     */

    private String status;
    private String msg;
    /**
     * activity_log_id : 1
     * activity_log_activity_id : 1
     * activity_log_user_id : 1000001
     * activity_log_user_name : 中国联通
     * activity_log_user_head_url : http://192.168.31.10:8911/resources/boastjewelry/default/head/defaultavatar.png
     * activity_log_picture_urls : http://img3.cache.netease.com/sports/2016/8/8/20160808004110568bd.jpg
     * activity_log_picture_content : 12323123123123123
     * activity_log_like_amount : 104
     * activity_log_browse_amount : 0
     * activity_log_create_time : 2016-08-08 16:10:03
     * is_like : 0
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
        private String activity_log_id;
        private String activity_log_activity_id;
        private String activity_log_user_id;
        private String activity_log_user_name;
        private String activity_log_user_head_url;
        private String activity_log_picture_urls;
        private String activity_log_picture_content;
        private String activity_log_like_amount;
        private String activity_log_browse_amount;
        private String activity_log_create_time;
        private String is_like;

        public String getActivity_log_id() {
            return activity_log_id;
        }

        public void setActivity_log_id(String activity_log_id) {
            this.activity_log_id = activity_log_id;
        }

        public String getActivity_log_activity_id() {
            return activity_log_activity_id;
        }

        public void setActivity_log_activity_id(String activity_log_activity_id) {
            this.activity_log_activity_id = activity_log_activity_id;
        }

        public String getActivity_log_user_id() {
            return activity_log_user_id;
        }

        public void setActivity_log_user_id(String activity_log_user_id) {
            this.activity_log_user_id = activity_log_user_id;
        }

        public String getActivity_log_user_name() {
            return activity_log_user_name;
        }

        public void setActivity_log_user_name(String activity_log_user_name) {
            this.activity_log_user_name = activity_log_user_name;
        }

        public String getActivity_log_user_head_url() {
            return activity_log_user_head_url;
        }

        public void setActivity_log_user_head_url(String activity_log_user_head_url) {
            this.activity_log_user_head_url = activity_log_user_head_url;
        }

        public String getActivity_log_picture_urls() {
            return activity_log_picture_urls;
        }

        public void setActivity_log_picture_urls(String activity_log_picture_urls) {
            this.activity_log_picture_urls = activity_log_picture_urls;
        }

        public String getActivity_log_picture_content() {
            return activity_log_picture_content;
        }

        public void setActivity_log_picture_content(String activity_log_picture_content) {
            this.activity_log_picture_content = activity_log_picture_content;
        }

        public String getActivity_log_like_amount() {
            return activity_log_like_amount;
        }

        public void setActivity_log_like_amount(String activity_log_like_amount) {
            this.activity_log_like_amount = activity_log_like_amount;
        }

        public String getActivity_log_browse_amount() {
            return activity_log_browse_amount;
        }

        public void setActivity_log_browse_amount(String activity_log_browse_amount) {
            this.activity_log_browse_amount = activity_log_browse_amount;
        }

        public String getActivity_log_create_time() {
            return activity_log_create_time;
        }

        public void setActivity_log_create_time(String activity_log_create_time) {
            this.activity_log_create_time = activity_log_create_time;
        }

        public String getIs_like() {
            return is_like;
        }

        public void setIs_like(String is_like) {
            this.is_like = is_like;
        }
    }
}
