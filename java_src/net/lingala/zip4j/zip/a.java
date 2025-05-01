package net.lingala.zip4j.zip;

import java.util.ArrayList;
import net.lingala.zip4j.exception.ZipException;
import w3.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZipEngine.java */
/* loaded from: classes7.dex */
public class a extends Thread {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f71918b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ArrayList f71919c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ p f71920d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ x3.a f71921e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, String str, ArrayList arrayList, p pVar, x3.a aVar) {
        super(str);
        this.f71918b = bVar;
        this.f71919c = arrayList;
        this.f71920d = pVar;
        this.f71921e = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f71918b.h(this.f71919c, this.f71920d, this.f71921e);
        } catch (ZipException unused) {
        }
    }
}
