package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.common.internal.g;
import com.facebook.drawee.view.a;
import javax.annotation.Nullable;
import o0.b;
/* loaded from: classes.dex */
public class DraweeView<DH extends o0.b> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled;
    private float mAspectRatio;
    private b<DH> mDraweeHolder;
    private boolean mInitialised;
    private boolean mLegacyVisibilityHandlingEnabled;
    private final a.C0262a mMeasureSpec;

    public DraweeView(Context context) {
        super(context);
        this.mMeasureSpec = new a.C0262a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    private void init(Context context) {
        boolean e5;
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("DraweeView#init");
            }
            if (this.mInitialised) {
                if (e5) {
                    return;
                }
                return;
            }
            boolean z4 = true;
            this.mInitialised = true;
            this.mDraweeHolder = b.d(null, context);
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList == null) {
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                        return;
                    }
                    return;
                }
                setColorFilter(imageTintList.getDefaultColor());
            }
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z4 = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z4;
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    private void maybeOverrideVisibilityHandling() {
        Drawable drawable;
        if (!this.mLegacyVisibilityHandlingEnabled || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z4) {
        sGlobalLegacyVisibilityHandlingEnabled = z4;
    }

    protected void doAttach() {
        this.mDraweeHolder.m();
    }

    protected void doDetach() {
        this.mDraweeHolder.n();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    @Nullable
    public o0.a getController() {
        return this.mDraweeHolder.f();
    }

    public DH getHierarchy() {
        return this.mDraweeHolder.h();
    }

    @Nullable
    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.i();
    }

    public boolean hasController() {
        return this.mDraweeHolder.f() != null;
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.j();
    }

    protected void onAttach() {
        doAttach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    protected void onDetach() {
        doDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        a.C0262a c0262a = this.mMeasureSpec;
        c0262a.f11366a = i4;
        c0262a.f11367b = i5;
        a.b(c0262a, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0262a c0262a2 = this.mMeasureSpec;
        super.onMeasure(c0262a2.f11366a, c0262a2.f11367b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.o(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        maybeOverrideVisibilityHandling();
    }

    public void setAspectRatio(float f5) {
        if (f5 == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = f5;
        requestLayout();
    }

    public void setController(@Nullable o0.a aVar) {
        this.mDraweeHolder.q(aVar);
        super.setImageDrawable(this.mDraweeHolder.i());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.r(dh);
        super.setImageDrawable(this.mDraweeHolder.i());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.q(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.q(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i4) {
        init(getContext());
        this.mDraweeHolder.q(null);
        super.setImageResource(i4);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.q(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z4) {
        this.mLegacyVisibilityHandlingEnabled = z4;
    }

    @Override // android.view.View
    public String toString() {
        g.b f5 = g.f(this);
        b<DH> bVar = this.mDraweeHolder;
        return f5.f("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMeasureSpec = new a.C0262a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mMeasureSpec = new a.C0262a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    @TargetApi(21)
    public DraweeView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.mMeasureSpec = new a.C0262a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }
}
