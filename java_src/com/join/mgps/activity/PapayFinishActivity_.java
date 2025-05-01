package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.PapayResult;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class PapayFinishActivity_ extends PapayFinishActivity implements y3.a, a4.a, a4.b {

    /* renamed from: n  reason: collision with root package name */
    public static final String f36826n = "papayResult";

    /* renamed from: o  reason: collision with root package name */
    public static final String f36827o = "vipRechargeSuccess";

    /* renamed from: l  reason: collision with root package name */
    private final a4.c f36828l = new a4.c();

    /* renamed from: m  reason: collision with root package name */
    private final Map<Class<?>, Object> f36829m = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapayFinishActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapayFinishActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends org.androidannotations.api.builder.a<c> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36832a;

        public c(Context context) {
            super(context, PapayFinishActivity_.class);
        }

        public c a(PapayResult papayResult) {
            return (c) super.extra("papayResult", papayResult);
        }

        public c b(boolean z4) {
            return (c) super.extra(PapayFinishActivity_.f36827o, z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36832a;
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

        public c(Fragment fragment) {
            super(fragment.getActivity(), PapayFinishActivity_.class);
            this.f36832a = fragment;
        }
    }

    public static c h0(Context context) {
        return new c(context);
    }

    public static c i0(Fragment fragment) {
        return new c(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("papayResult")) {
                this.f36824j = (PapayResult) extras.getSerializable("papayResult");
            }
            if (extras.containsKey(f36827o)) {
                this.f36825k = extras.getBoolean(f36827o);
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36829m.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36828l);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_papay_finish);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36816b = (TextView) aVar.internalFindViewById(R.id.userName);
        this.f36817c = (TextView) aVar.internalFindViewById(R.id.pabiNumber);
        this.f36818d = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f36819e = (TextView) aVar.internalFindViewById(R.id.vipRecharge);
        this.f36820f = (ImageView) aVar.internalFindViewById(R.id.imageSuccessOrFailed);
        this.f36821g = (Button) aVar.internalFindViewById(R.id.backButn);
        this.f36822h = (TextView) aVar.internalFindViewById(R.id.orderid);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        Button button = this.f36821g;
        if (button != null) {
            button.setOnClickListener(new a());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36829m.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36828l.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36828l.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36828l.a(this);
    }
}
