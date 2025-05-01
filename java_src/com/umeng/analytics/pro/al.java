package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: WeekOnCondition.java */
/* loaded from: classes6.dex */
public class al implements ac {

    /* renamed from: a  reason: collision with root package name */
    private Set<Integer> f63312a;

    public al(Set<Integer> set) {
        this.f63312a = null;
        this.f63312a = new HashSet(set);
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean a() {
        Iterator<Integer> it2;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i4 = 7;
            int i5 = calendar.get(7) - 1;
            if (i5 != 0) {
                i4 = i5;
            }
            Set<Integer> set = this.f63312a;
            if (set == null || !set.contains(Integer.valueOf(i4))) {
                String str = "";
                while (this.f63312a.iterator().hasNext()) {
                    str = str + it2.next() + ",";
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "WeekOn skipped. day of week: " + i4 + "; config: " + str);
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.ac
    public long c() {
        return 0L;
    }
}
