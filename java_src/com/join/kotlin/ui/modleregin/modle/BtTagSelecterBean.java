package com.join.kotlin.ui.modleregin.modle;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BtTagSelecterBean.kt */
/* loaded from: classes3.dex */
public final class BtTagSelecterBean {
    private boolean status;
    private long time;
    @NotNull
    private String timeMessage;

    public BtTagSelecterBean(long j4, @NotNull String timeMessage, boolean z4) {
        Intrinsics.checkNotNullParameter(timeMessage, "timeMessage");
        this.time = j4;
        this.timeMessage = timeMessage;
        this.status = z4;
    }

    public static /* synthetic */ BtTagSelecterBean copy$default(BtTagSelecterBean btTagSelecterBean, long j4, String str, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = btTagSelecterBean.time;
        }
        if ((i4 & 2) != 0) {
            str = btTagSelecterBean.timeMessage;
        }
        if ((i4 & 4) != 0) {
            z4 = btTagSelecterBean.status;
        }
        return btTagSelecterBean.copy(j4, str, z4);
    }

    public final long component1() {
        return this.time;
    }

    @NotNull
    public final String component2() {
        return this.timeMessage;
    }

    public final boolean component3() {
        return this.status;
    }

    @NotNull
    public final BtTagSelecterBean copy(long j4, @NotNull String timeMessage, boolean z4) {
        Intrinsics.checkNotNullParameter(timeMessage, "timeMessage");
        return new BtTagSelecterBean(j4, timeMessage, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BtTagSelecterBean) {
            BtTagSelecterBean btTagSelecterBean = (BtTagSelecterBean) obj;
            return this.time == btTagSelecterBean.time && Intrinsics.areEqual(this.timeMessage, btTagSelecterBean.timeMessage) && this.status == btTagSelecterBean.status;
        }
        return false;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTimeMessage() {
        return this.timeMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a5 = ((a.a(this.time) * 31) + this.timeMessage.hashCode()) * 31;
        boolean z4 = this.status;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return a5 + i4;
    }

    public final void setStatus(boolean z4) {
        this.status = z4;
    }

    public final void setTime(long j4) {
        this.time = j4;
    }

    public final void setTimeMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeMessage = str;
    }

    @NotNull
    public String toString() {
        return "BtTagSelecterBean(time=" + this.time + ", timeMessage=" + this.timeMessage + ", status=" + this.status + ')';
    }
}
