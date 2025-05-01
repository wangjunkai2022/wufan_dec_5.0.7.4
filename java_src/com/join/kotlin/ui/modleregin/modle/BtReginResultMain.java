package com.join.kotlin.ui.modleregin.modle;

import com.join.mgps.dto.BannerBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BtReginResultMain.kt */
/* loaded from: classes3.dex */
public final class BtReginResultMain {
    @NotNull
    private final List<BannerBean> ad_collection;
    @Nullable
    private final List<BTDynamicMain> dynamic_component;
    @NotNull
    private final BtVideodata head_banner_game;
    @NotNull
    private final List<BtOnlineGame> new_online_game;

    /* JADX WARN: Multi-variable type inference failed */
    public BtReginResultMain(@NotNull List<? extends BannerBean> ad_collection, @NotNull BtVideodata head_banner_game, @NotNull List<BtOnlineGame> new_online_game, @Nullable List<BTDynamicMain> list) {
        Intrinsics.checkNotNullParameter(ad_collection, "ad_collection");
        Intrinsics.checkNotNullParameter(head_banner_game, "head_banner_game");
        Intrinsics.checkNotNullParameter(new_online_game, "new_online_game");
        this.ad_collection = ad_collection;
        this.head_banner_game = head_banner_game;
        this.new_online_game = new_online_game;
        this.dynamic_component = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BtReginResultMain copy$default(BtReginResultMain btReginResultMain, List list, BtVideodata btVideodata, List list2, List list3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = btReginResultMain.ad_collection;
        }
        if ((i4 & 2) != 0) {
            btVideodata = btReginResultMain.head_banner_game;
        }
        if ((i4 & 4) != 0) {
            list2 = btReginResultMain.new_online_game;
        }
        if ((i4 & 8) != 0) {
            list3 = btReginResultMain.dynamic_component;
        }
        return btReginResultMain.copy(list, btVideodata, list2, list3);
    }

    @NotNull
    public final List<BannerBean> component1() {
        return this.ad_collection;
    }

    @NotNull
    public final BtVideodata component2() {
        return this.head_banner_game;
    }

    @NotNull
    public final List<BtOnlineGame> component3() {
        return this.new_online_game;
    }

    @Nullable
    public final List<BTDynamicMain> component4() {
        return this.dynamic_component;
    }

    @NotNull
    public final BtReginResultMain copy(@NotNull List<? extends BannerBean> ad_collection, @NotNull BtVideodata head_banner_game, @NotNull List<BtOnlineGame> new_online_game, @Nullable List<BTDynamicMain> list) {
        Intrinsics.checkNotNullParameter(ad_collection, "ad_collection");
        Intrinsics.checkNotNullParameter(head_banner_game, "head_banner_game");
        Intrinsics.checkNotNullParameter(new_online_game, "new_online_game");
        return new BtReginResultMain(ad_collection, head_banner_game, new_online_game, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BtReginResultMain) {
            BtReginResultMain btReginResultMain = (BtReginResultMain) obj;
            return Intrinsics.areEqual(this.ad_collection, btReginResultMain.ad_collection) && Intrinsics.areEqual(this.head_banner_game, btReginResultMain.head_banner_game) && Intrinsics.areEqual(this.new_online_game, btReginResultMain.new_online_game) && Intrinsics.areEqual(this.dynamic_component, btReginResultMain.dynamic_component);
        }
        return false;
    }

    @NotNull
    public final List<BannerBean> getAd_collection() {
        return this.ad_collection;
    }

    @Nullable
    public final List<BTDynamicMain> getDynamic_component() {
        return this.dynamic_component;
    }

    @NotNull
    public final BtVideodata getHead_banner_game() {
        return this.head_banner_game;
    }

    @NotNull
    public final List<BtOnlineGame> getNew_online_game() {
        return this.new_online_game;
    }

    public int hashCode() {
        int hashCode = ((((this.ad_collection.hashCode() * 31) + this.head_banner_game.hashCode()) * 31) + this.new_online_game.hashCode()) * 31;
        List<BTDynamicMain> list = this.dynamic_component;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "BtReginResultMain(ad_collection=" + this.ad_collection + ", head_banner_game=" + this.head_banner_game + ", new_online_game=" + this.new_online_game + ", dynamic_component=" + this.dynamic_component + ')';
    }
}
