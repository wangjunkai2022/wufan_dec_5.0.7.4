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
import com.join.mgps.dto.InformationCommentBeanV2;
import com.join.mgps.dto.RewardBean;
import it.sephiroth.android.library.widget.HListView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameInformationCommentActivity_ extends GameInformationCommentActivity implements y3.a, a4.a, a4.b {
    public static final String O = "informationId";
    public static final String P = "informationCommentBean";
    private final a4.c M = new a4.c();
    private final Map<Class<?>, Object> N = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f32341b;

        a(List list) {
            this.f32341b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.u0(this.f32341b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.s0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.t0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.l0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RewardBean f32346b;

        e(RewardBean rewardBean) {
            this.f32346b = rewardBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.toastData(this.f32346b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.x0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32351b;

        i(String str) {
            this.f32351b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.showMessage(this.f32351b);
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
                GameInformationCommentActivity_.super.m0();
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
            GameInformationCommentActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f32355b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, InformationCommentBeanV2 informationCommentBeanV2) {
            super(str, j4, str2);
            this.f32355b = informationCommentBeanV2;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameInformationCommentActivity_.super.r0(this.f32355b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f32357b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32358c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, long j4, String str2, com.wufan.user.service.protobuf.n0 n0Var, String str3) {
            super(str, j4, str2);
            this.f32357b = n0Var;
            this.f32358c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameInformationCommentActivity_.super.q0(this.f32357b, this.f32358c);
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
            GameInformationCommentActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationCommentActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationCommentActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationCommentActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f32364b;

        r(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f32364b = informationCommentBeanV2;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.v0(this.f32364b);
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32366b;

        s(String str) {
            this.f32366b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.showToast(this.f32366b);
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationCommentActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    public static class v extends org.androidannotations.api.builder.a<v> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f32370a;

        public v(Context context) {
            super(context, GameInformationCommentActivity_.class);
        }

        public v a(InformationCommentBeanV2 informationCommentBeanV2) {
            return (v) super.extra("informationCommentBean", informationCommentBeanV2);
        }

        public v b(String str) {
            return (v) super.extra("informationId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f32370a;
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
            super(fragment.getActivity(), GameInformationCommentActivity_.class);
            this.f32370a = fragment;
        }
    }

    public static v P0(Context context) {
        return new v(context);
    }

    public static v Q0(Fragment fragment) {
        return new v(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("informationId")) {
                this.f32334x = extras.getString("informationId");
            }
            if (extras.containsKey("informationCommentBean")) {
                this.f32335y = (InformationCommentBeanV2) extras.getSerializable("informationCommentBean");
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
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void l0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void m0() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void o0() {
        org.androidannotations.api.b.e("", new h(), 0L);
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
        this.f32312b = (RelativeLayout) aVar.internalFindViewById(R.id.layout_forum_posts_title);
        this.f32313c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f32314d = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f32315e = (TextView) aVar.internalFindViewById(R.id.noMessage);
        this.f32316f = (XListView2) aVar.internalFindViewById(R.id.mg_forum_post_comment_list);
        this.f32317g = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f32318h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f32319i = (FrameLayout) aVar.internalFindViewById(R.id.layout_forum_posts_main);
        this.f32320j = (ClearEditText) aVar.internalFindViewById(R.id.edit_user_comment);
        this.f32321k = (Button) aVar.internalFindViewById(R.id.btn_chat_praise);
        this.f32322l = (Button) aVar.internalFindViewById(R.id.btn_chat_send);
        this.f32323m = (TextView) aVar.internalFindViewById(R.id.edit_comment_count);
        this.f32324n = (ImageView) aVar.internalFindViewById(R.id.image_add);
        this.f32325o = (TextView) aVar.internalFindViewById(R.id.footer_tip);
        this.f32326p = (Button) aVar.internalFindViewById(R.id.btn_chat_extension);
        this.f32327q = (LinearLayout) aVar.internalFindViewById(R.id.chat_layout_more);
        this.f32328r = aVar.internalFindViewById(R.id.chat_layout_extension);
        this.f32329s = (LinearLayout) aVar.internalFindViewById(R.id.chat_layout_extension_container);
        this.f32330t = (HListView) aVar.internalFindViewById(R.id.matchListView);
        this.f32331u = (TextView) aVar.internalFindViewById(R.id.forum_title_center);
        this.f32332v = (KeyboardListenLayout) aVar.internalFindViewById(R.id.main);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new k());
        }
        ImageView imageView = this.f32313c;
        if (imageView != null) {
            imageView.setOnClickListener(new n());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new o());
        }
        Button button = this.f32322l;
        if (button != null) {
            button.setOnClickListener(new p());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new q());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.N.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void q0(com.wufan.user.service.protobuf.n0 n0Var, String str) {
        org.androidannotations.api.a.l(new m("", 0L, "", n0Var, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void r0(InformationCommentBeanV2 informationCommentBeanV2) {
        org.androidannotations.api.a.l(new l("", 0L, "", informationCommentBeanV2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void s0() {
        org.androidannotations.api.b.e("", new b(), 0L);
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
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new i(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new s(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void t0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void toastData(RewardBean rewardBean) {
        org.androidannotations.api.b.e("", new e(rewardBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void u0(List<InformationCommentBeanV2> list) {
        org.androidannotations.api.b.e("", new a(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void v0(InformationCommentBeanV2 informationCommentBeanV2) {
        org.androidannotations.api.b.e("", new r(informationCommentBeanV2), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void w0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationCommentActivity
    public void x0() {
        org.androidannotations.api.b.e("", new g(), 0L);
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
