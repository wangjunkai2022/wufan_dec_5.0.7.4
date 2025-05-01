package com.switfpass.pay.utils;

import android.app.Activity;
import android.app.AlertDialog;
import com.switfpass.pay.activity.QrcodeActivity;
import com.switfpass.pay.bean.OrderBena;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class l0 extends com.switfpass.pay.thread.h {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ d0 f61918a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(d0 d0Var) {
        this.f61918a = d0Var;
    }

    @Override // com.switfpass.pay.thread.h, com.switfpass.pay.thread.e
    public final void onError(Object obj) {
        g0 g0Var;
        AlertDialog alertDialog;
        boolean z4;
        Activity activity;
        AlertDialog alertDialog2;
        g0Var = this.f61918a.f61849l;
        g0Var.dismiss();
        alertDialog = this.f61918a.f61855r;
        if (alertDialog != null) {
            alertDialog2 = this.f61918a.f61855r;
            alertDialog2.dismiss();
        }
        super.onError(obj);
        z4 = this.f61918a.f61856s;
        if (z4) {
            this.f61918a.f61856s = true;
            if (obj != null) {
                com.switfpass.pay.handle.a.b(0, 0, 1);
                activity = this.f61918a.f61839b;
                activity.runOnUiThread(new n0(this, obj));
            }
        }
    }

    @Override // com.switfpass.pay.thread.e
    public final void onPostExecute() {
        super.onPostExecute();
    }

    @Override // com.switfpass.pay.thread.e
    public final void onPreExecute() {
        Activity activity;
        g0 g0Var;
        g0 g0Var2;
        super.onPreExecute();
        activity = this.f61918a.f61839b;
        g0Var = this.f61918a.f61849l;
        h.e(activity, g0Var);
        g0Var2 = this.f61918a.f61849l;
        g0Var2.show();
    }

    @Override // com.switfpass.pay.thread.e
    public final /* synthetic */ void onSucceed(Object obj) {
        g0 g0Var;
        AlertDialog alertDialog;
        boolean z4;
        Activity activity;
        AlertDialog alertDialog2;
        OrderBena orderBena = (OrderBena) obj;
        g0Var = this.f61918a.f61849l;
        g0Var.dismiss();
        if (orderBena != null) {
            alertDialog = this.f61918a.f61855r;
            if (alertDialog != null) {
                alertDialog2 = this.f61918a.f61855r;
                alertDialog2.dismiss();
            }
            z4 = this.f61918a.f61856s;
            if (!z4) {
                this.f61918a.f61856s = true;
                return;
            }
            activity = this.f61918a.f61839b;
            QrcodeActivity.startActivity(orderBena, activity);
        }
    }
}
