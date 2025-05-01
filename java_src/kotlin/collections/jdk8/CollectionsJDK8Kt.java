package kotlin.collections.jdk8;

import j1.b;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
/* compiled from: Collections.kt */
@JvmName(name = "CollectionsJDK8Kt")
/* loaded from: classes6.dex */
public final class CollectionsJDK8Kt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = b.f69563b)
    @InlineOnly
    private static final <K, V> V getOrDefault(Map<? extends K, ? extends V> map, K k4, V v2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.getOrDefault(k4, v2);
    }

    @SinceKotlin(version = b.f69563b)
    @InlineOnly
    private static final <K, V> boolean remove(Map<? extends K, ? extends V> map, K k4, V v2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return TypeIntrinsics.asMutableMap(map).remove(k4, v2);
    }
}
