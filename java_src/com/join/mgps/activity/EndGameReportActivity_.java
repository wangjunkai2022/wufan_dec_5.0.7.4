package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.EndGameReportTypeBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class EndGameReportActivity_ extends EndGameReportActivity implements y3.a, a4.a, a4.b {

    /* renamed from: j  reason: collision with root package name */
    public static final String f30228j = "endGameId";

    /* renamed from: h  reason: collision with root package name */
    private final a4.c f30229h = new a4.c();

    /* renamed from: i  reason: collision with root package name */
    private final Map<Class<?>, Object> f30230i = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameReportActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameReportActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f30233b;

        c(List list) {
            this.f30233b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameReportActivity_.super.updateUi(this.f30233b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30235b;

        d(String str) {
            this.f30235b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameReportActivity_.super.showTost(this.f30235b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameReportActivity_.super.k0();
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
                EndGameReportActivity_.super.h0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                EndGameReportActivity_.super.j0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends org.androidannotations.api.builder.a<h> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30240a;

        public h(Context context) {
            super(context, EndGameReportActivity_.class);
        }

        public h a(String str) {
            return (h) super.extra("endGameId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30240a;
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

        public h(Fragment fragment) {
            super(fragment.getActivity(), EndGameReportActivity_.class);
            this.f30240a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("endGameId")) {
            return;
        }
        this.f30223e = extras.getString("endGameId");
    }

    public static h q0(Context context) {
        return new h(context);
    }

    public static h r0(Fragment fragment) {
        return new h(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f30230i.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameReportActivity
    public void h0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameReportActivity
    public void j0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameReportActivity
    public void k0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // com.join.mgps.activity.EndGameReportActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f30229h);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_end_game_report);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30220b = (RecyclerView) aVar.internalFindViewById(R.id.rvReportType);
        this.f30221c = (EditText) aVar.internalFindViewById(R.id.etDesc);
        this.f30222d = (ConstraintLayout) aVar.internalFindViewById(R.id.outside);
        View internalFindViewById = aVar.internalFindViewById(R.id.btnSubmit);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        ConstraintLayout constraintLayout = this.f30222d;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new b());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f30230i.put(cls, t4);
    }

    @Override // com.join.mgps.activity.EndGameReportActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f30229h.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameReportActivity
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameReportActivity
    public void updateUi(List<EndGameReportTypeBean> list) {
        org.androidannotations.api.b.e("", new c(list), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f30229h.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f30229h.a(this);
    }
}
