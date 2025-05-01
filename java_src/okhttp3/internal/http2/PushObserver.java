package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okio.BufferedSource;
/* loaded from: classes7.dex */
public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() { // from class: okhttp3.internal.http2.PushObserver.1
        @Override // okhttp3.internal.http2.PushObserver
        public boolean onData(int i4, BufferedSource bufferedSource, int i5, boolean z4) throws IOException {
            bufferedSource.skip(i5);
            return true;
        }

        @Override // okhttp3.internal.http2.PushObserver
        public boolean onHeaders(int i4, List<Header> list, boolean z4) {
            return true;
        }

        @Override // okhttp3.internal.http2.PushObserver
        public boolean onRequest(int i4, List<Header> list) {
            return true;
        }

        @Override // okhttp3.internal.http2.PushObserver
        public void onReset(int i4, ErrorCode errorCode) {
        }
    };

    boolean onData(int i4, BufferedSource bufferedSource, int i5, boolean z4) throws IOException;

    boolean onHeaders(int i4, List<Header> list, boolean z4);

    boolean onRequest(int i4, List<Header> list);

    void onReset(int i4, ErrorCode errorCode);
}
