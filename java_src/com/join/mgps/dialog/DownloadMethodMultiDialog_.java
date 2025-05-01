package com.join.mgps.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.DownloadGameArgsBean;
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.pref.PrefDef_;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class DownloadMethodMultiDialog_ extends DownloadMethodMultiDialog implements y3.a, a4.a, a4.b {
    public static final String H = "gameId";
    public static final String I = "ext";
    public static final String J = "isForceShow";
    public static final String K = "fromRecomDown";
    public static final String L = "downloadArgs";
    public static final String M = "disableShowSpeedUpPrompt";
    public static final String N = "data";
    public static final String O = "_from";
    public static final String P = "_from_type";
    public static final String Q = "downloadHtmls";
    public static final String R = "hideNoMore";
    private final a4.c F = new a4.c();
    private final Map<Class<?>, Object> G = new HashMap();

    /* loaded from: classes4.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DownloadMethodMultiDialog_.super.p0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodMultiDialog_.this.close();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodMultiDialog_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodMultiDialog_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodMultiDialog_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodMultiDialog_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodMultiDialog_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMethodMultiDialog_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f49108b;

        i(String str) {
            this.f49108b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadMethodMultiDialog_.super.h0(this.f49108b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QueryDownloadInfoResponseData f49110b;

        j(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
            this.f49110b = queryDownloadInfoResponseData;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadMethodMultiDialog_.super.update(this.f49110b);
        }
    }

    /* loaded from: classes4.dex */
    public static class k extends org.androidannotations.api.builder.a<k> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f49112a;

        public k(Context context) {
            super(context, DownloadMethodMultiDialog_.class);
        }

        public k a(int i4) {
            return (k) super.extra("_from", i4);
        }

        public k b(int i4) {
            return (k) super.extra("_from_type", i4);
        }

        public k c(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
            return (k) super.extra("data", queryDownloadInfoResponseData);
        }

        public k d(boolean z4) {
            return (k) super.extra("disableShowSpeedUpPrompt", z4);
        }

        public k e(DownloadGameArgsBean downloadGameArgsBean) {
            return (k) super.extra(DownloadMethodMultiDialog_.L, downloadGameArgsBean);
        }

        public k f(ArrayList<String> arrayList) {
            return (k) super.extra(DownloadMethodMultiDialog_.Q, arrayList);
        }

        public k g(String str) {
            return (k) super.extra("ext", str);
        }

        public k h(boolean z4) {
            return (k) super.extra("fromRecomDown", z4);
        }

        public k i(String str) {
            return (k) super.extra("gameId", str);
        }

        public k j(boolean z4) {
            return (k) super.extra(DownloadMethodMultiDialog_.R, z4);
        }

        public k k(boolean z4) {
            return (k) super.extra("isForceShow", z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f49112a;
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

        public k(Fragment fragment) {
            super(fragment.getActivity(), DownloadMethodMultiDialog_.class);
            this.f49112a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f49083m = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.f49084n = extras.getString("gameId");
            }
            if (extras.containsKey("ext")) {
                this.f49085o = extras.getString("ext");
            }
            if (extras.containsKey("isForceShow")) {
                this.f49086p = extras.getBoolean("isForceShow");
            }
            if (extras.containsKey("fromRecomDown")) {
                this.f49087q = extras.getBoolean("fromRecomDown");
            }
            if (extras.containsKey(L)) {
                this.f49088r = (DownloadGameArgsBean) extras.getSerializable(L);
            }
            if (extras.containsKey("disableShowSpeedUpPrompt")) {
                this.f49089s = extras.getBoolean("disableShowSpeedUpPrompt");
            }
            if (extras.containsKey("data")) {
                this.f49090t = (QueryDownloadInfoResponseData) extras.getSerializable("data");
            }
            if (extras.containsKey("_from")) {
                this.f49091u = extras.getInt("_from");
            }
            if (extras.containsKey("_from_type")) {
                this.f49092v = extras.getInt("_from_type");
            }
            if (extras.containsKey(Q)) {
                this.f49093w = extras.getStringArrayList(Q);
            }
            if (extras.containsKey(R)) {
                this.f49094x = extras.getBoolean(R);
            }
        }
    }

    public static k y0(Context context) {
        return new k(context);
    }

    public static k z0(Fragment fragment) {
        return new k(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.G.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.dialog.DownloadMethodMultiDialog
    public void h0(String str) {
        org.androidannotations.api.b.e("", new i(str), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.dialog.DownloadMethodMultiDialog, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.F);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.layout_sheet_game_resource);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f49072b = (RecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        this.f49073c = (TextView) aVar.internalFindViewById(R.id.title);
        this.f49074d = (TextView) aVar.internalFindViewById(R.id.link);
        this.f49075e = (TextView) aVar.internalFindViewById(R.id.download);
        this.f49076f = (TextView) aVar.internalFindViewById(R.id.subTitle);
        this.f49077g = (TextView) aVar.internalFindViewById(R.id.userProtocolTxt);
        this.f49078h = (TextView) aVar.internalFindViewById(R.id.protocol);
        this.f49079i = (ImageView) aVar.internalFindViewById(R.id.checkboxAgreement);
        this.f49080j = (ImageView) aVar.internalFindViewById(R.id.checkboxNoMore);
        this.f49081k = (LinearLayout) aVar.internalFindViewById(R.id.llAgreement);
        this.f49082l = (LinearLayout) aVar.internalFindViewById(R.id.llNoMore);
        this.C = aVar.internalFindViewById(R.id.constraintLayout);
        View internalFindViewById = aVar.internalFindViewById(R.id.close);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.outside);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.res);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new c());
        }
        TextView textView = this.f49075e;
        if (textView != null) {
            textView.setOnClickListener(new d());
        }
        TextView textView2 = this.f49078h;
        if (textView2 != null) {
            textView2.setOnClickListener(new e());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new f());
        }
        ImageView imageView = this.f49079i;
        if (imageView != null) {
            imageView.setOnClickListener(new g());
        }
        LinearLayout linearLayout = this.f49082l;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new h());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.dialog.DownloadMethodMultiDialog
    public void p0() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.G.put(cls, t4);
    }

    @Override // com.join.mgps.dialog.DownloadMethodMultiDialog, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.F.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.dialog.DownloadMethodMultiDialog
    public void update(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
        org.androidannotations.api.b.e("", new j(queryDownloadInfoResponseData), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.F.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.F.a(this);
    }
}
