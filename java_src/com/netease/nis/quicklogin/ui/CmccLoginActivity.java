package com.netease.nis.quicklogin.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.cmic.sso.sdk.view.LoginAuthActivity;
import com.netease.nis.quicklogin.helper.UnifyUiConfig;
import com.netease.nis.quicklogin.utils.h;
/* loaded from: classes5.dex */
public class CmccLoginActivity extends LoginAuthActivity {
    private UnifyUiConfig F;

    public void a(UnifyUiConfig unifyUiConfig) {
        this.F = unifyUiConfig;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        UnifyUiConfig unifyUiConfig = this.F;
        if (unifyUiConfig != null) {
            if (TextUtils.isEmpty(unifyUiConfig.getActivityEnterAnimation()) && TextUtils.isEmpty(this.F.getActivityExitAnimation())) {
                return;
            }
            h a5 = h.a(getApplicationContext());
            overridePendingTransition(a5.a(this.F.getActivityEnterAnimation()), a5.a(this.F.getActivityExitAnimation()));
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        try {
            UnifyUiConfig unifyUiConfig = this.F;
            if (unifyUiConfig == null || unifyUiConfig.getActivityResultCallbacks() == null) {
                return;
            }
            this.F.getActivityResultCallbacks().onActivityResult(i4, i5, intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.cmic.sso.sdk.view.LoginAuthActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        UnifyUiConfig unifyUiConfig;
        if (i4 != 4 || (unifyUiConfig = this.F) == null || unifyUiConfig.getBackPressedAvailable()) {
            return super.onKeyUp(i4, keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.cmic.sso.sdk.view.LoginAuthActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
