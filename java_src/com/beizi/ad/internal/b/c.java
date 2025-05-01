package com.beizi.ad.internal.b;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Config.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final File f5777a;

    /* renamed from: b  reason: collision with root package name */
    public final com.beizi.ad.internal.b.a.c f5778b;

    /* renamed from: c  reason: collision with root package name */
    public final com.beizi.ad.internal.b.a.a f5779c;

    /* renamed from: d  reason: collision with root package name */
    public final com.beizi.ad.internal.b.b.c f5780d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(File file, com.beizi.ad.internal.b.a.c cVar, com.beizi.ad.internal.b.a.a aVar, com.beizi.ad.internal.b.b.c cVar2) {
        this.f5777a = file;
        this.f5778b = cVar;
        this.f5779c = aVar;
        this.f5780d = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a(String str) {
        return new File(this.f5777a, this.f5778b.a(str));
    }
}
