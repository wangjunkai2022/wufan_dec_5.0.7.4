package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class FriendMsgRequestFragment_ extends FriendMsgRequestFragment implements y3.a, a4.a, a4.b {

    /* renamed from: j  reason: collision with root package name */
    private View f51635j;

    /* renamed from: i  reason: collision with root package name */
    private final a4.c f51634i = new a4.c();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Object> f51636k = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendMsgRequestFragment_.super.h0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51638b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f51639c;

        b(List list, int i4) {
            this.f51638b = list;
            this.f51639c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendMsgRequestFragment_.super.j0(this.f51638b, this.f51639c);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51641b;

        c(int i4) {
            this.f51641b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendMsgRequestFragment_.super.g0(this.f51641b);
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51643b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51643b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendMsgRequestFragment_.super.c0(this.f51643b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51646c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, int i4, String str3) {
            super(str, j4, str2);
            this.f51645b = i4;
            this.f51646c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendMsgRequestFragment_.super.f0(this.f51645b, this.f51646c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends org.androidannotations.api.builder.d<f, FriendMsgRequestFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public FriendMsgRequestFragment build() {
            FriendMsgRequestFragment_ friendMsgRequestFragment_ = new FriendMsgRequestFragment_();
            friendMsgRequestFragment_.setArguments(this.args);
            return friendMsgRequestFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static f p0() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendMsgRequestFragment
    public void c0(int i4) {
        org.androidannotations.api.a.l(new d("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendMsgRequestFragment
    public void f0(int i4, String str) {
        org.androidannotations.api.a.l(new e("", 0L, "", i4, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendMsgRequestFragment
    public void g0(int i4) {
        org.androidannotations.api.b.e("", new c(i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51636k.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendMsgRequestFragment
    public void h0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51635j;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendMsgRequestFragment
    public void j0(List<FriendBean> list, int i4) {
        org.androidannotations.api.b.e("", new b(list, i4), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51634i);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51635j = onCreateView;
        if (onCreateView == null) {
            this.f51635j = layoutInflater.inflate(R.layout.fragment_friend_msg_req, viewGroup, false);
        }
        return this.f51635j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51635j = null;
        this.f51626b = null;
        this.f51627c = null;
        this.f51628d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51626b = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f51627c = (XListView) aVar.internalFindViewById(R.id.listView);
        this.f51628d = (Group) aVar.internalFindViewById(R.id.noRecord);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51634i.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51636k.put(cls, t4);
    }
}
