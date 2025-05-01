package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: HourOnCondition.java */
/* loaded from: classes6.dex */
public class af implements ac {

    /* renamed from: a  reason: collision with root package name */
    private Set<Integer> f63301a;

    public af(Set<Integer> set) {
        this.f63301a = null;
        this.f63301a = new HashSet(set);
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean a() {
        Iterator<Integer> it2;
        try {
            int i4 = Calendar.getInstance().get(11);
            Set<Integer> set = this.f63301a;
            if (set == null || !set.contains(Integer.valueOf(i4))) {
                String str = "";
                while (this.f63301a.iterator().hasNext()) {
                    str = str + it2.next() + ",";
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "HourOn skipped. hour of day: " + i4 + "; config: " + str);
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
