package com.kwad.components.ad.j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.bo;
/* loaded from: classes5.dex */
public final class a {
    private View HJ;
    private Runnable HK;
    private boolean HL = false;
    @Nullable
    private Animator hG;
    private View yb;
    private Button yc;
    private Button yd;

    public a(View view) {
        this.HJ = view;
        initView();
    }

    private static Animator d(View view, long j4) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(j4);
        ofFloat.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f));
        return ofFloat;
    }

    private void initView() {
        this.yc = (Button) this.HJ.findViewById(R.id.ksad_reward_apk_info_install_action);
        this.yd = (Button) this.HJ.findViewById(R.id.ksad_reward_apk_info_install_start);
        this.yb = this.HJ.findViewById(R.id.ksad_reward_apk_info_install_container);
    }

    public final void hU() {
        com.kwad.sdk.core.e.c.d("ApkInstallAnimHelper", "startAnimation");
        int height = this.yb.getHeight();
        int width = this.yb.getWidth();
        if (height == 0 || width == 0) {
            return;
        }
        if (this.hG == null) {
            Animator a5 = a(this.yd, this.yc, width, height, 1600L, 200L);
            this.hG = a5;
            a5.addListener(new com.kwad.components.ad.widget.tailframe.appbar.b() { // from class: com.kwad.components.ad.j.a.1
                @Override // com.kwad.components.ad.widget.tailframe.appbar.b, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(final Animator animator) {
                    if (a.this.HL) {
                        return;
                    }
                    if (a.this.HK == null) {
                        a.this.HK = new Runnable() { // from class: com.kwad.components.ad.j.a.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                animator.start();
                            }
                        };
                    }
                    bo.a(a.this.HK, null, 1600L);
                }
            });
        }
        com.kwad.sdk.core.e.c.d("ApkInstallAnimHelper", "mAnimator isStarted: " + this.hG.isStarted());
        if (!this.hG.isStarted()) {
            com.kwad.sdk.core.e.c.d("ApkInstallAnimHelper", "mAnimator.start()");
            this.hG.start();
        }
        this.HL = false;
    }

    public final void jQ() {
        mB();
    }

    public final void mB() {
        Animator animator = this.hG;
        if (animator != null) {
            animator.cancel();
            this.hG.removeAllListeners();
            this.HL = true;
        }
        Runnable runnable = this.HK;
        if (runnable != null) {
            bo.c(runnable);
            this.HK = null;
        }
    }

    public final void mC() {
        this.HL = true;
    }

    private static Animator a(final View view, View view2, int i4, int i5, long j4, long j5) {
        Animator d5 = d(view, 200L);
        float f5 = i4;
        float f6 = i5;
        Animator a5 = a(view2, f5, f6, 200L);
        a5.addListener(new com.kwad.components.ad.widget.tailframe.appbar.b() { // from class: com.kwad.components.ad.j.a.2
            @Override // com.kwad.components.ad.widget.tailframe.appbar.b, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setAlpha(1.0f);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = 0;
                    layoutParams.height = 0;
                    view.setLayoutParams(layoutParams);
                }
            }
        });
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "scaleX", 1.0f, 1.0f);
        ofFloat.setDuration(1600L);
        Animator d6 = d(view2, 200L);
        Animator a6 = a(view, f5, f6, 200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(d5, a5, ofFloat, d6, a6);
        return animatorSet;
    }

    private static Animator a(final View view, float f5, final float f6, long j4) {
        final float f7 = f5 / f6;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f6);
        ofFloat.setDuration(j4);
        ofFloat.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f));
        final float dimension = view.getResources().getDimension(R.dimen.ksad_reward_apk_info_card_actionbar_text_size);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.j.a.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f8 = f7 * floatValue;
                float f9 = f6;
                if (f9 != 0.0f) {
                    float f10 = (floatValue / f9) * dimension;
                    View view2 = view;
                    if (view2 instanceof TextView) {
                        ((TextView) view2).setTextSize(0, f10);
                    }
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) floatValue;
                    layoutParams.width = (int) f8;
                    view.setLayoutParams(layoutParams);
                }
            }
        });
        return ofFloat;
    }
}
