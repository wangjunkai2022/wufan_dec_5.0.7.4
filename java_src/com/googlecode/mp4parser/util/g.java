package com.googlecode.mp4parser.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.kuaishou.weapon.p0.t;
import com.umeng.analytics.pro.bm;
import java.util.HashMap;
import java.util.Map;
/* compiled from: Iso639.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    static Map<String, String> f14226a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    static Map<String, String> f14227b = new HashMap();

    static {
        c("ab", "abk");
        c("aa", "aar");
        c("af", "afr");
        c("ak", "aka");
        c("sq", "sqi");
        c("am", "amh");
        c("ar", "ara");
        c(m.a.f71497k, "arg");
        c("hy", "hye");
        c("as", "asm");
        c(m.a.f71498l, "ava");
        c("ae", "ave");
        c("ay", "aym");
        c("az", "aze");
        c("bm", "bam");
        c("ba", "bak");
        c("eu", "eus");
        c("be", "bel");
        c("bn", "ben");
        c("bh", "bih");
        c("bi", "bis");
        c("bs", "bos");
        c("br", "bre");
        c("bg", "bul");
        c("my", "mya");
        c("ca", "cat");
        c("ch", "cha");
        c("ce", "che");
        c("ny", "nya");
        c("zh", "zho");
        c("cv", "chv");
        c("kw", "cor");
        c("co", "cos");
        c("cr", "cre");
        c("hr", "hrv");
        c("cs", "ces");
        c("da", "dan");
        c("dv", "div");
        c("nl", "nld");
        c("dz", "dzo");
        c("en", "eng");
        c("eo", "epo");
        c("et", "est");
        c("ee", "ewe");
        c("fo", "fao");
        c("fj", "fij");
        c("fi", "fin");
        c("fr", "fra");
        c("ff", "ful");
        c("gl", "glg");
        c("ka", "kat");
        c("de", "deu");
        c(t.f55695n, "ell");
        c("gn", "grn");
        c("gu", "guj");
        c("ht", "hat");
        c("ha", "hau");
        c("he", "heb");
        c("hz", "her");
        c("hi", "hin");
        c("ho", "hmo");
        c("hu", "hun");
        c("ia", "ina");
        c("id", "ind");
        c("ie", "ile");
        c("ga", "gle");
        c("ig", "ibo");
        c("ik", "ipk");
        c("io", "ido");
        c(bm.ae, "isl");
        c("it", "ita");
        c("iu", "iku");
        c("ja", "jpn");
        c("jv", "jav");
        c("kl", "kal");
        c("kn", "kan");
        c("kr", "kau");
        c(MediationConstant.ADN_KS, "kas");
        c("kk", "kaz");
        c("km", "khm");
        c("ki", "kik");
        c(net.lingala.zip4j.util.e.f71861e0, "kin");
        c("ky", "kir");
        c("kv", "kom");
        c("kg", "kon");
        c("ko", "kor");
        c("ku", "kur");
        c("kj", "kua");
        c("la", com.umeng.analytics.pro.f.C);
        c("lb", "ltz");
        c("lg", "lug");
        c("li", "lim");
        c("ln", "lin");
        c("lo", "lao");
        c("lt", "lit");
        c("lu", "lub");
        c("lv", "lav");
        c("gv", "glv");
        c("mk", "mkd");
        c("mg", "mlg");
        c("ms", "msa");
        c("ml", "mal");
        c("mt", "mlt");
        c("mi", "mri");
        c("mr", "mar");
        c("mh", "mah");
        c("mn", "mon");
        c("na", "nau");
        c("nv", "nav");
        c("nd", "nde");
        c("ne", "nep");
        c("ng", "ndo");
        c("nb", "nob");
        c("nn", "nno");
        c("no", "nor");
        c("ii", "iii");
        c("nr", "nbl");
        c("oc", "oci");
        c("oj", "oji");
        c("cu", "chu");
        c("om", "orm");
        c("or", "ori");
        c(bm.f63463x, "oss");
        c("pa", "pan");
        c("pi", "pli");
        c("fa", "fas");
        c(bm.aD, "pol");
        c("ps", "pus");
        c("pt", "por");
        c("qu", "que");
        c(t.f55704w, "roh");
        c("rn", "run");
        c("ro", "ron");
        c("ru", "rus");
        c("sa", "san");
        c("sc", "srd");
        c("sd", "snd");
        c("se", "sme");
        c("sm", "smo");
        c("sg", "sag");
        c("sr", "srp");
        c("gd", "gla");
        c("sn", "sna");
        c("si", "sin");
        c("sk", "slk");
        c("sl", "slv");
        c("so", "som");
        c("st", "sot");
        c("es", "spa");
        c("su", "sun");
        c("sw", "swa");
        c("ss", "ssw");
        c(m.a.f71496j, "swe");
        c("ta", "tam");
        c("te", "tel");
        c("tg", "tgk");
        c("th", "tha");
        c("ti", "tir");
        c("bo", "bod");
        c("tk", "tuk");
        c("tl", "tgl");
        c("tn", "tsn");
        c(TypedValues.TransitionType.S_TO, "ton");
        c("tr", "tur");
        c("ts", "tso");
        c("tt", "tat");
        c("tw", "twi");
        c(m.a.f71495i, "tah");
        c("ug", "uig");
        c("uk", "ukr");
        c("ur", "urd");
        c("uz", "uzb");
        c("ve", "ven");
        c("vi", "vie");
        c("vo", "vol");
        c("wa", "wln");
        c("cy", "cym");
        c("wo", "wol");
        c("fy", "fry");
        c("xh", "xho");
        c("yi", "yid");
        c("yo", "yor");
        c("za", "zha");
        c("zu", "zul");
    }

    public static String a(String str) {
        return f14226a.get(str);
    }

    public static String b(String str) {
        return f14227b.get(str);
    }

    private static void c(String str, String str2) {
        f14226a.put(str, str2);
        f14227b.put(str2, str);
    }
}
