package com.mob.commons.a;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.C0811r;
import com.mob.commons.ab;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class i extends c {
    public i() {
        super(C0811r.b("003Uehdbeh"), 0L, C0811r.b("0069ehdbehdiRci"), 2592000L, c.a(C0811r.b("003Uehdbeh"), (Long) 0L));
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        DH.requester(MobSDK.getContext()).getSA().request(new DH.DHResponder() { // from class: com.mob.commons.a.i.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                boolean z4;
                ArrayList<HashMap<String, String>> sa = dHResponse.getSA();
                if (sa == null || sa.isEmpty()) {
                    return;
                }
                long b5 = ab.a().b(ab.f56125d, 0L);
                long currentTimeMillis = System.currentTimeMillis();
                boolean z5 = currentTimeMillis - (i.this.l() * 1000) >= b5;
                if (!z5) {
                    ArrayList<HashMap<String, String>> readArrayListFromFile = ResHelper.readArrayListFromFile(com.mob.commons.m.f56417e, true);
                    Iterator<HashMap<String, String>> it2 = sa.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str = it2.next().get(C0811r.b("003iXdgdi"));
                        if (!TextUtils.isEmpty(str)) {
                            Iterator<HashMap<String, String>> it3 = readArrayListFromFile.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z4 = false;
                                    break;
                                } else if (str.equals(it3.next().get(C0811r.b("003i>dgdi")))) {
                                    z4 = true;
                                    break;
                                }
                            }
                            if (!z4) {
                                z5 = true;
                                break;
                            }
                        }
                    }
                }
                if (z5) {
                    i.this.a(0L, "SALMT", sa);
                    ResHelper.saveArrayListToFile(sa, com.mob.commons.m.f56417e, true);
                    ab.a().a(ab.f56125d, currentTimeMillis);
                }
            }
        });
    }
}
