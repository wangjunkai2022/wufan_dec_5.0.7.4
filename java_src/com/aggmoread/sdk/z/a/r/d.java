package com.aggmoread.sdk.z.a.r;
/* loaded from: classes2.dex */
public interface d extends com.aggmoread.sdk.z.a.i.b {

    /* renamed from: a  reason: collision with root package name */
    public static final d f2415a = new a();

    /* loaded from: classes2.dex */
    static class a implements d {
        a() {
        }

        @Override // com.aggmoread.sdk.z.a.r.d
        public void a() {
            com.aggmoread.sdk.z.a.d.c("DspListenerSplash_[EMPTY]", "onAdDismissed enter");
        }

        @Override // com.aggmoread.sdk.z.a.i.b
        public void a(com.aggmoread.sdk.z.a.g.e eVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("onAdError = ");
            sb.append(eVar != null ? eVar.toString() : "empty");
            com.aggmoread.sdk.z.a.d.c("DspListenerSplash_[EMPTY]", sb.toString());
        }

        @Override // com.aggmoread.sdk.z.a.r.d
        public void e() {
            com.aggmoread.sdk.z.a.d.c("DspListenerSplash_[EMPTY]", "onAdExposure enter");
        }

        @Override // com.aggmoread.sdk.z.a.r.d
        public void onAdClicked() {
            com.aggmoread.sdk.z.a.d.c("DspListenerSplash_[EMPTY]", "onAdClicked enter");
        }

        @Override // com.aggmoread.sdk.z.a.r.d
        public void onAdShow() {
            com.aggmoread.sdk.z.a.d.c("DspListenerSplash_[EMPTY]", "onAdShow enter");
        }
    }

    void a();

    void e();

    void onAdClicked();

    void onAdShow();
}
