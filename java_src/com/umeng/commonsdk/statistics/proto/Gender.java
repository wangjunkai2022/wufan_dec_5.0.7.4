package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bz;
/* loaded from: classes6.dex */
public enum Gender implements bz {
    MALE(0),
    FEMALE(1),
    UNKNOWN(2);
    
    private final int value;

    Gender(int i4) {
        this.value = i4;
    }

    public static Gender findByValue(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return null;
                }
                return UNKNOWN;
            }
            return FEMALE;
        }
        return MALE;
    }

    @Override // com.umeng.analytics.pro.bz
    public int getValue() {
        return this.value;
    }
}
