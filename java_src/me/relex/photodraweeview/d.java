package me.relex.photodraweeview;

import android.view.GestureDetector;
import android.view.View;
/* compiled from: IAttacher.java */
/* loaded from: classes7.dex */
public interface d {

    /* renamed from: o1  reason: collision with root package name */
    public static final float f71601o1 = 3.0f;

    /* renamed from: q1  reason: collision with root package name */
    public static final float f71602q1 = 1.75f;

    /* renamed from: r1  reason: collision with root package name */
    public static final float f71603r1 = 1.0f;

    /* renamed from: s1  reason: collision with root package name */
    public static final long f71604s1 = 200;

    float getMaximumScale();

    float getMediumScale();

    float getMinimumScale();

    e getOnPhotoTapListener();

    h getOnViewTapListener();

    float getScale();

    void setAllowParentInterceptOnEdge(boolean z4);

    void setMaximumScale(float f5);

    void setMediumScale(float f5);

    void setMinimumScale(float f5);

    void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener);

    void setOnLongClickListener(View.OnLongClickListener onLongClickListener);

    void setOnPhotoTapListener(e eVar);

    void setOnScaleChangeListener(f fVar);

    void setOnViewTapListener(h hVar);

    void setScale(float f5);

    void setScale(float f5, float f6, float f7, boolean z4);

    void setScale(float f5, boolean z4);

    void setZoomTransitionDuration(long j4);

    void update(int i4, int i5);
}
