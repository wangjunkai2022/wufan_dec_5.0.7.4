package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: p  reason: collision with root package name */
    private static final String f3547p = LottieAnimationView.class.getSimpleName();

    /* renamed from: q  reason: collision with root package name */
    private static final p0<Throwable> f3548q = new p0() { // from class: com.airbnb.lottie.h
        @Override // com.airbnb.lottie.p0
        public final void onResult(Object obj) {
            LottieAnimationView.A((Throwable) obj);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final p0<k> f3549b;

    /* renamed from: c  reason: collision with root package name */
    private final p0<Throwable> f3550c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private p0<Throwable> f3551d;
    @DrawableRes

    /* renamed from: e  reason: collision with root package name */
    private int f3552e;

    /* renamed from: f  reason: collision with root package name */
    private final LottieDrawable f3553f;

    /* renamed from: g  reason: collision with root package name */
    private String f3554g;
    @RawRes

    /* renamed from: h  reason: collision with root package name */
    private int f3555h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3556i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3557j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3558k;

    /* renamed from: l  reason: collision with root package name */
    private final Set<UserActionTaken> f3559l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<r0> f3560m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private v0<k> f3561n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private k f3562o;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        String f3563b;

        /* renamed from: c  reason: collision with root package name */
        int f3564c;

        /* renamed from: d  reason: collision with root package name */
        float f3565d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3566e;

        /* renamed from: f  reason: collision with root package name */
        String f3567f;

        /* renamed from: g  reason: collision with root package name */
        int f3568g;

        /* renamed from: h  reason: collision with root package name */
        int f3569h;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.f3563b);
            parcel.writeFloat(this.f3565d);
            parcel.writeInt(this.f3566e ? 1 : 0);
            parcel.writeString(this.f3567f);
            parcel.writeInt(this.f3568g);
            parcel.writeInt(this.f3569h);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f3563b = parcel.readString();
            this.f3565d = parcel.readFloat();
            this.f3566e = parcel.readInt() == 1;
            this.f3567f = parcel.readString();
            this.f3568g = parcel.readInt();
            this.f3569h = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements p0<Throwable> {
        a() {
        }

        @Override // com.airbnb.lottie.p0
        /* renamed from: a */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.f3552e != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f3552e);
            }
            (LottieAnimationView.this.f3551d == null ? LottieAnimationView.f3548q : LottieAnimationView.this.f3551d).onResult(th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class b<T> extends com.airbnb.lottie.value.j<T> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f3571d;

        b(com.airbnb.lottie.value.l lVar) {
            this.f3571d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f3571d.a(bVar);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f3549b = new p0() { // from class: com.airbnb.lottie.g
            @Override // com.airbnb.lottie.p0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((k) obj);
            }
        };
        this.f3550c = new a();
        this.f3552e = 0;
        this.f3553f = new LottieDrawable();
        this.f3556i = false;
        this.f3557j = false;
        this.f3558k = true;
        this.f3559l = new HashSet();
        this.f3560m = new HashSet();
        v(null, R.attr.lottieAnimationViewStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(Throwable th) {
        if (com.airbnb.lottie.utils.h.k(th)) {
            com.airbnb.lottie.utils.d.f("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    private void O() {
        boolean w4 = w();
        setImageDrawable(null);
        setImageDrawable(this.f3553f);
        if (w4) {
            this.f3553f.M0();
        }
    }

    private void n() {
        v0<k> v0Var = this.f3561n;
        if (v0Var != null) {
            v0Var.j(this.f3549b);
            this.f3561n.i(this.f3550c);
        }
    }

    private void o() {
        this.f3562o = null;
        this.f3553f.z();
    }

    private v0<k> r(final String str) {
        if (isInEditMode()) {
            return new v0<>(new Callable() { // from class: com.airbnb.lottie.j
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    t0 y2;
                    y2 = LottieAnimationView.this.y(str);
                    return y2;
                }
            }, true);
        }
        return this.f3558k ? x.o(getContext(), str) : x.p(getContext(), str, null);
    }

    private v0<k> s(@RawRes final int i4) {
        if (isInEditMode()) {
            return new v0<>(new Callable() { // from class: com.airbnb.lottie.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    t0 z4;
                    z4 = LottieAnimationView.this.z(i4);
                    return z4;
                }
            }, true);
        }
        return this.f3558k ? x.C(getContext(), i4) : x.D(getContext(), i4, null);
    }

    private void setCompositionTask(v0<k> v0Var) {
        this.f3559l.add(UserActionTaken.SET_ANIMATION);
        o();
        n();
        this.f3561n = v0Var.d(this.f3549b).c(this.f3550c);
    }

    private void v(@Nullable AttributeSet attributeSet, @AttrRes int i4) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LottieAnimationView, i4, 0);
        this.f3558k = obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i5 = R.styleable.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i5);
        int i6 = R.styleable.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i6);
        int i7 = R.styleable.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i7);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i5, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i6);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i7)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.f3557j = true;
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.f3553f.m1(-1);
        }
        int i8 = R.styleable.LottieAnimationView_lottie_repeatMode;
        if (obtainStyledAttributes.hasValue(i8)) {
            setRepeatMode(obtainStyledAttributes.getInt(i8, 1));
        }
        int i9 = R.styleable.LottieAnimationView_lottie_repeatCount;
        if (obtainStyledAttributes.hasValue(i9)) {
            setRepeatCount(obtainStyledAttributes.getInt(i9, -1));
        }
        int i10 = R.styleable.LottieAnimationView_lottie_speed;
        if (obtainStyledAttributes.hasValue(i10)) {
            setSpeed(obtainStyledAttributes.getFloat(i10, 1.0f));
        }
        int i11 = R.styleable.LottieAnimationView_lottie_clipToCompositionBounds;
        if (obtainStyledAttributes.hasValue(i11)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i11, true));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0f));
        q(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i12 = R.styleable.LottieAnimationView_lottie_colorFilter;
        if (obtainStyledAttributes.hasValue(i12)) {
            k(new com.airbnb.lottie.model.d("**"), s0.K, new com.airbnb.lottie.value.j(new y0(AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(i12, -1)).getDefaultColor())));
        }
        int i13 = R.styleable.LottieAnimationView_lottie_renderMode;
        if (obtainStyledAttributes.hasValue(i13)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i14 = obtainStyledAttributes.getInt(i13, renderMode.ordinal());
            if (i14 >= RenderMode.values().length) {
                i14 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i14]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        obtainStyledAttributes.recycle();
        this.f3553f.q1(Boolean.valueOf(com.airbnb.lottie.utils.h.f(getContext()) != 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t0 y(String str) throws Exception {
        return this.f3558k ? x.q(getContext(), str) : x.r(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t0 z(int i4) throws Exception {
        return this.f3558k ? x.E(getContext(), i4) : x.F(getContext(), i4, null);
    }

    @Deprecated
    public void B(boolean z4) {
        this.f3553f.m1(z4 ? -1 : 0);
    }

    @MainThread
    public void C() {
        this.f3557j = false;
        this.f3553f.D0();
    }

    @MainThread
    public void D() {
        this.f3559l.add(UserActionTaken.PLAY_OPTION);
        this.f3553f.E0();
    }

    public void E() {
        this.f3553f.F0();
    }

    public void F() {
        this.f3560m.clear();
    }

    public void G() {
        this.f3553f.G0();
    }

    public void H(Animator.AnimatorListener animatorListener) {
        this.f3553f.H0(animatorListener);
    }

    @RequiresApi(api = 19)
    public void I(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f3553f.I0(animatorPauseListener);
    }

    public boolean J(@NonNull r0 r0Var) {
        return this.f3560m.remove(r0Var);
    }

    public void K(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f3553f.J0(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.d> L(com.airbnb.lottie.model.d dVar) {
        return this.f3553f.L0(dVar);
    }

    @MainThread
    public void M() {
        this.f3559l.add(UserActionTaken.PLAY_OPTION);
        this.f3553f.M0();
    }

    public void N() {
        this.f3553f.N0();
    }

    @Nullable
    public Bitmap P(String str, @Nullable Bitmap bitmap) {
        return this.f3553f.s1(str, bitmap);
    }

    public void g(Animator.AnimatorListener animatorListener) {
        this.f3553f.r(animatorListener);
    }

    public boolean getClipToCompositionBounds() {
        return this.f3553f.M();
    }

    @Nullable
    public k getComposition() {
        return this.f3562o;
    }

    public long getDuration() {
        k kVar = this.f3562o;
        if (kVar != null) {
            return kVar.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f3553f.P();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f3553f.S();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f3553f.U();
    }

    public float getMaxFrame() {
        return this.f3553f.V();
    }

    public float getMinFrame() {
        return this.f3553f.W();
    }

    @Nullable
    public x0 getPerformanceTracker() {
        return this.f3553f.X();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f3553f.Y();
    }

    public RenderMode getRenderMode() {
        return this.f3553f.Z();
    }

    public int getRepeatCount() {
        return this.f3553f.a0();
    }

    public int getRepeatMode() {
        return this.f3553f.b0();
    }

    public float getSpeed() {
        return this.f3553f.c0();
    }

    @RequiresApi(api = 19)
    public void h(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f3553f.s(animatorPauseListener);
    }

    public void i(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f3553f.t(animatorUpdateListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).Z() == RenderMode.SOFTWARE) {
            this.f3553f.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.f3553f;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j(@NonNull r0 r0Var) {
        k kVar = this.f3562o;
        if (kVar != null) {
            r0Var.a(kVar);
        }
        return this.f3560m.add(r0Var);
    }

    public <T> void k(com.airbnb.lottie.model.d dVar, T t4, com.airbnb.lottie.value.j<T> jVar) {
        this.f3553f.u(dVar, t4, jVar);
    }

    public <T> void l(com.airbnb.lottie.model.d dVar, T t4, com.airbnb.lottie.value.l<T> lVar) {
        this.f3553f.u(dVar, t4, new b(lVar));
    }

    @MainThread
    public void m() {
        this.f3559l.add(UserActionTaken.PLAY_OPTION);
        this.f3553f.y();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f3557j) {
            return;
        }
        this.f3553f.E0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i4;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3554g = savedState.f3563b;
        Set<UserActionTaken> set = this.f3559l;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.f3554g)) {
            setAnimation(this.f3554g);
        }
        this.f3555h = savedState.f3564c;
        if (!this.f3559l.contains(userActionTaken) && (i4 = this.f3555h) != 0) {
            setAnimation(i4);
        }
        if (!this.f3559l.contains(UserActionTaken.SET_PROGRESS)) {
            setProgress(savedState.f3565d);
        }
        if (!this.f3559l.contains(UserActionTaken.PLAY_OPTION) && savedState.f3566e) {
            D();
        }
        if (!this.f3559l.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f3567f);
        }
        if (!this.f3559l.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f3568g);
        }
        if (this.f3559l.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f3569h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3563b = this.f3554g;
        savedState.f3564c = this.f3555h;
        savedState.f3565d = this.f3553f.Y();
        savedState.f3566e = this.f3553f.j0();
        savedState.f3567f = this.f3553f.S();
        savedState.f3568g = this.f3553f.b0();
        savedState.f3569h = this.f3553f.a0();
        return savedState;
    }

    @Deprecated
    public void p() {
        this.f3553f.D();
    }

    public void q(boolean z4) {
        this.f3553f.G(z4);
    }

    public void setAnimation(@RawRes int i4) {
        this.f3555h = i4;
        this.f3554g = null;
        setCompositionTask(s(i4));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f3558k ? x.G(getContext(), str) : x.H(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z4) {
        this.f3553f.P0(z4);
    }

    public void setCacheComposition(boolean z4) {
        this.f3558k = z4;
    }

    public void setClipToCompositionBounds(boolean z4) {
        this.f3553f.Q0(z4);
    }

    public void setComposition(@NonNull k kVar) {
        if (e.f3834a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Set Composition \n");
            sb.append(kVar);
        }
        this.f3553f.setCallback(this);
        this.f3562o = kVar;
        this.f3556i = true;
        boolean R0 = this.f3553f.R0(kVar);
        this.f3556i = false;
        if (getDrawable() != this.f3553f || R0) {
            if (!R0) {
                O();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (r0 r0Var : this.f3560m) {
                r0Var.a(kVar);
            }
        }
    }

    public void setFailureListener(@Nullable p0<Throwable> p0Var) {
        this.f3551d = p0Var;
    }

    public void setFallbackResource(@DrawableRes int i4) {
        this.f3552e = i4;
    }

    public void setFontAssetDelegate(c cVar) {
        this.f3553f.S0(cVar);
    }

    public void setFrame(int i4) {
        this.f3553f.T0(i4);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z4) {
        this.f3553f.U0(z4);
    }

    public void setImageAssetDelegate(d dVar) {
        this.f3553f.V0(dVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f3553f.W0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        n();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        n();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i4) {
        n();
        super.setImageResource(i4);
    }

    public void setMaintainOriginalImageBounds(boolean z4) {
        this.f3553f.X0(z4);
    }

    public void setMaxFrame(int i4) {
        this.f3553f.Y0(i4);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        this.f3553f.a1(f5);
    }

    public void setMinAndMaxFrame(String str) {
        this.f3553f.c1(str);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6) {
        this.f3553f.e1(f5, f6);
    }

    public void setMinFrame(int i4) {
        this.f3553f.f1(i4);
    }

    public void setMinProgress(float f5) {
        this.f3553f.h1(f5);
    }

    public void setOutlineMasksAndMattes(boolean z4) {
        this.f3553f.i1(z4);
    }

    public void setPerformanceTrackingEnabled(boolean z4) {
        this.f3553f.j1(z4);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        this.f3559l.add(UserActionTaken.SET_PROGRESS);
        this.f3553f.k1(f5);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f3553f.l1(renderMode);
    }

    public void setRepeatCount(int i4) {
        this.f3559l.add(UserActionTaken.SET_REPEAT_COUNT);
        this.f3553f.m1(i4);
    }

    public void setRepeatMode(int i4) {
        this.f3559l.add(UserActionTaken.SET_REPEAT_MODE);
        this.f3553f.n1(i4);
    }

    public void setSafeMode(boolean z4) {
        this.f3553f.o1(z4);
    }

    public void setSpeed(float f5) {
        this.f3553f.p1(f5);
    }

    public void setTextDelegate(z0 z0Var) {
        this.f3553f.r1(z0Var);
    }

    public boolean t() {
        return this.f3553f.f0();
    }

    public boolean u() {
        return this.f3553f.g0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.f3556i && drawable == (lottieDrawable = this.f3553f) && lottieDrawable.i0()) {
            C();
        } else if (!this.f3556i && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.i0()) {
                lottieDrawable2.D0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public boolean w() {
        return this.f3553f.i0();
    }

    public boolean x() {
        return this.f3553f.m0();
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f3553f.Z0(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z4) {
        this.f3553f.d1(str, str2, z4);
    }

    public void setMinFrame(String str) {
        this.f3553f.g1(str);
    }

    public void setMinAndMaxFrame(int i4, int i5) {
        this.f3553f.b1(i4, i5);
    }

    public void setAnimation(String str) {
        this.f3554g = str;
        this.f3555h = 0;
        setCompositionTask(r(str));
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        setCompositionTask(x.H(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(x.t(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3549b = new p0() { // from class: com.airbnb.lottie.g
            @Override // com.airbnb.lottie.p0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((k) obj);
            }
        };
        this.f3550c = new a();
        this.f3552e = 0;
        this.f3553f = new LottieDrawable();
        this.f3556i = false;
        this.f3557j = false;
        this.f3558k = true;
        this.f3559l = new HashSet();
        this.f3560m = new HashSet();
        v(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f3549b = new p0() { // from class: com.airbnb.lottie.g
            @Override // com.airbnb.lottie.p0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((k) obj);
            }
        };
        this.f3550c = new a();
        this.f3552e = 0;
        this.f3553f = new LottieDrawable();
        this.f3556i = false;
        this.f3557j = false;
        this.f3558k = true;
        this.f3559l = new HashSet();
        this.f3560m = new HashSet();
        v(attributeSet, i4);
    }
}
