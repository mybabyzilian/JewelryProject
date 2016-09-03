package com.example.admin.jewelry.forhelp.bean;

/**
 * Created by JINDAPENG on 2016/8/25.
 */
public class OfflineDetailsBean {

    /**
     * status : 1
     * msg : 获取求助鉴品详情成功！
     * object : {"helpCount":"2","payCount":"1","info":{"entity_id":"2","help_userId":"1000005","help_userHeadPic":"http://a/b/icon.jpg","help_category":"1","help_categoryName":"宝石","help_money":"10","help_userTypeName":"企业商家","help_bodyPic":"http://a/1.jpg,http://192.168.31.110:8911/a/2.jpg","help_title":"abc","help_info":"","ask_channel":"","remark_info":"","help_status":"W","help_statusName":"等待帮助","city_name":"长春市","a_userId":"2","a_userNickName":"盖伦","time_create":"2016-08-22 09:41:04"}}
     */

    private String status;
    private String msg;
    /**
     * helpCount : 2
     * payCount : 1
     * info : {"entity_id":"2","help_userId":"1000005","help_userHeadPic":"http://a/b/icon.jpg","help_category":"1","help_categoryName":"宝石","help_money":"10","help_userTypeName":"企业商家","help_bodyPic":"http://a/1.jpg,http://192.168.31.110:8911/a/2.jpg","help_title":"abc","help_info":"","ask_channel":"","remark_info":"","help_status":"W","help_statusName":"等待帮助","city_name":"长春市","a_userId":"2","a_userNickName":"盖伦","time_create":"2016-08-22 09:41:04"}
     */

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
        private String helpCount;
        private String payCount;
        /**
         * entity_id : 2
         * help_userId : 1000005
         * help_userHeadPic : http://a/b/icon.jpg
         * help_category : 1
         * help_categoryName : 宝石
         * help_money : 10
         * help_userTypeName : 企业商家
         * help_bodyPic : http://a/1.jpg,http://192.168.31.110:8911/a/2.jpg
         * help_title : abc
         * help_info :
         * ask_channel :
         * remark_info :
         * help_status : W
         * help_statusName : 等待帮助
         * city_name : 长春市
         * a_userId : 2
         * a_userNickName : 盖伦
         * time_create : 2016-08-22 09:41:04
         */

        private InfoBean info;

        public String getHelpCount() {
            return helpCount;
        }

        public void setHelpCount(String helpCount) {
            this.helpCount = helpCount;
        }

        public String getPayCount() {
            return payCount;
        }

        public void setPayCount(String payCount) {
            this.payCount = payCount;
        }

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public static class InfoBean {
            private String entity_id;
            private String help_userId;
            private String help_userHeadPic;
            private String help_category;
            private String help_categoryName;
            private String help_money;
            private String help_userTypeName;
            private String help_bodyPic;
            private String help_title;
            private String help_info;
            private String ask_channel;
            private String remark_info;
            private String help_status;
            private String help_statusName;
            private String city_name;
            private String a_userId;
            private String a_userNickName;
            private String time_create;

            public String getEntity_id() {
                return entity_id;
            }

            public void setEntity_id(String entity_id) {
                this.entity_id = entity_id;
            }

            public String getHelp_userId() {
                return help_userId;
            }

            public void setHelp_userId(String help_userId) {
                this.help_userId = help_userId;
            }

            public String getHelp_userHeadPic() {
                return help_userHeadPic;
            }

            public void setHelp_userHeadPic(String help_userHeadPic) {
                this.help_userHeadPic = help_userHeadPic;
            }

            public String getHelp_category() {
                return help_category;
            }

            public void setHelp_category(String help_category) {
                this.help_category = help_category;
            }

            public String getHelp_categoryName() {
                return help_categoryName;
            }

            public void setHelp_categoryName(String help_categoryName) {
                this.help_categoryName = help_categoryName;
            }

            public String getHelp_money() {
                return help_money;
            }

            public void setHelp_money(String help_money) {
                this.help_money = help_money;
            }

            public String getHelp_userTypeName() {
                return help_userTypeName;
            }

            public void setHelp_userTypeName(String help_userTypeName) {
                this.help_userTypeName = help_userTypeName;
            }

            public String getHelp_bodyPic() {
                return help_bodyPic;
            }

            public void setHelp_bodyPic(String help_bodyPic) {
                this.help_bodyPic = help_bodyPic;
            }

            public String getHelp_title() {
                return help_title;
            }

            public void setHelp_title(String help_title) {
                this.help_title = help_title;
            }

            public String getHelp_info() {
                return help_info;
            }

            public void setHelp_info(String help_info) {
                this.help_info = help_info;
            }

            public String getAsk_channel() {
                return ask_channel;
            }

            public void setAsk_channel(String ask_channel) {
                this.ask_channel = ask_channel;
            }

            public String getRemark_info() {
                return remark_info;
            }

            public void setRemark_info(String remark_info) {
                this.remark_info = remark_info;
            }

            public String getHelp_status() {
                return help_status;
            }

            public void setHelp_status(String help_status) {
                this.help_status = help_status;
            }

            public String getHelp_statusName() {
                return help_statusName;
            }

            public void setHelp_statusName(String help_statusName) {
                this.help_statusName = help_statusName;
            }

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }

            public String getA_userId() {
                return a_userId;
            }

            public void setA_userId(String a_userId) {
                this.a_userId = a_userId;
            }

            public String getA_userNickName() {
                return a_userNickName;
            }

            public void setA_userNickName(String a_userNickName) {
                this.a_userNickName = a_userNickName;
            }

            public String getTime_create() {
                return time_create;
            }

            public void setTime_create(String time_create) {
                this.time_create = time_create;
            }
        }
    }
}
