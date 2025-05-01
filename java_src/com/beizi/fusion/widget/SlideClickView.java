package com.beizi.fusion.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.beizi.fusion.R;
/* loaded from: classes2.dex */
public class SlideClickView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7268a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f7269b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f7270c;

    /* renamed from: d  reason: collision with root package name */
    private String f7271d;

    /* renamed from: e  reason: collision with root package name */
    private int f7272e;

    /* renamed from: f  reason: collision with root package name */
    private int f7273f;

    /* renamed from: g  reason: collision with root package name */
    private int f7274g;

    /* renamed from: h  reason: collision with root package name */
    private AnimationDrawable f7275h;

    public SlideClickView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7268a = false;
        this.f7273f = 45;
        this.f7274g = 45;
        init(context);
    }

    private void a() {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        this.f7275h = animationDrawable;
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.slide_down_one), 600);
        this.f7275h.addFrame(getResources().getDrawable(R.drawable.slide_down_two), 600);
        this.f7275h.addFrame(getResources().getDrawable(R.drawable.slide_down_three), 600);
        this.f7275h.setOneShot(false);
        ImageView imageView = this.f7269b;
        if (imageView != null) {
            imageView.setImageDrawable(this.f7275h);
        }
    }

    public void init(Context context) {
        if (this.f7268a) {
            return;
        }
        this.f7268a = true;
        TextView textView = new TextView(context);
        this.f7270c = textView;
        textView.setGravity(17);
        this.f7269b = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        setOrientation(1);
        setGravity(17);
        addView(this.f7270c, layoutParams);
        addView(this.f7269b, layoutParams2);
        a();
    }

    public void setImageWidthAndHeight(int i4, int i5) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i5);
        ImageView imageView = this.f7269b;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
    }

    public void setTitleFont(int i4) {
        TextView textView;
        this.f7272e = i4;
        if (i4 == 0 || (textView = this.f7270c) == null) {
            return;
        }
        textView.setTextSize(2, i4);
    }

    public void setTitleText(String str) {
        TextView textView;
        this.f7271d = str;
        if (TextUtils.isEmpty(str) || (textView = this.f7270c) == null) {
            return;
        }
        textView.setText(str);
        this.f7270c.setTypeface(Typeface.DEFAULT, 1);
        this.f7270c.setTextColor(Color.parseColor("#FFFFFFFF"));
        this.f7270c.setShadowLayer(5.0f, 1.0f, 1.0f, Color.parseColor("#80000000"));
    }

    public void startAnim() {
        AnimationDrawable animationDrawable = this.f7275h;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    public void stopAnim() {
        AnimationDrawable animationDrawable = this.f7275h;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    public SlideClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7268a = false;
        this.f7273f = 45;
        this.f7274g = 45;
        init(context);
    }

    public SlideClickView(Context context) {
        super(context);
        this.f7268a = false;
        this.f7273f = 45;
        this.f7274g = 45;
        init(context);
    }
}
