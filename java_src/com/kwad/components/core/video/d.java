package com.kwad.components.core.video;
/* loaded from: classes5.dex */
public final class d {
    private boolean Vn = false;
    private boolean Vo = false;
    private boolean Vp = false;
    private boolean Vq = false;
    private boolean Vr = false;
    private int Vs = -1;

    public final void aN(int i4) {
        this.Vs = i4;
    }

    public final void aR(boolean z4) {
        this.Vp = z4;
    }

    public final void setAd(boolean z4) {
        this.Vo = z4;
    }

    public final void setFillXY(boolean z4) {
        this.Vr = z4;
    }

    public final void setForce(boolean z4) {
        this.Vn = z4;
    }

    public final void setHorizontalVideo(boolean z4) {
        this.Vq = z4;
    }

    public final boolean sf() {
        return this.Vs > 0;
    }

    public final int sg() {
        return this.Vs;
    }

    public final boolean sh() {
        return this.Vn;
    }

    public final boolean si() {
        return this.Vo;
    }

    public final boolean sj() {
        return this.Vp;
    }

    public final boolean sk() {
        return this.Vq;
    }

    public final boolean sl() {
        return this.Vr;
    }
}
