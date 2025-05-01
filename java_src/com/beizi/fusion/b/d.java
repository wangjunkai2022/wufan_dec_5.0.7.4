package com.beizi.fusion.b;

import com.beizi.fusion.b.a;
import com.beizi.fusion.g.af;
import java.util.Observable;
import java.util.Observer;
/* compiled from: ObserverAdStatus.java */
/* loaded from: classes2.dex */
public class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public a.i f6575a;

    /* renamed from: b  reason: collision with root package name */
    public a.h f6576b;

    /* renamed from: c  reason: collision with root package name */
    public a.k f6577c;

    /* renamed from: d  reason: collision with root package name */
    public a.g f6578d;

    /* renamed from: e  reason: collision with root package name */
    public a.d f6579e;

    /* renamed from: f  reason: collision with root package name */
    public a.e f6580f;

    /* renamed from: g  reason: collision with root package name */
    public a.f f6581g;

    /* renamed from: h  reason: collision with root package name */
    public a.c f6582h;

    /* renamed from: i  reason: collision with root package name */
    public a.b f6583i;

    /* renamed from: j  reason: collision with root package name */
    public a.j f6584j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0185a f6585k;

    /* renamed from: l  reason: collision with root package name */
    private final a f6586l;

    /* renamed from: m  reason: collision with root package name */
    private b f6587m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6588n = false;

    public d(b bVar) {
        this.f6587m = bVar;
        a aVar = new a();
        this.f6586l = aVar;
        this.f6575a = new a.i();
        this.f6576b = new a.h();
        this.f6577c = new a.k();
        this.f6578d = new a.g();
        this.f6579e = new a.d();
        this.f6580f = new a.e();
        this.f6581g = new a.f();
        this.f6582h = new a.c();
        this.f6583i = new a.b();
        this.f6584j = new a.j();
        this.f6585k = new a.C0185a();
    }

    public a a() {
        return this.f6586l;
    }

    public b b() {
        return this.f6587m;
    }

    public boolean c() {
        return this.f6588n;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if ((observable instanceof a.l) && (obj instanceof b)) {
            b bVar = (b) obj;
            String k4 = bVar.k();
            String d5 = bVar.d();
            int O = bVar.O();
            String P = bVar.P();
            String Q = bVar.Q();
            String c5 = bVar.c();
            af.a("BeiZis", "channel == " + k4 + ",eventCode = " + d5 + ";buyerSpaceId:" + bVar.s() + ",srcType = " + O + ",price = " + P + ",bidPrice = " + Q + ",eventId = " + c5 + ",buyerSpaceId = " + bVar.m());
            c.a(com.beizi.fusion.d.b.a().e()).a(bVar);
        }
    }

    public void a(boolean z4) {
        this.f6588n = z4;
    }
}
