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
public class EqualizerView extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    View f46945b;

    /* renamed from: c  reason: collision with root package name */
    View f46946c;

    /* renamed from: d  reason: collision with root package name */
    View f46947d;

    /* renamed from: e  reason: collision with root package name */
    View f46948e;

    /* renamed from: f  reason: collision with root package name */
    AnimatorSet f46949f;

    /* renamed from: g  reason: collision with root package name */
    AnimatorSet f46950g;

    /* renamed from: h  reason: collision with root package name */
    Boolean f46951h;

    /* renamed from: i  reason: collision with root package name */
    int f46952i;

    /* renamed from: j  reason: collision with root package name */
    int f46953j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (EqualizerView.this.f46945b.getHeight() > 0) {
                View view = EqualizerView.this.f46945b;
                view.setPivotY(view.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    EqualizerView.this.f46945b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
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
            if (EqualizerView.this.f46946c.getHeight() > 0) {
                View view = EqualizerView.this.f46946c;
                view.setPivotY(view.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    EqualizerView.this.f46946c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
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
            if (EqualizerView.this.f46947d.getHeight() > 0) {
                View view = EqualizerView.this.f46947d;
                view.setPivotY(view.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    EqualizerView.this.f46947d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
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
            if (EqualizerView.this.f46948e.getHeight() > 0) {
                View view = EqualizerView.this.f46948e;
                view.setPivotY(view.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    EqualizerView.this.f46948e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        }
    }

    public EqualizerView(Context context) {
        super(context);
        this.f46951h = Boolean.FALSE;
        b();
    }

    private void b() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_equalizer, (ViewGroup) this, true);
        this.f46945b = findViewById(R.id.music_bar1);
        this.f46946c = findViewById(R.id.music_bar2);
        this.f46948e = findViewById(R.id.music_bar4);
        this.f46947d = findViewById(R.id.music_bar3);
        this.f46945b.setBackgroundColor(this.f46952i);
        this.f46946c.setBackgroundColor(this.f46952i);
        this.f46947d.setBackgroundColor(this.f46952i);
        this.f46948e.setBackgroundColor(this.f46952i);
        e();
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.EqualizerView, 0, 0);
        try {
            this.f46952i = obtainStyledAttributes.getInt(1, -16777216);
            this.f46953j = obtainStyledAttributes.getInt(0, 3000);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void e() {
        this.f46945b.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        this.f46946c.getViewTreeObserver().addOnGlobalLayoutListener(new b());
        this.f46947d.getViewTreeObserver().addOnGlobalLayoutListener(new c());
        this.f46948e.getViewTreeObserver().addOnGlobalLayoutListener(new d());
    }

    public void a() {
        this.f46951h = Boolean.TRUE;
        AnimatorSet animatorSet = this.f46949f;
        if (animatorSet == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f46945b, "scaleY", 0.2f, 0.8f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 0.8f, 0.7f, 0.2f, 0.4f, 0.9f, 0.7f, 0.6f, 0.1f, 0.3f, 0.1f, 0.4f, 0.1f, 0.8f, 0.7f, 0.9f, 0.5f, 0.6f, 0.3f, 0.1f);
            ofFloat.setRepeatCount(-1);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f46946c, "scaleY", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            ofFloat2.setRepeatCount(-1);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f46947d, "scaleY", 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.5f, 0.6f, 0.7f, 0.2f, 0.3f, 0.1f, 0.5f, 0.4f, 0.6f, 0.7f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.7f);
            ofFloat3.setRepeatCount(-1);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f46948e, "scaleY", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            ofFloat4.setRepeatCount(-1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f46949f = animatorSet2;
            animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat, ofFloat4);
            this.f46949f.setDuration(this.f46953j);
            this.f46949f.setInterpolator(new LinearInterpolator());
            this.f46949f.start();
        } else if (Build.VERSION.SDK_INT < 19) {
            if (animatorSet.isStarted()) {
                return;
            }
            this.f46949f.start();
        } else if (animatorSet.isPaused()) {
            this.f46949f.resume();
        }
    }

    public Boolean c() {
        return this.f46951h;
    }

    public void f() {
        this.f46951h = Boolean.FALSE;
        AnimatorSet animatorSet = this.f46949f;
        if (animatorSet != null && animatorSet.isRunning() && this.f46949f.isStarted()) {
            if (Build.VERSION.SDK_INT < 19) {
                this.f46949f.end();
            } else {
                this.f46949f.pause();
            }
        }
        AnimatorSet animatorSet2 = this.f46950g;
        if (animatorSet2 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f46945b, "scaleY", 0.1f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f46946c, "scaleY", 0.1f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f46947d, "scaleY", 0.1f);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f46950g = animatorSet3;
            animatorSet3.playTogether(ofFloat3, ofFloat2, ofFloat);
            this.f46950g.setDuration(200L);
            this.f46950g.start();
        } else if (animatorSet2.isStarted()) {
        } else {
            this.f46950g.start();
        }
    }

    public EqualizerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46951h = Boolean.FALSE;
        d(context, attributeSet);
        b();
    }

    public EqualizerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46951h = Boolean.FALSE;
        d(context, attributeSet);
        b();
    }
}
