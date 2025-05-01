package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: LottieComposition.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<Layer>> f3869c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, o0> f3870d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, com.airbnb.lottie.model.b> f3871e;

    /* renamed from: f  reason: collision with root package name */
    private List<com.airbnb.lottie.model.g> f3872f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArrayCompat<com.airbnb.lottie.model.c> f3873g;

    /* renamed from: h  reason: collision with root package name */
    private LongSparseArray<Layer> f3874h;

    /* renamed from: i  reason: collision with root package name */
    private List<Layer> f3875i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f3876j;

    /* renamed from: k  reason: collision with root package name */
    private float f3877k;

    /* renamed from: l  reason: collision with root package name */
    private float f3878l;

    /* renamed from: m  reason: collision with root package name */
    private float f3879m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3880n;

    /* renamed from: a  reason: collision with root package name */
    private final x0 f3867a = new x0();

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<String> f3868b = new HashSet<>();

    /* renamed from: o  reason: collision with root package name */
    private int f3881o = 0;

    /* compiled from: LottieComposition.java */
    @Deprecated
    /* loaded from: classes2.dex */
    public static class b {

        /* compiled from: LottieComposition.java */
        /* loaded from: classes2.dex */
        private static final class a implements p0<k>, com.airbnb.lottie.b {

            /* renamed from: a  reason: collision with root package name */
            private final w0 f3882a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f3883b;

            @Override // com.airbnb.lottie.p0
            /* renamed from: a */
            public void onResult(k kVar) {
                if (this.f3883b) {
                    return;
                }
                this.f3882a.a(kVar);
            }

            @Override // com.airbnb.lottie.b
            public void cancel() {
                this.f3883b = true;
            }

            private a(w0 w0Var) {
                this.f3883b = false;
                this.f3882a = w0Var;
            }
        }

        private b() {
        }

        @Deprecated
        public static com.airbnb.lottie.b a(Context context, String str, w0 w0Var) {
            a aVar = new a(w0Var);
            x.o(context, str).d(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k b(Context context, String str) {
            return x.q(context, str).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b c(InputStream inputStream, w0 w0Var) {
            a aVar = new a(w0Var);
            x.t(inputStream, null).d(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k d(InputStream inputStream) {
            return x.u(inputStream, null).b();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k e(InputStream inputStream, boolean z4) {
            if (z4) {
                com.airbnb.lottie.utils.d.e("Lottie now auto-closes input stream!");
            }
            return x.u(inputStream, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b f(JsonReader jsonReader, w0 w0Var) {
            a aVar = new a(w0Var);
            x.w(jsonReader, null).d(aVar);
            return aVar;
        }

        @Deprecated
        public static com.airbnb.lottie.b g(String str, w0 w0Var) {
            a aVar = new a(w0Var);
            x.z(str, null).d(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k h(Resources resources, JSONObject jSONObject) {
            return x.B(jSONObject, null).b();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k i(JsonReader jsonReader) {
            return x.x(jsonReader, null).b();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k j(String str) {
            return x.A(str, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b k(Context context, @RawRes int i4, w0 w0Var) {
            a aVar = new a(w0Var);
            x.C(context, i4).d(aVar);
            return aVar;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(String str) {
        com.airbnb.lottie.utils.d.e(str);
        this.f3868b.add(str);
    }

    public Rect b() {
        return this.f3876j;
    }

    public SparseArrayCompat<com.airbnb.lottie.model.c> c() {
        return this.f3873g;
    }

    public float d() {
        return (e() / this.f3879m) * 1000.0f;
    }

    public float e() {
        return this.f3878l - this.f3877k;
    }

    public float f() {
        return this.f3878l;
    }

    public Map<String, com.airbnb.lottie.model.b> g() {
        return this.f3871e;
    }

    public float h(float f5) {
        return com.airbnb.lottie.utils.g.k(this.f3877k, this.f3878l, f5);
    }

    public float i() {
        return this.f3879m;
    }

    public Map<String, o0> j() {
        return this.f3870d;
    }

    public List<Layer> k() {
        return this.f3875i;
    }

    @Nullable
    public com.airbnb.lottie.model.g l(String str) {
        int size = this.f3872f.size();
        for (int i4 = 0; i4 < size; i4++) {
            com.airbnb.lottie.model.g gVar = this.f3872f.get(i4);
            if (gVar.d(str)) {
                return gVar;
            }
        }
        return null;
    }

    public List<com.airbnb.lottie.model.g> m() {
        return this.f3872f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int n() {
        return this.f3881o;
    }

    public x0 o() {
        return this.f3867a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> p(String str) {
        return this.f3869c.get(str);
    }

    public float q(float f5) {
        float f6 = this.f3877k;
        return (f5 - f6) / (this.f3878l - f6);
    }

    public float r() {
        return this.f3877k;
    }

    public ArrayList<String> s() {
        HashSet<String> hashSet = this.f3868b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean t() {
        return this.f3880n;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.f3875i) {
            sb.append(layer.y("\t"));
        }
        return sb.toString();
    }

    public boolean u() {
        return !this.f3870d.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void v(int i4) {
        this.f3881o += i4;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void w(Rect rect, float f5, float f6, float f7, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, o0> map2, SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat, Map<String, com.airbnb.lottie.model.b> map3, List<com.airbnb.lottie.model.g> list2) {
        this.f3876j = rect;
        this.f3877k = f5;
        this.f3878l = f6;
        this.f3879m = f7;
        this.f3875i = list;
        this.f3874h = longSparseArray;
        this.f3869c = map;
        this.f3870d = map2;
        this.f3873g = sparseArrayCompat;
        this.f3871e = map3;
        this.f3872f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer x(long j4) {
        return this.f3874h.get(j4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void y(boolean z4) {
        this.f3880n = z4;
    }

    public void z(boolean z4) {
        this.f3867a.g(z4);
    }
}
