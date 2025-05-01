package com.beizi.fusion.d;

import android.content.Context;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.AppEventId;
import java.util.List;
/* compiled from: NativeFloatManager.java */
/* loaded from: classes2.dex */
public class p extends e {
    public p(Context context, String str, com.beizi.fusion.a aVar, long j4) {
        super(context, str, aVar, j4);
    }

    @Override // com.beizi.fusion.d.e
    protected void a() {
        AppEventId.getInstance(e.f6692a).setAppSplashRequest(this.f6705m);
        com.beizi.fusion.b.b bVar = this.f6695c;
        if (bVar != null) {
            bVar.d("9");
        }
    }

    @Override // com.beizi.fusion.d.e
    public com.beizi.fusion.work.a a(AdSpacesBean.ForwardBean forwardBean, String str, AdSpacesBean.BuyerBean buyerBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.work.a aVar) {
        str.hashCode();
        return !str.equals("FinalLink") ? aVar : new com.beizi.fusion.work.d.a(this.f6694b, this.f6697e, this.f6698f, buyerBean, forwardBean, this);
    }
}
