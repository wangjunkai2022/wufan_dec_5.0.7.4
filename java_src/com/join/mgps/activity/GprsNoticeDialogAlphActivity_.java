package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.UpdateIntentDataBean;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class GprsNoticeDialogAlphActivity_ extends GprsNoticeDialogAlphActivity implements y3.a, a4.a, a4.b {

    /* renamed from: o  reason: collision with root package name */
    public static final String f33458o = "downloadTask";

    /* renamed from: p  reason: collision with root package name */
    public static final String f33459p = "showContent";

    /* renamed from: q  reason: collision with root package name */
    public static final String f33460q = "apkTable";

    /* renamed from: r  reason: collision with root package name */
    public static final String f33461r = "isUpdate";

    /* renamed from: s  reason: collision with root package name */
    public static final String f33462s = "updateIntentDataBean";

    /* renamed from: m  reason: collision with root package name */
    private final a4.c f33463m = new a4.c();

    /* renamed from: n  reason: collision with root package name */
    private final Map<Class<?>, Object> f33464n = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GprsNoticeDialogAlphActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GprsNoticeDialogAlphActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends org.androidannotations.api.builder.a<c> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33467a;

        public c(Context context) {
            super(context, GprsNoticeDialogAlphActivity_.class);
        }

        public c a(EMUApkTable eMUApkTable) {
            return (c) super.extra(GprsNoticeDialogAlphActivity_.f33460q, eMUApkTable);
        }

        public c b(DownloadTask downloadTask) {
            return (c) super.extra("downloadTask", downloadTask);
        }

        public c c(boolean z4) {
            return (c) super.extra(GprsNoticeDialogAlphActivity_.f33461r, z4);
        }

        public c d(String str) {
            return (c) super.extra(GprsNoticeDialogAlphActivity_.f33459p, str);
        }

        public c e(UpdateIntentDataBean updateIntentDataBean) {
            return (c) super.extra("updateIntentDataBean", updateIntentDataBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33467a;
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
            super(fragment.getActivity(), GprsNoticeDialogAlphActivity_.class);
            this.f33467a = fragment;
        }
    }

    public static c i0(Context context) {
        return new c(context);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("downloadTask")) {
                this.f33447b = (DownloadTask) extras.getSerializable("downloadTask");
            }
            if (extras.containsKey(f33459p)) {
                this.f33448c = extras.getString(f33459p);
            }
            if (extras.containsKey(f33460q)) {
                this.f33449d = (EMUApkTable) extras.getSerializable(f33460q);
            }
            if (extras.containsKey(f33461r)) {
                this.f33450e = extras.getBoolean(f33461r);
            }
            if (extras.containsKey("updateIntentDataBean")) {
                this.f33451f = (UpdateIntentDataBean) extras.getSerializable("updateIntentDataBean");
            }
        }
    }

    public static c j0(Fragment fragment) {
        return new c(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f33464n.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f33463m);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.fc_notice_dialog);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33452g = (Button) aVar.internalFindViewById(R.id.dialog_button_keep);
        this.f33453h = (TextView) aVar.internalFindViewById(R.id.tip_title);
        this.f33454i = (TextView) aVar.internalFindViewById(R.id.dialog_content);
        this.f33455j = (TextView) aVar.internalFindViewById(R.id.textView);
        this.f33456k = (Button) aVar.internalFindViewById(R.id.dialog_button_ok);
        Button button = (Button) aVar.internalFindViewById(R.id.dialog_button_cancle);
        this.f33457l = button;
        if (button != null) {
            button.setOnClickListener(new a());
        }
        Button button2 = this.f33456k;
        if (button2 != null) {
            button2.setOnClickListener(new b());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f33464n.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f33463m.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f33463m.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f33463m.a(this);
    }
}
