package com.join.kotlin.quark.model.bean;

import com.join.mgps.dto.CommonGameInfoBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceTabListBean.kt */
/* loaded from: classes3.dex */
public final class SourceTabListBean {
    @Nullable
    private final List<CommonGameInfoBean> banner;
    @Nullable
    private final ArrayList<SourceTabItemBean> tabs;

    /* JADX WARN: Multi-variable type inference failed */
    public SourceTabListBean(@Nullable ArrayList<SourceTabItemBean> arrayList, @Nullable List<? extends CommonGameInfoBean> list) {
        this.tabs = arrayList;
        this.banner = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SourceTabListBean copy$default(SourceTabListBean sourceTabListBean, ArrayList arrayList, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            arrayList = sourceTabListBean.tabs;
        }
        if ((i4 & 2) != 0) {
            list = sourceTabListBean.banner;
        }
        return sourceTabListBean.copy(arrayList, list);
    }

    @Nullable
    public final ArrayList<SourceTabItemBean> component1() {
        return this.tabs;
    }

    @Nullable
    public final List<CommonGameInfoBean> component2() {
        return this.banner;
    }

    @NotNull
    public final SourceTabListBean copy(@Nullable ArrayList<SourceTabItemBean> arrayList, @Nullable List<? extends CommonGameInfoBean> list) {
        return new SourceTabListBean(arrayList, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceTabListBean) {
            SourceTabListBean sourceTabListBean = (SourceTabListBean) obj;
            return Intrinsics.areEqual(this.tabs, sourceTabListBean.tabs) && Intrinsics.areEqual(this.banner, sourceTabListBean.banner);
        }
        return false;
    }

    @Nullable
    public final List<CommonGameInfoBean> getBanner() {
        return this.banner;
    }

    @Nullable
    public final ArrayList<SourceTabItemBean> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        ArrayList<SourceTabItemBean> arrayList = this.tabs;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        List<CommonGameInfoBean> list = this.banner;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SourceTabListBean(tabs=" + this.tabs + ", banner=" + this.banner + ')';
    }
}
