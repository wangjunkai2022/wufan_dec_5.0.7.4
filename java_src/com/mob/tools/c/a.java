package com.mob.tools.c;

import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.join.mgps.Util.h0;
import com.mob.MobSDK;
import com.mob.commons.CSCenter;
import com.mob.commons.ab;
import com.mob.commons.l;
import com.mob.tools.MobLog;
import com.mob.tools.b.c;
import com.mob.tools.b.d;
import com.mob.tools.log.NLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ThreadLocal<Boolean> f56782a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<Boolean> f56783b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ThreadLocal<Boolean> f56784c = new ThreadLocal<>();

    /* renamed from: e  reason: collision with root package name */
    private static volatile String f56786e = null;

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f56785d = Arrays.asList("bgmdl", "gmnft", "gbrd", "govsit", "govsnm", "golgu", "gocnty", "galgu", "gtmne", "gsnmd", "gpgnm", "gpnmmt", "gpvsnm", "gpvsme", "cinmnps", "ckpmsi", "gaplcn", "gpgif", "gpgiffist", "gcrtpcnm", "gscpt", "cird", "cknavbl", "ipgist", "ckua", "ubenbl", "dvenbl", "vnmt", "iwpxy", "cx", "degb", "gdtlnktpfs", "gpgiffcin", "gpgifstrg", "gtaif", "gtaifprm", "rsaciy", "gsnmdfp", "gcrie", "gcriefce", "gdvk", "gdvkfc", "godhm", "godm", "gmpfis");

    @b
    public static Object a(String str, ArrayList<Object> arrayList) {
        try {
            return b(str, arrayList);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    private static Object b(String str, ArrayList<Object> arrayList) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.mob.tools.b.a a5 = a(str);
        if ("gmpfis".equals(str)) {
            if (arrayList != null && arrayList.size() == 4) {
                return a5.b(((Boolean) arrayList.get(0)).booleanValue(), ((Integer) arrayList.get(1)).intValue(), (String) arrayList.get(2), ((Integer) arrayList.get(3)).intValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        } else if ("cird".equals(str)) {
            return Boolean.valueOf(a5.a());
        } else {
            if ("cx".equals(str)) {
                return Boolean.valueOf(a5.b());
            }
            if ("ckpd".equals(str)) {
                return Boolean.valueOf(a5.c());
            }
            if ("degb".equals(str)) {
                return Boolean.valueOf(a5.d());
            }
            if ("vnmt".equals(str)) {
                return Boolean.valueOf(a5.e());
            }
            if ("ckua".equals(str)) {
                return Boolean.valueOf(a5.f());
            }
            if ("dvenbl".equals(str)) {
                return Boolean.valueOf(a5.g());
            }
            if ("ubenbl".equals(str)) {
                return Boolean.valueOf(a5.h());
            }
            if ("iwpxy".equals(str)) {
                return Boolean.valueOf(a5.i());
            }
            if ("gavti".equals(str)) {
                return a5.j();
            }
            if ("gsimt".equals(str)) {
                return a5.a(false);
            }
            if ("gsimtfce".equals(str)) {
                if (arrayList != null && arrayList.size() == 1) {
                    return a5.a(((Boolean) arrayList.get(0)).booleanValue());
                }
                throw new Throwable("array illegal: " + arrayList);
            } else if ("gbsi".equals(str)) {
                return a5.b(false);
            } else {
                if ("gbsifce".equals(str)) {
                    if (arrayList != null && arrayList.size() == 1) {
                        return a5.b(((Boolean) arrayList.get(0)).booleanValue());
                    }
                    throw new Throwable("array illegal: " + arrayList);
                } else if ("gcrie".equals(str)) {
                    return a5.c(false);
                } else {
                    if ("gcriefce".equals(str)) {
                        if (arrayList != null && arrayList.size() == 1) {
                            return a5.c(((Boolean) arrayList.get(0)).booleanValue());
                        }
                        throw new Throwable("array illegal: " + arrayList);
                    } else if ("gcrnmfce".equals(str)) {
                        if (arrayList != null && arrayList.size() == 1) {
                            return a5.d(((Boolean) arrayList.get(0)).booleanValue());
                        }
                        throw new Throwable("array illegal: " + arrayList);
                    } else if ("gcrnm".equals(str)) {
                        return a5.d(false);
                    } else {
                        if ("gmivsn".equals(str)) {
                            return a5.k();
                        }
                        if ("bgmdl".equals(str)) {
                            return a5.l();
                        }
                        if ("gmnft".equals(str)) {
                            return a5.m();
                        }
                        if ("gbrd".equals(str)) {
                            return a5.n();
                        }
                        if ("gdvtp".equals(str)) {
                            return a5.o();
                        }
                        if ("gtecloc".equals(str)) {
                            return a5.p();
                        }
                        if ("gnbclin".equals(str)) {
                            return a5.q();
                        }
                        if ("wmcwi".equals(str)) {
                            return a5.e(false);
                        }
                        if ("wmcwifce".equals(str)) {
                            if (arrayList != null && arrayList.size() == 1) {
                                return a5.e(((Boolean) arrayList.get(0)).booleanValue());
                            }
                            throw new Throwable("array illegal: " + arrayList);
                        } else if ("govsit".equals(str)) {
                            return Integer.valueOf(a5.s());
                        } else {
                            if ("govsnm".equals(str)) {
                                return a5.t();
                            }
                            if ("golgu".equals(str)) {
                                return a5.u();
                            }
                            if ("gocnty".equals(str)) {
                                return a5.v();
                            }
                            if ("gcuin".equals(str)) {
                                return a5.w();
                            }
                            if ("gtydvin".equals(str)) {
                                return a5.x();
                            }
                            if ("gqmkn".equals(str)) {
                                return a5.y();
                            }
                            if ("gszin".equals(str)) {
                                return a5.z();
                            }
                            if ("gmrin".equals(str)) {
                                return a5.A();
                            }
                            if ("galgu".equals(str)) {
                                return a5.B();
                            }
                            if ("gscsz".equals(str)) {
                                return a5.C();
                            }
                            if ("gneyp".equals(str)) {
                                return a5.f(false);
                            }
                            if ("gneypnw".equals(str)) {
                                return a5.D();
                            }
                            if ("gneypfce".equals(str)) {
                                if (arrayList != null && arrayList.size() == 1) {
                                    return a5.f(((Boolean) arrayList.get(0)).booleanValue());
                                }
                                throw new Throwable("array illegal: " + arrayList);
                            } else if ("gnktpfs".equals(str)) {
                                return a5.E();
                            } else {
                                if ("gdtlnktpfs".equals(str)) {
                                    return a5.F();
                                }
                                if ("cknavbl".equals(str)) {
                                    return Boolean.valueOf(a5.G());
                                }
                                if ("gdntp".equals(str)) {
                                    return Integer.valueOf(a5.H());
                                }
                                if ("gtmne".equals(str)) {
                                    return a5.I();
                                }
                                if ("gflv".equals(str)) {
                                    return a5.J();
                                }
                                if ("gbsbd".equals(str)) {
                                    return a5.K();
                                }
                                if ("gbfspy".equals(str)) {
                                    return a5.L();
                                }
                                if ("gbplfo".equals(str)) {
                                    return a5.M();
                                }
                                if ("giads".equals(str)) {
                                    return a5.N();
                                }
                                if ("gia".equals(str)) {
                                    if (com.mob.commons.b.a(l.a("003fii")) && ab.a().h() != 42) {
                                        if (arrayList != null && arrayList.size() == 1) {
                                            return a5.a(((Boolean) arrayList.get(0)).booleanValue(), false);
                                        }
                                        throw new Throwable("array illegal: " + arrayList);
                                    }
                                    return new ArrayList();
                                } else if ("giafce".equals(str)) {
                                    if (com.mob.commons.b.a(l.a("003fii")) && ab.a().h() != 42) {
                                        if (arrayList != null && arrayList.size() == 2) {
                                            return a5.a(((Boolean) arrayList.get(0)).booleanValue(), ((Boolean) arrayList.get(1)).booleanValue());
                                        }
                                        throw new Throwable("array illegal: " + arrayList);
                                    }
                                    return new ArrayList();
                                } else if ("gal".equals(str)) {
                                    if (com.mob.commons.b.a(l.a("003fii")) && ab.a().h() != 42) {
                                        return a5.O();
                                    }
                                    return new ArrayList();
                                } else if ("gsl".equals(str)) {
                                    if (com.mob.commons.b.a(l.a("003fii")) && ab.a().h() != 42) {
                                        return a5.P();
                                    }
                                    return new ArrayList();
                                } else if ("glctn".equals(str)) {
                                    if (arrayList != null && arrayList.size() == 3) {
                                        return a5.a(((Integer) arrayList.get(0)).intValue(), ((Integer) arrayList.get(1)).intValue(), ((Boolean) arrayList.get(2)).booleanValue());
                                    }
                                    throw new Throwable("array illegal: " + arrayList);
                                } else if ("gstmpts".equals(str)) {
                                    if (arrayList != null && arrayList.size() == 1) {
                                        return a5.a((String) arrayList.get(0));
                                    }
                                    throw new Throwable("array illegal: " + arrayList);
                                } else if ("gdvk".equals(str)) {
                                    return a5.Q();
                                } else {
                                    if ("gdvkfc".equals(str)) {
                                        if (arrayList != null && arrayList.size() == 1) {
                                            return a5.g(((Boolean) arrayList.get(0)).booleanValue());
                                        }
                                        throw new Throwable("array illegal: " + arrayList);
                                    } else if ("ipgist".equals(str)) {
                                        if (arrayList != null && arrayList.size() == 1) {
                                            return Boolean.valueOf(a5.b((String) arrayList.get(0)));
                                        }
                                        throw new Throwable("array illegal: " + arrayList);
                                    } else if ("gscpt".equals(str)) {
                                        return a5.R();
                                    } else {
                                        if ("gsnmd".equals(str)) {
                                            return a5.S();
                                        }
                                        if ("gsnmdfp".equals(str)) {
                                            if (arrayList != null && arrayList.size() == 1) {
                                                return a5.c((String) arrayList.get(0));
                                            }
                                            throw new Throwable("array illegal: " + arrayList);
                                        } else if ("gpgnm".equals(str)) {
                                            return a5.T();
                                        } else {
                                            if ("gpnmmt".equals(str)) {
                                                return a5.U();
                                            }
                                            if ("gpnmfp".equals(str)) {
                                                if (arrayList != null && arrayList.size() == 1) {
                                                    return a5.d((String) arrayList.get(0));
                                                }
                                                throw new Throwable("array illegal: " + arrayList);
                                            } else if ("gpvsnm".equals(str)) {
                                                return Integer.valueOf(a5.V());
                                            } else {
                                                if ("gpvsme".equals(str)) {
                                                    return a5.W();
                                                }
                                                if ("cinmnps".equals(str)) {
                                                    return Boolean.valueOf(a5.X());
                                                }
                                                if ("gcrtpcnm".equals(str)) {
                                                    return a5.Y();
                                                }
                                                if ("ciafgd".equals(str)) {
                                                    return Boolean.valueOf(a5.Z());
                                                }
                                                if ("ckpmsi".equals(str)) {
                                                    if (arrayList != null && arrayList.size() == 1) {
                                                        return Boolean.valueOf(a5.e((String) arrayList.get(0)));
                                                    }
                                                    throw new Throwable("array illegal: " + arrayList);
                                                } else if ("gaplcn".equals(str)) {
                                                    return a5.aa();
                                                } else {
                                                    if ("qritsvc".equals(str)) {
                                                        if (arrayList != null && arrayList.size() == 2) {
                                                            return a5.a((Intent) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                        }
                                                        throw new Throwable("array illegal: " + arrayList);
                                                    } else if ("rsaciy".equals(str)) {
                                                        if (arrayList != null && arrayList.size() == 2) {
                                                            return a5.b((Intent) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                        }
                                                        throw new Throwable("array illegal: " + arrayList);
                                                    } else if ("gpgif".equals(str)) {
                                                        if (arrayList != null && arrayList.size() == 2) {
                                                            return a5.a(false, 0, (String) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                        }
                                                        throw new Throwable("array illegal: " + arrayList);
                                                    } else if ("gpgiffcin".equals(str)) {
                                                        if (arrayList != null && arrayList.size() == 3) {
                                                            return a5.a(((Boolean) arrayList.get(0)).booleanValue(), 0, (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
                                                        }
                                                        throw new Throwable("array illegal: " + arrayList);
                                                    } else if ("gpgifstrg".equals(str)) {
                                                        if (arrayList != null && arrayList.size() == 3) {
                                                            return a5.a(false, ((Integer) arrayList.get(0)).intValue(), (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
                                                        }
                                                        throw new Throwable("array illegal: " + arrayList);
                                                    } else if ("gpgiffist".equals(str)) {
                                                        if (arrayList != null && arrayList.size() == 4) {
                                                            return a5.a(((Boolean) arrayList.get(0)).booleanValue(), ((Integer) arrayList.get(1)).intValue(), (String) arrayList.get(2), ((Integer) arrayList.get(3)).intValue());
                                                        }
                                                        throw new Throwable("array illegal: " + arrayList);
                                                    } else if ("gdvda".equals(str)) {
                                                        return a5.ab();
                                                    } else {
                                                        if ("gdvdtnas".equals(str)) {
                                                            return a5.ac();
                                                        }
                                                        if ("galtut".equals(str)) {
                                                            return Long.valueOf(a5.ad());
                                                        }
                                                        if ("gcrup".equals(str)) {
                                                            return a5.af();
                                                        }
                                                        if ("gcifm".equals(str)) {
                                                            return a5.ag();
                                                        }
                                                        if ("godm".equals(str)) {
                                                            String ah = a5.ah();
                                                            if (TextUtils.isEmpty(f56786e)) {
                                                                f56786e = ab.a().b("key_ched_od", (String) null);
                                                            }
                                                            if (TextUtils.isEmpty(ah) || CSCenter.getInstance().invocationRecord().a()) {
                                                                return TextUtils.isEmpty(f56786e) ? ah : f56786e;
                                                            } else if (TextUtils.equals(f56786e, ah)) {
                                                                return ah;
                                                            } else {
                                                                f56786e = ah;
                                                                ab.a().a("key_ched_od", ah);
                                                                return ah;
                                                            }
                                                        } else if ("godhm".equals(str)) {
                                                            return a5.ai();
                                                        } else {
                                                            if ("galdm".equals(str)) {
                                                                return a5.aj();
                                                            }
                                                            if ("gtaif".equals(str)) {
                                                                return a5.ak();
                                                            }
                                                            if ("gtaifok".equals(str)) {
                                                                return a5.al();
                                                            }
                                                            if ("gtaifprm".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 2) {
                                                                    return a5.a((String) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                                }
                                                                throw new Throwable("array illegal: " + arrayList);
                                                            } else if ("gtaifprmfce".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 3) {
                                                                    return a5.a(((Boolean) arrayList.get(0)).booleanValue(), (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
                                                                }
                                                                throw new Throwable("array illegal: " + arrayList);
                                                            } else if ("gtbdt".equals(str)) {
                                                                return Long.valueOf(a5.am());
                                                            } else {
                                                                if ("gtscnin".equals(str)) {
                                                                    return Double.valueOf(a5.an());
                                                                }
                                                                if ("gtscnppi".equals(str)) {
                                                                    return Integer.valueOf(a5.ao());
                                                                }
                                                                if ("ishmos".equals(str)) {
                                                                    return Boolean.valueOf(a5.ap());
                                                                }
                                                                if ("gthmosv".equals(str)) {
                                                                    return a5.aq();
                                                                }
                                                                if ("gthmosdtlv".equals(str)) {
                                                                    return a5.ar();
                                                                }
                                                                if ("gthmpmst".equals(str)) {
                                                                    return Integer.valueOf(a5.as());
                                                                }
                                                                if ("gthmepmst".equals(str)) {
                                                                    return Integer.valueOf(a5.at());
                                                                }
                                                                if ("gtinnerlangmt".equals(str)) {
                                                                    return a5.au();
                                                                }
                                                                if ("gtgramgendt".equals(str)) {
                                                                    return Integer.valueOf(a5.av());
                                                                }
                                                                if ("ctedebbing".equals(str)) {
                                                                    return Boolean.valueOf(a5.aw());
                                                                }
                                                                if ("gtelcmefce".equals(str)) {
                                                                    if (arrayList != null && arrayList.size() == 4) {
                                                                        return a5.a(((Integer) arrayList.get(0)).intValue(), ((Integer) arrayList.get(1)).intValue(), ((Boolean) arrayList.get(2)).booleanValue(), ((Boolean) arrayList.get(3)).booleanValue());
                                                                    }
                                                                    throw new Throwable("array illegal: " + arrayList);
                                                                } else if ("gteacifo".equals(str)) {
                                                                    return a5.ax();
                                                                } else {
                                                                    if ("gtdm".equals(str)) {
                                                                        if (arrayList != null && arrayList.size() == 1) {
                                                                            return a5.h(((Boolean) arrayList.get(0)).booleanValue());
                                                                        }
                                                                        throw new Throwable("array illegal: " + arrayList);
                                                                    } else if ("gtlstactme".equals(str)) {
                                                                        if (arrayList != null && arrayList.size() == 1) {
                                                                            return Long.valueOf(a5.f((String) arrayList.get(0)));
                                                                        }
                                                                        throw new Throwable("array illegal: " + arrayList);
                                                                    } else {
                                                                        NLog mobLog = MobLog.getInstance();
                                                                        mobLog.d("Not found: " + str, new Object[0]);
                                                                        return null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static com.mob.tools.b.a a(String str) {
        CountDownLatch d5;
        CountDownLatch d6;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            NLog mobLog = MobLog.getInstance();
            mobLog.w("WARNING: Call in main: key = " + str);
            b();
        }
        if (!(f56782a.get() == null ? false : f56782a.get().booleanValue())) {
            if (!f56785d.contains(str) && !d.c() && (d6 = d.a(MobSDK.getContext()).d()) != null) {
                try {
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d("dhs_ivkr k: " + str + ", cdl: " + d6, new Object[0]);
                    d6.await(3500L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
        } else {
            boolean booleanValue = f56783b.get() == null ? false : f56783b.get().booleanValue();
            boolean booleanValue2 = f56784c.get() == null ? false : f56784c.get().booleanValue();
            if (booleanValue) {
                MobLog.getInstance().d("isGCFThread true", new Object[0]);
            }
            if (!booleanValue && !booleanValue2 && !d.c() && (d5 = d.a(MobSDK.getContext()).d()) != null) {
                try {
                    NLog mobLog3 = MobLog.getInstance();
                    mobLog3.d("dhs_ivkr_new k: " + str + ", cdl: " + d5, new Object[0]);
                    d5.await(3500L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        }
        return a();
    }

    private static com.mob.tools.b.a a() {
        if (d.c()) {
            return c.a(MobSDK.getContext()).e();
        }
        return c.a(MobSDK.getContext()).c();
    }

    private static void b() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null) {
                String str = "";
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (stackTraceElement != null) {
                        str = str + stackTraceElement.getClassName() + h0.f27805a + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")\n";
                    }
                }
                MobLog.getInstance().d(str, new Object[0]);
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }
}
