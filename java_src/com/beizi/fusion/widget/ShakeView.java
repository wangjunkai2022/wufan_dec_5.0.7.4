package com.beizi.fusion.widget;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.beizi.fusion.R;
/* loaded from: classes2.dex */
public class ShakeView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    ImageView f7251a;

    /* renamed from: b  reason: collision with root package name */
    TextView f7252b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7253c;

    /* renamed from: d  reason: collision with root package name */
    private String f7254d;

    /* renamed from: e  reason: collision with root package name */
    private AnimationDrawable f7255e;

    public ShakeView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7253c = false;
        init(context);
    }

    public void init(Context context) {
        if (this.f7253c) {
            return;
        }
        this.f7253c = true;
        ImageView imageView = new ImageView(context);
        this.f7251a = imageView;
        imageView.setBackgroundResource(R.drawable.anim_shake);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        setOrientation(1);
        addView(this.f7251a, layoutParams);
        this.f7255e = (AnimationDrawable) this.f7251a.getBackground();
    }

    public void setTitleText(String str) {
        this.f7254d = str;
        TextView textView = this.f7252b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void startShake() {
        AnimationDrawable animationDrawable = this.f7255e;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    public void stopShake() {
        AnimationDrawable animationDrawable = this.f7255e;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    public void updateTwistRollAnim() {
        removeAllViews();
        ImageView imageView = new ImageView(getContext());
        this.f7251a = imageView;
        imageView.setBackgroundResource(R.drawable.beizi_twist_roll);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        setOrientation(1);
        addView(this.f7251a, layoutParams);
        this.f7255e = (AnimationDrawable) this.f7251a.getBackground();
    }

    public ShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7253c = false;
        init(context);
    }

    public ShakeView(Context context) {
        super(context);
        this.f7253c = false;
        init(context);
    }
}
