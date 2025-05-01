package com.join.mgps.customview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class EqualizerViewLoding extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    View f46958b;

    /* renamed from: c  reason: collision with root package name */
    View f46959c;

    /* renamed from: d  reason: collision with root package name */
    View f46960d;

    /* renamed from: e  reason: collision with root package name */
    View f46961e;

    /* renamed from: f  reason: collision with root package name */
    AnimatorSet f46962f;

    /* renamed from: g  reason: collision with root package name */
    AnimatorSet f46963g;

    /* renamed from: h  reason: collision with root package name */
    Boolean f46964h;

    /* renamed from: i  reason: collision with root package name */
    int f46965i;

    /* renamed from: j  reason: collision with root package name */
    int f46966j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (EqualizerViewLoding.this.f46958b.getHeight() > 0) {
                View view = EqualizerViewLoding.this.f46958b;
                view.setPivotY(view.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    EqualizerViewLoding.this.f46958b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (EqualizerViewLoding.this.f46959c.getHeight() > 0) {
                View view = EqualizerViewLoding.this.f46959c;
                view.setPivotY(view.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    EqualizerViewLoding.this.f46959c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (EqualizerViewLoding.this.f46960d.getHeight() > 0) {
                View view = EqualizerViewLoding.this.f46960d;
                view.setPivotY(view.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    EqualizerViewLoding.this.f46960d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements ViewTreeObserver.OnGlobalLayoutListener {
        d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (EqualizerViewLoding.this.f46961e.getHeight() > 0) {
                View view = EqualizerViewLoding.this.f46961e;
                view.setPivotY(view.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    EqualizerViewLoding.this.f46961e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        }
    }

    public EqualizerViewLoding(Context context) {
        super(context);
        this.f46964h = Boolean.FALSE;
        b();
    }

    private void b() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_equalizer_loading, (ViewGroup) this, true);
        this.f46958b = findViewById(R.id.music_bar1);
        this.f46959c = findViewById(R.id.music_bar2);
        this.f46961e = findViewById(R.id.music_bar4);
        this.f46960d = findViewById(R.id.music_bar3);
        this.f46958b.setBackgroundColor(this.f46965i);
        this.f46959c.setBackgroundColor(this.f46965i);
        this.f46960d.setBackgroundColor(this.f46965i);
        this.f46961e.setBackgroundColor(this.f46965i);
        e();
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.EqualizerView, 0, 0);
        try {
            this.f46965i = obtainStyledAttributes.getInt(1, -16777216);
            this.f46966j = obtainStyledAttributes.getInt(0, 3000);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void e() {
        this.f46958b.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        this.f46959c.getViewTreeObserver().addOnGlobalLayoutListener(new b());
        this.f46960d.getViewTreeObserver().addOnGlobalLayoutListener(new c());
        this.f46961e.getViewTreeObserver().addOnGlobalLayoutListener(new d());
    }

    public void a() {
        this.f46964h = Boolean.TRUE;
        AnimatorSet animatorSet = this.f46962f;
        if (animatorSet == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f46958b, "scaleY", 0.2f, 0.8f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 0.8f, 0.7f, 0.2f, 0.4f, 0.9f, 0.7f, 0.6f, 0.1f, 0.3f, 0.1f, 0.4f, 0.1f, 0.8f, 0.7f, 0.9f, 0.5f, 0.6f, 0.3f, 0.1f);
            ofFloat.setRepeatCount(-1);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f46959c, "scaleY", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            ofFloat2.setRepeatCount(-1);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f46960d, "scaleY", 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.5f, 0.6f, 0.7f, 0.2f, 0.3f, 0.1f, 0.5f, 0.4f, 0.6f, 0.7f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.7f);
            ofFloat3.setRepeatCount(-1);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f46961e, "scaleY", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            ofFloat4.setRepeatCount(-1);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f46958b, "alpha", 0.2f, 0.8f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 0.8f, 0.7f, 0.2f, 0.4f, 0.9f, 0.7f, 0.6f, 0.1f, 0.3f, 0.1f, 0.4f, 0.1f, 0.8f, 0.7f, 0.9f, 0.5f, 0.6f, 0.3f, 0.1f);
            ofFloat5.setRepeatCount(-1);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f46958b, "alpha", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            ofFloat6.setRepeatCount(-1);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f46958b, "alpha", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            ofFloat7.setRepeatCount(-1);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f46958b, "alpha", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            ofFloat8.setRepeatCount(-1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f46962f = animatorSet2;
            animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8);
            this.f46962f.setDuration(this.f46966j);
            this.f46962f.setInterpolator(new LinearInterpolator());
            this.f46962f.start();
        } else if (Build.VERSION.SDK_INT < 19) {
            if (animatorSet.isStarted()) {
                return;
            }
            this.f46962f.start();
        } else if (animatorSet.isPaused()) {
            this.f46962f.resume();
        }
    }

    public Boolean c() {
        return this.f46964h;
    }

    public void f() {
        this.f46964h = Boolean.FALSE;
        AnimatorSet animatorSet = this.f46962f;
        if (animatorSet != null && animatorSet.isRunning() && this.f46962f.isStarted()) {
            if (Build.VERSION.SDK_INT < 19) {
                this.f46962f.end();
            } else {
                this.f46962f.pause();
            }
        }
        AnimatorSet animatorSet2 = this.f46963g;
        if (animatorSet2 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f46958b, "scaleY", 0.1f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f46959c, "scaleY", 0.1f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f46960d, "scaleY", 0.1f);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f46963g = animatorSet3;
            animatorSet3.playTogether(ofFloat3, ofFloat2, ofFloat);
            this.f46963g.setDuration(200L);
            this.f46963g.start();
        } else if (animatorSet2.isStarted()) {
        } else {
            this.f46963g.start();
        }
    }

    public EqualizerViewLoding(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46964h = Boolean.FALSE;
        d(context, attributeSet);
        b();
    }

    public EqualizerViewLoding(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46964h = Boolean.FALSE;
        d(context, attributeSet);
        b();
    }
}
