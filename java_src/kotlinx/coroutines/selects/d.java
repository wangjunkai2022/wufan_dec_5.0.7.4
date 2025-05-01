package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
/* compiled from: Select.kt */
/* loaded from: classes7.dex */
public interface d<Q> {
    @InternalCoroutinesApi
    <R> void e(@NotNull f<? super R> fVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);
}
