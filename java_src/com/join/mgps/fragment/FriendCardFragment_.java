package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.FriendCardBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class FriendCardFragment_ extends FriendCardFragment implements y3.a, a4.a, a4.b {

    /* renamed from: t  reason: collision with root package name */
    private View f51504t;

    /* renamed from: s  reason: collision with root package name */
    private final a4.c f51503s = new a4.c();

    /* renamed from: u  reason: collision with root package name */
    private final Map<Class<?>, Object> f51505u = new HashMap();

    /* loaded from: classes3.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51506b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendCardFragment_.super.j0(this.f51506b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51508b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f51508b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendCardFragment_.super.v0(this.f51508b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendCardFragment_.this.i0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendCardBean f51511b;

        d(FriendCardBean friendCardBean) {
            this.f51511b = friendCardBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendCardFragment_.super.B0(this.f51511b);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendCardFragment_.super.y0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51514b;

        f(int i4) {
            this.f51514b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendCardFragment_.super.h0(this.f51514b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51516b;

        g(int i4) {
            this.f51516b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendCardFragment_.super.k0(this.f51516b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51518b;

        h(String str) {
            this.f51518b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendCardFragment_.super.w0(this.f51518b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51520b;

        i(String str) {
            this.f51520b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendCardFragment_.super.A0(this.f51520b);
        }
    }

    /* loaded from: classes3.dex */
    class j extends a.c {
        j(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendCardFragment_.super.x0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class k extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51523b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51523b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendCardFragment_.super.g0(this.f51523b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class l extends org.androidannotations.api.builder.d<l, FriendCardFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public FriendCardFragment build() {
            FriendCardFragment_ friendCardFragment_ = new FriendCardFragment_();
            friendCardFragment_.setArguments(this.args);
            return friendCardFragment_;
        }
    }

    public static l M0() {
        return new l();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendCardFragment
    public void A0(String str) {
        org.androidannotations.api.b.e("", new i(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendCardFragment
    public void B0(FriendCardBean friendCardBean) {
        org.androidannotations.api.b.e("", new d(friendCardBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendCardFragment
    public void g0(int i4) {
        org.androidannotations.api.a.l(new k("", 0L, "", i4));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51505u.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendCardFragment
    public void h0(int i4) {
        org.androidannotations.api.b.e("", new f(i4), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51504t;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendCardFragment
    public void j0(int i4) {
        org.androidannotations.api.a.l(new a("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendCardFragment
    public void k0(int i4) {
        org.androidannotations.api.b.e("", new g(i4), 0L);
    }

    @Override // com.join.mgps.fragment.FriendCardFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51503s);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51504t = onCreateView;
        if (onCreateView == null) {
            this.f51504t = layoutInflater.inflate(R.layout.fragment_friend_card, viewGroup, false);
        }
        return this.f51504t;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51504t = null;
        this.f51487c = null;
        this.f51488d = null;
        this.f51489e = null;
        this.f51490f = null;
        this.f51491g = null;
        this.f51492h = null;
        this.f51493i = null;
        this.f51494j = null;
        this.f51495k = null;
        this.f51496l = null;
        this.f51497m = null;
        this.f51498n = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51487c = (SimpleDraweeView) aVar.internalFindViewById(R.id.avatar);
        this.f51488d = (TextView) aVar.internalFindViewById(R.id.name);
        this.f51489e = (TextView) aVar.internalFindViewById(R.id.desc);
        this.f51490f = (TextView) aVar.internalFindViewById(R.id.button);
        this.f51491g = (TextView) aVar.internalFindViewById(R.id.likeCount);
        this.f51492h = (TextView) aVar.internalFindViewById(R.id.state);
        this.f51493i = aVar.internalFindViewById(R.id.icLike);
        this.f51494j = aVar.internalFindViewById(R.id.icVip);
        this.f51495k = aVar.internalFindViewById(R.id.noRecord);
        this.f51496l = (GridView) aVar.internalFindViewById(R.id.gridView);
        this.f51497m = (Group) aVar.internalFindViewById(R.id.main);
        this.f51498n = aVar.internalFindViewById(R.id.netFailed);
        View internalFindViewById = aVar.internalFindViewById(R.id.close);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51503s.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51505u.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendCardFragment
    public void v0(String str) {
        org.androidannotations.api.a.l(new b("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendCardFragment
    public void w0(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendCardFragment
    public void x0() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendCardFragment
    public void y0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }
}
