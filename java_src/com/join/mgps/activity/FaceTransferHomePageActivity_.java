package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class FaceTransferHomePageActivity_ extends FaceTransferHomePageActivity implements y3.a, a4.a, a4.b {

    /* renamed from: w  reason: collision with root package name */
    private final a4.c f30275w = new a4.c();

    /* renamed from: x  reason: collision with root package name */
    private final Map<Class<?>, Object> f30276x = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FaceTransferHomePageActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FaceTransferHomePageActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FaceTransferHomePageActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FaceTransferHomePageActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends org.androidannotations.api.builder.a<e> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30281a;

        public e(Context context) {
            super(context, FaceTransferHomePageActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30281a;
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

        public e(Fragment fragment) {
            super(fragment.getActivity(), FaceTransferHomePageActivity_.class);
            this.f30281a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f30246c = resources.getString(R.string.title_face_transfer_homepage);
    }

    public static e t0(Context context) {
        return new e(context);
    }

    public static e u0(Fragment fragment) {
        return new e(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f30276x.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f30275w);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.face_transfer_homepage_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30245b = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f30248e = (TextView) aVar.internalFindViewById(R.id.nopapaTip);
        View internalFindViewById = aVar.internalFindViewById(R.id.face_transfer_rel_create_hotspot);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.face_transfer_rel_join_hotspot);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.back_image);
        TextView textView = this.f30248e;
        if (textView != null) {
            textView.setOnClickListener(new a());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new c());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new d());
        }
        n0();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f30276x.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f30275w.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f30275w.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f30275w.a(this);
    }
}
