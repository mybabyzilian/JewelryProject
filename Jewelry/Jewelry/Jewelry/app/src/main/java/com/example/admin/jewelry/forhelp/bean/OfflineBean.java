package com.example.admin.jewelry.forhelp.bean;

import java.util.List;

/**
 * Created by JINDAPENG on 2016/8/31.
 */
public class OfflineBean {
/**
     * status : 1
     * msg : 获取在线求助列表成功！
     * object : {"list":[{"entity_id":"2","help_userId":"1000001","help_userHeadPic":"http://192.168.31.110:8911/resources/boastjewelry/upload/1000001/user_head/icon.jpg","help_userNickName":"","help_userIdTitle":"","help_category":"","help_categoryName":"","help_money":"18","help_userType":"","help_userTypeName":"","help_facePic":"http://192.168.31.10:8911/resources/boastjewelry/upload/1000001/dhHelp/dad03fff-2196-4d12-921f-b27c61411d3a.jpg","help_bodyPic":"","help_title":"Ssss","help_info":"","ask_channel":"","remark_info":"","help_status":"","help_statusName":"","city_id":"","city_name":"安阳市","a_userId":"","a_userAccount":"","a_userNickName":"","q_status":"","a_status":"","a_docId":"","time_create":"","time_AR":"","time_QA":"","time_QC":"","time_QS":"","time_AS":"","time_ADOC":"","time_AE":"","time_QE":"","time_QOVER":"","time_QTS":"","over_type":"","ts_reason":"","ts_info":"","rated_knowScore":"","rated_serviceScore":"","rated_meetScore":"","rated_info":"","state":""}]}
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
         * entity_id : 2
         * help_userId : 1000001
         * help_userHeadPic : http://192.168.31.110:8911/resources/boastjewelry/upload/1000001/user_head/icon.jpg
         * help_userNickName :
         * help_userIdTitle :
         * help_category :
         * help_categoryName :
         * help_money : 18
         * help_userType :
         * help_userTypeName :
         * help_facePic : http://192.168.31.10:8911/resources/boastjewelry/upload/1000001/dhHelp/dad03fff-2196-4d12-921f-b27c61411d3a.jpg
         * help_bodyPic :
         * help_title : Ssss
         * help_info :
         * ask_channel :
         * remark_info :
         * help_status :
         * help_statusName :
         * city_id :
         * city_name : 安阳市
         * a_userId :
         * a_userAccount :
         * a_userNickName :
         * q_status :
         * a_status :
         * a_docId :
         * time_create :
         * time_AR :
         * time_QA :
         * time_QC :
         * time_QS :
         * time_AS :
         * time_ADOC :
         * time_AE :
         * time_QE :
         * time_QOVER :
         * time_QTS :
         * over_type :
         * ts_reason :
         * ts_info :
         * rated_knowScore :
         * rated_serviceScore :
         * rated_meetScore :
         * rated_info :
         * state :
         */

        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String entity_id;
            private String help_userId;
            private String help_userHeadPic;
            private String help_userNickName;
            private String help_userIdTitle;
            private String help_category;
            private String help_categoryName;
            private String help_money;
            private String help_userType;
            private String help_userTypeName;
            private String help_facePic;
            private String help_bodyPic;
            private String help_title;
            private String help_info;
            private String ask_channel;
            private String remark_info;
            private String help_status;
            private String help_statusName;
            private String city_id;
            private String city_name;
            private String a_userId;
            private String a_userAccount;
            private String a_userNickName;
            private String q_status;
            private String a_status;
            private String a_docId;
            private String time_create;
            private String time_AR;
            private String time_QA;
            private String time_QC;
            private String time_QS;
            private String time_AS;
            private String time_ADOC;
            private String time_AE;
            private String time_QE;
            private String time_QOVER;
            private String time_QTS;
            private String over_type;
            private String ts_reason;
            private String ts_info;
            private String rated_knowScore;
            private String rated_serviceScore;
            private String rated_meetScore;
            private String rated_info;
            private String state;

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

            public String getHelp_userNickName() {
                return help_userNickName;
            }

            public void setHelp_userNickName(String help_userNickName) {
                this.help_userNickName = help_userNickName;
            }

            public String getHelp_userIdTitle() {
                return help_userIdTitle;
            }

            public void setHelp_userIdTitle(String help_userIdTitle) {
                this.help_userIdTitle = help_userIdTitle;
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

            public String getHelp_userType() {
                return help_userType;
            }

            public void setHelp_userType(String help_userType) {
                this.help_userType = help_userType;
            }

            public String getHelp_userTypeName() {
                return help_userTypeName;
            }

            public void setHelp_userTypeName(String help_userTypeName) {
                this.help_userTypeName = help_userTypeName;
            }

            public String getHelp_facePic() {
                return help_facePic;
            }

            public void setHelp_facePic(String help_facePic) {
                this.help_facePic = help_facePic;
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

            public String getCity_id() {
                return city_id;
            }

            public void setCity_id(String city_id) {
                this.city_id = city_id;
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

            public String getA_userAccount() {
                return a_userAccount;
            }

            public void setA_userAccount(String a_userAccount) {
                this.a_userAccount = a_userAccount;
            }

            public String getA_userNickName() {
                return a_userNickName;
            }

            public void setA_userNickName(String a_userNickName) {
                this.a_userNickName = a_userNickName;
            }

            public String getQ_status() {
                return q_status;
            }

            public void setQ_status(String q_status) {
                this.q_status = q_status;
            }

            public String getA_status() {
                return a_status;
            }

            public void setA_status(String a_status) {
                this.a_status = a_status;
            }

            public String getA_docId() {
                return a_docId;
            }

            public void setA_docId(String a_docId) {
                this.a_docId = a_docId;
            }

            public String getTime_create() {
                return time_create;
            }

            public void setTime_create(String time_create) {
                this.time_create = time_create;
            }

            public String getTime_AR() {
                return time_AR;
            }

            public void setTime_AR(String time_AR) {
                this.time_AR = time_AR;
            }

            public String getTime_QA() {
                return time_QA;
            }

            public void setTime_QA(String time_QA) {
                this.time_QA = time_QA;
            }

            public String getTime_QC() {
                return time_QC;
            }

            public void setTime_QC(String time_QC) {
                this.time_QC = time_QC;
            }

            public String getTime_QS() {
                return time_QS;
            }

            public void setTime_QS(String time_QS) {
                this.time_QS = time_QS;
            }

            public String getTime_AS() {
                return time_AS;
            }

            public void setTime_AS(String time_AS) {
                this.time_AS = time_AS;
            }

            public String getTime_ADOC() {
                return time_ADOC;
            }

            public void setTime_ADOC(String time_ADOC) {
                this.time_ADOC = time_ADOC;
            }

            public String getTime_AE() {
                return time_AE;
            }

            public void setTime_AE(String time_AE) {
                this.time_AE = time_AE;
            }

            public String getTime_QE() {
                return time_QE;
            }

            public void setTime_QE(String time_QE) {
                this.time_QE = time_QE;
            }

            public String getTime_QOVER() {
                return time_QOVER;
            }

            public void setTime_QOVER(String time_QOVER) {
                this.time_QOVER = time_QOVER;
            }

            public String getTime_QTS() {
                return time_QTS;
            }

            public void setTime_QTS(String time_QTS) {
                this.time_QTS = time_QTS;
            }

            public String getOver_type() {
                return over_type;
            }

            public void setOver_type(String over_type) {
                this.over_type = over_type;
            }

            public String getTs_reason() {
                return ts_reason;
            }

            public void setTs_reason(String ts_reason) {
                this.ts_reason = ts_reason;
            }

            public String getTs_info() {
                return ts_info;
            }

            public void setTs_info(String ts_info) {
                this.ts_info = ts_info;
            }

            public String getRated_knowScore() {
                return rated_knowScore;
            }

            public void setRated_knowScore(String rated_knowScore) {
                this.rated_knowScore = rated_knowScore;
            }

            public String getRated_serviceScore() {
                return rated_serviceScore;
            }

            public void setRated_serviceScore(String rated_serviceScore) {
                this.rated_serviceScore = rated_serviceScore;
            }

            public String getRated_meetScore() {
                return rated_meetScore;
            }

            public void setRated_meetScore(String rated_meetScore) {
                this.rated_meetScore = rated_meetScore;
            }

            public String getRated_info() {
                return rated_info;
            }

            public void setRated_info(String rated_info) {
                this.rated_info = rated_info;
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
