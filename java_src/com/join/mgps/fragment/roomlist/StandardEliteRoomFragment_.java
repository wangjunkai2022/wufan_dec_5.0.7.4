package com.join.mgps.fragment.roomlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.mgsim.arena.SimpleWrapperRoom;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa91.battle.protocol.SimpleRoom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class StandardEliteRoomFragment_ extends StandardEliteRoomFragment implements y3.a, a4.a, a4.b {
    private View V;
    private final a4.c U = new a4.c();
    private final Map<Class<?>, Object> W = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimpleRoom f53357b;

        a(SimpleRoom simpleRoom) {
            this.f53357b = simpleRoom;
        }

        @Override // java.lang.Runnable
        public void run() {
            StandardEliteRoomFragment_.super.Q0(this.f53357b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f53359b;

        b(int i4) {
            this.f53359b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            StandardEliteRoomFragment_.super.K0(this.f53359b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f53361b;

        c(ArrayList arrayList) {
            this.f53361b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            StandardEliteRoomFragment_.super.e1(this.f53361b);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f53363b;

        d(ArrayList arrayList) {
            this.f53363b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            StandardEliteRoomFragment_.super.w0(this.f53363b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f53365b;

        e(ArrayList arrayList) {
            this.f53365b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            StandardEliteRoomFragment_.super.f1(this.f53365b);
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StandardEliteRoomFragment_.super.l0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StandardEliteRoomFragment_.super.m0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f53369b;

        h(String str) {
            this.f53369b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            StandardEliteRoomFragment_.super.showToast(this.f53369b);
        }
    }

    /* loaded from: classes3.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f53371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f53371b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                StandardEliteRoomFragment_.super.G0(this.f53371b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class j extends org.androidannotations.api.builder.d<j, StandardEliteRoomFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public StandardEliteRoomFragment build() {
            StandardEliteRoomFragment_ standardEliteRoomFragment_ = new StandardEliteRoomFragment_();
            standardEliteRoomFragment_.setArguments(this.args);
            return standardEliteRoomFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f53310b = AccountUtil_.getInstance_(getActivity());
    }

    public static j s1() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment
    public void G0(String str) {
        org.androidannotations.api.a.l(new i("", 0L, "", str));
    }

    @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment
    public void K0(int i4) {
        org.androidannotations.api.b.e("", new b(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment
    public void Q0(SimpleRoom simpleRoom) {
        org.androidannotations.api.b.e("", new a(simpleRoom), 0L);
    }

    @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment
    public void e1(ArrayList<SimpleRoom> arrayList) {
        org.androidannotations.api.b.e("", new c(arrayList), 0L);
    }

    @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment
    public void f1(ArrayList<SimpleRoom> arrayList) {
        org.androidannotations.api.b.e("", new e(arrayList), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.W.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.V;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment
    public void l0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment
    public void m0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.U);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.V = onCreateView;
        if (onCreateView == null) {
            this.V = layoutInflater.inflate(R.layout.fragment_standardorelite_room, viewGroup, false);
        }
        return this.V;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.V = null;
        this.f53315g = null;
        this.f53316h = null;
        this.f53317i = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f53315g = (TextView) aVar.internalFindViewById(R.id.noData);
        this.f53316h = (XRecyclerView) aVar.internalFindViewById(R.id.mListView);
        this.f53317i = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.U.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.W.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment
    public void w0(ArrayList<SimpleWrapperRoom> arrayList) {
        org.androidannotations.api.b.e("", new d(arrayList), 0L);
    }
}
