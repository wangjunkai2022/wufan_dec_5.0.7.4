package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: TimePeriodChain.java */
/* loaded from: classes6.dex */
public class aj {

    /* renamed from: a  reason: collision with root package name */
    private String f63305a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<ak> f63306b = new ArrayList<>();

    public aj(String str) {
        this.f63305a = "";
        this.f63305a = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a();
    }

    private void a() {
        String[] split;
        try {
            if (this.f63305a.contains(",")) {
                for (String str : this.f63305a.split(",")) {
                    if (!TextUtils.isEmpty(str)) {
                        String trim = str.trim();
                        if (this.f63306b != null) {
                            this.f63306b.add(new ak(trim));
                        }
                    }
                }
                return;
            }
            String str2 = this.f63305a;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String trim2 = str2.trim();
            if (this.f63306b != null) {
                this.f63306b.add(new ak(trim2));
            }
        } catch (Throwable unused) {
        }
    }

    public boolean a(int i4) {
        try {
            ArrayList<ak> arrayList = this.f63306b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ak akVar = this.f63306b.get(i5);
                    if (akVar != null && akVar.a(i4)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
