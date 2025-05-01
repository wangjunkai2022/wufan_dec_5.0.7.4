package com.kwad.library.solder.lib;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.sdk.utils.ah;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d implements com.kwad.library.solder.lib.a.c {
    private final ConcurrentHashMap<String, com.kwad.library.solder.lib.a.a> ajO = new ConcurrentHashMap<>();
    private final Context mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private synchronized void a(String str, com.kwad.library.solder.lib.a.a aVar) {
        if (aVar != null) {
            if (aVar.isLoaded()) {
                this.ajO.put(str, aVar);
            }
        }
    }

    private static void b(com.kwad.library.solder.lib.a.e eVar) {
        eVar.getState();
        eVar.bO(7);
        eVar.xP().xG().r(eVar);
    }

    private static void c(com.kwad.library.solder.lib.a.e eVar) {
        eVar.getState();
        eVar.xP().xG().q(eVar);
    }

    private static void f(com.kwad.library.solder.lib.a.e eVar) {
        eVar.getState();
        eVar.bO(0);
        eVar.xP().xG().n(eVar);
    }

    private com.kwad.library.solder.lib.a.a h(com.kwad.library.solder.lib.a.e eVar) {
        b(eVar);
        com.kwad.library.solder.lib.a.a a5 = eVar.bS(eVar.xW()).a(eVar.yb());
        String xN = a5.xN();
        File file = new File(xN);
        eVar.xT();
        com.kwad.library.solder.lib.a.d xP = eVar.xP();
        if (file.exists()) {
            String xT = eVar.xT();
            String version = eVar.getVersion();
            com.kwad.library.solder.lib.a.a bJ = bJ(xT);
            if (bJ != null) {
                a(eVar);
                return bJ;
            }
            a5.bN(xT);
            a5.bM(version);
            if (xP.xF().a(xT, version, eVar.ya())) {
                String F = xP.xF().F(xT, version);
                if (q.gB(F)) {
                    a5.bO(F);
                    a5.m(this.mContext, F);
                    a(xT, a5);
                    a(eVar);
                    return a5;
                }
            }
            String b5 = xP.xF().b(a5);
            a5.bO(b5);
            a5.m(this.mContext, b5);
            a(xT, a5);
            if (xN.endsWith(xP.xC().yi())) {
                q.delete(xN);
            }
            a(eVar);
            return a5;
        }
        throw new PluginError.LoadError("Apk file not exist.", 3001);
    }

    @Override // com.kwad.library.solder.lib.a.c
    public final synchronized com.kwad.library.solder.lib.a.a bJ(String str) {
        com.kwad.library.solder.lib.a.a aVar = this.ajO.get(str);
        if (aVar != null) {
            if (!aVar.isLoaded()) {
                return null;
            }
        }
        return aVar;
    }

    @Override // com.kwad.library.solder.lib.a.c
    public final void g(@NonNull com.kwad.library.solder.lib.a.e eVar) {
        eVar.xT();
        eVar.bP("Load");
        c(eVar);
        if (eVar.isCanceled()) {
            f(eVar);
            return;
        }
        com.kwad.library.solder.lib.a.a aVar = this.ajO.get(eVar.xT());
        if (aVar != null && aVar.isLoaded()) {
            eVar.c(aVar);
            eVar.xT();
            aVar.xN();
            a(eVar, aVar);
            return;
        }
        com.kwad.library.solder.lib.c.b yb = eVar.yb();
        if (yb == null) {
            b(eVar, new PluginError.LoadError("not pluginInfo", (int) PluginError.ERROR_UPD_REQUEST));
            return;
        }
        List<com.kwad.library.solder.lib.c.a> yc = eVar.yc();
        com.kwad.library.solder.lib.c.a aVar2 = null;
        if (yc != null && !yc.isEmpty()) {
            for (com.kwad.library.solder.lib.c.a aVar3 : yc) {
                if (eVar.getVersion().equals(aVar3.version)) {
                    aVar2 = aVar3;
                } else {
                    eVar.xP().xF().D(eVar.xT(), aVar3.version);
                }
            }
        }
        if (aVar2 == null) {
            if (!ah.isWifiConnected(this.mContext) && (yb.akZ || (yb.ala && eVar.xV() > 0))) {
                b(eVar, new PluginError.NotWifiDownloadError("It can be downloaded only on WiFi", (int) PluginError.ERROR_UPD_NOT_WIFI_DOWNLOAD));
                return;
            }
            try {
                if (!eVar.xP().xE().k(eVar)) {
                    return;
                }
            } catch (Throwable th) {
                b(eVar, new PluginError.UpdateError(th, (int) PluginError.ERROR_UPD_REQUEST));
                return;
            }
        } else {
            String F = eVar.xP().xF().F(aVar2.akV, aVar2.version);
            eVar.bQ(F);
            eVar.bR(F);
            eVar.bO(2);
            eVar.bM(aVar2.version);
        }
        if (eVar.getState() != 2 && eVar.getState() != 3 && eVar.getState() != 4) {
            b(eVar, new PluginError.InstallError("state exception", 2002));
            return;
        }
        String xW = eVar.xW();
        eVar.xT();
        if (TextUtils.isEmpty(xW)) {
            b(eVar, new PluginError.LoadError("path not found", (int) PluginError.ERROR_UPD_FILE_NOT_FOUND));
        } else if (eVar.isCanceled()) {
            f(eVar);
        } else {
            try {
                com.kwad.library.solder.lib.a.a h4 = h(eVar);
                eVar.c(h4);
                eVar.xT();
                a(eVar, h4);
            } catch (PluginError.InstallError e5) {
                e = e5;
                b(eVar, e);
            } catch (PluginError.LoadError e6) {
                e = e6;
                b(eVar, e);
            } catch (Throwable th2) {
                a.e("PluginLoaderImpl", "load plugin failed, path = " + xW, th2);
                b(eVar, new PluginError.InstallError("load or install plugin failed:" + th2.getMessage(), 4004));
            }
        }
    }

    private static void a(com.kwad.library.solder.lib.a.e eVar) {
        eVar.getState();
        eVar.bO(8);
        eVar.xP().xG().a(eVar);
    }

    private static void b(com.kwad.library.solder.lib.a.e eVar, PluginError pluginError) {
        eVar.getState();
        eVar.bO(6);
        eVar.j(pluginError);
        eVar.xP().xG().c(eVar, pluginError);
    }

    private static void a(com.kwad.library.solder.lib.a.e eVar, com.kwad.library.solder.lib.a.a aVar) {
        eVar.getState();
        eVar.bO(5);
        eVar.xP().xG().b(eVar, aVar);
    }
}
