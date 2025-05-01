package org.ppsspp.ppsspp;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
/* compiled from: LocationHelper.java */
/* loaded from: classes7.dex */
class e implements LocationListener {

    /* renamed from: d  reason: collision with root package name */
    private static final String f72944d = "LocationHelper";

    /* renamed from: b  reason: collision with root package name */
    private LocationManager f72945b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f72946c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context) {
        this.f72945b = (LocationManager) context.getSystemService("location");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.f72946c) {
            return;
        }
        try {
            this.f72945b.isProviderEnabled("gps");
            this.f72945b.isProviderEnabled("network");
            this.f72945b.requestLocationUpdates("gps", 1000L, 0.0f, this);
            this.f72945b.requestLocationUpdates("network", 1000L, 0.0f, this);
            this.f72946c = true;
        } catch (SecurityException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot start location updates: ");
            sb.append(e5.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f72946c) {
            this.f72946c = false;
            this.f72945b.removeUpdates(this);
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        NativeApp.pushNewGpsData((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), location.getSpeed(), location.getBearing(), location.getTime() / 1000);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i4, Bundle bundle) {
    }
}
