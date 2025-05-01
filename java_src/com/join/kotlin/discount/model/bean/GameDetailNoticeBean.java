package com.join.kotlin.discount.model.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailNoticeBean.kt */
/* loaded from: classes3.dex */
public final class GameDetailNoticeBean {
    @Nullable
    private final String activeNoticeCount;
    @Nullable
    private final List<GameDetailNoticeItemBean> activeNoticeList;
    @Nullable
    private final Boolean hasMore;
    @Nullable
    private final String jumpListUrl;

    public GameDetailNoticeBean() {
        this(null, null, null, null, 15, null);
    }

    public GameDetailNoticeBean(@Nullable Boolean bool, @Nullable String str, @Nullable List<GameDetailNoticeItemBean> list, @Nullable String str2) {
        this.hasMore = bool;
        this.jumpListUrl = str;
        this.activeNoticeList = list;
        this.activeNoticeCount = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameDetailNoticeBean copy$default(GameDetailNoticeBean gameDetailNoticeBean, Boolean bool, String str, List list, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bool = gameDetailNoticeBean.hasMore;
        }
        if ((i4 & 2) != 0) {
            str = gameDetailNoticeBean.jumpListUrl;
        }
        if ((i4 & 4) != 0) {
            list = gameDetailNoticeBean.activeNoticeList;
        }
        if ((i4 & 8) != 0) {
            str2 = gameDetailNoticeBean.activeNoticeCount;
        }
        return gameDetailNoticeBean.copy(bool, str, list, str2);
    }

    @Nullable
    public final Boolean component1() {
        return this.hasMore;
    }

    @Nullable
    public final String component2() {
        return this.jumpListUrl;
    }

    @Nullable
    public final List<GameDetailNoticeItemBean> component3() {
        return this.activeNoticeList;
    }

    @Nullable
    public final String component4() {
        return this.activeNoticeCount;
    }

    @NotNull
    public final GameDetailNoticeBean copy(@Nullable Boolean bool, @Nullable String str, @Nullable List<GameDetailNoticeItemBean> list, @Nullable String str2) {
        return new GameDetailNoticeBean(bool, str, list, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailNoticeBean) {
            GameDetailNoticeBean gameDetailNoticeBean = (GameDetailNoticeBean) obj;
            return Intrinsics.areEqual(this.hasMore, gameDetailNoticeBean.hasMore) && Intrinsics.areEqual(this.jumpListUrl, gameDetailNoticeBean.jumpListUrl) && Intrinsics.areEqual(this.activeNoticeList, gameDetailNoticeBean.activeNoticeList) && Intrinsics.areEqual(this.activeNoticeCount, gameDetailNoticeBean.activeNoticeCount);
        }
        return false;
    }

    @Nullable
    public final String getActiveNoticeCount() {
        return this.activeNoticeCount;
    }

    @Nullable
    public final List<GameDetailNoticeItemBean> getActiveNoticeList() {
        return this.activeNoticeList;
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final String getJumpListUrl() {
        return this.jumpListUrl;
    }

    public int hashCode() {
        Boolean bool = this.hasMore;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.jumpListUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<GameDetailNoticeItemBean> list = this.activeNoticeList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.activeNoticeCount;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GameDetailNoticeBean(hasMore=" + this.hasMore + ", jumpListUrl=" + this.jumpListUrl + ", activeNoticeList=" + this.activeNoticeList + ", activeNoticeCount=" + this.activeNoticeCount + ')';
    }

    public /* synthetic */ GameDetailNoticeBean(Boolean bool, String str, List list, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? Boolean.FALSE : bool, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? null : list, (i4 & 8) != 0 ? "0" : str2);
    }
}
