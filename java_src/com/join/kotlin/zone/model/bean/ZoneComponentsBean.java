package com.join.kotlin.zone.model.bean;

import com.join.mgps.dto.CommonGameInfoBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ZoneComponentsBean.kt */
/* loaded from: classes3.dex */
public final class ZoneComponentsBean {
    @NotNull
    private final List<CommonGameInfoBean> gameInfoList;
    @NotNull
    private final String title;

    public ZoneComponentsBean(@NotNull String title, @NotNull List<CommonGameInfoBean> gameInfoList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(gameInfoList, "gameInfoList");
        this.title = title;
        this.gameInfoList = gameInfoList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneComponentsBean copy$default(ZoneComponentsBean zoneComponentsBean, String str, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = zoneComponentsBean.title;
        }
        if ((i4 & 2) != 0) {
            list = zoneComponentsBean.gameInfoList;
        }
        return zoneComponentsBean.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final List<CommonGameInfoBean> component2() {
        return this.gameInfoList;
    }

    @NotNull
    public final ZoneComponentsBean copy(@NotNull String title, @NotNull List<CommonGameInfoBean> gameInfoList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(gameInfoList, "gameInfoList");
        return new ZoneComponentsBean(title, gameInfoList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneComponentsBean) {
            ZoneComponentsBean zoneComponentsBean = (ZoneComponentsBean) obj;
            return Intrinsics.areEqual(this.title, zoneComponentsBean.title) && Intrinsics.areEqual(this.gameInfoList, zoneComponentsBean.gameInfoList);
        }
        return false;
    }

    @NotNull
    public final List<CommonGameInfoBean> getGameInfoList() {
        return this.gameInfoList;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.gameInfoList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ZoneComponentsBean(title=" + this.title + ", gameInfoList=" + this.gameInfoList + ')';
    }
}
