package com.join.mgps.va.overmind;

import org.jetbrains.annotations.NotNull;
/* compiled from: PaCtrl.kt */
/* loaded from: classes.dex */
public final class PaCtrl {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final PaCtrl f54928a = new PaCtrl();

    static {
        System.loadLibrary("pactrl");
    }

    private PaCtrl() {
    }

    public final native void mountLibGggg(@NotNull String str);

    public final native void onSoLoaded(@NotNull String str, long j4);
}
