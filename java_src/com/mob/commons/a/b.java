package com.mob.commons.a;

import android.os.Build;
import com.mob.MobSDK;
import com.mob.commons.C0811r;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class b extends c {
    public b() {
        super(C0811r.b("0022eeeh"), 0L, C0811r.b("005=eeehdi2ci"), 86400L, c.a(C0811r.b("0022eeeh"), (Long) 0L));
    }

    private void m() {
        DH.RequestBuilder cLoc;
        DH.RequestBuilder mnbclfo = DH.requester(MobSDK.getContext()).getCarrier().getCarrierName().getMnbclfo();
        final int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 17) {
            cLoc = mnbclfo.getACIfo();
        } else {
            cLoc = mnbclfo.getCLoc();
        }
        cLoc.request(new DH.DHResponder() { // from class: com.mob.commons.a.b.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                int i5;
                HashMap<String, Object> hashMap;
                int intValue;
                long longValue;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                try {
                    i5 = Integer.parseInt(dHResponse.getCarrier());
                } catch (Throwable unused) {
                    i5 = -1;
                }
                HashMap hashMap2 = null;
                if (i4 >= 17 && dHResponse.getACIfo() != null && !dHResponse.getACIfo().isEmpty()) {
                    ArrayList<HashMap<String, Object>> aCIfo = dHResponse.getACIfo();
                    HashMap<String, Object> hashMap3 = new HashMap<>();
                    hashMap3.put("bsd", aCIfo);
                    HashMap<String, Object> hashMap4 = aCIfo.get(0);
                    HashMap hashMap5 = new HashMap();
                    if (((Integer) hashMap4.get(C0811r.b("004hBdb;ie"))).intValue() == 2) {
                        hashMap5.put(C0811r.b("0167dccbce]cYdcReff+edcj7bchAchcj'd"), 1);
                        hashMap5.put(C0811r.b("003%eechcb"), hashMap4.get(C0811r.b("004beff")));
                        hashMap5.put(C0811r.b("003 ehchcb"), hashMap4.get(C0811r.b("003 ehchcb")));
                        hashMap5.put(C0811r.b("003dTchcb"), hashMap4.get(C0811r.b("003dTchcb")));
                        hashMap5.put(C0811r.b("003fch"), hashMap4.get(C0811r.b("003fch")));
                        hashMap5.put(C0811r.b("003f2cjBd"), hashMap4.get(C0811r.b("003f2cjBd")));
                    } else {
                        hashMap5.put(C0811r.b("016NdccbceFc5dc0eff0edcjFbch<chcjUd"), -1);
                        hashMap5.put(C0811r.b("003i[ehHb"), hashMap4.get(C0811r.b("003i[ehHb")));
                        hashMap5.put(C0811r.b("003fcb"), hashMap4.get(C0811r.b("003fcb")));
                        hashMap5.put(C0811r.b("004beff"), hashMap4.get(C0811r.b("004beff")));
                    }
                    hashMap = hashMap3;
                    hashMap2 = hashMap5;
                } else if (dHResponse.getCLoc() != null) {
                    hashMap2 = (HashMap) dHResponse.getCLoc();
                    hashMap = null;
                } else {
                    hashMap = null;
                }
                if (hashMap2 != null) {
                    if (((Integer) ResHelper.forceCast(hashMap2.get(C0811r.b("016%dccbceYc.dcOeff[edcj=bchQchcj<d")), -1)).intValue() == 1) {
                        int intValue2 = ((Integer) ResHelper.forceCast(hashMap2.get(C0811r.b("003fch")), -1)).intValue();
                        longValue = -1;
                        i8 = ((Integer) ResHelper.forceCast(hashMap2.get(C0811r.b("003fNcj.d")), -1)).intValue();
                        i9 = ((Integer) ResHelper.forceCast(hashMap2.get(C0811r.b("003*eechcb")), -1)).intValue();
                        i10 = -1;
                        i7 = ((Integer) ResHelper.forceCast(hashMap2.get(C0811r.b("003.ehchcb")), -1)).intValue();
                        i11 = ((Integer) ResHelper.forceCast(hashMap2.get(C0811r.b("003dBchcb")), -1)).intValue();
                        i6 = intValue2;
                        intValue = -1;
                    } else {
                        intValue = ((Integer) ResHelper.forceCast(hashMap2.get(C0811r.b("003iJeh@b")), -1)).intValue();
                        int intValue3 = ((Integer) ResHelper.forceCast(hashMap2.get(C0811r.b("003fcb")), -1)).intValue();
                        longValue = ((Long) ResHelper.forceCast(hashMap2.get(C0811r.b("004beff")), -1L)).longValue();
                        i6 = -1;
                        i7 = -1;
                        i8 = -1;
                        i9 = -1;
                        i10 = intValue3;
                        i11 = -1;
                    }
                    if (i5 != -1 && i10 != -1 && longValue != -1) {
                        if (hashMap == null) {
                            hashMap = new HashMap<>();
                        }
                        hashMap.put(C0811r.b("003fcb"), Integer.valueOf(i10));
                        hashMap.put(C0811r.b("004beff"), Long.valueOf(longValue));
                        if (intValue != -1) {
                            hashMap.put(C0811r.b("003i9eh.b"), Integer.valueOf(intValue));
                        }
                    }
                    if (i5 != -1 && (i12 = i9) != -1 && i7 != -1 && i11 != -1) {
                        if (hashMap == null) {
                            hashMap = new HashMap<>();
                        }
                        hashMap.put(C0811r.b("003%eechcb"), Integer.valueOf(i12));
                        hashMap.put(C0811r.b("003%ehchcb"), Integer.valueOf(i7));
                        hashMap.put(C0811r.b("003d5chcb"), Integer.valueOf(i11));
                        if (i6 != -1) {
                            hashMap.put(C0811r.b("003fch"), Integer.valueOf(i6));
                        }
                        if (i8 != -1) {
                            hashMap.put(C0811r.b("003fNcjOd"), Integer.valueOf(i8));
                        }
                    }
                    if (hashMap != null) {
                        hashMap.put(C0811r.b("007bc:cicich2e<ci"), Integer.valueOf(i5));
                        hashMap.put(C0811r.b("0092ehchcecj]idcLcePe"), dHResponse.getCarrierName());
                        ArrayList<HashMap<String, Object>> mnbclfo2 = dHResponse.getMnbclfo();
                        if (mnbclfo2 != null && mnbclfo2.size() > 0) {
                            hashMap.put(C0811r.b("006decPcieedb"), mnbclfo2);
                        }
                        b.this.a("BSIOMT", hashMap, true);
                    }
                }
            }
        });
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        m();
    }
}
