package com.squareup.wire.internal;

import com.kuaishou.weapon.p0.t;
import com.squareup.wire.Message;
import com.squareup.wire.Message.a;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.j;
import com.umeng.analytics.pro.bm;
import java.lang.reflect.Field;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: OneOfBinding.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B+\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u001a\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000106\u0012\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001f¢\u0006\u0004\b8\u00109J\f\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\f\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0016\u0010%\u001a\u00020\"8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u00020-8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0016\u00103\u001a\u00020-8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010/R\u0016\u00105\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010+¨\u0006:"}, d2 = {"Lcom/squareup/wire/internal/l;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$a;", "B", "Lcom/squareup/wire/internal/d;", "Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "", "adapter", "builder", "value", "", "c", "(Lcom/squareup/wire/Message$a;Ljava/lang/Object;)V", bm.aK, "message", t.f55701t, "(Lcom/squareup/wire/Message;)Ljava/lang/Object;", "i", "(Lcom/squareup/wire/Message$a;)Ljava/lang/Object;", "a", "Lcom/squareup/wire/Syntax;", "syntax", "", com.xinzhu.overmind.utils.helpers.f.f68332a, "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "builderField", t.f55693l, "messageField", "Lcom/squareup/wire/j$a;", "Lcom/squareup/wire/j$a;", "key", "", "getTag", "()I", "tag", "Lcom/squareup/wire/WireField$Label;", "getLabel", "()Lcom/squareup/wire/WireField$Label;", "label", com.kwad.sdk.m.e.TAG, "()Z", "redacted", "", "g", "()Ljava/lang/String;", "wireFieldJsonName", "getName", "name", "declaredName", "j", "isMap", "Ljava/lang/Class;", "builderType", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Class;Lcom/squareup/wire/j$a;)V", "wire-runtime"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class l<M extends Message<M, B>, B extends Message.a<M, B>> implements d<M, B> {

    /* renamed from: a  reason: collision with root package name */
    private final Field f60239a;

    /* renamed from: b  reason: collision with root package name */
    private final Field f60240b;

    /* renamed from: c  reason: collision with root package name */
    private final j.a<?> f60241c;

    public l(@NotNull Field messageField, @NotNull Class<B> builderType, @NotNull j.a<?> key) {
        Intrinsics.checkNotNullParameter(messageField, "messageField");
        Intrinsics.checkNotNullParameter(builderType, "builderType");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f60240b = messageField;
        this.f60241c = key;
        Field declaredField = builderType.getDeclaredField(messageField.getName());
        Intrinsics.checkNotNullExpressionValue(declaredField, "builderType.getDeclaredField(messageField.name)");
        this.f60239a = declaredField;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public ProtoAdapter<?> a() {
        return adapter();
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public ProtoAdapter<Object> adapter() {
        ProtoAdapter<?> a5 = this.f60241c.a();
        Objects.requireNonNull(a5, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        return a5;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public String b() {
        return this.f60241c.b();
    }

    @Override // com.squareup.wire.internal.d
    public void c(@NotNull B builder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(value, "value");
        h(builder, value);
    }

    @Override // com.squareup.wire.internal.d
    @Nullable
    public Object d(@NotNull M message) {
        Intrinsics.checkNotNullParameter(message, "message");
        com.squareup.wire.j jVar = (com.squareup.wire.j) this.f60240b.get(message);
        if (jVar != null) {
            return jVar.h(this.f60241c);
        }
        return null;
    }

    @Override // com.squareup.wire.internal.d
    public boolean e() {
        return this.f60241c.d();
    }

    @Override // com.squareup.wire.internal.d
    public boolean f(@NotNull Syntax syntax, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        return obj == null;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public String g() {
        return this.f60241c.c();
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public WireField.Label getLabel() {
        return WireField.Label.OPTIONAL;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public String getName() {
        return this.f60241c.b();
    }

    @Override // com.squareup.wire.internal.d
    public int getTag() {
        return this.f60241c.e();
    }

    @Override // com.squareup.wire.internal.d
    public void h(@NotNull B builder, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Field field = this.f60239a;
        j.a<?> aVar = this.f60241c;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.squareup.wire.OneOf.Key<kotlin.Any>");
        Intrinsics.checkNotNull(obj);
        field.set(builder, new com.squareup.wire.j(aVar, obj));
    }

    @Override // com.squareup.wire.internal.d
    @Nullable
    public Object i(@NotNull B builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        com.squareup.wire.j jVar = (com.squareup.wire.j) this.f60239a.get(builder);
        if (jVar != null) {
            return jVar.h(this.f60241c);
        }
        return null;
    }

    @Override // com.squareup.wire.internal.d
    public boolean j() {
        return false;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public ProtoAdapter<?> keyAdapter() {
        throw new IllegalStateException("not a map".toString());
    }
}
