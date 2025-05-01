package com.join.mgps.dialog;

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
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class DownloadMethodPromptDialog_ extends DownloadMethodPromptDialog implements y3.a, a4.a, a4.b {
    public static final String A = "gameId";
    public static final String B = "ext";
    public static final String C = "isForceShow";
    public static final String D = "fromRecomDown";
    public static final String E = "disableShowSpeedUpPrompt";
    public static final String F = "data";
    public static final String G = "_from";
    public static final String H = "_from_type";

    /* renamed from: y  reason: collision with root package name */
    private final a4.c f49138y = new a4.c();

    /* renamed from: z  reason: collision with root package name */
    private final Map<Class<?>, Object> f49139z = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QueryDownloadInfoResponseData f49140b;

        a(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
            this.f49140b = queryDownloadInfoResponseData;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadMethodPromptDialog_.super.update(this.f49140b);
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DownloadMethodPromptDialog_.super.k0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodPromptDialog_.this.close();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodPromptDialog_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodPromptDialog_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodPromptDialog_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodPromptDialog_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodPromptDialog_.this.protocolCheckPlaceholder();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodPromptDialog_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodPromptDialog_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f49151b;

        k(String str) {
            this.f49151b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadMethodPromptDialog_.super.g0(this.f49151b);
        }
    }

    /* loaded from: classes4.dex */
    public static class l extends org.androidannotations.api.builder.a<l> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f49153a;

        public l(Context context) {
            super(context, DownloadMethodPromptDialog_.class);
        }

        public l a(int i4) {
            return (l) super.extra("_from", i4);
        }

        public l b(int i4) {
            return (l) super.extra("_from_type", i4);
        }

        public l c(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
            return (l) super.extra("data", queryDownloadInfoResponseData);
        }

        public l d(boolean z4) {
            return (l) super.extra("disableShowSpeedUpPrompt", z4);
        }

        public l e(String str) {
            return (l) super.extra("ext", str);
        }

        public l f(boolean z4) {
            return (l) super.extra("fromRecomDown", z4);
        }

        public l g(String str) {
            return (l) super.extra("gameId", str);
        }

        public l h(boolean z4) {
            return (l) super.extra("isForceShow", z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f49153a;
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

        public l(Fragment fragment) {
            super(fragment.getActivity(), DownloadMethodPromptDialog_.class);
            this.f49153a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f49123l = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.f49124m = extras.getString("gameId");
            }
            if (extras.containsKey("ext")) {
                this.f49125n = extras.getString("ext");
            }
            if (extras.containsKey("isForceShow")) {
                this.f49126o = extras.getBoolean("isForceShow");
            }
            if (extras.containsKey("fromRecomDown")) {
                this.f49127p = extras.getBoolean("fromRecomDown");
            }
            if (extras.containsKey("disableShowSpeedUpPrompt")) {
                this.f49128q = extras.getBoolean("disableShowSpeedUpPrompt");
            }
            if (extras.containsKey("data")) {
                this.f49129r = (QueryDownloadInfoResponseData) extras.getSerializable("data");
            }
            if (extras.containsKey("_from")) {
                this.f49130s = extras.getInt("_from");
            }
            if (extras.containsKey("_from_type")) {
                this.f49131t = extras.getInt("_from_type");
            }
        }
    }

    public static l u0(Context context) {
        return new l(context);
    }

    public static l v0(Fragment fragment) {
        return new l(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.dialog.DownloadMethodPromptDialog
    public void g0(String str) {
        org.androidannotations.api.b.e("", new k(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f49139z.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.dialog.DownloadMethodPromptDialog
    public void k0() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    @Override // com.join.mgps.dialog.DownloadMethodPromptDialog, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f49138y);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.dialog_download_method_prompt);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f49113b = aVar.internalFindViewById(R.id.protocolCheck);
        this.f49114c = aVar.internalFindViewById(R.id.noPromptCheck);
        this.f49115d = aVar.internalFindViewById(R.id.noPrompt);
        this.f49116e = (TextView) aVar.internalFindViewById(R.id.title);
        this.f49117f = (TextView) aVar.internalFindViewById(R.id.name);
        this.f49118g = (TextView) aVar.internalFindViewById(R.id.link);
        this.f49119h = (TextView) aVar.internalFindViewById(R.id.download);
        this.f49120i = (TextView) aVar.internalFindViewById(R.id.subTitle);
        this.f49121j = (TextView) aVar.internalFindViewById(R.id.userProtocolTxt);
        this.f49122k = (TextView) aVar.internalFindViewById(R.id.protocol);
        this.f49133v = aVar.internalFindViewById(R.id.constraintLayout);
        View internalFindViewById = aVar.internalFindViewById(R.id.close);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.outside);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.res);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.protocolCheckPlaceholder);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.textView77);
        View internalFindViewById6 = aVar.internalFindViewById(R.id.noPromptCheckPlaceholder);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new d());
        }
        TextView textView = this.f49119h;
        if (textView != null) {
            textView.setOnClickListener(new e());
        }
        TextView textView2 = this.f49122k;
        if (textView2 != null) {
            textView2.setOnClickListener(new f());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new g());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new h());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new i());
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new j());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f49139z.put(cls, t4);
    }

    @Override // com.join.mgps.dialog.DownloadMethodPromptDialog, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f49138y.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.dialog.DownloadMethodPromptDialog
    public void update(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
        org.androidannotations.api.b.e("", new a(queryDownloadInfoResponseData), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f49138y.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f49138y.a(this);
    }
}
