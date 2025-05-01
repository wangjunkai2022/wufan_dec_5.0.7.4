package com.join.mgps.customview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.common.statfs.StatFsHelper;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: RewardPopupWindow.java */
/* loaded from: classes4.dex */
public class a0 extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    Context f48338a;

    /* renamed from: b  reason: collision with root package name */
    TextView f48339b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f48340c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f48341d;

    /* renamed from: e  reason: collision with root package name */
    private long f48342e;

    /* renamed from: f  reason: collision with root package name */
    Handler f48343f;

    /* compiled from: RewardPopupWindow.java */
    /* loaded from: classes4.dex */
    class a extends Handler {

        /* compiled from: RewardPopupWindow.java */
        /* renamed from: com.join.mgps.customview.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class animation.Animation$AnimationListenerC0355a implements Animation.AnimationListener {
            animation.Animation$AnimationListenerC0355a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                a0.this.dismiss();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        /* compiled from: RewardPopupWindow.java */
        /* loaded from: classes4.dex */
        class b implements Animation.AnimationListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Animation f48346b;

            b(Animation animation) {
                this.f48346b = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                a0.this.f48341d.startAnimation(this.f48346b);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        /* compiled from: RewardPopupWindow.java */
        /* loaded from: classes4.dex */
        class c implements Animation.AnimationListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Animation f48348b;

            c(Animation animation) {
                this.f48348b = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                a0.this.f48341d.startAnimation(this.f48348b);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        /* compiled from: RewardPopupWindow.java */
        /* loaded from: classes4.dex */
        class d implements Animation.AnimationListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Animation f48350b;

            d(Animation animation) {
                this.f48350b = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                a0.this.f48341d.startAnimation(this.f48350b);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        /* compiled from: RewardPopupWindow.java */
        /* loaded from: classes4.dex */
        class e implements Animation.AnimationListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Animation f48352b;

            e(Animation animation) {
                this.f48352b = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (System.currentTimeMillis() - a0.this.f48342e > 300) {
                    a0.this.f48343f.sendEmptyMessageDelayed(0, 1000L);
                    a0.this.f48343f.sendEmptyMessageDelayed(1, 1500L);
                    return;
                }
                a0.this.f48341d.startAnimation(this.f48352b);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 == 0) {
                a0 a0Var = a0.this;
                a0Var.f48340c.startAnimation(AnimationUtils.loadAnimation(a0Var.f48338a, R.anim.slide_out));
            } else if (i4 == 1) {
                Animation loadAnimation = AnimationUtils.loadAnimation(a0.this.f48338a, R.anim.scale_out);
                a0.this.f48341d.startAnimation(loadAnimation);
                loadAnimation.setAnimationListener(new animation.Animation$AnimationListenerC0355a());
            } else if (i4 != 3) {
            } else {
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 40.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setFillEnabled(true);
                rotateAnimation.setFillAfter(false);
                rotateAnimation.setDuration(10L);
                RotateAnimation rotateAnimation2 = new RotateAnimation(40.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation2.setFillEnabled(true);
                rotateAnimation2.setFillAfter(true);
                rotateAnimation2.setDuration(10L);
                RotateAnimation rotateAnimation3 = new RotateAnimation(0.0f, -40.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation3.setFillEnabled(true);
                rotateAnimation3.setFillAfter(true);
                rotateAnimation3.setDuration(10L);
                RotateAnimation rotateAnimation4 = new RotateAnimation(-40.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation4.setFillEnabled(true);
                rotateAnimation4.setFillAfter(true);
                rotateAnimation4.setDuration(10L);
                rotateAnimation.setAnimationListener(new b(rotateAnimation2));
                rotateAnimation2.setAnimationListener(new c(rotateAnimation3));
                rotateAnimation3.setAnimationListener(new d(rotateAnimation4));
                rotateAnimation4.setAnimationListener(new e(rotateAnimation));
                a0.this.f48342e = System.currentTimeMillis();
                a0.this.f48341d.startAnimation(rotateAnimation);
            }
        }
    }

    public a0(Context context) {
        super(context);
        this.f48343f = new a();
        this.f48338a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.reward, (ViewGroup) null);
        this.f48339b = (TextView) inflate.findViewById(R.id.txt);
        this.f48340c = (LinearLayout) inflate.findViewById(R.id.rewardContainer);
        this.f48341d = (ImageView) inflate.findViewById(R.id.moneyPackage);
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(StatFsHelper.f10899h);
        setHeight(300);
        setContentView(inflate);
    }

    public void c(View view) {
        this.f48339b.setText(Html.fromHtml("注册成功  奖励: <font color='0xf47500' >+100铜板</font>&nbsp;&nbsp;<font color='0xf47500' >+100</font>经验"));
        setWidth(view.getWidth());
        showAtLocation(view, 81, 0, 0);
        this.f48343f.sendEmptyMessage(3);
    }

    @Override // android.widget.PopupWindow
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }
}
