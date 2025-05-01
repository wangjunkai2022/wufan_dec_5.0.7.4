package com.join.mgps.basefragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LoadingLayout;
import com.join.mgps.fragment.BaseFragment;
/* loaded from: classes4.dex */
public abstract class BaseLoadingFragment extends BaseFragment implements LoadingLayout.b {

    /* renamed from: b  reason: collision with root package name */
    protected LoadingLayout f46258b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseLoadingFragment.this.f46258b;
            if (loadingLayout != null) {
                loadingLayout.h();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseLoadingFragment.this.f46258b;
            if (loadingLayout != null) {
                loadingLayout.d();
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseLoadingFragment.this.f46258b;
            if (loadingLayout != null) {
                loadingLayout.i();
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseLoadingFragment.this.f46258b;
            if (loadingLayout != null) {
                loadingLayout.g();
            }
        }
    }

    protected void V(View view) {
        this.f46258b = (LoadingLayout) LayoutInflater.from(getContext()).inflate(R.layout.layout_papa_loading, (ViewGroup) null);
        int X = X();
        if (X > 0) {
            this.f46258b.c(view, X);
            this.f46258b.setRefreshCallBackListener(this);
            this.f46258b.setLoadingLayoutMarginTop(Z());
        }
    }

    protected abstract int W();

    protected abstract int X();

    protected int Z() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a0() {
        new Handler(Looper.getMainLooper()).post(new b());
    }

    protected void b0(String str) {
        this.f46258b.setFailedMessage(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c0() {
        new Handler(Looper.getMainLooper()).post(new d());
    }

    @Override // com.join.mgps.customview.LoadingLayout.b
    public void callBack() {
        d0();
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d0() {
        new Handler(Looper.getMainLooper()).post(new a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e0() {
        new Handler(Looper.getMainLooper()).post(new c());
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    protected abstract void loadData();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(W(), viewGroup, false);
        V(inflate);
        ViewParent parent = inflate.getParent();
        return parent == null ? inflate : (View) parent;
    }
}
