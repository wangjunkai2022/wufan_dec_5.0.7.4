package com.squareup.wire.internal;

import com.kuaishou.weapon.p0.t;
import com.squareup.wire.Message;
import com.squareup.wire.Message.a;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.umeng.analytics.pro.bm;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: FieldBinding.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B'\b\u0000\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010C\u001a\u00020\n\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\bG\u0010HJ\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\f\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\f\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00028\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0016R\u001c\u0010(\u001a\u00020$8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010.\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010/\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b)\u0010,R\u001c\u00105\u001a\u0002008\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u0016\u00107\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u001c\u0010:\u001a\u00020\u00118\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\b1\u00109R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010;R\u0016\u0010?\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u001c\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010@R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010;R\u0016\u0010D\u001a\u00020\u00118V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00109¨\u0006I"}, d2 = {"Lcom/squareup/wire/internal/c;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$a;", "B", "Lcom/squareup/wire/internal/d;", "Ljava/lang/Class;", "builderType", "", "name", "Ljava/lang/reflect/Field;", t.f55682a, "type", "Ljava/lang/reflect/Method;", t.f55685d, "Lcom/squareup/wire/Syntax;", "syntax", "", "m", "Lcom/squareup/wire/ProtoAdapter;", "a", "keyAdapter", "", "adapter", "builder", "value", "", "c", "(Lcom/squareup/wire/Message$a;Ljava/lang/Object;)V", bm.aK, "message", t.f55701t, "(Lcom/squareup/wire/Message;)Ljava/lang/Object;", "i", "(Lcom/squareup/wire/Message$a;)Ljava/lang/Object;", com.xinzhu.overmind.utils.helpers.f.f68332a, "Lcom/squareup/wire/WireField$Label;", "Lcom/squareup/wire/WireField$Label;", "getLabel", "()Lcom/squareup/wire/WireField$Label;", "label", t.f55693l, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "g", "wireFieldJsonName", "declaredName", "", com.kwad.sdk.m.e.TAG, "I", "getTag", "()I", "tag", "keyAdapterString", "adapterString", "Z", "()Z", "redacted", "Ljava/lang/reflect/Field;", "builderField", "j", "Ljava/lang/reflect/Method;", "builderMethod", "Lcom/squareup/wire/ProtoAdapter;", "singleAdapter", t.f55689h, "messageField", "isMap", "Lcom/squareup/wire/WireField;", "wireField", "<init>", "(Lcom/squareup/wire/WireField;Ljava/lang/reflect/Field;Ljava/lang/Class;)V", "wire-runtime"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c<M extends Message<M, B>, B extends Message.a<M, B>> implements d<M, B> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final WireField.Label f60209a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final String f60210b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final String f60211c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final String f60212d;

    /* renamed from: e  reason: collision with root package name */
    private final int f60213e;

    /* renamed from: f  reason: collision with root package name */
    private final String f60214f;

    /* renamed from: g  reason: collision with root package name */
    private final String f60215g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f60216h;

    /* renamed from: i  reason: collision with root package name */
    private final Field f60217i;

    /* renamed from: j  reason: collision with root package name */
    private final Method f60218j;

    /* renamed from: k  reason: collision with root package name */
    private ProtoAdapter<?> f60219k;

    /* renamed from: l  reason: collision with root package name */
    private ProtoAdapter<?> f60220l;

    /* renamed from: m  reason: collision with root package name */
    private ProtoAdapter<Object> f60221m;

    /* renamed from: n  reason: collision with root package name */
    private final Field f60222n;

    public c(@NotNull WireField wireField, @NotNull Field messageField, @NotNull Class<B> builderType) {
        String declaredName;
        Intrinsics.checkNotNullParameter(wireField, "wireField");
        Intrinsics.checkNotNullParameter(messageField, "messageField");
        Intrinsics.checkNotNullParameter(builderType, "builderType");
        this.f60222n = messageField;
        this.f60209a = wireField.label();
        String name = messageField.getName();
        Intrinsics.checkNotNullExpressionValue(name, "messageField.name");
        this.f60210b = name;
        this.f60211c = wireField.jsonName();
        if (wireField.declaredName().length() == 0) {
            declaredName = messageField.getName();
            Intrinsics.checkNotNullExpressionValue(declaredName, "messageField.name");
        } else {
            declaredName = wireField.declaredName();
        }
        this.f60212d = declaredName;
        this.f60213e = wireField.tag();
        this.f60214f = wireField.keyAdapter();
        this.f60215g = wireField.adapter();
        this.f60216h = wireField.redacted();
        this.f60217i = k(builderType, getName());
        String name2 = getName();
        Class<?> type = messageField.getType();
        Intrinsics.checkNotNullExpressionValue(type, "messageField.type");
        this.f60218j = l(builderType, name2, type);
    }

    private final Field k(Class<?> cls, String str) {
        try {
            Field field = cls.getField(str);
            Intrinsics.checkNotNullExpressionValue(field, "builderType.getField(name)");
            return field;
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + cls.getName() + external.org.apache.commons.lang3.d.f68897a + str);
        }
    }

    private final Method l(Class<?> cls, String str, Class<?> cls2) {
        try {
            Method method = cls.getMethod(str, cls2);
            Intrinsics.checkNotNullExpressionValue(method, "builderType.getMethod(name, type)");
            return method;
        } catch (NoSuchMethodException unused) {
            throw new AssertionError("No builder method " + cls.getName() + external.org.apache.commons.lang3.d.f68897a + str + '(' + cls2.getName() + ')');
        }
    }

    private final boolean m(Syntax syntax) {
        if (getLabel() == WireField.Label.OMIT_IDENTITY) {
            return true;
        }
        if (getLabel().isRepeated() && syntax == Syntax.PROTO_3) {
            return true;
        }
        return j() && syntax == Syntax.PROTO_3;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public ProtoAdapter<?> a() {
        ProtoAdapter<?> protoAdapter = this.f60219k;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> c5 = ProtoAdapter.M.c(this.f60215g);
        this.f60219k = c5;
        return c5;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public ProtoAdapter<Object> adapter() {
        ProtoAdapter<Object> protoAdapter = this.f60221m;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        if (j()) {
            ProtoAdapter<?> keyAdapter = keyAdapter();
            Objects.requireNonNull(keyAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            ProtoAdapter<?> a5 = a();
            Objects.requireNonNull(a5, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            ProtoAdapter<Object> e5 = ProtoAdapter.M.e(keyAdapter, a5);
            Objects.requireNonNull(e5, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            this.f60221m = e5;
            return e5;
        }
        ProtoAdapter<?> G = a().G(getLabel());
        Objects.requireNonNull(G, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        this.f60221m = G;
        return G;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public String b() {
        return this.f60212d;
    }

    @Override // com.squareup.wire.internal.d
    public void c(@NotNull B builder, @NotNull Object value) {
        Class<?> cls;
        Map mutableMap;
        List mutableList;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (getLabel().isRepeated()) {
            Object i4 = i(builder);
            if (TypeIntrinsics.isMutableList(i4)) {
                Objects.requireNonNull(i4, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
                TypeIntrinsics.asMutableList(i4).add(value);
                return;
            } else if (i4 instanceof List) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) ((Collection) i4));
                mutableList.add(value);
                h(builder, mutableList);
                return;
            } else {
                cls = i4 != null ? i4.getClass() : null;
                throw new ClassCastException("Expected a list type, got " + cls + external.org.apache.commons.lang3.d.f68897a);
            }
        }
        if (this.f60214f.length() > 0) {
            Object i5 = i(builder);
            if (TypeIntrinsics.isMutableMap(i5)) {
                ((Map) i5).putAll((Map) value);
                return;
            } else if (i5 instanceof Map) {
                mutableMap = MapsKt__MapsKt.toMutableMap((Map) i5);
                mutableMap.putAll((Map) value);
                h(builder, mutableMap);
                return;
            } else {
                cls = i5 != null ? i5.getClass() : null;
                throw new ClassCastException("Expected a map type, got " + cls + external.org.apache.commons.lang3.d.f68897a);
            }
        }
        h(builder, value);
    }

    @Override // com.squareup.wire.internal.d
    @Nullable
    public Object d(@NotNull M message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return this.f60222n.get(message);
    }

    @Override // com.squareup.wire.internal.d
    public boolean e() {
        return this.f60216h;
    }

    @Override // com.squareup.wire.internal.d
    public boolean f(@NotNull Syntax syntax, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        return m(syntax) && Intrinsics.areEqual(obj, adapter().t());
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public String g() {
        return this.f60211c;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public WireField.Label getLabel() {
        return this.f60209a;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public String getName() {
        return this.f60210b;
    }

    @Override // com.squareup.wire.internal.d
    public int getTag() {
        return this.f60213e;
    }

    @Override // com.squareup.wire.internal.d
    public void h(@NotNull B builder, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (getLabel().isOneOf()) {
            this.f60218j.invoke(builder, obj);
        } else {
            this.f60217i.set(builder, obj);
        }
    }

    @Override // com.squareup.wire.internal.d
    @Nullable
    public Object i(@NotNull B builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return this.f60217i.get(builder);
    }

    @Override // com.squareup.wire.internal.d
    public boolean j() {
        return this.f60214f.length() > 0;
    }

    @Override // com.squareup.wire.internal.d
    @NotNull
    public ProtoAdapter<?> keyAdapter() {
        ProtoAdapter<?> protoAdapter = this.f60220l;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> c5 = ProtoAdapter.M.c(this.f60214f);
        this.f60220l = c5;
        return c5;
    }
}
