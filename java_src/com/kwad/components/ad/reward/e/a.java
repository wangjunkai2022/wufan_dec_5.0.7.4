package com.kwad.components.ad.reward.e;
/* loaded from: classes5.dex */
public abstract class a implements g {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(g gVar) {
        return getPriority() - gVar.getPriority();
    }

    @Override // com.kwad.components.ad.reward.e.g
    public int getPriority() {
        return 0;
    }
}
