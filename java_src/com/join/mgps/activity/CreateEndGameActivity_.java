package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.BossBean;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.UserGameListBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CreateEndGameActivity_ extends CreateEndGameActivity implements y3.a, a4.a, a4.b {
    public static final String J = "configBean";
    private final a4.c H = new a4.c();
    private final Map<Class<?>, Object> I = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f29693b;

        a(List list) {
            this.f29693b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameActivity_.super.w0(this.f29693b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29695b;

        b(String str) {
            this.f29695b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameActivity_.super.showToast(this.f29695b);
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f29697b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, boolean z4) {
            super(str, j4, str2);
            this.f29697b = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CreateEndGameActivity_.super.o0(this.f29697b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f29699b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, boolean z4) {
            super(str, j4, str2);
            this.f29699b = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CreateEndGameActivity_.super.n0(this.f29699b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameActivity_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameActivity_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameActivity_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f29709b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f29710c;

        m(boolean z4, List list) {
            this.f29709b = z4;
            this.f29710c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameActivity_.super.x0(this.f29709b, this.f29710c);
        }
    }

    /* loaded from: classes4.dex */
    public static class n extends org.androidannotations.api.builder.a<n> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29712a;

        public n(Context context) {
            super(context, CreateEndGameActivity_.class);
        }

        public n a(GameMainV4DataBean.EndGameConfigBean endGameConfigBean) {
            return (n) super.extra("configBean", endGameConfigBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29712a;
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

        public n(Fragment fragment) {
            super(fragment.getActivity(), CreateEndGameActivity_.class);
            this.f29712a = fragment;
        }
    }

    public static n D0(Context context) {
        return new n(context);
    }

    public static n E0(Fragment fragment) {
        return new n(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("configBean")) {
            return;
        }
        this.f29662c = (GameMainV4DataBean.EndGameConfigBean) extras.getSerializable("configBean");
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.I.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameActivity
    public void n0(boolean z4) {
        org.androidannotations.api.a.l(new d("", 0L, "", z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameActivity
    public void o0(boolean z4) {
        org.androidannotations.api.a.l(new c("", 0L, "", z4));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.H);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_create_end_game);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29663d = (TextView) aVar.internalFindViewById(R.id.tv_time_label);
        this.f29664e = (TextView) aVar.internalFindViewById(R.id.tv_time);
        this.f29665f = (ImageView) aVar.internalFindViewById(R.id.iv_arrow);
        this.f29666g = (ImageView) aVar.internalFindViewById(R.id.iv_arrow_game);
        this.f29667h = (LinearLayout) aVar.internalFindViewById(R.id.ll_boss_info);
        this.f29668i = (TextView) aVar.internalFindViewById(R.id.tv_boss_title);
        this.f29669j = (TextView) aVar.internalFindViewById(R.id.tv_boss_sub_title);
        this.f29670k = (TextView) aVar.internalFindViewById(R.id.tv_choose_boos);
        this.f29671l = (ImageView) aVar.internalFindViewById(R.id.iv_archive_image);
        this.f29672m = (RelativeLayout) aVar.internalFindViewById(R.id.rl_slot);
        this.f29673n = (LinearLayout) aVar.internalFindViewById(R.id.ll_choose_slot);
        this.f29674o = (ImageView) aVar.internalFindViewById(R.id.iv_question);
        this.f29675p = (TextView) aVar.internalFindViewById(R.id.tv_choose_game);
        this.f29676q = (SimpleDraweeView) aVar.internalFindViewById(R.id.sdv_image_game);
        View internalFindViewById = aVar.internalFindViewById(R.id.iv_back);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.btn_next);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.iv_delete_slot);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.cv_boss);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.cv_game);
        View internalFindViewById6 = aVar.internalFindViewById(R.id.cv_time);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new e());
        }
        ImageView imageView = this.f29674o;
        if (imageView != null) {
            imageView.setOnClickListener(new f());
        }
        LinearLayout linearLayout = this.f29673n;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new g());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new h());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new i());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new j());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new k());
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new l());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.I.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.H.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameActivity
    public void w0(List<BossBean> list) {
        org.androidannotations.api.b.e("", new a(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameActivity
    public void x0(boolean z4, List<UserGameListBean> list) {
        org.androidannotations.api.b.e("", new m(z4, list), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.H.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.H.a(this);
    }
}
