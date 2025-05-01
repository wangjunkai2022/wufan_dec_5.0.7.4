package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int M = 1;
    public static final int N = 2;
    public static final int O = -1;
    private Bitmap A;
    private Canvas B;
    private Rect C;
    private RectF D;
    private Paint E;
    private Rect F;
    private Rect G;
    private RectF H;
    private RectF I;
    private Matrix J;
    private Matrix K;
    private boolean L;

    /* renamed from: b  reason: collision with root package name */
    private k f3573b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.utils.e f3574c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3575d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3576e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3577f;

    /* renamed from: g  reason: collision with root package name */
    private OnVisibleAction f3578g;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<c> f3579h;

    /* renamed from: i  reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f3580i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private com.airbnb.lottie.manager.b f3581j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private String f3582k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private d f3583l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private com.airbnb.lottie.manager.a f3584m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    com.airbnb.lottie.c f3585n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    z0 f3586o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3587p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3588q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3589r;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private com.airbnb.lottie.model.layer.c f3590s;

    /* renamed from: t  reason: collision with root package name */
    private int f3591t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3592u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3593v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f3594w;

    /* renamed from: x  reason: collision with root package name */
    private RenderMode f3595x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f3596y;

    /* renamed from: z  reason: collision with root package name */
    private final Matrix f3597z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface RepeatMode {
    }

    /* loaded from: classes2.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (LottieDrawable.this.f3590s != null) {
                LottieDrawable.this.f3590s.L(LottieDrawable.this.f3574c.h());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class b<T> extends com.airbnb.lottie.value.j<T> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f3599d;

        b(com.airbnb.lottie.value.l lVar) {
            this.f3599d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f3599d.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface c {
        void a(k kVar);
    }

    public LottieDrawable() {
        com.airbnb.lottie.utils.e eVar = new com.airbnb.lottie.utils.e();
        this.f3574c = eVar;
        this.f3575d = true;
        this.f3576e = false;
        this.f3577f = false;
        this.f3578g = OnVisibleAction.NONE;
        this.f3579h = new ArrayList<>();
        a aVar = new a();
        this.f3580i = aVar;
        this.f3588q = false;
        this.f3589r = true;
        this.f3591t = 255;
        this.f3595x = RenderMode.AUTOMATIC;
        this.f3596y = false;
        this.f3597z = new Matrix();
        this.L = false;
        eVar.addUpdateListener(aVar);
    }

    private void A() {
        k kVar = this.f3573b;
        if (kVar == null) {
            return;
        }
        this.f3596y = this.f3595x.useSoftwareRendering(Build.VERSION.SDK_INT, kVar.t(), kVar.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(float f5, k kVar) {
        h1(f5);
    }

    private void B(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(float f5, k kVar) {
        k1(f5);
    }

    private void C(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void F(Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.f3590s;
        k kVar = this.f3573b;
        if (cVar == null || kVar == null) {
            return;
        }
        this.f3597z.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float height = bounds.height() / kVar.b().height();
            this.f3597z.preScale(bounds.width() / kVar.b().width(), height);
        }
        cVar.h(canvas, this.f3597z, this.f3591t);
    }

    private void J(int i4, int i5) {
        Bitmap bitmap = this.A;
        if (bitmap != null && bitmap.getWidth() >= i4 && this.A.getHeight() >= i5) {
            if (this.A.getWidth() > i4 || this.A.getHeight() > i5) {
                Bitmap createBitmap = Bitmap.createBitmap(this.A, 0, 0, i4, i5);
                this.A = createBitmap;
                this.B.setBitmap(createBitmap);
                this.L = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        this.A = createBitmap2;
        this.B.setBitmap(createBitmap2);
        this.L = true;
    }

    private void K() {
        if (this.B != null) {
            return;
        }
        this.B = new Canvas();
        this.I = new RectF();
        this.J = new Matrix();
        this.K = new Matrix();
        this.C = new Rect();
        this.D = new RectF();
        this.E = new com.airbnb.lottie.animation.a();
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
    }

    private void K0(Canvas canvas, com.airbnb.lottie.model.layer.c cVar) {
        if (this.f3573b == null || cVar == null) {
            return;
        }
        K();
        canvas.getMatrix(this.J);
        canvas.getClipBounds(this.C);
        B(this.C, this.D);
        this.J.mapRect(this.D);
        C(this.D, this.C);
        if (this.f3589r) {
            this.I.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.f(this.I, null, false);
        }
        this.J.mapRect(this.I);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        O0(this.I, width, height);
        if (!h0()) {
            RectF rectF = this.I;
            Rect rect = this.C;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.I.width());
        int ceil2 = (int) Math.ceil(this.I.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        J(ceil, ceil2);
        if (this.L) {
            this.f3597z.set(this.J);
            this.f3597z.preScale(width, height);
            Matrix matrix = this.f3597z;
            RectF rectF2 = this.I;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.A.eraseColor(0);
            cVar.h(this.B, this.f3597z, this.f3591t);
            this.J.invert(this.K);
            this.K.mapRect(this.H, this.I);
            C(this.H, this.G);
        }
        this.F.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.A, this.F, this.G, this.E);
    }

    private com.airbnb.lottie.manager.a O() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f3584m == null) {
            this.f3584m = new com.airbnb.lottie.manager.a(getCallback(), this.f3585n);
        }
        return this.f3584m;
    }

    private void O0(RectF rectF, float f5, float f6) {
        rectF.set(rectF.left * f5, rectF.top * f6, rectF.right * f5, rectF.bottom * f6);
    }

    private com.airbnb.lottie.manager.b R() {
        if (getCallback() == null) {
            return null;
        }
        com.airbnb.lottie.manager.b bVar = this.f3581j;
        if (bVar != null && !bVar.c(getContext())) {
            this.f3581j = null;
        }
        if (this.f3581j == null) {
            this.f3581j = new com.airbnb.lottie.manager.b(getCallback(), this.f3582k, this.f3583l, this.f3573b.j());
        }
        return this.f3581j;
    }

    @Nullable
    private Context getContext() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private boolean h0() {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (Build.VERSION.SDK_INT < 18 || !(parent instanceof ViewGroup)) {
                return false;
            }
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(com.airbnb.lottie.model.d dVar, Object obj, com.airbnb.lottie.value.j jVar, k kVar) {
        u(dVar, obj, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(k kVar) {
        E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(k kVar) {
        M0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(int i4, k kVar) {
        T0(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(int i4, k kVar) {
        Y0(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(String str, k kVar) {
        Z0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(float f5, k kVar) {
        a1(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(int i4, int i5, k kVar) {
        b1(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(String str, k kVar) {
        c1(str);
    }

    private boolean w() {
        return this.f3575d || this.f3576e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(String str, String str2, boolean z4, k kVar) {
        d1(str, str2, z4);
    }

    private void x() {
        k kVar = this.f3573b;
        if (kVar == null) {
            return;
        }
        com.airbnb.lottie.model.layer.c cVar = new com.airbnb.lottie.model.layer.c(this, com.airbnb.lottie.parser.v.a(kVar), kVar.k(), kVar);
        this.f3590s = cVar;
        if (this.f3593v) {
            cVar.J(true);
        }
        this.f3590s.Q(this.f3589r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(float f5, float f6, k kVar) {
        e1(f5, f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(int i4, k kVar) {
        f1(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(String str, k kVar) {
        g1(str);
    }

    @Deprecated
    public void C0(boolean z4) {
        this.f3574c.setRepeatCount(z4 ? -1 : 0);
    }

    @Deprecated
    public void D() {
    }

    public void D0() {
        this.f3579h.clear();
        this.f3574c.o();
        if (isVisible()) {
            return;
        }
        this.f3578g = OnVisibleAction.NONE;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void E(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.c cVar = this.f3590s;
        k kVar = this.f3573b;
        if (cVar == null || kVar == null) {
            return;
        }
        if (this.f3596y) {
            canvas.save();
            canvas.concat(matrix);
            K0(canvas, cVar);
            canvas.restore();
        } else {
            cVar.h(canvas, matrix, this.f3591t);
        }
        this.L = false;
    }

    @MainThread
    public void E0() {
        if (this.f3590s == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.f0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar) {
                    LottieDrawable.this.o0(kVar);
                }
            });
            return;
        }
        A();
        if (w() || a0() == 0) {
            if (isVisible()) {
                this.f3574c.p();
                this.f3578g = OnVisibleAction.NONE;
            } else {
                this.f3578g = OnVisibleAction.PLAY;
            }
        }
        if (w()) {
            return;
        }
        T0((int) (c0() < 0.0f ? W() : V()));
        this.f3574c.g();
        if (isVisible()) {
            return;
        }
        this.f3578g = OnVisibleAction.NONE;
    }

    public void F0() {
        this.f3574c.removeAllListeners();
    }

    public void G(boolean z4) {
        if (this.f3587p == z4) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            com.airbnb.lottie.utils.d.e("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.f3587p = z4;
        if (this.f3573b != null) {
            x();
        }
    }

    public void G0() {
        this.f3574c.removeAllUpdateListeners();
        this.f3574c.addUpdateListener(this.f3580i);
    }

    public boolean H() {
        return this.f3587p;
    }

    public void H0(Animator.AnimatorListener animatorListener) {
        this.f3574c.removeListener(animatorListener);
    }

    @MainThread
    public void I() {
        this.f3579h.clear();
        this.f3574c.g();
        if (isVisible()) {
            return;
        }
        this.f3578g = OnVisibleAction.NONE;
    }

    @RequiresApi(api = 19)
    public void I0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f3574c.removePauseListener(animatorPauseListener);
    }

    public void J0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f3574c.removeUpdateListener(animatorUpdateListener);
    }

    @Nullable
    public Bitmap L(String str) {
        com.airbnb.lottie.manager.b R = R();
        if (R != null) {
            return R.a(str);
        }
        return null;
    }

    public List<com.airbnb.lottie.model.d> L0(com.airbnb.lottie.model.d dVar) {
        if (this.f3590s == null) {
            com.airbnb.lottie.utils.d.e("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f3590s.e(dVar, 0, arrayList, new com.airbnb.lottie.model.d(new String[0]));
        return arrayList;
    }

    public boolean M() {
        return this.f3589r;
    }

    @MainThread
    public void M0() {
        if (this.f3590s == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.z
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar) {
                    LottieDrawable.this.p0(kVar);
                }
            });
            return;
        }
        A();
        if (w() || a0() == 0) {
            if (isVisible()) {
                this.f3574c.t();
                this.f3578g = OnVisibleAction.NONE;
            } else {
                this.f3578g = OnVisibleAction.RESUME;
            }
        }
        if (w()) {
            return;
        }
        T0((int) (c0() < 0.0f ? W() : V()));
        this.f3574c.g();
        if (isVisible()) {
            return;
        }
        this.f3578g = OnVisibleAction.NONE;
    }

    public k N() {
        return this.f3573b;
    }

    public void N0() {
        this.f3574c.u();
    }

    public int P() {
        return (int) this.f3574c.i();
    }

    public void P0(boolean z4) {
        this.f3594w = z4;
    }

    @Nullable
    @Deprecated
    public Bitmap Q(String str) {
        com.airbnb.lottie.manager.b R = R();
        if (R != null) {
            return R.a(str);
        }
        k kVar = this.f3573b;
        o0 o0Var = kVar == null ? null : kVar.j().get(str);
        if (o0Var != null) {
            return o0Var.a();
        }
        return null;
    }

    public void Q0(boolean z4) {
        if (z4 != this.f3589r) {
            this.f3589r = z4;
            com.airbnb.lottie.model.layer.c cVar = this.f3590s;
            if (cVar != null) {
                cVar.Q(z4);
            }
            invalidateSelf();
        }
    }

    public boolean R0(k kVar) {
        if (this.f3573b == kVar) {
            return false;
        }
        this.L = true;
        z();
        this.f3573b = kVar;
        x();
        this.f3574c.v(kVar);
        k1(this.f3574c.getAnimatedFraction());
        Iterator it2 = new ArrayList(this.f3579h).iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            if (cVar != null) {
                cVar.a(kVar);
            }
            it2.remove();
        }
        this.f3579h.clear();
        kVar.z(this.f3592u);
        A();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    @Nullable
    public String S() {
        return this.f3582k;
    }

    public void S0(com.airbnb.lottie.c cVar) {
        this.f3585n = cVar;
        com.airbnb.lottie.manager.a aVar = this.f3584m;
        if (aVar != null) {
            aVar.d(cVar);
        }
    }

    @Nullable
    public o0 T(String str) {
        k kVar = this.f3573b;
        if (kVar == null) {
            return null;
        }
        return kVar.j().get(str);
    }

    public void T0(final int i4) {
        if (this.f3573b == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.l0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar) {
                    LottieDrawable.this.q0(i4, kVar);
                }
            });
        } else {
            this.f3574c.w(i4);
        }
    }

    public boolean U() {
        return this.f3588q;
    }

    public void U0(boolean z4) {
        this.f3576e = z4;
    }

    public float V() {
        return this.f3574c.k();
    }

    public void V0(d dVar) {
        this.f3583l = dVar;
        com.airbnb.lottie.manager.b bVar = this.f3581j;
        if (bVar != null) {
            bVar.e(dVar);
        }
    }

    public float W() {
        return this.f3574c.l();
    }

    public void W0(@Nullable String str) {
        this.f3582k = str;
    }

    @Nullable
    public x0 X() {
        k kVar = this.f3573b;
        if (kVar != null) {
            return kVar.o();
        }
        return null;
    }

    public void X0(boolean z4) {
        this.f3588q = z4;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float Y() {
        return this.f3574c.h();
    }

    public void Y0(final int i4) {
        if (this.f3573b == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.m0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar) {
                    LottieDrawable.this.r0(i4, kVar);
                }
            });
        } else {
            this.f3574c.x(i4 + 0.99f);
        }
    }

    public RenderMode Z() {
        return this.f3596y ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    public void Z0(final String str) {
        k kVar = this.f3573b;
        if (kVar == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.c0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar2) {
                    LottieDrawable.this.s0(str, kVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g l4 = kVar.l(str);
        if (l4 != null) {
            Y0((int) (l4.f4049b + l4.f4050c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + com.join.mgps.Util.h0.f27805a);
    }

    public int a0() {
        return this.f3574c.getRepeatCount();
    }

    public void a1(@FloatRange(from = 0.0d, to = 1.0d) final float f5) {
        k kVar = this.f3573b;
        if (kVar == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.g0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar2) {
                    LottieDrawable.this.t0(f5, kVar2);
                }
            });
        } else {
            this.f3574c.x(com.airbnb.lottie.utils.g.k(kVar.r(), this.f3573b.f(), f5));
        }
    }

    @SuppressLint({"WrongConstant"})
    public int b0() {
        return this.f3574c.getRepeatMode();
    }

    public void b1(final int i4, final int i5) {
        if (this.f3573b == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.n0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar) {
                    LottieDrawable.this.u0(i4, i5, kVar);
                }
            });
        } else {
            this.f3574c.y(i4, i5 + 0.99f);
        }
    }

    public float c0() {
        return this.f3574c.m();
    }

    public void c1(final String str) {
        k kVar = this.f3573b;
        if (kVar == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.d0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar2) {
                    LottieDrawable.this.v0(str, kVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g l4 = kVar.l(str);
        if (l4 != null) {
            int i4 = (int) l4.f4049b;
            b1(i4, ((int) l4.f4050c) + i4);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + com.join.mgps.Util.h0.f27805a);
    }

    @Nullable
    public z0 d0() {
        return this.f3586o;
    }

    public void d1(final String str, final String str2, final boolean z4) {
        k kVar = this.f3573b;
        if (kVar == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.e0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar2) {
                    LottieDrawable.this.w0(str, str2, z4, kVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g l4 = kVar.l(str);
        if (l4 != null) {
            int i4 = (int) l4.f4049b;
            com.airbnb.lottie.model.g l5 = this.f3573b.l(str2);
            if (l5 != null) {
                b1(i4, (int) (l5.f4049b + (z4 ? 1.0f : 0.0f)));
                return;
            }
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + com.join.mgps.Util.h0.f27805a);
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + com.join.mgps.Util.h0.f27805a);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        e.a("Drawable#draw");
        if (this.f3577f) {
            try {
                if (this.f3596y) {
                    K0(canvas, this.f3590s);
                } else {
                    F(canvas);
                }
            } catch (Throwable th) {
                com.airbnb.lottie.utils.d.c("Lottie crashed in draw!", th);
            }
        } else if (this.f3596y) {
            K0(canvas, this.f3590s);
        } else {
            F(canvas);
        }
        this.L = false;
        e.b("Drawable#draw");
    }

    @Nullable
    public Typeface e0(String str, String str2) {
        com.airbnb.lottie.manager.a O2 = O();
        if (O2 != null) {
            return O2.b(str, str2);
        }
        return null;
    }

    public void e1(@FloatRange(from = 0.0d, to = 1.0d) final float f5, @FloatRange(from = 0.0d, to = 1.0d) final float f6) {
        k kVar = this.f3573b;
        if (kVar == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.j0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar2) {
                    LottieDrawable.this.x0(f5, f6, kVar2);
                }
            });
        } else {
            b1((int) com.airbnb.lottie.utils.g.k(kVar.r(), this.f3573b.f(), f5), (int) com.airbnb.lottie.utils.g.k(this.f3573b.r(), this.f3573b.f(), f6));
        }
    }

    public boolean f0() {
        com.airbnb.lottie.model.layer.c cVar = this.f3590s;
        return cVar != null && cVar.O();
    }

    public void f1(final int i4) {
        if (this.f3573b == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.k0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar) {
                    LottieDrawable.this.y0(i4, kVar);
                }
            });
        } else {
            this.f3574c.z(i4);
        }
    }

    public boolean g0() {
        com.airbnb.lottie.model.layer.c cVar = this.f3590s;
        return cVar != null && cVar.P();
    }

    public void g1(final String str) {
        k kVar = this.f3573b;
        if (kVar == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.b0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar2) {
                    LottieDrawable.this.z0(str, kVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g l4 = kVar.l(str);
        if (l4 != null) {
            f1((int) l4.f4049b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + com.join.mgps.Util.h0.f27805a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3591t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        k kVar = this.f3573b;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        k kVar = this.f3573b;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h1(final float f5) {
        k kVar = this.f3573b;
        if (kVar == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.h0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar2) {
                    LottieDrawable.this.A0(f5, kVar2);
                }
            });
        } else {
            f1((int) com.airbnb.lottie.utils.g.k(kVar.r(), this.f3573b.f(), f5));
        }
    }

    public boolean i0() {
        com.airbnb.lottie.utils.e eVar = this.f3574c;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    public void i1(boolean z4) {
        if (this.f3593v == z4) {
            return;
        }
        this.f3593v = z4;
        com.airbnb.lottie.model.layer.c cVar = this.f3590s;
        if (cVar != null) {
            cVar.J(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.L) {
            return;
        }
        this.L = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j0() {
        if (isVisible()) {
            return this.f3574c.isRunning();
        }
        OnVisibleAction onVisibleAction = this.f3578g;
        return onVisibleAction == OnVisibleAction.PLAY || onVisibleAction == OnVisibleAction.RESUME;
    }

    public void j1(boolean z4) {
        this.f3592u = z4;
        k kVar = this.f3573b;
        if (kVar != null) {
            kVar.z(z4);
        }
    }

    public boolean k0() {
        return this.f3594w;
    }

    public void k1(@FloatRange(from = 0.0d, to = 1.0d) final float f5) {
        if (this.f3573b == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.i0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar) {
                    LottieDrawable.this.B0(f5, kVar);
                }
            });
            return;
        }
        e.a("Drawable#setProgress");
        this.f3574c.w(this.f3573b.h(f5));
        e.b("Drawable#setProgress");
    }

    public boolean l0() {
        return this.f3574c.getRepeatCount() == -1;
    }

    public void l1(RenderMode renderMode) {
        this.f3595x = renderMode;
        A();
    }

    public boolean m0() {
        return this.f3587p;
    }

    public void m1(int i4) {
        this.f3574c.setRepeatCount(i4);
    }

    public void n1(int i4) {
        this.f3574c.setRepeatMode(i4);
    }

    public void o1(boolean z4) {
        this.f3577f = z4;
    }

    public void p1(float f5) {
        this.f3574c.A(f5);
    }

    public void q1(Boolean bool) {
        this.f3575d = bool.booleanValue();
    }

    public void r(Animator.AnimatorListener animatorListener) {
        this.f3574c.addListener(animatorListener);
    }

    public void r1(z0 z0Var) {
        this.f3586o = z0Var;
    }

    @RequiresApi(api = 19)
    public void s(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f3574c.addPauseListener(animatorPauseListener);
    }

    @Nullable
    public Bitmap s1(String str, @Nullable Bitmap bitmap) {
        com.airbnb.lottie.manager.b R = R();
        if (R == null) {
            com.airbnb.lottie.utils.d.e("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap f5 = R.f(str, bitmap);
        invalidateSelf();
        return f5;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i4) {
        this.f3591t = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        com.airbnb.lottie.utils.d.e("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        boolean z6 = !isVisible();
        boolean visible = super.setVisible(z4, z5);
        if (z4) {
            OnVisibleAction onVisibleAction = this.f3578g;
            if (onVisibleAction == OnVisibleAction.PLAY) {
                E0();
            } else if (onVisibleAction == OnVisibleAction.RESUME) {
                M0();
            }
        } else if (this.f3574c.isRunning()) {
            D0();
            this.f3578g = OnVisibleAction.RESUME;
        } else if (!z6) {
            this.f3578g = OnVisibleAction.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        E0();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        I();
    }

    public void t(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f3574c.addUpdateListener(animatorUpdateListener);
    }

    public boolean t1() {
        return this.f3586o == null && this.f3573b.c().size() > 0;
    }

    public <T> void u(final com.airbnb.lottie.model.d dVar, final T t4, @Nullable final com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.model.layer.c cVar = this.f3590s;
        if (cVar == null) {
            this.f3579h.add(new c() { // from class: com.airbnb.lottie.a0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void a(k kVar) {
                    LottieDrawable.this.n0(dVar, t4, jVar, kVar);
                }
            });
            return;
        }
        boolean z4 = true;
        if (dVar == com.airbnb.lottie.model.d.f4042c) {
            cVar.d(t4, jVar);
        } else if (dVar.d() != null) {
            dVar.d().d(t4, jVar);
        } else {
            List<com.airbnb.lottie.model.d> L0 = L0(dVar);
            for (int i4 = 0; i4 < L0.size(); i4++) {
                L0.get(i4).d().d(t4, jVar);
            }
            z4 = true ^ L0.isEmpty();
        }
        if (z4) {
            invalidateSelf();
            if (t4 == s0.E) {
                k1(Y());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public <T> void v(com.airbnb.lottie.model.d dVar, T t4, com.airbnb.lottie.value.l<T> lVar) {
        u(dVar, t4, new b(lVar));
    }

    public void y() {
        this.f3579h.clear();
        this.f3574c.cancel();
        if (isVisible()) {
            return;
        }
        this.f3578g = OnVisibleAction.NONE;
    }

    public void z() {
        if (this.f3574c.isRunning()) {
            this.f3574c.cancel();
            if (!isVisible()) {
                this.f3578g = OnVisibleAction.NONE;
            }
        }
        this.f3573b = null;
        this.f3590s = null;
        this.f3581j = null;
        this.f3574c.f();
        invalidateSelf();
    }
}
