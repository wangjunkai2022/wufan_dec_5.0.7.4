package com.kwad.sdk.a.a;

import android.content.Context;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.al;
import com.kwad.sdk.utils.ax;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Stack;
/* loaded from: classes5.dex */
public class b {
    private static volatile b amv;
    private Stack<AdTemplate> amt = new Stack<>();
    private File amu;
    private boolean mHasInit;

    /* loaded from: classes5.dex */
    public interface a {
        void At();

        void gp();
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized File Aq() {
        File file = this.amu;
        if (file != null) {
            return file;
        }
        String dc = ax.dc(ServiceProvider.getContext());
        File file2 = new File(dc);
        if (!file2.exists()) {
            file2.mkdir();
        }
        File file3 = new File(dc + File.separator + "uninstall_ad");
        this.amu = file3;
        if (!file3.exists()) {
            try {
                this.amu.createNewFile();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return this.amu;
    }

    public static b Ar() {
        if (amv == null) {
            synchronized (b.class) {
                if (amv == null) {
                    amv = new b();
                }
            }
        }
        return amv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void aH(AdTemplate adTemplate) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        Exception e5;
        boolean z4 = false;
        Iterator<AdTemplate> it2 = this.amt.iterator();
        while (it2.hasNext()) {
            if (com.kwad.sdk.core.response.b.e.ec(it2.next()) == com.kwad.sdk.core.response.b.e.ec(adTemplate)) {
                it2.remove();
                z4 = true;
            }
        }
        if (!z4) {
            return;
        }
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.amu));
            try {
                try {
                    objectOutputStream.writeObject(this.amt);
                    com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                } catch (Exception e6) {
                    e5 = e6;
                    com.kwad.sdk.core.e.c.d("InstallTipsDataManager", " removeApkDownloadedData e" + e5);
                    com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                throw th;
            }
        } catch (Exception e7) {
            objectOutputStream = null;
            e5 = e7;
        } catch (Throwable th3) {
            objectOutputStream = null;
            th = th3;
            com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void aI(AdTemplate adTemplate) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        Exception e5;
        this.amt.add(adTemplate);
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(Aq()));
            try {
                try {
                    objectOutputStream.writeObject(this.amt);
                    com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                } catch (Exception e6) {
                    e5 = e6;
                    com.kwad.sdk.core.e.c.printStackTrace(e5);
                    com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                throw th;
            }
        } catch (Exception e7) {
            objectOutputStream = null;
            e5 = e7;
        } catch (Throwable th3) {
            objectOutputStream = null;
            th = th3;
            com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File aL(AdTemplate adTemplate) {
        File file = new File(com.kwad.sdk.core.download.a.H(com.kwad.sdk.core.response.b.e.dS(adTemplate)));
        if (q.L(file)) {
            return file;
        }
        return null;
    }

    public final synchronized AdTemplate As() {
        AdTemplate adTemplate;
        adTemplate = null;
        Stack stack = (Stack) this.amt.clone();
        while (true) {
            if (stack.isEmpty()) {
                break;
            }
            AdTemplate adTemplate2 = (AdTemplate) stack.pop();
            if (adTemplate2 != null) {
                String str = com.kwad.sdk.core.response.b.e.dS(adTemplate2).adBaseInfo.appPackageName;
                Context context = ServiceProvider.getContext();
                File aL = aL(adTemplate2);
                if (aL != null && aL.exists() && aL.lastModified() + 604800000 > System.currentTimeMillis() && !al.an(context, str)) {
                    adTemplate = adTemplate2;
                    break;
                }
            }
        }
        return adTemplate;
    }

    public final void aJ(final AdTemplate adTemplate) {
        if (adTemplate == null) {
            return;
        }
        g.execute(new az() { // from class: com.kwad.sdk.a.a.b.2
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                b.this.aI(adTemplate);
            }
        });
    }

    public final void aK(final AdTemplate adTemplate) {
        if (adTemplate == null) {
            return;
        }
        g.execute(new az() { // from class: com.kwad.sdk.a.a.b.3
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                b.this.aH(adTemplate);
            }
        });
    }

    public final synchronized void a(final a aVar) {
        if (this.mHasInit) {
            return;
        }
        this.mHasInit = true;
        g.execute(new az() { // from class: com.kwad.sdk.a.a.b.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0115 A[Catch: all -> 0x0123, TryCatch #0 {all -> 0x0123, blocks: (B:3:0x0002, B:6:0x0009, B:9:0x0010, B:34:0x00b4, B:49:0x00f0, B:64:0x0111, B:66:0x0115, B:68:0x0119, B:69:0x011c, B:61:0x010a, B:63:0x010e, B:45:0x00d9, B:72:0x011f, B:73:0x0122), top: B:77:0x0002 }] */
            /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
            @Override // com.kwad.sdk.utils.az
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void doTask() {
                /*
                    Method dump skipped, instructions count: 296
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.a.a.b.AnonymousClass1.doTask():void");
            }
        });
    }
}
