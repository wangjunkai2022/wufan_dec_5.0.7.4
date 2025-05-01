package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;
@NotThreadSafe
/* loaded from: classes7.dex */
public class ByteArrayEntityHC4 extends AbstractHttpEntityHC4 implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f72100b;
    @Deprecated
    protected final byte[] content;
    private final int len;
    private final int off;

    public ByteArrayEntityHC4(byte[] bArr, ContentType contentType) {
        Args.notNull(bArr, "Source byte array");
        this.content = bArr;
        this.f72100b = bArr;
        this.off = 0;
        this.len = bArr.length;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public InputStream getContent() {
        return new ByteArrayInputStream(this.f72100b, this.off, this.len);
    }

    public long getContentLength() {
        return this.len;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        Args.notNull(outputStream, "Output stream");
        outputStream.write(this.f72100b, this.off, this.len);
        outputStream.flush();
    }

    public ByteArrayEntityHC4(byte[] bArr, int i4, int i5, ContentType contentType) {
        int i6;
        Args.notNull(bArr, "Source byte array");
        if (i4 >= 0 && i4 <= bArr.length && i5 >= 0 && (i6 = i4 + i5) >= 0 && i6 <= bArr.length) {
            this.content = bArr;
            this.f72100b = bArr;
            this.off = i4;
            this.len = i5;
            if (contentType != null) {
                setContentType(contentType.toString());
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("off: " + i4 + " len: " + i5 + " b.length: " + bArr.length);
    }

    public ByteArrayEntityHC4(byte[] bArr) {
        this(bArr, null);
    }

    public ByteArrayEntityHC4(byte[] bArr, int i4, int i5) {
        this(bArr, i4, i5, null);
    }
}
