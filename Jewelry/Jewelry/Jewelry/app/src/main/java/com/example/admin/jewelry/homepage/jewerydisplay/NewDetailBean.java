package com.example.admin.jewelry.homepage.jewerydisplay;

/**
 * Created by admin on 2016/8/29.
 */
public class NewDetailBean  {

    /**
     * status : 1
     * msg : 获取新品商品详情成功！
     * object : {"info":{"entity_id":"1","user_id":"1000001","userAccount":"15662170855","userIdentity":"2","userHeadPic":"http://192.168.31.110:8911/resources/boastjewelry/upload/1000001/user_head/icon.jpg","userNickName":"中国联通","userIdTitle":"战争之王","userCompanyName":"周大福","userCompanyAddress":"红旗街万达广场","category_id":"1","category_name":"玉石","style_id":"8","style_name":"","goods_name":"藏品转让_类别1_款式1_新品商品01","goods_oldPrice":"101","goods_salePrice":"100","goods_facePic":"http://192.168.31.110:8911/resources/boastjewelry/upload/1000005/objectGoods/new/new01.jpg","goods_bodyPic":"http://192.168.31.110:8911/resources/boastjewelry/upload/1000005/objectGoods/new/new01.jpg,http://192.168.31.110:8911/resources/boastjewelry/upload/1000005/objectGoods/new/new02.jpg","goods_info":"内容详情01","shop_href":"","create_time":"2016-08-01 12:34:45","is_collect":"","goods_status":"DOWN","goods_statusName":"","have_book":"N","fail_info":"","state":"1","shareLink":""}}
     */

    private String status;
    private String msg;
    /**
     * info : {"entity_id":"1","user_id":"1000001","userAccount":"15662170855","userIdentity":"2","userHeadPic":"http://192.168.31.110:8911/resources/boastjewelry/upload/1000001/user_head/icon.jpg","userNickName":"中国联通","userIdTitle":"战争之王","userCompanyName":"周大福","userCompanyAddress":"红旗街万达广场","category_id":"1","category_name":"玉石","style_id":"8","style_name":"","goods_name":"藏品转让_类别1_款式1_新品商品01","goods_oldPrice":"101","goods_salePrice":"100","goods_facePic":"http://192.168.31.110:8911/resources/boastjewelry/upload/1000005/objectGoods/new/new01.jpg","goods_bodyPic":"http://192.168.31.110:8911/resources/boastjewelry/upload/1000005/objectGoods/new/new01.jpg,http://192.168.31.110:8911/resources/boastjewelry/upload/1000005/objectGoods/new/new02.jpg","goods_info":"内容详情01","shop_href":"","create_time":"2016-08-01 12:34:45","is_collect":"","goods_status":"DOWN","goods_statusName":"","have_book":"N","fail_info":"","state":"1","shareLink":""}
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
        /**
         * entity_id : 1
         * user_id : 1000001
         * userAccount : 15662170855
         * userIdentity : 2
         * userHeadPic : http://192.168.31.110:8911/resources/boastjewelry/upload/1000001/user_head/icon.jpg
         * userNickName : 中国联通
         * userIdTitle : 战争之王
         * userCompanyName : 周大福
         * userCompanyAddress : 红旗街万达广场
         * category_id : 1
         * category_name : 玉石
         * style_id : 8
         * style_name :
         * goods_name : 藏品转让_类别1_款式1_新品商品01
         * goods_oldPrice : 101
         * goods_salePrice : 100
         * goods_facePic : http://192.168.31.110:8911/resources/boastjewelry/upload/1000005/objectGoods/new/new01.jpg
         * goods_bodyPic : http://192.168.31.110:8911/resources/boastjewelry/upload/1000005/objectGoods/new/new01.jpg,http://192.168.31.110:8911/resources/boastjewelry/upload/1000005/objectGoods/new/new02.jpg
         * goods_info : 内容详情01
         * shop_href :
         * create_time : 2016-08-01 12:34:45
         * is_collect :
         * goods_status : DOWN
         * goods_statusName :
         * have_book : N
         * fail_info :
         * state : 1
         * shareLink :
         */

        private InfoBean info;

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public static class InfoBean {
            private String entity_id;
            private String user_id;
            private String userAccount;
            private String userIdentity;
            private String userHeadPic;
            private String userNickName;
            private String userIdTitle;
            private String userCompanyName;
            private String userCompanyAddress;
            private String category_id;
            private String category_name;
            private String style_id;
            private String style_name;
            private String goods_name;
            private String goods_oldPrice;
            private String goods_salePrice;
            private String goods_facePic;
            private String goods_bodyPic;
            private String goods_info;
            private String shop_href;
            private String create_time;
            private String is_collect;
            private String goods_status;
            private String goods_statusName;
            private String have_book;
            private String fail_info;
            private String state;
            private String shareLink;

            public String getEntity_id() {
                return entity_id;
            }

            public void setEntity_id(String entity_id) {
                this.entity_id = entity_id;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getUserAccount() {
                return userAccount;
            }

            public void setUserAccount(String userAccount) {
                this.userAccount = userAccount;
            }

            public String getUserIdentity() {
                return userIdentity;
            }

            public void setUserIdentity(String userIdentity) {
                this.userIdentity = userIdentity;
            }

            public String getUserHeadPic() {
                return userHeadPic;
            }

            public void setUserHeadPic(String userHeadPic) {
                this.userHeadPic = userHeadPic;
            }

            public String getUserNickName() {
                return userNickName;
            }

            public void setUserNickName(String userNickName) {
                this.userNickName = userNickName;
            }

            public String getUserIdTitle() {
                return userIdTitle;
            }

            public void setUserIdTitle(String userIdTitle) {
                this.userIdTitle = userIdTitle;
            }

            public String getUserCompanyName() {
                return userCompanyName;
            }

            public void setUserCompanyName(String userCompanyName) {
                this.userCompanyName = userCompanyName;
            }

            public String getUserCompanyAddress() {
                return userCompanyAddress;
            }

            public void setUserCompanyAddress(String userCompanyAddress) {
                this.userCompanyAddress = userCompanyAddress;
            }

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getStyle_id() {
                return style_id;
            }

            public void setStyle_id(String style_id) {
                this.style_id = style_id;
            }

            public String getStyle_name() {
                return style_name;
            }

            public void setStyle_name(String style_name) {
                this.style_name = style_name;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getGoods_oldPrice() {
                return goods_oldPrice;
            }

            public void setGoods_oldPrice(String goods_oldPrice) {
                this.goods_oldPrice = goods_oldPrice;
            }

            public String getGoods_salePrice() {
                return goods_salePrice;
            }

            public void setGoods_salePrice(String goods_salePrice) {
                this.goods_salePrice = goods_salePrice;
            }

            public String getGoods_facePic() {
                return goods_facePic;
            }

            public void setGoods_facePic(String goods_facePic) {
                this.goods_facePic = goods_facePic;
            }

            public String getGoods_bodyPic() {
                return goods_bodyPic;
            }

            public void setGoods_bodyPic(String goods_bodyPic) {
                this.goods_bodyPic = goods_bodyPic;
            }

            public String getGoods_info() {
                return goods_info;
            }

            public void setGoods_info(String goods_info) {
                this.goods_info = goods_info;
            }

            public String getShop_href() {
                return shop_href;
            }

            public void setShop_href(String shop_href) {
                this.shop_href = shop_href;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getIs_collect() {
                return is_collect;
            }

            public void setIs_collect(String is_collect) {
                this.is_collect = is_collect;
            }

            public String getGoods_status() {
                return goods_status;
            }

            public void setGoods_status(String goods_status) {
                this.goods_status = goods_status;
            }

            public String getGoods_statusName() {
                return goods_statusName;
            }

            public void setGoods_statusName(String goods_statusName) {
                this.goods_statusName = goods_statusName;
            }

            public String getHave_book() {
                return have_book;
            }

            public void setHave_book(String have_book) {
                this.have_book = have_book;
            }

            public String getFail_info() {
                return fail_info;
            }

            public void setFail_info(String fail_info) {
                this.fail_info = fail_info;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getShareLink() {
                return shareLink;
            }

            public void setShareLink(String shareLink) {
                this.shareLink = shareLink;
            }
        }
    }
}
