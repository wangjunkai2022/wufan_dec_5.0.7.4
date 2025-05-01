package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.common.view.ClearEditText;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.KeyboardListenLayout;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.RewardBean;
import it.sephiroth.android.library.widget.HListView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CollectionCommentActivity_ extends CollectionCommentActivity implements y3.a, a4.a, a4.b {
    public static final String O = "informationId";
    public static final String P = "informationCommentBean";
    private final a4.c M = new a4.c();
    private final Map<Class<?>, Object> N = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.u0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f29022b;

        c(List list) {
            this.f29022b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.v0(this.f29022b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.t0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RewardBean f29025b;

        e(RewardBean rewardBean) {
            this.f29025b = rewardBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.toastData(this.f29025b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.x0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.p0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29029b;

        h(String str) {
            this.f29029b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.showMessage(this.f29029b);
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
                CollectionCommentActivity_.super.n0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f29032b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, InformationCommentBean informationCommentBean) {
            super(str, j4, str2);
            this.f29032b = informationCommentBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CollectionCommentActivity_.super.s0(this.f29032b);
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
            CollectionCommentActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f29035b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f29036c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, com.wufan.user.service.protobuf.n0 n0Var, String str3) {
            super(str, j4, str2);
            this.f29035b = n0Var;
            this.f29036c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CollectionCommentActivity_.super.r0(this.f29035b, this.f29036c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionCommentActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionCommentActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionCommentActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionCommentActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f29042b;

        q(InformationCommentBean informationCommentBean) {
            this.f29042b = informationCommentBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.w0(this.f29042b);
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29044b;

        r(String str) {
            this.f29044b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.showToast(this.f29044b);
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionCommentActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    public static class u extends org.androidannotations.api.builder.a<u> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29048a;

        public u(Context context) {
            super(context, CollectionCommentActivity_.class);
        }

        public u a(InformationCommentBean informationCommentBean) {
            return (u) super.extra("informationCommentBean", informationCommentBean);
        }

        public u b(String str) {
            return (u) super.extra("informationId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29048a;
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

        public u(Fragment fragment) {
            super(fragment.getActivity(), CollectionCommentActivity_.class);
            this.f29048a = fragment;
        }
    }

    public static u O0(Context context) {
        return new u(context);
    }

    public static u P0(Fragment fragment) {
        return new u(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("informationId")) {
                this.f29013x = extras.getString("informationId");
            }
            if (extras.containsKey("informationCommentBean")) {
                this.f29014y = (InformationCommentBean) extras.getSerializable("informationCommentBean");
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.N.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void m0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void n0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.M);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.information_comment_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28991b = (RelativeLayout) aVar.internalFindViewById(R.id.layout_forum_posts_title);
        this.f28992c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f28993d = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f28994e = (TextView) aVar.internalFindViewById(R.id.noMessage);
        this.f28995f = (XListView2) aVar.internalFindViewById(R.id.mg_forum_post_comment_list);
        this.f28996g = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f28997h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f28998i = (FrameLayout) aVar.internalFindViewById(R.id.layout_forum_posts_main);
        this.f28999j = (ClearEditText) aVar.internalFindViewById(R.id.edit_user_comment);
        this.f29000k = (Button) aVar.internalFindViewById(R.id.btn_chat_praise);
        this.f29001l = (Button) aVar.internalFindViewById(R.id.btn_chat_send);
        this.f29002m = (TextView) aVar.internalFindViewById(R.id.edit_comment_count);
        this.f29003n = (ImageView) aVar.internalFindViewById(R.id.image_add);
        this.f29004o = (TextView) aVar.internalFindViewById(R.id.footer_tip);
        this.f29005p = (Button) aVar.internalFindViewById(R.id.btn_chat_extension);
        this.f29006q = (LinearLayout) aVar.internalFindViewById(R.id.chat_layout_more);
        this.f29007r = aVar.internalFindViewById(R.id.chat_layout_extension);
        this.f29008s = (LinearLayout) aVar.internalFindViewById(R.id.chat_layout_extension_container);
        this.f29009t = (HListView) aVar.internalFindViewById(R.id.matchListView);
        this.f29010u = (TextView) aVar.internalFindViewById(R.id.forum_title_center);
        this.f29011v = (KeyboardListenLayout) aVar.internalFindViewById(R.id.main);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new k());
        }
        ImageView imageView = this.f28992c;
        if (imageView != null) {
            imageView.setOnClickListener(new m());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new n());
        }
        Button button = this.f29001l;
        if (button != null) {
            button.setOnClickListener(new o());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new p());
        }
        afterview();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void p0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.N.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void r0(com.wufan.user.service.protobuf.n0 n0Var, String str) {
        org.androidannotations.api.a.l(new l("", 0L, "", n0Var, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void s0(InformationCommentBean informationCommentBean) {
        org.androidannotations.api.a.l(new j("", 0L, "", informationCommentBean));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.M.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new r(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void t0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void toastData(RewardBean rewardBean) {
        org.androidannotations.api.b.e("", new e(rewardBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void u0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void v0(List<InformationCommentBean> list) {
        org.androidannotations.api.b.e("", new c(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void w0(InformationCommentBean informationCommentBean) {
        org.androidannotations.api.b.e("", new q(informationCommentBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionCommentActivity
    public void x0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.M.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.M.a(this);
    }
}
