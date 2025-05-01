package net.lingala.zip4j.unzip;

import java.util.ArrayList;
import net.lingala.zip4j.exception.ZipException;
import w3.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Unzip.java */
/* loaded from: classes7.dex */
public class a extends Thread {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f71825b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ArrayList f71826c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ k f71827d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ x3.a f71828e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f71829f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(c cVar, String str, ArrayList arrayList, k kVar, x3.a aVar, String str2) {
        super(str);
        this.f71825b = cVar;
        this.f71826c = arrayList;
        this.f71827d = kVar;
        this.f71828e = aVar;
        this.f71829f = str2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f71825b.h(this.f71826c, this.f71827d, this.f71828e, this.f71829f);
            this.f71828e.c();
        } catch (ZipException unused) {
        }
    }
}
