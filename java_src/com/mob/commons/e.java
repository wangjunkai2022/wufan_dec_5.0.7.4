package com.mob.commons;

import android.content.Context;
import android.text.TextUtils;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    static volatile String f56335a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Boolean f56336b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile String f56337c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f56338d;

    /* renamed from: e  reason: collision with root package name */
    private static HashSet<String> f56339e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private static final a f56340f = new a();

    public static String b() {
        if (a()) {
            return null;
        }
        if (TextUtils.isEmpty(f56335a)) {
            String a5 = d().a();
            if (!TextUtils.isEmpty(a5) && TextUtils.isEmpty(f56335a)) {
                f56335a = a5;
            }
        }
        return f56335a;
    }

    static /* synthetic */ a c() {
        return d();
    }

    private static a d() {
        return f56340f;
    }

    public static boolean a() {
        return !b.a();
    }

    public static String a(Context context) {
        return com.mob.tools.b.c.a(context).d().ai();
    }

    public static synchronized String a(MobProduct mobProduct) {
        synchronized (e.class) {
            HashMap<String, Object> b5 = b(mobProduct);
            if (b5 != null) {
                return (String) b5.get(NetCommunicator.KEY_DUID);
            }
            return null;
        }
    }

    public static synchronized HashMap<String, Object> b(final MobProduct mobProduct) {
        boolean z4;
        HashMap<String, Object> hashMap;
        synchronized (e.class) {
            boolean z5 = true;
            if (mobProduct != null) {
                aa.a(mobProduct);
                z4 = !f56339e.contains(mobProduct.getProductTag());
                if (z4) {
                    f56339e.add(mobProduct.getProductTag());
                }
            } else {
                z4 = false;
            }
            if (TextUtils.isEmpty(f56335a)) {
                f56335a = d().b();
            } else {
                z5 = z4;
            }
            MobLog.getInstance().d("aut pro: " + mobProduct + ", ndReg: " + z5 + ", hsReged: " + f56338d, new Object[0]);
            if (z5 || !f56338d) {
                z.f56519c.execute(new com.mob.tools.utils.i() { // from class: com.mob.commons.e.1
                    @Override // com.mob.tools.utils.i
                    protected void a() {
                        if (b.a(C0811r.b("0026cbch"))) {
                            boolean unused = e.f56338d = true;
                            if (!b.d()) {
                                int i4 = 0;
                                while (i4 < 5) {
                                    i4++;
                                    try {
                                        Thread.sleep(5000L);
                                        if (b.d()) {
                                            break;
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            if (b.d()) {
                                e.c().a(MobProduct.this, new com.mob.tools.utils.e<Void>() { // from class: com.mob.commons.e.1.1
                                    @Override // com.mob.tools.utils.e
                                    public void a(Void r12) {
                                    }
                                });
                            }
                        }
                    }
                });
            }
            if (f56336b == null) {
                String b5 = ab.a().b("key_curr_passed_duid", (String) null);
                f56337c = b5;
                if (!TextUtils.isEmpty(b5) && !b5.equals(f56335a)) {
                    f56336b = Boolean.TRUE;
                } else {
                    f56336b = Boolean.FALSE;
                }
            }
            ab.a().a("key_curr_passed_duid", f56335a);
            hashMap = new HashMap<>();
            hashMap.put(NetCommunicator.KEY_DUID, f56335a);
            hashMap.put(NetCommunicator.KEY_IS_MODIFIED, Boolean.valueOf(f56336b.booleanValue()));
            hashMap.put(NetCommunicator.KEY_DUID_PREVIOUS, f56337c);
        }
        return hashMap;
    }
}
