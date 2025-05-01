package com.join.android.app.common.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: CommonDialogLoading.java */
/* loaded from: classes3.dex */
public class e extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f14573b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f14574c;

    /* renamed from: d  reason: collision with root package name */
    Animation f14575d;

    public e(Context context) {
        super(context, R.style.HKDialogLoading);
        this.f14573b = context;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        requestWindowFeature(-1);
        super.onCreate(bundle);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.rotate_repeat);
        this.f14575d = loadAnimation;
        loadAnimation.setInterpolator(new LinearInterpolator());
        ImageView imageView = new ImageView(this.f14573b);
        this.f14574c = imageView;
        imageView.setImageResource(R.drawable.loading_ios);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addContentView(this.f14574c, layoutParams);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            hide();
            return true;
        }
        return false;
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.f14574c.startAnimation(this.f14575d);
        } catch (Exception unused) {
        }
    }
}
