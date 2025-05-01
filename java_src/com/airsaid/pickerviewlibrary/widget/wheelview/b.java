package com.airsaid.pickerviewlibrary.widget.wheelview;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: LoopViewGestureListener.java */
/* loaded from: classes2.dex */
final class b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b  reason: collision with root package name */
    final WheelView f4499b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(WheelView wheelView) {
        this.f4499b = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        this.f4499b.l(f6);
        return true;
    }
}
