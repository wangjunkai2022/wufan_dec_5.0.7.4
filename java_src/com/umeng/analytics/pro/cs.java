package com.umeng.analytics.pro;

import com.j256.ormlite.stmt.query.SimpleComparison;
/* compiled from: TMessage.java */
/* loaded from: classes6.dex */
public final class cs {

    /* renamed from: a  reason: collision with root package name */
    public final String f63635a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f63636b;

    /* renamed from: c  reason: collision with root package name */
    public final int f63637c;

    public cs() {
        this("", (byte) 0, 0);
    }

    public boolean a(cs csVar) {
        return this.f63635a.equals(csVar.f63635a) && this.f63636b == csVar.f63636b && this.f63637c == csVar.f63637c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof cs) {
            return a((cs) obj);
        }
        return false;
    }

    public String toString() {
        return "<TMessage name:'" + this.f63635a + "' type: " + ((int) this.f63636b) + " seqid:" + this.f63637c + SimpleComparison.GREATER_THAN_OPERATION;
    }

    public cs(String str, byte b5, int i4) {
        this.f63635a = str;
        this.f63636b = b5;
        this.f63637c = i4;
    }
}
