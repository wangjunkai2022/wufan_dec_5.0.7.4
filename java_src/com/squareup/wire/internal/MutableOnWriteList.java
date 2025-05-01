package com.squareup.wire.internal;

import com.kuaishou.weapon.p0.t;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: MutableOnWriteList.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b \u0010\u0019J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\fR(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0015\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001f\u001a\u00020\t8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/squareup/wire/internal/MutableOnWriteList;", "T", "Lkotlin/collections/AbstractMutableList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ljava/io/Serializable;", "Lcom/squareup/wire/internal/Serializable;", "", "writeReplace", "", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "add", "(ILjava/lang/Object;)V", "removeAt", "", t.f55693l, "Ljava/util/List;", "a", "()Ljava/util/List;", "(Ljava/util/List;)V", "mutableList", "c", "immutableList", "getSize", "()I", "size", "<init>", "wire-runtime"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class MutableOnWriteList<T> extends AbstractMutableList<T> implements RandomAccess, Serializable {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private List<? extends T> f60204b;

    /* renamed from: c  reason: collision with root package name */
    private final List<T> f60205c;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableOnWriteList(@NotNull List<? extends T> immutableList) {
        Intrinsics.checkNotNullParameter(immutableList, "immutableList");
        this.f60205c = immutableList;
        this.f60204b = immutableList;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new ArrayList(this.f60204b);
    }

    @NotNull
    public final List<T> a() {
        return (List<? extends T>) this.f60204b;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i4, T t4) {
        if (this.f60204b == this.f60205c) {
            this.f60204b = new ArrayList(this.f60205c);
        }
        List<? extends T> list = this.f60204b;
        Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<T>");
        ((ArrayList) list).add(i4, t4);
    }

    public final void b(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f60204b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i4) {
        return this.f60204b.get(i4);
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.f60204b.size();
    }

    @Override // kotlin.collections.AbstractMutableList
    public T removeAt(int i4) {
        if (this.f60204b == this.f60205c) {
            this.f60204b = new ArrayList(this.f60205c);
        }
        List<? extends T> list = this.f60204b;
        Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<T>");
        return (T) ((ArrayList) list).remove(i4);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public T set(int i4, T t4) {
        if (this.f60204b == this.f60205c) {
            this.f60204b = new ArrayList(this.f60205c);
        }
        List<? extends T> list = this.f60204b;
        Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<T>");
        return (T) ((ArrayList) list).set(i4, t4);
    }
}
