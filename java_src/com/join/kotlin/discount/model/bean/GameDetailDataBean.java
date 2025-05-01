package com.join.kotlin.discount.model.bean;

import com.join.mgps.dto.GamedetialModleFourBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailDataBean.kt */
/* loaded from: classes3.dex */
public final class GameDetailDataBean {
    @Nullable
    private GameDetailBean discount_data;
    @Nullable
    private GamedetialModleFourBean wf_data;

    public GameDetailDataBean() {
        this(null, null, 3, null);
    }

    public GameDetailDataBean(@Nullable GameDetailBean gameDetailBean, @Nullable GamedetialModleFourBean gamedetialModleFourBean) {
        this.discount_data = gameDetailBean;
        this.wf_data = gamedetialModleFourBean;
    }

    public static /* synthetic */ GameDetailDataBean copy$default(GameDetailDataBean gameDetailDataBean, GameDetailBean gameDetailBean, GamedetialModleFourBean gamedetialModleFourBean, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gameDetailBean = gameDetailDataBean.discount_data;
        }
        if ((i4 & 2) != 0) {
            gamedetialModleFourBean = gameDetailDataBean.wf_data;
        }
        return gameDetailDataBean.copy(gameDetailBean, gamedetialModleFourBean);
    }

    @Nullable
    public final GameDetailBean component1() {
        return this.discount_data;
    }

    @Nullable
    public final GamedetialModleFourBean component2() {
        return this.wf_data;
    }

    @NotNull
    public final GameDetailDataBean copy(@Nullable GameDetailBean gameDetailBean, @Nullable GamedetialModleFourBean gamedetialModleFourBean) {
        return new GameDetailDataBean(gameDetailBean, gamedetialModleFourBean);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailDataBean) {
            GameDetailDataBean gameDetailDataBean = (GameDetailDataBean) obj;
            return Intrinsics.areEqual(this.discount_data, gameDetailDataBean.discount_data) && Intrinsics.areEqual(this.wf_data, gameDetailDataBean.wf_data);
        }
        return false;
    }

    @Nullable
    public final GameDetailBean getDiscount_data() {
        return this.discount_data;
    }

    @Nullable
    public final GamedetialModleFourBean getWf_data() {
        return this.wf_data;
    }

    public int hashCode() {
        GameDetailBean gameDetailBean = this.discount_data;
        int hashCode = (gameDetailBean == null ? 0 : gameDetailBean.hashCode()) * 31;
        GamedetialModleFourBean gamedetialModleFourBean = this.wf_data;
        return hashCode + (gamedetialModleFourBean != null ? gamedetialModleFourBean.hashCode() : 0);
    }

    public final void setDiscount_data(@Nullable GameDetailBean gameDetailBean) {
        this.discount_data = gameDetailBean;
    }

    public final void setWf_data(@Nullable GamedetialModleFourBean gamedetialModleFourBean) {
        this.wf_data = gamedetialModleFourBean;
    }

    @NotNull
    public String toString() {
        return "GameDetailDataBean(discount_data=" + this.discount_data + ", wf_data=" + this.wf_data + ')';
    }

    public /* synthetic */ GameDetailDataBean(GameDetailBean gameDetailBean, GamedetialModleFourBean gamedetialModleFourBean, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : gameDetailBean, (i4 & 2) != 0 ? null : gamedetialModleFourBean);
    }
}
