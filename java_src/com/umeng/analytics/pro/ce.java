package com.umeng.analytics.pro;

import com.umeng.analytics.pro.co;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
/* compiled from: TSerializer.java */
/* loaded from: classes6.dex */
public class ce {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f63559a;

    /* renamed from: b  reason: collision with root package name */
    private final dg f63560b;

    /* renamed from: c  reason: collision with root package name */
    private cu f63561c;

    public ce() {
        this(new co.a());
    }

    public byte[] a(bv bvVar) throws cb {
        this.f63559a.reset();
        bvVar.write(this.f63561c);
        return this.f63559a.toByteArray();
    }

    public String b(bv bvVar) throws cb {
        return new String(a(bvVar));
    }

    public ce(cw cwVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f63559a = byteArrayOutputStream;
        dg dgVar = new dg(byteArrayOutputStream);
        this.f63560b = dgVar;
        this.f63561c = cwVar.a(dgVar);
    }

    public String a(bv bvVar, String str) throws cb {
        try {
            return new String(a(bvVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new cb("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }
}
