package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.common.view.ClearEditText;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommentCreateBean;
import com.join.mgps.dto.CommentDetailBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CommentDetailActivity_ extends CommentDetailActivity implements y3.a, a4.a, a4.b {
    public static final String T1 = "commentId";
    public static final String U1 = "gameId";
    public static final String V1 = "commentScoreSwitch";
    public static final String W1 = "packageName";
    public static final String X1 = "bespeakSwitch";
    public static final String Y1 = "sgcSwitch";
    public static final String Z1 = "gameType";

    /* renamed from: a2  reason: collision with root package name */
    public static final String f29486a2 = "gameIsStart";
    private final a4.c R1 = new a4.c();
    private final Map<Class<?>, Object> S1 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f29487b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29488c;

        a(List list, int i4) {
            this.f29487b = list;
            this.f29488c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.j1(this.f29487b, this.f29488c);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.p1();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29492b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommentCreateBean.InfoBean f29493c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f29494d;

        d(String str, CommentCreateBean.InfoBean infoBean, boolean z4) {
            this.f29492b = str;
            this.f29493c = infoBean;
            this.f29494d = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.d1(this.f29492b, this.f29493c, this.f29494d);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29496b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f29497c;

        e(String str, boolean z4) {
            this.f29496b = str;
            this.f29497c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.b1(this.f29496b, this.f29497c);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29499b;

        f(int i4) {
            this.f29499b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.K0(this.f29499b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29501b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f29502c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29503d;

        g(String str, boolean z4, int i4) {
            this.f29501b = str;
            this.f29502c = z4;
            this.f29503d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.Z0(this.f29501b, this.f29502c, this.f29503d);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29505b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f29506c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29507d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f29508e;

        h(String str, boolean z4, int i4, int i5) {
            this.f29505b = str;
            this.f29506c = z4;
            this.f29507d = i4;
            this.f29508e = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.c1(this.f29505b, this.f29506c, this.f29507d, this.f29508e);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentResponse f29510b;

        i(CommentResponse commentResponse) {
            this.f29510b = commentResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.a1(this.f29510b);
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29512b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f29512b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentDetailActivity_.super.O0(this.f29512b);
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
            CommentDetailActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29515b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f29516c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f29517d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f29518e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f29519f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f29520g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f29521h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i4) {
            super(str, j4, str2);
            this.f29515b = str3;
            this.f29516c = str4;
            this.f29517d = str5;
            this.f29518e = str6;
            this.f29519f = str7;
            this.f29520g = str8;
            this.f29521h = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentDetailActivity_.super.m1(this.f29515b, this.f29516c, this.f29517d, this.f29518e, this.f29519f, this.f29520g, this.f29521h);
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
                CommentDetailActivity_.super.L0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f29524b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, CommentDetailBean.MainCommentBean mainCommentBean, int i4) {
            super(str, j4, str2);
            this.f29524b = mainCommentBean;
            this.f29525c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentDetailActivity_.super.V0(this.f29524b, this.f29525c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f29527b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29528c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, CommentDetailBean.MainCommentBean mainCommentBean, int i4) {
            super(str, j4, str2);
            this.f29527b = mainCommentBean;
            this.f29528c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentDetailActivity_.super.n1(this.f29527b, this.f29528c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f29530b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29531c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29532d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, CommentDetailBean.MainCommentBean mainCommentBean, int i4, int i5) {
            super(str, j4, str2);
            this.f29530b = mainCommentBean;
            this.f29531c = i4;
            this.f29532d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentDetailActivity_.super.X(this.f29530b, this.f29531c, this.f29532d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q extends a.c {
        q(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentDetailActivity_.super.S0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentDetailActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentDetailActivity_.this.T0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.i1();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.M0();
        }
    }

    /* loaded from: classes4.dex */
    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.g1();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f29540b;

        w(CommentDetailBean.MainCommentBean mainCommentBean) {
            this.f29540b = mainCommentBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.e1(this.f29540b);
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.GameInfoBean f29542b;

        x(CommentDetailBean.GameInfoBean gameInfoBean) {
            this.f29542b = gameInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.f1(this.f29542b);
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentDetailActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    public static class z extends org.androidannotations.api.builder.a<z> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29545a;

        public z(Context context) {
            super(context, CommentDetailActivity_.class);
        }

        public z a(int i4) {
            return (z) super.extra("bespeakSwitch", i4);
        }

        public z b(String str) {
            return (z) super.extra("commentId", str);
        }

        public z c(String str) {
            return (z) super.extra("commentScoreSwitch", str);
        }

        public z d(String str) {
            return (z) super.extra("gameId", str);
        }

        public z e(int i4) {
            return (z) super.extra("gameIsStart", i4);
        }

        public z f(String str) {
            return (z) super.extra("gameType", str);
        }

        public z g(String str) {
            return (z) super.extra("packageName", str);
        }

        public z h(int i4) {
            return (z) super.extra("sgcSwitch", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29545a;
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

        public z(Fragment fragment) {
            super(fragment.getActivity(), CommentDetailActivity_.class);
            this.f29545a = fragment;
        }
    }

    public static z M1(Context context) {
        return new z(context);
    }

    public static z N1(Fragment fragment) {
        return new z(fragment);
    }

    private void init_(Bundle bundle) {
        this.f29448y = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
        supportRequestWindowFeature(10);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("commentId")) {
                this.f29436p = extras.getString("commentId");
            }
            if (extras.containsKey("gameId")) {
                this.f29439q = extras.getString("gameId");
            }
            if (extras.containsKey("commentScoreSwitch")) {
                this.f29440r = extras.getString("commentScoreSwitch");
            }
            if (extras.containsKey("packageName")) {
                this.f29441s = extras.getString("packageName");
            }
            if (extras.containsKey("bespeakSwitch")) {
                this.f29442t = extras.getInt("bespeakSwitch");
            }
            if (extras.containsKey("sgcSwitch")) {
                this.f29443u = extras.getInt("sgcSwitch");
            }
            if (extras.containsKey("gameType")) {
                this.f29444v = extras.getString("gameType");
            }
            if (extras.containsKey("gameIsStart")) {
                this.f29446w = extras.getInt("gameIsStart");
            }
        }
    }

    @Override // com.join.mgps.activity.CommentDetailActivity
    public void K0(int i4) {
        org.androidannotations.api.b.e("", new f(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void L0() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void M0() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void O0(String str) {
        org.androidannotations.api.a.l(new j("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void S0() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void V0(CommentDetailBean.MainCommentBean mainCommentBean, int i4) {
        org.androidannotations.api.a.l(new n("", 0L, "", mainCommentBean, i4));
    }

    @Override // com.join.mgps.activity.CommentDetailActivity, com.join.mgps.adapter.CommentDetailAdapter.h
    public void X(CommentDetailBean.MainCommentBean mainCommentBean, int i4, int i5) {
        org.androidannotations.api.a.l(new p("", 0L, "", mainCommentBean, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void Z0(String str, boolean z4, int i4) {
        org.androidannotations.api.b.e("", new g(str, z4, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void a1(CommentResponse commentResponse) {
        org.androidannotations.api.b.e("", new i(commentResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void b1(String str, boolean z4) {
        org.androidannotations.api.b.e("", new e(str, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void c1(String str, boolean z4, int i4, int i5) {
        org.androidannotations.api.b.e("", new h(str, z4, i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void d1(String str, CommentCreateBean.InfoBean infoBean, boolean z4) {
        org.androidannotations.api.b.e("", new d(str, infoBean, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void e1(CommentDetailBean.MainCommentBean mainCommentBean) {
        org.androidannotations.api.b.e("", new w(mainCommentBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void f1(CommentDetailBean.GameInfoBean gameInfoBean) {
        org.androidannotations.api.b.e("", new x(gameInfoBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void g1() {
        org.androidannotations.api.b.e("", new v(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.S1.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void i1() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void j1(List<CommentDetailBean.MainCommentBean> list, int i4) {
        org.androidannotations.api.b.e("", new a(list, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void m1(String str, String str2, String str3, String str4, String str5, String str6, int i4) {
        org.androidannotations.api.a.l(new l("", 0L, "", str, str2, str3, str4, str5, str6, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void n1(CommentDetailBean.MainCommentBean mainCommentBean, int i4) {
        org.androidannotations.api.a.l(new o("", 0L, "", mainCommentBean, i4));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.R1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.comment_detail_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29422b = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f29423c = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f29424d = (ImageView) aVar.internalFindViewById(R.id.imTopRight);
        this.f29425e = (TextView) aVar.internalFindViewById(R.id.deletedTv);
        this.f29426f = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f29427g = (XListView2) aVar.internalFindViewById(R.id.comment_detail_list);
        this.f29428h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f29429i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f29430j = (LinearLayout) aVar.internalFindViewById(R.id.inputLl);
        this.f29431k = (Button) aVar.internalFindViewById(R.id.btn_chat_praise);
        this.f29432l = (Button) aVar.internalFindViewById(R.id.btn_chat_extension);
        this.f29433m = (TextView) aVar.internalFindViewById(R.id.edit_comment_count);
        this.f29434n = (ClearEditText) aVar.internalFindViewById(R.id.edit_user_comment);
        this.f29435o = (Button) aVar.internalFindViewById(R.id.btn_chat_send);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new k());
        }
        ImageView imageView = this.f29422b;
        if (imageView != null) {
            imageView.setOnClickListener(new r());
        }
        ImageView imageView2 = this.f29424d;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new s());
        }
        afterView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void p1() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.S1.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.R1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentDetailActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.R1.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.R1.a(this);
    }
}
