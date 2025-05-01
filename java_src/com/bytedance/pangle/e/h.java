package com.bytedance.pangle.e;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class h implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final FileInputStream f8326a;

    /* renamed from: b  reason: collision with root package name */
    private a f8327b;

    /* renamed from: c  reason: collision with root package name */
    private b[] f8328c;

    /* renamed from: d  reason: collision with root package name */
    private c[] f8329d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, c> f8330e = new HashMap();

    /* loaded from: classes2.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f8331a;

        /* renamed from: b  reason: collision with root package name */
        public final short f8332b;

        /* renamed from: c  reason: collision with root package name */
        public final short f8333c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8334d;

        /* renamed from: e  reason: collision with root package name */
        public final long f8335e;

        /* renamed from: f  reason: collision with root package name */
        public final long f8336f;

        /* renamed from: g  reason: collision with root package name */
        public final long f8337g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8338h;

        /* renamed from: i  reason: collision with root package name */
        public final short f8339i;

        /* renamed from: j  reason: collision with root package name */
        public final short f8340j;

        /* renamed from: k  reason: collision with root package name */
        public final short f8341k;

        /* renamed from: l  reason: collision with root package name */
        public final short f8342l;

        /* renamed from: m  reason: collision with root package name */
        public final short f8343m;

        /* renamed from: n  reason: collision with root package name */
        public final short f8344n;

        /* synthetic */ a(FileChannel fileChannel, byte b5) {
            this(fileChannel);
        }

        private a(FileChannel fileChannel) {
            byte[] bArr = new byte[16];
            this.f8331a = bArr;
            fileChannel.position(0L);
            fileChannel.read(ByteBuffer.wrap(bArr));
            if (bArr[0] == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
                byte b5 = bArr[4];
                h.a(b5, 2, "bad elf class: " + ((int) bArr[4]));
                byte b6 = bArr[5];
                h.a(b6, 2, "bad elf data encoding: " + ((int) bArr[5]));
                ByteBuffer allocate = ByteBuffer.allocate(bArr[4] == 1 ? 36 : 48);
                allocate.order(bArr[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
                h.b(fileChannel, allocate, "failed to read rest part of ehdr.");
                this.f8332b = allocate.getShort();
                this.f8333c = allocate.getShort();
                int i4 = allocate.getInt();
                this.f8334d = i4;
                h.a(i4, 1, "bad elf version: " + i4);
                byte b7 = bArr[4];
                if (b7 == 1) {
                    this.f8335e = allocate.getInt();
                    this.f8336f = allocate.getInt();
                    this.f8337g = allocate.getInt();
                } else if (b7 == 2) {
                    this.f8335e = allocate.getLong();
                    this.f8336f = allocate.getLong();
                    this.f8337g = allocate.getLong();
                } else {
                    throw new IOException("Unexpected elf class: " + ((int) bArr[4]));
                }
                this.f8338h = allocate.getInt();
                this.f8339i = allocate.getShort();
                this.f8340j = allocate.getShort();
                this.f8341k = allocate.getShort();
                this.f8342l = allocate.getShort();
                this.f8343m = allocate.getShort();
                this.f8344n = allocate.getShort();
                return;
            }
            throw new IOException(String.format("bad elf magic: %x %x %x %x.", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3])));
        }
    }

    /* loaded from: classes2.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f8345a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8346b;

        /* renamed from: c  reason: collision with root package name */
        public final long f8347c;

        /* renamed from: d  reason: collision with root package name */
        public final long f8348d;

        /* renamed from: e  reason: collision with root package name */
        public final long f8349e;

        /* renamed from: f  reason: collision with root package name */
        public final long f8350f;

        /* renamed from: g  reason: collision with root package name */
        public final long f8351g;

        /* renamed from: h  reason: collision with root package name */
        public final long f8352h;

        /* synthetic */ b(ByteBuffer byteBuffer, int i4, byte b5) {
            this(byteBuffer, i4);
        }

        private b(ByteBuffer byteBuffer, int i4) {
            if (i4 == 1) {
                this.f8345a = byteBuffer.getInt();
                this.f8347c = byteBuffer.getInt();
                this.f8348d = byteBuffer.getInt();
                this.f8349e = byteBuffer.getInt();
                this.f8350f = byteBuffer.getInt();
                this.f8351g = byteBuffer.getInt();
                this.f8346b = byteBuffer.getInt();
                this.f8352h = byteBuffer.getInt();
            } else if (i4 == 2) {
                this.f8345a = byteBuffer.getInt();
                this.f8346b = byteBuffer.getInt();
                this.f8347c = byteBuffer.getLong();
                this.f8348d = byteBuffer.getLong();
                this.f8349e = byteBuffer.getLong();
                this.f8350f = byteBuffer.getLong();
                this.f8351g = byteBuffer.getLong();
                this.f8352h = byteBuffer.getLong();
            } else {
                throw new IOException("Unexpected elf class: ".concat(String.valueOf(i4)));
            }
        }
    }

    /* loaded from: classes2.dex */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f8353a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8354b;

        /* renamed from: c  reason: collision with root package name */
        public final long f8355c;

        /* renamed from: d  reason: collision with root package name */
        public final long f8356d;

        /* renamed from: e  reason: collision with root package name */
        public final long f8357e;

        /* renamed from: f  reason: collision with root package name */
        public final long f8358f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8359g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8360h;

        /* renamed from: i  reason: collision with root package name */
        public final long f8361i;

        /* renamed from: j  reason: collision with root package name */
        public final long f8362j;

        /* renamed from: k  reason: collision with root package name */
        public String f8363k;

        /* synthetic */ c(ByteBuffer byteBuffer, int i4, byte b5) {
            this(byteBuffer, i4);
        }

        private c(ByteBuffer byteBuffer, int i4) {
            if (i4 == 1) {
                this.f8353a = byteBuffer.getInt();
                this.f8354b = byteBuffer.getInt();
                this.f8355c = byteBuffer.getInt();
                this.f8356d = byteBuffer.getInt();
                this.f8357e = byteBuffer.getInt();
                this.f8358f = byteBuffer.getInt();
                this.f8359g = byteBuffer.getInt();
                this.f8360h = byteBuffer.getInt();
                this.f8361i = byteBuffer.getInt();
                this.f8362j = byteBuffer.getInt();
            } else if (i4 == 2) {
                this.f8353a = byteBuffer.getInt();
                this.f8354b = byteBuffer.getInt();
                this.f8355c = byteBuffer.getLong();
                this.f8356d = byteBuffer.getLong();
                this.f8357e = byteBuffer.getLong();
                this.f8358f = byteBuffer.getLong();
                this.f8359g = byteBuffer.getInt();
                this.f8360h = byteBuffer.getInt();
                this.f8361i = byteBuffer.getLong();
                this.f8362j = byteBuffer.getLong();
            } else {
                throw new IOException("Unexpected elf class: ".concat(String.valueOf(i4)));
            }
            this.f8363k = null;
        }
    }

    private h(File file) {
        c[] cVarArr;
        c[] cVarArr2;
        this.f8327b = null;
        this.f8328c = null;
        this.f8329d = null;
        FileInputStream fileInputStream = new FileInputStream(file);
        this.f8326a = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        this.f8327b = new a(channel, (byte) 0);
        ByteBuffer allocate = ByteBuffer.allocate(128);
        allocate.limit(this.f8327b.f8340j);
        allocate.order(this.f8327b.f8331a[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
        channel.position(this.f8327b.f8336f);
        this.f8328c = new b[this.f8327b.f8341k];
        for (int i4 = 0; i4 < this.f8328c.length; i4++) {
            b(channel, allocate, "failed to read phdr.");
            this.f8328c[i4] = new b(allocate, this.f8327b.f8331a[4], (byte) 0);
        }
        channel.position(this.f8327b.f8337g);
        allocate.limit(this.f8327b.f8342l);
        this.f8329d = new c[this.f8327b.f8343m];
        int i5 = 0;
        while (true) {
            cVarArr = this.f8329d;
            if (i5 >= cVarArr.length) {
                break;
            }
            b(channel, allocate, "failed to read shdr.");
            this.f8329d[i5] = new c(allocate, this.f8327b.f8331a[4], (byte) 0);
            i5++;
        }
        short s4 = this.f8327b.f8344n;
        if (s4 > 0) {
            c cVar = cVarArr[s4];
            ByteBuffer allocate2 = ByteBuffer.allocate((int) cVar.f8358f);
            this.f8326a.getChannel().position(cVar.f8357e);
            b(this.f8326a.getChannel(), allocate2, "failed to read section: " + cVar.f8363k);
            for (c cVar2 : this.f8329d) {
                allocate2.position(cVar2.f8353a);
                String a5 = a(allocate2);
                cVar2.f8363k = a5;
                this.f8330e.put(a5, cVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(FileChannel fileChannel, ByteBuffer byteBuffer, String str) {
        byteBuffer.rewind();
        int read = fileChannel.read(byteBuffer);
        if (read == byteBuffer.limit()) {
            byteBuffer.flip();
            return;
        }
        throw new IOException(str + " Rest bytes insufficient, expect to read " + byteBuffer.limit() + " bytes but only " + read + " bytes were read.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8326a.close();
        this.f8330e.clear();
        this.f8328c = null;
        this.f8329d = null;
    }

    public static boolean a(File file) {
        try {
            com.bytedance.pangle.util.g.a(new h(file));
            return true;
        } catch (IOException unused) {
            com.bytedance.pangle.util.g.a((Closeable) null);
            return false;
        } catch (Throwable th) {
            com.bytedance.pangle.util.g.a((Closeable) null);
            throw th;
        }
    }

    private static String a(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int position = byteBuffer.position();
        while (byteBuffer.hasRemaining() && array[byteBuffer.position()] != 0) {
            byteBuffer.position(byteBuffer.position() + 1);
        }
        byteBuffer.position(byteBuffer.position() + 1);
        return new String(array, position, (byteBuffer.position() - position) - 1, Charset.forName("ASCII"));
    }

    static /* synthetic */ void a(int i4, int i5, String str) {
        if (i4 <= 0 || i4 > i5) {
            throw new IOException(str);
        }
    }
}
