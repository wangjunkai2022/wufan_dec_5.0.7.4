package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
/* loaded from: classes5.dex */
public class KVPair<T> implements PublicMemberKeeper {
    public final String name;
    public final T value;

    public KVPair(String str, T t4) {
        this.name = str;
        this.value = t4;
    }

    public String toString() {
        return this.name + " = " + this.value;
    }
}
