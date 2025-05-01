package com.squareup.wire;

import com.join.mgps.activity.NoticeTopAnimActivityDialog_;
import com.kuaishou.weapon.p0.t;
import com.umeng.analytics.pro.bm;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProtoReader.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 52\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u00102\u001a\u000200¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0007J\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\tJ'\u0010\u001d\u001a\u00020\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0002J \u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u0001R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0016\u0010%\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010&R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0018\u0010+\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"Lcom/squareup/wire/m;", "", "", "expectedEndTag", "", "s", bm.aK, "fieldEncoding", "c", "", t.f55701t, com.kwad.sdk.m.e.TAG, "token", "Lokio/ByteString;", "g", com.xinzhu.overmind.utils.helpers.f.f68332a, "i", "Lcom/squareup/wire/FieldEncoding;", "j", "r", t.f55682a, "", t.f55689h, "p", "q", t.f55685d, "m", "Lkotlin/Function1;", "tagHandler", "a", "(Lkotlin/jvm/functions/Function1;)Lokio/ByteString;", "tag", "o", "value", t.f55693l, "J", "pos", "limit", "I", "recursionDepth", NoticeTopAnimActivityDialog_.f36148o, "pushedLimit", "Lcom/squareup/wire/FieldEncoding;", "nextFieldEncoding", "", "Lokio/Buffer;", "Ljava/util/List;", "bufferStack", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "u", "wire-runtime"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class m {

    /* renamed from: j  reason: collision with root package name */
    private static final int f60252j = 65;

    /* renamed from: k  reason: collision with root package name */
    private static final int f60253k = 7;

    /* renamed from: l  reason: collision with root package name */
    public static final int f60254l = 3;

    /* renamed from: m  reason: collision with root package name */
    private static final int f60255m = 0;

    /* renamed from: n  reason: collision with root package name */
    private static final int f60256n = 1;

    /* renamed from: o  reason: collision with root package name */
    private static final int f60257o = 2;

    /* renamed from: p  reason: collision with root package name */
    private static final int f60258p = 3;

    /* renamed from: q  reason: collision with root package name */
    private static final int f60259q = 4;

    /* renamed from: r  reason: collision with root package name */
    private static final int f60260r = 5;

    /* renamed from: s  reason: collision with root package name */
    private static final int f60261s = 6;

    /* renamed from: t  reason: collision with root package name */
    private static final int f60262t = 7;

    /* renamed from: u  reason: collision with root package name */
    public static final a f60263u = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private long f60264a;

    /* renamed from: b  reason: collision with root package name */
    private long f60265b;

    /* renamed from: c  reason: collision with root package name */
    private int f60266c;

    /* renamed from: d  reason: collision with root package name */
    private int f60267d;

    /* renamed from: e  reason: collision with root package name */
    private int f60268e;

    /* renamed from: f  reason: collision with root package name */
    private long f60269f;

    /* renamed from: g  reason: collision with root package name */
    private FieldEncoding f60270g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Buffer> f60271h;

    /* renamed from: i  reason: collision with root package name */
    private final BufferedSource f60272i;

    /* compiled from: ProtoReader.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"com/squareup/wire/m$a", "", "", "FIELD_ENCODING_MASK", "I", "RECURSION_LIMIT", "STATE_END_GROUP", "STATE_FIXED32", "STATE_FIXED64", "STATE_LENGTH_DELIMITED", "STATE_PACKED_TAG", "STATE_START_GROUP", "STATE_TAG", "STATE_VARINT", "TAG_FIELD_ENCODING_BITS", "<init>", "()V", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public m(@NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f60272i = source;
        this.f60265b = Long.MAX_VALUE;
        this.f60267d = 2;
        this.f60268e = -1;
        this.f60269f = -1L;
        this.f60271h = new ArrayList();
    }

    private final void c(int i4) throws IOException {
        if (this.f60267d == i4) {
            this.f60267d = 6;
            return;
        }
        long j4 = this.f60264a;
        long j5 = this.f60265b;
        if (j4 > j5) {
            throw new IOException("Expected to end at " + this.f60265b + " but was " + this.f60264a);
        } else if (j4 == j5) {
            this.f60265b = this.f60269f;
            this.f60269f = -1L;
            this.f60267d = 6;
        } else {
            this.f60267d = 7;
        }
    }

    private final long d() throws IOException {
        if (this.f60267d == 2) {
            long j4 = this.f60265b - this.f60264a;
            this.f60272i.require(j4);
            this.f60267d = 6;
            this.f60264a = this.f60265b;
            this.f60265b = this.f60269f;
            this.f60269f = -1L;
            return j4;
        }
        throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f60267d);
    }

    private final int h() {
        int i4;
        this.f60272i.require(1L);
        this.f60264a++;
        byte readByte = this.f60272i.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i5 = readByte & ByteCompanionObject.MAX_VALUE;
        this.f60272i.require(1L);
        this.f60264a++;
        byte readByte2 = this.f60272i.readByte();
        if (readByte2 >= 0) {
            i4 = readByte2 << 7;
        } else {
            i5 |= (readByte2 & ByteCompanionObject.MAX_VALUE) << 7;
            this.f60272i.require(1L);
            this.f60264a++;
            byte readByte3 = this.f60272i.readByte();
            if (readByte3 >= 0) {
                i4 = readByte3 << 14;
            } else {
                i5 |= (readByte3 & ByteCompanionObject.MAX_VALUE) << 14;
                this.f60272i.require(1L);
                this.f60264a++;
                byte readByte4 = this.f60272i.readByte();
                if (readByte4 < 0) {
                    int i6 = i5 | ((readByte4 & ByteCompanionObject.MAX_VALUE) << 21);
                    this.f60272i.require(1L);
                    this.f60264a++;
                    byte readByte5 = this.f60272i.readByte();
                    int i7 = i6 | (readByte5 << BinaryMemcacheOpcodes.TOUCH);
                    if (readByte5 < 0) {
                        for (int i8 = 0; i8 <= 4; i8++) {
                            this.f60272i.require(1L);
                            this.f60264a++;
                            if (this.f60272i.readByte() >= 0) {
                                return i7;
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i7;
                }
                i4 = readByte4 << BinaryMemcacheOpcodes.INCREMENTQ;
            }
        }
        return i5 | i4;
    }

    private final void s(int i4) {
        while (this.f60264a < this.f60265b && !this.f60272i.exhausted()) {
            int h4 = h();
            if (h4 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i5 = h4 >> 3;
            int i6 = h4 & 7;
            if (i6 == 0) {
                this.f60267d = 0;
                q();
            } else if (i6 == 1) {
                this.f60267d = 1;
                m();
            } else if (i6 == 2) {
                long h5 = h();
                this.f60264a += h5;
                this.f60272i.skip(h5);
            } else if (i6 == 3) {
                s(i5);
            } else if (i6 == 4) {
                if (i5 != i4) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else if (i6 == 5) {
                this.f60267d = 5;
                l();
            } else {
                throw new ProtocolException("Unexpected field encoding: " + i6);
            }
        }
        throw new EOFException();
    }

    @JvmName(name = "-forEachTag")
    @NotNull
    public final ByteString a(@NotNull Function1<? super Integer, ? extends Object> tagHandler) {
        Intrinsics.checkNotNullParameter(tagHandler, "tagHandler");
        long e5 = e();
        while (true) {
            int i4 = i();
            if (i4 == -1) {
                return g(e5);
            }
            tagHandler.invoke(Integer.valueOf(i4));
        }
    }

    public final void b(int i4, @NotNull FieldEncoding fieldEncoding, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        n nVar = new n(this.f60271h.get(this.f60266c - 1));
        ProtoAdapter<?> rawProtoAdapter = fieldEncoding.rawProtoAdapter();
        Objects.requireNonNull(rawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        rawProtoAdapter.m(nVar, i4, obj);
    }

    public final long e() throws IOException {
        if (this.f60267d == 2) {
            int i4 = this.f60266c + 1;
            this.f60266c = i4;
            if (i4 <= 65) {
                if (i4 > this.f60271h.size()) {
                    this.f60271h.add(new Buffer());
                }
                long j4 = this.f60269f;
                this.f60269f = -1L;
                this.f60267d = 6;
                return j4;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()".toString());
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "prefer endMessageAndGetUnknownFields()", replaceWith = @ReplaceWith(expression = "endMessageAndGetUnknownFields(token)", imports = {}))
    public final void f(long j4) throws IOException {
        g(j4);
    }

    @NotNull
    public final ByteString g(long j4) throws IOException {
        boolean z4 = true;
        if (this.f60267d == 6) {
            int i4 = this.f60266c - 1;
            this.f60266c = i4;
            if ((i4 < 0 || this.f60269f != -1) ? false : false) {
                if (this.f60264a != this.f60265b && i4 != 0) {
                    throw new IOException("Expected to end at " + this.f60265b + " but was " + this.f60264a);
                }
                this.f60265b = j4;
                Buffer buffer = this.f60271h.get(i4);
                if (buffer.size() > 0) {
                    return buffer.readByteString();
                }
                return ByteString.EMPTY;
            }
            throw new IllegalStateException("No corresponding call to beginMessage()".toString());
        }
        throw new IllegalStateException("Unexpected call to endMessage()".toString());
    }

    public final int i() throws IOException {
        int i4 = this.f60267d;
        if (i4 == 7) {
            this.f60267d = 2;
            return this.f60268e;
        } else if (i4 == 6) {
            while (this.f60264a < this.f60265b && !this.f60272i.exhausted()) {
                int h4 = h();
                if (h4 != 0) {
                    int i5 = h4 >> 3;
                    this.f60268e = i5;
                    int i6 = h4 & 7;
                    if (i6 == 0) {
                        this.f60270g = FieldEncoding.VARINT;
                        this.f60267d = 0;
                        return i5;
                    } else if (i6 == 1) {
                        this.f60270g = FieldEncoding.FIXED64;
                        this.f60267d = 1;
                        return i5;
                    } else if (i6 == 2) {
                        this.f60270g = FieldEncoding.LENGTH_DELIMITED;
                        this.f60267d = 2;
                        int h5 = h();
                        if (h5 >= 0) {
                            if (this.f60269f == -1) {
                                long j4 = this.f60265b;
                                this.f60269f = j4;
                                long j5 = this.f60264a + h5;
                                this.f60265b = j5;
                                if (j5 <= j4) {
                                    return this.f60268e;
                                }
                                throw new EOFException();
                            }
                            throw new IllegalStateException();
                        }
                        throw new ProtocolException("Negative length: " + h5);
                    } else if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                this.f60270g = FieldEncoding.FIXED32;
                                this.f60267d = 5;
                                return i5;
                            }
                            throw new ProtocolException("Unexpected field encoding: " + i6);
                        }
                        throw new ProtocolException("Unexpected end group");
                    } else {
                        s(i5);
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    @Nullable
    public final FieldEncoding j() {
        return this.f60270g;
    }

    @NotNull
    public final ByteString k() throws IOException {
        long d5 = d();
        this.f60272i.require(d5);
        return this.f60272i.readByteString(d5);
    }

    public final int l() throws IOException {
        int i4 = this.f60267d;
        if (i4 != 5 && i4 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f60267d);
        }
        this.f60272i.require(4L);
        this.f60264a += 4;
        int readIntLe = this.f60272i.readIntLe();
        c(5);
        return readIntLe;
    }

    public final long m() throws IOException {
        int i4 = this.f60267d;
        if (i4 != 1 && i4 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f60267d);
        }
        this.f60272i.require(8L);
        this.f60264a += 8;
        long readLongLe = this.f60272i.readLongLe();
        c(1);
        return readLongLe;
    }

    @NotNull
    public final String n() throws IOException {
        long d5 = d();
        this.f60272i.require(d5);
        return this.f60272i.readUtf8(d5);
    }

    public final void o(int i4) {
        FieldEncoding j4 = j();
        Intrinsics.checkNotNull(j4);
        b(i4, j4, j4.rawProtoAdapter().c(this));
    }

    public final int p() throws IOException {
        int i4 = this.f60267d;
        if (i4 != 0 && i4 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f60267d);
        }
        int h4 = h();
        c(0);
        return h4;
    }

    public final long q() throws IOException {
        byte readByte;
        int i4 = this.f60267d;
        if (i4 != 0 && i4 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f60267d);
        }
        long j4 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            this.f60272i.require(1L);
            this.f60264a++;
            j4 |= (readByte & ByteCompanionObject.MAX_VALUE) << i5;
            if ((this.f60272i.readByte() & 128) == 0) {
                c(0);
                return j4;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void r() throws IOException {
        int i4 = this.f60267d;
        if (i4 == 0) {
            q();
        } else if (i4 == 1) {
            m();
        } else if (i4 == 2) {
            this.f60272i.skip(d());
        } else if (i4 == 5) {
            l();
        } else {
            throw new IllegalStateException("Unexpected call to skip()");
        }
    }
}
