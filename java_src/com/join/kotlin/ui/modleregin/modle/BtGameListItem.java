package com.join.kotlin.ui.modleregin.modle;

import com.join.kotlin.domain.common.AppListItemShowBean;
import com.join.mgps.business.CollectionBeanSubBusiness;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BtGameListItem.kt */
/* loaded from: classes3.dex */
public final class BtGameListItem {
    @Nullable
    private AppListItemShowBean appitemShow;
    @NotNull
    private final CollectionBeanSubBusiness gameInfo;
    @NotNull
    private final String gameName;
    @NotNull
    private final String icon;
    @Nullable
    private final String iconGif;
    @NotNull
    private final String info;
    private final int position;
    @Nullable
    private final String tags;

    public BtGameListItem(int i4, @NotNull String icon, @Nullable String str, @NotNull String gameName, @Nullable String str2, @NotNull String info, @NotNull CollectionBeanSubBusiness gameInfo, @Nullable AppListItemShowBean appListItemShowBean) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(gameInfo, "gameInfo");
        this.position = i4;
        this.icon = icon;
        this.iconGif = str;
        this.gameName = gameName;
        this.tags = str2;
        this.info = info;
        this.gameInfo = gameInfo;
        this.appitemShow = appListItemShowBean;
    }

    public final int component1() {
        return this.position;
    }

    @NotNull
    public final String component2() {
        return this.icon;
    }

    @Nullable
    public final String component3() {
        return this.iconGif;
    }

    @NotNull
    public final String component4() {
        return this.gameName;
    }

    @Nullable
    public final String component5() {
        return this.tags;
    }

    @NotNull
    public final String component6() {
        return this.info;
    }

    @NotNull
    public final CollectionBeanSubBusiness component7() {
        return this.gameInfo;
    }

    @Nullable
    public final AppListItemShowBean component8() {
        return this.appitemShow;
    }

    @NotNull
    public final BtGameListItem copy(int i4, @NotNull String icon, @Nullable String str, @NotNull String gameName, @Nullable String str2, @NotNull String info, @NotNull CollectionBeanSubBusiness gameInfo, @Nullable AppListItemShowBean appListItemShowBean) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(gameInfo, "gameInfo");
        return new BtGameListItem(i4, icon, str, gameName, str2, info, gameInfo, appListItemShowBean);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BtGameListItem) {
            BtGameListItem btGameListItem = (BtGameListItem) obj;
            return this.position == btGameListItem.position && Intrinsics.areEqual(this.icon, btGameListItem.icon) && Intrinsics.areEqual(this.iconGif, btGameListItem.iconGif) && Intrinsics.areEqual(this.gameName, btGameListItem.gameName) && Intrinsics.areEqual(this.tags, btGameListItem.tags) && Intrinsics.areEqual(this.info, btGameListItem.info) && Intrinsics.areEqual(this.gameInfo, btGameListItem.gameInfo) && Intrinsics.areEqual(this.appitemShow, btGameListItem.appitemShow);
        }
        return false;
    }

    @Nullable
    public final AppListItemShowBean getAppitemShow() {
        return this.appitemShow;
    }

    @NotNull
    public final CollectionBeanSubBusiness getGameInfo() {
        return this.gameInfo;
    }

    @NotNull
    public final String getGameName() {
        return this.gameName;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconGif() {
        return this.iconGif;
    }

    @NotNull
    public final String getInfo() {
        return this.info;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getTags() {
        return this.tags;
    }

    public int hashCode() {
        int hashCode = ((this.position * 31) + this.icon.hashCode()) * 31;
        String str = this.iconGif;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.gameName.hashCode()) * 31;
        String str2 = this.tags;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.info.hashCode()) * 31) + this.gameInfo.hashCode()) * 31;
        AppListItemShowBean appListItemShowBean = this.appitemShow;
        return hashCode3 + (appListItemShowBean != null ? appListItemShowBean.hashCode() : 0);
    }

    public final void setAppitemShow(@Nullable AppListItemShowBean appListItemShowBean) {
        this.appitemShow = appListItemShowBean;
    }

    @NotNull
    public String toString() {
        return "BtGameListItem(position=" + this.position + ", icon=" + this.icon + ", iconGif=" + this.iconGif + ", gameName=" + this.gameName + ", tags=" + this.tags + ", info=" + this.info + ", gameInfo=" + this.gameInfo + ", appitemShow=" + this.appitemShow + ')';
    }

    public /* synthetic */ BtGameListItem(int i4, String str, String str2, String str3, String str4, String str5, CollectionBeanSubBusiness collectionBeanSubBusiness, AppListItemShowBean appListItemShowBean, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, (i5 & 2) != 0 ? "" : str, str2, (i5 & 8) != 0 ? "" : str3, str4, (i5 & 32) != 0 ? "" : str5, collectionBeanSubBusiness, appListItemShowBean);
    }
}
