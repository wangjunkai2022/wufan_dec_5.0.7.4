package net.lingala.zip4j.util;

import net.lingala.zip4j.exception.ZipException;
import w3.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArchiveMaintainer.java */
/* loaded from: classes7.dex */
public class a extends Thread {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f71843b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o f71844c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ w3.h f71845d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ x3.a f71846e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(c cVar, String str, o oVar, w3.h hVar, x3.a aVar) {
        super(str);
        this.f71843b = cVar;
        this.f71844c = oVar;
        this.f71845d = hVar;
        this.f71846e = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f71843b.j(this.f71844c, this.f71845d, this.f71846e);
            this.f71846e.c();
        } catch (ZipException unused) {
        }
    }
}
