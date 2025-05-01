package com.mob.tools.utils;

import android.text.TextUtils;
import com.mob.commons.s;
import com.mob.tools.utils.DH;
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static g f57055a;

    /* renamed from: com.mob.tools.utils.g$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57056a;

        static {
            int[] iArr = new int[a.values().length];
            f57056a = iArr;
            try {
                iArr[a.MIUI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57056a[a.EMUI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57056a[a.AMIGO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57056a[a.FLYME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57056a[a.LENOVO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57056a[a.ONEUI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57056a[a.COLOR_OS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57056a[a.FUNTOUCH_OS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57056a[a.EUI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57056a[a.SENSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57056a[a.GOOGLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57056a[a.SMARTISAN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57056a[a.ONEPLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57056a[a.YUNOS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57056a[a.QIHOO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57056a[a.NUBIA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57056a[a.LGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum a {
        MIUI(s.a("006Feidi8dKdkdfdi")),
        EMUI(s.a("006hCdgPd5fg!f di")),
        FLYME(s.a("005]dfWfYdigddg")),
        ONEUI(s.a("007.fi9d4dffidgSe'ej")),
        COLOR_OS(s.a("004Mdk3jj8dk")),
        FUNTOUCH_OS(s.a("004Ydddidddk")),
        EUI(s.a("004gfi!dd")),
        SENSE(s.a("003hic")),
        GOOGLE(s.a("006;ejdkdkej+gf")),
        LENOVO(s.a("006gfe*dkdddk")),
        SMARTISAN(s.a("006ch;dgdigddi")),
        ONEPLUS(s.a("007^dk7efjg2dgfi")),
        YUNOS(s.a("0058ecdg:eEdkfi")),
        QIHOO(s.a("005Cdedi>h4dkdk")),
        NUBIA(s.a("005eDdgffdi)d")),
        LGE(s.a("002g-ej")),
        AMIGO(s.a("005@hgdi.eg5di")),
        OTHER("");
        

        /* renamed from: s  reason: collision with root package name */
        private String f57076s;

        a(String str) {
            this.f57076s = str;
        }

        public String a() {
            return this.f57076s;
        }
    }

    private g() {
    }

    public static g a() {
        if (f57055a == null) {
            synchronized (g.class) {
                if (f57055a == null) {
                    f57055a = new g();
                }
            }
        }
        return f57055a;
    }

    private a c() {
        a[] values;
        if (TextUtils.isEmpty(a("ro.miui.ui.version.code")) && TextUtils.isEmpty(a(s.a("0239djdkdldfdidgdidldgdidldd+fMdjfididk_eRdl!edUdfWf"))) && TextUtils.isEmpty(a("ro.miui.internal.storage"))) {
            if (TextUtils.isEmpty(a(s.a("021VdjdkdlffdgdiHgVdcdlddTfHdjfididkFe.dl(fNdfdgdi"))) && TextUtils.isEmpty(a("ro.build.hw_emui_api_level")) && TextUtils.isEmpty(a("ro.confg.hw_systemversion"))) {
                if (TextUtils.isEmpty(a(s.a("026jfUdjfidifiViGdlfiecfidldgfi]f;dlef[g<ecdfVf$dldiYc6dk3e"))) && TextUtils.isEmpty(a(s.a("0261djdkdldfTfCdigddgdlfi$fiQdg8jVfgdigdNdBdjdcdlef8g!ecdfDf"))) && TextUtils.isEmpty(a(s.a("018'djdkdlef9gVecdf^fUdl8jGdgffZg0difiHhfSdc")))) {
                    if (TextUtils.isEmpty(a(s.a("024cMdkdfdlfiMdZdffidgIe6ejdlfi4jf;ejdldcdifi6dWffZgf"))) && TextUtils.isEmpty(a("init.svc.health-hal-2-1-samsung"))) {
                        if (!TextUtils.isEmpty(a(s.a("024Vdjdkdlffdgdi_g(dcdlddOf_djfididk.eTdldk_jj;dkdjdkdf")))) {
                            return a.COLOR_OS;
                        }
                        if (TextUtils.isEmpty(a(s.a("027Pdjdkdldddidddkdldkfidlffdgdi4gOdcdldcdifi6jgd2ecdldidc"))) && TextUtils.isEmpty(a(s.a("018-djdkdldddidddkdldkfidldd(fZdjfididkTe")))) {
                            if (!TextUtils.isEmpty(a(s.a("023)djdkdlJgfiBdddldj?fgfd?fi4fXdldd_f_djfididkMe")))) {
                                return a.EUI;
                            }
                            if (!TextUtils.isEmpty(a(s.a("022NdjdkdlffdgdiTg[dcdlfi]fe4fiIf+dlddUf]djfididk(e")))) {
                                return a.SENSE;
                            }
                            if (s.a("014de[dcdjdkdidchkejdkdkej;gf").equals(a(s.a("026'djdkdl<cLdkdfdlejdkdkej9gfQdlHcgAdiDfeiGdidcff@dBfi;f")))) {
                                return a.GOOGLE;
                            }
                            if (!TextUtils.isEmpty(a(s.a("020HdjdkdlfidfHdYdj.i*difiKde*dldd!fBdjfididk+e")))) {
                                return a.SMARTISAN;
                            }
                            if (!TextUtils.isEmpty(a(s.a("014 djdkdldjdkdfdldd(f)djfididk=e")))) {
                                return a.ONEPLUS;
                            }
                            if (!TextUtils.isEmpty(a(s.a("020RdjdkdlIcid0dlecdgGe)dkfidldd2f$djfididkTe")))) {
                                return a.YUNOS;
                            }
                            if (!TextUtils.isEmpty(a(s.a("018%djdkdlffdgdi)g>dcdldgdidd fPdjfididkMe")))) {
                                return a.QIHOO;
                            }
                            if (TextUtils.isEmpty(a(s.a("023KdjdkdlffdgdiAg[dcdl]e)dgffdi?dRdldjdkdfdlMcBdkdcDf"))) && TextUtils.isEmpty(a(s.a("015^djdkdlffdgdiUgMdcdldjdkdfdldidc")))) {
                                if (!TextUtils.isEmpty(a(s.a("021$fiecfidlMg4ejVf?dl?gLejdfdcdfdhdd)f djfididk]e")))) {
                                    return a.LGE;
                                }
                                if (!TextUtils.isEmpty(a(s.a("019Jdjdkdlffdgdi(gUdcdldcdifiXjgd=ecdldidc"))) && a(s.a("019PdjdkdlffdgdiOgGdcdldcdifiTjgdRecdldidc")).matches("amigo([\\d.]+)[a-zA-Z]*")) {
                                    return a.AMIGO;
                                }
                                for (a aVar : a.values()) {
                                    if (aVar.a().equalsIgnoreCase(DH.SyncMtd.getManufacturer())) {
                                        return aVar;
                                    }
                                }
                                return a.OTHER;
                            }
                            return a.NUBIA;
                        }
                        return a.FUNTOUCH_OS;
                    }
                    return a.ONEUI;
                }
                return a.FLYME;
            }
            return a.EMUI;
        }
        return a.MIUI;
    }

    public String b() {
        String a5;
        switch (AnonymousClass1.f57056a[c().ordinal()]) {
            case 1:
                a5 = a(s.a("023Wdjdkdldfdidgdidldgdidldd.f?djfididk@e2dl*edKdf9f"));
                break;
            case 2:
                a5 = a(s.a("021Gdjdkdlffdgdi0g9dcdldd9f5djfididkLeUdl5fGdfdgdi"));
                break;
            case 3:
            case 4:
                a5 = a(s.a("019PdjdkdlffdgdiIg3dcdldcdifi.jgd7ecdldidc"));
                break;
            case 5:
            case 6:
                a5 = a(s.a("028NdjdkdlffdgdiAgRdcdlddGf3djfididkZe+dldiNecOdjUfLdf%feidg"));
                break;
            case 7:
                a5 = a(s.a("024+djdkdlffdgdiGg=dcdldd:fDdjfididk?eMdldk?jjXdkdjdkdf"));
                break;
            case 8:
                a5 = a(s.a("027Gdjdkdldddidddkdldkfidlffdgdi_gRdcdldcdifiDjgd>ecdldidc"));
                if (TextUtils.isEmpty(a5)) {
                    a5 = a(s.a("018AdjdkdldddidddkdldkfidlddSf(djfididk.e"));
                    break;
                }
                break;
            case 9:
                a5 = a(s.a("023;djdkdlZgfiJdddldj5fgfd8fi,f[dldd)fPdjfididkZe"));
                break;
            case 10:
                a5 = a(s.a("022Ddjdkdlffdgdi0g]dcdlfi5fe@fi*fRdldd5f)djfididkJe"));
                break;
            case 11:
                a5 = a(s.a("024%djdkdlffdgdiDg1dcdldd>fBdjfididkTeMdldj;fgfdCfi$f"));
                break;
            case 12:
                a5 = a(s.a("020;djdkdlfidf,d-dj[iTdifi2de1dldd]fRdjfididk:e"));
                break;
            case 13:
                a5 = a(s.a("0145djdkdldjdkdfdldd f0djfididk]e"));
                break;
            case 14:
                a5 = a(s.a("020?djdkdlMcid$dlecdgCe.dkfidldd:f?djfididk@e"));
                break;
            case 15:
                a5 = a(s.a("018=djdkdlffdgdi<gRdcdldgdidd,fMdjfididkGe"));
                break;
            case 16:
                a5 = a(s.a("023Ddjdkdlffdgdi_gRdcdl e9dgffdiFdCdldjdkdfdlYcSdkdcLf"));
                if (TextUtils.isEmpty(a5)) {
                    a5 = a(s.a("015)djdkdlffdgdi;g>dcdldjdkdfdldidc"));
                    break;
                }
                break;
            case 17:
                a5 = a(s.a("021,fiecfidl0gAej2fAdlZgYejdfdcdfdhddDf[djfididk3e"));
                break;
            default:
                a5 = a(s.a("019(djdkdlffdgdiZg=dcdldcdifi1jgdFecdldidc"));
                break;
        }
        return TextUtils.isEmpty(a5) ? a(s.a("019,djdkdlffdgdiZg$dcdldcdifi3jgd^ecdldidc")) : a5;
    }

    private String a(String str) {
        return DH.SyncMtd.getSystemProperties(str);
    }
}
