package com.example.admin.jewelry.homepage.integral.bean;

/**
 * Created by JINDAPENG on 2016/8/19.
 */
public class DetailsBean {

    /**
     * status : 1
     * msg : 获取商品详情成功！
     * object : {"info":{"entity_id":"1","category_id":"1","goods_name":"珠宝饰品_商品01","goods_oldPrice":"201","goods_salePrice":"101","goods_stock":"100","goods_saleNum":"0","goods_facePic":"http://192.168.31.110:8911/01.jpg","goods_bodyPic":"http://192.168.31.110:8911/01.jpg,http://192.168.31.110:8911/02.jpg","goods_info":"描述01"}}
     */

    private String status;
    private String msg;
    /**
     * info : {"entity_id":"1","category_id":"1","goods_name":"珠宝饰品_商品01","goods_oldPrice":"201","goods_salePrice":"101","goods_stock":"100","goods_saleNum":"0","goods_facePic":"http://192.168.31.110:8911/01.jpg","goods_bodyPic":"http://192.168.31.110:8911/01.jpg,http://192.168.31.110:8911/02.jpg","goods_info":"描述01"}
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
         * category_id : 1
         * goods_name : 珠宝饰品_商品01
         * goods_oldPrice : 201
         * goods_salePrice : 101
         * goods_stock : 100
         * goods_saleNum : 0
         * goods_facePic : http://192.168.31.110:8911/01.jpg
         * goods_bodyPic : http://192.168.31.110:8911/01.jpg,http://192.168.31.110:8911/02.jpg
         * goods_info : 描述01
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
            private String category_id;
            private String goods_name;
            private String goods_oldPrice;
            private String goods_salePrice;
            private String goods_stock;
            private String goods_saleNum;
            private String goods_facePic;
            private String goods_bodyPic;
            private String goods_info;

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
        }
    }
}
