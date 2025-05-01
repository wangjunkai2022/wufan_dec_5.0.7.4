package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LoadingImageView;
import com.join.mgps.customview.MarqueeTextView;
import com.join.mgps.customview.NoScrollListView;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.customview.XListView2;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ForumSearchHintActivity_ extends ForumSearchHintActivity implements y3.a, a4.a, a4.b {
    public static final String G1 = "keyword";
    public static final String H1 = "fid";
    private final a4.c E1 = new a4.c();
    private final Map<Class<?>, Object> F1 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.B0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.Q0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.J0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.O0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.r0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.R0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31284b;

        g(String str) {
            this.f31284b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.showToast(this.f31284b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.notifyUi();
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumSearchHintActivity_.super.x0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {
        j(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumSearchHintActivity_.super.m0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumSearchHintActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {
        l(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumSearchHintActivity_.super.z0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {
        m(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumSearchHintActivity_.super.y0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31292b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, String str3, int i4) {
            super(str, j4, str2);
            this.f31292b = str3;
            this.f31293c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumSearchHintActivity_.super.A0(this.f31292b, this.f31293c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumSearchHintActivity_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumSearchHintActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumSearchHintActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements AdapterView.OnItemClickListener {
        r() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            ForumSearchHintActivity_.this.s0(i4);
        }
    }

    /* loaded from: classes4.dex */
    class s implements TextView.OnEditorActionListener {
        s() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
            return ForumSearchHintActivity_.this.F0(textView, i4, keyEvent);
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.U0();
        }
    }

    /* loaded from: classes4.dex */
    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumSearchHintActivity_.super.serverConnectionException();
        }
    }

    /* loaded from: classes4.dex */
    public static class w extends org.androidannotations.api.builder.a<w> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31303a;

        public w(Context context) {
            super(context, ForumSearchHintActivity_.class);
        }

        public w a(int i4) {
            return (w) super.extra("fid", i4);
        }

        public w b(String str) {
            return (w) super.extra("keyword", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31303a;
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

        public w(Fragment fragment) {
            super(fragment.getActivity(), ForumSearchHintActivity_.class);
            this.f31303a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.R = resources.getString(R.string.net_excption);
        this.S = resources.getString(R.string.connect_server_excption);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("keyword")) {
                this.P = extras.getString("keyword");
            }
            if (extras.containsKey("fid")) {
                this.T = extras.getInt("fid");
            }
        }
    }

    public static w l1(Context context) {
        return new w(context);
    }

    public static w m1(Fragment fragment) {
        return new w(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void A0(String str, int i4) {
        org.androidannotations.api.a.l(new n("", 0L, "", str, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void B0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void J0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void O0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void Q0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void R0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void U0() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.F1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void m0() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void notifyUi() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.E1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.forum_search_hint_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31235c = (EditText) aVar.internalFindViewById(R.id.searchEditText);
        this.f31236d = (ImageView) aVar.internalFindViewById(R.id.img_search);
        this.f31237e = (ImageView) aVar.internalFindViewById(R.id.img_iconback);
        this.f31238f = (LinearLayout) aVar.internalFindViewById(R.id.clearLayout);
        this.f31239g = (LinearLayout) aVar.internalFindViewById(R.id.search_list_layout);
        this.f31240h = (GridView) aVar.internalFindViewById(R.id.gridView);
        this.f31241i = (LinearLayout) aVar.internalFindViewById(R.id.allSearch);
        this.f31242j = (RelativeLayout) aVar.internalFindViewById(R.id.layout1);
        this.f31243k = (RelativeLayout) aVar.internalFindViewById(R.id.layout2);
        this.f31244l = (RelativeLayout) aVar.internalFindViewById(R.id.layout3);
        this.f31245m = (RelativeLayout) aVar.internalFindViewById(R.id.layout4);
        this.f31246n = (RelativeLayout) aVar.internalFindViewById(R.id.layout5);
        this.f31247o = (RelativeLayout) aVar.internalFindViewById(R.id.layout6);
        this.f31248p = (TextView) aVar.internalFindViewById(R.id.tv1);
        this.f31251q = (TextView) aVar.internalFindViewById(R.id.tv2);
        this.f31252r = (TextView) aVar.internalFindViewById(R.id.tv3);
        this.f31253s = (TextView) aVar.internalFindViewById(R.id.tv4);
        this.f31254t = (TextView) aVar.internalFindViewById(R.id.tv5);
        this.f31255u = (TextView) aVar.internalFindViewById(R.id.tv6);
        this.f31256v = (MarqueeTextView) aVar.internalFindViewById(R.id.text1);
        this.f31258w = (MarqueeTextView) aVar.internalFindViewById(R.id.text2);
        this.f31259x = (MarqueeTextView) aVar.internalFindViewById(R.id.text3);
        this.f31260y = (MarqueeTextView) aVar.internalFindViewById(R.id.text4);
        this.f31261z = (MarqueeTextView) aVar.internalFindViewById(R.id.text5);
        this.A = (MarqueeTextView) aVar.internalFindViewById(R.id.text6);
        this.B = (NoScrollListView) aVar.internalFindViewById(R.id.historyListView);
        this.C = (XListView2) aVar.internalFindViewById(R.id.autoListView);
        this.D = (TextView) aVar.internalFindViewById(R.id.noHistory);
        this.E = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.F = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.G = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.H = (LoadingImageView) aVar.internalFindViewById(R.id.loading_view);
        this.I = (TextView) aVar.internalFindViewById(R.id.textView2);
        this.J = (Button) aVar.internalFindViewById(R.id.setNetwork);
        this.K = (TextView) aVar.internalFindViewById(R.id.failedMessage);
        this.L = (TextView) aVar.internalFindViewById(R.id.setting);
        this.M = (ImageView) aVar.internalFindViewById(R.id.lodingBackImage);
        this.N = (WrapContentGridView) aVar.internalFindViewById(R.id.wrapGridView);
        View internalFindViewById = aVar.internalFindViewById(R.id.change_data);
        ImageView imageView = this.f31236d;
        if (imageView != null) {
            imageView.setOnClickListener(new k());
        }
        ImageView imageView2 = this.f31237e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new o());
        }
        LinearLayout linearLayout = this.f31238f;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new p());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new q());
        }
        NoScrollListView noScrollListView = this.B;
        if (noScrollListView != null) {
            noScrollListView.setOnItemClickListener(new r());
        }
        EditText editText = this.f31235c;
        if (editText != null) {
            editText.setOnEditorActionListener(new s());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.F1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void q0() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void r0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void serverConnectionException() {
        org.androidannotations.api.b.e("", new v(), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.E1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void x0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void y0() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumSearchHintActivity
    public void z0() {
        org.androidannotations.api.a.l(new l("", 0L, ""));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.E1.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.E1.a(this);
    }
}
