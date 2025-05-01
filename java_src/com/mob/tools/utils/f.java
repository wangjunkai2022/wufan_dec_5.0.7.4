package com.mob.tools.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.GnssStatus;
import android.os.Build;
import android.os.Handler;
import com.mob.MobSDK;
import com.mob.commons.CSCenter;
import com.mob.commons.l;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ReflectHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@SuppressLint({"MissingPermission"})
/* loaded from: classes5.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static f f57034a;

    /* renamed from: d  reason: collision with root package name */
    private volatile Object f57037d;

    /* renamed from: f  reason: collision with root package name */
    private volatile Class<?> f57039f;

    /* renamed from: g  reason: collision with root package name */
    private long f57040g;

    /* renamed from: h  reason: collision with root package name */
    private a f57041h;

    /* renamed from: i  reason: collision with root package name */
    private volatile Object f57042i;

    /* renamed from: b  reason: collision with root package name */
    private volatile List f57035b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private volatile List f57036c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f57038e = f();

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    private f() {
    }

    private Object f() {
        HashMap hashMap = new HashMap();
        final int identityHashCode = System.identityHashCode(hashMap);
        try {
            hashMap.put(l.a("0178fm^g5hgfm'efkCfkfm$gLgfXjfg]glLh?fe"), new ReflectHelper.a<Object[], Object>() { // from class: com.mob.tools.utils.f.5
                @Override // com.mob.tools.utils.ReflectHelper.a
                public Object a(Object[] objArr) {
                    if (objArr != null) {
                        try {
                            if (objArr.length > 0) {
                                NLog mobLog = MobLog.getInstance();
                                mobLog.d("[212] oncge" + objArr[0], new Object[0]);
                                if (objArr[0] instanceof List) {
                                    f.this.f57036c.addAll((List) objArr[0]);
                                } else {
                                    f.this.f57036c.add(objArr[0]);
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                MobLog.getInstance().d(th);
                                synchronized (f.this) {
                                    notifyAll();
                                    return null;
                                }
                            } catch (Throwable th2) {
                                synchronized (f.this) {
                                    notifyAll();
                                    throw th2;
                                }
                            }
                        }
                    }
                    f.this.i();
                    synchronized (f.this) {
                        notifyAll();
                    }
                    return null;
                }
            });
            hashMap.put("equals", new ReflectHelper.a<Object[], Object>() { // from class: com.mob.tools.utils.f.6
                @Override // com.mob.tools.utils.ReflectHelper.a
                public Object a(Object[] objArr) {
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d("equals " + objArr, new Object[0]);
                    if (objArr == null || objArr[0] == null) {
                        return Boolean.FALSE;
                    }
                    return Boolean.valueOf(objArr[0].hashCode() == identityHashCode);
                }
            });
            hashMap.put(l.a("008jf*hk(jEgffmfeCh"), new ReflectHelper.a<Object[], Object>() { // from class: com.mob.tools.utils.f.7
                @Override // com.mob.tools.utils.ReflectHelper.a
                public Object a(Object[] objArr) {
                    MobLog.getInstance().d(l.a("008jfRhk%jFgffmfe,h"), new Object[0]);
                    return Integer.valueOf(identityHashCode);
                }
            });
            return ReflectHelper.createProxy((Map<String, ReflectHelper.a<Object[], Object>>) hashMap, j());
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    private GnssStatus.Callback g() {
        if (Build.VERSION.SDK_INT >= 31) {
            return new GnssStatus.Callback() { // from class: com.mob.tools.utils.f.8
                @Override // android.location.GnssStatus.Callback
                public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
                    super.onSatelliteStatusChanged(gnssStatus);
                    f.this.h();
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            a aVar = this.f57041h;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th, "%s", "[cl]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f57038e != null) {
            ReflectHelper.invokeInstanceMethod(this.f57037d, l.a("013]fl2hHfhfmff6hDgmIl3feUfkh(hk"), new Object[]{this.f57038e}, new Class[]{j()}, null);
        }
    }

    private Class<?> j() {
        if (this.f57039f == null) {
            try {
                this.f57039f = Class.forName(l.a("033fg feflfmfkfefn1i:fm3efk^fkfm'gUfnhgfmQefk$fkfm gKhgfkhk5khgh6fl"));
            } catch (Throwable unused) {
            }
        }
        return this.f57039f;
    }

    public static f a() {
        if (f57034a == null) {
            synchronized (f.class) {
                if (f57034a == null) {
                    f57034a = new f();
                }
            }
        }
        return f57034a;
    }

    private Object b(String str) {
        if (Build.VERSION.SDK_INT <= 25) {
            return com.mob.tools.b.e.a(MobSDK.getContext()).b(str);
        }
        try {
            return com.mob.tools.b.h.a(MobSDK.getContext(), str);
        } catch (Throwable unused) {
            return com.mob.tools.b.e.a(MobSDK.getContext()).b(str);
        }
    }

    private void d() {
        if (com.mob.commons.d.g()) {
            try {
                if (DH.SyncMtd.checkPermission(l.a("039fgGfeflfmfkfefnUlhPflfhfkhkhkfkfmNgOfnhfgfgfikgngnfjiegggiikfjhgijgfhfheggijgi"))) {
                    if (this.f57037d == null) {
                        this.f57037d = DH.SyncMtd.getSystemServiceSafe(l.a("008iVfmLefkEfkfmTg"));
                    }
                    if (this.f57037d == null) {
                        return;
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 < 31 && MobSDK.getContext().getApplicationInfo().targetSdkVersion < 31) {
                        com.mob.commons.a.l.a().b().post(new Runnable() { // from class: com.mob.tools.utils.f.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    Object obj = f.this.f57037d;
                                    String a5 = l.a("020f-fefekfUlJhkgnDkfk;fihkhgfkhk_khghAfl");
                                    Object[] objArr = {f.this.e()};
                                    ReflectHelper.invokeInstanceMethod(obj, a5, objArr, new Class[]{Class.forName(l.a("026fgIfeflfmfkfefnPi(fmPefkWfkfm.g%fnkfJl4hkgn2kfk;fihk") + "$" + l.a("008[hgfkhk9khgh[fl"))});
                                    MobLog.getInstance().d("[212] rg < 31", new Object[0]);
                                } catch (Throwable th) {
                                    MobLog.getInstance().d(th, "%s", "[cl]");
                                }
                            }
                        });
                    } else if (i4 >= 31) {
                        ReflectHelper.invokeInstanceMethod(this.f57037d, l.a("0262flPh.glfkhk%kh flkf^g2hkhkgnHkfk@fihkgfRfii,hhKfeEgj"), new Object[]{g(), com.mob.commons.a.l.a().b()}, new Class[]{GnssStatus.Callback.class, Handler.class});
                        MobLog.getInstance().d("[212] rg >= 31", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th, "%s", "[212]");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object e() throws Throwable {
        HashMap hashMap = new HashMap();
        final int identityHashCode = System.identityHashCode(hashMap);
        hashMap.put(l.a("018QfmBg(kf>l hkgnWkfkLfihkgf$jfgOgl3h2fe"), new ReflectHelper.a<Object[], Object>() { // from class: com.mob.tools.utils.f.2
            @Override // com.mob.tools.utils.ReflectHelper.a
            public Object a(Object[] objArr) {
                if (objArr == null || ((Integer) objArr[0]).intValue() != 4) {
                    return null;
                }
                f.this.h();
                return null;
            }
        });
        hashMap.put("equals", new ReflectHelper.a<Object[], Object>() { // from class: com.mob.tools.utils.f.3
            @Override // com.mob.tools.utils.ReflectHelper.a
            public Object a(Object[] objArr) {
                if (objArr != null) {
                    if (objArr[0] != null) {
                        return Boolean.valueOf(objArr[0].hashCode() == identityHashCode);
                    }
                }
                return Boolean.FALSE;
            }
        });
        hashMap.put(l.a("008jf+hkEj_gffmfeRh"), new ReflectHelper.a<Object[], Object>() { // from class: com.mob.tools.utils.f.4
            @Override // com.mob.tools.utils.ReflectHelper.a
            public Object a(Object[] objArr) {
                return Integer.valueOf(identityHashCode);
            }
        });
        return ReflectHelper.createProxy((Map<String, ReflectHelper.a<Object[], Object>>) hashMap, Class.forName(l.a("026fg8feflfmfkfefnWi^fm5efkLfkfm)g1fnkfDlBhkgn_kfk*fihk") + "$" + l.a("008^hgfkhk'khghMfl")));
    }

    public Object c() {
        return b(l.a("003WglSlPhk"));
    }

    private void b(Context context, String str, long j4) {
        if (com.mob.commons.d.e()) {
            try {
                com.mob.tools.b.e.a(context).a(str, 1000L, 0.0f, this.f57038e);
                wait(j4);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
            i();
        }
    }

    public void a(a aVar) {
        this.f57041h = aVar;
        d();
    }

    public List a(Context context, int i4, int i5, boolean z4, boolean z5) {
        ArrayList arrayList = new ArrayList();
        if (CSCenter.getInstance().isLocationDataEnable()) {
            arrayList.addAll(a(z5));
            if (arrayList.isEmpty()) {
                synchronized (f.class) {
                    arrayList.addAll(a(z5));
                    if (arrayList.isEmpty()) {
                        arrayList.addAll(a(context, i4, i5, z4));
                    }
                }
            }
        } else {
            arrayList.add(CSCenter.getInstance().getLocation());
        }
        return arrayList;
    }

    public Object b() {
        return this.f57042i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[Catch: all -> 0x0121, TryCatch #2 {all -> 0x0121, blocks: (B:3:0x0005, B:5:0x0013, B:11:0x0025, B:13:0x0029, B:14:0x0035, B:18:0x003b, B:39:0x0085, B:42:0x008f, B:44:0x009b, B:45:0x00a0, B:47:0x00a8, B:49:0x00b4, B:50:0x00b9, B:52:0x00c1, B:54:0x00c9, B:55:0x00ce, B:57:0x00d6, B:58:0x00dc, B:60:0x00e2, B:62:0x00e8, B:63:0x0115, B:23:0x0043, B:25:0x0051, B:32:0x0067, B:34:0x0075, B:35:0x0081), top: B:68:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b A[Catch: all -> 0x0121, TryCatch #2 {all -> 0x0121, blocks: (B:3:0x0005, B:5:0x0013, B:11:0x0025, B:13:0x0029, B:14:0x0035, B:18:0x003b, B:39:0x0085, B:42:0x008f, B:44:0x009b, B:45:0x00a0, B:47:0x00a8, B:49:0x00b4, B:50:0x00b9, B:52:0x00c1, B:54:0x00c9, B:55:0x00ce, B:57:0x00d6, B:58:0x00dc, B:60:0x00e2, B:62:0x00e8, B:63:0x0115, B:23:0x0043, B:25:0x0051, B:32:0x0067, B:34:0x0075, B:35:0x0081), top: B:68:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6 A[Catch: all -> 0x0121, TryCatch #2 {all -> 0x0121, blocks: (B:3:0x0005, B:5:0x0013, B:11:0x0025, B:13:0x0029, B:14:0x0035, B:18:0x003b, B:39:0x0085, B:42:0x008f, B:44:0x009b, B:45:0x00a0, B:47:0x00a8, B:49:0x00b4, B:50:0x00b9, B:52:0x00c1, B:54:0x00c9, B:55:0x00ce, B:57:0x00d6, B:58:0x00dc, B:60:0x00e2, B:62:0x00e8, B:63:0x0115, B:23:0x0043, B:25:0x0051, B:32:0x0067, B:34:0x0075, B:35:0x0081), top: B:68:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List a(android.content.Context r7, int r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.f.a(android.content.Context, int, int, boolean):java.util.List");
    }

    private void a(Context context, String str, long j4) {
        if (Build.VERSION.SDK_INT <= 25) {
            b(context, str, j4);
            return;
        }
        try {
            Object a5 = com.mob.tools.b.h.a(context, str, j4);
            if (a5 != null) {
                this.f57036c.add(a5);
            }
        } catch (Throwable th) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d("[212] cur err " + th, new Object[0]);
            b(context, str, j4);
        }
    }

    private boolean a(Object obj, String str) {
        return com.mob.commons.d.e() && ((Boolean) ReflectHelper.invokeInstanceMethodNoThrow(obj, l.a("017<fkhkinflfmfffkfeIhKflik6gf3hhLihKfe"), Boolean.FALSE, str)).booleanValue();
    }

    private List a(boolean z4) {
        ArrayList arrayList = new ArrayList();
        if (!z4) {
            try {
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
            if (!this.f57035b.isEmpty() && System.currentTimeMillis() - this.f57040g <= 180000) {
                for (Object obj : this.f57035b) {
                    if (obj != null) {
                        arrayList.add(ReflectHelper.newInstance(ReflectHelper.importClass(l.a("025fg)feflfmfkfefn8iBfmUefkTfkfmBg*fnhgfm;efk]fkfm!g")), obj));
                    }
                }
                return arrayList;
            }
        }
        this.f57035b.clear();
        return arrayList;
    }

    public void a(Object obj) {
        if (obj != null) {
            this.f57042i = obj;
        }
    }

    public boolean a(String str) {
        return (l.a("003SglMl>hk").equalsIgnoreCase(str) && DH.SyncMtd.checkPermission(l.a("039fg*feflfmfkfefnTlh+flfhfkhkhkfkfm=gDfnhfgfgfikgngnfjiegggiikfjhgijgfhfheggijgi"))) || (l.a("007ghkVhifmflgj").equalsIgnoreCase(str) && DH.SyncMtd.checkPermission(l.a("039fgQfeflfmfkfefnZlhBflfhfkhkhkfkfm gWfnhfgfgfikgngnfjiegggiikfjhgijgfhfheggijgi"))) || ((l.a("007ghk(hifmflgj").equalsIgnoreCase(str) && DH.SyncMtd.checkPermission(l.a("041fgDfeflfmfkfefnSlhSflfhfkhkhkfkfm_gIfnhfgfgfikgngnfjgfijhfilgnikfjhgijgfhfheggijgi"))) || (("passive".equalsIgnoreCase(str) && DH.SyncMtd.checkPermission(l.a("039fgEfeflfmfkfefn:lhHflfhfkhkhkfkfmSg:fnhfgfgfikgngnfjiegggiikfjhgijgfhfheggijgi"))) || ("passive".equalsIgnoreCase(str) && DH.SyncMtd.checkPermission(l.a("041fg'feflfmfkfefnWlhXflfhfkhkhkfkfm8gFfnhfgfgfikgngnfjgfijhfilgnikfjhgijgfhfheggijgi")))));
    }
}
