package com.kwad.components.ad.feed;

import android.content.Context;
import android.os.Vibrator;
import com.kwad.sdk.utils.bo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes5.dex */
public final class d {
    private static com.kwad.sdk.core.g.d eg;
    private static Vibrator eh;
    private static List<a> ei = new CopyOnWriteArrayList();

    /* loaded from: classes5.dex */
    public static class a {
        private b ek;
        private Context mContext;

        public a(b bVar, Context context) {
            this.ek = bVar;
            this.mContext = context;
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        boolean b(double d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Vibrator C(Context context) {
        if (eh == null) {
            eh = (Vibrator) context.getSystemService("vibrator");
        }
        return eh;
    }

    public static void a(float f5, Context context, b bVar) {
        if (eg == null) {
            a(f5, context);
        }
        ei.add(new a(bVar, context));
    }

    public static void a(b bVar) {
        for (a aVar : ei) {
            if (aVar.ek == bVar) {
                ei.remove(aVar);
            }
        }
        com.kwad.sdk.core.e.c.d("KSFeedShakeManager", "sShakeItems size " + ei.size());
    }

    private static void a(float f5, Context context) {
        eg = new com.kwad.sdk.core.g.d(f5);
        ei = new CopyOnWriteArrayList();
        eg.a(new com.kwad.sdk.core.g.b() { // from class: com.kwad.components.ad.feed.d.1
            @Override // com.kwad.sdk.core.g.b
            public final void a(double d5) {
                if (d.ei != null) {
                    Iterator it2 = d.ei.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        a aVar = (a) it2.next();
                        if (aVar.ek != null && aVar.ek.b(d5)) {
                            bo.a(aVar.mContext, d.C(aVar.mContext));
                            break;
                        }
                    }
                    bo.a(new Runnable() { // from class: com.kwad.components.ad.feed.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.kwad.sdk.core.e.c.d("KSFeedShakeManager", "onShakeEvent openGate2");
                            d.eg.Ge();
                        }
                    }, null, 500L);
                }
            }

            @Override // com.kwad.sdk.core.g.b
            public final void aV() {
            }
        });
        eg.g(f5);
        eg.bv(context);
    }
}
