package com.kwad.sdk.core.report;

import androidx.annotation.NonNull;
import com.kwad.sdk.core.report.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public final class m<T extends e> implements l<T> {
    private final Map<String, T> ayU = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.report.l
    /* renamed from: b */
    public synchronized void j(@NonNull T t4) {
        this.ayU.put(t4.actionId, t4);
    }

    @Override // com.kwad.sdk.core.report.l
    public final synchronized List<T> Fs() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.ayU.size());
        for (Map.Entry<String, T> entry : this.ayU.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    @Override // com.kwad.sdk.core.report.l
    public final synchronized long size() {
        int size;
        size = this.ayU.size();
        com.kwad.sdk.core.e.c.d("MemReportCache", "size() = " + size);
        return size;
    }

    @Override // com.kwad.sdk.core.report.l
    public final synchronized void x(List<T> list) {
        for (T t4 : list) {
            if (t4 != null) {
                this.ayU.remove(t4.actionId);
            }
        }
    }
}
