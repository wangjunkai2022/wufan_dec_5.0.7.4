package com.join.mgps.dto;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes4.dex */
public class FoundGameTabBean implements Serializable {
    private TipsInfoBean tips_info;
    private List<TabItemBean> title_info;

    public TipsInfoBean getTips_info() {
        return this.tips_info;
    }

    public List<TabItemBean> getTitle_info() {
        return this.title_info;
    }

    public void setTips_info(TipsInfoBean tipsInfoBean) {
        this.tips_info = tipsInfoBean;
    }

    public void setTitle_info(List<TabItemBean> list) {
        this.title_info = list;
    }
}
