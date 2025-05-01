package com.facebook.soloader;

import java.util.List;
import javax.annotation.Nullable;
/* compiled from: NativeLibrary.java */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: f  reason: collision with root package name */
    private static final String f12789f = "com.facebook.soloader.p";
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private List<String> f12791b;

    /* renamed from: a  reason: collision with root package name */
    private final Object f12790a = new Object();

    /* renamed from: c  reason: collision with root package name */
    private Boolean f12792c = Boolean.TRUE;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12793d = false;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private volatile UnsatisfiedLinkError f12794e = null;

    protected p(List<String> list) {
        this.f12791b = list;
    }

    public void a() throws UnsatisfiedLinkError {
        if (!d()) {
            throw this.f12794e;
        }
    }

    @Nullable
    public UnsatisfiedLinkError b() {
        return this.f12794e;
    }

    protected void c() throws UnsatisfiedLinkError {
    }

    @Nullable
    public boolean d() {
        synchronized (this.f12790a) {
            if (!this.f12792c.booleanValue()) {
                return this.f12793d;
            }
            try {
                List<String> list = this.f12791b;
                if (list != null) {
                    for (String str : list) {
                        SoLoader.k(str);
                    }
                }
                c();
                this.f12793d = true;
                this.f12791b = null;
            } catch (UnsatisfiedLinkError e5) {
                this.f12794e = e5;
                this.f12793d = false;
            }
            this.f12792c = Boolean.FALSE;
            return this.f12793d;
        }
    }
}
