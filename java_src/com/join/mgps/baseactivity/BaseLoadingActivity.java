package com.join.mgps.baseactivity;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.c0;
import com.join.mgps.customview.LoadingLayout;
/* loaded from: classes4.dex */
public class BaseLoadingActivity extends BaseActivity implements LoadingLayout.b, LoadingLayout.a {

    /* renamed from: b  reason: collision with root package name */
    protected LoadingLayout f46250b;

    /* renamed from: c  reason: collision with root package name */
    protected String f46251c = null;

    /* renamed from: d  reason: collision with root package name */
    protected Handler f46252d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseLoadingActivity.this.f46250b;
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
            LoadingLayout loadingLayout = BaseLoadingActivity.this.f46250b;
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
            LoadingLayout loadingLayout = BaseLoadingActivity.this.f46250b;
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
            LoadingLayout loadingLayout = BaseLoadingActivity.this.f46250b;
            if (loadingLayout != null) {
                loadingLayout.g();
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseLoadingActivity.this.f46250b;
            if (loadingLayout != null) {
                loadingLayout.j();
            }
        }
    }

    @Override // com.join.mgps.customview.LoadingLayout.b
    public void callBack() {
        i0();
        loadData();
    }

    public void g0() {
        Handler handler = this.f46252d;
        if (handler != null) {
            handler.post(new b());
        }
    }

    public int getLoadingLayoutResID() {
        return 0;
    }

    public int getLoadingMarginTop() {
        return c0.a(this, 48.0f);
    }

    public void h0() {
        Handler handler = this.f46252d;
        if (handler != null) {
            handler.post(new d());
        }
    }

    public void i0() {
        Handler handler = this.f46252d;
        if (handler != null) {
            handler.post(new a());
        }
    }

    public boolean isHindeLoadingLayout() {
        return this.f46250b.e();
    }

    public void j0() {
        Handler handler = this.f46252d;
        if (handler != null) {
            handler.post(new c());
        }
    }

    public void loadData() {
    }

    @Override // com.join.mgps.customview.LoadingLayout.a
    public void noDataCallBack() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Handler handler = this.f46252d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f46252d = null;
        }
        super.onDestroy();
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        LoadingLayout loadingLayout = (LoadingLayout) LayoutInflater.from(this).inflate(R.layout.layout_papa_loading, (ViewGroup) null);
        this.f46250b = loadingLayout;
        String str = this.f46251c;
        if (str != null) {
            loadingLayout.setLoadingHintMsg(str);
        }
        int loadingLayoutResID = getLoadingLayoutResID();
        if (loadingLayoutResID > 0) {
            this.f46250b.b(getWindow().getDecorView().getRootView(), loadingLayoutResID);
            this.f46250b.setRefreshCallBackListener(this);
            this.f46250b.setLoadingLayoutMarginTop(getLoadingMarginTop());
        }
        this.f46252d = new Handler(Looper.getMainLooper());
    }

    public void setLoadingFailMsg(String str) {
        this.f46250b.setFailedMessage(str);
    }

    public void setLoadingHintMsg(String str) {
        this.f46251c = str;
    }

    public void setNoDataListener() {
        this.f46250b.setNoDataCallBackListener(this);
    }

    public void setTextViewNoData(String str) {
        LoadingLayout loadingLayout = this.f46250b;
        if (loadingLayout != null) {
            loadingLayout.setTextViewNoData(str);
        }
    }

    public void setmLoadingHintMsgLoading(String str) {
        this.f46250b.setLoadingHintMsg(str);
    }

    public void showNoDataLayoutTwo() {
        Handler handler = this.f46252d;
        if (handler != null) {
            handler.post(new e());
        }
    }
}
