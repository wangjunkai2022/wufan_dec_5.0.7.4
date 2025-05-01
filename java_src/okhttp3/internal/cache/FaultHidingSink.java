package okhttp3.internal.cache;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;
/* loaded from: classes7.dex */
class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FaultHidingSink(Sink sink) {
        super(sink);
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e5) {
            this.hasErrors = true;
            onException(e5);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e5) {
            this.hasErrors = true;
            onException(e5);
        }
    }

    protected void onException(IOException iOException) {
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer buffer, long j4) throws IOException {
        if (this.hasErrors) {
            buffer.skip(j4);
            return;
        }
        try {
            super.write(buffer, j4);
        } catch (IOException e5) {
            this.hasErrors = true;
            onException(e5);
        }
    }
}
