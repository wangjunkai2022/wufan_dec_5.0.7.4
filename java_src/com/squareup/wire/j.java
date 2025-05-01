package com.squareup.wire;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.kuaishou.weapon.p0.t;
import com.kwad.sdk.api.model.AdnName;
import com.squareup.wire.j.a;
import com.umeng.analytics.pro.bm;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: OneOf.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0010\b\u0000\u0010\u0002 \u0001*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001\u0011B\u0017\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0015\u001a\u00028\u0001¢\u0006\u0004\b \u0010!J#\u0010\u0007\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0002\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0015\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0018\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÖ\u0003R\u0019\u0010\u0006\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0015\u001a\u00028\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006\""}, d2 = {"Lcom/squareup/wire/j;", "Lcom/squareup/wire/j$a;", "K", "T", "", "X", "key", bm.aK, "(Lcom/squareup/wire/j$a;)Ljava/lang/Object;", "", "toString", "", com.xinzhu.overmind.utils.helpers.f.f68332a, "Lcom/squareup/wire/n;", "writer", "", com.kwad.sdk.m.e.TAG, "a", "()Lcom/squareup/wire/j$a;", t.f55693l, "()Ljava/lang/Object;", "value", "c", "(Lcom/squareup/wire/j$a;Ljava/lang/Object;)Lcom/squareup/wire/j;", TTDownloadField.TT_HASHCODE, AdnName.OTHER, "", "equals", "Lcom/squareup/wire/j$a;", "g", "Ljava/lang/Object;", "i", "<init>", "(Lcom/squareup/wire/j$a;Ljava/lang/Object;)V", "wire-runtime"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class j<K extends a<T>, T> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final K f60242a;

    /* renamed from: b  reason: collision with root package name */
    private final T f60243b;

    /* compiled from: OneOf.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B9\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\fR\u0019\u0010\u0012\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0019\u0010\u0017\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u001b"}, d2 = {"com/squareup/wire/j$a", "T", "", "", "a", "I", com.kwad.sdk.m.e.TAG, "()I", "tag", "Lcom/squareup/wire/ProtoAdapter;", t.f55693l, "Lcom/squareup/wire/ProtoAdapter;", "()Lcom/squareup/wire/ProtoAdapter;", "adapter", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "declaredName", "", t.f55701t, "Z", "()Z", "redacted", "jsonName", "<init>", "(ILcom/squareup/wire/ProtoAdapter;Ljava/lang/String;ZLjava/lang/String;)V", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static abstract class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f60244a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private final ProtoAdapter<T> f60245b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        private final String f60246c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f60247d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final String f60248e;

        public a(int i4, @NotNull ProtoAdapter<T> adapter, @NotNull String declaredName, boolean z4, @NotNull String jsonName) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(declaredName, "declaredName");
            Intrinsics.checkNotNullParameter(jsonName, "jsonName");
            this.f60244a = i4;
            this.f60245b = adapter;
            this.f60246c = declaredName;
            this.f60247d = z4;
            this.f60248e = jsonName;
        }

        @NotNull
        public final ProtoAdapter<T> a() {
            return this.f60245b;
        }

        @NotNull
        public final String b() {
            return this.f60246c;
        }

        @NotNull
        public final String c() {
            return this.f60248e;
        }

        public final boolean d() {
            return this.f60247d;
        }

        public final int e() {
            return this.f60244a;
        }

        public /* synthetic */ a(int i4, ProtoAdapter protoAdapter, String str, boolean z4, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i4, protoAdapter, str, (i5 & 8) != 0 ? false : z4, (i5 & 16) != 0 ? "" : str2);
        }
    }

    public j(@NotNull K key, T t4) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f60242a = key;
        this.f60243b = t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j d(j jVar, a aVar, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            aVar = jVar.f60242a;
        }
        if ((i4 & 2) != 0) {
            obj = jVar.f60243b;
        }
        return jVar.c(aVar, obj);
    }

    @NotNull
    public final K a() {
        return this.f60242a;
    }

    public final T b() {
        return this.f60243b;
    }

    @NotNull
    public final j<K, T> c(@NotNull K key, T t4) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new j<>(key, t4);
    }

    public final void e(@NotNull n writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f60242a.a().m(writer, this.f60242a.e(), this.f60243b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                return Intrinsics.areEqual(this.f60242a, jVar.f60242a) && Intrinsics.areEqual(this.f60243b, jVar.f60243b);
            }
            return false;
        }
        return true;
    }

    public final int f() {
        return this.f60242a.a().o(this.f60242a.e(), this.f60243b);
    }

    @NotNull
    public final K g() {
        return this.f60242a;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, X] */
    @Nullable
    public final <X> X h(@NotNull a<X> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.areEqual(this.f60242a, key)) {
            return this.f60243b;
        }
        return null;
    }

    public int hashCode() {
        K k4 = this.f60242a;
        int hashCode = (k4 != null ? k4.hashCode() : 0) * 31;
        T t4 = this.f60243b;
        return hashCode + (t4 != null ? t4.hashCode() : 0);
    }

    public final T i() {
        return this.f60243b;
    }

    @NotNull
    public String toString() {
        String x4;
        ProtoAdapter<T> a5 = this.f60242a.a();
        if (Intrinsics.areEqual(a5, ProtoAdapter.f60190v) || Intrinsics.areEqual(a5, ProtoAdapter.I)) {
            x4 = com.squareup.wire.internal.f.x(String.valueOf(this.f60243b));
        } else {
            x4 = String.valueOf(this.f60243b);
        }
        return this.f60242a.b() + '=' + x4;
    }
}
