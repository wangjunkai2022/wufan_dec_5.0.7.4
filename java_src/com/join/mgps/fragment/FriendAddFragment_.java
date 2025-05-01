package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.KeyboardListenLayout;
import com.join.mgps.dto.FriendBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class FriendAddFragment_ extends FriendAddFragment implements y3.a, a4.a, a4.b {

    /* renamed from: l  reason: collision with root package name */
    private View f51473l;

    /* renamed from: k  reason: collision with root package name */
    private final a4.c f51472k = new a4.c();

    /* renamed from: m  reason: collision with root package name */
    private final Map<Class<?>, Object> f51474m = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendAddFragment_.this.d0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendAddFragment_.this.Z();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Boolean f51477b;

        c(Boolean bool) {
            this.f51477b = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendAddFragment_.super.X(this.f51477b);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51479b;

        d(List list) {
            this.f51479b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendAddFragment_.super.updateUi(this.f51479b);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51481b;

        e(String str) {
            this.f51481b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendAddFragment_.super.g0(this.f51481b);
        }
    }

    /* loaded from: classes3.dex */
    class f extends a.c {
        f(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendAddFragment_.super.e0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendBean f51484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, FriendBean friendBean) {
            super(str, j4, str2);
            this.f51484b = friendBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendAddFragment_.super.W(this.f51484b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class h extends org.androidannotations.api.builder.d<h, FriendAddFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public FriendAddFragment build() {
            FriendAddFragment_ friendAddFragment_ = new FriendAddFragment_();
            friendAddFragment_.setArguments(this.args);
            return friendAddFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static h m0() {
        return new h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendAddFragment
    public void W(FriendBean friendBean) {
        org.androidannotations.api.a.l(new g("", 0L, "", friendBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendAddFragment
    public void X(Boolean bool) {
        org.androidannotations.api.b.e("", new c(bool), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendAddFragment
    public void e0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendAddFragment
    public void g0(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51474m.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51473l;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51472k);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51473l = onCreateView;
        if (onCreateView == null) {
            this.f51473l = layoutInflater.inflate(R.layout.fragment_friend_add, viewGroup, false);
        }
        return this.f51473l;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51473l = null;
        this.f51460b = null;
        this.f51461c = null;
        this.f51462d = null;
        this.f51463e = null;
        this.f51464f = null;
        this.f51465g = null;
        this.f51466h = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51460b = (EditText) aVar.internalFindViewById(R.id.input);
        this.f51461c = aVar.internalFindViewById(R.id.hint);
        this.f51462d = (KeyboardListenLayout) aVar.internalFindViewById(R.id.keyboardLayout);
        this.f51463e = (RecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        this.f51464f = (TextView) aVar.internalFindViewById(R.id.textView40);
        this.f51465g = (ImageView) aVar.internalFindViewById(R.id.iv_no_data);
        this.f51466h = (TextView) aVar.internalFindViewById(R.id.tv_no_data);
        View internalFindViewById = aVar.internalFindViewById(R.id.search);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.close);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51472k.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51474m.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendAddFragment
    public void updateUi(List<FriendBean> list) {
        org.androidannotations.api.b.e("", new d(list), 0L);
    }
}
