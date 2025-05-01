package cn.sharesdk.framework.authorize;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* loaded from: classes2.dex */
public class ResizeLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private OnResizeListener f946a;

    /* loaded from: classes2.dex */
    public interface OnResizeListener {
        void OnResize(int i4, int i5, int i6, int i7);
    }

    public ResizeLayout(Context context) {
        super(context);
    }

    public void a(OnResizeListener onResizeListener) {
        this.f946a = onResizeListener;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        OnResizeListener onResizeListener = this.f946a;
        if (onResizeListener != null) {
            onResizeListener.OnResize(i4, i5, i6, i7);
        }
    }

    public ResizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
