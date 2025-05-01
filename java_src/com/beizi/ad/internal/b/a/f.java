package com.beizi.ad.internal.b.a;

import android.text.TextUtils;
import com.beizi.ad.internal.b.n;
import com.join.mgps.Util.h0;
/* compiled from: Md5FileNameGenerator.java */
/* loaded from: classes2.dex */
public class f implements c {
    private String b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
    }

    @Override // com.beizi.ad.internal.b.a.c
    public String a(String str) {
        String b5 = b(str);
        String d5 = n.d(str);
        if (TextUtils.isEmpty(b5)) {
            return d5;
        }
        return d5 + h0.f27805a + b5;
    }
}
