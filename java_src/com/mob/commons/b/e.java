package com.mob.commons.b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static h f56184a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mob.commons.b.e$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f56187a;

        static {
            int[] iArr = new int[a.values().length];
            f56187a = iArr;
            try {
                iArr[a.XIAOMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56187a[a.REDMI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56187a[a.MEITU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56187a[a.BLACKSHARK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56187a[a.VIVO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56187a[a.HUA_WEI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56187a[a.HORNOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56187a[a.OPPO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56187a[a.REALME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f56187a[a.ONEPLUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f56187a[a.MOTO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f56187a[a.ZUK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f56187a[a.LENOVO.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f56187a[a.ASUS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f56187a[a.SAMSUNG.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f56187a[a.MEIZU.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f56187a[a.MBLU.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f56187a[a.ALPS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f56187a[a.NUBIA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f56187a[a.ZTE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f56187a[a.FERRMEOS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f56187a[a.SSUI.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f56187a[a.COOLPAD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f56187a[a.QIKU.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f56187a[a.COOSEA.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
        }
    }

    public static synchronized void a(Context context) {
        synchronized (e.class) {
            if (f56184a != null) {
                return;
            }
            a a5 = a(context, Build.MANUFACTURER, Build.BRAND);
            if (a5 == a.UNSUPPORT) {
                return;
            }
            switch (AnonymousClass2.f56187a[a5.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    f56184a = new q(context);
                    break;
                case 5:
                    f56184a = new p(context);
                    break;
                case 6:
                    f56184a = new g(context);
                    break;
                case 7:
                    f56184a = new f(context);
                    break;
                case 8:
                case 9:
                    f56184a = new m(context);
                    break;
                case 10:
                    f56184a = new l(context);
                    break;
                case 11:
                case 12:
                case 13:
                    f56184a = new j(context);
                    break;
                case 14:
                    f56184a = new com.mob.commons.b.a(context);
                    break;
                case 15:
                    f56184a = new o(context);
                    break;
                case 16:
                case 17:
                case 18:
                    f56184a = new i(context);
                    break;
                case 19:
                    f56184a = new k(context);
                    break;
                case 20:
                case 21:
                case 22:
                    f56184a = new r(context);
                    break;
                case 23:
                    f56184a = new b(context);
                    break;
                case 24:
                    f56184a = new n(context);
                    break;
                case 25:
                    f56184a = new c(context);
                    break;
            }
        }
    }

    public static String b(Context context) {
        a(context);
        h hVar = f56184a;
        if (hVar != null) {
            if (hVar instanceof f) {
                String d5 = hVar.d();
                if (!TextUtils.isEmpty(d5) && !Pattern.compile("^[0fF\\-]+").matcher(d5).matches()) {
                    return d5;
                }
                f56184a = new g(context);
            } else if (hVar instanceof l) {
                String d6 = hVar.d();
                if (!TextUtils.isEmpty(d6) && !Pattern.compile("^[0fF\\-]+").matcher(d6).matches()) {
                    return d6;
                }
                f56184a = new m(context);
            }
            return f56184a.d();
        }
        return null;
    }

    private static boolean c(Context context) {
        try {
            final Object[] objArr = new Object[1];
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            DH.requester(context).getMpfo(com.mob.commons.l.a("027eMfmfhfnJe0fmfmPilfHfefnfe$h.fffk ehXfkfehkfiMllNfmflXk"), 0).request(new DH.DHResponder() { // from class: com.mob.commons.b.e.1
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) throws Throwable {
                    objArr[0] = dHResponse.getMpfo(new int[0]);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(3L, TimeUnit.SECONDS);
            return objArr[0] != null;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum a {
        UNSUPPORT(-1, com.mob.commons.l.a("009@fi[g'hkfiJll.fmflPk")),
        HUA_WEI(0, com.mob.commons.l.a("006'hmgmhfihikgg"), com.mob.commons.l.a("021Aflfmfnhhfifk4iYfefnff,h!flhkfkfm4gKfnIhAfhfifk")),
        XIAOMI(1, com.mob.commons.l.a("0064iifkNf4fmfhfk"), com.mob.commons.l.a("023_flfmfnfhfkfifkfnfifkfnffRh6flhkfkfmJg?fnXgf?fhYh")),
        VIVO(2, com.mob.commons.l.a("004Rfffkfffm"), com.mob.commons.l.a("0184flfmfnfffkfffmfnfmhkfnffGh%flhkfkfm:g")),
        OPPO(3, com.mob.commons.l.a("0042fmZll0fm"), com.mob.commons.l.a("024Jflfmfnhhfifk_iAfefnffPhHflhkfkfmEg<fnfmVll.fmflfmfh")),
        MOTO(4, com.mob.commons.l.a("008'fhfm<kDfmflfm'if")),
        LENOVO(5, com.mob.commons.l.a("006ihgTfmfffm")),
        ASUS(6, com.mob.commons.l.a("004f'hkfihk")),
        SAMSUNG(7, com.mob.commons.l.a("007@hkJf<fhhkfiDgJgl")),
        MEIZU(8, com.mob.commons.l.a("005CfhWh7fkiffi")),
        ALPS(9, com.mob.commons.l.a("004fil_hk")),
        NUBIA(10, com.mob.commons.l.a("005g>fihhfkWf")),
        ONEPLUS(11, com.mob.commons.l.a("007TfmRghliJfihk")),
        BLACKSHARK(12, com.mob.commons.l.a("010=hhKifeIgjhkFjf_flgj")),
        ZTE(13, com.mob.commons.l.a("003@ifLkh")),
        FERRMEOS(14, com.mob.commons.l.a("0087ghflUhh>fh1hPfmhk")),
        SSUI(15, com.mob.commons.l.a("004Nhkhkfifk")),
        HORNOR(16, "HONOR"),
        REALME(17, "REALME"),
        REDMI(18, "REDMI"),
        MEITU(19, "MEITU"),
        ZUK(20, "ZUK"),
        MBLU(21, "MBLU"),
        COOLPAD(22, "COOLPAD"),
        COOSEA(23, "COOSEA"),
        QIKU(24, "360OS", com.mob.commons.l.a("018DflfmfnhhfifkZi*fefnfifkffQhFflhkfkfmQg"));
        
        private final int A;
        private String B;
        private String C;

        a(int i4, String str) {
            this.A = i4;
            this.B = str;
        }

        a(int i4, String str, String str2) {
            this.A = i4;
            this.B = str;
            this.C = str2;
        }
    }

    private static boolean c() {
        return "PRIZE".equalsIgnoreCase(DH.SyncMtd.getSystemProperties("ro.odm.manufacturer"));
    }

    private static boolean b() {
        String systemProperties = DH.SyncMtd.getSystemProperties(com.mob.commons.l.a("015.flfmfnhkhkfifkfn_l3flfmfefi9ek"));
        return (TextUtils.isEmpty(systemProperties) || systemProperties.equalsIgnoreCase(com.mob.commons.l.a("007GfiGg+gjIgJfmhi,g"))) ? false : true;
    }

    public static a a(Context context, String str, String str2) {
        a[] values;
        if (!TextUtils.isEmpty(str)) {
            for (a aVar : a.values()) {
                if (aVar.B.equalsIgnoreCase(str) || aVar.B.equalsIgnoreCase(str2) || !(TextUtils.isEmpty(aVar.C) || TextUtils.isEmpty(DH.SyncMtd.getSystemProperties(aVar.C)))) {
                    return aVar;
                }
            }
        }
        if (!a() && !b()) {
            if (c(context)) {
                return a.COOLPAD;
            }
            if (c()) {
                return a.COOSEA;
            }
            return a.UNSUPPORT;
        }
        return a.ZTE;
    }

    private static boolean a() {
        String systemProperties = DH.SyncMtd.getSystemProperties(com.mob.commons.l.a("021OflfmfnhhfifkVi>fefnghflThhTfh hTfnCif$hhAhi"));
        return !TextUtils.isEmpty(systemProperties) && systemProperties.equalsIgnoreCase(com.mob.commons.l.a("008Sieilikikjeikijgn"));
    }
}
