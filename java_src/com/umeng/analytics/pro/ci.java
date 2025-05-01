package com.umeng.analytics.pro;

import java.io.Serializable;
/* compiled from: FieldValueMetaData.java */
/* loaded from: classes6.dex */
public class ci implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f63570a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f63571b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63572c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f63573d;

    public ci(byte b5, boolean z4) {
        this.f63571b = b5;
        this.f63570a = false;
        this.f63572c = null;
        this.f63573d = z4;
    }

    public boolean a() {
        return this.f63570a;
    }

    public String b() {
        return this.f63572c;
    }

    public boolean c() {
        return this.f63571b == 12;
    }

    public boolean d() {
        byte b5 = this.f63571b;
        return b5 == 15 || b5 == 13 || b5 == 14;
    }

    public boolean e() {
        return this.f63573d;
    }

    public ci(byte b5) {
        this(b5, false);
    }

    public ci(byte b5, String str) {
        this.f63571b = b5;
        this.f63570a = true;
        this.f63572c = str;
        this.f63573d = false;
    }
}
