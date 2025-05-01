package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.internal.g;
import com.facebook.common.internal.h;
import com.facebook.common.internal.k;
import com.facebook.datasource.f;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements o0.d {

    /* renamed from: p  reason: collision with root package name */
    private static final c<Object> f11084p = new a();

    /* renamed from: q  reason: collision with root package name */
    private static final NullPointerException f11085q = new NullPointerException("No image request was specified!");

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicLong f11086r = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    private final Context f11087a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<c> f11088b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private Object f11089c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private REQUEST f11090d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private REQUEST f11091e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private REQUEST[] f11092f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11093g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private k<com.facebook.datasource.c<IMAGE>> f11094h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private c<? super INFO> f11095i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private d f11096j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11097k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11098l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11099m;

    /* renamed from: n  reason: collision with root package name */
    private String f11100n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private o0.a f11101o;

    /* loaded from: classes2.dex */
    public enum CacheLevel {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* loaded from: classes.dex */
    static class a extends com.facebook.drawee.controller.b<Object> {
        a() {
        }

        @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
        public void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements k<com.facebook.datasource.c<IMAGE>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0.a f11102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f11103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f11104c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f11105d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CacheLevel f11106e;

        b(o0.a aVar, String str, Object obj, Object obj2, CacheLevel cacheLevel) {
            this.f11102a = aVar;
            this.f11103b = str;
            this.f11104c = obj;
            this.f11105d = obj2;
            this.f11106e = cacheLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.common.internal.k
        /* renamed from: a */
        public com.facebook.datasource.c<IMAGE> get() {
            return AbstractDraweeControllerBuilder.this.l(this.f11102a, this.f11103b, this.f11104c, this.f11105d, this.f11106e);
        }

        public String toString() {
            return g.f(this).f("request", this.f11104c.toString()).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractDraweeControllerBuilder(Context context, Set<c> set) {
        this.f11087a = context;
        this.f11088b = set;
        x();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String f() {
        return String.valueOf(f11086r.getAndIncrement());
    }

    private void x() {
        this.f11089c = null;
        this.f11090d = null;
        this.f11091e = null;
        this.f11092f = null;
        this.f11093g = true;
        this.f11095i = null;
        this.f11096j = null;
        this.f11097k = false;
        this.f11098l = false;
        this.f11101o = null;
        this.f11100n = null;
    }

    protected void A(com.facebook.drawee.controller.a aVar) {
        if (this.f11097k) {
            aVar.w().g(this.f11097k);
            z(aVar);
        }
    }

    @ReturnsOwnership
    protected abstract com.facebook.drawee.controller.a B();

    /* JADX INFO: Access modifiers changed from: protected */
    public k<com.facebook.datasource.c<IMAGE>> C(o0.a aVar, String str) {
        k<com.facebook.datasource.c<IMAGE>> kVar = this.f11094h;
        if (kVar != null) {
            return kVar;
        }
        k<com.facebook.datasource.c<IMAGE>> kVar2 = null;
        REQUEST request = this.f11090d;
        if (request != null) {
            kVar2 = n(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f11092f;
            if (requestArr != null) {
                kVar2 = p(aVar, str, requestArr, this.f11093g);
            }
        }
        if (kVar2 != null && this.f11091e != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(kVar2);
            arrayList.add(n(aVar, str, this.f11091e));
            kVar2 = com.facebook.datasource.g.d(arrayList, false);
        }
        return kVar2 == null ? com.facebook.datasource.d.a(f11085q) : kVar2;
    }

    public BUILDER D() {
        x();
        return w();
    }

    public BUILDER E(boolean z4) {
        this.f11098l = z4;
        return w();
    }

    @Override // o0.d
    /* renamed from: F */
    public BUILDER b(Object obj) {
        this.f11089c = obj;
        return w();
    }

    public BUILDER G(String str) {
        this.f11100n = str;
        return w();
    }

    public BUILDER H(@Nullable c<? super INFO> cVar) {
        this.f11095i = cVar;
        return w();
    }

    public BUILDER I(@Nullable d dVar) {
        this.f11096j = dVar;
        return w();
    }

    public BUILDER J(@Nullable k<com.facebook.datasource.c<IMAGE>> kVar) {
        this.f11094h = kVar;
        return w();
    }

    public BUILDER K(REQUEST[] requestArr) {
        return L(requestArr, true);
    }

    public BUILDER L(REQUEST[] requestArr, boolean z4) {
        h.e(requestArr == null || requestArr.length > 0, "No requests specified!");
        this.f11092f = requestArr;
        this.f11093g = z4;
        return w();
    }

    public BUILDER M(REQUEST request) {
        this.f11090d = request;
        return w();
    }

    public BUILDER N(REQUEST request) {
        this.f11091e = request;
        return w();
    }

    @Override // o0.d
    /* renamed from: O */
    public BUILDER c(@Nullable o0.a aVar) {
        this.f11101o = aVar;
        return w();
    }

    public BUILDER P(boolean z4) {
        this.f11099m = z4;
        return w();
    }

    public BUILDER Q(boolean z4) {
        this.f11097k = z4;
        return w();
    }

    protected void R() {
        boolean z4 = false;
        h.p(this.f11092f == null || this.f11090d == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f11094h == null || (this.f11092f == null && this.f11090d == null && this.f11091e == null)) {
            z4 = true;
        }
        h.p(z4, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // o0.d
    /* renamed from: d */
    public com.facebook.drawee.controller.a build() {
        REQUEST request;
        R();
        if (this.f11090d == null && this.f11092f == null && (request = this.f11091e) != null) {
            this.f11090d = request;
            this.f11091e = null;
        }
        return e();
    }

    protected com.facebook.drawee.controller.a e() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        com.facebook.drawee.controller.a B = B();
        B.N(u());
        B.d(i());
        B.L(k());
        A(B);
        y(B);
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return B;
    }

    public boolean g() {
        return this.f11098l;
    }

    protected Context getContext() {
        return this.f11087a;
    }

    @Nullable
    public Object h() {
        return this.f11089c;
    }

    @Nullable
    public String i() {
        return this.f11100n;
    }

    @Nullable
    public c<? super INFO> j() {
        return this.f11095i;
    }

    @Nullable
    public d k() {
        return this.f11096j;
    }

    protected abstract com.facebook.datasource.c<IMAGE> l(o0.a aVar, String str, REQUEST request, Object obj, CacheLevel cacheLevel);

    @Nullable
    public k<com.facebook.datasource.c<IMAGE>> m() {
        return this.f11094h;
    }

    protected k<com.facebook.datasource.c<IMAGE>> n(o0.a aVar, String str, REQUEST request) {
        return o(aVar, str, request, CacheLevel.FULL_FETCH);
    }

    protected k<com.facebook.datasource.c<IMAGE>> o(o0.a aVar, String str, REQUEST request, CacheLevel cacheLevel) {
        return new b(aVar, str, request, h(), cacheLevel);
    }

    protected k<com.facebook.datasource.c<IMAGE>> p(o0.a aVar, String str, REQUEST[] requestArr, boolean z4) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z4) {
            for (REQUEST request : requestArr) {
                arrayList.add(o(aVar, str, request, CacheLevel.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(n(aVar, str, request2));
        }
        return f.b(arrayList);
    }

    @Nullable
    public REQUEST[] q() {
        return this.f11092f;
    }

    @Nullable
    public REQUEST r() {
        return this.f11090d;
    }

    @Nullable
    public REQUEST s() {
        return this.f11091e;
    }

    @Nullable
    public o0.a t() {
        return this.f11101o;
    }

    public boolean u() {
        return this.f11099m;
    }

    public boolean v() {
        return this.f11097k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BUILDER w() {
        return this;
    }

    protected void y(com.facebook.drawee.controller.a aVar) {
        Set<c> set = this.f11088b;
        if (set != null) {
            for (c cVar : set) {
                aVar.k(cVar);
            }
        }
        c<? super INFO> cVar2 = this.f11095i;
        if (cVar2 != null) {
            aVar.k(cVar2);
        }
        if (this.f11098l) {
            aVar.k(f11084p);
        }
    }

    protected void z(com.facebook.drawee.controller.a aVar) {
        if (aVar.r() == null) {
            aVar.M(com.facebook.drawee.gestures.a.c(this.f11087a));
        }
    }
}
