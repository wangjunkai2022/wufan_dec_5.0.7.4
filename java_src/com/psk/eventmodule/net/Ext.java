package com.psk.eventmodule.net;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: Ext.kt */
/* loaded from: classes5.dex */
public final class Ext {
    @NotNull
    private String from = "";
    @NotNull
    private String position = "";

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }

    /* renamed from: setFrom  reason: collision with other method in class */
    public final void m25setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.from = str;
    }

    /* renamed from: setPosition  reason: collision with other method in class */
    public final void m26setPosition(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.position = str;
    }

    @NotNull
    public final Ext setFrom(@NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.from = from;
        return this;
    }

    @NotNull
    public final Ext setPosition(@NotNull String position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.position = position;
        return this;
    }
}
