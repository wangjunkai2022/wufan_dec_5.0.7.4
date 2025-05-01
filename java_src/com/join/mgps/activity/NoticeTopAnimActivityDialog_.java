package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class NoticeTopAnimActivityDialog_ extends NoticeTopAnimActivityDialog implements y3.a, a4.a, a4.b {

    /* renamed from: n  reason: collision with root package name */
    public static final String f36147n = "message";

    /* renamed from: o  reason: collision with root package name */
    public static final String f36148o = "state";

    /* renamed from: p  reason: collision with root package name */
    public static final String f36149p = "coinNumber";

    /* renamed from: l  reason: collision with root package name */
    private final a4.c f36150l = new a4.c();

    /* renamed from: m  reason: collision with root package name */
    private final Map<Class<?>, Object> f36151m = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NoticeTopAnimActivityDialog_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NoticeTopAnimActivityDialog_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NoticeTopAnimActivityDialog_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeTopAnimActivityDialog_.super.i0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36156b;

        e(int i4) {
            this.f36156b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeTopAnimActivityDialog_.super.g0(this.f36156b);
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.a<f> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36158a;

        public f(Context context) {
            super(context, NoticeTopAnimActivityDialog_.class);
        }

        public f a(int i4) {
            return (f) super.extra(NoticeTopAnimActivityDialog_.f36149p, i4);
        }

        public f b(String str) {
            return (f) super.extra("message", str);
        }

        public f c(int i4) {
            return (f) super.extra(NoticeTopAnimActivityDialog_.f36148o, i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36158a;
            if (fragment != null) {
                fragment.startActivityForResult(this.intent, i4);
            } else {
                Context context = this.context;
                if (context instanceof Activity) {
                    ActivityCompat.startActivityForResult((Activity) context, this.intent, i4, this.lastOptions);
                } else {
                    context.startActivity(this.intent);
                }
            }
            return new org.androidannotations.api.builder.f(this.context);
        }

        public f(Fragment fragment) {
            super(fragment.getActivity(), NoticeTopAnimActivityDialog_.class);
            this.f36158a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("message")) {
                this.f36144i = extras.getString("message");
            }
            if (extras.containsKey(f36148o)) {
                this.f36145j = extras.getInt(f36148o);
            }
            if (extras.containsKey(f36149p)) {
                this.f36146k = extras.getInt(f36149p);
            }
        }
    }

    public static f n0(Context context) {
        return new f(context);
    }

    public static f o0(Fragment fragment) {
        return new f(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NoticeTopAnimActivityDialog
    public void g0(int i4) {
        org.androidannotations.api.b.e("", new e(i4), 2000L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36151m.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NoticeTopAnimActivityDialog
    public void i0() {
        org.androidannotations.api.b.e("", new d(), 500L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.activity.NoticeTopAnimActivityDialog, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36150l);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.nontice_top_anim_dialog_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36137b = (RelativeLayout) aVar.internalFindViewById(R.id.dialogLayout);
        this.f36138c = (TextView) aVar.internalFindViewById(R.id.nonticeText);
        this.f36139d = (TextView) aVar.internalFindViewById(R.id.tv_position);
        this.f36140e = (TextView) aVar.internalFindViewById(R.id.sub_content);
        this.f36141f = (TextView) aVar.internalFindViewById(R.id.dialog_content);
        this.f36142g = (LinearLayout) aVar.internalFindViewById(R.id.iv_close);
        this.f36143h = (Button) aVar.internalFindViewById(R.id.dialog_button_ok);
        LinearLayout linearLayout = this.f36142g;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new a());
        }
        TextView textView = this.f36138c;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        Button button = this.f36143h;
        if (button != null) {
            button.setOnClickListener(new c());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36151m.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36150l.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36150l.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36150l.a(this);
    }
}
