package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class UserCenterFragment_ extends UserCenterFragment implements y3.a, a4.a, a4.b {
    private View B;
    private final a4.c A = new a4.c();
    private final Map<Class<?>, Object> C = new HashMap();
    private final IntentFilter D = new IntentFilter();
    private final BroadcastReceiver E = new f();

    /* loaded from: classes3.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f53184b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f53185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, String str3, int i4) {
            super(str, j4, str2);
            this.f53184b = str3;
            this.f53185c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UserCenterFragment_.super.changeMgState(this.f53184b, this.f53185c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UserCenterFragment_.super.touristLogin();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UserCenterFragment_.super.getViewConfigs();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UserCenterFragment_.super.getUserInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends a.c {
        e(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UserCenterFragment_.super.pullMyProfileInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            UserCenterFragment_.this.updateInfo(context);
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UserCenterFragment_.this.ll_copper();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UserCenterFragment_.super.refreshViews();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UserCenterFragment_.super.showNotifUi();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UserCenterFragment_.super.loadViewConfigsFromLocal();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UserCenterFragment_.super.hideRedPoint();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UserCenterFragment_.super.tokenFailure();
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f53198b;

        m(String str) {
            this.f53198b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            UserCenterFragment_.super.showToast(this.f53198b);
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f53200b;

        n(int i4) {
            this.f53200b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            UserCenterFragment_.super.updateAdapterByNewMsgCount(this.f53200b);
        }
    }

    /* loaded from: classes3.dex */
    public static class o extends org.androidannotations.api.builder.d<o, UserCenterFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public UserCenterFragment build() {
            UserCenterFragment_ userCenterFragment_ = new UserCenterFragment_();
            userCenterFragment_.setArguments(this.args);
            return userCenterFragment_;
        }
    }

    private void init_(Bundle bundle) {
        this.f53160u = new PrefDef_(getActivity());
        a4.c.b(this);
        this.D.addAction(o1.a.B);
    }

    public static o n0() {
        return new o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void changeMgState(String str, int i4) {
        org.androidannotations.api.a.l(new a("", 0L, "", str, i4));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.C.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void getUserInfo() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void getViewConfigs() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void hideRedPoint() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.B;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void loadViewConfigsFromLocal() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.A);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.E, this.D);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.B = onCreateView;
        if (onCreateView == null) {
            this.B = layoutInflater.inflate(R.layout.fragment_usercenter, viewGroup, false);
        }
        return this.B;
    }

    @Override // com.join.mgps.fragment.UserCenterFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.E);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.B = null;
        this.f53141b = null;
        this.f53142c = null;
        this.f53143d = null;
        this.f53144e = null;
        this.f53145f = null;
        this.f53146g = null;
        this.f53147h = null;
        this.f53148i = null;
        this.f53149j = null;
        this.f53150k = null;
        this.f53151l = null;
        this.f53152m = null;
        this.f53153n = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f53141b = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_user_avatar);
        this.f53142c = (ImageView) aVar.internalFindViewById(R.id.iv_arrow);
        this.f53143d = (TextView) aVar.internalFindViewById(R.id.tv_user_nickname);
        this.f53144e = (ImageView) aVar.internalFindViewById(R.id.iv_user_vip);
        this.f53145f = (TextView) aVar.internalFindViewById(R.id.tv_user_rank);
        this.f53146g = (TextView) aVar.internalFindViewById(R.id.tv_user_account);
        this.f53147h = (TextView) aVar.internalFindViewById(R.id.tv_user_coppers);
        this.f53148i = (TextView) aVar.internalFindViewById(R.id.tv_user_member);
        this.f53149j = (TextView) aVar.internalFindViewById(R.id.tv_user_svip);
        this.f53150k = (LinearLayout) aVar.internalFindViewById(R.id.ll_userinfo);
        this.f53151l = (LinearLayout) aVar.internalFindViewById(R.id.ll_svip);
        this.f53152m = (LinearLayout) aVar.internalFindViewById(R.id.ll_members);
        this.f53153n = (GridView) aVar.internalFindViewById(R.id.mGridView);
        View internalFindViewById = aVar.internalFindViewById(R.id.ll_copper);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new g());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void pullMyProfileInfo() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.C.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void refreshViews() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void showNotifUi() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new m(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void tokenFailure() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void touristLogin() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.UserCenterFragment
    public void updateAdapterByNewMsgCount(int i4) {
        org.androidannotations.api.b.e("", new n(i4), 0L);
    }
}
