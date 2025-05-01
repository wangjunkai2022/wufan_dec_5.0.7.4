package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CollectionBeanSub;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class CollectionThreeSubFragment_ extends CollectionThreeSubFragment implements y3.a, a4.a, a4.b {

    /* renamed from: r  reason: collision with root package name */
    private View f50399r;

    /* renamed from: q  reason: collision with root package name */
    private final a4.c f50398q = new a4.c();

    /* renamed from: s  reason: collision with root package name */
    private final Map<Class<?>, Object> f50400s = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    private final IntentFilter f50401t = new IntentFilter();

    /* renamed from: u  reason: collision with root package name */
    private final BroadcastReceiver f50402u = new a();

    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f50403b = "gameData";

        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CollectionThreeSubFragment_.this.V((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionThreeSubFragment_.this.progress_layout();
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionThreeSubFragment_.this.instalButtomButn();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionThreeSubFragment_.super.Z();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionThreeSubFragment_.super.showProgress();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionThreeSubFragment_.super.showInstallButn();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionThreeSubFragment_.super.updateButn();
        }
    }

    /* loaded from: classes3.dex */
    public static class h extends org.androidannotations.api.builder.d<h, CollectionThreeSubFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CollectionThreeSubFragment build() {
            CollectionThreeSubFragment_ collectionThreeSubFragment_ = new CollectionThreeSubFragment_();
            collectionThreeSubFragment_.setArguments(this.args);
            return collectionThreeSubFragment_;
        }
    }

    public static h e0() {
        return new h();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f50401t.addAction(o1.a.I);
        this.f50401t.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionThreeSubFragment
    public void Z() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f50400s.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f50399r;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f50398q);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.f50402u, this.f50401t);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f50399r = onCreateView;
        if (onCreateView == null) {
            this.f50399r = layoutInflater.inflate(R.layout.collection_three_item, viewGroup, false);
        }
        return this.f50399r;
    }

    @Override // com.join.mgps.fragment.CollectionThreeSubFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.f50402u);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f50399r = null;
        this.f50383b = null;
        this.f50384c = null;
        this.f50385d = null;
        this.f50386e = null;
        this.f50387f = null;
        this.f50388g = null;
        this.f50389h = null;
        this.f50390i = null;
        this.f50391j = null;
        this.f50392k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50383b = (SimpleDraweeView) aVar.internalFindViewById(R.id.imgBackground);
        this.f50384c = (SimpleDraweeView) aVar.internalFindViewById(R.id.imgIcon);
        this.f50385d = (TextView) aVar.internalFindViewById(R.id.tvGameDes);
        this.f50386e = (TextView) aVar.internalFindViewById(R.id.tvGameTitle);
        this.f50387f = (Button) aVar.internalFindViewById(R.id.instalButtomButn);
        this.f50388g = (RelativeLayout) aVar.internalFindViewById(R.id.progressbarLayout);
        this.f50389h = (LinearLayout) aVar.internalFindViewById(R.id.instalbutnLayout);
        this.f50390i = (ImageView) aVar.internalFindViewById(R.id.butn_showdownload);
        this.f50391j = (TextView) aVar.internalFindViewById(R.id.percent);
        this.f50392k = (ProgressBar) aVar.internalFindViewById(R.id.butnProgressBar);
        View internalFindViewById = aVar.internalFindViewById(R.id.progress_layout);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        Button button = this.f50387f;
        if (button != null) {
            button.setOnClickListener(new c());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f50398q.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f50400s.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionThreeSubFragment
    public void showInstallButn() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionThreeSubFragment
    public void showProgress() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionThreeSubFragment
    public void updateButn() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }
}
