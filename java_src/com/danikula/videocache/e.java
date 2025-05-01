package com.danikula.videocache;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Config.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final File f10055a;

    /* renamed from: b  reason: collision with root package name */
    public final com.danikula.videocache.file.c f10056b;

    /* renamed from: c  reason: collision with root package name */
    public final com.danikula.videocache.file.a f10057c;

    /* renamed from: d  reason: collision with root package name */
    public final com.danikula.videocache.sourcestorage.c f10058d;

    /* renamed from: e  reason: collision with root package name */
    public final b0.b f10059e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(File file, com.danikula.videocache.file.c cVar, com.danikula.videocache.file.a aVar, com.danikula.videocache.sourcestorage.c cVar2, b0.b bVar) {
        this.f10055a = file;
        this.f10056b = cVar;
        this.f10057c = aVar;
        this.f10058d = cVar2;
        this.f10059e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a(String str) {
        return new File(this.f10055a, this.f10056b.generate(str));
    }
}
