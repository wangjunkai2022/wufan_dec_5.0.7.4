package com.kwad.framework.filedownloader;

import android.os.Handler;
import android.util.SparseArray;
import java.util.List;
/* loaded from: classes5.dex */
final class ab implements w {
    private final SparseArray<Handler> afX = new SparseArray<>();

    private static void a(Handler handler) {
        handler.sendEmptyMessage(2);
    }

    private static void b(Handler handler) {
        handler.sendEmptyMessage(3);
    }

    @Override // com.kwad.framework.filedownloader.w
    public final boolean bh(int i4) {
        return this.afX.get(i4) != null;
    }

    @Override // com.kwad.framework.filedownloader.w
    public final void p(List<Integer> list) {
        for (Integer num : list) {
            b(this.afX.get(num.intValue()));
        }
    }

    @Override // com.kwad.framework.filedownloader.w
    public final void vE() {
        for (int i4 = 0; i4 < this.afX.size(); i4++) {
            a(this.afX.get(this.afX.keyAt(i4)));
        }
    }

    @Override // com.kwad.framework.filedownloader.w
    public final int vF() {
        return this.afX.size();
    }
}
