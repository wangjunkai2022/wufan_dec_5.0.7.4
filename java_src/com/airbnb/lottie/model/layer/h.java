package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.o;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.s0;
import com.airbnb.lottie.value.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: TextLayer.java */
/* loaded from: classes2.dex */
public class h extends com.airbnb.lottie.model.layer.b {
    private final StringBuilder H;
    private final RectF I;
    private final Matrix J;
    private final Paint K;
    private final Paint L;
    private final Map<com.airbnb.lottie.model.c, List<com.airbnb.lottie.animation.content.d>> M;
    private final LongSparseArray<String> N;
    private final o O;
    private final LottieDrawable P;
    private final k Q;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> R;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> S;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> T;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> U;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> V;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> W;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> X;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> Y;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> Z;
    @Nullable

    /* renamed from: a0  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> f4107a0;

    /* compiled from: TextLayer.java */
    /* loaded from: classes2.dex */
    class a extends Paint {
        a(int i4) {
            super(i4);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes2.dex */
    class b extends Paint {
        b(int i4) {
            super(i4);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextLayer.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4110a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f4110a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4110a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4110a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.a aVar;
        com.airbnb.lottie.model.animatable.a aVar2;
        this.H = new StringBuilder(2);
        this.I = new RectF();
        this.J = new Matrix();
        this.K = new a(1);
        this.L = new b(1);
        this.M = new HashMap();
        this.N = new LongSparseArray<>();
        this.P = lottieDrawable;
        this.Q = layer.b();
        o a5 = layer.s().a();
        this.O = a5;
        a5.a(this);
        i(a5);
        com.airbnb.lottie.model.animatable.k t4 = layer.t();
        if (t4 != null && (aVar2 = t4.f3922a) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a6 = aVar2.a();
            this.R = a6;
            a6.a(this);
            i(this.R);
        }
        if (t4 != null && (aVar = t4.f3923b) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a7 = aVar.a();
            this.T = a7;
            a7.a(this);
            i(this.T);
        }
        if (t4 != null && (bVar2 = t4.f3924c) != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a8 = bVar2.a();
            this.V = a8;
            a8.a(this);
            i(this.V);
        }
        if (t4 == null || (bVar = t4.f3925d) == null) {
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a9 = bVar.a();
        this.X = a9;
        a9.a(this);
        i(this.X);
    }

    private void O(DocumentData.Justification justification, Canvas canvas, float f5) {
        int i4 = c.f4110a[justification.ordinal()];
        if (i4 == 2) {
            canvas.translate(-f5, 0.0f);
        } else if (i4 != 3) {
        } else {
            canvas.translate((-f5) / 2.0f, 0.0f);
        }
    }

    private String P(String str, int i4) {
        int codePointAt = str.codePointAt(i4);
        int charCount = Character.charCount(codePointAt) + i4;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!c0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j4 = codePointAt;
        if (this.N.containsKey(j4)) {
            return this.N.get(j4);
        }
        this.H.setLength(0);
        while (i4 < charCount) {
            int codePointAt3 = str.codePointAt(i4);
            this.H.appendCodePoint(codePointAt3);
            i4 += Character.charCount(codePointAt3);
        }
        String sb = this.H.toString();
        this.N.put(j4, sb);
        return sb;
    }

    private void Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void R(com.airbnb.lottie.model.c cVar, Matrix matrix, float f5, DocumentData documentData, Canvas canvas) {
        List<com.airbnb.lottie.animation.content.d> Y = Y(cVar);
        for (int i4 = 0; i4 < Y.size(); i4++) {
            Path path = Y.get(i4).getPath();
            path.computeBounds(this.I, false);
            this.J.set(matrix);
            this.J.preTranslate(0.0f, (-documentData.f3911g) * com.airbnb.lottie.utils.h.e());
            this.J.preScale(f5, f5);
            path.transform(this.J);
            if (documentData.f3915k) {
                U(path, this.K, canvas);
                U(path, this.L, canvas);
            } else {
                U(path, this.L, canvas);
                U(path, this.K, canvas);
            }
        }
    }

    private void S(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.f3915k) {
            Q(str, this.K, canvas);
            Q(str, this.L, canvas);
            return;
        }
        Q(str, this.L, canvas);
        Q(str, this.K, canvas);
    }

    private void T(String str, DocumentData documentData, Canvas canvas, float f5) {
        int i4 = 0;
        while (i4 < str.length()) {
            String P = P(str, i4);
            i4 += P.length();
            S(P, documentData, canvas);
            canvas.translate(this.K.measureText(P) + f5, 0.0f);
        }
    }

    private void U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void V(String str, DocumentData documentData, Matrix matrix, com.airbnb.lottie.model.b bVar, Canvas canvas, float f5, float f6) {
        float floatValue;
        for (int i4 = 0; i4 < str.length(); i4++) {
            com.airbnb.lottie.model.c cVar = this.Q.c().get(com.airbnb.lottie.model.c.c(str.charAt(i4), bVar.b(), bVar.d()));
            if (cVar != null) {
                R(cVar, matrix, f6, documentData, canvas);
                float b5 = ((float) cVar.b()) * f6 * com.airbnb.lottie.utils.h.e() * f5;
                float f7 = documentData.f3909e / 10.0f;
                com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.Y;
                if (aVar != null) {
                    floatValue = aVar.h().floatValue();
                } else {
                    com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.X;
                    if (aVar2 != null) {
                        floatValue = aVar2.h().floatValue();
                    }
                    canvas.translate(b5 + (f7 * f5), 0.0f);
                }
                f7 += floatValue;
                canvas.translate(b5 + (f7 * f5), 0.0f);
            }
        }
    }

    private void W(DocumentData documentData, Matrix matrix, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        float f5;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.Z;
        if (aVar != null) {
            f5 = aVar.h().floatValue();
        } else {
            f5 = documentData.f3907c;
        }
        float f6 = f5 / 100.0f;
        float g4 = com.airbnb.lottie.utils.h.g(matrix);
        String str = documentData.f3905a;
        float e5 = documentData.f3910f * com.airbnb.lottie.utils.h.e();
        List<String> a02 = a0(str);
        int size = a02.size();
        for (int i4 = 0; i4 < size; i4++) {
            String str2 = a02.get(i4);
            float Z = Z(str2, bVar, f6, g4);
            canvas.save();
            O(documentData.f3908d, canvas, Z);
            canvas.translate(0.0f, (i4 * e5) - (((size - 1) * e5) / 2.0f));
            V(str2, documentData, matrix, bVar, canvas, g4, f6);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[LOOP:0: B:20:0x0091->B:21:0x0093, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void X(com.airbnb.lottie.model.DocumentData r8, com.airbnb.lottie.model.b r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.b0(r9)
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.f3905a
            com.airbnb.lottie.LottieDrawable r1 = r7.P
            com.airbnb.lottie.z0 r1 = r1.d0()
            if (r1 == 0) goto L19
            java.lang.String r2 = r7.getName()
            java.lang.String r0 = r1.c(r2, r0)
        L19:
            android.graphics.Paint r1 = r7.K
            r1.setTypeface(r9)
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r9 = r7.Z
            if (r9 == 0) goto L2d
            java.lang.Object r9 = r9.h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L2f
        L2d:
            float r9 = r8.f3907c
        L2f:
            android.graphics.Paint r1 = r7.K
            float r2 = com.airbnb.lottie.utils.h.e()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.L
            android.graphics.Paint r2 = r7.K
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.L
            android.graphics.Paint r2 = r7.K
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f3910f
            float r2 = com.airbnb.lottie.utils.h.e()
            float r1 = r1 * r2
            int r2 = r8.f3909e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r3 = r7.Y
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6c:
            float r2 = r2 + r3
            goto L7d
        L6e:
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r3 = r7.X
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6c
        L7d:
            float r3 = com.airbnb.lottie.utils.h.e()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.a0(r0)
            int r0 = r9.size()
            r3 = 0
        L91:
            if (r3 >= r0) goto Lca
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.L
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            com.airbnb.lottie.model.DocumentData$Justification r6 = r8.f3908d
            r7.O(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.T(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L91
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.h.X(com.airbnb.lottie.model.DocumentData, com.airbnb.lottie.model.b, android.graphics.Canvas):void");
    }

    private List<com.airbnb.lottie.animation.content.d> Y(com.airbnb.lottie.model.c cVar) {
        if (this.M.containsKey(cVar)) {
            return this.M.get(cVar);
        }
        List<l> a5 = cVar.a();
        int size = a5.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new com.airbnb.lottie.animation.content.d(this.P, this, a5.get(i4)));
        }
        this.M.put(cVar, arrayList);
        return arrayList;
    }

    private float Z(String str, com.airbnb.lottie.model.b bVar, float f5, float f6) {
        float f7 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            com.airbnb.lottie.model.c cVar = this.Q.c().get(com.airbnb.lottie.model.c.c(str.charAt(i4), bVar.b(), bVar.d()));
            if (cVar != null) {
                double d5 = f7;
                double b5 = cVar.b();
                double d6 = f5;
                Double.isNaN(d6);
                double d7 = b5 * d6;
                double e5 = com.airbnb.lottie.utils.h.e();
                Double.isNaN(e5);
                double d8 = d7 * e5;
                double d9 = f6;
                Double.isNaN(d9);
                Double.isNaN(d5);
                f7 = (float) (d5 + (d8 * d9));
            }
        }
        return f7;
    }

    private List<String> a0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Nullable
    private Typeface b0(com.airbnb.lottie.model.b bVar) {
        Typeface h4;
        com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar = this.f4107a0;
        if (aVar == null || (h4 = aVar.h()) == null) {
            Typeface e02 = this.P.e0(bVar.b(), bVar.d());
            return e02 != null ? e02 : bVar.e();
        }
        return h4;
    }

    private boolean c0(int i4) {
        return Character.getType(i4) == 16 || Character.getType(i4) == 27 || Character.getType(i4) == 6 || Character.getType(i4) == 28 || Character.getType(i4) == 8 || Character.getType(i4) == 19;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.f4269a) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.S;
            if (aVar != null) {
                G(aVar);
            }
            if (jVar == null) {
                this.S = null;
                return;
            }
            q qVar = new q(jVar);
            this.S = qVar;
            qVar.a(this);
            i(this.S);
        } else if (t4 == s0.f4270b) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.U;
            if (aVar2 != null) {
                G(aVar2);
            }
            if (jVar == null) {
                this.U = null;
                return;
            }
            q qVar2 = new q(jVar);
            this.U = qVar2;
            qVar2.a(this);
            i(this.U);
        } else if (t4 == s0.f4287s) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar3 = this.W;
            if (aVar3 != null) {
                G(aVar3);
            }
            if (jVar == null) {
                this.W = null;
                return;
            }
            q qVar3 = new q(jVar);
            this.W = qVar3;
            qVar3.a(this);
            i(this.W);
        } else if (t4 == s0.f4288t) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar4 = this.Y;
            if (aVar4 != null) {
                G(aVar4);
            }
            if (jVar == null) {
                this.Y = null;
                return;
            }
            q qVar4 = new q(jVar);
            this.Y = qVar4;
            qVar4.a(this);
            i(this.Y);
        } else if (t4 == s0.F) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.Z;
            if (aVar5 != null) {
                G(aVar5);
            }
            if (jVar == null) {
                this.Z = null;
                return;
            }
            q qVar5 = new q(jVar);
            this.Z = qVar5;
            qVar5.a(this);
            i(this.Z);
        } else if (t4 == s0.M) {
            com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar6 = this.f4107a0;
            if (aVar6 != null) {
                G(aVar6);
            }
            if (jVar == null) {
                this.f4107a0 = null;
                return;
            }
            q qVar6 = new q(jVar);
            this.f4107a0 = qVar6;
            qVar6.a(this);
            i(this.f4107a0);
        } else if (t4 == s0.O) {
            this.O.q(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        rectF.set(0.0f, 0.0f, this.Q.b().width(), this.Q.b().height());
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i4) {
        canvas.save();
        if (!this.P.t1()) {
            canvas.concat(matrix);
        }
        DocumentData h4 = this.O.h();
        com.airbnb.lottie.model.b bVar = this.Q.g().get(h4.f3906b);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.S;
        if (aVar != null) {
            this.K.setColor(aVar.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.R;
            if (aVar2 != null) {
                this.K.setColor(aVar2.h().intValue());
            } else {
                this.K.setColor(h4.f3912h);
            }
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar3 = this.U;
        if (aVar3 != null) {
            this.L.setColor(aVar3.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar4 = this.T;
            if (aVar4 != null) {
                this.L.setColor(aVar4.h().intValue());
            } else {
                this.L.setColor(h4.f3913i);
            }
        }
        int intValue = ((this.f4101x.h() == null ? 100 : this.f4101x.h().h().intValue()) * 255) / 100;
        this.K.setAlpha(intValue);
        this.L.setAlpha(intValue);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.W;
        if (aVar5 != null) {
            this.L.setStrokeWidth(aVar5.h().floatValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar6 = this.V;
            if (aVar6 != null) {
                this.L.setStrokeWidth(aVar6.h().floatValue());
            } else {
                this.L.setStrokeWidth(h4.f3914j * com.airbnb.lottie.utils.h.e() * com.airbnb.lottie.utils.h.g(matrix));
            }
        }
        if (this.P.t1()) {
            W(h4, matrix, bVar, canvas);
        } else {
            X(h4, bVar, canvas);
        }
        canvas.restore();
    }
}
