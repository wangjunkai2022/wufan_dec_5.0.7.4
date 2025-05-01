package com.ss.android.socialbase.downloader.network;
/* loaded from: classes5.dex */
class i {

    /* renamed from: i  reason: collision with root package name */
    private int f61244i;

    /* renamed from: m  reason: collision with root package name */
    private final int f61245m;

    /* renamed from: p  reason: collision with root package name */
    private double f61246p = -1.0d;
    private final double vv;

    public i(double d5) {
        this.vv = d5;
        this.f61245m = d5 == 0.0d ? Integer.MAX_VALUE : (int) Math.ceil(1.0d / d5);
    }

    public void vv(double d5) {
        double d6 = 1.0d - this.vv;
        int i4 = this.f61244i;
        if (i4 > this.f61245m) {
            this.f61246p = Math.exp((d6 * Math.log(this.f61246p)) + (this.vv * Math.log(d5)));
        } else if (i4 > 0) {
            double d7 = i4;
            Double.isNaN(d7);
            double d8 = i4;
            Double.isNaN(d8);
            double d9 = (d6 * d7) / (d8 + 1.0d);
            this.f61246p = Math.exp((d9 * Math.log(this.f61246p)) + ((1.0d - d9) * Math.log(d5)));
        } else {
            this.f61246p = d5;
        }
        this.f61244i++;
    }

    public double vv() {
        return this.f61246p;
    }
}
