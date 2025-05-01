package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.u;
import java.util.List;
/* loaded from: classes2.dex */
public class ShapeStroke implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f3965a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3966b;

    /* renamed from: c  reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f3967c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.a f3968d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f3969e;

    /* renamed from: f  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3970f;

    /* renamed from: g  reason: collision with root package name */
    private final LineCapType f3971g;

    /* renamed from: h  reason: collision with root package name */
    private final LineJoinType f3972h;

    /* renamed from: i  reason: collision with root package name */
    private final float f3973i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f3974j;

    /* loaded from: classes2.dex */
    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i4 = a.f3975a[ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes2.dex */
    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i4 = a.f3976b[ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3975a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f3976b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f3976b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3976b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3976b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f3975a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3975a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3975a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @Nullable com.airbnb.lottie.model.animatable.b bVar, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f5, boolean z4) {
        this.f3965a = str;
        this.f3966b = bVar;
        this.f3967c = list;
        this.f3968d = aVar;
        this.f3969e = dVar;
        this.f3970f = bVar2;
        this.f3971g = lineCapType;
        this.f3972h = lineJoinType;
        this.f3973i = f5;
        this.f3974j = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new u(lottieDrawable, bVar, this);
    }

    public LineCapType b() {
        return this.f3971g;
    }

    public com.airbnb.lottie.model.animatable.a c() {
        return this.f3968d;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f3966b;
    }

    public LineJoinType e() {
        return this.f3972h;
    }

    public List<com.airbnb.lottie.model.animatable.b> f() {
        return this.f3967c;
    }

    public float g() {
        return this.f3973i;
    }

    public String h() {
        return this.f3965a;
    }

    public com.airbnb.lottie.model.animatable.d i() {
        return this.f3969e;
    }

    public com.airbnb.lottie.model.animatable.b j() {
        return this.f3970f;
    }

    public boolean k() {
        return this.f3974j;
    }
}
