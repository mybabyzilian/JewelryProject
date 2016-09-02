package com.example.admin.jewelry.homepage.MajorTrain;

import java.util.List;

/**
 * Created by admin on 2016/9/2.
 */
public class MajorBean {

    /**
     * status : 1
     * msg : 获取成功!
     * object : [{"train_id":"100004","train_user_id":"1000002","train_agency_id":"100000","train_category":"宝玉石","train_course_title":"xxxxxxxx培训","train_city":"北京市","train_address":"xxxxxxxxxxx","train_course_start_date":"06/30","train_cycle":"30天","train_mechanism":"机制二","train_certificates_available":"余罪证书","train_cost":"1000.00","train_phone":"13552942420","train_description":"xxxxxxxx","train_create_time":"2016-07-30 08:56:00","train_status":"2"},{"train_id":"100003","train_user_id":"1000002","train_agency_id":"100000","train_category":"宝玉石","train_course_title":"xxxxxxxx培训","train_city":"北京市","train_address":"xxxxxxxxxxx","train_course_start_date":"05/30","train_cycle":"30天","train_mechanism":"机制二","train_certificates_available":"余罪证书","train_cost":"1000.00","train_phone":"13552942420","train_description":"xxxxxxxx","train_create_time":"2016-06-30 08:56:00","train_status":"2"},{"train_id":"100002","train_user_id":"1000002","train_agency_id":"100000","train_category":"宝玉石","train_course_title":"xxxxxxxx培训","train_city":"北京市","train_address":"xxxxxxxxxxx","train_course_start_date":"09/30","train_cycle":"30天","train_mechanism":"机制二","train_certificates_available":"余罪证书","train_cost":"1000.00","train_phone":"13552942420","train_description":"xxxxxxxx","train_create_time":"2016-05-30 08:56:00","train_status":"2"},{"train_id":"100001","train_user_id":"1000002","train_agency_id":"100000","train_category":"宝玉石","train_course_title":"xxxxxxxx培训","train_city":"北京市","train_address":"xxxxxxxxxxx","train_course_start_date":"08/30","train_cycle":"30天","train_mechanism":"机制二","train_certificates_available":"余罪证书","train_cost":"1000.00","train_phone":"13552942420","train_description":"xxxxxxxx","train_create_time":"2016-04-30 08:56:00","train_status":"2"},{"train_id":"100000","train_user_id":"1000002","train_agency_id":"100000","train_category":"宝玉石","train_course_title":"xxxxxxxx培训","train_city":"北京市","train_address":"xxxxxxxxxxx","train_course_start_date":"07/30","train_cycle":"30天","train_mechanism":"机制二","train_certificates_available":"余罪证书","train_cost":"1000.00","train_phone":"13552942420","train_description":"xxxxxxxx","train_create_time":"2016-03-30 08:57:00","train_status":"2"}]
     */

    private String status;
    private String msg;
    /**
     * train_id : 100004
     * train_user_id : 1000002
     * train_agency_id : 100000
     * train_category : 宝玉石
     * train_course_title : xxxxxxxx培训
     * train_city : 北京市
     * train_address : xxxxxxxxxxx
     * train_course_start_date : 06/30
     * train_cycle : 30天
     * train_mechanism : 机制二
     * train_certificates_available : 余罪证书
     * train_cost : 1000.00
     * train_phone : 13552942420
     * train_description : xxxxxxxx
     * train_create_time : 2016-07-30 08:56:00
     * train_status : 2
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
        private String train_id;
        private String train_user_id;
        private String train_agency_id;
        private String train_category;
        private String train_course_title;
        private String train_city;
        private String train_address;
        private String train_course_start_date;
        private String train_cycle;
        private String train_mechanism;
        private String train_certificates_available;
        private String train_cost;
        private String train_phone;
        private String train_description;
        private String train_create_time;
        private String train_status;

        public String getTrain_id() {
            return train_id;
        }

        public void setTrain_id(String train_id) {
            this.train_id = train_id;
        }

        public String getTrain_user_id() {
            return train_user_id;
        }

        public void setTrain_user_id(String train_user_id) {
            this.train_user_id = train_user_id;
        }

        public String getTrain_agency_id() {
            return train_agency_id;
        }

        public void setTrain_agency_id(String train_agency_id) {
            this.train_agency_id = train_agency_id;
        }

        public String getTrain_category() {
            return train_category;
        }

        public void setTrain_category(String train_category) {
            this.train_category = train_category;
        }

        public String getTrain_course_title() {
            return train_course_title;
        }

        public void setTrain_course_title(String train_course_title) {
            this.train_course_title = train_course_title;
        }

        public String getTrain_city() {
            return train_city;
        }

        public void setTrain_city(String train_city) {
            this.train_city = train_city;
        }

        public String getTrain_address() {
            return train_address;
        }

        public void setTrain_address(String train_address) {
            this.train_address = train_address;
        }

        public String getTrain_course_start_date() {
            return train_course_start_date;
        }

        public void setTrain_course_start_date(String train_course_start_date) {
            this.train_course_start_date = train_course_start_date;
        }

        public String getTrain_cycle() {
            return train_cycle;
        }

        public void setTrain_cycle(String train_cycle) {
            this.train_cycle = train_cycle;
        }

        public String getTrain_mechanism() {
            return train_mechanism;
        }

        public void setTrain_mechanism(String train_mechanism) {
            this.train_mechanism = train_mechanism;
        }

        public String getTrain_certificates_available() {
            return train_certificates_available;
        }

        public void setTrain_certificates_available(String train_certificates_available) {
            this.train_certificates_available = train_certificates_available;
        }

        public String getTrain_cost() {
            return train_cost;
        }

        public void setTrain_cost(String train_cost) {
            this.train_cost = train_cost;
        }

        public String getTrain_phone() {
            return train_phone;
        }

        public void setTrain_phone(String train_phone) {
            this.train_phone = train_phone;
        }

        public String getTrain_description() {
            return train_description;
        }

        public void setTrain_description(String train_description) {
            this.train_description = train_description;
        }

        public String getTrain_create_time() {
            return train_create_time;
        }

        public void setTrain_create_time(String train_create_time) {
            this.train_create_time = train_create_time;
        }

        public String getTrain_status() {
            return train_status;
        }

        public void setTrain_status(String train_status) {
            this.train_status = train_status;
        }
    }
}
