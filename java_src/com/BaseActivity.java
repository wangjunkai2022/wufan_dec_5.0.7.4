package com;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.common.db.DatabaseHelper;
import com.join.mgps.Util.p;
import com.join.mgps.Util.q0;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.wrapper.SystemUiHider.a;
/* loaded from: classes2.dex */
public class BaseActivity extends BaseFragmentActivity {
    c broadcasExt;
    private Handler hideHandler;
    private Runnable hideRunnable;
    private com.join.android.app.common.dialog.e loading;
    protected com.join.android.app.common.manager.b mTintManager;
    protected com.join.mgps.wrapper.SystemUiHider.a uiHider;
    private DatabaseHelper databaseHelper = null;
    private long lastClickTime = 0;
    private boolean fullScreenFlag = false;
    private Handler mHandler = new Handler();
    int fullScreenCfg = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseActivity.this.uiHider.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements a.b {
        b() {
        }

        @Override // com.join.mgps.wrapper.SystemUiHider.a.b
        public void onVisibilityChange(boolean z4) {
            if (z4) {
                BaseActivity.this.hideUiDelayed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BaseActivity.this.finish();
        }
    }

    private void clearHiderListener() {
        com.join.mgps.wrapper.SystemUiHider.a aVar = this.uiHider;
        if (aVar != null) {
            aVar.d(null);
        }
        Handler handler = this.hideHandler;
        if (handler != null) {
            handler.removeCallbacks(this.hideRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResume$0() {
        p.e(this);
    }

    @TargetApi(19)
    private void setTranslucentStatus(boolean z4) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z4) {
            attributes.flags |= TTAdConstant.KEY_CLICK_AREA;
        } else {
            attributes.flags &= -67108865;
        }
        window.setAttributes(attributes);
    }

    private void updateHider() {
        int i4;
        try {
            boolean z4 = this.fullScreenFlag;
            if (z4) {
                if (z4) {
                    i4 = 6;
                } else {
                    i4 = com.join.mgps.wrapper.a.f55010b < 11 ? 3 : 1;
                }
                this.fullScreenCfg = i4;
            } else {
                this.fullScreenCfg = 0;
            }
            if (this.fullScreenCfg != 0) {
                this.hideHandler = new Handler();
                this.hideRunnable = new a();
                com.join.mgps.wrapper.SystemUiHider.a a5 = com.join.mgps.wrapper.SystemUiHider.a.a(this, findViewById(16908290), this.fullScreenCfg);
                this.uiHider = a5;
                a5.e();
                this.uiHider.d(new b());
            }
            com.join.mgps.wrapper.SystemUiHider.a aVar = this.uiHider;
            if (aVar == null || !aVar.c()) {
                return;
            }
            this.uiHider.b();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void createDB(String str) {
        p1.e.d(this).b(str);
    }

    public void dismissLoading() {
        com.join.android.app.common.dialog.e eVar = this.loading;
        if (eVar == null) {
            return;
        }
        try {
            eVar.dismiss();
        } catch (Exception unused) {
        }
    }

    public DatabaseHelper getHelper() {
        if (this.databaseHelper == null) {
            this.databaseHelper = p1.e.d(this).c();
        }
        return this.databaseHelper;
    }

    protected void hideUiDelayed() {
        this.hideHandler.removeCallbacks(this.hideRunnable);
        if (this.fullScreenCfg != 0) {
            this.hideHandler.postDelayed(this.hideRunnable, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.broadcasExt = new c();
        IntentFilter intentFilter = new IntentFilter();
        org.androidannotations.api.c.m(this).h(this);
        intentFilter.addAction(o1.a.f72038z);
        registerReceiver(this.broadcasExt, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.broadcasExt);
        org.androidannotations.api.c.m(this).o(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        clearHiderListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!new PrefDef_(this).firstShowUserPermiss().d().booleanValue()) {
            q0.a(this);
        }
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseActivity.this.lambda$onResume$0();
            }
        }, 500L);
        org.androidannotations.api.c.m(this).r(this);
        updateHider();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        dismissLoading();
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z4) {
        com.join.mgps.wrapper.SystemUiHider.a aVar = this.uiHider;
        if (aVar != null) {
            if (z4 && this.fullScreenFlag) {
                aVar.b();
            } else {
                aVar.f();
            }
        }
        super.onWindowFocusChanged(z4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
    }

    public void setSystemUiHide(boolean z4) {
        this.fullScreenFlag = z4;
        updateHider();
        com.join.mgps.wrapper.SystemUiHider.a aVar = this.uiHider;
        if (aVar != null) {
            if (this.fullScreenFlag) {
                if (aVar.c()) {
                    this.uiHider.b();
                    return;
                }
                return;
            }
            aVar.f();
        }
    }

    public void showLoading() {
        if (this.loading == null) {
            this.loading = new com.join.android.app.common.dialog.e(this);
        }
        this.loading.show();
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
    }
}
