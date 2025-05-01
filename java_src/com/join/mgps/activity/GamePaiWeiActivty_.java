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
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.customview.AutoScrollViewPager;
import com.join.mgps.dto.PaiWeiUploadFileBean;
import com.join.mgps.dto.PaiWeiUploadFileNewBean;
import com.papa91.arc.bean.PaiWeiDataBean;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GamePaiWeiActivty_ extends GamePaiWeiActivty implements y3.a, a4.a, a4.b {
    public static final String F1 = "gameId";
    public static final String G1 = "numPlayers";
    public static final String H1 = "rankAutoUpload";
    private final a4.c D1 = new a4.c();
    private final Map<Class<?>, Object> E1 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.s();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.K();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f32724b;

        c(List list) {
            this.f32724b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.I(this.f32724b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaiWeiDataBean.MonthBestBean f32726b;

        d(PaiWeiDataBean.MonthBestBean monthBestBean) {
            this.f32726b = monthBestBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.J(this.f32726b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.t();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32729b;

        f(String str) {
            this.f32729b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.M(this.f32729b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32731b;

        g(String str) {
            this.f32731b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.N(this.f32731b);
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
                GamePaiWeiActivty_.super.R();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f32734b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32735c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, File file, String str3) {
            super(str, j4, str2);
            this.f32734b = file;
            this.f32735c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamePaiWeiActivty_.super.Q(this.f32734b, this.f32735c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32737b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f32737b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamePaiWeiActivty_.super.v(this.f32737b);
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
            GamePaiWeiActivty_.this.G();
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
                GamePaiWeiActivty_.super.w();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32741b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f32741b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamePaiWeiActivty_.super.o(this.f32741b);
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
            GamePaiWeiActivty_.this.C();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamePaiWeiActivty_.this.D();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamePaiWeiActivty_.this.E();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f32746b;

        q(boolean z4) {
            this.f32746b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.y(this.f32746b);
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaiWeiUploadFileNewBean f32748b;

        r(PaiWeiUploadFileNewBean paiWeiUploadFileNewBean) {
            this.f32748b = paiWeiUploadFileNewBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.T(this.f32748b);
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaiWeiUploadFileBean f32750b;

        s(PaiWeiUploadFileBean paiWeiUploadFileBean) {
            this.f32750b = paiWeiUploadFileBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.S(this.f32750b);
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32752b;

        t(String str) {
            this.f32752b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.O(this.f32752b);
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamePaiWeiActivty_.super.L();
        }
    }

    /* loaded from: classes4.dex */
    public static class v extends org.androidannotations.api.builder.a<v> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f32755a;

        public v(Context context) {
            super(context, GamePaiWeiActivty_.class);
        }

        public v a(String str) {
            return (v) super.extra("gameId", str);
        }

        public v b(int i4) {
            return (v) super.extra(GamePaiWeiActivty_.G1, i4);
        }

        public v c(int i4) {
            return (v) super.extra(GamePaiWeiActivty_.H1, i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f32755a;
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
            super(fragment.getActivity(), GamePaiWeiActivty_.class);
            this.f32755a = fragment;
        }
    }

    private void m0(Bundle bundle) {
        a4.c.b(this);
        this.f32706z = AccountUtil_.getInstance_(this);
        n0();
    }

    private void n0() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.A = extras.getString("gameId");
            }
            if (extras.containsKey(G1)) {
                this.B = extras.getInt(G1);
            }
            if (extras.containsKey(H1)) {
                this.C = extras.getInt(H1);
            }
        }
    }

    public static v o0(Context context) {
        return new v(context);
    }

    public static v p0(Fragment fragment) {
        return new v(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void I(List<PaiWeiDataBean.AdListBean> list) {
        org.androidannotations.api.b.e("", new c(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void J(PaiWeiDataBean.MonthBestBean monthBestBean) {
        org.androidannotations.api.b.e("", new d(monthBestBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void K() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void L() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void M(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void N(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void O(String str) {
        org.androidannotations.api.b.e("", new t(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void Q(File file, String str) {
        org.androidannotations.api.a.l(new i("", 0L, "", file, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void R() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void S(PaiWeiUploadFileBean paiWeiUploadFileBean) {
        org.androidannotations.api.b.e("", new s(paiWeiUploadFileBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void T(PaiWeiUploadFileNewBean paiWeiUploadFileNewBean) {
        org.androidannotations.api.b.e("", new r(paiWeiUploadFileNewBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.E1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void o(String str) {
        org.androidannotations.api.a.l(new m("", 0L, "", str));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.D1);
        m0(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activty_game_paiwei);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f32679b = (LinearLayout) aVar.internalFindViewById(R.id.select_rolo_ll);
        this.f32680c = (ImageView) aVar.internalFindViewById(R.id.paiwei_back_iv);
        this.f32681d = (ImageView) aVar.internalFindViewById(R.id.select_rolo_iv);
        this.f32682e = (ImageView) aVar.internalFindViewById(R.id.paiwei_help_ib);
        this.f32683f = (Button) aVar.internalFindViewById(R.id.paiwei_start_bt);
        this.f32684g = (TextView) aVar.internalFindViewById(R.id.paiwei_start_time_tv);
        this.f32685h = (TextView) aVar.internalFindViewById(R.id.paiwei_start_order_tv);
        this.f32686i = (TextView) aVar.internalFindViewById(R.id.paiwei_start_name_tv);
        this.f32687j = (TextView) aVar.internalFindViewById(R.id.paiwei_null_tv);
        this.f32688k = (TextView) aVar.internalFindViewById(R.id.paiwei_info_tv2);
        this.f32689l = (TextView) aVar.internalFindViewById(R.id.paiwei_info_tv4);
        this.f32690m = (TextView) aVar.internalFindViewById(R.id.paiwei_cion_tv);
        this.f32691n = (TextView) aVar.internalFindViewById(R.id.select_rolo_tx);
        this.f32692o = (ListView) aVar.internalFindViewById(R.id.select_rolo_listview);
        this.f32693p = (ListView) aVar.internalFindViewById(R.id.paiwei_listview);
        this.f32696q = (RelativeLayout) aVar.internalFindViewById(R.id.info_rl);
        this.f32697r = (AutoScrollViewPager) aVar.internalFindViewById(R.id.paiwei_ad_viewpager);
        this.f32698s = (SimpleDraweeView) aVar.internalFindViewById(R.id.paiwei_ad_iv);
        LinearLayout linearLayout = this.f32679b;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new k());
        }
        ImageView imageView = this.f32680c;
        if (imageView != null) {
            imageView.setOnClickListener(new n());
        }
        ImageView imageView2 = this.f32682e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new o());
        }
        Button button = this.f32683f;
        if (button != null) {
            button.setOnClickListener(new p());
        }
        p();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.E1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void s() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.D1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void t() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void v(String str) {
        org.androidannotations.api.a.l(new j("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void w() {
        org.androidannotations.api.a.l(new l("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamePaiWeiActivty
    public void y(boolean z4) {
        org.androidannotations.api.b.e("", new q(z4), 0L);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.D1.a(this);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.D1.a(this);
    }
}
