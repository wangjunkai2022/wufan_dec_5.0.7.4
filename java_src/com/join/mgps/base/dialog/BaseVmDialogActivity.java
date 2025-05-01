package com.join.mgps.base.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.BaseAppCompatActivity;
import com.join.kotlin.base.dialog.DialogActivityManager;
import com.join.kotlin.base.dialog.callback.IDialogActivityCallback;
/* loaded from: classes4.dex */
public abstract class BaseVmDialogActivity extends BaseAppCompatActivity {

    /* renamed from: b  reason: collision with root package name */
    private boolean f46238b = true;

    /* renamed from: c  reason: collision with root package name */
    private String f46239c = "";

    /* renamed from: d  reason: collision with root package name */
    protected IDialogActivityCallback f46240d;

    private boolean isOutOfBounds(Context context, MotionEvent motionEvent) {
        if (getContentView() == null) {
            return true;
        }
        int x4 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        getContentView();
        Rect rect = new Rect();
        getContentView().getGlobalVisibleRect(rect);
        int i4 = -scaledWindowTouchSlop;
        return x4 < i4 || y2 < i4 || !rect.contains(x4, y2);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        IDialogActivityCallback iDialogActivityCallback = this.f46240d;
        if (iDialogActivityCallback != null) {
            iDialogActivityCallback.onActivityDismiss(this);
        }
        DialogActivityManager.get().unregisterCallback(this.f46239c);
    }

    public View getContentView() {
        return null;
    }

    void hideNavigationBar() {
        if (Build.VERSION.SDK_INT >= 19) {
            setSystemUiVisibility();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.f46239c = getIntent().getStringExtra("_key_call");
        }
        IDialogActivityCallback callback = DialogActivityManager.get().getCallback(this.f46239c);
        this.f46240d = callback;
        if (callback != null) {
            callback.onActivityShow(this);
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (shouldCloseOnTouch(this, motionEvent)) {
            finish();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    void setSystemUiVisibility() {
        getWindow().getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 5894 : 1799);
    }

    public boolean shouldCloseOnTouch(Context context, MotionEvent motionEvent) {
        return this.f46238b && getContentView() != null && ((motionEvent.getAction() == 1 && isOutOfBounds(context, motionEvent)) || motionEvent.getAction() == 4);
    }
}
