package com.join.kotlin.discount.model.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailSubAccountBean.kt */
/* loaded from: classes3.dex */
public final class GameDetailSubAccountBean {
    @Nullable
    private String amount;
    @Nullable
    private String gameServer;
    @Nullable
    private String gameTotal;
    @Nullable
    private final String id;
    @Nullable
    private final List<String> images;
    @Nullable
    private final String title;

    public GameDetailSubAccountBean() {
        this(null, null, null, null, null, null, 63, null);
    }

    public GameDetailSubAccountBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<String> list) {
        this.id = str;
        this.title = str2;
        this.gameServer = str3;
        this.gameTotal = str4;
        this.amount = str5;
        this.images = list;
    }

    public static /* synthetic */ GameDetailSubAccountBean copy$default(GameDetailSubAccountBean gameDetailSubAccountBean, String str, String str2, String str3, String str4, String str5, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = gameDetailSubAccountBean.id;
        }
        if ((i4 & 2) != 0) {
            str2 = gameDetailSubAccountBean.title;
        }
        String str6 = str2;
        if ((i4 & 4) != 0) {
            str3 = gameDetailSubAccountBean.gameServer;
        }
        String str7 = str3;
        if ((i4 & 8) != 0) {
            str4 = gameDetailSubAccountBean.gameTotal;
        }
        String str8 = str4;
        if ((i4 & 16) != 0) {
            str5 = gameDetailSubAccountBean.amount;
        }
        String str9 = str5;
        List<String> list2 = list;
        if ((i4 & 32) != 0) {
            list2 = gameDetailSubAccountBean.images;
        }
        return gameDetailSubAccountBean.copy(str, str6, str7, str8, str9, list2);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.gameServer;
    }

    @Nullable
    public final String component4() {
        return this.gameTotal;
    }

    @Nullable
    public final String component5() {
        return this.amount;
    }

    @Nullable
    public final List<String> component6() {
        return this.images;
    }

    @NotNull
    public final GameDetailSubAccountBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<String> list) {
        return new GameDetailSubAccountBean(str, str2, str3, str4, str5, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailSubAccountBean) {
            GameDetailSubAccountBean gameDetailSubAccountBean = (GameDetailSubAccountBean) obj;
            return Intrinsics.areEqual(this.id, gameDetailSubAccountBean.id) && Intrinsics.areEqual(this.title, gameDetailSubAccountBean.title) && Intrinsics.areEqual(this.gameServer, gameDetailSubAccountBean.gameServer) && Intrinsics.areEqual(this.gameTotal, gameDetailSubAccountBean.gameTotal) && Intrinsics.areEqual(this.amount, gameDetailSubAccountBean.amount) && Intrinsics.areEqual(this.images, gameDetailSubAccountBean.images);
        }
        return false;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getGameServer() {
        return this.gameServer;
    }

    @Nullable
    public final String getGameTotal() {
        return this.gameTotal;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getImages() {
        return this.images;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gameServer;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gameTotal;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.amount;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.images;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final void setAmount(@Nullable String str) {
        this.amount = str;
    }

    public final void setGameServer(@Nullable String str) {
        this.gameServer = str;
    }

    public final void setGameTotal(@Nullable String str) {
        this.gameTotal = str;
    }

    @NotNull
    public String toString() {
        return "GameDetailSubAccountBean(id=" + this.id + ", title=" + this.title + ", gameServer=" + this.gameServer + ", gameTotal=" + this.gameTotal + ", amount=" + this.amount + ", images=" + this.images + ')';
    }

    public /* synthetic */ GameDetailSubAccountBean(String str, String str2, String str3, String str4, String str5, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) == 0 ? str5 : "", (i4 & 32) != 0 ? null : list);
    }
}
