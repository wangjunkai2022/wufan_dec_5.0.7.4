package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: StackTraceRecovery.kt */
/* loaded from: classes6.dex */
public final class n0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final String f71133a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final String f71134b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* renamed from: c  reason: collision with root package name */
    private static final String f71135c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f71136d;

    static {
        Object m35constructorimpl;
        Object m35constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(Class.forName(f71133a).getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m38exceptionOrNullimpl(m35constructorimpl) != null) {
            m35constructorimpl = f71133a;
        }
        f71135c = (String) m35constructorimpl;
        try {
            Result.Companion companion3 = Result.Companion;
            m35constructorimpl2 = Result.m35constructorimpl(n0.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            m35constructorimpl2 = Result.m35constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m38exceptionOrNullimpl(m35constructorimpl2) != null) {
            m35constructorimpl2 = f71134b;
        }
        f71136d = (String) m35constructorimpl2;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @InternalCoroutinesApi
    @NotNull
    public static final StackTraceElement d(@NotNull String str) {
        return new StackTraceElement(Intrinsics.stringPlus("\b\b\b(", str), "\b", "\b", -1);
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> e(E e5) {
        boolean z4;
        Throwable cause = e5.getCause();
        if (cause != null && Intrinsics.areEqual(cause.getClass(), e5.getClass())) {
            StackTraceElement[] stackTrace = e5.getStackTrace();
            int length = stackTrace.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z4 = false;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i4];
                i4++;
                if (k(stackTraceElement)) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                return TuplesKt.to(cause, stackTrace);
            }
            return TuplesKt.to(e5, new StackTraceElement[0]);
        }
        return TuplesKt.to(e5, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E f(E e5, E e6, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(d("Coroutine boundary"));
        StackTraceElement[] stackTrace = e5.getStackTrace();
        int i4 = i(stackTrace, f71135c);
        int i5 = 0;
        if (i4 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            e6.setStackTrace((StackTraceElement[]) array);
            return e6;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + i4];
        for (int i6 = 0; i6 < i4; i6++) {
            stackTraceElementArr[i6] = stackTrace[i6];
        }
        Iterator<StackTraceElement> it2 = arrayDeque.iterator();
        while (it2.hasNext()) {
            int i7 = i5 + 1;
            stackTraceElementArr[i5 + i4] = it2.next();
            i5 = i7;
        }
        e6.setStackTrace(stackTraceElementArr);
        return e6;
    }

    private static final ArrayDeque<StackTraceElement> g(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean h(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int i(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            if (Intrinsics.areEqual(str, stackTraceElementArr[i4].getClassName())) {
                return i4;
            }
            i4 = i5;
        }
        return -1;
    }

    public static final void j(@NotNull Throwable th, @NotNull Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean k(@NotNull StackTraceElement stackTraceElement) {
        boolean startsWith$default;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
        return startsWith$default;
    }

    private static final void l(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            int i5 = i4 + 1;
            if (k(stackTraceElementArr[i4])) {
                break;
            }
            i4 = i5;
        }
        int i6 = i4 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i6 > length2) {
            return;
        }
        while (true) {
            int i7 = length2 - 1;
            if (h(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i6) {
                return;
            }
            length2 = i7;
        }
    }

    @Nullable
    public static final Object m(@NotNull Throwable th, @NotNull Continuation<?> continuation) {
        if (kotlinx.coroutines.s0.e()) {
            if (continuation instanceof CoroutineStackFrame) {
                throw o(th, (CoroutineStackFrame) continuation);
            }
            throw th;
        }
        throw th;
    }

    private static final Object n(Throwable th, Continuation<?> continuation) {
        if (kotlinx.coroutines.s0.e()) {
            InlineMarker.mark(0);
            if (continuation instanceof CoroutineStackFrame) {
                throw o(th, (CoroutineStackFrame) continuation);
            }
            throw th;
        }
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E o(E e5, CoroutineStackFrame coroutineStackFrame) {
        Pair e6 = e(e5);
        Throwable th = (Throwable) e6.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e6.component2();
        Throwable s4 = s(th);
        if (s4 == null) {
            return e5;
        }
        ArrayDeque<StackTraceElement> g4 = g(coroutineStackFrame);
        if (g4.isEmpty()) {
            return e5;
        }
        if (th != e5) {
            l(stackTraceElementArr, g4);
        }
        return (E) f(th, s4, g4);
    }

    @NotNull
    public static final <E extends Throwable> E p(@NotNull E e5) {
        Throwable s4;
        return (kotlinx.coroutines.s0.e() && (s4 = s(e5)) != null) ? (E) r(s4) : e5;
    }

    @NotNull
    public static final <E extends Throwable> E q(@NotNull E e5, @NotNull Continuation<?> continuation) {
        return (kotlinx.coroutines.s0.e() && (continuation instanceof CoroutineStackFrame)) ? (E) o(e5, (CoroutineStackFrame) continuation) : e5;
    }

    private static final <E extends Throwable> E r(E e5) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e5.getStackTrace();
        int length = stackTrace.length;
        int i4 = i(stackTrace, f71136d);
        int i5 = i4 + 1;
        int i6 = i(stackTrace, f71135c);
        int i7 = (length - i4) - (i6 == -1 ? 0 : length - i6);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 == 0) {
                stackTraceElement = d("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i5 + i8) - 1];
            }
            stackTraceElementArr[i8] = stackTraceElement;
        }
        e5.setStackTrace(stackTraceElementArr);
        return e5;
    }

    private static final <E extends Throwable> E s(E e5) {
        E e6 = (E) ExceptionsConstructorKt.h(e5);
        if (e6 == null) {
            return null;
        }
        if ((e5 instanceof kotlinx.coroutines.k0) || Intrinsics.areEqual(e6.getMessage(), e5.getMessage())) {
            return e6;
        }
        return null;
    }

    @NotNull
    public static final <E extends Throwable> E t(@NotNull E e5) {
        return !kotlinx.coroutines.s0.e() ? e5 : (E) u(e5);
    }

    @NotNull
    public static final <E extends Throwable> E u(@NotNull E e5) {
        E e6 = (E) e5.getCause();
        if (e6 != null && Intrinsics.areEqual(e6.getClass(), e5.getClass())) {
            StackTraceElement[] stackTrace = e5.getStackTrace();
            int length = stackTrace.length;
            boolean z4 = false;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i4];
                i4++;
                if (k(stackTraceElement)) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                return e6;
            }
        }
        return e5;
    }
}
