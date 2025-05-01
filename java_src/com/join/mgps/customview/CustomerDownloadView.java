package com.join.mgps.customview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CustomerDownloadView extends RelativeLayout {

    /* renamed from: q  reason: collision with root package name */
    public static final String f46813q = CustomerDownloadView.class.getSimpleName();

    /* renamed from: r  reason: collision with root package name */
    private static final int f46814r = 18;

    /* renamed from: s  reason: collision with root package name */
    private static final int f46815s = 18;

    /* renamed from: t  reason: collision with root package name */
    private static final int f46816t = 5;

    /* renamed from: u  reason: collision with root package name */
    private static final int f46817u = 5;

    /* renamed from: v  reason: collision with root package name */
    private static final int f46818v = 28;

    /* renamed from: w  reason: collision with root package name */
    private static final int f46819w = 5;

    /* renamed from: b  reason: collision with root package name */
    TextView f46820b;

    /* renamed from: c  reason: collision with root package name */
    TextView f46821c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f46822d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f46823e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f46824f;

    /* renamed from: g  reason: collision with root package name */
    ImageView f46825g;

    /* renamed from: h  reason: collision with root package name */
    private float f46826h;

    /* renamed from: i  reason: collision with root package name */
    View f46827i;

    /* renamed from: j  reason: collision with root package name */
    Context f46828j;

    /* renamed from: k  reason: collision with root package name */
    int f46829k;

    /* renamed from: l  reason: collision with root package name */
    int f46830l;

    /* renamed from: m  reason: collision with root package name */
    int f46831m;

    /* renamed from: n  reason: collision with root package name */
    int f46832n;

    /* renamed from: o  reason: collision with root package name */
    int f46833o;

    /* renamed from: p  reason: collision with root package name */
    AnimatorSet f46834p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CustomerDownloadView.this.f46821c.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CustomerDownloadView customerDownloadView = CustomerDownloadView.this;
            int i4 = customerDownloadView.f46830l + 1;
            customerDownloadView.f46830l = i4;
            if (i4 < customerDownloadView.f46829k) {
                customerDownloadView.e();
            } else {
                customerDownloadView.a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public CustomerDownloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46826h = 0.0f;
        this.f46829k = 2;
        this.f46830l = 0;
        this.f46833o = -1;
        b(context);
        this.f46828j = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_customer_download, this);
        this.f46827i = inflate;
        this.f46822d = (ImageView) inflate.findViewById(R.id.download_icon_img);
        this.f46824f = (ImageView) this.f46827i.findViewById(R.id.download_line_point_view);
        this.f46820b = (TextView) this.f46827i.findViewById(R.id.download_num_hint_txt);
        this.f46821c = (TextView) this.f46827i.findViewById(R.id.download_num_anim_txt);
        this.f46823e = (ImageView) this.f46827i.findViewById(R.id.download_line_view);
        this.f46825g = (ImageView) this.f46827i.findViewById(R.id.download_red_point);
    }

    private void b(Context context) {
        this.f46826h = com.join.android.app.common.utils.n.n(context).g();
    }

    void a() {
        int i4;
        ((ViewGroup) this.f46822d.getParent()).removeView(this.f46822d);
        this.f46822d = null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int i5 = this.f46832n;
        if (i5 != 0 && (i4 = this.f46831m) != 0) {
            layoutParams.width = i4;
            layoutParams.height = i5;
        } else {
            float f5 = this.f46826h;
            layoutParams.width = (int) (f5 * 18.0f);
            layoutParams.height = (int) (f5 * 18.0f);
        }
        layoutParams.topMargin = (int) (this.f46826h * 5.0f);
        ImageView imageView = new ImageView(this.f46828j);
        this.f46822d = imageView;
        imageView.setImageResource(R.drawable.download_normal);
        this.f46822d.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ((ViewGroup) this.f46821c.getParent()).addView(this.f46822d, layoutParams);
    }

    public void c(boolean z4) {
        if (z4) {
            this.f46825g.setVisibility(0);
        } else {
            this.f46825g.setVisibility(8);
        }
    }

    public void d() {
        AnimatorSet animatorSet = this.f46834p;
        if (animatorSet == null || !animatorSet.isRunning()) {
            this.f46830l = 0;
            e();
            f();
        }
    }

    public void e() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f46822d, "translationY", 0.0f, this.f46826h * 28.0f);
        ofFloat.setRepeatMode(1);
        ofFloat.addListener(new a());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f46821c, "translationY", 0.0f, this.f46826h * 28.0f);
        ofFloat2.setRepeatMode(1);
        ofFloat2.addListener(new b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(1000L);
        animatorSet.start();
    }

    public void f() {
        float f5;
        this.f46824f.setVisibility(0);
        this.f46823e.setImageResource(R.drawable.line_blue_bg);
        StringBuilder sb = new StringBuilder();
        sb.append("startLinePointAnimator: 移动距离：：：");
        sb.append(this.f46823e.getWidth() - (this.f46826h * 5.0f));
        sb.append("::::线长度::::");
        sb.append(this.f46823e.getWidth());
        sb.append(":::移动距离::");
        sb.append(getLayoutParams().height);
        int i4 = this.f46831m;
        if (i4 != 0) {
            f5 = i4 - (this.f46826h * 5.0f);
        } else {
            f5 = 13.0f * this.f46826h;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f46824f, "translationX", 0.0f, f5);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f46834p = animatorSet;
        animatorSet.play(ofFloat);
        this.f46834p.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f46834p.setDuration(1000L);
        this.f46834p.start();
    }

    public void g() {
        AnimatorSet animatorSet = this.f46834p;
        if (animatorSet == null || this.f46824f == null) {
            return;
        }
        if (animatorSet.isStarted()) {
            this.f46834p.cancel();
        }
        this.f46823e.setImageResource(R.drawable.line_grey_bg);
        this.f46824f.setVisibility(8);
    }

    public void setDownloadGameNum(int i4) {
        TextView textView = this.f46820b;
        textView.setText(i4 + "");
        if (i4 < 1) {
            this.f46820b.setVisibility(4);
        } else {
            this.f46820b.setVisibility(0);
        }
        TextView textView2 = this.f46821c;
        textView2.setText(i4 + "");
        if (i4 < 10) {
            setDownloadNumAnimMarginLeft();
        }
    }

    public void setDownloadIconRepeatCount(int i4) {
        this.f46829k = i4;
    }

    public void setDownloadIconRes(int i4) {
        this.f46833o = i4;
        this.f46822d.setImageResource(i4);
    }

    public void setDownloadIconSize(int i4, int i5) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f46822d.getLayoutParams();
        float f5 = this.f46826h;
        int i6 = (int) (i4 * f5);
        this.f46831m = i6;
        int i7 = (int) (i5 * f5);
        this.f46832n = i7;
        layoutParams.width = i6;
        layoutParams.height = i7;
        this.f46822d.setLayoutParams(layoutParams);
    }

    public void setDownloadLineRes(int i4) {
        this.f46823e.setImageResource(i4);
    }

    public void setDownloadLineSize(int i4) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f46823e.getLayoutParams();
        layoutParams.width = ((RelativeLayout.LayoutParams) this.f46822d.getLayoutParams()).width;
        layoutParams.height = (int) (i4 * this.f46826h);
        this.f46823e.setLayoutParams(layoutParams);
    }

    public void setDownloadNumAnimMarginLeft() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f46821c.getLayoutParams();
        StringBuilder sb = new StringBuilder();
        sb.append("setDownloadNumAnimMarginLeft: ");
        sb.append(layoutParams.leftMargin);
        if (layoutParams.leftMargin == 0) {
            layoutParams.leftMargin = (int) (this.f46826h * 5.0f);
            this.f46821c.setLayoutParams(layoutParams);
        }
    }

    public void setDownloadNumFontColor(int i4) {
        this.f46820b.setTextColor(i4);
    }

    public void setDownloadNumFontSize(float f5) {
        this.f46820b.setTextSize(f5);
    }

    public void setDownloadNumTextViewSize(int i4, int i5) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f46820b.getLayoutParams();
        float f5 = this.f46826h;
        layoutParams.width = (int) (i4 * f5);
        layoutParams.height = (int) (i5 * f5);
        this.f46820b.setLayoutParams(layoutParams);
    }
}
