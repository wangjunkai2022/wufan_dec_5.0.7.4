package com.aggmoread.sdk.z.c.a.a.d.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.aggmoread.sdk.z.c.a.a.c.g;
/* loaded from: classes2.dex */
public class c implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private d f3257a;

    public c(Context context) {
        d dVar = new d();
        this.f3257a = dVar;
        dVar.f3260d = context;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a a(int i4) {
        this.f3257a.f3270n = i4;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a a(ViewGroup viewGroup) {
        this.f3257a.f3266j = viewGroup;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a a(com.aggmoread.sdk.z.c.a.a.c.f fVar) {
        this.f3257a.f3263g = fVar;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a a(com.aggmoread.sdk.z.c.a.a.c.h hVar) {
        this.f3257a.f3273q = hVar;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a a(com.aggmoread.sdk.z.c.a.a.c.i iVar) {
        this.f3257a.f3261e = iVar;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a a(com.aggmoread.sdk.z.c.a.a.c.r.c cVar) {
        this.f3257a.f3272p = cVar;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a a(com.aggmoread.sdk.z.c.a.a.c.t.b bVar) {
        this.f3257a.f3275s = bVar;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a a(String str) {
        this.f3257a.f3262f = str;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a a(boolean z4) {
        this.f3257a.f3282z = z4;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public com.aggmoread.sdk.z.c.a.a.c.g a() {
        try {
            return (com.aggmoread.sdk.z.c.a.a.c.g) this.f3257a.clone();
        } catch (CloneNotSupportedException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a b(int i4) {
        this.f3257a.f3269m = i4;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a b(String str) {
        this.f3257a.f3265i = str;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a c(int i4) {
        this.f3257a.A = i4;
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a c(String str) {
        String str2;
        com.aggmoread.sdk.z.c.a.a.e.e.a("raw token " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = new String(com.aggmoread.sdk.z.c.a.a.b.a(str), "utf-8").split("\\|");
                if (split.length >= 2) {
                    d dVar = this.f3257a;
                    dVar.f3279w = split[0];
                    dVar.f3280x = split[1];
                    com.aggmoread.sdk.z.c.a.a.e.e.a("token " + this.f3257a.f3279w);
                    com.aggmoread.sdk.z.c.a.a.e.e.a("slotId " + this.f3257a.f3280x);
                    if (split.length == 3) {
                        this.f3257a.f3281y = split[2];
                        str2 = "s2s price " + this.f3257a.f3281y;
                    }
                } else {
                    str2 = "err token ";
                }
                com.aggmoread.sdk.z.c.a.a.e.e.a(str2);
            } catch (Exception e5) {
                e5.printStackTrace();
                com.aggmoread.sdk.z.c.a.a.e.e.a("set token err " + e5.getMessage());
            }
        }
        return this;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.g.a
    public g.a d(int i4) {
        this.f3257a.f3271o = i4;
        return this;
    }
}
