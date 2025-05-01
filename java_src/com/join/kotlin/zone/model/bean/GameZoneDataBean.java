package com.join.kotlin.zone.model.bean;

import com.join.mgps.dto.CommonGameInfoBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameZoneDataBean.kt */
/* loaded from: classes3.dex */
public final class GameZoneDataBean {
    @Nullable
    private final List<ZoneComponentsBean> components;
    @Nullable
    private final CommonGameInfoBean headAdInfo;
    @Nullable
    private final CommonGameInfoBean recGameInfo;
    @Nullable
    private final String title;

    public GameZoneDataBean(@Nullable String str, @Nullable CommonGameInfoBean commonGameInfoBean, @Nullable CommonGameInfoBean commonGameInfoBean2, @Nullable List<ZoneComponentsBean> list) {
        this.title = str;
        this.headAdInfo = commonGameInfoBean;
        this.recGameInfo = commonGameInfoBean2;
        this.components = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameZoneDataBean copy$default(GameZoneDataBean gameZoneDataBean, String str, CommonGameInfoBean commonGameInfoBean, CommonGameInfoBean commonGameInfoBean2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = gameZoneDataBean.title;
        }
        if ((i4 & 2) != 0) {
            commonGameInfoBean = gameZoneDataBean.headAdInfo;
        }
        if ((i4 & 4) != 0) {
            commonGameInfoBean2 = gameZoneDataBean.recGameInfo;
        }
        if ((i4 & 8) != 0) {
            list = gameZoneDataBean.components;
        }
        return gameZoneDataBean.copy(str, commonGameInfoBean, commonGameInfoBean2, list);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final CommonGameInfoBean component2() {
        return this.headAdInfo;
    }

    @Nullable
    public final CommonGameInfoBean component3() {
        return this.recGameInfo;
    }

    @Nullable
    public final List<ZoneComponentsBean> component4() {
        return this.components;
    }

    @NotNull
    public final GameZoneDataBean copy(@Nullable String str, @Nullable CommonGameInfoBean commonGameInfoBean, @Nullable CommonGameInfoBean commonGameInfoBean2, @Nullable List<ZoneComponentsBean> list) {
        return new GameZoneDataBean(str, commonGameInfoBean, commonGameInfoBean2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameZoneDataBean) {
            GameZoneDataBean gameZoneDataBean = (GameZoneDataBean) obj;
            return Intrinsics.areEqual(this.title, gameZoneDataBean.title) && Intrinsics.areEqual(this.headAdInfo, gameZoneDataBean.headAdInfo) && Intrinsics.areEqual(this.recGameInfo, gameZoneDataBean.recGameInfo) && Intrinsics.areEqual(this.components, gameZoneDataBean.components);
        }
        return false;
    }

    @Nullable
    public final List<ZoneComponentsBean> getComponents() {
        return this.components;
    }

    @Nullable
    public final CommonGameInfoBean getHeadAdInfo() {
        return this.headAdInfo;
    }

    @Nullable
    public final CommonGameInfoBean getRecGameInfo() {
        return this.recGameInfo;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CommonGameInfoBean commonGameInfoBean = this.headAdInfo;
        int hashCode2 = (hashCode + (commonGameInfoBean == null ? 0 : commonGameInfoBean.hashCode())) * 31;
        CommonGameInfoBean commonGameInfoBean2 = this.recGameInfo;
        int hashCode3 = (hashCode2 + (commonGameInfoBean2 == null ? 0 : commonGameInfoBean2.hashCode())) * 31;
        List<ZoneComponentsBean> list = this.components;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GameZoneDataBean(title=" + this.title + ", headAdInfo=" + this.headAdInfo + ", recGameInfo=" + this.recGameInfo + ", components=" + this.components + ')';
    }
}
