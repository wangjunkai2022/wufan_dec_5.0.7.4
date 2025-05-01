package com.mob.commons.a;

import com.mob.MobSDK;
import com.mob.commons.ab;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class h extends c {
    public h() {
        super(null, null, c.a(com.mob.commons.l.a("003fii"), (Long) 0L));
    }

    private boolean m() {
        return com.mob.commons.b.a(com.mob.commons.l.a("003fii"));
    }

    private boolean n() {
        return com.mob.commons.b.a(com.mob.commons.l.a("002%fk,g"));
    }

    private boolean o() {
        return com.mob.commons.b.a(com.mob.commons.l.a("0023fiRg"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mob.commons.a.c
    public boolean e() {
        return m() && f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mob.commons.a.c
    public long l() {
        try {
            Calendar calendar = Calendar.getInstance();
            long timeInMillis = calendar.getTimeInMillis();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            calendar.setTime(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
            calendar.add(5, 1);
            long timeInMillis2 = (calendar.getTimeInMillis() - timeInMillis) + new SecureRandom().nextInt(240000);
            return (timeInMillis2 / 1000) + (timeInMillis2 % 1000 == 0 ? 0 : 1);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return 0L;
        }
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        if (m()) {
            if (!n()) {
                o();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = ((Long) a(com.mob.commons.l.a("004f[hk[lf"), (String) 2592000L)).longValue() * 1000;
            long b5 = ab.a().b(ab.f56124c, 0L);
            boolean a5 = v.a(currentTimeMillis, b5);
            Object obj = this.f56052b;
            final boolean z4 = true;
            boolean z5 = obj != null && (obj instanceof Boolean) && ((Boolean) obj).booleanValue();
            if (currentTimeMillis - longValue < b5 && a5) {
                z4 = false;
            }
            if (z4 || z5) {
                DH.requester(MobSDK.getContext()).getIAForce(false, z5).request(new DH.DHResponder() { // from class: com.mob.commons.a.h.1
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        ArrayList<HashMap<String, String>> iAForce = dHResponse.getIAForce(new int[0]);
                        if (iAForce == null || iAForce.isEmpty() || !z4) {
                            return;
                        }
                        h.this.a(iAForce);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<HashMap<String, String>> arrayList) {
        a(((Long) a(com.mob.commons.l.a("004fGfeQih"), (String) 0L)).longValue(), "ALSAMT", arrayList);
        ab.a().a(ab.f56124c, System.currentTimeMillis());
    }
}
