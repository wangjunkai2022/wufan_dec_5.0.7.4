package com.qq.e.ads.nativ.widget;

import android.view.MotionEvent;
/* loaded from: classes5.dex */
public interface ViewStatusListener {
    void onAttachToWindow();

    void onDetachFromWindow();

    void onDispatchTouchEvent(MotionEvent motionEvent);

    void onWindowFocusChanged(boolean z4);

    void onWindowVisibilityChanged(int i4);
}
