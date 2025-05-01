package com.psk.eventmodule.net.modle;

import com.join.kotlin.ui.modleregin.modle.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: VolcannoRequest.kt */
/* loaded from: classes5.dex */
public final class VolcannoRequest {
    private final long bhv_time;
    @NotNull
    private final VolcanoData data;

    public VolcannoRequest(long j4, @NotNull VolcanoData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.bhv_time = j4;
        this.data = data;
    }

    public static /* synthetic */ VolcannoRequest copy$default(VolcannoRequest volcannoRequest, long j4, VolcanoData volcanoData, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = volcannoRequest.bhv_time;
        }
        if ((i4 & 2) != 0) {
            volcanoData = volcannoRequest.data;
        }
        return volcannoRequest.copy(j4, volcanoData);
    }

    public final long component1() {
        return this.bhv_time;
    }

    @NotNull
    public final VolcanoData component2() {
        return this.data;
    }

    @NotNull
    public final VolcannoRequest copy(long j4, @NotNull VolcanoData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new VolcannoRequest(j4, data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VolcannoRequest) {
            VolcannoRequest volcannoRequest = (VolcannoRequest) obj;
            return this.bhv_time == volcannoRequest.bhv_time && Intrinsics.areEqual(this.data, volcannoRequest.data);
        }
        return false;
    }

    public final long getBhv_time() {
        return this.bhv_time;
    }

    @NotNull
    public final VolcanoData getData() {
        return this.data;
    }

    public int hashCode() {
        return (a.a(this.bhv_time) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "VolcannoRequest(bhv_time=" + this.bhv_time + ", data=" + this.data + ')';
    }
}
