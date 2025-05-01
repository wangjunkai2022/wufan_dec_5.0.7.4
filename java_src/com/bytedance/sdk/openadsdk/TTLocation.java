package com.bytedance.sdk.openadsdk;
/* loaded from: classes2.dex */
public class TTLocation implements LocationProvider {

    /* renamed from: m  reason: collision with root package name */
    private double f8702m;
    private double vv;

    public TTLocation(double d5, double d6) {
        this.vv = 0.0d;
        this.f8702m = 0.0d;
        this.vv = d5;
        this.f8702m = d6;
    }

    @Override // com.bytedance.sdk.openadsdk.LocationProvider
    public double getLatitude() {
        return this.vv;
    }

    @Override // com.bytedance.sdk.openadsdk.LocationProvider
    public double getLongitude() {
        return this.f8702m;
    }

    public void setLatitude(double d5) {
        this.vv = d5;
    }

    public void setLongitude(double d5) {
        this.f8702m = d5;
    }
}
