package com.switfpass.pay.utils;

import android.app.Activity;
import android.app.AlertDialog;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class b extends com.switfpass.pay.thread.h {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ d0 f61831a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61832b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(d0 d0Var, RequestMsg requestMsg) {
        this.f61831a = d0Var;
        this.f61832b = requestMsg;
    }

    @Override // com.switfpass.pay.thread.h, com.switfpass.pay.thread.e
    public final void onError(Object obj) {
        g0 g0Var;
        AlertDialog alertDialog;
        boolean z4;
        Activity activity;
        AlertDialog alertDialog2;
        g0Var = this.f61831a.f61849l;
        g0Var.dismiss();
        alertDialog = this.f61831a.f61855r;
        if (alertDialog != null) {
            alertDialog2 = this.f61831a.f61855r;
            alertDialog2.dismiss();
        }
        z4 = this.f61831a.f61856s;
        if (z4) {
            this.f61831a.f61856s = true;
            super.onError(obj);
            if (obj != null) {
                com.switfpass.pay.handle.a.b(0, 0, 1);
                activity = this.f61831a.f61839b;
                activity.runOnUiThread(new d(this, obj));
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
        activity = this.f61831a.f61839b;
        g0Var = this.f61831a.f61849l;
        h.e(activity, g0Var);
        g0Var2 = this.f61831a.f61849l;
        g0Var2.show();
    }

    @Override // com.switfpass.pay.thread.e
    public final /* synthetic */ void onSucceed(Object obj) {
        g0 g0Var;
        AlertDialog alertDialog;
        boolean z4;
        AlertDialog alertDialog2;
        OrderBena orderBena = (OrderBena) obj;
        g0Var = this.f61831a.f61849l;
        g0Var.dismiss();
        alertDialog = this.f61831a.f61855r;
        if (alertDialog != null) {
            alertDialog2 = this.f61831a.f61855r;
            alertDialog2.dismiss();
        }
        if (orderBena != null) {
            z4 = this.f61831a.f61856s;
            if (z4) {
                d0.c(this.f61831a, orderBena, this.f61832b);
                return;
            }
        }
        this.f61831a.f61856s = true;
    }
}
