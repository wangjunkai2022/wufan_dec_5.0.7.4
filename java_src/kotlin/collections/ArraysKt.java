package kotlin.collections;

import java.util.List;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class ArraysKt extends ArraysKt___ArraysKt {
    private ArraysKt() {
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static /* bridge */ /* synthetic */ byte[] copyInto(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i4, int i5, int i6) {
        return ArraysKt___ArraysJvmKt.copyInto(bArr, bArr2, i4, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static /* bridge */ /* synthetic */ <T> T[] copyInto(@NotNull T[] tArr, @NotNull T[] tArr2, int i4, int i5, int i6) {
        return (T[]) ArraysKt___ArraysJvmKt.copyInto(tArr, tArr2, i4, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static /* bridge */ /* synthetic */ byte[] copyOfRange(@NotNull byte[] bArr, int i4, int i5) {
        return ArraysKt___ArraysJvmKt.copyOfRange(bArr, i4, i5);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static /* bridge */ /* synthetic */ <T> T[] copyOfRange(@NotNull T[] tArr, int i4, int i5) {
        return (T[]) ArraysKt___ArraysJvmKt.copyOfRange(tArr, i4, i5);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T getOrNull(@NotNull T[] tArr, int i4) {
        return (T) ArraysKt___ArraysKt.getOrNull(tArr, i4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T> T[] plus(@NotNull T[] tArr, T t4) {
        return (T[]) ArraysKt___ArraysJvmKt.plus(tArr, t4);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T singleOrNull(@NotNull T[] tArr) {
        return (T) ArraysKt___ArraysKt.singleOrNull(tArr);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T> List<T> toList(@NotNull T[] tArr) {
        return ArraysKt___ArraysKt.toList(tArr);
    }
}
