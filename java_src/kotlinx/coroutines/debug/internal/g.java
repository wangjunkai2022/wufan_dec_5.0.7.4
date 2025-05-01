package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;
/* compiled from: ConcurrentWeakMap.kt */
/* loaded from: classes6.dex */
public final class g<T> extends WeakReference<T> {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public final int f70105a;

    public g(T t4, @Nullable ReferenceQueue<T> referenceQueue) {
        super(t4, referenceQueue);
        this.f70105a = t4 == null ? 0 : t4.hashCode();
    }
}
