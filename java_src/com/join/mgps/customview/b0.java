package com.join.mgps.customview;

import android.content.Context;
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
import android.widget.TextView;
import android.widget.Toast;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.wufan.user.service.protobuf.n0;
import io.netty.handler.traffic.AbstractTrafficShapingHandler;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: RewardToast.java */
/* loaded from: classes4.dex */
public class b0 {

    /* renamed from: c  reason: collision with root package name */
    private static b0 f48381c;

    /* renamed from: d  reason: collision with root package name */
    private static Toast f48382d;

    /* renamed from: e  reason: collision with root package name */
    private static TextView f48383e;

    /* renamed from: f  reason: collision with root package name */
    private static LinearLayout f48384f;

    /* renamed from: g  reason: collision with root package name */
    private static ImageView f48385g;

    /* renamed from: h  reason: collision with root package name */
    private static Context f48386h;

    /* renamed from: i  reason: collision with root package name */
    private static long f48387i;

    /* renamed from: a  reason: collision with root package name */
    private long f48388a;

    /* renamed from: b  reason: collision with root package name */
    Handler f48389b = new a();

    /* compiled from: RewardToast.java */
    /* loaded from: classes4.dex */
    class a extends Handler {

        /* compiled from: RewardToast.java */
        /* renamed from: com.join.mgps.customview.b0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class animation.Animation$AnimationListenerC0357a implements Animation.AnimationListener {
            animation.Animation$AnimationListenerC0357a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        /* compiled from: RewardToast.java */
        /* loaded from: classes4.dex */
        class b implements Animation.AnimationListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Animation f48392b;

            b(Animation animation) {
                this.f48392b = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                b0.f48385g.startAnimation(this.f48392b);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        /* compiled from: RewardToast.java */
        /* loaded from: classes4.dex */
        class c implements Animation.AnimationListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Animation f48394b;

            c(Animation animation) {
                this.f48394b = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                b0.f48385g.startAnimation(this.f48394b);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        /* compiled from: RewardToast.java */
        /* loaded from: classes4.dex */
        class d implements Animation.AnimationListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Animation f48396b;

            d(Animation animation) {
                this.f48396b = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                b0.f48385g.startAnimation(this.f48396b);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        /* compiled from: RewardToast.java */
        /* loaded from: classes4.dex */
        class e implements Animation.AnimationListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Animation f48398b;

            e(Animation animation) {
                this.f48398b = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (System.currentTimeMillis() - b0.this.f48388a > 300) {
                    b0.f48382d.show();
                    b0.this.f48389b.sendEmptyMessageDelayed(0, 2000L);
                    b0.this.f48389b.sendEmptyMessageDelayed(1, 2500L);
                    return;
                }
                b0.f48385g.startAnimation(this.f48398b);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        /* compiled from: RewardToast.java */
        /* loaded from: classes4.dex */
        class f extends TimerTask {
            f() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                b0.this.f48389b.sendEmptyMessage(4);
            }
        }

        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 == 0) {
                b0.f48384f.startAnimation(AnimationUtils.loadAnimation(b0.f48386h, R.anim.reward_slide_out));
            } else if (i4 == 1) {
                Animation loadAnimation = AnimationUtils.loadAnimation(b0.f48386h, R.anim.reward_scale_out);
                b0.f48385g.startAnimation(loadAnimation);
                loadAnimation.setAnimationListener(new animation.Animation$AnimationListenerC0357a());
            } else if (i4 != 3) {
                if (i4 == 4) {
                    b0.f48382d.show();
                } else if (i4 != 5) {
                } else {
                    long unused = b0.f48387i = System.currentTimeMillis();
                    b0.f48382d.show();
                    new Timer().schedule(new f(), 3500L);
                    b0.this.f48389b.sendEmptyMessage(3);
                }
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
                b0.this.f48388a = System.currentTimeMillis();
                b0.f48385g.startAnimation(rotateAnimation);
            }
        }
    }

    private n0 h(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    public static b0 i(Context context) {
        f48386h = context;
        f48386h = context.getApplicationContext();
        if (f48381c == null) {
            f48381c = new b0();
            View inflate = LayoutInflater.from(context).inflate(R.layout.reward, (ViewGroup) null);
            f48383e = (TextView) inflate.findViewById(R.id.txt);
            f48384f = (LinearLayout) inflate.findViewById(R.id.rewardContainer);
            f48385g = (ImageView) inflate.findViewById(R.id.moneyPackage);
            Toast toast = new Toast(context);
            f48382d = toast;
            toast.setGravity(81, 0, 200);
            f48382d.setDuration(1);
            f48382d.setView(inflate);
        }
        return f48381c;
    }

    public void j(RewardType rewardType, int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append("method show() called.type");
        sb.append(rewardType.getVal());
        Context context = f48386h;
        if (context == null || k(context)) {
            f48382d.cancel();
            if (i4 == 0 && i5 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(rewardType.getVal() + "  奖励: ");
            if (i4 > 0) {
                sb2.append("<font color='0xf47500' >+" + i4 + "</font>铜板");
                if (i5 > 0) {
                    sb2.append("&nbsp;&nbsp;");
                }
            }
            if (i5 > 0) {
                sb2.append("<font color='0xf47500' >+" + i5 + "</font>经验");
            }
            f48383e.setText(Html.fromHtml(sb2.toString()));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("gap=");
            sb3.append(System.currentTimeMillis() - f48387i);
            if (System.currentTimeMillis() - f48387i < AbstractTrafficShapingHandler.DEFAULT_MAX_TIME) {
                if (com.join.android.app.common.utils.n.F(f48386h)) {
                    this.f48389b.sendEmptyMessageDelayed(5, AbstractTrafficShapingHandler.DEFAULT_MAX_TIME);
                } else {
                    this.f48389b.sendEmptyMessageDelayed(5, AbstractTrafficShapingHandler.DEFAULT_MAX_TIME);
                }
            } else if (com.join.android.app.common.utils.n.F(f48386h)) {
                this.f48389b.sendEmptyMessageDelayed(5, com.join.mgps.data.c.f49010a);
            } else {
                this.f48389b.sendEmptyMessage(5);
            }
        }
    }

    boolean k(Context context) {
        if (h(context) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(context).isTourist();
    }
}
