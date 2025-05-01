package com.join.kotlin.quark.model.request;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceTabRequest.kt */
/* loaded from: classes3.dex */
public final class SourceTabRequest {
    @NotNull
    private final String uid;

    public SourceTabRequest(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.uid = uid;
    }

    public static /* synthetic */ SourceTabRequest copy$default(SourceTabRequest sourceTabRequest, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = sourceTabRequest.uid;
        }
        return sourceTabRequest.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.uid;
    }

    @NotNull
    public final SourceTabRequest copy(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return new SourceTabRequest(uid);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SourceTabRequest) && Intrinsics.areEqual(this.uid, ((SourceTabRequest) obj).uid);
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.uid.hashCode();
    }

    @NotNull
    public String toString() {
        return "SourceTabRequest(uid=" + this.uid + ')';
    }
}
