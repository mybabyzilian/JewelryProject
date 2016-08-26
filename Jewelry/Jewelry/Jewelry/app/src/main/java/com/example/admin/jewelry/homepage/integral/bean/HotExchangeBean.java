package com.example.admin.jewelry.homepage.integral.bean;

import java.util.List;

/**
 * Created by JINDAPENG on 2016/8/18.
 */
public class HotExchangeBean {

    /**
     * status : 1
     * msg : 获取热门兑换商品列表成功！
     * object : {"hotlist":[{"entity_id":"1","category_id":"","goods_name":"珠宝饰品_商品01","goods_oldPrice":"201","goods_salePrice":"10","goods_stock":"96","goods_saleNum":"4","goods_facePic":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/01.jpg","goods_bodyPic":"","goods_info":"","goods_status":"","create_time":"","is_hot":"","hot_time":"","state":""},{"entity_id":"4","category_id":"","goods_name":"珠宝饰品_商品04","goods_oldPrice":"204","goods_salePrice":"40","goods_stock":"400","goods_saleNum":"0","goods_facePic":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/04.jpg","goods_bodyPic":"","goods_info":"","goods_status":"","create_time":"","is_hot":"","hot_time":"","state":""},{"entity_id":"6","category_id":"","goods_name":"相关配品_商品02","goods_oldPrice":"206","goods_salePrice":"60","goods_stock":"600","goods_saleNum":"0","goods_facePic":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/04.jpg","goods_bodyPic":"","goods_info":"","goods_status":"","create_time":"","is_hot":"","hot_time":"","state":""},{"entity_id":"7","category_id":"","goods_name":"相关配品_商品03","goods_oldPrice":"207","goods_salePrice":"70","goods_stock":"700","goods_saleNum":"0","goods_facePic":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/04.jpg","goods_bodyPic":"","goods_info":"","goods_status":"","create_time":"","is_hot":"","hot_time":"","state":""},{"entity_id":"9","category_id":"","goods_name":"专业刊物_商品02","goods_oldPrice":"209","goods_salePrice":"90","goods_stock":"900","goods_saleNum":"0","goods_facePic":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/06.jpg","goods_bodyPic":"","goods_info":"","goods_status":"","create_time":"","is_hot":"","hot_time":"","state":""},{"entity_id":"11","category_id":"","goods_name":"专业刊物_商品04","goods_oldPrice":"211","goods_salePrice":"200","goods_stock":"1100","goods_saleNum":"0","goods_facePic":"http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/05.jpg","goods_bodyPic":"","goods_info":"","goods_status":"","create_time":"","is_hot":"","hot_time":"","state":""}]}
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
         * category_id :
         * goods_name : 珠宝饰品_商品01
         * goods_oldPrice : 201
         * goods_salePrice : 10
         * goods_stock : 96
         * goods_saleNum : 4
         * goods_facePic : http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/01.jpg
         * goods_bodyPic :
         * goods_info :
         * goods_status :
         * create_time :
         * is_hot :
         * hot_time :
         * state :
         */

        private List<HotlistBean> hotlist;

        public List<HotlistBean> getHotlist() {
            return hotlist;
        }

        public void setHotlist(List<HotlistBean> hotlist) {
            this.hotlist = hotlist;
        }

        public static class HotlistBean {
            private String entity_id;
            private String category_id;
            private String goods_name;
            private String goods_oldPrice;
            private String goods_salePrice;
            private String goods_stock;
            private String goods_saleNum;
            private String goods_facePic;
            private String goods_bodyPic;
            private String goods_info;
            private String goods_status;
            private String create_time;
            private String is_hot;
            private String hot_time;
            private String state;

            public String getEntity_id() {
                return entity_id;
            }

            public void setEntity_id(String entity_id) {
                this.entity_id = entity_id;
            }

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
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

            public String getGoods_stock() {
                return goods_stock;
            }

            public void setGoods_stock(String goods_stock) {
                this.goods_stock = goods_stock;
            }

            public String getGoods_saleNum() {
                return goods_saleNum;
            }

            public void setGoods_saleNum(String goods_saleNum) {
                this.goods_saleNum = goods_saleNum;
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

            public String getGoods_status() {
                return goods_status;
            }

            public void setGoods_status(String goods_status) {
                this.goods_status = goods_status;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getIs_hot() {
                return is_hot;
            }

            public void setIs_hot(String is_hot) {
                this.is_hot = is_hot;
            }

            public String getHot_time() {
                return hot_time;
            }

            public void setHot_time(String hot_time) {
                this.hot_time = hot_time;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }
        }
    }

    @Override
    public String toString() {
        return "HotExchangeBean{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
