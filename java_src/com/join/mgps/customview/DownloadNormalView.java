package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g2;
/* loaded from: classes4.dex */
public class DownloadNormalView extends FrameLayout implements View.OnClickListener {
    private String A;
    private String B;
    private String C;
    private w1.e D;

    /* renamed from: b  reason: collision with root package name */
    private TextView f46843b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f46844c;

    /* renamed from: d  reason: collision with root package name */
    private int f46845d;

    /* renamed from: e  reason: collision with root package name */
    private int f46846e;

    /* renamed from: f  reason: collision with root package name */
    private int f46847f;

    /* renamed from: g  reason: collision with root package name */
    private int f46848g;

    /* renamed from: h  reason: collision with root package name */
    private int f46849h;

    /* renamed from: i  reason: collision with root package name */
    private int f46850i;

    /* renamed from: j  reason: collision with root package name */
    private int f46851j;

    /* renamed from: k  reason: collision with root package name */
    private int f46852k;

    /* renamed from: l  reason: collision with root package name */
    private int f46853l;

    /* renamed from: m  reason: collision with root package name */
    private int f46854m;

    /* renamed from: n  reason: collision with root package name */
    private int f46855n;

    /* renamed from: o  reason: collision with root package name */
    private int f46856o;

    /* renamed from: p  reason: collision with root package name */
    private int f46857p;

    /* renamed from: q  reason: collision with root package name */
    private float f46858q;

    /* renamed from: r  reason: collision with root package name */
    private float f46859r;

    /* renamed from: s  reason: collision with root package name */
    private String f46860s;

    /* renamed from: t  reason: collision with root package name */
    private String f46861t;

    /* renamed from: u  reason: collision with root package name */
    private String f46862u;

    /* renamed from: v  reason: collision with root package name */
    private String f46863v;

    /* renamed from: w  reason: collision with root package name */
    private String f46864w;

    /* renamed from: x  reason: collision with root package name */
    private String f46865x;

    /* renamed from: y  reason: collision with root package name */
    private String f46866y;

    /* renamed from: z  reason: collision with root package name */
    private String f46867z;

    public DownloadNormalView(Context context) {
        super(context);
        f(context, null);
    }

    private void d(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DownloadNormalView);
            this.f46845d = obtainStyledAttributes.getResourceId(3, R.drawable.shape_3ca4fd_r4);
            this.f46846e = obtainStyledAttributes.getResourceId(1, R.drawable.shape_09bb07_r4);
            this.f46847f = obtainStyledAttributes.getResourceId(2, R.drawable.shape_3ca4fd_r4);
            this.f46848g = obtainStyledAttributes.getResourceId(0, R.drawable.shape_3ca4fd_r4);
            this.f46849h = obtainStyledAttributes.getResourceId(4, R.drawable.shape_fa8819_r4);
            this.f46850i = obtainStyledAttributes.getResourceId(5, R.drawable.shape_3ca4fd_r4);
            this.f46851j = obtainStyledAttributes.getResourceId(6, R.drawable.shape_3ca4fd_r4);
            this.f46852k = obtainStyledAttributes.getResourceId(10, R.drawable.shape_3ca4fd_r4);
            this.f46853l = obtainStyledAttributes.getResourceId(7, R.drawable.shape_3ca4fd_r4);
            this.f46854m = obtainStyledAttributes.getResourceId(8, R.drawable.shape_3ca4fd_r4);
            this.f46855n = obtainStyledAttributes.getResourceId(9, R.drawable.shape_09bb07_r4);
            this.f46856o = getResources().getColor(obtainStyledAttributes.getResourceId(13, R.color.white));
            this.f46857p = getResources().getColor(obtainStyledAttributes.getResourceId(11, R.color.money_text_color));
            this.f46858q = getResources().getDimension(obtainStyledAttributes.getResourceId(19, R.dimen.wdp18));
            this.f46859r = getResources().getDimensionPixelSize(obtainStyledAttributes.getResourceId(12, R.dimen.wdp12));
            this.f46860s = getResources().getString(obtainStyledAttributes.getResourceId(17, R.string.dl_text_normal));
            this.f46861t = getResources().getString(obtainStyledAttributes.getResourceId(15, R.string.dl_text_install));
            this.f46862u = getResources().getString(obtainStyledAttributes.getResourceId(16, R.string.dl_text_install_ing));
            this.f46863v = getResources().getString(obtainStyledAttributes.getResourceId(14, R.string.dl_text_get));
            this.f46864w = getResources().getString(obtainStyledAttributes.getResourceId(18, R.string.dl_text_open));
            this.f46865x = getResources().getString(obtainStyledAttributes.getResourceId(20, R.string.dl_text_start));
            this.f46866y = getResources().getString(obtainStyledAttributes.getResourceId(21, R.string.dl_text_stop));
            this.f46867z = getResources().getString(obtainStyledAttributes.getResourceId(25, R.string.dl_text_wait));
            this.A = getResources().getString(obtainStyledAttributes.getResourceId(22, R.string.dl_text_unzip));
            this.B = getResources().getString(obtainStyledAttributes.getResourceId(23, R.string.dl_text_unzipping));
            this.C = getResources().getString(obtainStyledAttributes.getResourceId(24, R.string.dl_text_update));
            obtainStyledAttributes.recycle();
            return;
        }
        e(context);
    }

    private void e(Context context) {
        this.f46845d = R.drawable.shape_3ca4fd_r4;
        this.f46846e = R.drawable.shape_09bb07_r4;
        this.f46847f = R.drawable.shape_3ca4fd_r4;
        this.f46848g = R.drawable.shape_3ca4fd_r4;
        this.f46849h = R.drawable.shape_3ca4fd_r4;
        this.f46850i = R.drawable.shape_3ca4fd_r4;
        this.f46851j = R.drawable.shape_3ca4fd_r4;
        this.f46852k = R.drawable.shape_3ca4fd_r4;
        this.f46853l = R.drawable.shape_3ca4fd_r4;
        this.f46854m = R.drawable.shape_3ca4fd_r4;
        this.f46855n = R.drawable.shape_09bb07_r4;
        this.f46856o = context.getResources().getColor(R.color.white);
        this.f46857p = context.getResources().getColor(R.color.money_text_color);
        this.f46858q = (int) context.getResources().getDimension(R.dimen.wdp18);
        this.f46859r = (int) context.getResources().getDimension(R.dimen.wdp18);
        this.f46860s = context.getResources().getString(R.string.dl_text_normal);
        this.f46861t = context.getResources().getString(R.string.dl_text_install);
        this.f46862u = context.getResources().getString(R.string.dl_text_install_ing);
        this.f46863v = context.getResources().getString(R.string.dl_text_get);
        this.f46864w = context.getResources().getString(R.string.dl_text_open);
        this.f46865x = context.getResources().getString(R.string.dl_text_start);
        this.f46866y = context.getResources().getString(R.string.dl_text_stop);
        this.f46867z = context.getResources().getString(R.string.dl_text_wait);
        this.A = context.getResources().getString(R.string.dl_text_unzip);
        this.B = context.getResources().getString(R.string.dl_text_unzipping);
        this.C = context.getResources().getString(R.string.dl_text_update);
    }

    private void f(Context context, AttributeSet attributeSet) {
        d(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.view_down_load_normal, this);
        this.f46843b = (TextView) findViewById(R.id.tv_text);
        this.f46844c = (TextView) findViewById(R.id.tv_sub_text);
        setOnClickListener(this);
        this.f46843b.setTextColor(this.f46856o);
        this.f46843b.setTextSize(0, this.f46858q);
    }

    private void g(TextView textView, String str, String str2) {
        if (g2.i(str)) {
            textView.setText(str);
        } else {
            textView.setText(str2);
        }
    }

    public void a(String str, boolean z4) {
        this.f46844c.setText(str);
        if (z4) {
            this.f46844c.setVisibility(0);
        } else {
            this.f46844c.setVisibility(8);
        }
    }

    public void b(int i4) {
        c(i4, "");
    }

    public void c(int i4, String str) {
        if (i4 == 9) {
            g(this.f46843b, str, this.C);
            this.f46843b.setBackgroundResource(this.f46855n);
        } else if (i4 == 12) {
            g(this.f46843b, str, this.B);
            this.f46843b.setBackgroundResource(this.f46854m);
        } else if (i4 == 13) {
            g(this.f46843b, str, this.A);
            this.f46843b.setBackgroundResource(this.f46853l);
        } else if (i4 == 11) {
            g(this.f46843b, str, this.f46861t);
            this.f46843b.setBackgroundResource(this.f46846e);
        } else if (i4 == 48) {
            g(this.f46843b, str, this.f46862u);
            this.f46843b.setBackgroundResource(this.f46847f);
        } else if (i4 == 5 || i4 == 42) {
            g(this.f46843b, str, this.f46864w);
            this.f46843b.setBackgroundResource(this.f46849h);
        } else if (i4 == 2) {
            g(this.f46843b, str, this.f46866y);
            this.f46843b.setBackgroundResource(this.f46845d);
        } else if (i4 == 3 || i4 == 6 || i4 == 27) {
            g(this.f46843b, str, this.f46865x);
            this.f46843b.setBackgroundResource(this.f46851j);
        } else if (i4 == 10) {
            g(this.f46843b, str, this.f46867z);
            this.f46843b.setBackgroundResource(this.f46852k);
        } else if (i4 == 1) {
        } else {
            if (i4 == 43) {
                g(this.f46843b, str, this.f46863v);
                this.f46843b.setBackgroundResource(this.f46845d);
            } else if (i4 == 39) {
                g(this.f46843b, str, this.f46863v);
                this.f46843b.setBackgroundResource(this.f46845d);
            } else if (i4 == 40) {
                g(this.f46843b, str, this.f46863v);
                this.f46843b.setBackgroundResource(this.f46845d);
            } else if (i4 == 41) {
                g(this.f46843b, str, this.f46863v);
                this.f46843b.setBackgroundResource(this.f46845d);
                setEnabled(false);
            } else {
                g(this.f46843b, str, this.f46863v);
                this.f46843b.setBackgroundResource(this.f46845d);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        w1.e eVar = this.D;
        if (eVar != null) {
            eVar.c(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        w1.e eVar;
        if (view != this || (eVar = this.D) == null) {
            return;
        }
        eVar.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w1.e eVar = this.D;
        if (eVar != null) {
            eVar.b();
        }
        this.D = null;
    }

    public void setBackgroundGet(int i4) {
        this.f46848g = i4;
    }

    public void setBackgroundInstall(int i4) {
        this.f46846e = i4;
    }

    public void setBackgroundInstalling(int i4) {
        this.f46847f = i4;
    }

    public void setBackgroundNormal(int i4) {
        this.f46845d = i4;
    }

    public void setBackgroundOpen(int i4) {
        this.f46849h = i4;
    }

    public void setBackgroundStart(int i4) {
        this.f46850i = i4;
    }

    public void setBackgroundStop(int i4) {
        this.f46851j = i4;
    }

    public void setBackgroundUnzip(int i4) {
        this.f46853l = i4;
    }

    public void setBackgroundUnzipping(int i4) {
        this.f46854m = i4;
    }

    public void setBackgroundUpdate(int i4) {
        this.f46855n = i4;
    }

    public void setBackgroundWait(int i4) {
        this.f46852k = i4;
    }

    public void setDownloadNormalCallback(w1.e eVar) {
        this.D = eVar;
    }

    public void setSubTextColor(int i4) {
        this.f46857p = i4;
    }

    public void setSubTextSize(int i4) {
        this.f46859r = i4;
    }

    public void setTextColor(int i4) {
        this.f46856o = i4;
    }

    public void setTextGet(String str) {
        this.f46863v = str;
    }

    public void setTextInstall(String str) {
        this.f46861t = str;
    }

    public void setTextInstalling(String str) {
        this.f46862u = str;
    }

    public void setTextNormal(String str) {
        this.f46860s = str;
    }

    public void setTextOpen(String str) {
        this.f46864w = str;
    }

    public void setTextSize(int i4) {
        this.f46858q = i4;
    }

    public void setTextStart(String str) {
        this.f46865x = str;
    }

    public void setTextStop(String str) {
        this.f46866y = str;
    }

    public void setTextUnzip(String str) {
        this.A = str;
    }

    public void setTextUnzipping(String str) {
        this.B = str;
    }

    public void setTextUpdate(String str) {
        this.C = str;
    }

    public void setTextWait(String str) {
        this.f46867z = str;
    }

    public DownloadNormalView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        f(context, attributeSet);
    }

    public DownloadNormalView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        f(context, attributeSet);
    }
}
