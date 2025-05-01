package com.kwad.library.solder.lib.c;

import androidx.annotation.NonNull;
/* loaded from: classes5.dex */
public final class a implements Comparable<a> {
    public String akV;
    public boolean qt;
    public String version;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(@NonNull a aVar) {
        return aVar.version.compareTo(this.version);
    }
}
