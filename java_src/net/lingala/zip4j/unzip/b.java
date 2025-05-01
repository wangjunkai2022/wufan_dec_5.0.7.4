package net.lingala.zip4j.unzip;

import net.lingala.zip4j.exception.ZipException;
import w3.h;
import w3.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Unzip.java */
/* loaded from: classes7.dex */
public class b extends Thread {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f71830b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ h f71831c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f71832d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ k f71833e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f71834f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ x3.a f71835g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c cVar, String str, h hVar, String str2, k kVar, String str3, x3.a aVar) {
        super(str);
        this.f71830b = cVar;
        this.f71831c = hVar;
        this.f71832d = str2;
        this.f71833e = kVar;
        this.f71834f = str3;
        this.f71835g = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f71830b.i(this.f71831c, this.f71832d, this.f71833e, this.f71834f, this.f71835g);
            this.f71835g.c();
        } catch (ZipException unused) {
        }
    }
}
