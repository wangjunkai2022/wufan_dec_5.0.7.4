package com.switfpass.pay.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
/* loaded from: classes5.dex */
public class BasePayActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    protected ProgressDialog f61516b = null;

    public void a() {
        try {
            ProgressDialog progressDialog = this.f61516b;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f61516b.dismiss();
            this.f61516b.cancel();
            this.f61516b = null;
        } catch (Exception e5) {
            new StringBuilder("dismissMyLoading ").append(e5);
        }
    }

    public void b(boolean z4, String str, Context context) {
        if (z4) {
            try {
                if (this.f61516b == null) {
                    ProgressDialog progressDialog = new ProgressDialog(context);
                    this.f61516b = progressDialog;
                    progressDialog.setCancelable(z4);
                }
                this.f61516b.setMessage(str);
                this.f61516b.show();
            } catch (Exception e5) {
                new StringBuilder("showNewLoading ").append(e5);
            }
        }
    }

    protected void c(int i4) {
        runOnUiThread(new z(this, i4));
    }

    protected void d(String str) {
        runOnUiThread(new a0(this, str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
    }
}
