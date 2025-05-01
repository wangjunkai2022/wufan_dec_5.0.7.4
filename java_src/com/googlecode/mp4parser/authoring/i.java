package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.l;
import java.util.Date;
/* compiled from: TrackMetaData.java */
/* loaded from: classes3.dex */
public class i implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    private long f13220c;

    /* renamed from: g  reason: collision with root package name */
    private double f13224g;

    /* renamed from: h  reason: collision with root package name */
    private double f13225h;

    /* renamed from: i  reason: collision with root package name */
    private float f13226i;

    /* renamed from: l  reason: collision with root package name */
    int f13229l;

    /* renamed from: b  reason: collision with root package name */
    private String f13219b = "eng";

    /* renamed from: d  reason: collision with root package name */
    private Date f13221d = new Date();

    /* renamed from: e  reason: collision with root package name */
    private Date f13222e = new Date();

    /* renamed from: f  reason: collision with root package name */
    private l f13223f = l.f14234j;

    /* renamed from: j  reason: collision with root package name */
    private long f13227j = 1;

    /* renamed from: k  reason: collision with root package name */
    private int f13228k = 0;

    public Date a() {
        return this.f13222e;
    }

    public int b() {
        return this.f13228k;
    }

    public double c() {
        return this.f13225h;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String d() {
        return this.f13219b;
    }

    public int e() {
        return this.f13229l;
    }

    public l f() {
        return this.f13223f;
    }

    public Date g() {
        return this.f13221d;
    }

    public long h() {
        return this.f13220c;
    }

    public long i() {
        return this.f13227j;
    }

    public float j() {
        return this.f13226i;
    }

    public double k() {
        return this.f13224g;
    }

    public void l(Date date) {
        this.f13222e = date;
    }

    public void m(int i4) {
        this.f13228k = i4;
    }

    public void n(double d5) {
        this.f13225h = d5;
    }

    public void o(String str) {
        this.f13219b = str;
    }

    public void p(int i4) {
        this.f13229l = i4;
    }

    public void q(l lVar) {
        this.f13223f = lVar;
    }

    public void r(Date date) {
        this.f13221d = date;
    }

    public void s(long j4) {
        this.f13220c = j4;
    }

    public void t(long j4) {
        this.f13227j = j4;
    }

    public void u(float f5) {
        this.f13226i = f5;
    }

    public void v(double d5) {
        this.f13224g = d5;
    }
}
