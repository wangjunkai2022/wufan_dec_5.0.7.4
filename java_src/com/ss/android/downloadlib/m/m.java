package com.ss.android.downloadlib.m;

import androidx.annotation.NonNull;
/* loaded from: classes5.dex */
public class m {
    public void vv(@NonNull final com.ss.android.downloadad.api.vv.m mVar, @NonNull final n nVar, int i4) {
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.m.m.1
            @Override // java.lang.Runnable
            public void run() {
                if (wv.vv(mVar)) {
                    nVar.vv(false);
                } else if (!u.vv(mVar)) {
                    nVar.vv(false);
                } else {
                    u.vv(mVar, new qv() { // from class: com.ss.android.downloadlib.m.m.1.1
                        @Override // com.ss.android.downloadlib.m.qv
                        public void vv(boolean z4) {
                            nVar.vv(z4);
                        }
                    });
                }
            }
        }, i4);
    }
}
