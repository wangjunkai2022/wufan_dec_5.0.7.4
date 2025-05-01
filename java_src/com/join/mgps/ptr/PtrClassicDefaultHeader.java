package com.join.mgps.ptr;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes4.dex */
public class PtrClassicDefaultHeader extends FrameLayout implements c {

    /* renamed from: l  reason: collision with root package name */
    private static final String f53657l = "cube_ptr_classic_last_update";

    /* renamed from: m  reason: collision with root package name */
    private static SimpleDateFormat f53658m = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: b  reason: collision with root package name */
    private int f53659b;

    /* renamed from: c  reason: collision with root package name */
    private RotateAnimation f53660c;

    /* renamed from: d  reason: collision with root package name */
    private RotateAnimation f53661d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f53662e;

    /* renamed from: f  reason: collision with root package name */
    private View f53663f;

    /* renamed from: g  reason: collision with root package name */
    private long f53664g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f53665h;

    /* renamed from: i  reason: collision with root package name */
    private String f53666i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f53667j;

    /* renamed from: k  reason: collision with root package name */
    private b f53668k;

    /* loaded from: classes4.dex */
    private class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private boolean f53669b;

        private b() {
            this.f53669b = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            if (TextUtils.isEmpty(PtrClassicDefaultHeader.this.f53666i)) {
                return;
            }
            this.f53669b = true;
            run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            this.f53669b = false;
            PtrClassicDefaultHeader.this.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            PtrClassicDefaultHeader.this.n();
            if (this.f53669b) {
                PtrClassicDefaultHeader.this.postDelayed(this, 1000L);
            }
        }
    }

    public PtrClassicDefaultHeader(Context context) {
        super(context);
        this.f53659b = 150;
        this.f53664g = -1L;
        this.f53668k = new b();
        l(null);
    }

    private String getLastUpdateTime() {
        if (this.f53664g == -1 && !TextUtils.isEmpty(this.f53666i)) {
            this.f53664g = getContext().getSharedPreferences(f53657l, 0).getLong(this.f53666i, -1L);
        }
        if (this.f53664g == -1) {
            return null;
        }
        long time = new Date().getTime() - this.f53664g;
        int i4 = (int) (time / 1000);
        if (time >= 0 && i4 > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(R.string.cube_ptr_last_update));
            if (i4 < 60) {
                sb.append(i4 + getContext().getString(R.string.cube_ptr_seconds_ago));
            } else {
                int i5 = i4 / 60;
                if (i5 > 60) {
                    int i6 = i5 / 60;
                    if (i6 > 24) {
                        sb.append(f53658m.format(new Date(this.f53664g)));
                    } else {
                        sb.append(i6 + getContext().getString(R.string.cube_ptr_hours_ago));
                    }
                } else {
                    sb.append(i5 + getContext().getString(R.string.cube_ptr_minutes_ago));
                }
            }
            return sb.toString();
        }
        return null;
    }

    private void h() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f53660c = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.f53660c.setDuration(this.f53659b);
        this.f53660c.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f53661d = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.f53661d.setDuration(this.f53659b);
        this.f53661d.setFillAfter(true);
    }

    private void i(PtrFrameLayout ptrFrameLayout) {
        this.f53662e.setVisibility(0);
        if (ptrFrameLayout.p()) {
            this.f53662e.setText(getResources().getString(R.string.xlistview_header_hint_normal));
        } else {
            this.f53662e.setText(getResources().getString(R.string.xlistview_header_hint_normal));
        }
    }

    private void j(PtrFrameLayout ptrFrameLayout) {
        if (ptrFrameLayout.p()) {
            return;
        }
        this.f53662e.setVisibility(0);
        this.f53662e.setText(R.string.xlistview_header_hint_ready);
    }

    private void k() {
    }

    private void m() {
        k();
        this.f53663f.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (!TextUtils.isEmpty(this.f53666i) && this.f53667j) {
            String lastUpdateTime = getLastUpdateTime();
            if (TextUtils.isEmpty(lastUpdateTime)) {
                this.f53665h.setVisibility(8);
                return;
            }
            this.f53665h.setVisibility(0);
            this.f53665h.setText(lastUpdateTime);
            return;
        }
        this.f53665h.setVisibility(8);
    }

    @Override // com.join.mgps.ptr.c
    public void a(PtrFrameLayout ptrFrameLayout) {
        k();
        this.f53663f.setVisibility(4);
        this.f53662e.setVisibility(0);
        this.f53662e.setText(getResources().getString(R.string.xlistview_header_hint_loading));
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(f53657l, 0);
        if (TextUtils.isEmpty(this.f53666i)) {
            return;
        }
        this.f53664g = new Date().getTime();
        sharedPreferences.edit().putLong(this.f53666i, this.f53664g).commit();
    }

    @Override // com.join.mgps.ptr.c
    public void b(PtrFrameLayout ptrFrameLayout, boolean z4, byte b5, com.join.mgps.ptr.indicator.a aVar) {
        int offsetToRefresh = ptrFrameLayout.getOffsetToRefresh();
        int d5 = aVar.d();
        int g4 = aVar.g();
        if (d5 < offsetToRefresh && g4 >= offsetToRefresh) {
            if (z4 && b5 == 2) {
                i(ptrFrameLayout);
            }
        } else if (d5 <= offsetToRefresh || g4 > offsetToRefresh || !z4 || b5 != 2) {
        } else {
            j(ptrFrameLayout);
        }
    }

    @Override // com.join.mgps.ptr.c
    public void c(PtrFrameLayout ptrFrameLayout) {
        m();
        this.f53667j = true;
        n();
    }

    @Override // com.join.mgps.ptr.c
    public void d(PtrFrameLayout ptrFrameLayout) {
        this.f53667j = true;
        n();
        this.f53668k.c();
        this.f53663f.setVisibility(4);
        this.f53662e.setVisibility(0);
        if (ptrFrameLayout.p()) {
            this.f53662e.setText(getResources().getString(R.string.xlistview_header_hint_normal));
        } else {
            this.f53662e.setText(getResources().getString(R.string.xlistview_header_hint_normal));
        }
    }

    @Override // com.join.mgps.ptr.c
    public void e(PtrFrameLayout ptrFrameLayout) {
        this.f53667j = false;
        k();
        this.f53663f.setVisibility(0);
        this.f53662e.setVisibility(0);
        this.f53662e.setText(R.string.xlistview_header_hint_loading);
        n();
        this.f53668k.d();
    }

    protected void l(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.PtrClassicHeader, 0, 0);
        if (obtainStyledAttributes != null) {
            this.f53659b = obtainStyledAttributes.getInt(0, this.f53659b);
        }
        h();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.cube_ptr_classic_default_header, this);
        this.f53662e = (TextView) inflate.findViewById(R.id.ptr_classic_header_rotate_view_header_title);
        this.f53665h = (TextView) inflate.findViewById(R.id.ptr_classic_header_rotate_view_header_last_update);
        this.f53663f = inflate.findViewById(R.id.ptr_classic_header_rotate_view_progressbar);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f53668k;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void setLastUpdateTimeKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f53666i = str;
    }

    public void setLastUpdateTimeRelateObject(Object obj) {
        setLastUpdateTimeKey(obj.getClass().getName());
    }

    public void setRotateAniTime(int i4) {
        if (i4 == this.f53659b || i4 == 0) {
            return;
        }
        this.f53659b = i4;
        h();
    }

    public PtrClassicDefaultHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53659b = 150;
        this.f53664g = -1L;
        this.f53668k = new b();
        l(attributeSet);
    }

    public PtrClassicDefaultHeader(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53659b = 150;
        this.f53664g = -1L;
        this.f53668k = new b();
        l(attributeSet);
    }
}
