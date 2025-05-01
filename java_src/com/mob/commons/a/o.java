package com.mob.commons.a;

import android.text.TextUtils;
import com.mob.commons.ab;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public class o extends c {

    /* renamed from: c  reason: collision with root package name */
    private volatile long f56111c;

    /* renamed from: d  reason: collision with root package name */
    private volatile AtomicInteger f56112d;

    public o() {
        super(com.mob.commons.l.a("002?hi(i"), 0L, com.mob.commons.l.a("004.hiNiThkfl"), 300L, c.a(com.mob.commons.l.a("002?hi(i"), (Long) 0L));
        this.f56111c = 0L;
        this.f56112d = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.f56111c = System.currentTimeMillis();
        v.a(new com.mob.tools.utils.e<ArrayList<HashMap<String, Object>>>() { // from class: com.mob.commons.a.o.2
            @Override // com.mob.tools.utils.e
            public void a(ArrayList<HashMap<String, Object>> arrayList) {
                if (arrayList != null) {
                    try {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<HashMap<String, Object>> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object obj = it2.next().get(com.mob.commons.l.a("005Xhlgngngghn"));
                            if (obj != null) {
                                arrayList2.add(String.valueOf(obj));
                            }
                        }
                        Collections.sort(arrayList2);
                        String MD5 = Data.MD5(TextUtils.join("", arrayList2));
                        ab a5 = ab.a();
                        String str = ab.f56131j;
                        String b5 = a5.b(str, (String) null);
                        long currentTimeMillis = System.currentTimeMillis();
                        ab a6 = ab.a();
                        String str2 = ab.f56132k;
                        long b6 = a6.b(str2, 0L);
                        long intValue = ((Integer) o.this.a(com.mob.commons.l.a("005-hi=iTgl*fl"), (String) 7200)).intValue() * 1000;
                        if (b5 == null || !b5.equals(MD5) || currentTimeMillis - intValue >= b6) {
                            o.this.a(0L, "WLMT", (Object) arrayList, true);
                            ab.a().a(str, MD5);
                            ab.a().a(str2, currentTimeMillis);
                        }
                    } catch (Throwable th) {
                        MobLog.getInstance().w(th);
                    }
                }
            }
        });
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        Object obj = this.f56052b;
        if (obj != null && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            this.f56112d.set(0);
        }
        m();
    }

    @Override // com.mob.commons.a.c
    protected void c() {
        com.mob.tools.utils.k.a().a(getClass().getName(), new k.a() { // from class: com.mob.commons.a.o.1
            @Override // com.mob.tools.utils.k.a
            public void a() {
                if (o.this.e()) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() - o.this.f56111c;
                        long intValue = ((Integer) com.mob.commons.b.a("wsct", 300)).intValue() * 1000;
                        if (currentTimeMillis >= intValue) {
                            o.this.m();
                        } else if (o.this.f56112d.get() == 0) {
                            o.this.f56112d.getAndSet(1);
                            o oVar = new o();
                            oVar.a(Boolean.TRUE).a(true);
                            d.a().a(oVar, (intValue - currentTimeMillis) / 1000, 0);
                        }
                    } catch (Throwable th) {
                        MobLog.getInstance().d(th);
                    }
                }
            }
        });
    }
}
