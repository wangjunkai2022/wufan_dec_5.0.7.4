package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.GameMainActivity4;
import java.util.HashMap;
import java.util.Map;
/* compiled from: SpecialFilterPopupWindow.java */
/* loaded from: classes4.dex */
public class h0 extends PopupWindow implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f48489b;

    /* renamed from: c  reason: collision with root package name */
    private View f48490c;

    /* renamed from: d  reason: collision with root package name */
    public View f48491d;

    /* renamed from: e  reason: collision with root package name */
    View f48492e;

    /* renamed from: f  reason: collision with root package name */
    Map<Integer, String> f48493f;

    /* renamed from: g  reason: collision with root package name */
    int f48494g;

    /* renamed from: h  reason: collision with root package name */
    c f48495h;

    /* renamed from: i  reason: collision with root package name */
    View f48496i;

    /* renamed from: j  reason: collision with root package name */
    TextView f48497j;

    /* renamed from: k  reason: collision with root package name */
    TextView f48498k;

    /* renamed from: l  reason: collision with root package name */
    TextView f48499l;

    /* renamed from: m  reason: collision with root package name */
    TextView f48500m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialFilterPopupWindow.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                h0.this.dismiss();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialFilterPopupWindow.java */
    /* loaded from: classes4.dex */
    public class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            h0.super.dismiss();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SpecialFilterPopupWindow.java */
    /* loaded from: classes4.dex */
    public interface c {
        void a(int i4, String str);
    }

    /* compiled from: SpecialFilterPopupWindow.java */
    /* loaded from: classes4.dex */
    class d {

        /* renamed from: a  reason: collision with root package name */
        public TextView f48503a;

        /* renamed from: b  reason: collision with root package name */
        public View f48504b;

        /* renamed from: c  reason: collision with root package name */
        public View f48505c;

        /* renamed from: d  reason: collision with root package name */
        public View f48506d;

        d() {
        }
    }

    public h0(Context context) {
        super(context);
        this.f48493f = new HashMap();
        this.f48489b = context;
        i();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        dismiss();
    }

    private void i() {
        setAnimationStyle(R.style.animationNone);
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(true);
        setTouchInterceptor(new a());
    }

    private void k(int i4) {
        this.f48499l.setSelected(false);
        this.f48498k.setSelected(false);
        this.f48497j.setSelected(false);
        this.f48500m.setSelected(false);
        switch (i4) {
            case 52:
                this.f48498k.setSelected(true);
                this.f48494g = 52;
                return;
            case 53:
                this.f48497j.setSelected(true);
                this.f48494g = 53;
                return;
            case 54:
                this.f48499l.setSelected(true);
                this.f48494g = 54;
                return;
            case 55:
                this.f48500m.setSelected(true);
                this.f48494g = 55;
                return;
            default:
                return;
        }
    }

    void c() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f48489b, R.anim.scale_in);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        loadAnimation.setDuration(150L);
        alphaAnimation.setDuration(150L);
        this.f48496i.startAnimation(loadAnimation);
        this.f48492e.startAnimation(alphaAnimation);
    }

    void d() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f48489b, R.anim.scale_out);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.1f);
        loadAnimation.setDuration(150L);
        alphaAnimation.setDuration(150L);
        this.f48496i.startAnimation(loadAnimation);
        this.f48492e.startAnimation(alphaAnimation);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f48489b, R.anim.scale_out);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.1f);
        loadAnimation.setDuration(100L);
        alphaAnimation.setDuration(100L);
        this.f48496i.startAnimation(loadAnimation);
        this.f48492e.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new b());
    }

    public c e() {
        return this.f48495h;
    }

    void f() {
        View inflate = LayoutInflater.from(this.f48489b).inflate(R.layout.pop_special_game_filter, (ViewGroup) null);
        this.f48490c = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        update();
        this.f48493f.put(53, GameMainActivity4.I2);
        this.f48493f.put(52, "MOD");
        this.f48493f.put(54, "一键技能");
        this.f48493f.put(55, "快速通关");
        View findViewById = this.f48490c.findViewById(R.id.bg);
        this.f48492e = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.customview.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h0.this.g(view);
            }
        });
        this.f48497j = (TextView) this.f48490c.findViewById(R.id.fingerLayout);
        this.f48498k = (TextView) this.f48490c.findViewById(R.id.modLayout);
        this.f48499l = (TextView) this.f48490c.findViewById(R.id.onekeyLayout);
        this.f48500m = (TextView) this.f48490c.findViewById(R.id.fastLayout);
        this.f48496i = this.f48490c.findViewById(R.id.layoutMain);
        this.f48497j.setOnClickListener(this);
        this.f48498k.setOnClickListener(this);
        this.f48499l.setOnClickListener(this);
        this.f48500m.setOnClickListener(this);
    }

    public void h(c cVar) {
        this.f48495h = cVar;
    }

    public void j(View view, int i4) {
        showAsDropDown(view);
        this.f48494g = i4;
        k(i4);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fastLayout /* 2131297623 */:
                this.f48494g = 55;
                break;
            case R.id.fingerLayout /* 2131297677 */:
                this.f48494g = 53;
                break;
            case R.id.modLayout /* 2131299892 */:
                this.f48494g = 52;
                break;
            case R.id.onekeyLayout /* 2131300187 */:
                this.f48494g = 54;
                break;
        }
        k(this.f48494g);
        c cVar = this.f48495h;
        int i4 = this.f48494g;
        cVar.a(i4, this.f48493f.get(Integer.valueOf(i4)));
        dismiss();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        this.f48491d = view;
        if (Build.VERSION.SDK_INT == 24) {
            try {
                Rect rect = new Rect();
                this.f48491d.getGlobalVisibleRect(rect);
                setHeight(this.f48491d.getResources().getDisplayMetrics().heightPixels - rect.bottom);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        super.showAsDropDown(view);
        c();
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i4, int i5, int i6) {
        this.f48491d = view;
        super.showAtLocation(view, i4, i5, i6);
    }

    public h0(Context context, View view, int i4, int i5) {
        super(view, i4, i5, true);
        this.f48493f = new HashMap();
        this.f48489b = context;
        this.f48490c = view;
        i();
    }
}
