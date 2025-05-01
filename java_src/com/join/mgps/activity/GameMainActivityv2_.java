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
import android.widget.ViewFlipper;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ViewPagerWithADs;
import com.join.mgps.dto.GameMainDataBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameMainActivityv2_ extends GameMainActivityv2 implements y3.a, a4.a, a4.b {
    public static final String G = "gameId";
    private final a4.c E = new a4.c();
    private final Map<Class<?>, Object> F = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameMainDataBean f32594b;

        a(GameMainDataBean gameMainDataBean) {
            this.f32594b = gameMainDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivityv2_.super.r(this.f32594b);
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivityv2_.super.f();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32597b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f32597b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivityv2_.super.o(this.f32597b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivityv2_.super.e();
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
            GameMainActivityv2_.this.g();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivityv2_.this.c();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivityv2_.this.m();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivityv2_.this.d();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivityv2_.this.l();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivityv2_.this.i();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivityv2_.this.k();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivityv2_.this.n();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivityv2_.this.h();
        }
    }

    /* loaded from: classes4.dex */
    public static class n extends org.androidannotations.api.builder.a<n> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f32609a;

        public n(Context context) {
            super(context, GameMainActivityv2_.class);
        }

        public n a(String str) {
            return (n) super.extra("gameId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f32609a;
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
            super(fragment.getActivity(), GameMainActivityv2_.class);
            this.f32609a = fragment;
        }
    }

    private void w(Bundle bundle) {
        this.f32584v = new PrefDef_(this);
        a4.c.b(this);
        x();
    }

    private void x() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("gameId")) {
            return;
        }
        this.f32583u = extras.getString("gameId");
    }

    public static n y(Context context) {
        return new n(context);
    }

    public static n z(Fragment fragment) {
        return new n(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivityv2
    public void e() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivityv2
    public void f() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.F.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivityv2
    public void o(int i4) {
        org.androidannotations.api.a.l(new c("", 0L, "", i4));
    }

    @Override // com.join.mgps.activity.GameMainActivityv2, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.E);
        w(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_game_mainv2);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f32564b = (TextView) aVar.internalFindViewById(R.id.titleText);
        this.f32565c = (ImageView) aVar.internalFindViewById(R.id.iv_back);
        this.f32566d = (ImageView) aVar.internalFindViewById(R.id.iv_switch_netfight);
        this.f32567e = (ImageView) aVar.internalFindViewById(R.id.iv_list);
        this.f32568f = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_book_bg2);
        this.f32569g = (TextView) aVar.internalFindViewById(R.id.tv_gamename);
        this.f32570h = (TextView) aVar.internalFindViewById(R.id.archiveMessage);
        this.f32571i = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_gameicon);
        this.f32572j = (SimpleDraweeView) aVar.internalFindViewById(R.id.achieveImage);
        this.f32573k = (LinearLayout) aVar.internalFindViewById(R.id.tipsLayout);
        this.f32574l = (LinearLayout) aVar.internalFindViewById(R.id.ll_netfight_parent);
        this.f32575m = (LinearLayout) aVar.internalFindViewById(R.id.adContainer);
        this.f32576n = (RelativeLayout) aVar.internalFindViewById(R.id.rl_archive);
        this.f32577o = (RelativeLayout) aVar.internalFindViewById(R.id.joiinSwitchLayout);
        this.f32578p = (RelativeLayout) aVar.internalFindViewById(R.id.rl_localfight);
        this.f32579q = (ViewPagerWithADs) aVar.internalFindViewById(R.id.viewPagerAdLayout);
        this.f32580r = (LinearLayout) aVar.internalFindViewById(R.id.forumPostlayout);
        this.f32581s = (ViewFlipper) aVar.internalFindViewById(R.id.adviewFliper);
        this.f32582t = (TextView) aVar.internalFindViewById(R.id.tv_netfight);
        View internalFindViewById = aVar.internalFindViewById(R.id.btnFastGame);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.rl_top);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.forum_post);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.rl_video);
        ImageView imageView = this.f32565c;
        if (imageView != null) {
            imageView.setOnClickListener(new e());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new f());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new g());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new h());
        }
        RelativeLayout relativeLayout = this.f32578p;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new i());
        }
        LinearLayout linearLayout = this.f32574l;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new j());
        }
        RelativeLayout relativeLayout2 = this.f32576n;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new k());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new l());
        }
        ImageView imageView2 = this.f32566d;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new m());
        }
        b();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.F.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivityv2
    public void r(GameMainDataBean gameMainDataBean) {
        org.androidannotations.api.b.e("", new a(gameMainDataBean), 0L);
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.E.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        x();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.E.a(this);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.E.a(this);
    }
}
