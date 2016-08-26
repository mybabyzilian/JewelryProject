package com.example.admin.jewelry.homepage.hot_activity;

import java.util.List;

/**
 * Created by JINDAPENG on 2016/8/25.
 */
public class HotBean {

    /**
     * status : 1
     * msg : 获取成功!
     * object : [{"activity_id":"2","activity_title":"活动标题2","activity_picture_url":"http://192.168.31.10:8911/resources/boastjewelry/e8b20ae09c599a855755f8833ec53023.jpg","activity_theme_content":"2","activity_rule_content":"2","acticity_prize_content":"2","acticity_create_time":"2016-08-08 09:09:09","acticity_status":"1","acticity_amount":"2"},{"activity_id":"4","activity_title":"活动标题4","activity_picture_url":"http://192.168.31.10:8911/resources/boastjewelry/e8b20ae09c599a855755f8833ec53023.jpg","activity_theme_content":"2","activity_rule_content":"2","acticity_prize_content":"2","acticity_create_time":"2016-05-08 09:09:09","acticity_status":"1","acticity_amount":"2"},{"activity_id":"6","activity_title":"活动标题6","activity_picture_url":"http://192.168.31.10:8911/resources/boastjewelry/e8b20ae09c599a855755f8833ec53023.jpg","activity_theme_content":"2","activity_rule_content":"2","acticity_prize_content":"2","acticity_create_time":"2016-03-08 09:09:09","acticity_status":"1","acticity_amount":"2"},{"activity_id":"8","activity_title":"活动标题8","activity_picture_url":"http://192.168.31.10:8911/resources/boastjewelry/e8b20ae09c599a855755f8833ec53023.jpg","activity_theme_content":"2","activity_rule_content":"2","acticity_prize_content":"2","acticity_create_time":"2016-01-08 09:09:09","acticity_status":"1","acticity_amount":"2"},{"activity_id":"1","activity_title":"活动标题1","activity_picture_url":"http://192.168.31.10:8911/resources/boastjewelry/e8b20ae09c599a855755f8833ec53023.jpg","activity_theme_content":"1","activity_rule_content":"1","acticity_prize_content":"1","acticity_create_time":"2016-07-08 08:08:08","acticity_status":"2","acticity_amount":"1"},{"activity_id":"3","activity_title":"活动标题3","activity_picture_url":"http://192.168.31.10:8911/resources/boastjewelry/e8b20ae09c599a855755f8833ec53023.jpg","activity_theme_content":"1","activity_rule_content":"1","acticity_prize_content":"1","acticity_create_time":"2016-06-08 08:08:08","acticity_status":"2","acticity_amount":"1"},{"activity_id":"5","activity_title":"活动标题5","activity_picture_url":"http://192.168.31.10:8911/resources/boastjewelry/e8b20ae09c599a855755f8833ec53023.jpg","activity_theme_content":"1","activity_rule_content":"1","acticity_prize_content":"1","acticity_create_time":"2016-04-08 08:08:08","acticity_status":"2","acticity_amount":"1"},{"activity_id":"7","activity_title":"活动标题7","activity_picture_url":"http://192.168.31.10:8911/resources/boastjewelry/e8b20ae09c599a855755f8833ec53023.jpg","activity_theme_content":"1","activity_rule_content":"1","acticity_prize_content":"1","acticity_create_time":"2016-02-08 08:08:08","acticity_status":"2","acticity_amount":"1"}]
     */

    private String status;
    private String msg;
    /**
     * activity_id : 2
     * activity_title : 活动标题2
     * activity_picture_url : http://192.168.31.10:8911/resources/boastjewelry/e8b20ae09c599a855755f8833ec53023.jpg
     * activity_theme_content : 2
     * activity_rule_content : 2
     * acticity_prize_content : 2
     * acticity_create_time : 2016-08-08 09:09:09
     * acticity_status : 1
     * acticity_amount : 2
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
        private String activity_id;
        private String activity_title;
        private String activity_picture_url;
        private String activity_theme_content;
        private String activity_rule_content;
        private String acticity_prize_content;
        private String acticity_create_time;
        private String acticity_status;
        private String acticity_amount;

        public String getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(String activity_id) {
            this.activity_id = activity_id;
        }

        public String getActivity_title() {
            return activity_title;
        }

        public void setActivity_title(String activity_title) {
            this.activity_title = activity_title;
        }

        public String getActivity_picture_url() {
            return activity_picture_url;
        }

        public void setActivity_picture_url(String activity_picture_url) {
            this.activity_picture_url = activity_picture_url;
        }

        public String getActivity_theme_content() {
            return activity_theme_content;
        }

        public void setActivity_theme_content(String activity_theme_content) {
            this.activity_theme_content = activity_theme_content;
        }

        public String getActivity_rule_content() {
            return activity_rule_content;
        }

        public void setActivity_rule_content(String activity_rule_content) {
            this.activity_rule_content = activity_rule_content;
        }

        public String getActicity_prize_content() {
            return acticity_prize_content;
        }

        public void setActicity_prize_content(String acticity_prize_content) {
            this.acticity_prize_content = acticity_prize_content;
        }

        public String getActicity_create_time() {
            return acticity_create_time;
        }

        public void setActicity_create_time(String acticity_create_time) {
            this.acticity_create_time = acticity_create_time;
        }

        public String getActicity_status() {
            return acticity_status;
        }

        public void setActicity_status(String acticity_status) {
            this.acticity_status = acticity_status;
        }

        public String getActicity_amount() {
            return acticity_amount;
        }

        public void setActicity_amount(String acticity_amount) {
            this.acticity_amount = acticity_amount;
        }
    }
}
