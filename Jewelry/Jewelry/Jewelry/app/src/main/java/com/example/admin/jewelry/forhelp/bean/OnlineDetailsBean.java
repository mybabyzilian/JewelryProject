package com.example.admin.jewelry.forhelp.bean;

/**
 * Created by JINDAPENG on 2016/8/23.
 *
 */
public class OnlineDetailsBean{


    /**
     * status : 1
     * msg : 获取求助鉴品详情成功！
     * object : {"helpCount":"10","payCount":"1","info":{"entity_id":"1","help_userId":"1000005","help_userHeadPic":"http://www.baidu.com/abc.jpg","help_category":"1","help_type":"MONEY","help_money":"100","help_userType":"1","help_bodyPic":"http://1.jpg,http://2.jpg,http://3.jpg","help_title":"大话求助线上求助01","help_info":"","goods_name":"物品01","goods_size":"尺寸01","goods_weight":"重量01","attach_data":"附加材料01","get_datetime":"2016-08-02 01:12:34","get_area":"","get_price":"1","book_pic":"","ask_channel":"","remark_info":"","upA_ok":"1","create_time":""}}
     */

    private String status;
    private String msg;
    /**
     * helpCount : 10
     * payCount : 1
     * info : {"entity_id":"1","help_userId":"1000005","help_userHeadPic":"http://www.baidu.com/abc.jpg","help_category":"1","help_type":"MONEY","help_money":"100","help_userType":"1","help_bodyPic":"http://1.jpg,http://2.jpg,http://3.jpg","help_title":"大话求助线上求助01","help_info":"","goods_name":"物品01","goods_size":"尺寸01","goods_weight":"重量01","attach_data":"附加材料01","get_datetime":"2016-08-02 01:12:34","get_area":"","get_price":"1","book_pic":"","ask_channel":"","remark_info":"","upA_ok":"1","create_time":""}
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
         * entity_id : 1
         * help_userId : 1000005
         * help_userHeadPic : http://www.baidu.com/abc.jpg
         * help_category : 1
         * help_type : MONEY
         * help_money : 100
         * help_userType : 1
         * help_bodyPic : http://1.jpg,http://2.jpg,http://3.jpg
         * help_title : 大话求助线上求助01
         * help_info :
         * goods_name : 物品01
         * goods_size : 尺寸01
         * goods_weight : 重量01
         * attach_data : 附加材料01
         * get_datetime : 2016-08-02 01:12:34
         * get_area :
         * get_price : 1
         * book_pic :
         * ask_channel :
         * remark_info :
         * upA_ok : 1
         * create_time :
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
            private String help_type;
            private String help_money;
            private String help_userType;
            private String help_bodyPic;
            private String help_title;
            private String help_info;
            private String goods_name;
            private String goods_size;
            private String goods_weight;
            private String attach_data;
            private String get_datetime;
            private String get_area;
            private String get_price;
            private String book_pic;
            private String ask_channel;
            private String remark_info;
            private String upA_ok;
            private String create_time;

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

            public String getHelp_type() {
                return help_type;
            }

            public void setHelp_type(String help_type) {
                this.help_type = help_type;
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

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getGoods_size() {
                return goods_size;
            }

            public void setGoods_size(String goods_size) {
                this.goods_size = goods_size;
            }

            public String getGoods_weight() {
                return goods_weight;
            }

            public void setGoods_weight(String goods_weight) {
                this.goods_weight = goods_weight;
            }

            public String getAttach_data() {
                return attach_data;
            }

            public void setAttach_data(String attach_data) {
                this.attach_data = attach_data;
            }

            public String getGet_datetime() {
                return get_datetime;
            }

            public void setGet_datetime(String get_datetime) {
                this.get_datetime = get_datetime;
            }

            public String getGet_area() {
                return get_area;
            }

            public void setGet_area(String get_area) {
                this.get_area = get_area;
            }

            public String getGet_price() {
                return get_price;
            }

            public void setGet_price(String get_price) {
                this.get_price = get_price;
            }

            public String getBook_pic() {
                return book_pic;
            }

            public void setBook_pic(String book_pic) {
                this.book_pic = book_pic;
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

            public String getUpA_ok() {
                return upA_ok;
            }

            public void setUpA_ok(String upA_ok) {
                this.upA_ok = upA_ok;
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
