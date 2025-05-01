package io.netty.handler.ssl;

import io.netty.internal.tcnative.CertificateVerifier;
import java.security.cert.CertificateException;
/* loaded from: classes6.dex */
public final class OpenSslCertificateException extends CertificateException {
    private static final long serialVersionUID = 5542675253797129798L;
    private final int errorCode;

    public OpenSslCertificateException(int i4) {
        this((String) null, i4);
    }

    private static int checkErrorCode(int i4) {
        if (!OpenSsl.isAvailable() || CertificateVerifier.isValid(i4)) {
            return i4;
        }
        throw new IllegalArgumentException("errorCode '" + i4 + "' invalid, see https://www.openssl.org/docs/man1.0.2/apps/verify.html.");
    }

    public int errorCode() {
        return this.errorCode;
    }

    public OpenSslCertificateException(String str, int i4) {
        super(str);
        this.errorCode = checkErrorCode(i4);
    }

    public OpenSslCertificateException(String str, Throwable th, int i4) {
        super(str, th);
        this.errorCode = checkErrorCode(i4);
    }

    public OpenSslCertificateException(Throwable th, int i4) {
        this(null, th, i4);
    }
}
