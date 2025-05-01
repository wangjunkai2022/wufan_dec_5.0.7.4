package com.xinzhu.overmind.server.am;

import android.content.Intent;
import java.util.LinkedList;
import java.util.List;
/* compiled from: TaskRecord.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public int f67936a;

    /* renamed from: b  reason: collision with root package name */
    public int f67937b;

    /* renamed from: c  reason: collision with root package name */
    public String f67938c;

    /* renamed from: d  reason: collision with root package name */
    public Intent f67939d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f67940e = new LinkedList();

    public h(int i4, int i5, String str) {
        this.f67936a = i4;
        this.f67937b = i5;
        this.f67938c = str;
    }

    public void a(b bVar) {
        this.f67940e.add(bVar);
    }

    public b b() {
        for (int size = this.f67940e.size() - 1; size >= 0; size--) {
            b bVar = this.f67940e.get(size);
            if (!bVar.finished) {
                return bVar;
            }
        }
        return null;
    }

    public boolean c() {
        for (b bVar : this.f67940e) {
            if (!bVar.finished) {
                return false;
            }
        }
        return true;
    }

    public void d(b bVar) {
        this.f67940e.remove(bVar);
    }
}
