package com.efs.sdk.pa;
/* loaded from: classes2.dex */
public final class a implements PAANRListener {

    /* renamed from: a  reason: collision with root package name */
    private PAFactory f10637a;

    /* renamed from: b  reason: collision with root package name */
    private PATraceListener f10638b;

    public a(PAFactory pAFactory) {
        this.f10637a = pAFactory;
        this.f10638b = pAFactory.getTraceListener();
        boolean enableTracer = pAFactory.getConfigManager().enableTracer();
        PATraceListener pATraceListener = this.f10638b;
        if (pATraceListener != null) {
            pATraceListener.onCheck(enableTracer);
        }
    }

    @Override // com.efs.sdk.pa.PAANRListener
    public final void anrStack(String str) {
        if (str == null || str.length() <= 200) {
            return;
        }
        c.a(this.f10637a, "patrace", str);
        PATraceListener pATraceListener = this.f10638b;
        if (pATraceListener != null) {
            pATraceListener.onAnrTrace();
        }
    }

    @Override // com.efs.sdk.pa.PAANRListener
    public final void unexcept(Object obj) {
        PATraceListener pATraceListener = this.f10638b;
        if (pATraceListener != null) {
            pATraceListener.onUnexcept(obj);
        }
    }
}
