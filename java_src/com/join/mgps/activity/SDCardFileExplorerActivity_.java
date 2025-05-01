package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class SDCardFileExplorerActivity_ extends SDCardFileExplorerActivity implements y3.a, a4.a, a4.b {

    /* renamed from: g  reason: collision with root package name */
    private final a4.c f37142g = new a4.c();

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<?>, Object> f37143h = new HashMap();

    /* loaded from: classes4.dex */
    public static class a extends org.androidannotations.api.builder.a<a> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37144a;

        public a(Context context) {
            super(context, SDCardFileExplorerActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37144a;
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

        public a(Fragment fragment) {
            super(fragment.getActivity(), SDCardFileExplorerActivity_.class);
            this.f37144a = fragment;
        }
    }

    public static a i0(Context context) {
        return new a(context);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static a j0(Fragment fragment) {
        return new a(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f37143h.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f37142g);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.sdcard_lay);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37135b = (TextView) aVar.internalFindViewById(R.id.tvpath);
        this.f37136c = (ListView) aVar.internalFindViewById(R.id.lvFiles);
        this.f37137d = (Button) aVar.internalFindViewById(R.id.btnParent);
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f37143h.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f37142g.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f37142g.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f37142g.a(this);
    }
}
