package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.JvmField;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.j2;
import org.jetbrains.annotations.NotNull;
/* compiled from: MainDispatchers.kt */
/* loaded from: classes6.dex */
public final class c0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f71102a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f71103b;
    @JvmField
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final j2 f71104c;

    static {
        c0 c0Var = new c0();
        f71102a = c0Var;
        f71103b = q0.e("kotlinx.coroutines.fast.service.loader", true);
        f71104c = c0Var.a();
    }

    private c0() {
    }

    private final j2 a() {
        Sequence asSequence;
        List<b0> list;
        Object next;
        try {
            if (f71103b) {
                list = n.f71131a.d();
            } else {
                asSequence = SequencesKt__SequencesKt.asSequence(ServiceLoader.load(b0.class, b0.class.getClassLoader()).iterator());
                list = SequencesKt___SequencesKt.toList(asSequence);
            }
            Iterator<T> it2 = list.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int loadPriority = ((b0) next).getLoadPriority();
                    do {
                        Object next2 = it2.next();
                        int loadPriority2 = ((b0) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            b0 b0Var = (b0) next;
            j2 f5 = b0Var == null ? null : d0.f(b0Var, list);
            return f5 == null ? d0.b(null, null, 3, null) : f5;
        } catch (Throwable th) {
            return d0.b(th, null, 2, null);
        }
    }
}
