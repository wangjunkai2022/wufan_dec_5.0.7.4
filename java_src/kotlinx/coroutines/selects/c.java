package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
/* compiled from: Select.kt */
/* loaded from: classes7.dex */
public interface c {
    @InternalCoroutinesApi
    <R> void i(@NotNull f<? super R> fVar, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1);
}
