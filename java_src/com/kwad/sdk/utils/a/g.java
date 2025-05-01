package com.kwad.sdk.utils.a;

import com.kwad.sdk.utils.a.c;
import java.util.LinkedHashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class g implements c.b<Set<String>> {
    static final g aTn = new g();

    private g() {
    }

    private static byte[] e(Set<String> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i4 = 0;
        int i5 = 0;
        for (String str : set) {
            if (str == null) {
                i4 += 5;
                iArr[i5] = -1;
            } else {
                int hn = b.hn(str);
                strArr[i5] = str;
                iArr[i5] = hn;
                i4 += b.ek(hn) + hn;
            }
            i5++;
        }
        b bVar = new b(i4);
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = iArr[i6];
            bVar.ej(i7);
            if (i7 >= 0) {
                bVar.hm(strArr[i6]);
            }
        }
        return bVar.aSv;
    }

    private static Set<String> h(byte[] bArr, int i4, int i5) {
        int i6;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i5 > 0) {
            b bVar = new b(bArr, i4);
            int i7 = i4 + i5;
            while (true) {
                i6 = bVar.position;
                if (i6 >= i7) {
                    break;
                }
                linkedHashSet.add(bVar.getString(bVar.Of()));
            }
            if (i6 != i7) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // com.kwad.sdk.utils.a.c.b
    public final String Oz() {
        return "StringSet";
    }

    @Override // com.kwad.sdk.utils.a.c.b
    public final /* synthetic */ Set<String> g(byte[] bArr, int i4, int i5) {
        return h(bArr, i4, i5);
    }

    @Override // com.kwad.sdk.utils.a.c.b
    public final /* synthetic */ byte[] m(Set<String> set) {
        return e(set);
    }
}
