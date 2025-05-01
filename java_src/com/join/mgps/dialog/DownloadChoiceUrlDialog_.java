package com.join.mgps.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.DownloadUrlBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class DownloadChoiceUrlDialog_ extends DownloadChoiceUrlDialog implements y3.a, a4.a, a4.b {

    /* renamed from: h  reason: collision with root package name */
    public static final String f49056h = "downloadUrlBeans";

    /* renamed from: i  reason: collision with root package name */
    public static final String f49057i = "downloadTask";

    /* renamed from: j  reason: collision with root package name */
    public static final String f49058j = "isLocalShow";

    /* renamed from: f  reason: collision with root package name */
    private final a4.c f49059f = new a4.c();

    /* renamed from: g  reason: collision with root package name */
    private final Map<Class<?>, Object> f49060g = new HashMap();

    /* loaded from: classes4.dex */
    public static class a extends org.androidannotations.api.builder.a<a> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f49061a;

        public a(Context context) {
            super(context, DownloadChoiceUrlDialog_.class);
        }

        public a a(DownloadTask downloadTask) {
            return (a) super.extra("downloadTask", downloadTask);
        }

        public a b(ArrayList<DownloadUrlBean> arrayList) {
            return (a) super.extra(DownloadChoiceUrlDialog_.f49056h, arrayList);
        }

        public a c(boolean z4) {
            return (a) super.extra(DownloadChoiceUrlDialog_.f49058j, z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f49061a;
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
            super(fragment.getActivity(), DownloadChoiceUrlDialog_.class);
            this.f49061a = fragment;
        }
    }

    public static a h0(Context context) {
        return new a(context);
    }

    public static a i0(Fragment fragment) {
        return new a(fragment);
    }

    private void init_(Bundle bundle) {
        injectExtras_();
        a4.c.b(this);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(f49056h)) {
                this.f49049c = (ArrayList) extras.getSerializable(f49056h);
            }
            if (extras.containsKey("downloadTask")) {
                this.f49050d = (DownloadTask) extras.getSerializable("downloadTask");
            }
            if (extras.containsKey(f49058j)) {
                this.f49051e = extras.getBoolean(f49058j);
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f49060g.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f49059f);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.download_choice_url_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f49060g.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f49059f.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f49059f.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f49059f.a(this);
    }
}
