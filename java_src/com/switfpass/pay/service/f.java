package com.switfpass.pay.service;

import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class f extends com.switfpass.pay.thread.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61777b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f61778c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.thread.h f61779d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(RequestMsg requestMsg, String str, com.switfpass.pay.thread.h hVar) {
        this.f61777b = requestMsg;
        this.f61778c = str;
        this.f61779d = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.switfpass.pay.thread.b
    /* renamed from: d */
    public OrderBena a() {
        com.switfpass.pay.thread.h hVar;
        String str;
        String unused;
        String unused2;
        String str2 = MainApplication.f61492c;
        String str3 = "token_id=" + this.f61777b.s() + "&trade_type=" + this.f61778c;
        unused = d.f61773a;
        new StringBuilder("request param-->").append(str3);
        try {
            com.switfpass.pay.thread.f d5 = com.switfpass.pay.thread.d.c().d(str2, null, null, null, str3);
            if (d5.c()) {
                int i4 = d5.f61818c;
                if (i4 == -4) {
                    hVar = this.f61779d;
                    str = "请求连接超时，请稍候再试";
                } else if (i4 == -3) {
                    hVar = this.f61779d;
                    str = "请求服务连接失败，请稍候再试";
                } else if (i4 == -1) {
                    hVar = this.f61779d;
                    str = "网络连接不可用，请检查你网络连接";
                }
                hVar.onError(str);
            } else if (Integer.valueOf(Integer.parseInt(d5.f61816a.getString("status"))).intValue() == 0) {
                OrderBena orderBena = new OrderBena();
                orderBena.f0(d5.f61816a.optString("pay_info", ""));
                return orderBena;
            } else {
                this.f61779d.onError(d5.f61816a.getString("message"));
            }
            return null;
        } catch (Exception e5) {
            unused2 = d.f61773a;
            new StringBuilder("createNativeOrder method error ").append(e5.getMessage());
            return null;
        }
    }
}
