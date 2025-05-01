package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.boxes.r0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MovieFragmentBox.java */
/* loaded from: classes2.dex */
public class c extends com.googlecode.mp4parser.b {

    /* renamed from: o  reason: collision with root package name */
    public static final String f9610o = "moof";

    public c() {
        super(f9610o);
    }

    public com.googlecode.mp4parser.e C() {
        return this.f14081c;
    }

    public List<Long> D(r0 r0Var) {
        ArrayList arrayList = new ArrayList();
        long j4 = 1;
        for (r0.a aVar : r0Var.v()) {
            if (aVar.c() == 2) {
                arrayList.add(Long.valueOf(j4));
            }
            j4++;
        }
        return arrayList;
    }

    public int E() {
        return l(k.class, false).size();
    }

    public List<l> J() {
        return l(l.class, true);
    }

    public long[] K() {
        List l4 = l(k.class, false);
        long[] jArr = new long[l4.size()];
        for (int i4 = 0; i4 < l4.size(); i4++) {
            jArr[i4] = ((k) l4.get(i4)).C().A();
        }
        return jArr;
    }

    public List<n> N() {
        return l(n.class, true);
    }
}
