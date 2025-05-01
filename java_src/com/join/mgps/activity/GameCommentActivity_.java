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
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.RewardBean;
import it.sephiroth.android.library.widget.HListView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameCommentActivity_ extends GameCommentActivity implements y3.a, a4.a, a4.b {
    public static final String S = "informationId";
    public static final String T = "CrcLinkTypeVal";
    public static final String U = "isEdit";
    public static final String V = "informationCommentBean";
    private final a4.c Q = new a4.c();
    private final Map<Class<?>, Object> R = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.z0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RewardBean f31475b;

        d(RewardBean rewardBean) {
            this.f31475b = rewardBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.toastData(this.f31475b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31479b;

        g(String str) {
            this.f31479b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.showMessage(this.f31479b);
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameCommentActivity_.super.o0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f31482b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, InformationCommentBean informationCommentBean) {
            super(str, j4, str2);
            this.f31482b = informationCommentBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameCommentActivity_.super.w0(this.f31482b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f31484b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f31485c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, com.wufan.user.service.protobuf.n0 n0Var, String str3) {
            super(str, j4, str2);
            this.f31484b = n0Var;
            this.f31485c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameCommentActivity_.super.u0(this.f31484b, this.f31485c);
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
            GameCommentActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountBean f31488b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f31489c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, AccountBean accountBean, String str3) {
            super(str, j4, str2);
            this.f31488b = accountBean;
            this.f31489c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameCommentActivity_.super.s0(this.f31488b, this.f31489c);
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
            GameCommentActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameCommentActivity_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameCommentActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameCommentActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f31495b;

        q(List list) {
            this.f31495b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.B0(this.f31495b);
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.D0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f31498b;

        s(InformationCommentBean informationCommentBean) {
            this.f31498b = informationCommentBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.r0(this.f31498b);
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f31500b;

        t(InformationCommentBean informationCommentBean) {
            this.f31500b = informationCommentBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameCommentActivity_.super.C0(this.f31500b);
        }
    }

    /* loaded from: classes4.dex */
    public static class u extends org.androidannotations.api.builder.a<u> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31502a;

        public u(Context context) {
            super(context, GameCommentActivity_.class);
        }

        public u a(String str) {
            return (u) super.extra(GameCommentActivity_.T, str);
        }

        public u b(InformationCommentBean informationCommentBean) {
            return (u) super.extra("informationCommentBean", informationCommentBean);
        }

        public u c(String str) {
            return (u) super.extra("informationId", str);
        }

        public u d(boolean z4) {
            return (u) super.extra("isEdit", z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31502a;
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
            super(fragment.getActivity(), GameCommentActivity_.class);
            this.f31502a = fragment;
        }
    }

    public static u U0(Context context) {
        return new u(context);
    }

    public static u V0(Fragment fragment) {
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
                this.f31465x = extras.getString("informationId");
            }
            if (extras.containsKey(T)) {
                this.f31466y = extras.getString(T);
            }
            if (extras.containsKey("isEdit")) {
                this.f31467z = extras.getBoolean("isEdit");
            }
            if (extras.containsKey("informationCommentBean")) {
                this.A = (InformationCommentBean) extras.getSerializable("informationCommentBean");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void A0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void B0(List<InformationCommentBean> list) {
        org.androidannotations.api.b.e("", new q(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void C0(InformationCommentBean informationCommentBean) {
        org.androidannotations.api.b.e("", new t(informationCommentBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void D0() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.R.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void n0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void o0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.Q);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.information_comment_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31443b = (RelativeLayout) aVar.internalFindViewById(R.id.layout_forum_posts_title);
        this.f31444c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f31445d = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f31446e = (TextView) aVar.internalFindViewById(R.id.noMessage);
        this.f31447f = (XListView2) aVar.internalFindViewById(R.id.mg_forum_post_comment_list);
        this.f31448g = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f31449h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f31450i = (FrameLayout) aVar.internalFindViewById(R.id.layout_forum_posts_main);
        this.f31451j = (ClearEditText) aVar.internalFindViewById(R.id.edit_user_comment);
        this.f31452k = (Button) aVar.internalFindViewById(R.id.btn_chat_praise);
        this.f31453l = (Button) aVar.internalFindViewById(R.id.btn_chat_send);
        this.f31454m = (TextView) aVar.internalFindViewById(R.id.edit_comment_count);
        this.f31455n = (ImageView) aVar.internalFindViewById(R.id.image_add);
        this.f31456o = (TextView) aVar.internalFindViewById(R.id.footer_tip);
        this.f31457p = (Button) aVar.internalFindViewById(R.id.btn_chat_extension);
        this.f31458q = (LinearLayout) aVar.internalFindViewById(R.id.chat_layout_more);
        this.f31459r = aVar.internalFindViewById(R.id.chat_layout_extension);
        this.f31460s = (LinearLayout) aVar.internalFindViewById(R.id.chat_layout_extension_container);
        this.f31461t = (HListView) aVar.internalFindViewById(R.id.matchListView);
        this.f31462u = (TextView) aVar.internalFindViewById(R.id.forum_title_center);
        this.f31463v = (KeyboardListenLayout) aVar.internalFindViewById(R.id.main);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new k());
        }
        ImageView imageView = this.f31444c;
        if (imageView != null) {
            imageView.setOnClickListener(new m());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new n());
        }
        Button button = this.f31453l;
        if (button != null) {
            button.setOnClickListener(new o());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new p());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.R.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void r0(InformationCommentBean informationCommentBean) {
        org.androidannotations.api.b.e("", new s(informationCommentBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void s0(AccountBean accountBean, String str) {
        org.androidannotations.api.a.l(new l("", 0L, "", accountBean, str));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.Q.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void toastData(RewardBean rewardBean) {
        org.androidannotations.api.b.e("", new d(rewardBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void u0(com.wufan.user.service.protobuf.n0 n0Var, String str) {
        org.androidannotations.api.a.l(new j("", 0L, "", n0Var, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void w0(InformationCommentBean informationCommentBean) {
        org.androidannotations.api.a.l(new i("", 0L, "", informationCommentBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameCommentActivity
    public void z0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.Q.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.Q.a(this);
    }
}
