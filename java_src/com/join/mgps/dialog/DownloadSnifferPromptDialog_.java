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
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class DownloadSnifferPromptDialog_ extends DownloadSnifferPromptDialog implements y3.a, a4.a, a4.b {

    /* renamed from: o  reason: collision with root package name */
    public static final String f49167o = "downloadTask";

    /* renamed from: p  reason: collision with root package name */
    public static final String f49168p = "downloadSourceUrl";

    /* renamed from: q  reason: collision with root package name */
    public static final String f49169q = "downloadSearchUrl";

    /* renamed from: r  reason: collision with root package name */
    public static final String f49170r = "download_original_switch";

    /* renamed from: m  reason: collision with root package name */
    private final a4.c f49171m = new a4.c();

    /* renamed from: n  reason: collision with root package name */
    private final Map<Class<?>, Object> f49172n = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSnifferPromptDialog_.this.close();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSnifferPromptDialog_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSnifferPromptDialog_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSnifferPromptDialog_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSnifferPromptDialog_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.a<f> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f49178a;

        public f(Context context) {
            super(context, DownloadSnifferPromptDialog_.class);
        }

        public f a(String str) {
            return (f) super.extra(DownloadSnifferPromptDialog_.f49169q, str);
        }

        public f b(String str) {
            return (f) super.extra(DownloadSnifferPromptDialog_.f49168p, str);
        }

        public f c(DownloadTask downloadTask) {
            return (f) super.extra("downloadTask", downloadTask);
        }

        public f d(String str) {
            return (f) super.extra(DownloadSnifferPromptDialog_.f49170r, str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f49178a;
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
            super(fragment.getActivity(), DownloadSnifferPromptDialog_.class);
            this.f49178a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("downloadTask")) {
                this.f49154b = (DownloadTask) extras.getSerializable("downloadTask");
            }
            if (extras.containsKey(f49168p)) {
                this.f49155c = extras.getString(f49168p);
            }
            if (extras.containsKey(f49169q)) {
                this.f49156d = extras.getString(f49169q);
            }
            if (extras.containsKey(f49170r)) {
                this.f49157e = extras.getString(f49170r);
            }
        }
    }

    public static f q0(Context context) {
        return new f(context);
    }

    public static f r0(Fragment fragment) {
        return new f(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f49172n.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.dialog.DownloadSnifferPromptDialog, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f49171m);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.dialog_sniffer_promt);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f49162j = aVar.internalFindViewById(R.id.constraintLayout);
        View internalFindViewById = aVar.internalFindViewById(R.id.close);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.outside);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.btnDownload);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.btnSource);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.btnSearch);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new c());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new d());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new e());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f49172n.put(cls, t4);
    }

    @Override // com.join.mgps.dialog.DownloadSnifferPromptDialog, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f49171m.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f49171m.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f49171m.a(this);
    }
}
