package com.beizi.fusion.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.Key;
import com.beizi.fusion.R;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.as;
import com.beizi.fusion.g.av;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public class TwistView extends RelativeLayout {
    public static final long DELAY_TIME_TWIST = 100;
    private int A;
    private int B;
    private a C;
    private int D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private Handler J;

    /* renamed from: a  reason: collision with root package name */
    private View f7276a;

    /* renamed from: b  reason: collision with root package name */
    private View f7277b;

    /* renamed from: c  reason: collision with root package name */
    private View f7278c;

    /* renamed from: d  reason: collision with root package name */
    private View f7279d;

    /* renamed from: e  reason: collision with root package name */
    private BackArrowView f7280e;

    /* renamed from: f  reason: collision with root package name */
    private BackArrowView f7281f;

    /* renamed from: g  reason: collision with root package name */
    private BackArrowView f7282g;

    /* renamed from: h  reason: collision with root package name */
    private ShakeView f7283h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f7284i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f7285j;

    /* renamed from: k  reason: collision with root package name */
    private int f7286k;

    /* renamed from: l  reason: collision with root package name */
    private ObjectAnimator f7287l;

    /* renamed from: m  reason: collision with root package name */
    private final int f7288m;

    /* renamed from: n  reason: collision with root package name */
    private final int f7289n;

    /* renamed from: o  reason: collision with root package name */
    private final long f7290o;

    /* renamed from: p  reason: collision with root package name */
    private final long f7291p;

    /* renamed from: q  reason: collision with root package name */
    private final long f7292q;

    /* renamed from: r  reason: collision with root package name */
    private String f7293r;

    /* renamed from: s  reason: collision with root package name */
    private String f7294s;

    /* renamed from: t  reason: collision with root package name */
    private String f7295t;

    /* renamed from: u  reason: collision with root package name */
    private long f7296u;

    /* renamed from: v  reason: collision with root package name */
    private Timer f7297v;

    /* renamed from: w  reason: collision with root package name */
    private TimerTask f7298w;

    /* renamed from: x  reason: collision with root package name */
    private Timer f7299x;

    /* renamed from: y  reason: collision with root package name */
    private TimerTask f7300y;

    /* renamed from: z  reason: collision with root package name */
    private int f7301z;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public TwistView(Context context) {
        super(context);
        this.f7288m = 1000;
        this.f7289n = 2000;
        this.f7290o = 500L;
        this.f7291p = 0L;
        this.f7292q = 0L;
        this.f7293r = "#FFFFFFFF";
        this.f7294s = "#99FFFFFF";
        this.f7295t = "#33FFFFFF";
        this.f7296u = 1000L;
        this.f7301z = 0;
        this.A = 0;
        this.B = 0;
        this.D = 0;
        this.E = true;
        this.F = 3;
        this.G = 1;
        this.H = 95;
        this.I = false;
        this.J = new Handler(Looper.getMainLooper()) { // from class: com.beizi.fusion.widget.TwistView.1
            @Override // android.os.Handler
            @RequiresApi(api = 21)
            @SuppressLint({"LongLogTag"})
            public void handleMessage(@NonNull Message message) {
                super.handleMessage(message);
                try {
                    int i4 = message.what;
                    if (i4 == 2000) {
                        TwistView twistView = TwistView.this;
                        twistView.updateStatus(twistView.D);
                    } else if (i4 == 1000) {
                        TwistView.this.a();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCountAnimation() {
        return (int) (this.f7296u / 100);
    }

    public void cancelArrowTimerTask() {
        try {
            Timer timer = this.f7299x;
            if (timer != null) {
                timer.cancel();
                this.f7299x = null;
            }
            TimerTask timerTask = this.f7300y;
            if (timerTask != null) {
                timerTask.cancel();
                this.f7300y = null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void cancelTwistTimerTask() {
        try {
            Timer timer = this.f7297v;
            if (timer != null) {
                timer.cancel();
                this.f7297v = null;
            }
            TimerTask timerTask = this.f7298w;
            if (timerTask != null) {
                timerTask.cancel();
                this.f7298w = null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void destroyView() {
        try {
            ShakeView shakeView = this.f7283h;
            if (shakeView != null) {
                shakeView.stopShake();
            }
            cancelTwistTimerTask();
            cancelArrowTimerTask();
            removeHandlerMsg();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @RequiresApi(api = 21)
    public void hideTargetView(View view, long j4, int i4) {
        try {
            float max = Math.max(view.getWidth(), view.getHeight());
            float countAnimation = max / getCountAnimation();
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, view.getRight(), (view.getTop() + view.getBottom()) / 2, max - (i4 * countAnimation), max - (countAnimation * (i4 + 1)));
            createCircularReveal.setDuration(j4);
            view.clearAnimation();
            createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.beizi.fusion.widget.TwistView.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                }
            });
            createCircularReveal.start();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void removeHandlerMsg() {
        try {
            Handler handler = this.J;
            if (handler != null) {
                handler.removeCallbacks(null);
                this.J = null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setDescribeText(String str) {
        try {
            TextView textView = this.f7285j;
            if (textView != null) {
                textView.setText(str);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setDurationAnimation(long j4) {
        this.f7296u = j4;
    }

    public void setJumpClickListener(View.OnClickListener onClickListener) {
        View view = this.f7279d;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setJumpOnTouchListener(View.OnTouchListener onTouchListener) {
        View view = this.f7279d;
        if (view != null) {
            view.setOnTouchListener(onTouchListener);
        }
    }

    public void setMainTitleText(String str) {
        try {
            TextView textView = this.f7284i;
            if (textView != null) {
                textView.setText(str);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setRotationEndCallback(a aVar) {
        this.C = aVar;
    }

    public void setTwistTotalLayoutBg(String str) {
        View view = this.f7279d;
        if (view != null) {
            try {
                as.a(view, str, 0, "", 100);
            } catch (Exception e5) {
                af.b("TwistView", " e : " + e5);
            }
        }
    }

    public void setTwistTotalLayoutWidthAndHeight(int i4, int i5) {
        try {
            View view = this.f7279d;
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = i4;
                layoutParams.height = i5 - av.a(getContext(), this.H);
                this.f7279d.setPadding(av.a(getContext(), 0.0f), av.a(getContext(), this.F), av.a(getContext(), 0.0f), av.a(getContext(), this.F));
                this.f7279d.setLayoutParams(layoutParams);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @RequiresApi(api = 21)
    public void showTargetView(View view, long j4, final int i4) {
        try {
            float max = Math.max(view.getWidth(), view.getHeight()) / getCountAnimation();
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, view.getRight(), (view.getTop() + view.getBottom()) / 2, (i4 * max) + 0.0f, max * (i4 + 1));
            createCircularReveal.setDuration(j4);
            view.clearAnimation();
            createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.beizi.fusion.widget.TwistView.7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (TwistView.this.f()) {
                        return;
                    }
                    TwistView.this.getCountAnimation();
                }
            });
            createCircularReveal.start();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void startTwistTimerTask() {
        try {
            if (this.f7297v == null) {
                this.f7297v = new Timer();
            }
            if (this.f7298w == null) {
                this.f7298w = new TimerTask() { // from class: com.beizi.fusion.widget.TwistView.2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    @RequiresApi(api = 21)
                    public void run() {
                        try {
                            if (TwistView.this.I || TwistView.this.J == null) {
                                return;
                            }
                            Message obtainMessage = TwistView.this.J.obtainMessage();
                            obtainMessage.what = 2000;
                            TwistView.this.J.sendMessage(obtainMessage);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                };
            }
            this.f7297v.scheduleAtFixedRate(this.f7298w, 0L, 100L);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void updateRollStatus(int i4) {
        this.D = i4;
    }

    @RequiresApi(api = 21)
    public void updateStatus(int i4) {
        if (i4 == 0) {
            return;
        }
        try {
            int countAnimation = getCountAnimation();
            if (this.B != i4) {
                if (this.E) {
                    this.A = 0;
                } else {
                    this.A = countAnimation - this.A;
                }
                this.B = i4;
            }
            if (this.A < 0) {
                this.A = 0;
            }
            if (this.A >= countAnimation) {
                if (this.E) {
                    this.A = 0;
                } else {
                    this.A = countAnimation;
                }
            }
            int i5 = this.A;
            if (i5 < 0 || i5 > countAnimation) {
                return;
            }
            a(this.f7277b, this.f7276a, 100L, i4, i5);
            this.A++;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        try {
            RelativeLayout.inflate(getContext(), R.layout.beizi_twist_view, this);
            c();
            d();
            e();
            startTwistTimerTask();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void c() {
        try {
            this.f7276a = findViewById(R.id.beizi_twist_go_imageview);
            this.f7279d = findViewById(R.id.beizi_twist_shake_total_layout);
            this.f7277b = findViewById(R.id.beizi_twist_total_layout);
            this.f7278c = findViewById(R.id.beizi_twist_right_total_layout);
            this.f7284i = (TextView) findViewById(R.id.beizi_twist_title_text);
            this.f7285j = (TextView) findViewById(R.id.beizi_twist_describe_text);
            this.f7280e = (BackArrowView) findViewById(R.id.beizi_twist_right_first_image);
            this.f7281f = (BackArrowView) findViewById(R.id.beizi_twist_right_second_image);
            this.f7282g = (BackArrowView) findViewById(R.id.beizi_twist_right_third_image);
            ShakeView shakeView = (ShakeView) findViewById(R.id.beizi_twist_top_view);
            this.f7283h = shakeView;
            shakeView.updateTwistRollAnim();
            setTwistTotalLayoutBg("#d9333333");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void d() {
        try {
            ShakeView shakeView = this.f7283h;
            if (shakeView != null) {
                shakeView.startShake();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void e() {
        try {
            if (this.f7299x == null) {
                this.f7299x = new Timer();
            }
            if (this.f7300y == null) {
                this.f7300y = new TimerTask() { // from class: com.beizi.fusion.widget.TwistView.6
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        try {
                            if (TwistView.this.J != null) {
                                TwistView.this.J.sendEmptyMessage(1000);
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                };
            }
            this.f7299x.schedule(this.f7300y, 0L, 500L);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return this.B == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            int i4 = this.f7286k;
            if (i4 == 0) {
                BackArrowView backArrowView = this.f7280e;
                if (backArrowView != null) {
                    backArrowView.setViewColor(Color.parseColor(this.f7293r));
                }
                BackArrowView backArrowView2 = this.f7281f;
                if (backArrowView2 != null) {
                    backArrowView2.setViewColor(Color.parseColor(this.f7294s));
                }
                BackArrowView backArrowView3 = this.f7282g;
                if (backArrowView3 != null) {
                    backArrowView3.setViewColor(Color.parseColor(this.f7295t));
                }
            } else if (i4 == 1) {
                BackArrowView backArrowView4 = this.f7280e;
                if (backArrowView4 != null) {
                    backArrowView4.setViewColor(Color.parseColor(this.f7295t));
                }
                BackArrowView backArrowView5 = this.f7281f;
                if (backArrowView5 != null) {
                    backArrowView5.setViewColor(Color.parseColor(this.f7293r));
                }
                BackArrowView backArrowView6 = this.f7282g;
                if (backArrowView6 != null) {
                    backArrowView6.setViewColor(Color.parseColor(this.f7294s));
                }
            } else if (i4 == 2) {
                BackArrowView backArrowView7 = this.f7280e;
                if (backArrowView7 != null) {
                    backArrowView7.setViewColor(Color.parseColor(this.f7294s));
                }
                BackArrowView backArrowView8 = this.f7281f;
                if (backArrowView8 != null) {
                    backArrowView8.setViewColor(Color.parseColor(this.f7295t));
                }
                BackArrowView backArrowView9 = this.f7282g;
                if (backArrowView9 != null) {
                    backArrowView9.setViewColor(Color.parseColor(this.f7293r));
                }
            }
            int i5 = this.f7286k;
            if (i5 == 2) {
                this.f7286k = 0;
            } else {
                this.f7286k = i5 + 1;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void b(View view, float f5, long j4, boolean z4, final int i4) {
        try {
            if (z4) {
                float width = f5 - view.getWidth();
                float countAnimation = width / getCountAnimation();
                float f6 = i4 * countAnimation;
                float f7 = f6 + 0.0f;
                float f8 = countAnimation + f6;
                if (f7 > 0.0f || f8 > 0.0f) {
                    this.E = false;
                }
                if ((f7 >= width || f8 >= width) && i4 >= getCountAnimation()) {
                    return;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", f7, f8);
                this.f7287l = ofFloat;
                ofFloat.setDuration(j4);
                this.f7287l.start();
                this.f7287l.addListener(new Animator.AnimatorListener() { // from class: com.beizi.fusion.widget.TwistView.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        try {
                            if (i4 + 1 < TwistView.this.getCountAnimation() || TwistView.this.C == null) {
                                return;
                            }
                            TwistView.this.I = true;
                            TwistView.this.C.a();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                return;
            }
            float width2 = f5 - view.getWidth();
            float countAnimation2 = width2 / getCountAnimation();
            float f9 = width2 - (i4 * countAnimation2);
            float f10 = width2 - ((i4 + 1) * countAnimation2);
            if (f9 >= 0.0f && f10 >= 0.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", f9, f10);
                this.f7287l = ofFloat2;
                ofFloat2.setDuration(j4);
                this.f7287l.start();
                return;
            }
            this.E = true;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public TwistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7288m = 1000;
        this.f7289n = 2000;
        this.f7290o = 500L;
        this.f7291p = 0L;
        this.f7292q = 0L;
        this.f7293r = "#FFFFFFFF";
        this.f7294s = "#99FFFFFF";
        this.f7295t = "#33FFFFFF";
        this.f7296u = 1000L;
        this.f7301z = 0;
        this.A = 0;
        this.B = 0;
        this.D = 0;
        this.E = true;
        this.F = 3;
        this.G = 1;
        this.H = 95;
        this.I = false;
        this.J = new Handler(Looper.getMainLooper()) { // from class: com.beizi.fusion.widget.TwistView.1
            @Override // android.os.Handler
            @RequiresApi(api = 21)
            @SuppressLint({"LongLogTag"})
            public void handleMessage(@NonNull Message message) {
                super.handleMessage(message);
                try {
                    int i4 = message.what;
                    if (i4 == 2000) {
                        TwistView twistView = TwistView.this;
                        twistView.updateStatus(twistView.D);
                    } else if (i4 == 1000) {
                        TwistView.this.a();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        b();
    }

    @RequiresApi(api = 21)
    private void a(View view, View view2, long j4, int i4, int i5) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null && view.hasWindowFocus()) {
                    if (i4 == 1) {
                        hideTargetView(view, j4, i5);
                        a(view2, view.getRight(), j4, true, i5);
                    } else if (i4 == 2 && !this.E) {
                        showTargetView(view, j4, i5);
                        a(view2, view.getRight(), j4, false, i5);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(View view, float f5, long j4, boolean z4, int i4) {
        try {
            b(view, f5, j4, z4, i4);
            a(view, j4, z4, i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(View view, long j4, boolean z4, int i4) {
        try {
            if (z4) {
                float countAnimation = 360.0f / getCountAnimation();
                float f5 = (i4 * countAnimation) + 0.0f;
                float f6 = countAnimation * (i4 + 1);
                if (f5 <= 360.0f && f6 <= 360.0f) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.ROTATION, f5, f6);
                    ofFloat.setDuration(j4);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.beizi.fusion.widget.TwistView.4
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        }
                    });
                    ofFloat.start();
                }
                return;
            }
            float countAnimation2 = (-360.0f) / getCountAnimation();
            float f7 = (i4 * countAnimation2) + 0.0f;
            float f8 = countAnimation2 * (i4 + 1);
            if (f7 >= -360.0f && f8 >= -360.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, Key.ROTATION, f7, f8);
                ofFloat2.setDuration(j4);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.beizi.fusion.widget.TwistView.5
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    }
                });
                ofFloat2.start();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public TwistView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7288m = 1000;
        this.f7289n = 2000;
        this.f7290o = 500L;
        this.f7291p = 0L;
        this.f7292q = 0L;
        this.f7293r = "#FFFFFFFF";
        this.f7294s = "#99FFFFFF";
        this.f7295t = "#33FFFFFF";
        this.f7296u = 1000L;
        this.f7301z = 0;
        this.A = 0;
        this.B = 0;
        this.D = 0;
        this.E = true;
        this.F = 3;
        this.G = 1;
        this.H = 95;
        this.I = false;
        this.J = new Handler(Looper.getMainLooper()) { // from class: com.beizi.fusion.widget.TwistView.1
            @Override // android.os.Handler
            @RequiresApi(api = 21)
            @SuppressLint({"LongLogTag"})
            public void handleMessage(@NonNull Message message) {
                super.handleMessage(message);
                try {
                    int i42 = message.what;
                    if (i42 == 2000) {
                        TwistView twistView = TwistView.this;
                        twistView.updateStatus(twistView.D);
                    } else if (i42 == 1000) {
                        TwistView.this.a();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        b();
    }
}
