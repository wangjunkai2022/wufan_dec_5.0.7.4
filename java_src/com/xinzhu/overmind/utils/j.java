package com.xinzhu.overmind.utils;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import kotlin.text.Typography;
import org.xmlpull.v1.XmlSerializer;
/* compiled from: FastXmlSerializer.java */
/* loaded from: classes6.dex */
public class j implements XmlSerializer {

    /* renamed from: m  reason: collision with root package name */
    private static final int f68353m = 32768;

    /* renamed from: a  reason: collision with root package name */
    private final int f68355a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f68356b;

    /* renamed from: c  reason: collision with root package name */
    private int f68357c;

    /* renamed from: d  reason: collision with root package name */
    private Writer f68358d;

    /* renamed from: e  reason: collision with root package name */
    private OutputStream f68359e;

    /* renamed from: f  reason: collision with root package name */
    private CharsetEncoder f68360f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f68361g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f68362h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f68363i;

    /* renamed from: j  reason: collision with root package name */
    private int f68364j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f68365k;

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f68352l = {"&#0;", "&#1;", "&#2;", "&#3;", "&#4;", "&#5;", "&#6;", "&#7;", "&#8;", "&#9;", "&#10;", "&#11;", "&#12;", "&#13;", "&#14;", "&#15;", "&#16;", "&#17;", "&#18;", "&#19;", "&#20;", "&#21;", "&#22;", "&#23;", "&#24;", "&#25;", "&#26;", "&#27;", "&#28;", "&#29;", "&#30;", "&#31;", null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: n  reason: collision with root package name */
    private static String f68354n = "                                                              ";

    public j() {
        this(32768);
    }

    private void a(char c5) throws IOException {
        int i4 = this.f68357c;
        if (i4 >= this.f68355a - 1) {
            flush();
            i4 = this.f68357c;
        }
        this.f68356b[i4] = c5;
        this.f68357c = i4 + 1;
    }

    private void b(String str) throws IOException {
        c(str, 0, str.length());
    }

    private void c(String str, int i4, int i5) throws IOException {
        int i6 = this.f68355a;
        if (i5 <= i6) {
            int i7 = this.f68357c;
            if (i7 + i5 > i6) {
                flush();
                i7 = this.f68357c;
            }
            str.getChars(i4, i4 + i5, this.f68356b, i7);
            this.f68357c = i7 + i5;
            return;
        }
        int i8 = i5 + i4;
        while (i4 < i8) {
            int i9 = this.f68355a;
            int i10 = i4 + i9;
            if (i10 >= i8) {
                i9 = i8 - i4;
            }
            c(str, i4, i9);
            i4 = i10;
        }
    }

    private void d(char[] cArr, int i4, int i5) throws IOException {
        int i6 = this.f68355a;
        if (i5 <= i6) {
            int i7 = this.f68357c;
            if (i7 + i5 > i6) {
                flush();
                i7 = this.f68357c;
            }
            System.arraycopy(cArr, i4, this.f68356b, i7, i5);
            this.f68357c = i7 + i5;
            return;
        }
        int i8 = i5 + i4;
        while (i4 < i8) {
            int i9 = this.f68355a;
            int i10 = i4 + i9;
            if (i10 >= i8) {
                i9 = i8 - i4;
            }
            d(cArr, i4, i9);
            i4 = i10;
        }
    }

    private void e(int i4) throws IOException {
        int i5 = i4 * 4;
        if (i5 > f68354n.length()) {
            i5 = f68354n.length();
        }
        c(f68354n, 0, i5);
    }

    private void f(String str) throws IOException {
        String str2;
        int length = str.length();
        String[] strArr = f68352l;
        char length2 = (char) strArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i5 < i4) {
                    c(str, i5, i4 - i5);
                }
                i5 = i4 + 1;
                b(str2);
            }
            i4++;
        }
        if (i5 < i4) {
            c(str, i5, i4 - i5);
        }
    }

    private void g(char[] cArr, int i4, int i5) throws IOException {
        String str;
        String[] strArr = f68352l;
        char length = (char) strArr.length;
        int i6 = i5 + i4;
        int i7 = i4;
        while (i4 < i6) {
            char c5 = cArr[i4];
            if (c5 < length && (str = strArr[c5]) != null) {
                if (i7 < i4) {
                    d(cArr, i7, i4 - i7);
                }
                i7 = i4 + 1;
                b(str);
            }
            i4++;
        }
        if (i7 < i4) {
            d(cArr, i7, i4 - i7);
        }
    }

    private void h() throws IOException {
        int position = this.f68361g.position();
        if (position > 0) {
            this.f68361g.flip();
            this.f68359e.write(this.f68361g.array(), 0, position);
            this.f68361g.clear();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        a(' ');
        if (str != null) {
            b(str);
            a(':');
        }
        b(str2);
        b("=\"");
        f(str3);
        a('\"');
        this.f68365k = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        int i4 = this.f68364j - 1;
        this.f68364j = i4;
        if (this.f68363i) {
            b(" />\n");
        } else {
            if (this.f68362h && this.f68365k) {
                e(i4);
            }
            b("</");
            if (str != null) {
                b(str);
                a(':');
            }
            b(str2);
            b(">\n");
        }
        this.f68365k = true;
        this.f68363i = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        int i4 = this.f68357c;
        if (i4 > 0) {
            if (this.f68359e != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f68356b, 0, i4);
                CoderResult encode = this.f68360f.encode(wrap, this.f68361g, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        h();
                        encode = this.f68360f.encode(wrap, this.f68361g, true);
                    } else {
                        h();
                        this.f68359e.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.f68358d.write(this.f68356b, 0, i4);
            this.f68358d.flush();
            this.f68357c = 0;
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getName() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z4) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z4) throws IllegalArgumentException, IllegalStateException {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.f68362h = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream != null) {
            try {
                this.f68360f = Charset.forName(str).newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
                this.f68359e = outputStream;
                return;
            } catch (IllegalCharsetNameException e5) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e5));
            } catch (UnsupportedCharsetException e6) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e6));
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version='1.0' encoding='utf-8' standalone='");
        sb.append(bool.booleanValue() ? "yes" : "no");
        sb.append("' ?>\n");
        b(sb.toString());
        this.f68365k = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f68363i) {
            b(">\n");
        }
        if (this.f68362h) {
            e(this.f68364j);
        }
        this.f68364j++;
        a(Typography.less);
        if (str != null) {
            b(str);
            a(':');
        }
        b(str2);
        this.f68363i = true;
        this.f68365k = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i4, int i5) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f68363i) {
            b(SimpleComparison.GREATER_THAN_OPERATION);
            this.f68363i = false;
        }
        g(cArr, i4, i5);
        if (this.f68362h) {
            this.f68365k = cArr[(i4 + i5) - 1] == '\n';
        }
        return this;
    }

    public j(int i4) {
        this.f68362h = false;
        this.f68364j = 0;
        this.f68365k = true;
        i4 = i4 <= 0 ? 32768 : i4;
        this.f68355a = i4;
        this.f68356b = new char[i4];
        this.f68361g = ByteBuffer.allocate(i4);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        boolean z4 = false;
        if (this.f68363i) {
            b(SimpleComparison.GREATER_THAN_OPERATION);
            this.f68363i = false;
        }
        f(str);
        if (this.f68362h) {
            if (str.length() > 0 && str.charAt(str.length() - 1) == '\n') {
                z4 = true;
            }
            this.f68365k = z4;
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f68358d = writer;
    }
}
