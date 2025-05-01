package com.join.kotlin.zone.model.request;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameZoneRequest.kt */
/* loaded from: classes3.dex */
public final class GameZoneRequest {
    @NotNull
    private final String zoneId;

    public GameZoneRequest(@NotNull String zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        this.zoneId = zoneId;
    }

    public static /* synthetic */ GameZoneRequest copy$default(GameZoneRequest gameZoneRequest, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = gameZoneRequest.zoneId;
        }
        return gameZoneRequest.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.zoneId;
    }

    @NotNull
    public final GameZoneRequest copy(@NotNull String zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        return new GameZoneRequest(zoneId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GameZoneRequest) && Intrinsics.areEqual(this.zoneId, ((GameZoneRequest) obj).zoneId);
    }

    @NotNull
    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        return this.zoneId.hashCode();
    }

    @NotNull
    public String toString() {
        return "GameZoneRequest(zoneId=" + this.zoneId + ')';
    }
}
