package com.join.mgps.activity;

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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CommentAllListActivity_ extends CommentAllListActivity implements y3.a, a4.a, a4.b {
    public static final String A1 = "sgcSwitch";
    public static final String B1 = "gameType";
    public static final String C1 = "gameIsStart";
    public static final String W = "commentId";
    public static final String X = "commentContent";
    public static final String Y = "commentStars";
    public static final String Z = "gameId";

    /* renamed from: p0  reason: collision with root package name */
    public static final String f29339p0 = "packageName";

    /* renamed from: p1  reason: collision with root package name */
    public static final String f29340p1 = "commentScoreSwitch";

    /* renamed from: v1  reason: collision with root package name */
    public static final String f29341v1 = "bespeakSwitch";
    private final a4.c U = new a4.c();
    private final Map<Class<?>, Object> V = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29342b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f29343c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29344d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f29345e;

        a(String str, boolean z4, int i4, int i5) {
            this.f29342b = str;
            this.f29343c = z4;
            this.f29344d = i4;
            this.f29345e = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListActivity_.super.o0(this.f29342b, this.f29343c, this.f29344d, this.f29345e);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentResponse f29347b;

        b(CommentResponse commentResponse) {
            this.f29347b = commentResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListActivity_.super.p0(this.f29347b);
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentAllListActivity_.super.k0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f29350b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29351c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29352d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, CommentBaseBean commentBaseBean, int i4, int i5) {
            super(str, j4, str2);
            this.f29350b = commentBaseBean;
            this.f29351c = i4;
            this.f29352d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentAllListActivity_.super.b(this.f29350b, this.f29351c, this.f29352d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f29354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29355c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29356d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, CommentBaseBean commentBaseBean, int i4, int i5) {
            super(str, j4, str2);
            this.f29354b = commentBaseBean;
            this.f29355c = i4;
            this.f29356d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentAllListActivity_.super.c(this.f29354b, this.f29355c, this.f29356d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {
        f(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentAllListActivity_.super.n0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentAllListBean.ScoringDetailsBean f29361b;

        i(CommentAllListBean.ScoringDetailsBean scoringDetailsBean) {
            this.f29361b = scoringDetailsBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListActivity_.super.q0(this.f29361b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f29364b;

        k(List list) {
            this.f29364b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListActivity_.super.r0(this.f29364b);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListActivity_.super.t0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29368b;

        n(String str) {
            this.f29368b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListActivity_.super.showMessage(this.f29368b);
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29370b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29371c;

        o(int i4, int i5) {
            this.f29370b = i4;
            this.f29371c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListActivity_.super.i0(this.f29370b, this.f29371c);
        }
    }

    /* loaded from: classes4.dex */
    public static class p extends org.androidannotations.api.builder.a<p> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29373a;

        public p(Context context) {
            super(context, CommentAllListActivity_.class);
        }

        public p a(int i4) {
            return (p) super.extra("bespeakSwitch", i4);
        }

        public p b(String str) {
            return (p) super.extra("commentContent", str);
        }

        public p c(String str) {
            return (p) super.extra("commentId", str);
        }

        public p d(String str) {
            return (p) super.extra("commentScoreSwitch", str);
        }

        public p e(float f5) {
            return (p) super.extra("commentStars", f5);
        }

        public p f(String str) {
            return (p) super.extra("gameId", str);
        }

        public p g(int i4) {
            return (p) super.extra("gameIsStart", i4);
        }

        public p h(String str) {
            return (p) super.extra("gameType", str);
        }

        public p i(String str) {
            return (p) super.extra("packageName", str);
        }

        public p j(int i4) {
            return (p) super.extra("sgcSwitch", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29373a;
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

        public p(Fragment fragment) {
            super(fragment.getActivity(), CommentAllListActivity_.class);
            this.f29373a = fragment;
        }
    }

    public static p H0(Context context) {
        return new p(context);
    }

    public static p I0(Fragment fragment) {
        return new p(fragment);
    }

    private void init_(Bundle bundle) {
        this.f29321l = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("commentId")) {
                this.f29322m = extras.getString("commentId");
            }
            if (extras.containsKey("commentContent")) {
                this.f29323n = extras.getString("commentContent");
            }
            if (extras.containsKey("commentStars")) {
                this.f29324o = extras.getFloat("commentStars");
            }
            if (extras.containsKey("gameId")) {
                this.f29325p = extras.getString("gameId");
            }
            if (extras.containsKey("packageName")) {
                this.f29326q = extras.getString("packageName");
            }
            if (extras.containsKey("commentScoreSwitch")) {
                this.f29327r = extras.getString("commentScoreSwitch");
            }
            if (extras.containsKey("bespeakSwitch")) {
                this.f29328s = extras.getInt("bespeakSwitch");
            }
            if (extras.containsKey("sgcSwitch")) {
                this.f29329t = extras.getInt("sgcSwitch");
            }
            if (extras.containsKey("gameType")) {
                this.f29330u = extras.getString("gameType");
            }
            if (extras.containsKey("gameIsStart")) {
                this.f29331v = extras.getInt("gameIsStart");
            }
        }
    }

    @Override // com.join.mgps.activity.CommentAllListActivity, com.join.mgps.adapter.CommentAllListAdapter.h
    public void b(CommentBaseBean commentBaseBean, int i4, int i5) {
        org.androidannotations.api.a.l(new d("", 0L, "", commentBaseBean, i4, i5));
    }

    @Override // com.join.mgps.activity.CommentAllListActivity, com.join.mgps.adapter.CommentAllListAdapter.h
    public void c(CommentBaseBean commentBaseBean, int i4, int i5) {
        org.androidannotations.api.a.l(new e("", 0L, "", commentBaseBean, i4, i5));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.V.get(cls);
    }

    @Override // com.join.mgps.activity.CommentAllListActivity
    public void i0(int i4, int i5) {
        org.androidannotations.api.b.e("", new o(i4, i5), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentAllListActivity
    public void k0() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentAllListActivity
    public void n0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentAllListActivity
    public void o0(String str, boolean z4, int i4, int i5) {
        org.androidannotations.api.b.e("", new a(str, z4, i4, i5), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.U);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.comment_all_list_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29312c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f29313d = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f29314e = (TextView) aVar.internalFindViewById(R.id.textTopRight);
        this.f29315f = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f29316g = (XListView2) aVar.internalFindViewById(R.id.comment_all_list);
        this.f29317h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f29318i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f29319j = (LinearLayout) aVar.internalFindViewById(R.id.noCommentLl);
        ImageView imageView = this.f29312c;
        if (imageView != null) {
            imageView.setOnClickListener(new g());
        }
        TextView textView = this.f29314e;
        if (textView != null) {
            textView.setOnClickListener(new h());
        }
        afterView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentAllListActivity
    public void p0(CommentResponse commentResponse) {
        org.androidannotations.api.b.e("", new b(commentResponse), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.V.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentAllListActivity
    public void q0(CommentAllListBean.ScoringDetailsBean scoringDetailsBean) {
        org.androidannotations.api.b.e("", new i(scoringDetailsBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentAllListActivity
    public void r0(List<CommentBaseBean> list) {
        org.androidannotations.api.b.e("", new k(list), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.U.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentAllListActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentAllListActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentAllListActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new n(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentAllListActivity
    public void t0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.U.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.U.a(this);
    }
}
