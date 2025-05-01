package com.qq.e.ads.nativ.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.qq.e.comm.util.GDTLogger;
/* loaded from: classes5.dex */
public class NativeAdContainer extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private ViewStatusListener f59777b;

    /* renamed from: c  reason: collision with root package name */
    private ViewStatus f59778c;

    /* renamed from: com.qq.e.ads.nativ.widget.NativeAdContainer$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59779a;

        static {
            int[] iArr = new int[ViewStatus.values().length];
            f59779a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59779a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private enum ViewStatus {
        INIT,
        ATTACHED,
        DETACHED
    }

    public NativeAdContainer(Context context) {
        super(context);
        this.f59778c = ViewStatus.INIT;
    }

    public NativeAdContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59778c = ViewStatus.INIT;
    }

    public NativeAdContainer(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f59778c = ViewStatus.INIT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewStatusListener viewStatusListener = this.f59777b;
        if (viewStatusListener != null) {
            viewStatusListener.onDispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        GDTLogger.d("NativeAdContainer onAttachedToWindow");
        this.f59778c = ViewStatus.ATTACHED;
        ViewStatusListener viewStatusListener = this.f59777b;
        if (viewStatusListener != null) {
            viewStatusListener.onAttachToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GDTLogger.d("NativeAdContainer onDetachedFromWindow");
        this.f59778c = ViewStatus.DETACHED;
        ViewStatusListener viewStatusListener = this.f59777b;
        if (viewStatusListener != null) {
            viewStatusListener.onDetachFromWindow();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        GDTLogger.d("onWindowFocusChanged: hasWindowFocus: " + z4);
        ViewStatusListener viewStatusListener = this.f59777b;
        if (viewStatusListener != null) {
            viewStatusListener.onWindowFocusChanged(z4);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        GDTLogger.d("onWindowVisibilityChanged: visibility: " + i4);
        ViewStatusListener viewStatusListener = this.f59777b;
        if (viewStatusListener != null) {
            viewStatusListener.onWindowVisibilityChanged(i4);
        }
    }

    public void setViewStatusListener(ViewStatusListener viewStatusListener) {
        this.f59777b = viewStatusListener;
        if (viewStatusListener != null) {
            int ordinal = this.f59778c.ordinal();
            if (ordinal == 1) {
                this.f59777b.onAttachToWindow();
            } else if (ordinal != 2) {
            } else {
                this.f59777b.onDetachFromWindow();
            }
        }
    }
}
