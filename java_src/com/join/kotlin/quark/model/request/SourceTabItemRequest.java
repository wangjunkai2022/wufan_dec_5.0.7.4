package com.join.kotlin.quark.model.request;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceTabItemRequest.kt */
/* loaded from: classes3.dex */
public final class SourceTabItemRequest {
    @Nullable
    private final Integer uid;

    public SourceTabItemRequest(@Nullable Integer num) {
        this.uid = num;
    }

    public static /* synthetic */ SourceTabItemRequest copy$default(SourceTabItemRequest sourceTabItemRequest, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = sourceTabItemRequest.uid;
        }
        return sourceTabItemRequest.copy(num);
    }

    @Nullable
    public final Integer component1() {
        return this.uid;
    }

    @NotNull
    public final SourceTabItemRequest copy(@Nullable Integer num) {
        return new SourceTabItemRequest(num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SourceTabItemRequest) && Intrinsics.areEqual(this.uid, ((SourceTabItemRequest) obj).uid);
    }

    @Nullable
    public final Integer getUid() {
        return this.uid;
    }

    public int hashCode() {
        Integer num = this.uid;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "SourceTabItemRequest(uid=" + this.uid + ')';
    }
}
