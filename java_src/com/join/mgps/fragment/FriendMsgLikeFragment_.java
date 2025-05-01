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
public final class FriendMsgLikeFragment_ extends FriendMsgLikeFragment implements y3.a, a4.a, a4.b {

    /* renamed from: j  reason: collision with root package name */
    private View f51617j;

    /* renamed from: i  reason: collision with root package name */
    private final a4.c f51616i = new a4.c();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Object> f51618k = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendMsgLikeFragment_.super.g0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51620b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f51621c;

        b(List list, int i4) {
            this.f51620b = list;
            this.f51621c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendMsgLikeFragment_.super.i0(this.f51620b, this.f51621c);
        }
    }

    /* loaded from: classes3.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51623b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51623b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendMsgLikeFragment_.super.d0(this.f51623b);
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
                FriendMsgLikeFragment_.super.c0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends org.androidannotations.api.builder.d<e, FriendMsgLikeFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public FriendMsgLikeFragment build() {
            FriendMsgLikeFragment_ friendMsgLikeFragment_ = new FriendMsgLikeFragment_();
            friendMsgLikeFragment_.setArguments(this.args);
            return friendMsgLikeFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static e n0() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendMsgLikeFragment
    public void c0() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendMsgLikeFragment
    public void d0(int i4) {
        org.androidannotations.api.a.l(new c("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendMsgLikeFragment
    public void g0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51618k.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendMsgLikeFragment
    public void i0(List<FriendBean> list, int i4) {
        org.androidannotations.api.b.e("", new b(list, i4), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51617j;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51616i);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51617j = onCreateView;
        if (onCreateView == null) {
            this.f51617j = layoutInflater.inflate(R.layout.fragment_friend_msg_like, viewGroup, false);
        }
        return this.f51617j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51617j = null;
        this.f51608b = null;
        this.f51609c = null;
        this.f51610d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51608b = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f51609c = (XListView) aVar.internalFindViewById(R.id.listView);
        this.f51610d = (Group) aVar.internalFindViewById(R.id.noRecord);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51616i.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51618k.put(cls, t4);
    }
}
