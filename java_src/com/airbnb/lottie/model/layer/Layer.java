package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.animatable.j;
import com.airbnb.lottie.model.animatable.l;
import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public class Layer {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.c> f4053a;

    /* renamed from: b  reason: collision with root package name */
    private final k f4054b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4055c;

    /* renamed from: d  reason: collision with root package name */
    private final long f4056d;

    /* renamed from: e  reason: collision with root package name */
    private final LayerType f4057e;

    /* renamed from: f  reason: collision with root package name */
    private final long f4058f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final String f4059g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Mask> f4060h;

    /* renamed from: i  reason: collision with root package name */
    private final l f4061i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4062j;

    /* renamed from: k  reason: collision with root package name */
    private final int f4063k;

    /* renamed from: l  reason: collision with root package name */
    private final int f4064l;

    /* renamed from: m  reason: collision with root package name */
    private final float f4065m;

    /* renamed from: n  reason: collision with root package name */
    private final float f4066n;

    /* renamed from: o  reason: collision with root package name */
    private final int f4067o;

    /* renamed from: p  reason: collision with root package name */
    private final int f4068p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private final j f4069q;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.k f4070r;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f4071s;

    /* renamed from: t  reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<Float>> f4072t;

    /* renamed from: u  reason: collision with root package name */
    private final MatteType f4073u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f4074v;
    @Nullable

    /* renamed from: w  reason: collision with root package name */
    private final com.airbnb.lottie.model.content.a f4075w;
    @Nullable

    /* renamed from: x  reason: collision with root package name */
    private final com.airbnb.lottie.parser.j f4076x;

    /* loaded from: classes2.dex */
    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes2.dex */
    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<com.airbnb.lottie.model.content.c> list, k kVar, String str, long j4, LayerType layerType, long j5, @Nullable String str2, List<Mask> list2, l lVar, int i4, int i5, int i6, float f5, float f6, int i7, int i8, @Nullable j jVar, @Nullable com.airbnb.lottie.model.animatable.k kVar2, List<com.airbnb.lottie.value.a<Float>> list3, MatteType matteType, @Nullable com.airbnb.lottie.model.animatable.b bVar, boolean z4, @Nullable com.airbnb.lottie.model.content.a aVar, @Nullable com.airbnb.lottie.parser.j jVar2) {
        this.f4053a = list;
        this.f4054b = kVar;
        this.f4055c = str;
        this.f4056d = j4;
        this.f4057e = layerType;
        this.f4058f = j5;
        this.f4059g = str2;
        this.f4060h = list2;
        this.f4061i = lVar;
        this.f4062j = i4;
        this.f4063k = i5;
        this.f4064l = i6;
        this.f4065m = f5;
        this.f4066n = f6;
        this.f4067o = i7;
        this.f4068p = i8;
        this.f4069q = jVar;
        this.f4070r = kVar2;
        this.f4072t = list3;
        this.f4073u = matteType;
        this.f4071s = bVar;
        this.f4074v = z4;
        this.f4075w = aVar;
        this.f4076x = jVar2;
    }

    @Nullable
    public com.airbnb.lottie.model.content.a a() {
        return this.f4075w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k b() {
        return this.f4054b;
    }

    @Nullable
    public com.airbnb.lottie.parser.j c() {
        return this.f4076x;
    }

    public long d() {
        return this.f4056d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.value.a<Float>> e() {
        return this.f4072t;
    }

    public LayerType f() {
        return this.f4057e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Mask> g() {
        return this.f4060h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MatteType h() {
        return this.f4073u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        return this.f4055c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long j() {
        return this.f4058f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f4068p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f4067o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public String m() {
        return this.f4059g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.model.content.c> n() {
        return this.f4053a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f4064l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f4063k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.f4062j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float r() {
        return this.f4066n / this.f4054b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public j s() {
        return this.f4069q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public com.airbnb.lottie.model.animatable.k t() {
        return this.f4070r;
    }

    public String toString() {
        return y("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public com.airbnb.lottie.model.animatable.b u() {
        return this.f4071s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float v() {
        return this.f4065m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l w() {
        return this.f4061i;
    }

    public boolean x() {
        return this.f4074v;
    }

    public String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i());
        sb.append("\n");
        Layer x4 = this.f4054b.x(j());
        if (x4 != null) {
            sb.append("\t\tParents: ");
            sb.append(x4.i());
            Layer x5 = this.f4054b.x(x4.j());
            while (x5 != null) {
                sb.append("->");
                sb.append(x5.i());
                x5 = this.f4054b.x(x5.j());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!g().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(g().size());
            sb.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.f4053a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.c cVar : this.f4053a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(cVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
