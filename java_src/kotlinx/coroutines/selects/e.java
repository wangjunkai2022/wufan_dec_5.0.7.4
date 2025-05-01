package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
/* compiled from: Select.kt */
/* loaded from: classes7.dex */
public interface e<P, Q> {
    @InternalCoroutinesApi
    <R> void A(@NotNull f<? super R> fVar, P p4, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);
}
