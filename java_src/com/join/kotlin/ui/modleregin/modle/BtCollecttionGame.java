package com.join.kotlin.ui.modleregin.modle;

import com.join.mgps.dto.CollectionBeanSub;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BtCollecttionGame.kt */
/* loaded from: classes3.dex */
public final class BtCollecttionGame {
    @NotNull
    private final String collectionId;
    @NotNull
    private final List<CollectionBeanSub> gameInfoList;

    /* JADX WARN: Multi-variable type inference failed */
    public BtCollecttionGame(@NotNull String collectionId, @NotNull List<? extends CollectionBeanSub> gameInfoList) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(gameInfoList, "gameInfoList");
        this.collectionId = collectionId;
        this.gameInfoList = gameInfoList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BtCollecttionGame copy$default(BtCollecttionGame btCollecttionGame, String str, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = btCollecttionGame.collectionId;
        }
        if ((i4 & 2) != 0) {
            list = btCollecttionGame.gameInfoList;
        }
        return btCollecttionGame.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.collectionId;
    }

    @NotNull
    public final List<CollectionBeanSub> component2() {
        return this.gameInfoList;
    }

    @NotNull
    public final BtCollecttionGame copy(@NotNull String collectionId, @NotNull List<? extends CollectionBeanSub> gameInfoList) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(gameInfoList, "gameInfoList");
        return new BtCollecttionGame(collectionId, gameInfoList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BtCollecttionGame) {
            BtCollecttionGame btCollecttionGame = (BtCollecttionGame) obj;
            return Intrinsics.areEqual(this.collectionId, btCollecttionGame.collectionId) && Intrinsics.areEqual(this.gameInfoList, btCollecttionGame.gameInfoList);
        }
        return false;
    }

    @NotNull
    public final String getCollectionId() {
        return this.collectionId;
    }

    @NotNull
    public final List<CollectionBeanSub> getGameInfoList() {
        return this.gameInfoList;
    }

    public int hashCode() {
        return (this.collectionId.hashCode() * 31) + this.gameInfoList.hashCode();
    }

    @NotNull
    public String toString() {
        return "BtCollecttionGame(collectionId=" + this.collectionId + ", gameInfoList=" + this.gameInfoList + ')';
    }
}
