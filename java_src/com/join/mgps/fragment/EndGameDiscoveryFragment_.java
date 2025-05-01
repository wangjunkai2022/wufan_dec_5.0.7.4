package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.EndGameNameListBean;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class EndGameDiscoveryFragment_ extends EndGameDiscoveryFragment implements y3.a, a4.a, a4.b {

    /* renamed from: j  reason: collision with root package name */
    public static final String f51106j = "position";

    /* renamed from: k  reason: collision with root package name */
    public static final String f51107k = "data";

    /* renamed from: h  reason: collision with root package name */
    private View f51109h;

    /* renamed from: g  reason: collision with root package name */
    private final a4.c f51108g = new a4.c();

    /* renamed from: i  reason: collision with root package name */
    private final Map<Class<?>, Object> f51110i = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameDiscoveryFragment_.super.Z();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51112b;

        b(String str) {
            this.f51112b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameDiscoveryFragment_.super.showTost(this.f51112b);
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends org.androidannotations.api.builder.d<c, EndGameDiscoveryFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public EndGameDiscoveryFragment build() {
            EndGameDiscoveryFragment_ endGameDiscoveryFragment_ = new EndGameDiscoveryFragment_();
            endGameDiscoveryFragment_.setArguments(this.args);
            return endGameDiscoveryFragment_;
        }

        public c b(EndGameNameListBean endGameNameListBean) {
            this.args.putSerializable("data", endGameNameListBean);
            return this;
        }

        public c c(int i4) {
            this.args.putInt("position", i4);
            return this;
        }
    }

    public static c e0() {
        return new c();
    }

    private void f0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("position")) {
                this.f51096c = arguments.getInt("position");
            }
            if (arguments.containsKey("data")) {
                this.f51097d = (EndGameNameListBean) arguments.getSerializable("data");
            }
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameDiscoveryFragment
    public void Z() {
        org.androidannotations.api.b.e("", new a(), 500L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51110i.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51109h;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51108g);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51109h = onCreateView;
        if (onCreateView == null) {
            this.f51109h = layoutInflater.inflate(R.layout.fragment_end_game_discovery, viewGroup, false);
        }
        return this.f51109h;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51109h = null;
        this.f51095b = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51095b = (RecyclerView) aVar.internalFindViewById(R.id.rvList);
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51108g.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51110i.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameDiscoveryFragment
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }
}
