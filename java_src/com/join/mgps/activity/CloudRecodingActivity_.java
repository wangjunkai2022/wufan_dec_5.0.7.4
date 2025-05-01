package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CloudBackupsCanUseBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CloudRecodingActivity_ extends CloudRecodingActivity implements y3.a, a4.a, a4.b {

    /* renamed from: v  reason: collision with root package name */
    public static final String f28976v = "isrecoder";

    /* renamed from: w  reason: collision with root package name */
    public static final String f28977w = "bean";

    /* renamed from: t  reason: collision with root package name */
    private final a4.c f28978t = new a4.c();

    /* renamed from: u  reason: collision with root package name */
    private final Map<Class<?>, Object> f28979u = new HashMap();

    /* loaded from: classes4.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudRecodingActivity_.super.h0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends org.androidannotations.api.builder.a<b> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28981a;

        public b(Context context) {
            super(context, CloudRecodingActivity_.class);
        }

        public b a(CloudBackupsCanUseBean cloudBackupsCanUseBean) {
            return (b) super.extra("bean", cloudBackupsCanUseBean);
        }

        public b b(boolean z4) {
            return (b) super.extra(CloudRecodingActivity_.f28976v, z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28981a;
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
            super(fragment.getActivity(), CloudRecodingActivity_.class);
            this.f28981a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(f28976v)) {
                this.f28958b = extras.getBoolean(f28976v);
            }
            if (extras.containsKey("bean")) {
                this.f28975s = (CloudBackupsCanUseBean) extras.getSerializable("bean");
            }
        }
    }

    public static b j0(Context context) {
        return new b(context);
    }

    public static b k0(Fragment fragment) {
        return new b(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f28979u.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CloudRecodingActivity
    public void h0() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f28978t);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.cloud_recoding_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28959c = (TextView) aVar.internalFindViewById(R.id.recoverinfo);
        this.f28960d = (LinearLayout) aVar.internalFindViewById(R.id.gameHistory);
        this.f28961e = (LinearLayout) aVar.internalFindViewById(R.id.gameList);
        this.f28962f = (LinearLayout) aVar.internalFindViewById(R.id.gamekey);
        this.f28963g = (TextView) aVar.internalFindViewById(R.id.gameHistoryinfo);
        this.f28964h = (TextView) aVar.internalFindViewById(R.id.gameListInfo);
        this.f28965i = (TextView) aVar.internalFindViewById(R.id.gamekeyinfo);
        this.f28966j = (ImageView) aVar.internalFindViewById(R.id.gameHistoryFinishImage);
        this.f28967k = (ImageView) aVar.internalFindViewById(R.id.gameListFinish);
        this.f28968l = (ImageView) aVar.internalFindViewById(R.id.gamekeyFinish);
        this.f28969m = (ProgressBar) aVar.internalFindViewById(R.id.gameHistoryLoding);
        this.f28970n = (ProgressBar) aVar.internalFindViewById(R.id.gameListloding);
        this.f28971o = (ProgressBar) aVar.internalFindViewById(R.id.gamekeyLoding);
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f28979u.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f28978t.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f28978t.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f28978t.a(this);
    }
}
