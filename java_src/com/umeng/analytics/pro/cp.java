package com.umeng.analytics.pro;

import com.j256.ormlite.stmt.query.SimpleComparison;
/* compiled from: TField.java */
/* loaded from: classes6.dex */
public class cp {

    /* renamed from: a  reason: collision with root package name */
    public final String f63627a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f63628b;

    /* renamed from: c  reason: collision with root package name */
    public final short f63629c;

    public cp() {
        this("", (byte) 0, (short) 0);
    }

    public boolean a(cp cpVar) {
        return this.f63628b == cpVar.f63628b && this.f63629c == cpVar.f63629c;
    }

    public String toString() {
        return "<TField name:'" + this.f63627a + "' type:" + ((int) this.f63628b) + " field-id:" + ((int) this.f63629c) + SimpleComparison.GREATER_THAN_OPERATION;
    }

    public cp(String str, byte b5, short s4) {
        this.f63627a = str;
        this.f63628b = b5;
        this.f63629c = s4;
    }
}
