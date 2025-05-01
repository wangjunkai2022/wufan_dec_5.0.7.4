package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.l;
import java.util.LinkedList;
import java.util.List;
/* compiled from: Movie.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    l f13202a;

    /* renamed from: b  reason: collision with root package name */
    List<h> f13203b;

    public d() {
        this.f13202a = l.f14234j;
        this.f13203b = new LinkedList();
    }

    public static long b(long j4, long j5) {
        return j5 == 0 ? j4 : b(j5, j4 % j5);
    }

    public void a(h hVar) {
        if (f(hVar.M().i()) != null) {
            hVar.M().t(d());
        }
        this.f13203b.add(hVar);
    }

    public l c() {
        return this.f13202a;
    }

    public long d() {
        long j4 = 0;
        for (h hVar : this.f13203b) {
            if (j4 < hVar.M().i()) {
                j4 = hVar.M().i();
            }
        }
        return j4 + 1;
    }

    public long e() {
        long h4 = g().iterator().next().M().h();
        for (h hVar : g()) {
            h4 = b(hVar.M().h(), h4);
        }
        return h4;
    }

    public h f(long j4) {
        for (h hVar : this.f13203b) {
            if (hVar.M().i() == j4) {
                return hVar;
            }
        }
        return null;
    }

    public List<h> g() {
        return this.f13203b;
    }

    public void h(l lVar) {
        this.f13202a = lVar;
    }

    public void i(List<h> list) {
        this.f13203b = list;
    }

    public String toString() {
        String str = "Movie{ ";
        for (h hVar : this.f13203b) {
            str = String.valueOf(str) + "track_" + hVar.M().i() + " (" + hVar.getHandler() + ") ";
        }
        return String.valueOf(str) + '}';
    }

    public d(List<h> list) {
        this.f13202a = l.f14234j;
        this.f13203b = new LinkedList();
        this.f13203b = list;
    }
}
