package io.netty.handler.codec.http2;
/* loaded from: classes6.dex */
public interface StreamByteDistributor {

    /* loaded from: classes6.dex */
    public interface StreamState {
        boolean hasFrame();

        long pendingBytes();

        Http2Stream stream();

        int windowSize();
    }

    /* loaded from: classes6.dex */
    public interface Writer {
        void write(Http2Stream http2Stream, int i4);
    }

    boolean distribute(int i4, Writer writer) throws Http2Exception;

    void updateDependencyTree(int i4, int i5, short s4, boolean z4);

    void updateStreamableBytes(StreamState streamState);
}
