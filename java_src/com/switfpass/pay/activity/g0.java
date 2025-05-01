package com.switfpass.pay.activity;

import android.view.View;
import com.switfpass.pay.bean.OrderBena;
/* loaded from: classes5.dex */
final class g0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ PayResultActivity f61567b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(PayResultActivity payResultActivity) {
        this.f61567b = payResultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OrderBena orderBena;
        OrderBena orderBena2;
        orderBena = this.f61567b.f61526g;
        if (orderBena != null) {
            orderBena2 = this.f61567b.f61526g;
            if (orderBena2.B()) {
                com.switfpass.pay.handle.a.b(6, 7, "支付状态：该笔订单已支付");
                this.f61567b.finish();
            }
        }
        com.switfpass.pay.handle.a.a(0, 0);
        this.f61567b.finish();
    }
}
