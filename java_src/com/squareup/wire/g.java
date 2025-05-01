package com.squareup.wire;

import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProtoAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\b\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u0001\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J&\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016J$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J.\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/squareup/wire/g;", "K", "V", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "tag", "L", "Lcom/squareup/wire/n;", "writer", "", "I", "J", "Lcom/squareup/wire/m;", "reader", "H", "M", "Lcom/squareup/wire/f;", "N", "Lcom/squareup/wire/f;", "entryAdapter", "keyAdapter", "valueAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)V", "wire-runtime"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class g<K, V> extends ProtoAdapter<Map<K, ? extends V>> {
    private final f<K, V> N;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(@org.jetbrains.annotations.NotNull com.squareup.wire.ProtoAdapter<K> r8, @org.jetbrains.annotations.NotNull com.squareup.wire.ProtoAdapter<V> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "keyAdapter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "valueAdapter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.squareup.wire.FieldEncoding r2 = com.squareup.wire.FieldEncoding.LENGTH_DELIMITED
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            com.squareup.wire.Syntax r5 = r9.w()
            java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.squareup.wire.f r0 = new com.squareup.wire.f
            r0.<init>(r8, r9)
            r7.N = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.g.<init>(com.squareup.wire.ProtoAdapter, com.squareup.wire.ProtoAdapter):void");
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    /* renamed from: H */
    public Map<K, V> c(@NotNull m reader) throws IOException {
        Map<K, V> mapOf;
        Intrinsics.checkNotNullParameter(reader, "reader");
        long e5 = reader.e();
        K k4 = null;
        V v2 = null;
        while (true) {
            int i4 = reader.i();
            if (i4 == -1) {
                break;
            } else if (i4 == 1) {
                k4 = this.N.K().c(reader);
            } else if (i4 == 2) {
                v2 = this.N.L().c(reader);
            }
        }
        reader.g(e5);
        if (k4 != null) {
            if (v2 != null) {
                mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to(k4, v2));
                return mapOf;
            }
            throw new IllegalStateException("Map entry with null value".toString());
        }
        throw new IllegalStateException("Map entry with null key".toString());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: I */
    public void h(@NotNull n writer, @NotNull Map<K, ? extends V> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: J */
    public void m(@NotNull n writer, int i4, @Nullable Map<K, ? extends V> map) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (map == null) {
            return;
        }
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            this.N.m(writer, i4, entry);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: K */
    public int n(@NotNull Map<K, ? extends V> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: L */
    public int o(int i4, @Nullable Map<K, ? extends V> map) {
        int i5 = 0;
        if (map == null) {
            return 0;
        }
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            i5 += this.N.o(i4, entry);
        }
        return i5;
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    /* renamed from: M */
    public Map<K, V> E(@NotNull Map<K, ? extends V> value) {
        Map<K, V> emptyMap;
        Intrinsics.checkNotNullParameter(value, "value");
        emptyMap = MapsKt__MapsKt.emptyMap();
        return emptyMap;
    }
}
