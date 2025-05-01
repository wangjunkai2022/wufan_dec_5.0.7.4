package com.join.kotlin.ui.modleregin.modle;

import com.join.mgps.dto.CollectionBeanSub;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BtOnlineGame.kt */
/* loaded from: classes3.dex */
public final class BtOnlineGame {
    @NotNull
    private final List<CollectionBeanSub> gameEntityList;
    private final long onlineTime;

    /* JADX WARN: Multi-variable type inference failed */
    public BtOnlineGame(long j4, @NotNull List<? extends CollectionBeanSub> gameEntityList) {
        Intrinsics.checkNotNullParameter(gameEntityList, "gameEntityList");
        this.onlineTime = j4;
        this.gameEntityList = gameEntityList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BtOnlineGame copy$default(BtOnlineGame btOnlineGame, long j4, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = btOnlineGame.onlineTime;
        }
        if ((i4 & 2) != 0) {
            list = btOnlineGame.gameEntityList;
        }
        return btOnlineGame.copy(j4, list);
    }

    public final long component1() {
        return this.onlineTime;
    }

    @NotNull
    public final List<CollectionBeanSub> component2() {
        return this.gameEntityList;
    }

    @NotNull
    public final BtOnlineGame copy(long j4, @NotNull List<? extends CollectionBeanSub> gameEntityList) {
        Intrinsics.checkNotNullParameter(gameEntityList, "gameEntityList");
        return new BtOnlineGame(j4, gameEntityList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BtOnlineGame) {
            BtOnlineGame btOnlineGame = (BtOnlineGame) obj;
            return this.onlineTime == btOnlineGame.onlineTime && Intrinsics.areEqual(this.gameEntityList, btOnlineGame.gameEntityList);
        }
        return false;
    }

    @NotNull
    public final List<CollectionBeanSub> getGameEntityList() {
        return this.gameEntityList;
    }

    public final long getOnlineTime() {
        return this.onlineTime;
    }

    public int hashCode() {
        return (a.a(this.onlineTime) * 31) + this.gameEntityList.hashCode();
    }

    @NotNull
    public String toString() {
        return "BtOnlineGame(onlineTime=" + this.onlineTime + ", gameEntityList=" + this.gameEntityList + ')';
    }
}
