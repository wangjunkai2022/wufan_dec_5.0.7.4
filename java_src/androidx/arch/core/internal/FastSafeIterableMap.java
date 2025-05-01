package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    private HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap = new HashMap<>();

    public Map.Entry<K, V> ceil(K k4) {
        if (contains(k4)) {
            return this.mHashMap.get(k4).mPrevious;
        }
        return null;
    }

    public boolean contains(K k4) {
        return this.mHashMap.containsKey(k4);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    protected SafeIterableMap.Entry<K, V> get(K k4) {
        return this.mHashMap.get(k4);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(@NonNull K k4, @NonNull V v2) {
        SafeIterableMap.Entry<K, V> entry = get(k4);
        if (entry != null) {
            return entry.mValue;
        }
        this.mHashMap.put(k4, put(k4, v2));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(@NonNull K k4) {
        V v2 = (V) super.remove(k4);
        this.mHashMap.remove(k4);
        return v2;
    }
}
