package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ExceptionsConstructor.kt */
/* loaded from: classes6.dex */
public final class ExceptionsConstructorKt {

    /* renamed from: a  reason: collision with root package name */
    private static final int f71062a = f(Throwable.class, -1);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final k f71063b;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes6.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((Constructor) t5).getParameterTypes().length), Integer.valueOf(((Constructor) t4).getParameterTypes().length));
            return compareValues;
        }
    }

    static {
        k kVar;
        try {
            kVar = o.a() ? z0.f71186a : e.f71108a;
        } catch (Throwable unused) {
            kVar = z0.f71186a;
        }
        f71063b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> Function1<Throwable, Throwable> b(Class<E> cls) {
        List<Constructor> sortedWith;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* renamed from: a */
            public final Void invoke(@NotNull Throwable th) {
                return null;
            }
        };
        if (f71062a != f(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        sortedWith = ArraysKt___ArraysKt.sortedWith(cls.getConstructors(), new a());
        for (Constructor constructor : sortedWith) {
            Function1<Throwable, Throwable> c5 = c(constructor);
            if (c5 != null) {
                return c5;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    private static final Function1<Throwable, Throwable> c(final Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2 && Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) {
                    return new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @Nullable
                        /* renamed from: a */
                        public final Throwable invoke(@NotNull Throwable th) {
                            Object m35constructorimpl;
                            Object newInstance;
                            try {
                                Result.Companion companion = Result.Companion;
                                newInstance = constructor.newInstance(th.getMessage(), th);
                            } catch (Throwable th2) {
                                Result.Companion companion2 = Result.Companion;
                                m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th2));
                            }
                            if (newInstance != null) {
                                m35constructorimpl = Result.m35constructorimpl((Throwable) newInstance);
                                if (Result.m41isFailureimpl(m35constructorimpl)) {
                                    m35constructorimpl = null;
                                }
                                return (Throwable) m35constructorimpl;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                        }
                    };
                }
                return null;
            }
            Class<?> cls = parameterTypes[0];
            if (Intrinsics.areEqual(cls, Throwable.class)) {
                return new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    /* renamed from: a */
                    public final Throwable invoke(@NotNull Throwable th) {
                        Object m35constructorimpl;
                        Object newInstance;
                        try {
                            Result.Companion companion = Result.Companion;
                            newInstance = constructor.newInstance(th);
                        } catch (Throwable th2) {
                            Result.Companion companion2 = Result.Companion;
                            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th2));
                        }
                        if (newInstance != null) {
                            m35constructorimpl = Result.m35constructorimpl((Throwable) newInstance);
                            if (Result.m41isFailureimpl(m35constructorimpl)) {
                                m35constructorimpl = null;
                            }
                            return (Throwable) m35constructorimpl;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                };
            }
            if (Intrinsics.areEqual(cls, String.class)) {
                return new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    /* renamed from: a */
                    public final Throwable invoke(@NotNull Throwable th) {
                        Object m35constructorimpl;
                        Object newInstance;
                        try {
                            Result.Companion companion = Result.Companion;
                            newInstance = constructor.newInstance(th.getMessage());
                        } catch (Throwable th2) {
                            Result.Companion companion2 = Result.Companion;
                            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th2));
                        }
                        if (newInstance != null) {
                            Throwable th3 = (Throwable) newInstance;
                            th3.initCause(th);
                            m35constructorimpl = Result.m35constructorimpl(th3);
                            if (Result.m41isFailureimpl(m35constructorimpl)) {
                                m35constructorimpl = null;
                            }
                            return (Throwable) m35constructorimpl;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                };
            }
            return null;
        }
        return new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* renamed from: a */
            public final Throwable invoke(@NotNull Throwable th) {
                Object m35constructorimpl;
                Object newInstance;
                try {
                    Result.Companion companion = Result.Companion;
                    newInstance = constructor.newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.Companion;
                    m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th2));
                }
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    m35constructorimpl = Result.m35constructorimpl(th3);
                    if (Result.m41isFailureimpl(m35constructorimpl)) {
                        m35constructorimpl = null;
                    }
                    return (Throwable) m35constructorimpl;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
        };
    }

    private static final int d(Class<?> cls, int i4) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                Field field = declaredFields[i5];
                i5++;
                if (!Modifier.isStatic(field.getModifiers())) {
                    i6++;
                }
            }
            i4 += i6;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i4;
    }

    static /* synthetic */ int e(Class cls, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return d(cls, i4);
    }

    private static final int f(Class<?> cls, int i4) {
        Integer m35constructorimpl;
        JvmClassMappingKt.getKotlinClass(cls);
        try {
            Result.Companion companion = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(i4);
        if (Result.m41isFailureimpl(m35constructorimpl)) {
            m35constructorimpl = valueOf;
        }
        return ((Number) m35constructorimpl).intValue();
    }

    private static final Function1<Throwable, Throwable> g(final Function1<? super Throwable, ? extends Throwable> function1) {
        return new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* renamed from: a */
            public final Throwable invoke(@NotNull Throwable th) {
                Object m35constructorimpl;
                Function1<Throwable, Throwable> function12 = function1;
                try {
                    Result.Companion companion = Result.Companion;
                    m35constructorimpl = Result.m35constructorimpl(function12.invoke(th));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.Companion;
                    m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m41isFailureimpl(m35constructorimpl)) {
                    m35constructorimpl = null;
                }
                return (Throwable) m35constructorimpl;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E extends Throwable> E h(@NotNull E e5) {
        Object m35constructorimpl;
        if (e5 instanceof kotlinx.coroutines.k0) {
            try {
                Result.Companion companion = Result.Companion;
                m35constructorimpl = Result.m35constructorimpl(((kotlinx.coroutines.k0) e5).a());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m41isFailureimpl(m35constructorimpl)) {
                m35constructorimpl = null;
            }
            return (E) m35constructorimpl;
        }
        return (E) f71063b.a(e5.getClass()).invoke(e5);
    }
}
