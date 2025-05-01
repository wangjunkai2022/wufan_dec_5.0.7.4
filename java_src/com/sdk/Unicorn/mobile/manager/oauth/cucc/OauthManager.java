package com.sdk.Unicorn.mobile.manager.oauth.cucc;

import android.content.Context;
import com.sdk.Unicorn.base.api.CallBack;
import com.sdk.Unicorn.base.framework.bean.DataInfo;
import com.sdk.Unicorn.base.module.manager.SDKManager;
import com.sdk.a.e;
import com.sdk.a.g;
import com.sdk.b.a;
import com.sdk.o.b;
import com.sdk.x.c;
import com.sdk.x.d;
/* loaded from: classes5.dex */
public class OauthManager extends SDKManager {
    public static volatile OauthManager manager;
    public Context mContext;

    public OauthManager(Context context) {
        this.mContext = context;
    }

    public static OauthManager getInstance(Context context) {
        if (manager == null) {
            synchronized (OauthManager.class) {
                if (manager == null) {
                    manager = new OauthManager(context);
                }
            }
        }
        return manager;
    }

    public <T> void getAuthoriseCode(int i4, CallBack<T> callBack) {
        new d(this.mContext, i4, callBack).a(1);
    }

    public <T> void getMobileForCode(String str, int i4, CallBack<T> callBack) {
        e<T> a5;
        if (b.a(str).booleanValue()) {
            SDKManager.toFailed(callBack, 101001, "授权码不能为空");
            return;
        }
        d dVar = new d(this.mContext, i4, callBack);
        a.a(dVar.f60116d);
        com.sdk.y.a aVar = new com.sdk.y.a(dVar.f60116d, new c(dVar));
        if (b.a(null).booleanValue()) {
            DataInfo dataInfo = new DataInfo();
            dataInfo.putData("accessCode", str);
            a5 = aVar.a(aVar.f60067i, "/api/netm/v1.0/qhbt", dataInfo, new com.sdk.g.a(aVar), 0, g.a.POST);
        } else {
            DataInfo dataInfo2 = new DataInfo();
            dataInfo2.putData("accessCode", str);
            dataInfo2.putData("mobile", null);
            a5 = aVar.a(aVar.f60067i, "/api/netm/v1.0/qhbv", dataInfo2, new com.sdk.g.a(aVar), 0, g.a.POST);
        }
        dVar.f60118f = a5;
    }

    public <T> void getMobileForCode(String str, String str2, int i4, CallBack<T> callBack) {
        e<T> a5;
        int i5;
        String str3;
        if (b.a(str).booleanValue()) {
            i5 = 101001;
            str3 = "授权码不能为空";
        } else if (!b.a(str2).booleanValue()) {
            d dVar = new d(this.mContext, i4, callBack);
            Context context = dVar.f60116d;
            b.b(a.f59987a, "oauth cache clear", a.f59988b);
            com.sdk.j.a.a(context, "accessCode1");
            com.sdk.y.a aVar = new com.sdk.y.a(dVar.f60116d, new com.sdk.x.b(dVar));
            if (b.a(str2).booleanValue()) {
                DataInfo dataInfo = new DataInfo();
                dataInfo.putData("accessCode", str);
                a5 = aVar.a(aVar.f60067i, "/api/netm/v1.0/qhbt", dataInfo, new com.sdk.g.a(aVar), 0, g.a.POST);
            } else {
                DataInfo dataInfo2 = new DataInfo();
                dataInfo2.putData("accessCode", str);
                dataInfo2.putData("mobile", str2);
                a5 = aVar.a(aVar.f60067i, "/api/netm/v1.0/qhbv", dataInfo2, new com.sdk.g.a(aVar), 0, g.a.POST);
            }
            dVar.f60118f = a5;
            return;
        } else {
            i5 = 101002;
            str3 = "认证的手机号不能为空";
        }
        SDKManager.toFailed(callBack, i5, str3);
    }
}
