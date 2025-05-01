package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import javax.annotation.Nullable;
/* compiled from: ImageDecodeOptionsBuilder.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private boolean f11717b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11718c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11719d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11720e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11721f;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private com.facebook.imagepipeline.decoder.b f11723h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private w0.a f11724i;

    /* renamed from: a  reason: collision with root package name */
    private int f11716a = 100;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap.Config f11722g = Bitmap.Config.ARGB_8888;

    public b a() {
        return new b(this);
    }

    public Bitmap.Config b() {
        return this.f11722g;
    }

    @Nullable
    public w0.a c() {
        return this.f11724i;
    }

    @Nullable
    public com.facebook.imagepipeline.decoder.b d() {
        return this.f11723h;
    }

    public boolean e() {
        return this.f11719d;
    }

    public boolean f() {
        return this.f11717b;
    }

    public boolean g() {
        return this.f11720e;
    }

    public int h() {
        return this.f11716a;
    }

    public boolean i() {
        return this.f11721f;
    }

    public boolean j() {
        return this.f11718c;
    }

    public c k(Bitmap.Config config) {
        this.f11722g = config;
        return this;
    }

    public c l(@Nullable w0.a aVar) {
        this.f11724i = aVar;
        return this;
    }

    public c m(@Nullable com.facebook.imagepipeline.decoder.b bVar) {
        this.f11723h = bVar;
        return this;
    }

    public c n(boolean z4) {
        this.f11719d = z4;
        return this;
    }

    public c o(boolean z4) {
        this.f11717b = z4;
        return this;
    }

    public c p(boolean z4) {
        this.f11720e = z4;
        return this;
    }

    public c q(b bVar) {
        this.f11717b = bVar.f11708b;
        this.f11718c = bVar.f11709c;
        this.f11719d = bVar.f11710d;
        this.f11720e = bVar.f11711e;
        this.f11722g = bVar.f11713g;
        this.f11723h = bVar.f11714h;
        this.f11721f = bVar.f11712f;
        this.f11724i = bVar.f11715i;
        return this;
    }

    public c r(int i4) {
        this.f11716a = i4;
        return this;
    }

    public c s(boolean z4) {
        this.f11721f = z4;
        return this;
    }

    public c t(boolean z4) {
        this.f11718c = z4;
        return this;
    }
}
