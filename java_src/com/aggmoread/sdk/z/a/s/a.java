package com.aggmoread.sdk.z.a.s;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.z.a.m.j;
import com.kwad.sdk.core.response.model.SdkConfigData;
import java.lang.reflect.Field;
import java.util.Formatter;
import java.util.Locale;
/* loaded from: classes2.dex */
public class a extends FrameLayout {
    private View.OnClickListener A;
    private View.OnClickListener B;
    private View.OnClickListener C;

    /* renamed from: a  reason: collision with root package name */
    private g f2456a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2457b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2458c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2459d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2460e;

    /* renamed from: f  reason: collision with root package name */
    private StringBuilder f2461f;

    /* renamed from: g  reason: collision with root package name */
    private Formatter f2462g;

    /* renamed from: h  reason: collision with root package name */
    private ProgressBar f2463h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f2464i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f2465j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f2466k;

    /* renamed from: l  reason: collision with root package name */
    private ImageButton f2467l;

    /* renamed from: m  reason: collision with root package name */
    private ImageButton f2468m;

    /* renamed from: n  reason: collision with root package name */
    private ImageButton f2469n;

    /* renamed from: o  reason: collision with root package name */
    private LinearLayout f2470o;

    /* renamed from: p  reason: collision with root package name */
    private LinearLayout f2471p;

    /* renamed from: q  reason: collision with root package name */
    private LinearLayout f2472q;

    /* renamed from: r  reason: collision with root package name */
    private RelativeLayout f2473r;

    /* renamed from: s  reason: collision with root package name */
    private ImageView f2474s;

    /* renamed from: t  reason: collision with root package name */
    protected Context f2475t;

    /* renamed from: u  reason: collision with root package name */
    private TextView f2476u;

    /* renamed from: v  reason: collision with root package name */
    private h f2477v;

    /* renamed from: w  reason: collision with root package name */
    private Handler f2478w;

    /* renamed from: x  reason: collision with root package name */
    boolean f2479x;

    /* renamed from: y  reason: collision with root package name */
    private View.OnTouchListener f2480y;

    /* renamed from: z  reason: collision with root package name */
    private View.OnClickListener f2481z;

    /* renamed from: com.aggmoread.sdk.z.a.s.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0079a implements Handler.Callback {
        C0079a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            a aVar;
            int i4;
            switch (message.what) {
                case 1:
                    a.this.e();
                    return false;
                case 2:
                    int k4 = a.this.k();
                    if (a.this.f2458c || a.this.f2456a == null || !a.this.f2456a.a()) {
                        return false;
                    }
                    Message obtain = Message.obtain();
                    obtain.what = 2;
                    a.this.f2478w.sendMessageDelayed(obtain, 1000 - (k4 % 1000));
                    return false;
                case 3:
                    a.this.l();
                    aVar = a.this;
                    i4 = 3;
                    break;
                case 4:
                case 6:
                case 8:
                    a.this.e();
                    a.this.f();
                    return false;
                case 5:
                    a.this.l();
                    aVar = a.this;
                    i4 = 5;
                    break;
                case 7:
                    aVar = a.this;
                    i4 = 7;
                    break;
                default:
                    return false;
            }
            aVar.b(i4);
            return false;
        }
    }

    /* loaded from: classes2.dex */
    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && a.this.f2457b) {
                a.this.e();
                a.this.f2479x = true;
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f2456a != null) {
                a.this.b();
                a.this.a(3000);
            }
        }
    }

    /* loaded from: classes2.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            aVar.f2460e = !aVar.f2460e;
            a.this.r();
            a.this.p();
            a.this.f2456a.a(a.this.f2460e);
        }
    }

    /* loaded from: classes2.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f2460e) {
                a.this.f2460e = false;
                a.this.r();
                a.this.p();
                a.this.f2456a.a(false);
            }
        }
    }

    /* loaded from: classes2.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f();
            a.this.f2456a.d();
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(boolean z4);

        boolean a();

        void b();

        boolean c();

        void d();

        int e();

        int f();

        int g();
    }

    /* loaded from: classes2.dex */
    public interface h {
        void a(float f5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class i {

        /* renamed from: b  reason: collision with root package name */
        public static final i f2488b = new i("SHOW_NEVER", 0);

        /* renamed from: c  reason: collision with root package name */
        public static final i f2489c = new i("SHOW_ALWAYS", 1);

        /* renamed from: d  reason: collision with root package name */
        public static final i f2490d = new i("SHOW_VISIBLE_OR_GONE", 2);

        private i(String str, int i4) {
        }
    }

    public a(Context context) {
        super(context);
        this.f2457b = true;
        this.f2459d = true;
        this.f2460e = false;
        i iVar = i.f2490d;
        this.f2478w = new Handler(new C0079a());
        this.f2479x = false;
        this.f2480y = new b();
        this.f2481z = new c();
        this.A = new d();
        this.B = new e();
        this.C = new f();
        a(context);
    }

    private void a() {
        g gVar;
        try {
            if (this.f2467l == null || (gVar = this.f2456a) == null || gVar.c()) {
                return;
            }
            this.f2467l.setEnabled(false);
        } catch (IncompatibleClassChangeError unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void a(Context context) {
        this.f2475t = context;
        RelativeLayout relativeLayout = new RelativeLayout(this.f2475t);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        relativeLayout.setBackgroundColor(0);
        addView(relativeLayout, layoutParams);
        relativeLayout.setOnTouchListener(this.f2480y);
        b(relativeLayout);
    }

    private void a(View view, int i4) {
        if (view == null || view.getVisibility() == i4) {
            return;
        }
        view.setVisibility(i4);
    }

    private void a(RelativeLayout relativeLayout) {
        this.f2474s = new ImageView(this.f2475t);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        j.a(this.f2474s, "iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAYAAADimHc4AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoV2luZG93cykiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6MUVBRDQ1QjczNTA2MTFFNUFGNTk5NTgwNjE0RTM2MzYiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6MUVBRDQ1QjgzNTA2MTFFNUFGNTk5NTgwNjE0RTM2MzYiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDoxRUFENDVCNTM1MDYxMUU1QUY1OTk1ODA2MTRFMzYzNiIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDoxRUFENDVCNjM1MDYxMUU1QUY1OTk1ODA2MTRFMzYzNiIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PtvEHoEAAAa+SURBVHja7F1NTFxV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");
        a(this.f2474s, 8);
        this.f2474s.setContentDescription(null);
        this.f2474s.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(this.f2474s, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f2456a.a()) {
            this.f2456a.b();
        } else {
            this.f2456a.d();
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i4) {
        View view;
        LinearLayout linearLayout;
        if (i4 == 3) {
            a(this.f2470o, 0);
            view = this.f2474s;
        } else if (i4 == 5) {
            a(this.f2471p, 0);
            a(this.f2474s, 8);
            linearLayout = this.f2470o;
            a(linearLayout, 8);
        } else if (i4 != 7) {
            return;
        } else {
            a(this.f2474s, 0);
            view = this.f2470o;
        }
        a(view, 8);
        linearLayout = this.f2471p;
        a(linearLayout, 8);
    }

    private void b(RelativeLayout relativeLayout) {
        f(relativeLayout);
        a(relativeLayout);
        d(relativeLayout);
        c(relativeLayout);
        e(relativeLayout);
        h();
        this.f2461f = new StringBuilder();
        this.f2462g = new Formatter(this.f2461f, Locale.getDefault());
    }

    private String c(int i4) {
        int i5 = i4 / 1000;
        int i6 = i5 % 60;
        int i7 = (i5 / 60) % 60;
        int i8 = i5 / SdkConfigData.DEFAULT_REQUEST_INTERVAL;
        this.f2461f.setLength(0);
        return (i8 > 0 ? this.f2462g.format("%d:%02d:%02d", Integer.valueOf(i8), Integer.valueOf(i7), Integer.valueOf(i6)) : this.f2462g.format("%02d:%02d", Integer.valueOf(i7), Integer.valueOf(i6))).toString();
    }

    private void c(RelativeLayout relativeLayout) {
        this.f2470o = new LinearLayout(this.f2475t);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.f2470o.setBackgroundColor(Color.parseColor("#ff000000"));
        this.f2470o.setGravity(17);
        this.f2470o.setOrientation(1);
        a(this.f2470o, 8);
        ProgressBar progressBar = new ProgressBar(this.f2475t);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(com.aggmoread.sdk.z.a.m.b.a(this.f2475t, 36.0d), com.aggmoread.sdk.z.a.m.b.a(this.f2475t, 36.0d));
        progressBar.setBackgroundColor(0);
        RotateDrawable rotateDrawable = new RotateDrawable();
        if (Build.VERSION.SDK_INT >= 21) {
            rotateDrawable.setDrawable(j.a(getResources(), "iVBORw0KGgoAAAANSUhEUgAAAG4AAABuCAMAAADxhdbJAAAAYFBMVEUAAAD///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////98JRy6AAAAIHRSTlMAswGsBQsCFXilf3KFJR+WVqGKj2YtnE88D19rNEdCsCgMELYAAAU2SURBVGjetNbd0powEAbgd4GgYEIDiIgGuP+7rAedadkknxC2z6kzuNm/BIcos9j7TXf9h76+7TJM+D8KY+sH+Sr9cgqyprnOKW7V40XuXIte6at+FMnr5V7RPvnV4CRT0xGdy5Cuqemo3iHR9F4pQd0gQTZXlGZ9Fcc7RFO6XwbHPCs6Y7Ul9ivedJae9ieyo/Nag32aliTkDnsMOcXl/c0uznwMz8W+ux836YzvXB5fxNYUfFya+RrvqhHfuDU2vYtCWOFusRBtWibz1wU/UWObcr4mmJjKKnxTzA8KeSLuEopxvSvsUY45+XITj7AnX2f2z+s1lJpoGd6B4MYMB7gqEG+BoCd5HgbHTB157uFU+JFpBSZp3Tr4Mk3crUCCkbhWwTP7SciQZFmJeYObKj/lqfzIh69decuQzBLTs481PAG6wAl3YmZs1HwCFM4oNf/eJnrjr55zpvan49XeIj9rWNnxyn8qx/cOq6xE+ZZoW+YNzlMP1px/f8lp4wUJfAWbyFhWCiK6yGrR/IEhY2CnKP407bqtnIKQLngxzLxyUhxbi8Ghu0BKtm3ONsNHse1LDTk20JsD3zZisktgV1neKIJ6+tfVL52GpNe2ePhoY8tZfvQmQPFyCuJt6HgAeQlRHU/dwva2rDt/bVk2+ZL4xqr5XWchy/HcXdmdK6vZviB4MR1kTdtG5GNnIKukDSBnfydse5eW4IMorKJ/qd+919uSojAQgOFsOK6QIEgGEND3f8vt7jQTYnZcD3H/qhnnaj67Q8ry09N5H3lX+eGz8x/8TojO401sbrz5LC33h5mM8aDwy0mTCjEnOy0ZImtSTs0vrtVSiGOSXL+1pI/Oyaziz/IiB+6SQFcowQ6xOaxY+37QeY6cSfa1MjLHgWW5gqFrQhUf5kQLlAMvH+Fym4AO1uJfVVwt5I7W4do0LsfxLqGFoatFl9gct3EZY/xSxdcch9XJvt9ZfI49QQ2elqzxOU5Q2p+uSeNrzNm6b4oaPzUcN2ya9bo8kpb/nZt+A+Vq10gaFXKiwsnYgpopBpfbQk0YhFhDcI4xXApZkC+dq2YNMMrE0NjjxK7F175Ob6+TMAbxRXrvpfa8r69KRtFcwsu0LXGsfTXHt7T8VsuFX+kw1JpmfEfLsiwYzku3DiPvtLyjpehlwXCuI1mMIQfe67MxuJEiKO1IYw86da/tExzL0R8E5iJMeRhy3Spf0KZsYm4jUQsbNsvuErjunD2rZRNEniN/2HkJDGI8HFbq545tKgr2XD+taKob7tTQcDW0pk+MVmATFWhh+uQ48GryKvXoqRVb1rPivXdrWMN4vMPhcNYPYVrrwhdJu9dIGnvMIajkP9aolVI7b9pAcb8VNMYcV5blPE53BlPGGPL8AUMt9JjjZR6Iw6rzWIQ3SGbaLMtiIMs5EbQH7u3YgYQ/EGgUcdA8jErb/wIXuNDKjBR6xKm999CllQYhq0GOI6/v+zN0hIZ1XS8Xy7G3DcjaY+lDRxgdXe005OYdNwC395TnpY9f1544G2rklRuHEcfzBeNBoD2eXOtuw3zOH484ApnbvEmKp1JlHXiWY4+43T4NcyRm4tmyoXZHx5w/HoM8H07HIizyhfSMHuZz/HRunH98Bkd7LblUB5s/3S0HoOMKKV4uZbCkNg5B4vzjQw32+Fa56W+32d/MBxpzRS7er1gr9pij3NOyjiNyapIiTrka5j03g8beAAGGW4zaZIbZPSvgQXaXi8qk+ESZXsbheO7tfMfhsqgiE/+h9MV5/gCFR4YPq8+2SgAAAABJRU5ErkJggg=="));
            rotateDrawable.setFromDegrees(0.0f);
            rotateDrawable.setPivotX(0.5f);
            rotateDrawable.setPivotY(0.5f);
            rotateDrawable.setToDegrees(360.0f);
        }
        progressBar.setIndeterminateDrawable(rotateDrawable);
        try {
            Field declaredField = progressBar.getClass().getDeclaredField("mDuration");
            declaredField.setAccessible(true);
            declaredField.setInt(progressBar, 1000);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f2470o.addView(progressBar, layoutParams2);
        this.f2476u = new TextView(this.f2475t);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2475t, 10.0d);
        this.f2476u.setText("加载中...");
        this.f2476u.setTextColor(-1);
        com.aggmoread.sdk.z.a.m.b.a(this.f2476u, 13);
        this.f2470o.addView(this.f2476u, layoutParams3);
        relativeLayout.addView(this.f2470o, layoutParams);
    }

    private void d(RelativeLayout relativeLayout) {
        this.f2473r = new RelativeLayout(this.f2475t);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.f2473r.setBackgroundColor(Color.parseColor("#7f000000"));
        this.f2473r.setGravity(16);
        ProgressBar g4 = g(this.f2473r);
        this.f2463h = g4;
        if (g4 != null) {
            g4.setMax(1000);
        }
        relativeLayout.addView(this.f2473r, layoutParams);
    }

    private void e(RelativeLayout relativeLayout) {
        this.f2471p = new LinearLayout(this.f2475t);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.f2471p.setBackgroundColor(Color.parseColor("#ff000000"));
        this.f2471p.setGravity(17);
        this.f2471p.setOrientation(1);
        a(this.f2471p, 8);
        ImageView imageView = new ImageView(this.f2475t);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        j.a(imageView, "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");
        this.f2471p.addView(imageView, layoutParams2);
        TextView textView = new TextView(this.f2475t);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2475t, 10.0d);
        textView.setText("出错了!");
        textView.setTextColor(-1);
        com.aggmoread.sdk.z.a.m.b.a(textView, 13);
        this.f2471p.addView(textView, layoutParams3);
        relativeLayout.addView(this.f2471p, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        a(this.f2474s, 8);
        a(this.f2471p, 8);
        a(this.f2470o, 8);
    }

    private void f(RelativeLayout relativeLayout) {
        this.f2472q = new LinearLayout(this.f2475t);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.aggmoread.sdk.z.a.m.b.a(this.f2475t, 50.0d));
        layoutParams.addRule(10);
        this.f2472q.setBackgroundColor(Color.parseColor("#7f000000"));
        this.f2472q.setOrientation(0);
        j();
        relativeLayout.addView(this.f2472q, layoutParams);
        a(this.f2472q, d() == i.f2488b ? 8 : 0);
    }

    private void h() {
        ImageButton imageButton = this.f2467l;
        if (imageButton != null) {
            imageButton.requestFocus();
            this.f2467l.setOnClickListener(this.f2481z);
        }
        if (this.f2459d) {
            ImageButton imageButton2 = this.f2468m;
            if (imageButton2 != null) {
                a(imageButton2, 0);
                this.f2468m.setOnClickListener(this.A);
            }
        } else {
            a(this.f2468m, 8);
        }
        ImageView imageView = this.f2474s;
        if (imageView != null) {
            imageView.setOnClickListener(this.C);
        }
        ImageButton imageButton3 = this.f2469n;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(this.B);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k() {
        g gVar = this.f2456a;
        if (gVar == null || this.f2458c) {
            return 0;
        }
        int f5 = gVar.f();
        int e5 = this.f2456a.e();
        if (this.f2463h != null) {
            if (e5 > 0) {
                float f6 = f5 / e5;
                h hVar = this.f2477v;
                if (hVar != null) {
                    hVar.a(f6);
                }
                this.f2463h.setProgress((int) (f6 * 1000.0f));
            }
            this.f2463h.setSecondaryProgress(this.f2456a.g() * 10);
        }
        TextView textView = this.f2464i;
        if (textView != null) {
            textView.setText(c(e5));
        }
        TextView textView2 = this.f2465j;
        if (textView2 != null) {
            textView2.setText(c(f5));
        }
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        a(this.f2469n, this.f2460e ? 0 : 4);
    }

    private void q() {
        ImageButton imageButton;
        String str;
        g gVar = this.f2456a;
        if (gVar == null || !gVar.a()) {
            imageButton = this.f2467l;
            str = "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAQlBMVEUAAAD///////////////////////////////////////////////////////////////////////////////////8IX9KGAAAAFXRSTlMAtPD8DgOeNOO+Vicd26l5PsqEYoeGu3ayAAAAlElEQVRIx+3VuxpFMBREYQkSDuduv/+r0k09q0CR6f9mybd1bW0Xr+Z5RbBE5AeBKY69Bghj+kAY/W9kMOK7QBj5j6AamVCNCIx+GwFUIwDVyIBqBKAamVDvyILaTGEsZ8ME47xZnGdln6OQB6DT5UIdSwOqigFVBcACToeqGFBVLKgqJlQVAMtw4m+uTmnt2trutx1vtyP8m6K/swAAAABJRU5ErkJggg==";
        } else {
            imageButton = this.f2467l;
            str = "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4BAMAAABaqCYtAAAAGFBMVEUAAAD///////////////////////////8jfp1fAAAAB3RSTlMAHvq+4MgxaI51OgAAAElJREFUOMtjGAXUAMLq5UVhIEYqkGGIJmleXl5eAmK4AxnFaJLq5UAgwMDACKKL0CTLkSXLRyVHJUcl4ZJ4MxLeLIg/844CKgAA/gibZXJbivoAAAAASUVORK5CYII=";
        }
        j.a(imageButton, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        ImageButton imageButton;
        String str;
        if (this.f2460e) {
            imageButton = this.f2468m;
            str = "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4BAMAAABaqCYtAAAALVBMVEUAAAD///////////////////////////////////////////////////////+hSKubAAAADnRSTlMAiHmWyg99QwOvY/5hsQj4B2EAAADWSURBVDjLYxgFVACMCsg8JgEUSblHyDy9hyga371TQNL47h1YK4KLpFUPoRTBj5RgYGicysAGV4nQ+ozV7xUDw7onAXkIjQitIu8eMzDYvXMEa0TX+g4i+Q6hEaEVJonQiABsCMkEDMkQhKQruhyrH0LySQCaJCfIIcBQkwPRE7BY+W47A0M1iBZAk+Q4KCgoWMDAwA6kpBoYBh4gO0imgZBXCAcC4eDDDHjCUUY4sjGTCd4ERnzS1AM5IxaUqK9CEjXO7IDQipmRQFoF8GVB/Jl3FFAOAMFHuuusc6BSAAAAAElFTkSuQmCC";
        } else {
            imageButton = this.f2468m;
            str = "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAYAAACohjseAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoV2luZG93cykiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6NEUwNEE3ODVGODQyMTFFMzhCMTNBN0I3OUU0MDBEMDIiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6NEUwNEE3ODZGODQyMTFFMzhCMTNBN0I3OUU0MDBEMDIiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo0RTA0QTc4M0Y4NDIxMUUzOEIxM0E3Qjc5RTQwMEQwMiIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo0RTA0QTc4NEY4NDIxMUUzOEIxM0E3Qjc5RTQwMEQwMiIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PkG6ngcAAAJnSURBVHja7Jg7SwNBEMdzRhsLFUJa/QQWNiJopSn8CjEaEbGNyTXGZ6Px0eTy8Av4+gA2FhKwsvCBliIoKPgFrI2es7AHS7jN7e7tJiHMwJ+TdXbdnzM3s3uW67qRbraeSJcbAiIgAiIgAiIgAnax9SrMmabizX0FnYJ+JdeNgc5BM6A+js8LaAV0K7wqOYtKKAH6c4NtV3JdorIrZh8y68qm6CzIEvAbVciMe8Goj5h8B/sFfB5BiwqAF6AlhdTW/g4GwSVA34rzz+jzRDBTWl5Fr0LAeTamC84E4A4oH2J+EZTr5BQldkCfh5LzHFC23Y2+sQA8gPY5kHkNcMegdKjCI9mrlpl+dAcapONbnJ61LrCmw5lbBVnUZx5Up+M3MnuWBYyCCqBLBi4SApIHV2HgPM1R/7hJwCDxIDdCwilLdxXdA237jA/5jH35jFVBq+TN0bYjzRH0tMlE5KiJn834lXVGzpOJNkGsQJ8DoLWAvuedL7NaI0fNwi/bCIiAXQlIbgMlkC3gm6O+lpGdGGgRpHCVmPJvt7NNmIDz+7ZiB8AZg+wxkJYZn98NC45ltKer5H8kTs+QScHIuTRdLU60Zc6jyVYctmt0A+TqkmI2WuFs1AlIOVHIFHNdqpkErDMbID+nQ8CJQJI74ULD3/0xCShqjkKxcCTWbyugE6LqFTsd0NFQ2os6AXW2CXItedKwznM7L7xBVqdFQTV6jQWlI99BtoXIKCUIZzRFPwV8oqAJhWQap3N17EE5RSdBbwHRuwbFFCIYo3ObRfEdNCWzLn6yQEAEREAEREAEREAE7Fj7F2AA+Z+qB36kbeAAAAAASUVORK5CYII=";
        }
        j.a(imageButton, str);
    }

    public void a(int i4) {
        if (!this.f2457b) {
            k();
            ImageButton imageButton = this.f2467l;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            a();
            this.f2457b = true;
        }
        q();
        p();
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        i d5 = d();
        i iVar = i.f2488b;
        if (d5 != iVar) {
            a(this.f2472q, 0);
        } else {
            a(this.f2472q, 8);
        }
        if (c() != iVar) {
            a(this.f2473r, 0);
        } else {
            a(this.f2473r, 8);
        }
        this.f2478w.sendEmptyMessage(2);
        Message obtainMessage = this.f2478w.obtainMessage(1);
        if (i4 != 0) {
            this.f2478w.removeMessages(1);
            this.f2478w.sendMessageDelayed(obtainMessage, i4);
        }
    }

    public void a(g gVar) {
        this.f2456a = gVar;
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z4) {
        this.f2460e = z4;
        r();
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i c() {
        throw null;
    }

    protected i d() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z4 = keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0;
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z4) {
                b();
                a(3000);
                ImageButton imageButton = this.f2467l;
                if (imageButton != null) {
                    imageButton.requestFocus();
                }
            }
            return true;
        } else if (keyCode == 126) {
            if (z4 && !this.f2456a.a()) {
                this.f2456a.d();
                q();
                a(3000);
            }
            return true;
        } else if (keyCode == 86 || keyCode == 127) {
            if (z4 && this.f2456a.a()) {
                this.f2456a.b();
                q();
                a(3000);
            }
            return true;
        } else if (keyCode == 25 || keyCode == 24 || keyCode == 164 || keyCode == 27) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            if (keyCode != 4 && keyCode != 82) {
                a(3000);
                return super.dispatchKeyEvent(keyEvent);
            }
            if (z4) {
                e();
            }
            return true;
        }
    }

    public void e() {
        if (this.f2457b) {
            i c5 = c();
            i iVar = i.f2490d;
            if (c5 == iVar) {
                this.f2478w.removeMessages(2);
                a(this.f2473r, 8);
            }
            if (d() == iVar) {
                a(this.f2472q, 8);
            }
            this.f2457b = false;
        }
    }

    protected ProgressBar g(RelativeLayout relativeLayout) {
        throw null;
    }

    public void g() {
        this.f2478w.sendEmptyMessage(4);
    }

    public boolean i() {
        return this.f2457b;
    }

    protected void j() {
        this.f2469n = new ImageButton(this.f2475t);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(com.aggmoread.sdk.z.a.m.b.a(this.f2475t, 50.0d), -1);
        a(this.f2469n, 4);
        j.a(this.f2469n, "iVBORw0KGgoAAAANSUhEUgAAABcAAAAmCAMAAAAY0vCaAAAAVFBMVEUAAAD///////////////////////////////////////////////////////////////////////////////////////////////////////////8wXzyWAAAAG3RSTlMAD2P8Zsv2YPDGHOjghC4n13A2zExGPqufFQQwMkirAAAAeElEQVQoz7XM2Q5AMBCF4VFULbXv8/7vSSQiY6aEcC6/PznANg3a2JlxUuI6KzNmZ85wm5EZR8LFzo1HOL3mkHD+iGvzhHsHa5G7G44JtzLnvshgCXOvDqI/6hQUvg7Bj8H/LETvg3IEXThCBSxQp8EkwNaWOq5hAY/EHeIxvlzAAAAAAElFTkSuQmCC");
        this.f2469n.setContentDescription("返回");
        this.f2469n.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f2469n.setBackgroundColor(Color.parseColor("#00000000"));
        this.f2472q.addView(this.f2469n, layoutParams);
        this.f2466k = new TextView(this.f2475t);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 16;
        layoutParams2.rightMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2475t, 50.0d);
        this.f2466k.setEllipsize(TextUtils.TruncateAt.END);
        this.f2466k.setGravity(17);
        this.f2466k.setPadding(com.aggmoread.sdk.z.a.m.b.a(this.f2475t, 30.0d), 0, com.aggmoread.sdk.z.a.m.b.a(this.f2475t, 30.0d), 0);
        this.f2466k.setSingleLine(true);
        this.f2466k.setTextColor(Color.parseColor("#ffffff"));
        com.aggmoread.sdk.z.a.m.b.a(this.f2466k, 18);
        this.f2472q.addView(this.f2466k, layoutParams2);
    }

    public void l() {
        a(3000);
    }

    public void m() {
        this.f2478w.sendEmptyMessage(7);
    }

    public void n() {
        this.f2478w.sendEmptyMessage(5);
    }

    public void o() {
        this.f2478w.sendEmptyMessage(3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            a(0);
            this.f2479x = false;
        } else if (action != 1) {
            if (action == 3) {
                e();
            }
        } else if (!this.f2479x) {
            this.f2479x = false;
            a(3000);
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        a(3000);
        return false;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        ImageButton imageButton;
        ImageButton imageButton2 = this.f2467l;
        if (imageButton2 != null) {
            imageButton2.setEnabled(z4);
        }
        ProgressBar progressBar = this.f2463h;
        if (progressBar != null) {
            progressBar.setEnabled(z4);
        }
        if (this.f2459d && (imageButton = this.f2468m) != null) {
            imageButton.setEnabled(z4);
        }
        ImageButton imageButton3 = this.f2469n;
        if (imageButton3 != null) {
            imageButton3.setEnabled(true);
        }
    }
}
