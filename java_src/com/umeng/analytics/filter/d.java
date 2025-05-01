package com.umeng.analytics.filter;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: SmartDict.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f63272b = "Ă";

    /* renamed from: c  reason: collision with root package name */
    private MessageDigest f63274c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f63276e;

    /* renamed from: a  reason: collision with root package name */
    private final String f63273a = "MD5";

    /* renamed from: d  reason: collision with root package name */
    private Set<Object> f63275d = new HashSet();

    public d(boolean z4, String str) {
        int i4 = 0;
        this.f63276e = false;
        this.f63276e = z4;
        try {
            this.f63274c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
        }
        if (str != null) {
            if (z4) {
                try {
                    byte[] decode = Base64.decode(str.getBytes(), 0);
                    while (i4 < decode.length / 4) {
                        int i5 = i4 * 4;
                        this.f63275d.add(Integer.valueOf(((decode[i5 + 0] & 255) << 24) + ((decode[i5 + 1] & 255) << 16) + ((decode[i5 + 2] & 255) << 8) + (decode[i5 + 3] & 255)));
                        i4++;
                    }
                    return;
                } catch (IllegalArgumentException e6) {
                    e6.printStackTrace();
                    return;
                }
            }
            String[] split = str.split(f63272b);
            int length = split.length;
            while (i4 < length) {
                this.f63275d.add(split[i4]);
                i4++;
            }
        }
    }

    private Integer c(String str) {
        try {
            this.f63274c.update(str.getBytes());
            byte[] digest = this.f63274c.digest();
            return Integer.valueOf(((digest[0] & 255) << 24) + ((digest[1] & 255) << 16) + ((digest[2] & 255) << 8) + (digest[3] & 255));
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public boolean a(String str) {
        if (this.f63276e) {
            return this.f63275d.contains(c(str));
        }
        return this.f63275d.contains(str);
    }

    public void b(String str) {
        if (this.f63276e) {
            this.f63275d.add(c(str));
        } else {
            this.f63275d.add(str);
        }
    }

    public String toString() {
        if (this.f63276e) {
            byte[] bArr = new byte[this.f63275d.size() * 4];
            Iterator<Object> it2 = this.f63275d.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                int intValue = ((Integer) it2.next()).intValue();
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((-16777216) & intValue) >> 24);
                int i6 = i5 + 1;
                bArr[i5] = (byte) ((16711680 & intValue) >> 16);
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((65280 & intValue) >> 8);
                i4 = i7 + 1;
                bArr[i7] = (byte) (intValue & 255);
            }
            return new String(Base64.encode(bArr, 0));
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.f63275d) {
            if (sb.length() > 0) {
                sb.append(f63272b);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public void a() {
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.f63275d) {
            sb.append(obj);
            if (sb.length() > 0) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }
}
