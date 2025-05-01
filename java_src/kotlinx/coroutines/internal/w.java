package kotlinx.coroutines.internal;

import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes6.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final int f71150a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f71151b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f71152c = 2;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final Object f71153d = new o0("CONDITION_FALSE");
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private static final Object f71154e = new o0("LIST_EMPTY");

    @NotNull
    public static final Object a() {
        return f71153d;
    }

    @PublishedApi
    public static /* synthetic */ void b() {
    }

    @PublishedApi
    public static /* synthetic */ void c() {
    }

    @NotNull
    public static final Object d() {
        return f71154e;
    }

    @PublishedApi
    public static /* synthetic */ void e() {
    }

    @PublishedApi
    public static /* synthetic */ void f() {
    }

    @PublishedApi
    public static /* synthetic */ void g() {
    }

    @PublishedApi
    @NotNull
    public static final LockFreeLinkedListNode h(@NotNull Object obj) {
        i0 i0Var = obj instanceof i0 ? (i0) obj : null;
        LockFreeLinkedListNode lockFreeLinkedListNode = i0Var != null ? i0Var.f71118a : null;
        return lockFreeLinkedListNode == null ? (LockFreeLinkedListNode) obj : lockFreeLinkedListNode;
    }
}
