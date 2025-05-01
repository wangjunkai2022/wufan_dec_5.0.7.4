package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes2.dex */
public abstract class a<K, A> {

    /* renamed from: c  reason: collision with root package name */
    private final d<K> f3766c;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    protected com.airbnb.lottie.value.j<A> f3768e;

    /* renamed from: a  reason: collision with root package name */
    final List<b> f3764a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    private boolean f3765b = false;

    /* renamed from: d  reason: collision with root package name */
    protected float f3767d = 0.0f;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private A f3769f = null;

    /* renamed from: g  reason: collision with root package name */
    private float f3770g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f3771h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes2.dex */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f5) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f5) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes2.dex */
    public interface d<T> {
        boolean a(float f5);

        com.airbnb.lottie.value.a<T> b();

        boolean c(float f5);

        @FloatRange(from = 0.0d, to = 1.0d)
        float d();

        @FloatRange(from = 0.0d, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes2.dex */
    public static final class e<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends com.airbnb.lottie.value.a<T>> f3772a;

        /* renamed from: c  reason: collision with root package name */
        private com.airbnb.lottie.value.a<T> f3774c = null;

        /* renamed from: d  reason: collision with root package name */
        private float f3775d = -1.0f;
        @NonNull

        /* renamed from: b  reason: collision with root package name */
        private com.airbnb.lottie.value.a<T> f3773b = f(0.0f);

        e(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f3772a = list;
        }

        private com.airbnb.lottie.value.a<T> f(float f5) {
            List<? extends com.airbnb.lottie.value.a<T>> list = this.f3772a;
            com.airbnb.lottie.value.a<T> aVar = list.get(list.size() - 1);
            if (f5 >= aVar.e()) {
                return aVar;
            }
            for (int size = this.f3772a.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.value.a<T> aVar2 = this.f3772a.get(size);
                if (this.f3773b != aVar2 && aVar2.a(f5)) {
                    return aVar2;
                }
            }
            return this.f3772a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f5) {
            com.airbnb.lottie.value.a<T> aVar = this.f3774c;
            com.airbnb.lottie.value.a<T> aVar2 = this.f3773b;
            if (aVar == aVar2 && this.f3775d == f5) {
                return true;
            }
            this.f3774c = aVar2;
            this.f3775d = f5;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        @NonNull
        public com.airbnb.lottie.value.a<T> b() {
            return this.f3773b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f5) {
            if (this.f3773b.a(f5)) {
                return !this.f3773b.h();
            }
            this.f3773b = f(f5);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return this.f3772a.get(0).e();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            List<? extends com.airbnb.lottie.value.a<T>> list = this.f3772a;
            return list.get(list.size() - 1).b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes2.dex */
    public static final class f<T> implements d<T> {
        @NonNull

        /* renamed from: a  reason: collision with root package name */
        private final com.airbnb.lottie.value.a<T> f3776a;

        /* renamed from: b  reason: collision with root package name */
        private float f3777b = -1.0f;

        f(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f3776a = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f5) {
            if (this.f3777b == f5) {
                return true;
            }
            this.f3777b = f5;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> b() {
            return this.f3776a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f5) {
            return !this.f3776a.h();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return this.f3776a.e();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return this.f3776a.b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(List<? extends com.airbnb.lottie.value.a<K>> list) {
        this.f3766c = o(list);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    private float g() {
        if (this.f3770g == -1.0f) {
            this.f3770g = this.f3766c.d();
        }
        return this.f3770g;
    }

    private static <T> d<T> o(List<? extends com.airbnb.lottie.value.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.f3764a.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.airbnb.lottie.value.a<K> b() {
        com.airbnb.lottie.e.a("BaseKeyframeAnimation#getCurrentKeyframe");
        com.airbnb.lottie.value.a<K> b5 = this.f3766c.b();
        com.airbnb.lottie.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b5;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    float c() {
        if (this.f3771h == -1.0f) {
            this.f3771h = this.f3766c.e();
        }
        return this.f3771h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float d() {
        com.airbnb.lottie.value.a<K> b5 = b();
        if (b5 == null || b5.h()) {
            return 0.0f;
        }
        return b5.f4339d.getInterpolation(e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        if (this.f3765b) {
            return 0.0f;
        }
        com.airbnb.lottie.value.a<K> b5 = b();
        if (b5.h()) {
            return 0.0f;
        }
        return (this.f3767d - b5.e()) / (b5.b() - b5.e());
    }

    public float f() {
        return this.f3767d;
    }

    public A h() {
        A i4;
        float e5 = e();
        if (this.f3768e == null && this.f3766c.a(e5)) {
            return this.f3769f;
        }
        com.airbnb.lottie.value.a<K> b5 = b();
        Interpolator interpolator = b5.f4340e;
        if (interpolator != null && b5.f4341f != null) {
            i4 = j(b5, e5, interpolator.getInterpolation(e5), b5.f4341f.getInterpolation(e5));
        } else {
            i4 = i(b5, d());
        }
        this.f3769f = i4;
        return i4;
    }

    abstract A i(com.airbnb.lottie.value.a<K> aVar, float f5);

    protected A j(com.airbnb.lottie.value.a<K> aVar, float f5, float f6, float f7) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i4 = 0; i4 < this.f3764a.size(); i4++) {
            this.f3764a.get(i4).a();
        }
    }

    public void l() {
        this.f3765b = true;
    }

    public void m(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        if (this.f3766c.isEmpty()) {
            return;
        }
        if (f5 < g()) {
            f5 = g();
        } else if (f5 > c()) {
            f5 = c();
        }
        if (f5 == this.f3767d) {
            return;
        }
        this.f3767d = f5;
        if (this.f3766c.c(f5)) {
            k();
        }
    }

    public void n(@Nullable com.airbnb.lottie.value.j<A> jVar) {
        com.airbnb.lottie.value.j<A> jVar2 = this.f3768e;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f3768e = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
