.class public interface abstract Lcom/facebook/imagepipeline/memory/t;
.super Ljava/lang/Object;
.source "MemoryChunk.java"


# virtual methods
.method public abstract c(I[BII)I
.end method

.method public abstract close()V
.end method

.method public abstract e()Ljava/nio/ByteBuffer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract f(I)B
.end method

.method public abstract getSize()I
.end method

.method public abstract i()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsupportedOperationException;
        }
    .end annotation
.end method

.method public abstract isClosed()Z
.end method

.method public abstract l()J
.end method

.method public abstract p(I[BII)I
.end method

.method public abstract r(ILcom/facebook/imagepipeline/memory/t;II)V
.end method
