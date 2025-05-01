package com.join.mgps.baseactivity;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.c0;
import com.join.mgps.customview.LoadingLayout;
/* loaded from: classes4.dex */
public class BaseFragmentLoadingActivity extends BaseFragmentActivity implements LoadingLayout.b, LoadingLayout.a {

    /* renamed from: b  reason: collision with root package name */
    protected LoadingLayout f46244b;

    /* renamed from: c  reason: collision with root package name */
    String f46245c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseFragmentLoadingActivity.this.f46244b;
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
            LoadingLayout loadingLayout = BaseFragmentLoadingActivity.this.f46244b;
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
            LoadingLayout loadingLayout = BaseFragmentLoadingActivity.this.f46244b;
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
            LoadingLayout loadingLayout = BaseFragmentLoadingActivity.this.f46244b;
            if (loadingLayout != null) {
                loadingLayout.g();
            }
        }
    }

    @Override // com.join.mgps.customview.LoadingLayout.b
    public void callBack() {
        h0();
        loadData();
    }

    protected void f0() {
        new Handler(Looper.getMainLooper()).post(new b());
    }

    protected void g0() {
        new Handler(Looper.getMainLooper()).post(new d());
    }

    protected int getLoadingLayoutResID() {
        return 0;
    }

    protected int getLoadingMarginTop() {
        return c0.a(this, 48.0f);
    }

    protected void h0() {
        new Handler(Looper.getMainLooper()).post(new a());
    }

    protected void i0() {
        new Handler(Looper.getMainLooper()).post(new c());
    }

    public void loadData() {
    }

    @Override // com.join.mgps.customview.LoadingLayout.a
    public void noDataCallBack() {
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        LoadingLayout loadingLayout = (LoadingLayout) LayoutInflater.from(this).inflate(R.layout.layout_papa_loading, (ViewGroup) null);
        this.f46244b = loadingLayout;
        String str = this.f46245c;
        if (str != null) {
            loadingLayout.setLoadingHintMsg(str);
        }
        int loadingLayoutResID = getLoadingLayoutResID();
        if (loadingLayoutResID > 0) {
            this.f46244b.b(getWindow().getDecorView().getRootView(), loadingLayoutResID);
            this.f46244b.setRefreshCallBackListener(this);
            this.f46244b.setLoadingLayoutMarginTop(getLoadingMarginTop());
        }
    }

    protected void setLoadingFailMsg(String str) {
        this.f46244b.setFailedMessage(str);
    }

    public void setLoadingHintMsg(String str) {
        this.f46245c = str;
    }

    protected void setNoDataListener() {
        this.f46244b.setNoDataCallBackListener(this);
    }

    public void setmLoadingHintMsgLoading(String str) {
        this.f46244b.setLoadingHintMsg(str);
    }
}
