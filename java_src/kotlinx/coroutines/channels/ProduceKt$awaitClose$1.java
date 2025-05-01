package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Produce.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69913b;

    /* renamed from: c  reason: collision with root package name */
    Object f69914c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f69915d;

    /* renamed from: e  reason: collision with root package name */
    int f69916e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProduceKt$awaitClose$1(Continuation<? super ProduceKt$awaitClose$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f69915d = obj;
        this.f69916e |= Integer.MIN_VALUE;
        return ProduceKt.a(null, null, this);
    }
}
