package io.netty.channel.unix;

import io.netty.util.internal.EmptyArrays;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.nio.channels.AlreadyConnectedException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ConnectionPendingException;
import java.nio.channels.NotYetConnectedException;
/* loaded from: classes6.dex */
public final class Errors {
    public static final int ERRNO_ENOENT_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errnoENOENT();
    public static final int ERRNO_ENOTCONN_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errnoENOTCONN();
    public static final int ERRNO_EBADF_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errnoEBADF();
    public static final int ERRNO_EPIPE_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errnoEPIPE();
    public static final int ERRNO_ECONNRESET_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errnoECONNRESET();
    public static final int ERRNO_EAGAIN_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errnoEAGAIN();
    public static final int ERRNO_EWOULDBLOCK_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errnoEWOULDBLOCK();
    public static final int ERRNO_EINPROGRESS_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errnoEINPROGRESS();
    public static final int ERROR_ECONNREFUSED_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errorECONNREFUSED();
    public static final int ERROR_EISCONN_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errorEISCONN();
    public static final int ERROR_EALREADY_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errorEALREADY();
    public static final int ERROR_ENETUNREACH_NEGATIVE = -ErrorsStaticallyReferencedJniMethods.errorENETUNREACH();
    private static final String[] ERRORS = new String[512];

    /* loaded from: classes6.dex */
    static final class NativeConnectException extends ConnectException {
        private static final long serialVersionUID = -5532328671712318161L;
        private final int expectedErr;

        NativeConnectException(String str, int i4) {
            super(str + "(..) failed: " + Errors.ERRORS[-i4]);
            this.expectedErr = i4;
        }

        int expectedErr() {
            return this.expectedErr;
        }
    }

    /* loaded from: classes6.dex */
    public static final class NativeIoException extends IOException {
        private static final long serialVersionUID = 8222160204268655526L;
        private final int expectedErr;
        private final boolean fillInStackTrace;

        public NativeIoException(String str, int i4) {
            this(str, i4, true);
        }

        public int expectedErr() {
            return this.expectedErr;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            if (this.fillInStackTrace) {
                return super.fillInStackTrace();
            }
            return this;
        }

        public NativeIoException(String str, int i4, boolean z4) {
            super(str + "(..) failed: " + Errors.ERRORS[-i4]);
            this.expectedErr = i4;
            this.fillInStackTrace = z4;
        }
    }

    static {
        int i4 = 0;
        while (true) {
            String[] strArr = ERRORS;
            if (i4 >= strArr.length) {
                return;
            }
            strArr[i4] = ErrorsStaticallyReferencedJniMethods.strError(i4);
            i4++;
        }
    }

    private Errors() {
    }

    @Deprecated
    public static int ioResult(String str, int i4, NativeIoException nativeIoException, ClosedChannelException closedChannelException) throws IOException {
        if (i4 == ERRNO_EAGAIN_NEGATIVE || i4 == ERRNO_EWOULDBLOCK_NEGATIVE) {
            return 0;
        }
        if (i4 != nativeIoException.expectedErr()) {
            if (i4 != ERRNO_EBADF_NEGATIVE) {
                if (i4 != ERRNO_ENOTCONN_NEGATIVE) {
                    if (i4 == ERRNO_ENOENT_NEGATIVE) {
                        throw new FileNotFoundException();
                    }
                    throw newIOException(str, i4);
                }
                throw new NotYetConnectedException();
            }
            throw closedChannelException;
        }
        throw nativeIoException;
    }

    public static NativeIoException newConnectionResetException(String str, int i4) {
        NativeIoException nativeIoException = new NativeIoException(str, i4, false);
        nativeIoException.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
        return nativeIoException;
    }

    public static NativeIoException newIOException(String str, int i4) {
        return new NativeIoException(str, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void throwConnectException(String str, int i4) throws IOException {
        if (i4 != ERROR_EALREADY_NEGATIVE) {
            if (i4 != ERROR_ENETUNREACH_NEGATIVE) {
                if (i4 != ERROR_EISCONN_NEGATIVE) {
                    if (i4 == ERRNO_ENOENT_NEGATIVE) {
                        throw new FileNotFoundException();
                    }
                    throw new ConnectException(str + "(..) failed: " + ERRORS[-i4]);
                }
                throw new AlreadyConnectedException();
            }
            throw new NoRouteToHostException();
        }
        throw new ConnectionPendingException();
    }

    public static int ioResult(String str, int i4) throws IOException {
        if (i4 == ERRNO_EAGAIN_NEGATIVE || i4 == ERRNO_EWOULDBLOCK_NEGATIVE) {
            return 0;
        }
        if (i4 != ERRNO_EBADF_NEGATIVE) {
            if (i4 != ERRNO_ENOTCONN_NEGATIVE) {
                if (i4 == ERRNO_ENOENT_NEGATIVE) {
                    throw new FileNotFoundException();
                }
                throw new NativeIoException(str, i4, false);
            }
            throw new NotYetConnectedException();
        }
        throw new ClosedChannelException();
    }
}
