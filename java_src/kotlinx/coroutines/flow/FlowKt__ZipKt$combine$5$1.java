package kotlinx.coroutines.flow;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Zip.kt */
/* loaded from: classes6.dex */
final class FlowKt__ZipKt$combine$5$1<T> extends Lambda implements Function0<T[]> {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e<T>[] f70763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$5$1(e<? extends T>[] eVarArr) {
        super(0);
        this.f70763b = eVarArr;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: a */
    public final T[] invoke() {
        int length = this.f70763b.length;
        Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) new Object[length];
    }
}
