package com.aggmoread.sdk.z.a.f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.aggmoread.sdk.z.a.m.m;
import com.aggmoread.sdk.z.a.p.a;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1997a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1998b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f1999c;

    /* renamed from: d  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f2000d;

    /* renamed from: e  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f2001e;

    /* renamed from: f  reason: collision with root package name */
    private Context f2002f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f2003g;

    /* renamed from: h  reason: collision with root package name */
    private View f2004h;

    /* renamed from: i  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.g.g f2005i;

    /* renamed from: j  reason: collision with root package name */
    private l f2006j;

    /* renamed from: k  reason: collision with root package name */
    private AtomicBoolean f2007k = new AtomicBoolean();

    /* renamed from: l  reason: collision with root package name */
    private boolean f2008l = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f2004h != null && b.this.f2004h.getParent() != null) {
                ((ViewGroup) b.this.f2004h.getParent()).removeView(b.this.f2004h);
            }
            if (b.this.f2006j != null) {
                b.this.f2006j.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.a.f.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0054b extends FrameLayout {
        C0054b(Context context) {
            super(context);
        }

        @Override // android.view.View
        protected void onWindowVisibilityChanged(int i4) {
            if (i4 != 0 || b.this.f2007k.get()) {
                return;
            }
            b.this.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements ViewTreeObserver.OnScrollChangedListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            b bVar = b.this;
            bVar.a(bVar.f2004h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements ViewTreeObserver.OnGlobalLayoutListener {
        d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            b bVar = b.this;
            bVar.a(bVar.f2004h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements a.g {

        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f2016b;

            a(Bitmap bitmap) {
                this.f2016b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2003g.setImageBitmap(this.f2016b);
                b.this.d();
            }
        }

        g() {
        }

        @Override // com.aggmoread.sdk.z.a.p.a.g
        public void a(int i4, byte[] bArr, com.aggmoread.sdk.z.a.g.e eVar) {
            String str;
            b bVar = b.this;
            if (eVar != null) {
                str = "广告渲染失败：code = " + eVar.a() + ", msg = " + eVar.b();
            } else if (bArr != null) {
                m.a().post(new a(com.aggmoread.sdk.z.a.n.a.a().a(bVar.f2003g.getWidth(), b.this.f2003g.getHeight(), Bitmap.Config.ARGB_8888, ImageView.ScaleType.CENTER_INSIDE, bArr)));
                return;
            } else {
                str = "广告素材为空!";
            }
            bVar.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2018b;

        h(String str) {
            this.f2018b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f2006j != null) {
                b.this.f2006j.a(this.f2018b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f2006j != null) {
                b.this.f2006j.onRenderSuccess();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f2006j != null) {
                b.this.f2006j.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f2006j == null || !b.this.f2007k.get()) {
                return;
            }
            b.this.f2006j.c();
        }
    }

    /* loaded from: classes2.dex */
    public interface l {
        void a();

        void a(String str);

        void b();

        void c();

        void onRenderSuccess();
    }

    public b(Context context) {
        this.f2002f = context;
    }

    private View a(Context context) {
        C0054b c0054b = new C0054b(context);
        c0054b.setBackgroundColor(-1);
        int a5 = com.aggmoread.sdk.z.a.m.b.a(context, 10.0d);
        c0054b.setPadding(a5, a5, a5, a5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, com.aggmoread.sdk.z.a.m.b.a(this.f2002f, 48.0d)));
        this.f2003g = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 0.25f;
        layoutParams.rightMargin = a5;
        this.f2003g.setLayoutParams(layoutParams);
        this.f2003g.setScaleType(ImageView.ScaleType.CENTER_CROP);
        linearLayout.addView(this.f2003g);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        layoutParams2.weight = 0.75f;
        relativeLayout.setLayoutParams(layoutParams2);
        this.f1998b = new TextView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(10);
        layoutParams3.rightMargin = com.aggmoread.sdk.z.a.m.b.a(context, 15.0d);
        this.f1998b.setLayoutParams(layoutParams3);
        this.f1998b.setMaxLines(2);
        this.f1998b.setTextSize(15.0f);
        this.f1998b.setEllipsize(TextUtils.TruncateAt.END);
        this.f1998b.setTextColor(-16777216);
        this.f1998b.setText("  ");
        relativeLayout.addView(this.f1998b);
        this.f1997a = new TextView(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(12);
        layoutParams4.rightMargin = com.aggmoread.sdk.z.a.m.b.a(context, 30.0d);
        this.f1997a.setLayoutParams(layoutParams4);
        this.f1997a.setMaxLines(1);
        this.f1997a.setTextSize(14.0f);
        this.f1997a.setEllipsize(TextUtils.TruncateAt.END);
        this.f1997a.setTextColor(Color.parseColor("#8a8a8a"));
        this.f1997a.setText("  ");
        relativeLayout.addView(this.f1997a);
        linearLayout.addView(relativeLayout);
        c0054b.addView(linearLayout);
        this.f1999c = new ImageView(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(com.aggmoread.sdk.z.a.m.b.a(context, 16.0d), com.aggmoread.sdk.z.a.m.b.a(context, 16.0d));
        layoutParams5.gravity = 53;
        this.f1999c.setLayoutParams(layoutParams5);
        com.aggmoread.sdk.z.a.m.j.a(this.f1999c, "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAABaklEQVRYR+2VP0vEQBDF31tsBfHTWO5saWOjoOefQq5RK0v9AtpZqYVi4X9QCyutJqn8OqK1OLKSwBHPu9wtEoSkTObN/PJ2ZpZo+GHD9dECtA60Dgx1QFUfAMw457re+6c6Y6uqswBOSL6IyMIgzVCALMveAUwC+DCz+RDC46CEqjpH8h7AhJm9hRCmkgBUtUPyEgDN7JPkmohc9UuaZdmymZ2TdADMzFZCCNdJAFEcEwO4iBBF4m4I4aw3saqukzwtYwCs/gbaqxt6BGVwBQIkN733x/F7nucbZnZUxFrd4jG+NkAfJ+Kr7aLowTjFRwaIgorVvW6O9OelcCQHSlEfiNhwP/qizsj+P4BGj6A6CQB2Cpv3/rwJGx3DRhdRnudLZhZX7/cqds4teu/v6qxiAB0RuU1axSmXEYBXEZlOBdg3swWSWyLyXGe243VM8tDMbkIIu0kAdQqmxIy1iFIKVrUtQOtA68AX4HzJIQMvlE8AAAAASUVORK5CYII=");
        c0054b.addView(this.f1999c);
        return c0054b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (this.f2007k.get() || !com.aggmoread.sdk.z.a.m.b.a(view)) {
            return;
        }
        view.getViewTreeObserver().removeOnScrollChangedListener(this.f2000d);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f2001e);
        this.f2007k.set(true);
        m.a().post(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        m.a().post(new h(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f2008l = true;
        m.a().post(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        m.a().post(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        m.a().post(new a());
    }

    public View a() {
        if (!this.f2008l) {
            h();
        }
        if (this.f2004h == null) {
            this.f2004h = a(this.f2002f);
        }
        return this.f2004h;
    }

    public void a(l lVar) {
        this.f2006j = lVar;
    }

    public void a(com.aggmoread.sdk.z.a.g.g gVar) {
        this.f2005i = gVar;
    }

    public int b() {
        return -1;
    }

    public String c() {
        return "";
    }

    public void g() {
        View view = this.f2004h;
        if (view != null) {
            if (this.f2000d != null) {
                view.getViewTreeObserver().removeOnScrollChangedListener(this.f2000d);
                this.f2000d = null;
            }
            if (this.f2001e != null) {
                this.f2004h.getViewTreeObserver().removeOnGlobalLayoutListener(this.f2001e);
                this.f2001e = null;
            }
        }
    }

    public void h() {
        String str;
        if (this.f2008l) {
            return;
        }
        if (this.f2005i == null) {
            a("广告素材为空!");
            return;
        }
        if (this.f2004h == null) {
            this.f2004h = a(this.f2002f);
        }
        this.f2000d = new c();
        this.f2001e = new d();
        this.f2004h.getViewTreeObserver().addOnGlobalLayoutListener(this.f2001e);
        this.f2004h.getViewTreeObserver().addOnScrollChangedListener(this.f2000d);
        if (TextUtils.isEmpty(this.f2005i.f2124e)) {
            str = "";
        } else {
            this.f1998b.setText(this.f2005i.f2124e);
            str = this.f2005i.f2124e;
        }
        if (!TextUtils.isEmpty(this.f2005i.f2123d)) {
            str = this.f2005i.f2123d;
        }
        this.f1997a.setText(str);
        this.f2004h.setOnClickListener(new e());
        this.f1999c.setOnClickListener(new f());
        com.aggmoread.sdk.z.a.p.a.a(this.f2005i.f2120a, null, new g());
    }
}
