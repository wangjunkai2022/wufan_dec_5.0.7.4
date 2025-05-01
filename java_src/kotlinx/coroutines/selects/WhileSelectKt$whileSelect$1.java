package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WhileSelect.kt */
@DebugMetadata(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
/* loaded from: classes7.dex */
public final class WhileSelectKt$whileSelect$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f71348b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f71349c;

    /* renamed from: d  reason: collision with root package name */
    int f71350d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WhileSelectKt$whileSelect$1(Continuation<? super WhileSelectKt$whileSelect$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f71349c = obj;
        this.f71350d |= Integer.MIN_VALUE;
        return WhileSelectKt.a(null, this);
    }
}
