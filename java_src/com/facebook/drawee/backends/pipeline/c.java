package com.facebook.drawee.backends.pipeline;

import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.h;
import com.facebook.common.internal.k;
import com.facebook.common.internal.l;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: DraweeConfig.java */
/* loaded from: classes.dex */
public class c {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final ImmutableList<t0.a> f10990a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final g f10991b;

    /* renamed from: c  reason: collision with root package name */
    private final k<Boolean> f10992c;

    /* compiled from: DraweeConfig.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private List<t0.a> f10993a;

        /* renamed from: b  reason: collision with root package name */
        private k<Boolean> f10994b;

        /* renamed from: c  reason: collision with root package name */
        private g f10995c;

        public b d(t0.a aVar) {
            if (this.f10993a == null) {
                this.f10993a = new ArrayList();
            }
            this.f10993a.add(aVar);
            return this;
        }

        public c e() {
            return new c(this);
        }

        public b f(k<Boolean> kVar) {
            h.i(kVar);
            this.f10994b = kVar;
            return this;
        }

        public b g(boolean z4) {
            return f(l.a(Boolean.valueOf(z4)));
        }

        public b h(g gVar) {
            this.f10995c = gVar;
            return this;
        }
    }

    public static b d() {
        return new b();
    }

    @Nullable
    public ImmutableList<t0.a> a() {
        return this.f10990a;
    }

    public k<Boolean> b() {
        return this.f10992c;
    }

    @Nullable
    public g c() {
        return this.f10991b;
    }

    private c(b bVar) {
        k<Boolean> a5;
        this.f10990a = bVar.f10993a != null ? ImmutableList.a(bVar.f10993a) : null;
        if (bVar.f10994b != null) {
            a5 = bVar.f10994b;
        } else {
            a5 = l.a(Boolean.FALSE);
        }
        this.f10992c = a5;
        this.f10991b = bVar.f10995c;
    }
}
