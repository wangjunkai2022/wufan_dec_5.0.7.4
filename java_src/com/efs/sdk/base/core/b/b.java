package com.efs.sdk.base.core.b;

import androidx.annotation.Nullable;
import com.efs.sdk.base.core.util.Log;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Byte, e> f10290a = new ConcurrentHashMap<>();

    @Nullable
    public final e a(byte b5) {
        if (!this.f10290a.containsKey(Byte.valueOf(b5))) {
            if (b5 == 1) {
                this.f10290a.putIfAbsent(Byte.valueOf(b5), new g());
            } else if (b5 != 2) {
                Log.w("efs.cache", "Cache module not support protocol ".concat(String.valueOf((int) b5)));
            } else {
                this.f10290a.putIfAbsent(Byte.valueOf(b5), new d());
            }
        }
        return this.f10290a.get(Byte.valueOf(b5));
    }
}
