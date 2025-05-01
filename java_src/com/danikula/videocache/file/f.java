package com.danikula.videocache.file;

import android.text.TextUtils;
import com.danikula.videocache.p;
import com.join.mgps.Util.h0;
/* compiled from: Md5FileNameGenerator.java */
/* loaded from: classes2.dex */
public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final int f10072a = 4;

    private String a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
    }

    @Override // com.danikula.videocache.file.c
    public String generate(String str) {
        String a5 = a(str);
        String d5 = p.d(str);
        if (TextUtils.isEmpty(a5)) {
            return d5;
        }
        return d5 + h0.f27805a + a5;
    }
}
