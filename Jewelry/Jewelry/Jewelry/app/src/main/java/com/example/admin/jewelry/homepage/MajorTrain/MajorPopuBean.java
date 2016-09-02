package com.example.admin.jewelry.homepage.MajorTrain;

import java.util.List;

/**
 * Created by admin on 2016/9/2.
 */
public class MajorPopuBean {


    /**
     * status : 1
     * msg : 获取成功!
     * object : {"dtrainCategory":[{"codes":"","names":"品类"},{"codes":"2","names":"宝玉石"},{"codes":"3","names":"翡翠"},{"codes":"4","names":"琥珀/蜜蜡"},{"codes":"5","names":"钻石"},{"codes":"6","names":"和田玉"},{"codes":"7","names":"其他"}],"dtrainTime":[{"codes":"","names":"时间"},{"codes":"7","names":"7天内"},{"codes":"30","names":"30天内"},{"codes":"182","names":"半年内"},{"codes":"365","names":"近一年"}],"dtrainMechanism":[{"codes":"","names":"机制"},{"codes":"1","names":"机制一"},{"codes":"2","names":"机制二"}],"dtrainCity":[{"codes":"","names":"城市"},{"codes":"36","names":"阿拉善盟"},{"codes":"1","names":"北京市"},{"codes":"2","names":"天津市"}]}
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
         * codes :
         * names : 品类
         */

        private List<DtrainCategoryBean> dtrainCategory;
        /**
         * codes :
         * names : 时间
         */

        private List<DtrainTimeBean> dtrainTime;
        /**
         * codes :
         * names : 机制
         */

        private List<DtrainMechanismBean> dtrainMechanism;
        /**
         * codes :
         * names : 城市
         */

        private List<DtrainCityBean> dtrainCity;

        public List<DtrainCategoryBean> getDtrainCategory() {
            return dtrainCategory;
        }

        public void setDtrainCategory(List<DtrainCategoryBean> dtrainCategory) {
            this.dtrainCategory = dtrainCategory;
        }

        public List<DtrainTimeBean> getDtrainTime() {
            return dtrainTime;
        }

        public void setDtrainTime(List<DtrainTimeBean> dtrainTime) {
            this.dtrainTime = dtrainTime;
        }

        public List<DtrainMechanismBean> getDtrainMechanism() {
            return dtrainMechanism;
        }

        public void setDtrainMechanism(List<DtrainMechanismBean> dtrainMechanism) {
            this.dtrainMechanism = dtrainMechanism;
        }

        public List<DtrainCityBean> getDtrainCity() {
            return dtrainCity;
        }

        public void setDtrainCity(List<DtrainCityBean> dtrainCity) {
            this.dtrainCity = dtrainCity;
        }

        public static class DtrainCategoryBean {
            private String codes;
            private String names;

            public String getCodes() {
                return codes;
            }

            public void setCodes(String codes) {
                this.codes = codes;
            }

            public String getNames() {
                return names;
            }

            public void setNames(String names) {
                this.names = names;
            }
        }

        public static class DtrainTimeBean {
            private String codes;
            private String names;

            public String getCodes() {
                return codes;
            }

            public void setCodes(String codes) {
                this.codes = codes;
            }

            public String getNames() {
                return names;
            }

            public void setNames(String names) {
                this.names = names;
            }
        }

        public static class DtrainMechanismBean {
            private String codes;
            private String names;

            public String getCodes() {
                return codes;
            }

            public void setCodes(String codes) {
                this.codes = codes;
            }

            public String getNames() {
                return names;
            }

            public void setNames(String names) {
                this.names = names;
            }
        }

        public static class DtrainCityBean {
            private String codes;
            private String names;

            public String getCodes() {
                return codes;
            }

            public void setCodes(String codes) {
                this.codes = codes;
            }

            public String getNames() {
                return names;
            }

            public void setNames(String names) {
                this.names = names;
            }
        }
    }
}
