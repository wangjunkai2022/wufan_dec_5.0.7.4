package cn.aigestudio.downloader.bizs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: DLInfo.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    public String f424c;

    /* renamed from: d  reason: collision with root package name */
    public String f425d;

    /* renamed from: e  reason: collision with root package name */
    public String f426e;

    /* renamed from: f  reason: collision with root package name */
    public String f427f;

    /* renamed from: h  reason: collision with root package name */
    int f429h;

    /* renamed from: i  reason: collision with root package name */
    volatile boolean f430i;

    /* renamed from: j  reason: collision with root package name */
    volatile boolean f431j;

    /* renamed from: k  reason: collision with root package name */
    String f432k;

    /* renamed from: l  reason: collision with root package name */
    String f433l;

    /* renamed from: m  reason: collision with root package name */
    String f434m;

    /* renamed from: n  reason: collision with root package name */
    String f435n;

    /* renamed from: o  reason: collision with root package name */
    List<e> f436o;

    /* renamed from: q  reason: collision with root package name */
    d.b f438q;

    /* renamed from: r  reason: collision with root package name */
    File f439r;

    /* renamed from: a  reason: collision with root package name */
    public AtomicLong f422a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public AtomicLong f423b = new AtomicLong();

    /* renamed from: g  reason: collision with root package name */
    public AtomicInteger f428g = new AtomicInteger();

    /* renamed from: s  reason: collision with root package name */
    public boolean f440s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f441t = false;

    /* renamed from: p  reason: collision with root package name */
    final List<j> f437p = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(j jVar) {
        this.f437p.add(jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b(j jVar) {
        this.f437p.remove(jVar);
    }
}
