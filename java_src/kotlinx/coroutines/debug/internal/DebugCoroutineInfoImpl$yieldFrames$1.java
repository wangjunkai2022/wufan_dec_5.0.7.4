package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DebugCoroutineInfoImpl.kt */
@DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {80}, m = "yieldFrames", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DebugCoroutineInfoImpl$yieldFrames$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70055b;

    /* renamed from: c  reason: collision with root package name */
    Object f70056c;

    /* renamed from: d  reason: collision with root package name */
    Object f70057d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f70058e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ DebugCoroutineInfoImpl f70059f;

    /* renamed from: g  reason: collision with root package name */
    int f70060g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$yieldFrames$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, Continuation<? super DebugCoroutineInfoImpl$yieldFrames$1> continuation) {
        super(continuation);
        this.f70059f = debugCoroutineInfoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object j4;
        this.f70058e = obj;
        this.f70060g |= Integer.MIN_VALUE;
        j4 = this.f70059f.j(null, null, this);
        return j4;
    }
}
