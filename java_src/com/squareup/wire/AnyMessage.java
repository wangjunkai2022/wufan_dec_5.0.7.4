package com.squareup.wire;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.kuaishou.weapon.p0.t;
import com.kwad.sdk.api.model.AdnName;
import com.squareup.wire.Message;
import com.umeng.analytics.pro.bm;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AnyMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\b\u0010\u0007J\b\u0010\t\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013R\u0019\u0010\u0012\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0014\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/squareup/wire/AnyMessage;", "Lcom/squareup/wire/Message;", "", "T", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "p", "(Lcom/squareup/wire/ProtoAdapter;)Ljava/lang/Object;", "q", "o", "", AdnName.OTHER, "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "typeUrl", "Lokio/ByteString;", "value", t.f55682a, "g", "Ljava/lang/String;", "m", "()Ljava/lang/String;", bm.aK, "Lokio/ByteString;", t.f55689h, "()Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "j", t.f55693l, "wire-runtime"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AnyMessage extends Message {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final String f60163g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final ByteString f60164h;

    /* renamed from: j  reason: collision with root package name */
    public static final b f60162j = new b(null);
    @JvmField
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final ProtoAdapter<AnyMessage> f60161i = new a(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(AnyMessage.class), "type.googleapis.com/google.protobuf.Any", Syntax.PROTO_3);

    /* compiled from: AnyMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"com/squareup/wire/AnyMessage$a", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/AnyMessage;", "value", "", "J", "Lcom/squareup/wire/n;", "writer", "", "I", "Lcom/squareup/wire/m;", "reader", "H", "K", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a extends ProtoAdapter<AnyMessage> {
        a(FieldEncoding fieldEncoding, KClass kClass, String str, Syntax syntax) {
            super(fieldEncoding, kClass, str, syntax);
        }

        @Override // com.squareup.wire.ProtoAdapter
        @NotNull
        /* renamed from: H */
        public AnyMessage c(@NotNull m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            ByteString byteString = ByteString.EMPTY;
            long e5 = reader.e();
            String str = "";
            while (true) {
                int i4 = reader.i();
                if (i4 == -1) {
                    reader.g(e5);
                    return new AnyMessage(str, byteString);
                } else if (i4 == 1) {
                    str = ProtoAdapter.f60190v.c(reader);
                } else if (i4 != 2) {
                    reader.o(i4);
                } else {
                    byteString = ProtoAdapter.f60189u.c(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: I */
        public void h(@NotNull n writer, @NotNull AnyMessage value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            ProtoAdapter.f60190v.m(writer, 1, value.m());
            ProtoAdapter.f60189u.m(writer, 2, value.n());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: J */
        public int n(@NotNull AnyMessage value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return ProtoAdapter.f60190v.o(1, value.m()) + ProtoAdapter.f60189u.o(2, value.n());
        }

        @Override // com.squareup.wire.ProtoAdapter
        @NotNull
        /* renamed from: K */
        public AnyMessage E(@NotNull AnyMessage value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new AnyMessage("square.github.io/wire/redacted", ByteString.EMPTY);
        }
    }

    /* compiled from: AnyMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"com/squareup/wire/AnyMessage$b", "", "Lcom/squareup/wire/Message;", "message", "Lcom/squareup/wire/AnyMessage;", "a", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "<init>", "()V", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        @NotNull
        public final AnyMessage a(@NotNull Message<?, ?> message) {
            Intrinsics.checkNotNullParameter(message, "message");
            String x4 = message.a().x();
            if (x4 != null) {
                return new AnyMessage(x4, message.e());
            }
            throw new IllegalStateException(("recompile " + Reflection.getOrCreateKotlinClass(message.getClass()) + " to use it with AnyMessage").toString());
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AnyMessage(String str, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ AnyMessage l(AnyMessage anyMessage, String str, ByteString byteString, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = anyMessage.f60163g;
        }
        if ((i4 & 2) != 0) {
            byteString = anyMessage.f60164h;
        }
        return anyMessage.k(str, byteString);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AnyMessage) {
            AnyMessage anyMessage = (AnyMessage) obj;
            return Intrinsics.areEqual(this.f60163g, anyMessage.f60163g) && Intrinsics.areEqual(this.f60164h, anyMessage.f60164h);
        }
        return false;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.a g() {
        return (Message.a) o();
    }

    public int hashCode() {
        int i4 = this.f60168d;
        if (i4 == 0) {
            int hashCode = (((i4 * 37) + this.f60163g.hashCode()) * 37) + this.f60164h.hashCode();
            this.f60168d = hashCode;
            return hashCode;
        }
        return i4;
    }

    @NotNull
    public final AnyMessage k(@NotNull String typeUrl, @NotNull ByteString value) {
        Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
        Intrinsics.checkNotNullParameter(value, "value");
        return new AnyMessage(typeUrl, value);
    }

    @NotNull
    public final String m() {
        return this.f60163g;
    }

    @NotNull
    public final ByteString n() {
        return this.f60164h;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Shouldn't be used in Kotlin")
    @NotNull
    public /* synthetic */ Void o() {
        throw new AssertionError();
    }

    public final <T> T p(@NotNull ProtoAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (Intrinsics.areEqual(this.f60163g, adapter.x())) {
            return adapter.f(this.f60164h);
        }
        throw new IllegalStateException(("type mismatch: " + this.f60163g + " != " + adapter.x()).toString());
    }

    @Nullable
    public final <T> T q(@NotNull ProtoAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (Intrinsics.areEqual(this.f60163g, adapter.x())) {
            return adapter.f(this.f60164h);
        }
        return null;
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        return "Any{type_url=" + this.f60163g + ", value=" + this.f60164h + '}';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnyMessage(@NotNull String typeUrl, @NotNull ByteString value) {
        super(f60161i, ByteString.EMPTY);
        Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f60163g = typeUrl;
        this.f60164h = value;
    }
}
