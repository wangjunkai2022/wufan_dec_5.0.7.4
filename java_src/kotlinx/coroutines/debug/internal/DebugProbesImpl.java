package kotlinx.coroutines.debug.internal;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.coroutines.internal.k0;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DebugProbesImpl.kt */
/* loaded from: classes6.dex */
public final class DebugProbesImpl {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final DebugProbesImpl f70061a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final String f70062b = "Coroutine creation stacktrace";
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final SimpleDateFormat f70063c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private static Thread f70064d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentWeakMap<a<?>, Boolean> f70065e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ e f70066f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f70067g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private static final ReentrantReadWriteLock f70068h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f70069i;
    private static volatile int installations;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f70070j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final Function1<Boolean, Unit> f70071k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private static final ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> f70072l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DebugProbesImpl.kt */
    /* loaded from: classes6.dex */
    public static final class a<T> implements Continuation<T>, CoroutineStackFrame {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final Continuation<T> f70073b;
        @JvmField
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final DebugCoroutineInfoImpl f70074c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        private final CoroutineStackFrame f70075d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Continuation<? super T> continuation, @NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl, @Nullable CoroutineStackFrame coroutineStackFrame) {
            this.f70073b = continuation;
            this.f70074c = debugCoroutineInfoImpl;
            this.f70075d = coroutineStackFrame;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public CoroutineStackFrame getCallerFrame() {
            CoroutineStackFrame coroutineStackFrame = this.f70075d;
            if (coroutineStackFrame == null) {
                return null;
            }
            return coroutineStackFrame.getCallerFrame();
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return this.f70073b.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public StackTraceElement getStackTraceElement() {
            CoroutineStackFrame coroutineStackFrame = this.f70075d;
            if (coroutineStackFrame == null) {
                return null;
            }
            return coroutineStackFrame.getStackTraceElement();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            DebugProbesImpl.f70061a.E(this);
            this.f70073b.resumeWith(obj);
        }

        @NotNull
        public String toString() {
            return this.f70073b.toString();
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes6.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((a) t4).f70074c.f70046b), Long.valueOf(((a) t5).f70074c.f70046b));
            return compareValues;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes6.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((a) t4).f70074c.f70046b), Long.valueOf(((a) t5).f70074c.f70046b));
            return compareValues;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.debug.internal.e] */
    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        f70061a = debugProbesImpl;
        f70063c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f70065e = new ConcurrentWeakMap<>(false, 1, null);
        f70066f = new Object(0L) { // from class: kotlinx.coroutines.debug.internal.e
            volatile long sequenceNumber;

            {
                this.sequenceNumber = r1;
            }
        };
        f70068h = new ReentrantReadWriteLock();
        f70069i = true;
        f70070j = true;
        f70071k = debugProbesImpl.t();
        f70072l = new ConcurrentWeakMap<>(true);
        f70067g = AtomicLongFieldUpdater.newUpdater(e.class, "sequenceNumber");
    }

    private DebugProbesImpl() {
    }

    private final boolean A(StackTraceElement stackTraceElement) {
        boolean startsWith$default;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
        return startsWith$default;
    }

    private final a<?> B(Continuation<?> continuation) {
        CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame == null) {
            return null;
        }
        return C(coroutineStackFrame);
    }

    private final a<?> C(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof a)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (a) coroutineStackFrame;
    }

    private final void D(PrintStream printStream, List<StackTraceElement> list) {
        for (StackTraceElement stackTraceElement : list) {
            printStream.print(Intrinsics.stringPlus("\n\tat ", stackTraceElement));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(a<?> aVar) {
        f70065e.remove(aVar);
        CoroutineStackFrame e5 = aVar.f70074c.e();
        CoroutineStackFrame I = e5 == null ? null : I(e5);
        if (I == null) {
            return;
        }
        f70072l.remove(I);
    }

    private final CoroutineStackFrame I(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    private final <T extends Throwable> List<StackTraceElement> J(T t4) {
        StackTraceElement[] stackTrace = t4.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i5 = length2 - 1;
                if (Intrinsics.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i4 = length2;
                    break;
                } else if (i5 < 0) {
                    break;
                } else {
                    length2 = i5;
                }
            }
        }
        if (!f70069i) {
            int i6 = length - i4;
            ArrayList arrayList = new ArrayList(i6);
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i7 + 1;
                arrayList.add(i7 == 0 ? n0.d(f70062b) : stackTrace[i7 + i4]);
                i7 = i8;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i4) + 1);
        arrayList2.add(n0.d(f70062b));
        while (true) {
            i4++;
            while (i4 < length) {
                if (A(stackTrace[i4])) {
                    arrayList2.add(stackTrace[i4]);
                    int i9 = i4 + 1;
                    while (i9 < length && A(stackTrace[i9])) {
                        i9++;
                    }
                    int i10 = i9 - 1;
                    int i11 = i10;
                    while (i11 > i4 && stackTrace[i11].getFileName() == null) {
                        i11--;
                    }
                    if (i11 > i4 && i11 < i10) {
                        arrayList2.add(stackTrace[i11]);
                    }
                    arrayList2.add(stackTrace[i10]);
                    i4 = i9;
                }
            }
            return arrayList2;
            arrayList2.add(stackTrace[i4]);
        }
    }

    private final void M() {
        Thread thread;
        thread = ThreadsKt.thread((r12 & 1) != 0, (r12 & 2) != 0 ? false : true, (r12 & 4) != 0 ? null : null, (r12 & 8) != 0 ? null : "Coroutines Debugger Cleaner", (r12 & 16) != 0 ? -1 : 0, new Function0<Unit>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$startWeakRefCleanerThread$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ConcurrentWeakMap concurrentWeakMap;
                concurrentWeakMap = DebugProbesImpl.f70072l;
                concurrentWeakMap.f();
            }
        });
        f70064d = thread;
    }

    private final void N() {
        Thread thread = f70064d;
        if (thread == null) {
            return;
        }
        f70064d = null;
        thread.interrupt();
        thread.join();
    }

    private final i O(List<StackTraceElement> list) {
        i iVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                iVar = new i(iVar, listIterator.previous());
            }
        }
        return iVar;
    }

    private final String P(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append(obj);
        sb.append('\"');
        return sb.toString();
    }

    private final void R(CoroutineStackFrame coroutineStackFrame, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f70068h.readLock();
        readLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f70061a;
            if (debugProbesImpl.z()) {
                ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> concurrentWeakMap = f70072l;
                DebugCoroutineInfoImpl remove = concurrentWeakMap.remove(coroutineStackFrame);
                if (remove == null) {
                    a<?> C = debugProbesImpl.C(coroutineStackFrame);
                    CoroutineStackFrame coroutineStackFrame2 = null;
                    remove = C == null ? null : C.f70074c;
                    if (remove == null) {
                        return;
                    }
                    CoroutineStackFrame e5 = remove.e();
                    if (e5 != null) {
                        coroutineStackFrame2 = debugProbesImpl.I(e5);
                    }
                    if (coroutineStackFrame2 != null) {
                        concurrentWeakMap.remove(coroutineStackFrame2);
                    }
                }
                remove.i(str, (Continuation) coroutineStackFrame);
                CoroutineStackFrame I = debugProbesImpl.I(coroutineStackFrame);
                if (I == null) {
                    return;
                }
                concurrentWeakMap.put(I, remove);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            readLock.unlock();
        }
    }

    private final void S(Continuation<?> continuation, String str) {
        if (z()) {
            if (Intrinsics.areEqual(str, d.f70103b) && KotlinVersion.CURRENT.isAtLeast(1, 3, 30)) {
                CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                R(coroutineStackFrame, str);
                return;
            }
            a<?> B = B(continuation);
            if (B == null) {
                return;
            }
            T(B, continuation, str);
        }
    }

    private final void T(a<?> aVar, Continuation<?> continuation, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f70068h.readLock();
        readLock.lock();
        try {
            if (f70061a.z()) {
                aVar.f70074c.i(str, continuation);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            readLock.unlock();
        }
    }

    private final void d(z1 z1Var, Map<z1, DebugCoroutineInfoImpl> map, StringBuilder sb, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(z1Var);
        if (debugCoroutineInfoImpl == null) {
            if (!(z1Var instanceof k0)) {
                sb.append(str + r(z1Var) + '\n');
                str = Intrinsics.stringPlus(str, "\t");
            }
        } else {
            String f5 = debugCoroutineInfoImpl.f();
            sb.append(str + r(z1Var) + ", continuation is " + f5 + " at line " + ((StackTraceElement) CollectionsKt.firstOrNull((List<? extends Object>) debugCoroutineInfoImpl.g())) + '\n');
            str = Intrinsics.stringPlus(str, "\t");
        }
        for (z1 z1Var2 : z1Var.j()) {
            d(z1Var2, map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Continuation<T> e(Continuation<? super T> continuation, i iVar) {
        if (z()) {
            a<?> aVar = new a<>(continuation, new DebugCoroutineInfoImpl(continuation.getContext(), iVar, f70067g.incrementAndGet(f70066f)), iVar);
            ConcurrentWeakMap<a<?>, Boolean> concurrentWeakMap = f70065e;
            concurrentWeakMap.put(aVar, Boolean.TRUE);
            if (!z()) {
                concurrentWeakMap.clear();
            }
            return aVar;
        }
        return continuation;
    }

    private final <R> List<R> i(final Function2<? super a<?>, ? super CoroutineContext, ? extends R> function2) {
        Sequence asSequence;
        Sequence sortedWith;
        Sequence mapNotNull;
        List<R> list;
        ReentrantReadWriteLock reentrantReadWriteLock = f70068h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i4 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i5 = 0;
        while (i5 < readHoldCount) {
            i5++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f70061a;
            if (debugProbesImpl.z()) {
                asSequence = CollectionsKt___CollectionsKt.asSequence(debugProbesImpl.q());
                sortedWith = SequencesKt___SequencesKt.sortedWith(asSequence, new b());
                mapNotNull = SequencesKt___SequencesKt.mapNotNull(sortedWith, new Function1<a<?>, R>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    /* renamed from: a */
                    public final R invoke(@NotNull DebugProbesImpl.a<?> aVar) {
                        boolean y2;
                        CoroutineContext context;
                        y2 = DebugProbesImpl.f70061a.y(aVar);
                        if (y2 || (context = aVar.f70074c.getContext()) == null) {
                            return null;
                        }
                        return function2.invoke(aVar, context);
                    }
                });
                list = SequencesKt___SequencesKt.toList(mapNotNull);
                return list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            InlineMarker.finallyStart(1);
            while (i4 < readHoldCount) {
                i4++;
                readLock.lock();
            }
            writeLock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    private final void j(PrintStream printStream) {
        Sequence asSequence;
        Sequence filter;
        Sequence<a> sortedWith;
        String f5;
        ReentrantReadWriteLock reentrantReadWriteLock = f70068h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i4 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i5 = 0;
        while (i5 < readHoldCount) {
            i5++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f70061a;
            if (debugProbesImpl.z()) {
                printStream.print(Intrinsics.stringPlus("Coroutines dump ", f70063c.format(Long.valueOf(System.currentTimeMillis()))));
                asSequence = CollectionsKt___CollectionsKt.asSequence(debugProbesImpl.q());
                filter = SequencesKt___SequencesKt.filter(asSequence, new Function1<a<?>, Boolean>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$1$2
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    /* renamed from: a */
                    public final Boolean invoke(@NotNull DebugProbesImpl.a<?> aVar) {
                        boolean y2;
                        y2 = DebugProbesImpl.f70061a.y(aVar);
                        return Boolean.valueOf(!y2);
                    }
                });
                sortedWith = SequencesKt___SequencesKt.sortedWith(filter, new c());
                for (a aVar : sortedWith) {
                    DebugCoroutineInfoImpl debugCoroutineInfoImpl = aVar.f70074c;
                    List<StackTraceElement> g4 = debugCoroutineInfoImpl.g();
                    DebugProbesImpl debugProbesImpl2 = f70061a;
                    List<StackTraceElement> n4 = debugProbesImpl2.n(debugCoroutineInfoImpl.f(), debugCoroutineInfoImpl.f70049e, g4);
                    if (Intrinsics.areEqual(debugCoroutineInfoImpl.f(), d.f70103b) && n4 == g4) {
                        f5 = Intrinsics.stringPlus(debugCoroutineInfoImpl.f(), " (Last suspension stacktrace, not an actual stacktrace)");
                    } else {
                        f5 = debugCoroutineInfoImpl.f();
                    }
                    printStream.print("\n\nCoroutine " + aVar.f70073b + ", state: " + f5);
                    if (g4.isEmpty()) {
                        printStream.print(Intrinsics.stringPlus("\n\tat ", n0.d(f70062b)));
                        debugProbesImpl2.D(printStream, debugCoroutineInfoImpl.d());
                    } else {
                        debugProbesImpl2.D(printStream, n4);
                    }
                }
                Unit unit = Unit.INSTANCE;
                return;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i4 < readHoldCount) {
                i4++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    private final List<StackTraceElement> n(String str, Thread thread, List<StackTraceElement> list) {
        Object m35constructorimpl;
        if (!Intrinsics.areEqual(str, d.f70103b) || thread == null) {
            return list;
        }
        try {
            Result.Companion companion = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(thread.getStackTrace());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m41isFailureimpl(m35constructorimpl)) {
            m35constructorimpl = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m35constructorimpl;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            int i5 = i4 + 1;
            StackTraceElement stackTraceElement = stackTraceElementArr[i4];
            if (Intrinsics.areEqual(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i4 = i5;
        }
        Pair<Integer, Integer> o4 = o(i4, stackTraceElementArr, list);
        int intValue = o4.component1().intValue();
        int intValue2 = o4.component2().intValue();
        if (intValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i4) - intValue) - 1) - intValue2);
        int i6 = i4 - intValue2;
        for (int i7 = 0; i7 < i6; i7++) {
            arrayList.add(stackTraceElementArr[i7]);
        }
        int size = list.size();
        for (int i8 = intValue + 1; i8 < size; i8++) {
            arrayList.add(list.get(i8));
        }
        return arrayList;
    }

    private final Pair<Integer, Integer> o(int i4, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        int i5 = 0;
        while (i5 < 3) {
            int i6 = i5 + 1;
            int p4 = f70061a.p((i4 - 1) - i5, stackTraceElementArr, list);
            if (p4 != -1) {
                return TuplesKt.to(Integer.valueOf(p4), Integer.valueOf(i5));
            }
            i5 = i6;
        }
        return TuplesKt.to(-1, 0);
    }

    private final int p(int i4, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.getOrNull(stackTraceElementArr, i4);
        if (stackTraceElement == null) {
            return -1;
        }
        int i5 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    private final Set<a<?>> q() {
        return f70065e.keySet();
    }

    private final String r(z1 z1Var) {
        return z1Var instanceof JobSupport ? ((JobSupport) z1Var).m1() : z1Var.toString();
    }

    private static /* synthetic */ void s(z1 z1Var) {
    }

    private final Function1<Boolean, Unit> t() {
        Object m35constructorimpl;
        Object newInstance;
        try {
            Result.Companion companion = Result.Companion;
            newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        if (newInstance != null) {
            m35constructorimpl = Result.m35constructorimpl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(newInstance, 1));
            if (Result.m41isFailureimpl(m35constructorimpl)) {
                m35constructorimpl = null;
            }
            return (Function1) m35constructorimpl;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y(a<?> aVar) {
        CoroutineContext context = aVar.f70074c.getContext();
        z1 z1Var = context == null ? null : (z1) context.get(z1.f71466g1);
        if (z1Var != null && z1Var.isCompleted()) {
            f70065e.remove(aVar);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> Continuation<T> F(@NotNull Continuation<? super T> continuation) {
        if (z() && B(continuation) == null) {
            return e(continuation, f70070j ? O(J(new Exception())) : null);
        }
        return continuation;
    }

    public final void G(@NotNull Continuation<?> continuation) {
        S(continuation, d.f70103b);
    }

    public final void H(@NotNull Continuation<?> continuation) {
        S(continuation, d.f70104c);
    }

    public final void K(boolean z4) {
        f70070j = z4;
    }

    public final void L(boolean z4) {
        f70069i = z4;
    }

    public final void Q() {
        ReentrantReadWriteLock reentrantReadWriteLock = f70068h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i4 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i5 = 0;
        while (i5 < readHoldCount) {
            i5++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f70061a;
            if (debugProbesImpl.z()) {
                installations--;
                if (installations != 0) {
                    return;
                }
                debugProbesImpl.N();
                f70065e.clear();
                f70072l.clear();
                if (kotlinx.coroutines.debug.internal.a.f70087a.a()) {
                    while (i4 < readHoldCount) {
                        i4++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                    return;
                }
                Function1<Boolean, Unit> function1 = f70071k;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
                Unit unit = Unit.INSTANCE;
                while (i4 < readHoldCount) {
                    i4++;
                    readLock.lock();
                }
                writeLock.unlock();
                return;
            }
            throw new IllegalStateException("Agent was not installed".toString());
        } finally {
            while (i4 < readHoldCount) {
                i4++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    public final void f(@NotNull PrintStream printStream) {
        synchronized (printStream) {
            f70061a.j(printStream);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final List<kotlinx.coroutines.debug.internal.c> g() {
        Sequence asSequence;
        Sequence sortedWith;
        Sequence mapNotNull;
        List<kotlinx.coroutines.debug.internal.c> list;
        ReentrantReadWriteLock reentrantReadWriteLock = f70068h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i4 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i5 = 0;
        while (i5 < readHoldCount) {
            i5++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f70061a;
            if (debugProbesImpl.z()) {
                asSequence = CollectionsKt___CollectionsKt.asSequence(debugProbesImpl.q());
                sortedWith = SequencesKt___SequencesKt.sortedWith(asSequence, new b());
                mapNotNull = SequencesKt___SequencesKt.mapNotNull(sortedWith, new Function1<a<?>, kotlinx.coroutines.debug.internal.c>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    /* renamed from: a */
                    public final c invoke(@NotNull DebugProbesImpl.a<?> aVar) {
                        boolean y2;
                        CoroutineContext context;
                        y2 = DebugProbesImpl.f70061a.y(aVar);
                        if (y2 || (context = aVar.f70074c.getContext()) == null) {
                            return null;
                        }
                        return new c(aVar.f70074c, context);
                    }
                });
                list = SequencesKt___SequencesKt.toList(mapNotNull);
                return list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i4 < readHoldCount) {
                i4++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    @NotNull
    public final Object[] h() {
        String joinToString$default;
        String name;
        String trimIndent;
        List<kotlinx.coroutines.debug.internal.c> g4 = g();
        int size = g4.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (kotlinx.coroutines.debug.internal.c cVar : g4) {
            CoroutineContext context = cVar.getContext();
            p0 p0Var = (p0) context.get(p0.f71228c);
            Long l4 = null;
            String P = (p0Var == null || (name = p0Var.getName()) == null) ? null : P(name);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.get(CoroutineDispatcher.Key);
            String P2 = coroutineDispatcher == null ? null : P(coroutineDispatcher);
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append((Object) P);
            sb.append(",\n                    \"id\": ");
            o0 o0Var = (o0) context.get(o0.f71218c);
            if (o0Var != null) {
                l4 = Long.valueOf(o0Var.b0());
            }
            sb.append(l4);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append((Object) P2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(cVar.e());
            sb.append(",\n                    \"state\": \"");
            sb.append(cVar.f());
            sb.append("\"\n                } \n                ");
            trimIndent = StringsKt__IndentKt.trimIndent(sb.toString());
            arrayList3.add(trimIndent);
            arrayList2.add(cVar.c());
            arrayList.add(cVar.d());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null);
        sb2.append(joinToString$default);
        sb2.append(']');
        Object[] array = arrayList.toArray(new Thread[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Object[] array2 = arrayList2.toArray(new CoroutineStackFrame[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Object[] array3 = g4.toArray(new kotlinx.coroutines.debug.internal.c[0]);
        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new Object[]{sb2.toString(), array, array2, array3};
    }

    @NotNull
    public final List<DebuggerInfo> k() {
        Sequence asSequence;
        Sequence sortedWith;
        Sequence mapNotNull;
        List<DebuggerInfo> list;
        ReentrantReadWriteLock reentrantReadWriteLock = f70068h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i4 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i5 = 0;
        while (i5 < readHoldCount) {
            i5++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f70061a;
            if (debugProbesImpl.z()) {
                asSequence = CollectionsKt___CollectionsKt.asSequence(debugProbesImpl.q());
                sortedWith = SequencesKt___SequencesKt.sortedWith(asSequence, new b());
                mapNotNull = SequencesKt___SequencesKt.mapNotNull(sortedWith, new Function1<a<?>, DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    /* renamed from: a */
                    public final DebuggerInfo invoke(@NotNull DebugProbesImpl.a<?> aVar) {
                        boolean y2;
                        CoroutineContext context;
                        y2 = DebugProbesImpl.f70061a.y(aVar);
                        if (y2 || (context = aVar.f70074c.getContext()) == null) {
                            return null;
                        }
                        return new DebuggerInfo(aVar.f70074c, context);
                    }
                });
                list = SequencesKt___SequencesKt.toList(mapNotNull);
                return list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i4 < readHoldCount) {
                i4++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    @NotNull
    public final List<StackTraceElement> l(@NotNull kotlinx.coroutines.debug.internal.c cVar, @NotNull List<StackTraceElement> list) {
        return n(cVar.f(), cVar.d(), list);
    }

    @NotNull
    public final String m(@NotNull kotlinx.coroutines.debug.internal.c cVar) {
        String joinToString$default;
        String trimIndent;
        List<StackTraceElement> l4 = l(cVar, cVar.g());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : l4) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append((Object) stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append((Object) stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb.append((Object) (fileName == null ? null : P(fileName)));
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            trimIndent = StringsKt__IndentKt.trimIndent(sb.toString());
            arrayList.add(trimIndent);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
        sb2.append(joinToString$default);
        sb2.append(']');
        return sb2.toString();
    }

    public final boolean u() {
        return f70070j;
    }

    public final boolean v() {
        return f70069i;
    }

    @NotNull
    public final String w(@NotNull z1 z1Var) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        ReentrantReadWriteLock reentrantReadWriteLock = f70068h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i4 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i5 = 0;
        while (i5 < readHoldCount) {
            i5++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f70061a;
            if (debugProbesImpl.z()) {
                Set<a<?>> q4 = debugProbesImpl.q();
                ArrayList arrayList = new ArrayList();
                for (Object obj : q4) {
                    if (((a) obj).f70073b.getContext().get(z1.f71466g1) != null) {
                        arrayList.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(c2.B(((a) obj2).f70073b.getContext()), ((a) obj2).f70074c);
                }
                StringBuilder sb = new StringBuilder();
                f70061a.d(z1Var, linkedHashMap, sb, "");
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i4 < readHoldCount) {
                i4++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    public final void x() {
        ReentrantReadWriteLock reentrantReadWriteLock = f70068h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i4 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i5 = 0;
        while (i5 < readHoldCount) {
            i5++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f70061a;
            installations++;
            if (installations > 1) {
                return;
            }
            debugProbesImpl.M();
            if (kotlinx.coroutines.debug.internal.a.f70087a.a()) {
                while (i4 < readHoldCount) {
                    i4++;
                    readLock.lock();
                }
                writeLock.unlock();
                return;
            }
            Function1<Boolean, Unit> function1 = f70071k;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            Unit unit = Unit.INSTANCE;
            while (i4 < readHoldCount) {
                i4++;
                readLock.lock();
            }
            writeLock.unlock();
        } finally {
            while (i4 < readHoldCount) {
                i4++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    public final boolean z() {
        return installations > 0;
    }
}
