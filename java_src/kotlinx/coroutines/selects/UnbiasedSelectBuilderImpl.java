package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.selects.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SelectUnbiased.kt */
@PublishedApi
/* loaded from: classes7.dex */
public final class UnbiasedSelectBuilderImpl<R> implements a<R> {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final b<R> f71333b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Function0<Unit>> f71334c = new ArrayList<>();

    public UnbiasedSelectBuilderImpl(@NotNull Continuation<? super R> continuation) {
        this.f71333b = new b<>(continuation);
    }

    @NotNull
    public final ArrayList<Function0<Unit>> a() {
        return this.f71334c;
    }

    @Override // kotlinx.coroutines.selects.a
    public void b(@NotNull final c cVar, @NotNull final Function1<? super Continuation<? super R>, ? extends Object> function1) {
        this.f71334c.add(new Function0<Unit>() { // from class: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                c.this.i(this.c(), function1);
            }
        });
    }

    @NotNull
    public final b<R> c() {
        return this.f71333b;
    }

    @PublishedApi
    public final void d(@NotNull Throwable th) {
        this.f71333b.n0(th);
    }

    @PublishedApi
    @Nullable
    public final Object e() {
        if (!this.f71333b.h()) {
            try {
                Collections.shuffle(this.f71334c);
                Iterator<T> it2 = this.f71334c.iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
            } catch (Throwable th) {
                this.f71333b.n0(th);
            }
        }
        return this.f71333b.m0();
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void g(@NotNull final e<? super P, ? extends Q> eVar, final P p4, @NotNull final Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        this.f71334c.add(new Function0<Unit>() { // from class: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                eVar.A(this.c(), p4, function2);
            }
        });
    }

    @Override // kotlinx.coroutines.selects.a
    public void i(final long j4, @NotNull final Function1<? super Continuation<? super R>, ? extends Object> function1) {
        this.f71334c.add(new Function0<Unit>(this) { // from class: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$onTimeout$1

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ UnbiasedSelectBuilderImpl<R> f71345b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f71345b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f71345b.c().i(j4, function1);
            }
        });
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void p(@NotNull e<? super P, ? extends Q> eVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        a.C0781a.a(this, eVar, function2);
    }

    @Override // kotlinx.coroutines.selects.a
    public <Q> void w(@NotNull final d<? extends Q> dVar, @NotNull final Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        this.f71334c.add(new Function0<Unit>() { // from class: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                dVar.e(this.c(), function2);
            }
        });
    }
}
