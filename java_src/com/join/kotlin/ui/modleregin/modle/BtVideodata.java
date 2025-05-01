package com.join.kotlin.ui.modleregin.modle;

import com.join.mgps.dto.CollectionBeanSub;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BtVideodata.kt */
/* loaded from: classes3.dex */
public final class BtVideodata {
    @NotNull
    private final CollectionBeanSub gameEntity;
    @NotNull
    private final String imageUrl;
    @Nullable
    private final Long onlineTime;
    @NotNull
    private final String videoUrl;

    public BtVideodata(@Nullable Long l4, @NotNull String videoUrl, @NotNull String imageUrl, @NotNull CollectionBeanSub gameEntity) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(gameEntity, "gameEntity");
        this.onlineTime = l4;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.gameEntity = gameEntity;
    }

    public static /* synthetic */ BtVideodata copy$default(BtVideodata btVideodata, Long l4, String str, String str2, CollectionBeanSub collectionBeanSub, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l4 = btVideodata.onlineTime;
        }
        if ((i4 & 2) != 0) {
            str = btVideodata.videoUrl;
        }
        if ((i4 & 4) != 0) {
            str2 = btVideodata.imageUrl;
        }
        if ((i4 & 8) != 0) {
            collectionBeanSub = btVideodata.gameEntity;
        }
        return btVideodata.copy(l4, str, str2, collectionBeanSub);
    }

    @Nullable
    public final Long component1() {
        return this.onlineTime;
    }

    @NotNull
    public final String component2() {
        return this.videoUrl;
    }

    @NotNull
    public final String component3() {
        return this.imageUrl;
    }

    @NotNull
    public final CollectionBeanSub component4() {
        return this.gameEntity;
    }

    @NotNull
    public final BtVideodata copy(@Nullable Long l4, @NotNull String videoUrl, @NotNull String imageUrl, @NotNull CollectionBeanSub gameEntity) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(gameEntity, "gameEntity");
        return new BtVideodata(l4, videoUrl, imageUrl, gameEntity);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BtVideodata) {
            BtVideodata btVideodata = (BtVideodata) obj;
            return Intrinsics.areEqual(this.onlineTime, btVideodata.onlineTime) && Intrinsics.areEqual(this.videoUrl, btVideodata.videoUrl) && Intrinsics.areEqual(this.imageUrl, btVideodata.imageUrl) && Intrinsics.areEqual(this.gameEntity, btVideodata.gameEntity);
        }
        return false;
    }

    @NotNull
    public final CollectionBeanSub getGameEntity() {
        return this.gameEntity;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final Long getOnlineTime() {
        return this.onlineTime;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        Long l4 = this.onlineTime;
        return ((((((l4 == null ? 0 : l4.hashCode()) * 31) + this.videoUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.gameEntity.hashCode();
    }

    @NotNull
    public String toString() {
        return "BtVideodata(onlineTime=" + this.onlineTime + ", videoUrl=" + this.videoUrl + ", imageUrl=" + this.imageUrl + ", gameEntity=" + this.gameEntity + ')';
    }
}
