package net.lingala.zip4j.util;

import java.io.File;
import net.lingala.zip4j.exception.ZipException;
import w3.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArchiveMaintainer.java */
/* loaded from: classes7.dex */
public class b extends Thread {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f71847b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o f71848c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ File f71849d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ x3.a f71850e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c cVar, String str, o oVar, File file, x3.a aVar) {
        super(str);
        this.f71847b = cVar;
        this.f71848c = oVar;
        this.f71849d = file;
        this.f71850e = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f71847b.g(this.f71848c, this.f71849d, this.f71850e);
        } catch (ZipException unused) {
        }
    }
}
