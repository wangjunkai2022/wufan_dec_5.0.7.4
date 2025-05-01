package cn.aigestudio.downloader.bizs;

import android.content.Context;
import java.util.List;
/* compiled from: DLDBManager.java */
/* loaded from: classes2.dex */
public final class c implements m, n {

    /* renamed from: c  reason: collision with root package name */
    private static c f410c;

    /* renamed from: a  reason: collision with root package name */
    private o f411a;

    /* renamed from: b  reason: collision with root package name */
    private p f412b;

    private c(Context context) {
        this.f411a = new o(context);
        this.f412b = new p(context);
    }

    public static c k(Context context) {
        if (f410c == null) {
            f410c = new c(context);
        }
        return f410c;
    }

    @Override // cn.aigestudio.downloader.bizs.n
    public synchronized void a(String str) {
        this.f412b.a(str);
    }

    @Override // cn.aigestudio.downloader.bizs.m
    public synchronized f b(String str) {
        return this.f411a.b(str);
    }

    @Override // cn.aigestudio.downloader.bizs.n
    public synchronized j c(String str) {
        return this.f412b.c(str);
    }

    @Override // cn.aigestudio.downloader.bizs.m
    public synchronized void d(f fVar) {
        this.f411a.d(fVar);
    }

    @Override // cn.aigestudio.downloader.bizs.m
    public synchronized void e(f fVar) {
        this.f411a.e(fVar);
    }

    @Override // cn.aigestudio.downloader.bizs.n
    public synchronized void f(j jVar) {
        this.f412b.f(jVar);
    }

    @Override // cn.aigestudio.downloader.bizs.n
    public synchronized void g(j jVar) {
        this.f412b.g(jVar);
    }

    @Override // cn.aigestudio.downloader.bizs.m
    public synchronized void h(String str) {
        this.f411a.h(str);
    }

    @Override // cn.aigestudio.downloader.bizs.n
    public synchronized void i(String str) {
        this.f412b.i(str);
    }

    @Override // cn.aigestudio.downloader.bizs.n
    public synchronized List<j> j(String str) {
        return this.f412b.j(str);
    }
}
