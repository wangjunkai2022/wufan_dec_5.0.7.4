package com.join.kotlin.discount.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u1.b;
/* compiled from: GameDetailBannerEntityBean.kt */
/* loaded from: classes3.dex */
public final class GameDetailBannerEntityBean implements b {
    @Nullable
    private Object data;
    private int viewType;

    public GameDetailBannerEntityBean(int i4, @Nullable Object obj) {
        this.viewType = i4;
        this.data = obj;
    }

    public static /* synthetic */ GameDetailBannerEntityBean copy$default(GameDetailBannerEntityBean gameDetailBannerEntityBean, int i4, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            i4 = gameDetailBannerEntityBean.viewType;
        }
        if ((i5 & 2) != 0) {
            obj = gameDetailBannerEntityBean.data;
        }
        return gameDetailBannerEntityBean.copy(i4, obj);
    }

    public final int component1() {
        return this.viewType;
    }

    @Nullable
    public final Object component2() {
        return this.data;
    }

    @NotNull
    public final GameDetailBannerEntityBean copy(int i4, @Nullable Object obj) {
        return new GameDetailBannerEntityBean(i4, obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailBannerEntityBean) {
            GameDetailBannerEntityBean gameDetailBannerEntityBean = (GameDetailBannerEntityBean) obj;
            return this.viewType == gameDetailBannerEntityBean.viewType && Intrinsics.areEqual(this.data, gameDetailBannerEntityBean.data);
        }
        return false;
    }

    @Nullable
    public final Object getData() {
        return this.data;
    }

    @Override // u1.b
    public int getItemType() {
        return this.viewType;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int i4 = this.viewType * 31;
        Object obj = this.data;
        return i4 + (obj == null ? 0 : obj.hashCode());
    }

    public final void setData(@Nullable Object obj) {
        this.data = obj;
    }

    public final void setViewType(int i4) {
        this.viewType = i4;
    }

    @NotNull
    public String toString() {
        return "GameDetailBannerEntityBean(viewType=" + this.viewType + ", data=" + this.data + ')';
    }
}
