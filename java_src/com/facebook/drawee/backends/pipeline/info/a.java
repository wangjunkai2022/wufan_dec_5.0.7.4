package com.facebook.drawee.backends.pipeline.info;

import javax.annotation.Nullable;
/* compiled from: ImageOriginRequestListener.java */
/* loaded from: classes.dex */
public class a extends v0.a {

    /* renamed from: a  reason: collision with root package name */
    private String f11017a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final l0.b f11018b;

    public a(String str, @Nullable l0.b bVar) {
        this.f11018b = bVar;
        l(str);
    }

    @Override // v0.a, com.facebook.imagepipeline.producers.m0
    public void h(String str, String str2, boolean z4) {
        l0.b bVar = this.f11018b;
        if (bVar != null) {
            bVar.a(this.f11017a, l0.c.a(str2), z4);
        }
    }

    public void l(String str) {
        this.f11017a = str;
    }
}
