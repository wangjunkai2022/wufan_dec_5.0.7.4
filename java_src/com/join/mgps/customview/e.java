package com.join.mgps.customview;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: ForumPopupWindow.java */
/* loaded from: classes4.dex */
public class e extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    protected final Context f48455b;

    /* renamed from: c  reason: collision with root package name */
    protected View f48456c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForumPopupWindow.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                e.this.dismiss();
                return true;
            }
            return false;
        }
    }

    public e(Context context) {
        super(context);
        this.f48455b = context;
        c();
    }

    private void a() {
        Activity activity = (Activity) this.f48455b;
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.alpha = 0.3f;
        activity.getWindow().setAttributes(attributes);
    }

    private void c() {
        setAnimationStyle(R.style.animation_image_pager_popup);
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(true);
        setTouchInterceptor(new a());
    }

    public void b() {
        Activity activity = (Activity) this.f48455b;
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.alpha = 1.0f;
        activity.getWindow().setAttributes(attributes);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        b();
        super.dismiss();
    }

    @Override // android.widget.PopupWindow
    public int getHeight() {
        View view = this.f48456c;
        if (view != null) {
            return view.getMeasuredHeight();
        }
        return super.getHeight();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        super.showAsDropDown(view);
        a();
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i4, int i5, int i6) {
        super.showAtLocation(view, i4, i5, i6);
        a();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5) {
        super.showAsDropDown(view, i4, i5);
        a();
    }

    public e(Context context, View view, int i4, int i5) {
        super(view, i4, i5, true);
        this.f48455b = context;
        this.f48456c = view;
        c();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5, int i6) {
        super.showAsDropDown(view, i4, i5, i6);
        a();
    }
}
