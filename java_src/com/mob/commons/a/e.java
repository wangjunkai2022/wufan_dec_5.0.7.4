package com.mob.commons.a;

import android.text.TextUtils;
import com.kuaishou.weapon.p0.t;
import com.mob.MobSDK;
import com.mob.commons.ab;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes5.dex */
public class e extends c {
    public e() {
        super(t.f55685d, 0L, l.a("004h7fkGek"), 86400L, c.a(t.f55685d, (Long) 0L));
    }

    @Override // com.mob.commons.a.c
    protected void a() throws Throwable {
        long b5 = ab.a().b("key_lgwst", 0L);
        if (DH.SyncMtd.checkPermission(l.a("036ef.edekelejedemZkg.ekegejgjgjejelFfWemfeglgefhjehjeihgffhdffeifmgdgegdhj")) && DH.SyncMtd.checkPermission(l.a("036efNedekelejedemZkg^ekegejgjgjejelHf9emgefefehjfmfmeihgffhdffeifmgdgegdhj")) && System.currentTimeMillis() - b5 >= 1800000) {
            v.a(new com.mob.tools.utils.e<ArrayList<HashMap<String, Object>>>() { // from class: com.mob.commons.a.e.1
                @Override // com.mob.tools.utils.e
                public void a(ArrayList<HashMap<String, Object>> arrayList) {
                    ab.a().a("key_lgwst", System.currentTimeMillis());
                    e.this.a(arrayList);
                }
            });
        } else {
            a((ArrayList<HashMap<String, Object>>) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<HashMap<String, Object>> arrayList) {
        try {
            a(arrayList, 2);
            a(arrayList, 1);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }

    private void a(final ArrayList<HashMap<String, Object>> arrayList, final int i4) {
        DH.RequestBuilder mbcdi = DH.requester(MobSDK.getContext()).getMcdi().getMbcdi();
        if (i4 == 1) {
            mbcdi.getPosCommForce(30, 0, true, false);
        } else {
            mbcdi.getPosCommForce(0, 15, true, false);
        }
        mbcdi.request(new DH.DHResponder() { // from class: com.mob.commons.a.e.2
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                List posCommForce = dHResponse.getPosCommForce(new int[0]);
                if (posCommForce == null || posCommForce.isEmpty()) {
                    return;
                }
                List<HashMap<String, Object>> a5 = e.this.a(posCommForce);
                if (a5 != null && !a5.isEmpty()) {
                    for (HashMap<String, Object> hashMap : a5) {
                        if (hashMap != null && !hashMap.isEmpty()) {
                            e.this.a(hashMap, hashMap);
                            String mcdi = dHResponse.getMcdi();
                            String mbcdi2 = dHResponse.getMbcdi();
                            if (!TextUtils.isEmpty(mbcdi2)) {
                                hashMap.put("cbsmt", mbcdi2);
                            }
                            if (!TextUtils.isEmpty(mcdi)) {
                                hashMap.put("cssmt", mcdi);
                            }
                            if (e.this.g()) {
                                hashMap.put("pt", 1);
                            } else {
                                hashMap.put("pt", 2);
                            }
                            hashMap.put("lctpmt", Integer.valueOf(i4));
                            ArrayList arrayList2 = arrayList;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                hashMap.put("wilmt", arrayList);
                            }
                            e.this.a("LCMT", hashMap);
                        }
                    }
                }
                if (i4 == 1) {
                    com.mob.tools.utils.f.a().a(posCommForce.get(posCommForce.size() - 1));
                }
            }
        });
    }
}
