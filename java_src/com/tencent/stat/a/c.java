package com.tencent.stat.a;

import java.util.Arrays;
import java.util.Properties;
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    String f62884a;

    /* renamed from: b  reason: collision with root package name */
    String[] f62885b;

    /* renamed from: c  reason: collision with root package name */
    Properties f62886c;

    public c() {
        this.f62886c = null;
    }

    public c(String str, String[] strArr, Properties properties) {
        this.f62886c = null;
        this.f62884a = str;
        this.f62885b = strArr;
        this.f62886c = properties;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            boolean z4 = this.f62884a.equals(cVar.f62884a) && Arrays.equals(this.f62885b, cVar.f62885b);
            Properties properties = this.f62886c;
            return properties != null ? z4 && properties.equals(cVar.f62886c) : z4 && cVar.f62886c == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f62884a;
        int hashCode = str != null ? str.hashCode() : 0;
        String[] strArr = this.f62885b;
        if (strArr != null) {
            hashCode ^= Arrays.hashCode(strArr);
        }
        Properties properties = this.f62886c;
        return properties != null ? hashCode ^ properties.hashCode() : hashCode;
    }

    public String toString() {
        String str;
        String str2 = this.f62884a;
        String[] strArr = this.f62885b;
        if (strArr != null) {
            String str3 = strArr[0];
            for (int i4 = 1; i4 < this.f62885b.length; i4++) {
                str3 = str3 + "," + this.f62885b[i4];
            }
            str = "[" + str3 + "]";
        } else {
            str = "";
        }
        if (this.f62886c != null) {
            str = str + this.f62886c.toString();
        }
        return str2 + str;
    }
}
