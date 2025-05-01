package com.bytedance.pangle.f;

import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.ZeusPluginStateListener;
import com.bytedance.pangle.c;
import com.bytedance.pangle.d;
import com.bytedance.pangle.i;
import com.bytedance.pangle.log.IZeusReporter;
import com.bytedance.pangle.plugin.PluginManager;
import java.io.File;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class a extends c.a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f8364a;

    public static a b() {
        if (f8364a == null) {
            synchronized (a.class) {
                if (f8364a == null) {
                    f8364a = new a();
                }
            }
        }
        return f8364a;
    }

    @Override // com.bytedance.pangle.c
    public final boolean a(String str) {
        return PluginManager.getInstance().checkPluginInstalled(str);
    }

    @Override // com.bytedance.pangle.c
    public final boolean a(String str, String str2) {
        IZeusReporter reporter = GlobalParam.getInstance().getReporter();
        reporter.saveRecord(IZeusReporter.ZEUS_STAGE_PLUGIN_INSTALL, "start install pkg:" + str + ", path:" + str2);
        return PluginManager.getInstance().syncInstall(str, new File(str2));
    }

    @Override // com.bytedance.pangle.c
    public final void a(int i4, d dVar) {
        Zeus.registerPluginStateListener(new c(dVar, i4));
    }

    @Override // com.bytedance.pangle.c
    public final void a(int i4) {
        ZeusPluginStateListener zeusPluginStateListener;
        List<ZeusPluginStateListener> list = i.a().f8438b;
        Iterator<ZeusPluginStateListener> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                zeusPluginStateListener = null;
                break;
            }
            zeusPluginStateListener = it2.next();
            if ((zeusPluginStateListener instanceof c) && ((c) zeusPluginStateListener).f8387a == i4) {
                break;
            }
        }
        if (zeusPluginStateListener != null) {
            list.remove(zeusPluginStateListener);
        }
    }

    @Override // com.bytedance.pangle.c
    public final int b(String str) {
        return PluginManager.getInstance().getPlugin(str).getVersion();
    }
}
