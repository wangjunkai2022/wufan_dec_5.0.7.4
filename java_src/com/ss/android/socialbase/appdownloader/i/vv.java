package com.ss.android.socialbase.appdownloader.i;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.socialbase.appdownloader.p.b;
import com.ss.android.socialbase.appdownloader.p.jh;
/* loaded from: classes5.dex */
public class vv extends com.ss.android.socialbase.appdownloader.p.m {
    private AlertDialog.Builder vv;

    /* renamed from: com.ss.android.socialbase.appdownloader.i.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static class C0623vv implements b {
        private AlertDialog vv;

        public C0623vv(AlertDialog.Builder builder) {
            if (builder != null) {
                this.vv = builder.show();
            }
        }

        @Override // com.ss.android.socialbase.appdownloader.p.b
        public boolean m() {
            AlertDialog alertDialog = this.vv;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // com.ss.android.socialbase.appdownloader.p.b
        public void vv() {
            AlertDialog alertDialog = this.vv;
            if (alertDialog != null) {
                alertDialog.show();
            }
        }
    }

    public vv(Context context) {
        this.vv = new AlertDialog.Builder(context);
    }

    @Override // com.ss.android.socialbase.appdownloader.p.jh
    public jh m(int i4, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = this.vv;
        if (builder != null) {
            builder.setNegativeButton(i4, onClickListener);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.p.jh
    public jh vv(int i4) {
        AlertDialog.Builder builder = this.vv;
        if (builder != null) {
            builder.setTitle(i4);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.p.jh
    public jh vv(String str) {
        AlertDialog.Builder builder = this.vv;
        if (builder != null) {
            builder.setMessage(str);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.p.jh
    public jh vv(int i4, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = this.vv;
        if (builder != null) {
            builder.setPositiveButton(i4, onClickListener);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.p.jh
    public jh vv(DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = this.vv;
        if (builder != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.p.jh
    public b vv() {
        return new C0623vv(this.vv);
    }
}
