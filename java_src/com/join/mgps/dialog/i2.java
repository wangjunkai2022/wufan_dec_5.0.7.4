package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: UninstallCleanSuccessDialog.java */
/* loaded from: classes4.dex */
public class i2 extends Dialog {

    /* compiled from: UninstallCleanSuccessDialog.java */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i2.this.isShowing()) {
                i2.this.dismiss();
            }
        }
    }

    public i2(@NonNull Context context) {
        super(context);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_uninstall_success);
        setCanceledOnTouchOutside(false);
        getWindow().setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        new Handler().postDelayed(new a(), 1000L);
    }
}
