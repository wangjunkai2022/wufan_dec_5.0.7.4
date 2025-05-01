package com.alipay.security.mobile.module.deviceinfo;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
/* loaded from: classes2.dex */
final class g extends PhoneStateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f5030a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TelephonyManager f5031b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(f fVar, TelephonyManager telephonyManager) {
        this.f5030a = fVar;
        this.f5031b = telephonyManager;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        if (signalStrength != null) {
            this.f5030a.f5029l = signalStrength.getGsmSignalStrength();
        }
        this.f5031b.listen(this, 0);
    }
}
