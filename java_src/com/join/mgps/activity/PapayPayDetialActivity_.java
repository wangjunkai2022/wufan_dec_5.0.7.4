package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.PapayHistoryInfo;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class PapayPayDetialActivity_ extends PapayPayDetialActivity implements y3.a, a4.a, a4.b {

    /* renamed from: l  reason: collision with root package name */
    public static final String f36841l = "info";

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f36842j = new a4.c();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Object> f36843k = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapayPayDetialActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends org.androidannotations.api.builder.a<b> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36845a;

        public b(Context context) {
            super(context, PapayPayDetialActivity_.class);
        }

        public b a(PapayHistoryInfo papayHistoryInfo) {
            return (b) super.extra(PapayPayDetialActivity_.f36841l, papayHistoryInfo);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36845a;
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

        public b(Fragment fragment) {
            super(fragment.getActivity(), PapayPayDetialActivity_.class);
            this.f36845a = fragment;
        }
    }

    public static b g0(Context context) {
        return new b(context);
    }

    public static b h0(Fragment fragment) {
        return new b(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(f36841l)) {
            return;
        }
        this.f36840i = (PapayHistoryInfo) extras.getSerializable(f36841l);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36843k.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36842j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_papay_detial);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36833b = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f36834c = (TextView) aVar.internalFindViewById(R.id.payOderId);
        this.f36835d = (TextView) aVar.internalFindViewById(R.id.orderType);
        this.f36836e = (TextView) aVar.internalFindViewById(R.id.payTime);
        this.f36837f = (TextView) aVar.internalFindViewById(R.id.payType);
        this.f36838g = (TextView) aVar.internalFindViewById(R.id.orderName);
        this.f36839h = (TextView) aVar.internalFindViewById(R.id.money);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36843k.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36842j.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36842j.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36842j.a(this);
    }
}
