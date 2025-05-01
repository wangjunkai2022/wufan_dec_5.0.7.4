package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
/* loaded from: classes6.dex */
public final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.a<w> implements j<T>, a<T>, kotlinx.coroutines.flow.internal.i<T> {
    @NotNull
    private volatile /* synthetic */ Object _state;

    /* renamed from: f  reason: collision with root package name */
    private int f70840f;

    public StateFlowImpl(@NotNull Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void s() {
    }

    private final boolean t(Object obj, Object obj2) {
        int i4;
        w[] o4;
        o();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i5 = this.f70840f;
            if ((i5 & 1) == 0) {
                int i6 = i5 + 1;
                this.f70840f = i6;
                w[] o5 = o();
                Unit unit = Unit.INSTANCE;
                while (true) {
                    w[] wVarArr = o5;
                    if (wVarArr != null) {
                        int length = wVarArr.length;
                        int i7 = 0;
                        while (i7 < length) {
                            w wVar = wVarArr[i7];
                            i7++;
                            if (wVar != null) {
                                wVar.f();
                            }
                        }
                    }
                    synchronized (this) {
                        i4 = this.f70840f;
                        if (i4 == i6) {
                            this.f70840f = i6 + 1;
                            return true;
                        }
                        o4 = o();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    o5 = o4;
                    i6 = i4;
                }
            } else {
                this.f70840f = i5 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:59:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:59:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:59:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d5 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e7 -> B:34:0x00a6). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.f<? super T> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.a(kotlinx.coroutines.flow.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.i
    public boolean b(T t4) {
        setValue(t4);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.i
    @NotNull
    public e<T> c(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        return v.d(this, coroutineContext, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.j
    public boolean compareAndSet(T t4, T t5) {
        if (t4 == null) {
            t4 = (T) kotlinx.coroutines.flow.internal.l.f71013a;
        }
        if (t5 == null) {
            t5 = (T) kotlinx.coroutines.flow.internal.l.f71013a;
        }
        return t(t4, t5);
    }

    @Override // kotlinx.coroutines.flow.n
    @NotNull
    public List<T> e() {
        List<T> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(getValue());
        return listOf;
    }

    @Override // kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t4, @NotNull Continuation<? super Unit> continuation) {
        setValue(t4);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.i
    public void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.u
    public T getValue() {
        o0 o0Var = kotlinx.coroutines.flow.internal.l.f71013a;
        T t4 = (T) this._state;
        if (t4 == o0Var) {
            return null;
        }
        return t4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @NotNull
    /* renamed from: q */
    public w j() {
        return new w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @NotNull
    /* renamed from: r */
    public w[] k(int i4) {
        return new w[i4];
    }

    @Override // kotlinx.coroutines.flow.j
    public void setValue(T t4) {
        if (t4 == null) {
            t4 = (T) kotlinx.coroutines.flow.internal.l.f71013a;
        }
        t(null, t4);
    }
}
