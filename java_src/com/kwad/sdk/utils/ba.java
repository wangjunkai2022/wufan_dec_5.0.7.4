package com.kwad.sdk.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.kwad.sdk.service.ServiceProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes5.dex */
public final class ba {
    private static Context aQQ;
    private static Map<String, j> aQR = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a extends j<com.kwad.sdk.k.a.b> {
        private static com.kwad.sdk.k.a.b aQS;

        public a(boolean z4) {
            super(z4);
        }

        @RequiresApi(api = 17)
        @SuppressLint({"BlockedPrivateApi"})
        private static int a(CellInfo cellInfo) {
            if (cellInfo == null) {
                return -1;
            }
            try {
                return ((CellSignalStrength) s.callMethod(cellInfo, "getCellSignalStrength", new Object[0])).getLevel();
            } catch (Throwable unused) {
                return -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.kwad.sdk.utils.j
        /* renamed from: de */
        public com.kwad.sdk.k.a.b cc(Context context) {
            int i4;
            int i5;
            if (!av.MT() && !((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).ab(64L)) {
                com.kwad.sdk.k.a.b bVar = aQS;
                if (bVar != null) {
                    return bVar;
                }
                CellInfo cellInfo = null;
                if (context == null || av.MT()) {
                    return null;
                }
                int i6 = Build.VERSION.SDK_INT;
                int i7 = -1;
                if (i6 < 23 || ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55587g) != -1) {
                    if (bj.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55587g) == 0) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        CellLocation cellLocation = telephonyManager.getCellLocation();
                        if (cellLocation instanceof CdmaCellLocation) {
                            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                            i5 = cdmaCellLocation.getBaseStationId();
                            i4 = cdmaCellLocation.getNetworkId();
                        } else if (cellLocation instanceof GsmCellLocation) {
                            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                            i5 = gsmCellLocation.getCid();
                            i4 = gsmCellLocation.getLac();
                        } else {
                            i4 = -1;
                            i5 = -1;
                        }
                        if (i6 >= 17) {
                            Iterator<CellInfo> it2 = telephonyManager.getAllCellInfo().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                CellInfo next = it2.next();
                                if (next != null && next.isRegistered()) {
                                    cellInfo = next;
                                    break;
                                }
                            }
                            if (cellInfo != null) {
                                i7 = a(cellInfo);
                            }
                        }
                        aQS = new com.kwad.sdk.k.a.b(i5, i4, i7);
                    }
                    return aQS;
                }
                return null;
            }
            return aQS;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b extends j<com.kwad.sdk.k.a.f> {
        public b(boolean z4) {
            super(z4);
        }

        @Nullable
        private static com.kwad.sdk.k.a.f df(Context context) {
            com.kwad.sdk.k.a.f fVar = new com.kwad.sdk.k.a.f();
            fVar.aOl = aw.cR(context);
            fVar.aOk = aw.cP(context);
            return fVar;
        }

        @Override // com.kwad.sdk.utils.j
        @Nullable
        protected final /* synthetic */ com.kwad.sdk.k.a.f cc(Context context) {
            return df(context);
        }
    }

    @Nullable
    public static com.kwad.sdk.k.a.b Lg() {
        if (Nm()) {
            return (com.kwad.sdk.k.a.b) gV("baseStationEnable");
        }
        return null;
    }

    @Nullable
    public static com.kwad.sdk.k.a.f Lh() {
        if (Nm()) {
            return (com.kwad.sdk.k.a.f) gV("simCardInfoEnable");
        }
        return null;
    }

    private static boolean Nm() {
        return aQQ != null;
    }

    @Nullable
    private static <T> j<T> gU(String str) {
        try {
            return aQR.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    private static <T> T gV(String str) {
        j gU = gU(str);
        if (gU != null) {
            return (T) gU.cb(aQQ);
        }
        return null;
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        com.kwad.sdk.service.a.h hVar = (com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class);
        if (hVar == null) {
            com.kwad.sdk.core.e.c.d("SensitiveInfoCollectors", "init sdkConfigProvider is null");
        } else if (Nm()) {
            if (aQR.containsKey("baseStationEnable")) {
                boolean zi = hVar.zi();
                j gU = gU("baseStationEnable");
                if (gU != null) {
                    gU.bQ(zi);
                }
            }
            if (aQR.containsKey("simCardInfoEnable")) {
                boolean zg = hVar.zg();
                j gU2 = gU("simCardInfoEnable");
                if (gU2 != null) {
                    gU2.bQ(zg);
                }
            }
        } else {
            aQQ = context.getApplicationContext();
            aQR.put("baseStationEnable", new a(hVar.zi()));
            aQR.put("simCardInfoEnable", new b(hVar.zg()));
        }
    }
}
