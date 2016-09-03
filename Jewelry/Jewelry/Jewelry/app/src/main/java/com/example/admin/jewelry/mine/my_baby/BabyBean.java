package com.example.admin.jewelry.mine.my_baby;

import java.util.List;

/**
 * Created by JINDAPENG on 2016/8/31.
 */
public class BabyBean {

    /**
     * status : 1
     * msg : 获取个人中心新品商品列表成功！
     * object : {"qType":"new","list":[{"entity_id":"4","goods_name":"藏品转让_类别2_款式4_新品商品01","goods_salePrice":"400","goods_facePic":"http://a/new02.jpg","create_time":"2016-08-04 12:34:45","goods_status":"UP","goods_statusName":"上架","shareLink":"http://192.168.31.110:8080/boastJewelry/views/objectGoods/info.jsp?eid=4&type=new"}]}
     */

    private String status;
    private String msg;
    /**
     * qType : new
     * list : [{"entity_id":"4","goods_name":"藏品转让_类别2_款式4_新品商品01","goods_salePrice":"400","goods_facePic":"http://a/new02.jpg","create_time":"2016-08-04 12:34:45","goods_status":"UP","goods_statusName":"上架","shareLink":"http://192.168.31.110:8080/boastJewelry/views/objectGoods/info.jsp?eid=4&type=new"}]
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
        private String qType;
        /**
         * entity_id : 4
         * goods_name : 藏品转让_类别2_款式4_新品商品01
         * goods_salePrice : 400
         * goods_facePic : http://a/new02.jpg
         * create_time : 2016-08-04 12:34:45
         * goods_status : UP
         * goods_statusName : 上架
         * shareLink : http://192.168.31.110:8080/boastJewelry/views/objectGoods/info.jsp?eid=4&type=new
         */

        private List<ListBean> list;

        public String getQType() {
            return qType;
        }

        public void setQType(String qType) {
            this.qType = qType;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String entity_id;
            private String goods_name;
            private String goods_salePrice;
            private String goods_facePic;
            private String create_time;
            private String goods_status;
            private String goods_statusName;
            private String shareLink;

            public String getEntity_id() {
                return entity_id;
            }

            public void setEntity_id(String entity_id) {
                this.entity_id = entity_id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
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

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
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

            public String getShareLink() {
                return shareLink;
            }

            public void setShareLink(String shareLink) {
                this.shareLink = shareLink;
            }
        }
    }
}
