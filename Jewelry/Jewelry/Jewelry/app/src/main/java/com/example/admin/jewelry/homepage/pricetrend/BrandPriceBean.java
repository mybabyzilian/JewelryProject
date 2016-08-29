package com.example.admin.jewelry.homepage.pricetrend;

import java.util.List;

/**
 * Created by admin on 2016/8/24.
 */
public class BrandPriceBean {

    /**
     * status : 1
     * msg : 鑾峰彇鎴愬姛!
     * object : []
     */

    private String status;
    private String msg;
    private List<BrandDetailBean> object;

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

    public List<BrandDetailBean> getObject() {
        return object;
    }

    public void setObject(List<BrandDetailBean> object) {
        this.object = object;
    }
    public static class BrandDetailBean{
        private String product_id;
        private String product_category;
        private String product_price;
        private String product_manual_fee;
        private String product_update_time;
        private String product_company_id;
        private String category_name;
        private String company_name;
        private String company_logo;
        private String num;

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

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public String getCompany_name() {
            return company_name;
        }

        public void setCompany_name(String company_name) {
            this.company_name = company_name;
        }

        public String getCompany_logo() {
            return company_logo;
        }

        public void setCompany_logo(String company_logo) {
            this.company_logo = company_logo;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }
    }
}
