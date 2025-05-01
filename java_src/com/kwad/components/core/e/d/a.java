package com.kwad.components.core.e.d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.page.AdWebViewVideoActivityProxy;
import com.kwad.components.core.webview.tachikoma.a.k;
import com.kwad.sdk.core.adlog.a;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.track.AdTrackLog;
import com.kwad.sdk.n.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ac;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class a {
    private static List<WeakReference<k.b>> KR;

    /* renamed from: com.kwad.components.core.e.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0457a {
        private boolean KS;
        private boolean KT;
        private boolean KU;
        private boolean KV;
        private boolean KW;
        private boolean KX;
        private boolean KY;
        private b KZ;
        private c La;
        private boolean Lb;
        private boolean Lc;
        private long Ld;
        private boolean Le;
        private boolean Lf;
        public String Lh;
        public a.C0514a Li;
        private JSONObject Ll;
        private boolean Ln;
        private int Lo;
        private int Lp;
        private int Lq;
        private int Lr;
        private Callable<String> Ls;
        private String Lt;
        private AdTemplate adTemplate;
        private final Context context;
        private int kj;
        private int kl;
        public ac.a kn;
        public long vA;
        public int Lg = -1;
        public int Lj = 0;
        public int Lk = -1;
        private boolean Lm = false;

        public C0457a(Context context) {
            this.context = context;
        }

        public final C0457a a(@Nullable Callable<String> callable) {
            this.Ls = callable;
            return this;
        }

        public final C0457a ag(String str) {
            this.Lt = str;
            return this;
        }

        public final C0457a ah(String str) {
            this.Lh = str;
            return this;
        }

        public final void ak(boolean z4) {
            this.Lc = true;
        }

        public final C0457a al(int i4) {
            this.Lr = i4;
            return this;
        }

        public final C0457a am(int i4) {
            this.kl = i4;
            return this;
        }

        public final C0457a an(boolean z4) {
            this.KW = true;
            return this;
        }

        public final C0457a ao(boolean z4) {
            this.Lb = z4;
            return this;
        }

        public final C0457a ap(boolean z4) {
            this.Le = z4;
            return this;
        }

        public final C0457a aq(boolean z4) {
            this.Lf = z4;
            return this;
        }

        public final C0457a ar(AdTemplate adTemplate) {
            this.adTemplate = adTemplate;
            return this;
        }

        public final C0457a as(boolean z4) {
            this.KT = z4;
            return this;
        }

        public final C0457a at(boolean z4) {
            this.KV = true;
            return this;
        }

        public final C0457a au(boolean z4) {
            this.KS = z4;
            return this;
        }

        public final C0457a av(boolean z4) {
            this.Ln = z4;
            return this;
        }

        public final C0457a aw(boolean z4) {
            this.KU = true;
            return this;
        }

        public final C0457a b(c cVar) {
            this.La = cVar;
            return this;
        }

        public final C0457a c(JSONObject jSONObject) {
            this.Ll = jSONObject;
            return this;
        }

        public final int cV() {
            return this.kj;
        }

        public final int cY() {
            return this.kl;
        }

        public final C0457a d(ac.a aVar) {
            this.kn = aVar;
            return this;
        }

        public final AdTemplate getAdTemplate() {
            return this.adTemplate;
        }

        public final Context getContext() {
            return this.context;
        }

        public final c ha() {
            return this.La;
        }

        public final JSONObject ho() {
            return this.Ll;
        }

        public final String nX() {
            return this.Lt;
        }

        public final Callable<String> nY() {
            return this.Ls;
        }

        public final boolean nZ() {
            return this.Lc;
        }

        public final int oa() {
            return this.Lp;
        }

        public final b ob() {
            return this.KZ;
        }

        public final boolean oc() {
            return this.KW;
        }

        public final int od() {
            return this.Lr;
        }

        public final boolean oe() {
            return this.KX;
        }

        public final boolean of() {
            return this.KY;
        }

        public final boolean og() {
            return this.Lb;
        }

        public final long oh() {
            return this.Ld;
        }

        public final boolean oi() {
            return this.Le;
        }

        public final boolean oj() {
            return this.Lf;
        }

        public final com.kwad.sdk.core.adlog.c.a ok() {
            return com.kwad.sdk.core.adlog.c.a.BZ().cE(this.kl).dl(this.Lh).e(this.kn).cF(this.Lj).cG(this.Lk).am(this.vA).a(this.Li).cH(this.Lg);
        }

        public final boolean ol() {
            return this.Lm;
        }

        public final boolean om() {
            return this.KT;
        }

        public final boolean on() {
            return this.KV;
        }

        public final boolean oo() {
            return this.KS;
        }

        public final boolean op() {
            return this.Ln;
        }

        public final int oq() {
            return this.Lo;
        }

        public final int or() {
            return this.Lq;
        }

        public final boolean os() {
            return this.KU;
        }

        public final C0457a v(long j4) {
            this.Ld = j4;
            return this;
        }

        public final C0457a w(long j4) {
            this.vA = j4;
            return this;
        }

        public final C0457a a(b bVar) {
            this.KZ = bVar;
            return this;
        }

        public final void ak(int i4) {
            this.Lp = i4;
        }

        public final C0457a al(boolean z4) {
            this.KX = z4;
            return this;
        }

        public final C0457a am(boolean z4) {
            this.KY = true;
            return this;
        }

        public final C0457a an(int i4) {
            this.kj = i4;
            return this;
        }

        public final C0457a ao(int i4) {
            this.Lj = i4;
            return this;
        }

        public final C0457a ap(int i4) {
            this.Lk = i4;
            return this;
        }

        public final C0457a aq(int i4) {
            this.Lo = i4;
            return this;
        }

        public final C0457a ar(boolean z4) {
            this.Lm = z4;
            return this;
        }

        public final C0457a a(String str, String str2, com.kwad.sdk.f.a<AdTrackLog> aVar) {
            if (this.Li == null) {
                this.Li = new a.C0514a();
            }
            this.Li.a(this.adTemplate, null, null, null);
            return this;
        }

        public final C0457a ar(int i4) {
            this.Lq = i4;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void onAdClicked();
    }

    public static int a(@NonNull Context context, @NonNull AdTemplate adTemplate, @NonNull b bVar, @Nullable c cVar, boolean z4, boolean z5, boolean z6, boolean z7) {
        com.kwad.sdk.commercial.d.a.f(adTemplate, true);
        adTemplate.converted = true;
        boolean z8 = false;
        d.ax(false);
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
        C0457a ar = new C0457a(context).ar(adTemplate).a(bVar).b(cVar).ao(z4).ap(z5).al(z7).ar(false);
        int am = com.kwad.sdk.core.response.b.a.am(dS);
        if (!((z6 || ar.or() == 2 || ar.or() == 1) ? true : true) && !TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.aR(dS)) && !ar.on()) {
            if (am == 1) {
                if (com.kwad.sdk.core.response.b.a.bg(dS)) {
                    return k(ar);
                }
                return l(ar);
            } else if (am == 2) {
                int h4 = h(ar);
                if (h4 == 1) {
                    return 13;
                }
                if (h4 == 2) {
                    return 16;
                }
                if (com.kwad.sdk.core.response.b.a.bg(dS)) {
                    return k(ar);
                }
                return l(ar);
            }
        }
        int h5 = h(ar);
        if (h5 == 1) {
            return 13;
        }
        if (h5 == 2) {
            return 16;
        }
        if (!com.kwad.sdk.core.response.b.a.aE(dS)) {
            if (j(ar)) {
                return 11;
            }
            return l(ar);
        }
        int m4 = m(ar);
        int i4 = dS.status;
        if (i4 != 2 && i4 != 3) {
            e(ar);
        }
        return m4;
    }

    private static int b(C0457a c0457a) {
        Context context = c0457a.getContext();
        AdTemplate adTemplate = c0457a.getAdTemplate();
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        Activity dB = l.dB(context);
        if (dB != null && com.kwad.sdk.core.response.b.a.U(dS) && !c0457a.nZ() && !c0457a.oe()) {
            c0457a.ak(2);
            com.kwad.components.core.e.e.e.a(dB, c0457a);
            d(adTemplate, 19);
            return 19;
        }
        AdWebViewActivityProxy.launch(context, new AdWebViewActivityProxy.a.C0468a().au(com.kwad.sdk.core.response.b.b.cD(adTemplate)).at(adTemplate).aD(true).pK());
        d(adTemplate, 20);
        return 20;
    }

    private static boolean c(C0457a c0457a) {
        return com.kwad.sdk.core.response.b.a.aE(com.kwad.sdk.core.response.b.e.dS(c0457a.getAdTemplate())) ? !c0457a.op() && c.A(c0457a) == 3 : d(c0457a) == 1;
    }

    private static int d(C0457a c0457a) {
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(c0457a.getAdTemplate());
        if (dS.unDownloadConf.unDownloadRegionConf != null) {
            int cV = c0457a.cV();
            if (cV != 2) {
                if (cV != 3) {
                    return dS.unDownloadConf.unDownloadRegionConf.actionBarType;
                }
                return dS.unDownloadConf.unDownloadRegionConf.materialJumpType;
            }
            return dS.unDownloadConf.unDownloadRegionConf.describeBarType;
        }
        return 0;
    }

    private static void e(C0457a c0457a) {
        if (c0457a.nZ()) {
            return;
        }
        g(c0457a);
        f(c0457a);
        if (c0457a.ob() != null) {
            try {
                c0457a.ob().onAdClicked();
            } catch (Throwable th) {
                ServiceProvider.reportSdkCaughtException(th);
            }
        }
        com.kwad.sdk.commercial.d.a.bd(c0457a.getAdTemplate());
    }

    private static void f(C0457a c0457a) {
        if (c0457a.oj()) {
            com.kwad.sdk.core.adlog.c.a(c0457a.adTemplate, c0457a.ok(), c0457a.ho());
        }
    }

    private static void g(C0457a c0457a) {
        k.b bVar;
        List<WeakReference<k.b>> list = KR;
        if (list == null || list.isEmpty() || c0457a.adTemplate == null) {
            return;
        }
        for (WeakReference<k.b> weakReference : KR) {
            if (weakReference != null && (bVar = weakReference.get()) != null) {
                bVar.L(com.kwad.sdk.core.response.b.e.ec(c0457a.adTemplate));
            }
        }
    }

    private static int h(C0457a c0457a) {
        AdTemplate adTemplate = c0457a.getAdTemplate();
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        int a5 = d.a(c0457a, 1);
        if (a5 == 1) {
            d.ax(true);
            e(c0457a);
            if ((com.kwad.sdk.core.response.b.a.cL(dS) || com.kwad.sdk.core.response.b.a.cM(dS)) && !c0457a.os()) {
                com.kwad.sdk.core.adlog.c.m(c0457a.getAdTemplate(), (int) Math.ceil(((float) c0457a.oh()) / 1000.0f));
            }
            d(adTemplate, 13);
        } else if (a5 == 2) {
            e(c0457a);
            d(adTemplate, 16);
        }
        return a5;
    }

    private static int i(C0457a c0457a) {
        Context context = c0457a.getContext();
        AdTemplate adTemplate = c0457a.getAdTemplate();
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(c0457a.getAdTemplate());
        Activity dB = l.dB(c0457a.getContext());
        if (dB != null && com.kwad.sdk.core.response.b.a.T(dS) && !c0457a.nZ() && e.E(dS) && !c0457a.oe()) {
            c0457a.ak(1);
            com.kwad.components.core.e.e.e.a(dB, c0457a);
            e(c0457a);
            d(adTemplate, 17);
            return 2;
        }
        int d5 = e.d(context, adTemplate);
        if (d5 == 1) {
            e(c0457a);
            d(adTemplate, 12);
        }
        return d5;
    }

    private static boolean j(C0457a c0457a) {
        AdTemplate adTemplate = c0457a.getAdTemplate();
        boolean h4 = com.kwad.sdk.utils.d.h(c0457a.getContext(), adTemplate);
        if (h4) {
            e(c0457a);
            com.kwad.sdk.core.adlog.c.k(adTemplate, 0);
            d(adTemplate, 11);
        }
        return h4;
    }

    private static int k(C0457a c0457a) {
        e(c0457a);
        AdTemplate adTemplate = c0457a.getAdTemplate();
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(c0457a.getAdTemplate());
        Activity dB = l.dB(c0457a.getContext());
        if (dB != null && com.kwad.sdk.core.response.b.a.U(dS) && !c0457a.nZ() && !c0457a.oe()) {
            c0457a.ak(2);
            com.kwad.components.core.e.e.e.a(dB, c0457a);
            d(adTemplate, 19);
            return 19;
        }
        AdWebViewVideoActivityProxy.launch(c0457a.getContext(), adTemplate);
        d(adTemplate, 15);
        return 15;
    }

    private static int l(C0457a c0457a) {
        e(c0457a);
        Context context = c0457a.getContext();
        AdTemplate adTemplate = c0457a.getAdTemplate();
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        Activity dB = l.dB(context);
        if (dB != null && com.kwad.sdk.core.response.b.a.U(dS) && !c0457a.nZ() && !c0457a.oe()) {
            c0457a.ak(2);
            com.kwad.components.core.e.e.e.a(dB, c0457a);
            d(adTemplate, 19);
            return 19;
        }
        AdWebViewActivityProxy.launch(context, new AdWebViewActivityProxy.a.C0468a().au(com.kwad.sdk.core.response.b.b.cD(adTemplate)).at(adTemplate).aE(c0457a.oc()).az(1).pK());
        d(adTemplate, 14);
        return 14;
    }

    private static int m(C0457a c0457a) {
        c ha = c0457a.ha();
        if (ha == null) {
            ha = new c(c0457a.adTemplate);
            c0457a.b(ha);
        }
        int r4 = ha.r(c0457a);
        d(c0457a.getAdTemplate(), r4);
        return r4;
    }

    private static int n(C0457a c0457a) {
        AdTemplate adTemplate = c0457a.getAdTemplate();
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        if (j(c0457a)) {
            return 11;
        }
        if (com.kwad.sdk.core.response.b.a.b(dS, com.kwad.sdk.core.config.d.CB()) && !adTemplate.mAdWebVideoPageShowing) {
            return k(c0457a);
        }
        return l(c0457a);
    }

    private static void d(AdTemplate adTemplate, int i4) {
        switch (i4) {
            case 0:
                com.kwad.sdk.commercial.d.a.bt(adTemplate);
                return;
            case 1:
                com.kwad.sdk.commercial.d.a.bi(adTemplate);
                return;
            case 2:
                com.kwad.sdk.commercial.d.a.bs(adTemplate);
                return;
            case 3:
                com.kwad.sdk.commercial.d.a.bk(adTemplate);
                return;
            case 4:
                com.kwad.sdk.commercial.d.a.bq(adTemplate);
                return;
            case 5:
                com.kwad.sdk.commercial.d.a.br(adTemplate);
                return;
            case 6:
                com.kwad.sdk.commercial.d.a.bl(adTemplate);
                return;
            case 7:
                com.kwad.sdk.commercial.d.a.bm(adTemplate);
                return;
            case 8:
                com.kwad.sdk.commercial.d.a.bn(adTemplate);
                return;
            case 9:
                com.kwad.sdk.commercial.d.a.bp(adTemplate);
                return;
            case 10:
                com.kwad.sdk.commercial.d.a.bo(adTemplate);
                return;
            case 11:
                com.kwad.sdk.commercial.d.a.bh(adTemplate);
                return;
            case 12:
                com.kwad.sdk.commercial.d.a.bg(adTemplate);
                return;
            case 13:
                com.kwad.sdk.commercial.d.a.bf(adTemplate);
                return;
            case 14:
                com.kwad.sdk.commercial.d.a.be(adTemplate);
                return;
            case 15:
                com.kwad.sdk.commercial.d.a.bj(adTemplate);
                return;
            case 16:
                com.kwad.sdk.commercial.d.a.bv(adTemplate);
                return;
            case 17:
                com.kwad.sdk.commercial.d.a.by(adTemplate);
                return;
            case 18:
                com.kwad.sdk.commercial.d.a.bu(adTemplate);
                return;
            case 19:
                com.kwad.sdk.commercial.d.a.bw(adTemplate);
                return;
            case 20:
                com.kwad.sdk.commercial.d.a.bx(adTemplate);
                return;
            default:
                return;
        }
    }

    public static void b(k.b bVar) {
        if (KR == null) {
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= KR.size()) {
                i4 = -1;
                break;
            }
            WeakReference<k.b> weakReference = KR.get(i4);
            if (weakReference != null && weakReference.get() != null && bVar == weakReference.get()) {
                break;
            }
            i4++;
        }
        if (i4 != -1) {
            KR.remove(i4);
        }
    }

    public static int a(C0457a c0457a) {
        Context context = c0457a.getContext();
        AdTemplate adTemplate = c0457a.getAdTemplate();
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        d.ax(false);
        if (c0457a.of()) {
            return b(c0457a);
        }
        if (c0457a.oo()) {
            return a(context, adTemplate, c0457a.ob(), c0457a.ha(), c0457a.Lb, c0457a.oi(), false, c0457a.oe());
        }
        com.kwad.sdk.commercial.d.a.f(adTemplate, false);
        if (c(c0457a)) {
            d(adTemplate, 1);
            return 1;
        }
        adTemplate.converted = true;
        com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
        int am = com.kwad.sdk.core.response.b.a.am(dS);
        if (!(c0457a.or() == 2 || c0457a.or() == 1) && !TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.aR(dS)) && !c0457a.on()) {
            if (am == 1) {
                if (com.kwad.sdk.core.response.b.a.bg(dS)) {
                    return k(c0457a);
                }
                return l(c0457a);
            } else if (am == 2) {
                int h4 = h(c0457a);
                if (h4 == 1) {
                    return 13;
                }
                if (h4 == 2) {
                    return 16;
                }
                if (com.kwad.sdk.core.response.b.a.bg(dS)) {
                    return k(c0457a);
                }
                return l(c0457a);
            }
        }
        int h5 = h(c0457a);
        if (h5 == 1) {
            return 13;
        }
        if (h5 == 2) {
            return 16;
        }
        int i4 = i(c0457a);
        if (i4 == 1) {
            return 12;
        }
        if (i4 == 2) {
            return 17;
        }
        if (c0457a.om() && !com.kwad.sdk.core.response.b.a.aE(dS)) {
            return n(c0457a);
        }
        if (!com.kwad.sdk.core.response.b.a.aE(dS)) {
            if (adTemplate.isWebViewDownload) {
                return m(c0457a);
            }
            if (j(c0457a)) {
                return 11;
            }
            return l(c0457a);
        } else if (c0457a.or() != 2 && c0457a.or() != 1) {
            if (c0457a.om() && com.kwad.sdk.core.response.b.a.b(dS, com.kwad.sdk.core.config.d.CB()) && !TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.aR(dS)) && !AdWebViewVideoActivityProxy.showingAdWebViewVideoActivity) {
                int q4 = c0457a.ha().q(c0457a);
                if (q4 == 0) {
                    return k(c0457a);
                }
                e(c0457a);
                d(adTemplate, q4);
                return q4;
            }
            e(c0457a);
            c0457a.ar(true);
            return m(c0457a);
        } else {
            c0457a.ar(false);
            e(c0457a);
            return m(c0457a);
        }
    }

    public static void a(k.b bVar) {
        if (KR == null) {
            KR = new CopyOnWriteArrayList();
        }
        KR.add(new WeakReference<>(bVar));
    }
}
