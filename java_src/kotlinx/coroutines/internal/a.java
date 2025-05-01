package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ArrayQueue.kt */
/* loaded from: classes6.dex */
public class a<T> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private Object[] f71096a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private int f71097b;

    /* renamed from: c  reason: collision with root package name */
    private int f71098c;

    private final void c() {
        Object[] objArr = this.f71096a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, this.f71097b, 0, 10, (Object) null);
        Object[] objArr3 = this.f71096a;
        int length2 = objArr3.length;
        int i4 = this.f71097b;
        ArraysKt___ArraysJvmKt.copyInto$default(objArr3, objArr2, length2 - i4, 0, i4, 4, (Object) null);
        this.f71096a = objArr2;
        this.f71097b = 0;
        this.f71098c = length;
    }

    public final void a(@NotNull T t4) {
        Object[] objArr = this.f71096a;
        int i4 = this.f71098c;
        objArr[i4] = t4;
        int length = (objArr.length - 1) & (i4 + 1);
        this.f71098c = length;
        if (length == this.f71097b) {
            c();
        }
    }

    public final void b() {
        this.f71097b = 0;
        this.f71098c = 0;
        this.f71096a = new Object[this.f71096a.length];
    }

    public final boolean d() {
        return this.f71097b == this.f71098c;
    }

    @Nullable
    public final T e() {
        int i4 = this.f71097b;
        if (i4 == this.f71098c) {
            return null;
        }
        Object[] objArr = this.f71096a;
        T t4 = (T) objArr[i4];
        objArr[i4] = null;
        this.f71097b = (i4 + 1) & (objArr.length - 1);
        Objects.requireNonNull(t4, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t4;
    }
}
