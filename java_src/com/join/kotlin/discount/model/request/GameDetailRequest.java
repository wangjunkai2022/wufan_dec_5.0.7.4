package com.join.kotlin.discount.model.request;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailRequest.kt */
/* loaded from: classes3.dex */
public final class GameDetailRequest {
    @Nullable
    private List<Long> downloadedGameIdList;
    @Nullable
    private String gameId;
    @Nullable
    private String uid;

    public GameDetailRequest(@Nullable String str, @Nullable String str2, @Nullable List<Long> list) {
        this.gameId = str;
        this.uid = str2;
        this.downloadedGameIdList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameDetailRequest copy$default(GameDetailRequest gameDetailRequest, String str, String str2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = gameDetailRequest.gameId;
        }
        if ((i4 & 2) != 0) {
            str2 = gameDetailRequest.uid;
        }
        if ((i4 & 4) != 0) {
            list = gameDetailRequest.downloadedGameIdList;
        }
        return gameDetailRequest.copy(str, str2, list);
    }

    @Nullable
    public final String component1() {
        return this.gameId;
    }

    @Nullable
    public final String component2() {
        return this.uid;
    }

    @Nullable
    public final List<Long> component3() {
        return this.downloadedGameIdList;
    }

    @NotNull
    public final GameDetailRequest copy(@Nullable String str, @Nullable String str2, @Nullable List<Long> list) {
        return new GameDetailRequest(str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailRequest) {
            GameDetailRequest gameDetailRequest = (GameDetailRequest) obj;
            return Intrinsics.areEqual(this.gameId, gameDetailRequest.gameId) && Intrinsics.areEqual(this.uid, gameDetailRequest.uid) && Intrinsics.areEqual(this.downloadedGameIdList, gameDetailRequest.downloadedGameIdList);
        }
        return false;
    }

    @Nullable
    public final List<Long> getDownloadedGameIdList() {
        return this.downloadedGameIdList;
    }

    @Nullable
    public final String getGameId() {
        return this.gameId;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.gameId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Long> list = this.downloadedGameIdList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setDownloadedGameIdList(@Nullable List<Long> list) {
        this.downloadedGameIdList = list;
    }

    public final void setGameId(@Nullable String str) {
        this.gameId = str;
    }

    public final void setUid(@Nullable String str) {
        this.uid = str;
    }

    @NotNull
    public String toString() {
        return "GameDetailRequest(gameId=" + this.gameId + ", uid=" + this.uid + ", downloadedGameIdList=" + this.downloadedGameIdList + ')';
    }

    public /* synthetic */ GameDetailRequest(String str, String str2, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i4 & 4) != 0 ? null : list);
    }
}
