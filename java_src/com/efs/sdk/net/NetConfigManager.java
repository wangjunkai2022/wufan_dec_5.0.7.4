package com.efs.sdk.net;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import java.util.Random;
/* loaded from: classes2.dex */
public class NetConfigManager {

    /* renamed from: c  reason: collision with root package name */
    private EfsReporter f10531c;

    /* renamed from: d  reason: collision with root package name */
    private int f10532d;

    /* renamed from: e  reason: collision with root package name */
    private int f10533e;

    /* renamed from: f  reason: collision with root package name */
    private int f10534f;

    /* renamed from: g  reason: collision with root package name */
    private int f10535g;

    /* renamed from: h  reason: collision with root package name */
    private int f10536h;

    /* renamed from: i  reason: collision with root package name */
    private int f10537i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10538j;

    /* renamed from: k  reason: collision with root package name */
    private Context f10539k;

    /* renamed from: l  reason: collision with root package name */
    private int f10540l;

    /* renamed from: a  reason: collision with root package name */
    private final String f10529a = "NetConfigManager";

    /* renamed from: b  reason: collision with root package name */
    private final int f10530b = 0;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10541m = false;

    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NetConfigManager(android.content.Context r20, com.efs.sdk.base.EfsReporter r21) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.NetConfigManager.<init>(android.content.Context, com.efs.sdk.base.EfsReporter):void");
    }

    public boolean enableTracer() {
        return this.f10538j;
    }

    public int getDataRate() {
        return this.f10537i;
    }

    public int getDayLimit() {
        return this.f10536h;
    }

    public int getExtraRateFlag() {
        return this.f10540l;
    }

    public boolean getNetRequestBodyCollectState() {
        return this.f10541m;
    }

    public void setNetRequestBodyCollectState(boolean z4) {
        this.f10541m = z4;
    }

    private static boolean a(int i4) {
        if (i4 == 0) {
            return false;
        }
        return i4 == 100 || new Random().nextInt(100) <= i4;
    }
}
