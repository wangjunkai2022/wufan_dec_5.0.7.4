package kotlinx.coroutines.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: TestCoroutineContext.kt */
/* loaded from: classes.dex */
public final class b {
    @Deprecated(level = DeprecationLevel.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @ReplaceWith(expression = "testContext.runBlockingTest(testBody)", imports = {"kotlin.coroutines.test"}))
    public static final void a(@NotNull a aVar, @NotNull Function1<? super a, Unit> function1) {
        function1.invoke(aVar);
        List<Throwable> M = aVar.M();
        boolean z4 = true;
        if (!(M instanceof Collection) || !M.isEmpty()) {
            Iterator<T> it2 = M.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!(((Throwable) it2.next()) instanceof CancellationException)) {
                    z4 = false;
                    break;
                }
            }
        }
        if (!z4) {
            throw new AssertionError(Intrinsics.stringPlus("Coroutine encountered unhandled exceptions:\n", aVar.M()));
        }
    }

    public static /* synthetic */ void b(a aVar, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = new a(null, 1, null);
        }
        a(aVar, function1);
    }
}
