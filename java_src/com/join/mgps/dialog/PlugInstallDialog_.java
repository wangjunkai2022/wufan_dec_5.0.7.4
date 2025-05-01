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
import com.join.mgps.db.tables.EMUApkTable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class PlugInstallDialog_ extends PlugInstallDialog implements y3.a, a4.a, a4.b {

    /* renamed from: n  reason: collision with root package name */
    public static final String f49202n = "table";

    /* renamed from: o  reason: collision with root package name */
    public static final String f49203o = "downloadTask";

    /* renamed from: p  reason: collision with root package name */
    public static final String f49204p = "status";

    /* renamed from: l  reason: collision with root package name */
    private final a4.c f49205l = new a4.c();

    /* renamed from: m  reason: collision with root package name */
    private final Map<Class<?>, Object> f49206m = new HashMap();

    /* loaded from: classes4.dex */
    public static class a extends org.androidannotations.api.builder.a<a> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f49207a;

        public a(Context context) {
            super(context, PlugInstallDialog_.class);
        }

        public a a(DownloadTask downloadTask) {
            return (a) super.extra("downloadTask", downloadTask);
        }

        public a b(int i4) {
            return (a) super.extra("status", i4);
        }

        public a c(EMUApkTable eMUApkTable) {
            return (a) super.extra("table", eMUApkTable);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f49207a;
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
            super(fragment.getActivity(), PlugInstallDialog_.class);
            this.f49207a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        injectExtras_();
        a4.c.b(this);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("table")) {
                this.f49198h = (EMUApkTable) extras.getSerializable("table");
            }
            if (extras.containsKey("downloadTask")) {
                this.f49199i = (DownloadTask) extras.getSerializable("downloadTask");
            }
            if (extras.containsKey("status")) {
                this.f49200j = extras.getInt("status");
            }
        }
    }

    public static a k0(Context context) {
        return new a(context);
    }

    public static a l0(Fragment fragment) {
        return new a(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f49206m.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.dialog.PlugInstallDialog, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f49205l);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f49206m.put(cls, t4);
    }

    @Override // com.join.mgps.dialog.PlugInstallDialog, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f49205l.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f49205l.a(this);
    }

    @Override // com.join.mgps.dialog.PlugInstallDialog, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f49205l.a(this);
    }
}
