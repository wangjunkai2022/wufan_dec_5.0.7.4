package com.kwad.components.core.q;
/* loaded from: classes5.dex */
public class a {
    private static volatile a SZ;
    private int PD;
    private int Ta;
    private boolean Tb;
    private boolean Tc;
    private int Td;
    private boolean Te;

    private a() {
    }

    public static a rj() {
        if (SZ == null) {
            synchronized (a.class) {
                if (SZ == null) {
                    SZ = new a();
                }
            }
        }
        return SZ;
    }

    public final void aH(int i4) {
        this.Ta = i4;
    }

    public final void aI(int i4) {
        this.Td = i4;
    }

    public final void aJ(int i4) {
        this.PD = i4;
    }

    public final void aK(boolean z4) {
        this.Tb = true;
    }

    public final void aL(boolean z4) {
        this.Tc = z4;
    }

    public final void aM(boolean z4) {
        this.Te = z4;
    }

    public final void clear() {
        this.Tc = false;
        this.Tb = false;
        this.Td = 0;
        this.Te = false;
        this.Ta = -1;
        this.PD = 0;
    }

    public final int rk() {
        return this.Ta;
    }

    public final boolean rl() {
        return this.Tb;
    }

    public final boolean rm() {
        return this.Tc;
    }

    public final boolean rn() {
        int i4 = this.Td;
        return i4 == 1 || i4 == 3;
    }

    public final int ro() {
        return this.Td;
    }

    public final boolean rp() {
        return this.Te;
    }

    public final int rq() {
        return this.PD;
    }
}
