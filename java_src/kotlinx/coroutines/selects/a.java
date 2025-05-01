package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
/* compiled from: Select.kt */
/* loaded from: classes7.dex */
public interface a<R> {

    /* compiled from: Select.kt */
    /* renamed from: kotlinx.coroutines.selects.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0781a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@NotNull a<? super R> aVar, @NotNull e<? super P, ? extends Q> eVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
            aVar.g(eVar, null, function2);
        }
    }

    void b(@NotNull c cVar, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1);

    <P, Q> void g(@NotNull e<? super P, ? extends Q> eVar, P p4, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);

    @ExperimentalCoroutinesApi
    void i(long j4, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1);

    <P, Q> void p(@NotNull e<? super P, ? extends Q> eVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);

    <Q> void w(@NotNull d<? extends Q> dVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);
}
