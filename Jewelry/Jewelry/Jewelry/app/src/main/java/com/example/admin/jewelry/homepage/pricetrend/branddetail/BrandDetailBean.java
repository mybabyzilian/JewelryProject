package com.example.admin.jewelry.homepage.pricetrend.branddetail;

import java.util.List;

/**
 * Created by admin on 2016/8/25.
 */
public class BrandDetailBean {


    /**
     * status : 1
     * msg : 获取成功!
     * object : {"companyInfo":null,"companyProducts":[]}
     */

    private String status;
    private String msg;
    /**
     * companyInfo : null
     * companyProducts : []
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
        private Object companyInfo;
        private List<BrandAllDetailBean> companyProducts;

        public Object getCompanyInfo() {
            return companyInfo;
        }

        public void setCompanyInfo(Object companyInfo) {
            this.companyInfo = companyInfo;
        }

        public List<BrandAllDetailBean> getCompanyProducts() {
            return companyProducts;
        }

        public void setCompanyProducts(List<BrandAllDetailBean> companyProducts) {
            this.companyProducts = companyProducts;
        }

        public static class BrandAllDetailBean{
            private String product_id;
            private String product_category;
            private String product_category_name;
            private String product_price;
            private String product_manual_fee;
            private String product_update_time;
            private String product_company_id;

            public String getProduct_id() {
                return product_id;
            }

            public void setProduct_id(String product_id) {
                this.product_id = product_id;
            }

            public String getProduct_category() {
                return product_category;
            }

            public void setProduct_category(String product_category) {
                this.product_category = product_category;
            }

            public String getProduct_category_name() {
                return product_category_name;
            }

            public void setProduct_category_name(String product_category_name) {
                this.product_category_name = product_category_name;
            }

            public String getProduct_price() {
                return product_price;
            }

            public void setProduct_price(String product_price) {
                this.product_price = product_price;
            }

            public String getProduct_manual_fee() {
                return product_manual_fee;
            }

            public void setProduct_manual_fee(String product_manual_fee) {
                this.product_manual_fee = product_manual_fee;
            }

            public String getProduct_update_time() {
                return product_update_time;
            }

            public void setProduct_update_time(String product_update_time) {
                this.product_update_time = product_update_time;
            }

            public String getProduct_company_id() {
                return product_company_id;
            }

            public void setProduct_company_id(String product_company_id) {
                this.product_company_id = product_company_id;
            }
        }
    }
}
