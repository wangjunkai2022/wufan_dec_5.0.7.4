package kotlinx.coroutines.channels;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: LinkedListChannel.kt */
/* loaded from: classes6.dex */
public class u<E> extends AbstractChannel<E> {
    public u(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.b
    @NotNull
    public Object C(E e5) {
        y<?> K;
        do {
            Object C = super.C(e5);
            o0 o0Var = a.f69942d;
            if (C == o0Var) {
                return o0Var;
            }
            if (C == a.f69943e) {
                K = K(e5);
                if (K == null) {
                    return o0Var;
                }
            } else if (C instanceof p) {
                return C;
            } else {
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid offerInternal result ", C).toString());
            }
        } while (!(K instanceof p));
        return K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.b
    @NotNull
    public Object D(E e5, @NotNull kotlinx.coroutines.selects.f<?> fVar) {
        Object u4;
        while (true) {
            if (d0()) {
                u4 = super.D(e5, fVar);
            } else {
                u4 = fVar.u(i(e5));
                if (u4 == null) {
                    u4 = a.f69942d;
                }
            }
            if (u4 == kotlinx.coroutines.selects.g.d()) {
                return kotlinx.coroutines.selects.g.d();
            }
            o0 o0Var = a.f69942d;
            if (u4 == o0Var) {
                return o0Var;
            }
            if (u4 != a.f69943e && u4 != kotlinx.coroutines.internal.c.f71101b) {
                if (u4 instanceof p) {
                    return u4;
                }
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid result ", u4).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean e0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean f0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected void i0(@NotNull Object obj, @NotNull p<?> pVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                a0 a0Var = (a0) obj;
                if (a0Var instanceof b.a) {
                    Function1<E, Unit> function1 = this.f69948b;
                    if (function1 != null) {
                        undeliveredElementException = OnUndeliveredElementKt.c(function1, ((b.a) a0Var).f69950e, null);
                    }
                } else {
                    a0Var.g0(pVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    UndeliveredElementException undeliveredElementException2 = null;
                    while (true) {
                        int i4 = size - 1;
                        a0 a0Var2 = (a0) arrayList.get(size);
                        if (a0Var2 instanceof b.a) {
                            Function1<E, Unit> function12 = this.f69948b;
                            undeliveredElementException2 = function12 == null ? null : OnUndeliveredElementKt.c(function12, ((b.a) a0Var2).f69950e, undeliveredElementException2);
                        } else {
                            a0Var2.g0(pVar);
                        }
                        if (i4 < 0) {
                            break;
                        }
                        size = i4;
                    }
                    undeliveredElementException = undeliveredElementException2;
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean z() {
        return false;
    }
}
