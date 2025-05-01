package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class HomeDynamicListBean {
    private List<CommonGameInfoBean> bottom;
    private int dynamic_module_tpl_type;
    private List<CommonGameInfoBean> middle;
    private List<CommonGameInfoBean> top;

    public List<CommonGameInfoBean> getBottom() {
        return this.bottom;
    }

    public int getDynamic_module_tpl_type() {
        return this.dynamic_module_tpl_type;
    }

    public List<CommonGameInfoBean> getMiddle() {
        return this.middle;
    }

    public List<CommonGameInfoBean> getTop() {
        return this.top;
    }

    public void setBottom(List<CommonGameInfoBean> list) {
        this.bottom = list;
    }

    public void setDynamic_module_tpl_type(int i4) {
        this.dynamic_module_tpl_type = i4;
    }

    public void setMiddle(List<CommonGameInfoBean> list) {
        this.middle = list;
    }

    public void setTop(List<CommonGameInfoBean> list) {
        this.top = list;
    }
}
