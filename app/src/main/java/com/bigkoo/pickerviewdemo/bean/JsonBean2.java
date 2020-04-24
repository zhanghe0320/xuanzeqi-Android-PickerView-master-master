package com.bigkoo.pickerviewdemo.bean;


import com.contrarywind.interfaces.IPickerViewData;

import java.util.List;

/**
 * TODO<json数据源>
 *
 */

public class JsonBean2 implements IPickerViewData {


    /**
     * name : 省份
     * city : [{"name":"北京市","area":["东城区","西城区","崇文区","宣武区","朝阳区"]}]
     */

    private String name;
    private String code;
    private List<CityBean> childs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<CityBean> getChilds() {
        return childs;
    }

    public void setChilds(List<CityBean> childs) {
        this.childs = childs;
    }

    // 实现 IPickerViewData 接口，
    // 这个用来显示在PickerView上面的字符串，
    // PickerView会通过IPickerViewData获取getPickerViewText方法显示出来。
    @Override
    public String getPickerViewText() {
        return this.name;
    }


    public static class CityBean {
        /**
         * name : 城市
         * code:1111
         * childs : [{},{},"崇文区","昌平区"]
         */

        private String name;
        private String code;
        private List<Childs> childs;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public List<Childs> getChilds() {
            return childs;
        }

        public void setChilds(List<Childs> childs) {
            this.childs = childs;
        }



        public static class Childs {//区域数据
            /**
             * name : 雨花台区
             * code : 11111
             */

            private String name;
            private String code;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }


        }
    }
}
