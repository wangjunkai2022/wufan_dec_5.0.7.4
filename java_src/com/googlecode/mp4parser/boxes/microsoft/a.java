package com.googlecode.mp4parser.boxes.microsoft;

import com.googlecode.mp4parser.j;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: XtraBox.java */
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.a {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;
    private static final /* synthetic */ c.b H = null;
    private static final /* synthetic */ c.b I = null;

    /* renamed from: r  reason: collision with root package name */
    public static final String f13851r = "Xtra";

    /* renamed from: s  reason: collision with root package name */
    public static final int f13852s = 8;

    /* renamed from: t  reason: collision with root package name */
    public static final int f13853t = 19;

    /* renamed from: u  reason: collision with root package name */
    public static final int f13854u = 21;

    /* renamed from: v  reason: collision with root package name */
    public static final int f13855v = 72;

    /* renamed from: w  reason: collision with root package name */
    private static final long f13856w = 11644473600000L;

    /* renamed from: x  reason: collision with root package name */
    private static final long f13857x = 10000;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13858y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13859z = null;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13860o;

    /* renamed from: p  reason: collision with root package name */
    Vector<b> f13861p;

    /* renamed from: q  reason: collision with root package name */
    ByteBuffer f13862q;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XtraBox.java */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f13866a;

        /* renamed from: b  reason: collision with root package name */
        public String f13867b;

        /* renamed from: c  reason: collision with root package name */
        public long f13868c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f13869d;

        /* renamed from: e  reason: collision with root package name */
        public Date f13870e;

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(ByteBuffer byteBuffer) {
            try {
                byteBuffer.putInt(f());
                byteBuffer.putShort((short) this.f13866a);
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int i4 = this.f13866a;
                if (i4 == 8) {
                    a.Q(byteBuffer, this.f13867b);
                } else if (i4 == 19) {
                    byteBuffer.putLong(this.f13868c);
                } else if (i4 == 21) {
                    byteBuffer.putLong(a.H(this.f13870e.getTime()));
                } else {
                    byteBuffer.put(this.f13869d);
                }
            } finally {
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int f() {
            int length;
            int i4 = this.f13866a;
            if (i4 == 8) {
                length = (this.f13867b.length() * 2) + 2;
            } else if (i4 == 19 || i4 == 21) {
                return 14;
            } else {
                length = this.f13869d.length;
            }
            return length + 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object g() {
            int i4 = this.f13866a;
            if (i4 != 8) {
                if (i4 != 19) {
                    if (i4 != 21) {
                        return this.f13869d;
                    }
                    return this.f13870e;
                }
                return new Long(this.f13868c);
            }
            return this.f13867b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(ByteBuffer byteBuffer) {
            int i4 = byteBuffer.getInt() - 6;
            this.f13866a = byteBuffer.getShort();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            int i5 = this.f13866a;
            if (i5 == 8) {
                this.f13867b = a.J(byteBuffer, i4);
            } else if (i5 == 19) {
                this.f13868c = byteBuffer.getLong();
            } else if (i5 != 21) {
                byte[] bArr = new byte[i4];
                this.f13869d = bArr;
                byteBuffer.get(bArr);
            } else {
                this.f13870e = new Date(a.A(byteBuffer.getLong()));
            }
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public String toString() {
            int i4 = this.f13866a;
            if (i4 == 8) {
                return "[string]" + this.f13867b;
            } else if (i4 == 19) {
                return "[long]" + String.valueOf(this.f13868c);
            } else if (i4 != 21) {
                return "[GUID](nonParsed)";
            } else {
                return "[filetime]" + this.f13870e.toString();
            }
        }

        /* synthetic */ c(c cVar) {
            this();
        }

        private c(String str) {
            this.f13866a = 8;
            this.f13867b = str;
        }

        /* synthetic */ c(String str, c cVar) {
            this(str);
        }

        private c(long j4) {
            this.f13866a = 19;
            this.f13868c = j4;
        }

        /* synthetic */ c(long j4, c cVar) {
            this(j4);
        }

        private c(Date date) {
            this.f13866a = 21;
            this.f13870e = date;
        }

        /* synthetic */ c(Date date, c cVar) {
            this(date);
        }
    }

    static {
        y();
    }

    public a() {
        super(f13851r);
        this.f13860o = false;
        this.f13861p = new Vector<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long A(long j4) {
        return (j4 / 10000) - f13856w;
    }

    private b F(String str) {
        Iterator<b> it2 = this.f13861p.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.f13864b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long H(long j4) {
        return (j4 + f13856w) * 10000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String I(ByteBuffer byteBuffer, int i4) {
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, com.alipay.security.mobile.module.commonutils.crypto.a.f4994b);
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("Shouldn't happen", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String J(ByteBuffer byteBuffer, int i4) {
        int i5 = (i4 / 2) - 1;
        char[] cArr = new char[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            cArr[i6] = byteBuffer.getChar();
        }
        byteBuffer.getChar();
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(ByteBuffer byteBuffer, String str) {
        try {
            byteBuffer.put(str.getBytes(com.alipay.security.mobile.module.commonutils.crypto.a.f4994b));
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("Shouldn't happen", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(ByteBuffer byteBuffer, String str) {
        for (char c5 : str.toCharArray()) {
            byteBuffer.putChar(c5);
        }
        byteBuffer.putChar((char) 0);
    }

    private static /* synthetic */ void y() {
        e eVar = new e("XtraBox.java", a.class);
        f13858y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "java.lang.String"), 88);
        f13859z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAllTagNames", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "[Ljava.lang.String;"), 151);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:long", "name:value", "", "void"), 289);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFirstStringValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.String"), 166);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFirstDateValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.util.Date"), 183);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFirstLongValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.Long"), 200);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "[Ljava.lang.Object;"), 216);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "removeTag", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "void"), 236);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTagValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:[Ljava.lang.String;", "name:values", "", "void"), 249);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.lang.String", "name:value", "", "void"), 265);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.util.Date", "name:date", "", "void"), 276);
    }

    private int z() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f13861p.size(); i5++) {
            i4 += this.f13861p.elementAt(i5).g();
        }
        return i4;
    }

    public String[] B() {
        j.b().c(e.v(f13859z, this, this));
        String[] strArr = new String[this.f13861p.size()];
        for (int i4 = 0; i4 < this.f13861p.size(); i4++) {
            strArr[i4] = this.f13861p.elementAt(i4).f13864b;
        }
        return strArr;
    }

    public Date C(String str) {
        Object[] G2;
        j.b().c(e.w(B, this, this, str));
        for (Object obj : G(str)) {
            if (obj instanceof Date) {
                return (Date) obj;
            }
        }
        return null;
    }

    public Long D(String str) {
        Object[] G2;
        j.b().c(e.w(C, this, this, str));
        for (Object obj : G(str)) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
        }
        return null;
    }

    public String E(String str) {
        Object[] G2;
        j.b().c(e.w(A, this, this, str));
        for (Object obj : G(str)) {
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    public Object[] G(String str) {
        j.b().c(e.w(D, this, this, str));
        b F2 = F(str);
        if (F2 != null) {
            Object[] objArr = new Object[F2.f13865c.size()];
            for (int i4 = 0; i4 < F2.f13865c.size(); i4++) {
                objArr[i4] = ((c) F2.f13865c.elementAt(i4)).g();
            }
            return objArr;
        }
        return new Object[0];
    }

    public void K(String str) {
        j.b().c(e.w(E, this, this, str));
        b F2 = F(str);
        if (F2 != null) {
            this.f13861p.remove(F2);
        }
    }

    public void L(String str, long j4) {
        j.b().c(e.x(I, this, this, str, org.aspectj.runtime.internal.e.m(j4)));
        K(str);
        b bVar = new b(str, null);
        bVar.f13865c.addElement(new c(j4, (c) null));
        this.f13861p.addElement(bVar);
    }

    public void M(String str, String str2) {
        j.b().c(e.x(G, this, this, str, str2));
        O(str, new String[]{str2});
    }

    public void N(String str, Date date) {
        j.b().c(e.x(H, this, this, str, date));
        K(str);
        b bVar = new b(str, null);
        bVar.f13865c.addElement(new c(date, (c) null));
        this.f13861p.addElement(bVar);
    }

    public void O(String str, String[] strArr) {
        j.b().c(e.x(F, this, this, str, strArr));
        K(str);
        b bVar = new b(str, null);
        for (String str2 : strArr) {
            bVar.f13865c.addElement(new c(str2, (c) null));
        }
        this.f13861p.addElement(bVar);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        int z4;
        int remaining = byteBuffer.remaining();
        this.f13862q = byteBuffer.slice();
        this.f13860o = false;
        try {
            try {
                this.f13861p.clear();
                while (byteBuffer.remaining() > 0) {
                    b bVar = new b((b) null);
                    bVar.h(byteBuffer);
                    this.f13861p.addElement(bVar);
                }
                z4 = z();
            } catch (Exception e5) {
                this.f13860o = false;
                PrintStream printStream = System.err;
                printStream.println("Malformed Xtra Tag detected: " + e5.toString());
                e5.printStackTrace();
                byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
            }
            if (remaining == z4) {
                this.f13860o = true;
                return;
            }
            throw new RuntimeException("Improperly handled Xtra tag: Calculated sizes don't match ( " + remaining + net.lingala.zip4j.util.e.F0 + z4 + ")");
        } finally {
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        if (this.f13860o) {
            for (int i4 = 0; i4 < this.f13861p.size(); i4++) {
                this.f13861p.elementAt(i4).f(byteBuffer);
            }
            return;
        }
        this.f13862q.rewind();
        byteBuffer.put(this.f13862q);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        int limit;
        if (this.f13860o) {
            limit = z();
        } else {
            limit = this.f13862q.limit();
        }
        return limit;
    }

    public String toString() {
        j.b().c(e.v(f13858y, this, this));
        if (!l()) {
            n();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("XtraBox[");
        Iterator<b> it2 = this.f13861p.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            Iterator it3 = next.f13865c.iterator();
            while (it3.hasNext()) {
                stringBuffer.append(next.f13864b);
                stringBuffer.append(SimpleComparison.EQUAL_TO_OPERATION);
                stringBuffer.append(((c) it3.next()).toString());
                stringBuffer.append(";");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XtraBox.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f13863a;

        /* renamed from: b  reason: collision with root package name */
        private String f13864b;

        /* renamed from: c  reason: collision with root package name */
        private Vector<c> f13865c;

        private b() {
            this.f13865c = new Vector<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(ByteBuffer byteBuffer) {
            byteBuffer.putInt(g());
            byteBuffer.putInt(this.f13864b.length());
            a.P(byteBuffer, this.f13864b);
            byteBuffer.putInt(this.f13865c.size());
            for (int i4 = 0; i4 < this.f13865c.size(); i4++) {
                this.f13865c.elementAt(i4).e(byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int g() {
            int length = this.f13864b.length() + 12;
            for (int i4 = 0; i4 < this.f13865c.size(); i4++) {
                length += this.f13865c.elementAt(i4).f();
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(ByteBuffer byteBuffer) {
            this.f13863a = byteBuffer.getInt();
            this.f13864b = a.I(byteBuffer, byteBuffer.getInt());
            int i4 = byteBuffer.getInt();
            for (int i5 = 0; i5 < i4; i5++) {
                c cVar = new c((c) null);
                cVar.h(byteBuffer);
                this.f13865c.addElement(cVar);
            }
            if (this.f13863a == g()) {
                return;
            }
            throw new RuntimeException("Improperly handled Xtra tag: Sizes don't match ( " + this.f13863a + net.lingala.zip4j.util.e.F0 + g() + ") on " + this.f13864b);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f13864b);
            stringBuffer.append(" [");
            stringBuffer.append(this.f13863a);
            stringBuffer.append(net.lingala.zip4j.util.e.F0);
            stringBuffer.append(this.f13865c.size());
            stringBuffer.append("]:\n");
            for (int i4 = 0; i4 < this.f13865c.size(); i4++) {
                stringBuffer.append("  ");
                stringBuffer.append(this.f13865c.elementAt(i4).toString());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }

        /* synthetic */ b(b bVar) {
            this();
        }

        /* synthetic */ b(String str, b bVar) {
            this(str);
        }

        private b(String str) {
            this();
            this.f13864b = str;
        }
    }

    public a(String str) {
        super(str);
        this.f13860o = false;
        this.f13861p = new Vector<>();
    }
}
