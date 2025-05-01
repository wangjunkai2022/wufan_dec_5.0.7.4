package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ForumData;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ForumGroupMemberActivity_ extends ForumGroupMemberActivity implements y3.a, a4.a, a4.b {

    /* renamed from: u  reason: collision with root package name */
    public static final String f30403u = "gid";

    /* renamed from: q  reason: collision with root package name */
    private final a4.c f30404q = new a4.c();

    /* renamed from: r  reason: collision with root package name */
    private final Map<Class<?>, Object> f30405r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    private final IntentFilter f30406s = new IntentFilter();

    /* renamed from: t  reason: collision with root package name */
    private final BroadcastReceiver f30407t = new a();

    /* loaded from: classes4.dex */
    class a extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f30408b = "gameData";

        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ForumGroupMemberActivity_.this.p0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumGroupMemberActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f30411b;

        c(boolean z4) {
            this.f30411b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupMemberActivity_.super.g0(this.f30411b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupMemberActivity_.super.t0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30414b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ForumData.GroupFans f30415c;

        e(int i4, ForumData.GroupFans groupFans) {
            this.f30414b = i4;
            this.f30415c = groupFans;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupMemberActivity_.super.s0(this.f30414b, this.f30415c);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30417b;

        f(String str) {
            this.f30417b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupMemberActivity_.super.f0(this.f30417b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30419b;

        g(int i4) {
            this.f30419b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupMemberActivity_.super.h0(this.f30419b);
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f30421b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumGroupMemberActivity_.super.i0(this.f30421b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30423b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f30423b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumGroupMemberActivity_.super.j0(this.f30423b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.a<j> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30425a;

        public j(Context context) {
            super(context, ForumGroupMemberActivity_.class);
        }

        public j a(int i4) {
            return (j) super.extra(ForumGroupMemberActivity_.f30403u, i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30425a;
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

        public j(Fragment fragment) {
            super(fragment.getActivity(), ForumGroupMemberActivity_.class);
            this.f30425a = fragment;
        }
    }

    public static j B0(Context context) {
        return new j(context);
    }

    public static j C0(Fragment fragment) {
        return new j(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
        this.f30406s.addAction(o1.a.I);
        this.f30406s.addAction(o1.a.G);
        registerReceiver(this.f30407t, this.f30406s);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(f30403u)) {
            return;
        }
        this.f30385f = extras.getInt(f30403u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumGroupMemberActivity
    public void f0(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumGroupMemberActivity
    public void g0(boolean z4) {
        org.androidannotations.api.b.e("", new c(z4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f30405r.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumGroupMemberActivity
    public void h0(int i4) {
        org.androidannotations.api.b.e("", new g(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumGroupMemberActivity
    public void i0(int i4) {
        org.androidannotations.api.a.l(new h("", 0L, "", i4));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumGroupMemberActivity
    public void j0(int i4) {
        org.androidannotations.api.a.l(new i("", 0L, "", i4));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f30404q);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_forum_group_member_activity);
    }

    @Override // com.join.mgps.activity.ForumGroupMemberActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f30407t);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30381b = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f30382c = (TextView) aVar.internalFindViewById(R.id.forum_title_center);
        this.f30383d = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f30405r.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumGroupMemberActivity
    public void s0(int i4, ForumData.GroupFans groupFans) {
        org.androidannotations.api.b.e("", new e(i4, groupFans), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f30404q.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumGroupMemberActivity
    public void t0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f30404q.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f30404q.a(this);
    }
}
