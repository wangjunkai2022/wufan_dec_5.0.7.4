package com.aggmoread.sdk.b;

import com.aggmoread.sdk.client.AMAdDownloadConfirmListener;
import com.aggmoread.sdk.client.AMAdExtras;
import com.aggmoread.sdk.client.AMAdInterface;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class c implements AMAdInterface {

    /* renamed from: a  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.a f1930a;

    public c(com.aggmoread.sdk.z.c.a.a.c.a aVar, d dVar) {
        this.f1930a = aVar;
    }

    protected abstract Map<String, Object> a();

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public final AMAdExtras getAdExtras() {
        return new AMAdExtras(a());
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public String getID() {
        return this.f1930a.getID();
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void notifyBidFail(int i4, int i5, String str) {
        this.f1930a.a(i4, i5, str);
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void notifyBidSuccess(int i4) {
        this.f1930a.a(i4);
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void setDownloadConfirmListener(AMAdDownloadConfirmListener aMAdDownloadConfirmListener) {
        this.f1930a.a(new b(aMAdDownloadConfirmListener));
    }
}
