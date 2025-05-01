package com.ta.utdid2.core.persistent;

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
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import kotlin.text.Typography;
import org.xmlpull.v1.XmlSerializer;
/* loaded from: classes5.dex */
class a implements XmlSerializer {

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f62061h = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: b  reason: collision with root package name */
    private int f62063b;

    /* renamed from: c  reason: collision with root package name */
    private Writer f62064c;

    /* renamed from: d  reason: collision with root package name */
    private OutputStream f62065d;

    /* renamed from: e  reason: collision with root package name */
    private CharsetEncoder f62066e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f62068g;

    /* renamed from: a  reason: collision with root package name */
    private final char[] f62062a = new char[8192];

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f62067f = ByteBuffer.allocate(8192);

    private void a(char c5) throws IOException {
        int i4 = this.f62063b;
        if (i4 >= 8191) {
            flush();
            i4 = this.f62063b;
        }
        this.f62062a[i4] = c5;
        this.f62063b = i4 + 1;
    }

    private void b(String str) throws IOException {
        c(str, 0, str.length());
    }

    private void c(String str, int i4, int i5) throws IOException {
        if (i5 > 8192) {
            int i6 = i5 + i4;
            while (i4 < i6) {
                int i7 = i4 + 8192;
                c(str, i4, i7 < i6 ? 8192 : i6 - i4);
                i4 = i7;
            }
            return;
        }
        int i8 = this.f62063b;
        if (i8 + i5 > 8192) {
            flush();
            i8 = this.f62063b;
        }
        str.getChars(i4, i4 + i5, this.f62062a, i8);
        this.f62063b = i8 + i5;
    }

    private void d(char[] cArr, int i4, int i5) throws IOException {
        if (i5 > 8192) {
            int i6 = i5 + i4;
            while (i4 < i6) {
                int i7 = i4 + 8192;
                d(cArr, i4, i7 < i6 ? 8192 : i6 - i4);
                i4 = i7;
            }
            return;
        }
        int i8 = this.f62063b;
        if (i8 + i5 > 8192) {
            flush();
            i8 = this.f62063b;
        }
        System.arraycopy(cArr, i4, this.f62062a, i8, i5);
        this.f62063b = i8 + i5;
    }

    private void e(String str) throws IOException {
        String str2;
        int length = str.length();
        String[] strArr = f62061h;
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

    private void f(char[] cArr, int i4, int i5) throws IOException {
        String str;
        String[] strArr = f62061h;
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

    private void g() throws IOException {
        int position = this.f62067f.position();
        if (position > 0) {
            this.f62067f.flip();
            this.f62065d.write(this.f62067f.array(), 0, position);
            this.f62067f.clear();
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
        e(str3);
        a('\"');
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
        if (this.f62068g) {
            b(" />\n");
        } else {
            b("</");
            if (str != null) {
                b(str);
                a(':');
            }
            b(str2);
            b(">\n");
        }
        this.f62068g = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        int i4 = this.f62063b;
        if (i4 > 0) {
            if (this.f62065d != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f62062a, 0, i4);
                CoderResult encode = this.f62066e.encode(wrap, this.f62067f, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        g();
                        encode = this.f62066e.encode(wrap, this.f62067f, true);
                    } else {
                        g();
                        this.f62065d.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.f62064c.write(this.f62062a, 0, i4);
            this.f62064c.flush();
            this.f62063b = 0;
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
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream != null) {
            try {
                this.f62066e = Charset.forName(str).newEncoder();
                this.f62065d = outputStream;
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
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        sb.append(bool.booleanValue() ? "yes" : "no");
        sb.append("' ?>\n");
        b(sb.toString());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f62068g) {
            b(">\n");
        }
        a(Typography.less);
        if (str != null) {
            b(str);
            a(':');
        }
        b(str2);
        this.f62068g = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i4, int i5) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f62068g) {
            b(SimpleComparison.GREATER_THAN_OPERATION);
            this.f62068g = false;
        }
        f(cArr, i4, i5);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f62068g) {
            b(SimpleComparison.GREATER_THAN_OPERATION);
            this.f62068g = false;
        }
        e(str);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f62064c = writer;
    }
}
