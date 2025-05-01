package com.kwad.sdk.pngencrypt.chunk;
/* loaded from: classes5.dex */
public abstract class p extends PngChunk {
    /* JADX INFO: Access modifiers changed from: protected */
    public p(String str, com.kwad.sdk.pngencrypt.k kVar) {
        super(str, kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p pVar = (p) obj;
            String str = this.ahY;
            if (str == null) {
                if (pVar.ahY != null) {
                    return false;
                }
            } else if (!str.equals(pVar.ahY)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.ahY;
        return (str == null ? 0 : str.hashCode()) + 31;
    }
}
