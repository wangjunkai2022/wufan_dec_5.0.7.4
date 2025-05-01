package com.aggmoread.sdk.z.b.e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.R;
import com.aggmoread.sdk.z.a.d;
import com.aggmoread.sdk.z.a.t.h;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private h f2717a;

    /* renamed from: b  reason: collision with root package name */
    private b f2718b;

    /* renamed from: c  reason: collision with root package name */
    private Dialog f2719c;

    /* renamed from: com.aggmoread.sdk.z.b.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private class DialogC0095a extends Dialog {

        /* renamed from: a  reason: collision with root package name */
        private b f2720a;

        /* renamed from: b  reason: collision with root package name */
        private h f2721b;

        /* renamed from: c  reason: collision with root package name */
        private View f2722c;

        /* renamed from: d  reason: collision with root package name */
        private View f2723d;

        /* renamed from: e  reason: collision with root package name */
        private ViewGroup f2724e;

        /* renamed from: com.aggmoread.sdk.z.b.e.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class View$OnClickListenerC0096a implements View.OnClickListener {
            View$OnClickListenerC0096a(a aVar) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.aggmoread.sdk.z.a.d.c("AIWTAG", "c c");
                DialogC0095a.this.dismiss();
            }
        }

        /* renamed from: com.aggmoread.sdk.z.b.e.a$a$b */
        /* loaded from: classes2.dex */
        class b implements View.OnClickListener {
            b(a aVar) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.aggmoread.sdk.z.a.d.c("AIWTAG", "d c");
                DialogC0095a.this.dismiss();
                if (DialogC0095a.this.f2720a != null) {
                    DialogC0095a.this.f2720a.a();
                }
            }
        }

        /* renamed from: com.aggmoread.sdk.z.b.e.a$a$c */
        /* loaded from: classes2.dex */
        class c implements h.d {
            c(a aVar) {
            }

            @Override // com.aggmoread.sdk.z.a.t.h.d
            public void a() {
                com.aggmoread.sdk.z.a.d.c("AIWTAG", "sd cp");
                if (DialogC0095a.this.f2720a != null) {
                    DialogC0095a.this.f2720a.onRenderSuccess();
                }
            }
        }

        /* renamed from: com.aggmoread.sdk.z.b.e.a$a$d */
        /* loaded from: classes2.dex */
        class d implements DialogInterface.OnDismissListener {
            d(a aVar) {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                com.aggmoread.sdk.z.a.d.c("AIWTAG", "sd dm");
                DialogC0095a.this.f2721b.removeAllViews();
                DialogC0095a.this.f2721b.destroy();
                if (DialogC0095a.this.f2720a != null) {
                    DialogC0095a.this.f2720a.b();
                }
            }
        }

        public DialogC0095a(@NonNull Context context, String str, b bVar) {
            super(context, a.b("CustomDialog1"));
            this.f2720a = bVar;
            LinearLayout linearLayout = new LinearLayout(context);
            a(context);
            linearLayout.addView(this.f2722c, new FrameLayout.LayoutParams(-1, -2));
            setCancelable(true);
            setContentView(linearLayout);
            this.f2723d.setOnClickListener(new View$OnClickListenerC0096a(a.this));
            this.f2724e.setOnClickListener(new b(a.this));
            this.f2721b.a(new c(a.this));
            setOnDismissListener(new d(a.this));
            this.f2721b.loadUrl(j.d().replace("/api/getSdkAds", str));
        }

        private void a(Context context) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setBackgroundColor(-1);
            linearLayout.setOrientation(1);
            int a5 = com.aggmoread.sdk.z.a.m.b.a(context, 10.0d);
            linearLayout.setPadding(a5, a5, a5, a5);
            RelativeLayout relativeLayout = new RelativeLayout(context);
            TextView textView = new TextView(context);
            textView.setTextColor(-16777216);
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setTextSize(18.0f);
            textView.setText("应用信息");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            relativeLayout.addView(textView, layoutParams);
            ImageView imageView = new ImageView(context);
            com.aggmoread.sdk.z.a.m.j.a(imageView, "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAABaklEQVRYR+2VP0vEQBDF31tsBfHTWO5saWOjoOefQq5RK0v9AtpZqYVi4X9QCyutJqn8OqK1OLKSwBHPu9wtEoSkTObN/PJ2ZpZo+GHD9dECtA60Dgx1QFUfAMw457re+6c6Y6uqswBOSL6IyMIgzVCALMveAUwC+DCz+RDC46CEqjpH8h7AhJm9hRCmkgBUtUPyEgDN7JPkmohc9UuaZdmymZ2TdADMzFZCCNdJAFEcEwO4iBBF4m4I4aw3saqukzwtYwCs/gbaqxt6BGVwBQIkN733x/F7nucbZnZUxFrd4jG+NkAfJ+Kr7aLowTjFRwaIgorVvW6O9OelcCQHSlEfiNhwP/qizsj+P4BGj6A6CQB2Cpv3/rwJGx3DRhdRnudLZhZX7/cqds4teu/v6qxiAB0RuU1axSmXEYBXEZlOBdg3swWSWyLyXGe243VM8tDMbkIIu0kAdQqmxIy1iFIKVrUtQOtA68AX4HzJIQMvlE8AAAAASUVORK5CYII=");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(com.aggmoread.sdk.z.a.m.b.a(context, 20.0d), com.aggmoread.sdk.z.a.m.b.a(context, 20.0d));
            layoutParams2.addRule(15);
            layoutParams2.addRule(11);
            relativeLayout.addView(imageView, layoutParams2);
            linearLayout.addView(relativeLayout, new LinearLayout.LayoutParams(-1, com.aggmoread.sdk.z.a.m.b.a(context, 50.0d)));
            FrameLayout frameLayout = new FrameLayout(context);
            h hVar = new h(context);
            frameLayout.addView(hVar, new FrameLayout.LayoutParams(-1, -2));
            linearLayout.addView(frameLayout, new FrameLayout.LayoutParams(-1, com.aggmoread.sdk.z.a.m.b.a(context, 300.0d)));
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            com.aggmoread.sdk.z.a.m.j.a(relativeLayout2, context, 255, 11, 93, 230, 90);
            int a6 = com.aggmoread.sdk.z.a.m.b.a(context, 15.0d);
            relativeLayout2.setPadding(a6, a6, a6, a6);
            TextView textView2 = new TextView(context);
            textView2.setText("立即下载");
            textView2.setTextColor(-1);
            textView2.setTextSize(15.0f);
            textView2.setTypeface(Typeface.defaultFromStyle(1));
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            relativeLayout2.addView(textView2, layoutParams3);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = com.aggmoread.sdk.z.a.m.b.a(context, 15.0d);
            marginLayoutParams.rightMargin = com.aggmoread.sdk.z.a.m.b.a(context, 15.0d);
            marginLayoutParams.topMargin = com.aggmoread.sdk.z.a.m.b.a(context, 3.0d);
            linearLayout.addView(relativeLayout2, marginLayoutParams);
            this.f2722c = linearLayout;
            this.f2723d = imageView;
            this.f2724e = relativeLayout2;
            this.f2721b = hVar;
        }

        public void a() {
            Window window = a.this.f2719c.getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -2;
            window.setWindowAnimations(a.b("CustomAnim"));
            window.setAttributes(attributes);
        }

        @Override // android.app.Dialog
        public void show() {
            a();
            super.show();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();

        void onRenderSuccess();
    }

    public a(b bVar) {
        this.f2718b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(String str) {
        try {
            return Integer.parseInt(R.style.class.getField(str).get(null).toString());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public void a() {
        d.c("AIWTAG", "RLY");
        h hVar = this.f2717a;
        if (hVar != null) {
            hVar.removeAllViews();
            this.f2717a.destroy();
            this.f2717a = null;
        }
    }

    public void a(Context context, View view) {
        d.c("AIWTAG", "s d");
        try {
            if (this.f2719c == null) {
                return;
            }
            d.c("AIWTAG", "sd s");
            this.f2719c.show();
        } catch (Exception e5) {
            d.a("AIWTAG", "s e %s ", e5);
            b bVar = this.f2718b;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    public void a(Context context, String str) {
        d.a("AIWTAG", "SAD CT= %s", context);
        if (TextUtils.isEmpty(j.d())) {
            d.c("AIWTAG", "SAD R");
            return;
        }
        try {
            if (context instanceof Activity) {
                d.c("AIWTAG", "SAD C");
                this.f2719c = new DialogC0095a(context, str, this.f2718b);
            }
        } catch (Exception e5) {
            d.a("AIWTAG", "R E %s", e5);
            a();
        }
    }
}
