package com.kwad.sdk.ip.direct;
/* loaded from: classes5.dex */
public final class c implements Comparable<c> {
    private String ip;
    private boolean success;
    private int weight;
    private float aJV = -1.0f;
    private int aKb = 20;
    private int aKa = 3;
    private StringBuffer aKc = new StringBuffer();

    public c(String str) {
        this.ip = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(c cVar) {
        return (int) (this.aJV - cVar.aJV);
    }

    public final int JB() {
        return this.aKa;
    }

    public final float JC() {
        return this.aJV;
    }

    public final void bC(boolean z4) {
        this.success = z4;
    }

    public final void dB(int i4) {
        this.weight = i4;
    }

    public final String getIp() {
        return this.ip;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final boolean isSuccess() {
        return this.success;
    }

    public final void k(float f5) {
        this.aJV = f5;
    }

    public final String toString() {
        return "PingNetEntity{ip='" + this.ip + "', pingCount=" + this.aKa + ", pingWaitTime=" + this.aKb + ", pingTime='" + this.aJV + " ms', success=" + this.success + '}';
    }
}
