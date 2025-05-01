package com.join.mgps.activity.posting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.customview.CustomEdittext;
import com.join.mgps.dto.GameTagBean;
import com.join.mgps.dto.GroupListBean;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class PostingActivity_ extends PostingActivity implements y3.a, a4.a, a4.b {
    public static final String K1 = "fromType";
    public static final String L1 = "gameTag";
    public static final String M1 = "postingType";
    public static final String N1 = "postingGroup";
    public static final String O1 = "tag_id";
    public static final String P1 = "tag_name";
    public static final String Q1 = "fid";
    public static final String R1 = "game_id";
    public static final String S1 = "label";
    private final a4.c I1 = new a4.c();
    private final Map<Class<?>, Object> J1 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.showLoading();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.X0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.N0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39527b;

        d(String str) {
            this.f39527b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.V0(this.f39527b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupListBean f39529b;

        e(GroupListBean groupListBean) {
            this.f39529b = groupListBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.Q0(this.f39529b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupListBean f39531b;

        f(GroupListBean groupListBean) {
            this.f39531b = groupListBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.Z0(this.f39531b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39533b;

        g(String str) {
            this.f39533b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.showToast(this.f39533b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.W0();
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
                PostingActivity_.super.u0();
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
                PostingActivity_.super.F0();
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
            PostingActivity_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f39539b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, boolean z4) {
            super(str, j4, str2);
            this.f39539b = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PostingActivity_.super.A0(this.f39539b);
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
                PostingActivity_.super.G0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PostingActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PostingActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PostingActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PostingActivity_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PostingActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.O0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.M0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39549b;

        u(int i4) {
            this.f39549b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            PostingActivity_.super.a1(this.f39549b);
        }
    }

    /* loaded from: classes4.dex */
    public static class v extends org.androidannotations.api.builder.a<v> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f39551a;

        public v(Context context) {
            super(context, PostingActivity_.class);
        }

        public v a(int i4) {
            return (v) super.extra("fid", i4);
        }

        public v b(int i4) {
            return (v) super.extra("fromType", i4);
        }

        public v c(ArrayList<GameTagBean> arrayList) {
            return (v) super.extra(PostingActivity_.L1, arrayList);
        }

        public v d(String str) {
            return (v) super.extra("game_id", str);
        }

        public v e(String str) {
            return (v) super.extra("label", str);
        }

        public v f(String str) {
            return (v) super.extra("postingGroup", str);
        }

        public v g(int i4) {
            return (v) super.extra(PostingActivity_.M1, i4);
        }

        public v h(String str) {
            return (v) super.extra("tag_id", str);
        }

        public v i(String str) {
            return (v) super.extra("tag_name", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f39551a;
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

        public v(Fragment fragment) {
            super(fragment.getActivity(), PostingActivity_.class);
            this.f39551a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f39470c = AccountUtil_.getInstance_(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("fromType")) {
                this.f39469b = extras.getInt("fromType");
            }
            if (extras.containsKey(L1)) {
                this.f39471d = (ArrayList) extras.getSerializable(L1);
            }
            if (extras.containsKey(M1)) {
                this.f39472e = extras.getInt(M1);
            }
            if (extras.containsKey("postingGroup")) {
                this.f39473f = extras.getString("postingGroup");
            }
            if (extras.containsKey("tag_id")) {
                this.f39474g = extras.getString("tag_id");
            }
            if (extras.containsKey("tag_name")) {
                this.f39475h = extras.getString("tag_name");
            }
            if (extras.containsKey("fid")) {
                this.f39476i = extras.getInt("fid");
            }
            if (extras.containsKey("game_id")) {
                this.f39477j = extras.getString("game_id");
            }
            if (extras.containsKey("label")) {
                this.f39478k = extras.getString("label");
            }
        }
    }

    public static v w1(Context context) {
        return new v(context);
    }

    public static v x1(Fragment fragment) {
        return new v(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void A0(boolean z4) {
        org.androidannotations.api.a.l(new l("", 0L, "", z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void F0() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void G0() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void M0() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void N0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void O0() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void Q0(GroupListBean groupListBean) {
        org.androidannotations.api.b.e("", new e(groupListBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void V0(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void W0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void X0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void Z0(GroupListBean groupListBean) {
        org.androidannotations.api.b.e("", new f(groupListBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void a1(int i4) {
        org.androidannotations.api.b.e("", new u(i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.J1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.I1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_posting);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f39480m = (CustomEdittext) aVar.internalFindViewById(R.id.posts_title);
        this.f39481n = (CustomEdittext) aVar.internalFindViewById(R.id.posts_res_link);
        this.f39482o = aVar.internalFindViewById(R.id.posts_res_line);
        this.f39483p = (EditText) aVar.internalFindViewById(R.id.posts_content);
        this.f39485q = (HListView) aVar.internalFindViewById(R.id.posts_pic_hlist);
        this.f39486r = (FrameLayout) aVar.internalFindViewById(R.id.fl_posting_type_container);
        this.f39487s = (LinearLayout) aVar.internalFindViewById(R.id.ll_help_posting);
        this.f39488t = (TextView) aVar.internalFindViewById(R.id.tv_coins);
        this.f39489u = (Button) aVar.internalFindViewById(R.id.btn_selectedCoins);
        this.f39490v = (RelativeLayout) aVar.internalFindViewById(R.id.ll_posting_rec_game);
        this.f39491w = (TextView) aVar.internalFindViewById(R.id.tv_rec_game);
        this.f39492x = (Button) aVar.internalFindViewById(R.id.btn_selectedGames);
        this.f39493y = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f39494z = (ImageView) aVar.internalFindViewById(R.id.iv_posting_location);
        this.A = (TextView) aVar.internalFindViewById(R.id.tv_posting_group);
        this.B = (ImageView) aVar.internalFindViewById(R.id.iv_posting_select);
        this.C = (Button) aVar.internalFindViewById(R.id.btnSubmit);
        this.D = (LinearLayout) aVar.internalFindViewById(R.id.ll_bottom);
        this.E = (RelativeLayout) aVar.internalFindViewById(R.id.rl_main);
        this.F = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.G = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.Q = (FrameLayout) aVar.internalFindViewById(R.id.fl_insert_label);
        this.S = (LinearLayout) aVar.internalFindViewById(R.id.ll_top_center);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.fl_insert_pic);
        Button button = this.C;
        if (button != null) {
            button.setOnClickListener(new k());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new n());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new o());
        }
        ImageView imageView = this.f39493y;
        if (imageView != null) {
            imageView.setOnClickListener(new p());
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new q());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new r());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.J1.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.I1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void showLoading() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.posting.PostingActivity
    public void u0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.I1.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.I1.a(this);
    }
}
