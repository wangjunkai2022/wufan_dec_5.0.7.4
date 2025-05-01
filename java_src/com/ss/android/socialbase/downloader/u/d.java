package com.ss.android.socialbase.downloader.u;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.join.mgps.Util.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: i  reason: collision with root package name */
    final boolean f61387i;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicLong f61388k;

    /* renamed from: m  reason: collision with root package name */
    final String f61389m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f61390n;

    /* renamed from: o  reason: collision with root package name */
    private final List<r> f61391o;

    /* renamed from: p  reason: collision with root package name */
    final String f61392p;
    private int qv;

    /* renamed from: u  reason: collision with root package name */
    private int f61393u;
    final String vv;
    private String wv;

    public d(String str, boolean z4) {
        this.f61391o = new ArrayList();
        this.f61388k = new AtomicLong();
        this.vv = str;
        this.f61387i = z4;
        this.f61389m = null;
        this.f61392p = null;
    }

    private String o() {
        if (this.wv == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.vv);
            sb.append("_");
            String str = this.f61389m;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("_");
            sb.append(this.f61387i);
            this.wv = sb.toString();
        }
        return this.wv;
    }

    private String vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int lastIndexOf = str.lastIndexOf(h0.f27805a);
            if (lastIndexOf <= 0 || lastIndexOf >= str.length()) {
                return null;
            }
            return str.substring(0, lastIndexOf);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return o().equals(((d) obj).o());
        }
        return false;
    }

    public int hashCode() {
        if (this.qv == 0) {
            this.qv = o().hashCode();
        }
        return this.qv;
    }

    public synchronized boolean i() {
        return this.f61390n;
    }

    public synchronized void m(r rVar) {
        try {
            this.f61391o.remove(rVar);
        } catch (Throwable unused) {
        }
    }

    public synchronized void p() {
        this.f61390n = false;
    }

    public String toString() {
        return "UrlRecord{url='" + this.vv + "', ip='" + this.f61389m + "', ipFamily='" + this.f61392p + "', isMainUrl=" + this.f61387i + ", failedTimes=" + this.f61393u + ", isCurrentFailed=" + this.f61390n + '}';
    }

    public synchronized void m() {
        this.f61393u++;
        this.f61390n = true;
    }

    public synchronized void vv(r rVar) {
        this.f61391o.add(rVar);
    }

    public d(String str, String str2) {
        this.f61391o = new ArrayList();
        this.f61388k = new AtomicLong();
        this.vv = str;
        this.f61387i = false;
        this.f61389m = str2;
        this.f61392p = vv(str2);
    }

    public synchronized int vv() {
        return this.f61391o.size();
    }

    public void vv(long j4) {
        this.f61388k.addAndGet(j4);
    }
}
