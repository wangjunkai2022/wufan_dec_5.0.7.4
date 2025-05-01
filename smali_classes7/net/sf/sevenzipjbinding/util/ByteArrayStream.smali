.class public Lnet/sf/sevenzipjbinding/util/ByteArrayStream;
.super Ljava/lang/Object;
.source "ByteArrayStream.java"

# interfaces
.implements Lnet/sf/sevenzipjbinding/IInStream;
.implements Lnet/sf/sevenzipjbinding/IOutStream;


# static fields
.field private static final INPUT_STREAM_READ_BUFFER_SIZE:I = 0x4000

.field private static final MAX_CHUNK_SIZE:I = 0x100000


# instance fields
.field private final chunkList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field private currentChunkIndex:I

.field private currentPosition:I

.field private currentPositionInChunk:I

.field private final initialSize:I

.field private final maxSize:I

.field private seekToPosition:I

.field private size:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0x400

    .line 5
    invoke-direct {p0, v0, p1}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    .line 8
    iput p1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->initialSize:I

    if-ltz p2, :cond_1

    if-ltz p1, :cond_0

    .line 9
    iput p2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    .line 10
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->init()V

    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Initial size of the byte array stream should be >0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Maximal size of the byte array stream should be >0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([BZ)V
    .locals 2

    .line 3
    array-length v0, p1

    const/16 v1, 0x400

    if-le v1, v0, :cond_0

    array-length v1, p1

    :cond_0
    array-length v0, p1

    invoke-direct {p0, v1, v0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;-><init>(II)V

    .line 4
    invoke-virtual {p0, p1, p2}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->setBytes([BZ)V

    return-void
.end method

.method public constructor <init>([BZI)V
    .locals 1

    const/16 v0, 0x400

    .line 1
    invoke-direct {p0, v0, p3}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;-><init>(II)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->setBytes([BZ)V

    return-void
.end method

.method private allocateNextChunk(I)V
    .locals 7

    .line 1
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    iget v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    .line 2
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    iget v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    if-ne v0, v2, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    .line 4
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    .line 5
    :cond_1
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    iget v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    const-string v3, ")"

    const-string v4, "Maximal size of the byte array stream was reached. (Max size = "

    if-ge v0, v2, :cond_8

    .line 6
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v0, v1, :cond_2

    .line 7
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->initialSize:I

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    shl-int/lit8 v0, v0, 0x1

    :goto_0
    const/high16 v2, 0x100000

    if-ltz v0, :cond_3

    if-le v0, v2, :cond_4

    :cond_3
    const/high16 v0, 0x100000

    .line 8
    :cond_4
    iget v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    add-int v5, v2, v0

    iget v6, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    if-le v5, v6, :cond_5

    sub-int v0, v6, v2

    :cond_5
    if-eq p1, v1, :cond_7

    if-ge v0, p1, :cond_7

    add-int/2addr v2, p1

    if-ge v2, v6, :cond_6

    goto :goto_1

    .line 9
    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    move p1, v0

    .line 10
    :goto_1
    new-array p1, p1, [B

    .line 11
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 12
    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private endWriting()V
    .locals 3

    .line 1
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    if-nez v0, :cond_1

    .line 2
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->init()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    :cond_1
    :goto_0
    return-void
.end method

.method private init()V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    .line 3
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    const/4 v1, -0x1

    .line 4
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    .line 5
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    .line 6
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    return-void
.end method

.method private performDelayedSeek()V
    .locals 6

    .line 1
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    if-ne v2, v0, :cond_1

    .line 3
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    return-void

    .line 4
    :cond_1
    iget v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    const/4 v3, 0x1

    if-le v0, v2, :cond_2

    int-to-long v4, v0

    .line 5
    invoke-direct {p0, v4, v5, v3}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->setSize(JZ)V

    .line 6
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    return-void

    :cond_2
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 7
    :goto_0
    iget-object v4, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_4

    .line 8
    iget-object v4, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    array-length v4, v4

    add-int/2addr v2, v4

    .line 9
    iget v5, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    if-le v2, v5, :cond_3

    .line 10
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    sub-int/2addr v2, v5

    sub-int/2addr v4, v2

    .line 11
    iput v4, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    .line 12
    iput v5, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    .line 13
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    return-void

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 14
    :cond_4
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v3

    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    .line 15
    iget-object v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    .line 16
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    .line 17
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    return-void
.end method

.method private declared-synchronized setSize(JZ)V
    .locals 5

    monitor-enter p0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->truncate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    .line 5
    :cond_0
    :try_start_1
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    int-to-long v0, v0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_c

    .line 6
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    int-to-long v1, v0

    const/4 v3, 0x0

    cmp-long v4, p1, v1

    if-lez v4, :cond_6

    if-nez v0, :cond_1

    .line 7
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    long-to-int v1, p1

    new-array v2, v1, [B

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    iput v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    .line 9
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    .line 10
    :cond_1
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    int-to-long v0, v0

    sub-long v0, p1, v0

    long-to-int v1, v0

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 11
    :goto_0
    iget-object v4, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_2

    .line 12
    iget-object v4, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    array-length v4, v4

    add-int/2addr v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 13
    :cond_2
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    sub-int/2addr v2, v0

    if-ge v2, v1, :cond_3

    add-int/2addr v0, v2

    .line 14
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    sub-int/2addr v1, v2

    .line 15
    invoke-direct {p0, v1}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->allocateNextChunk(I)V

    if-eqz p3, :cond_4

    .line 16
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    goto :goto_1

    :cond_3
    if-eqz p3, :cond_4

    .line 17
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    sub-int/2addr v0, v2

    add-int/2addr v0, v1

    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    :cond_4
    :goto_1
    if-eqz p3, :cond_5

    .line 18
    iget-object p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    iput p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    long-to-int p3, p1

    .line 19
    iput p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    :cond_5
    long-to-int p3, p1

    .line 20
    iput p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    .line 21
    :cond_6
    iget p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    int-to-long v0, p3

    cmp-long p3, p1, v0

    if-gez p3, :cond_b

    const/4 p3, 0x0

    .line 22
    :goto_2
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_b

    .line 23
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    add-int/2addr p3, v0

    int-to-long v0, p3

    cmp-long v2, v0, p1

    if-ltz v2, :cond_a

    .line 24
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_3
    if-le v0, v3, :cond_7

    .line 25
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    .line 26
    :cond_7
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    int-to-long v0, v0

    cmp-long v2, v0, p1

    if-lez v2, :cond_8

    long-to-int v0, p1

    .line 27
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    goto :goto_4

    .line 28
    :cond_8
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    int-to-long v0, v0

    cmp-long v2, v0, p1

    if-lez v2, :cond_9

    long-to-int v0, p1

    .line 29
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    sub-int/2addr v0, p3

    .line 30
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    array-length v1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    .line 31
    iput v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    :cond_9
    :goto_4
    long-to-int v0, p1

    .line 32
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 33
    :cond_b
    monitor-exit p0

    return-void

    .line 34
    :cond_c
    :try_start_2
    new-instance p3, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Maximal size of the byte array stream was reached by setSize("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "). Maximal size is "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5
.end method

.method private startWriting()V
    .locals 4

    .line 1
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    iget-object v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    if-lt v2, v0, :cond_1

    .line 2
    :cond_0
    invoke-direct {p0, v1}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->allocateNextChunk(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public declared-synchronized getBytes()[B
    .locals 7

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    new-array v0, v0, [B

    .line 2
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    .line 3
    array-length v5, v4

    add-int/2addr v5, v3

    iget v6, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    if-le v5, v6, :cond_0

    sub-int/2addr v6, v3

    goto :goto_1

    :cond_0
    array-length v6, v4

    .line 4
    :goto_1
    invoke-static {v4, v2, v0, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v3, v6

    goto :goto_0

    .line 5
    :cond_1
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public declared-synchronized getCurrentPosition()I
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    monitor-exit p0

    return v0

    .line 3
    :cond_0
    :try_start_1
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getDetachedInputStream()Ljava/io/InputStream;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public declared-synchronized getSize()I
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized isEOF()Z
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->getCurrentPosition()I

    move-result v0

    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public read([B)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public declared-synchronized read([BII)I
    .locals 6

    monitor-enter p0

    if-ltz p2, :cond_5

    if-ltz p3, :cond_5

    .line 2
    :try_start_0
    array-length v0, p1

    add-int v1, p2, p3

    if-lt v0, v1, :cond_5

    .line 3
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    .line 4
    monitor-exit p0

    return v2

    .line 5
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->performDelayedSeek()V

    .line 6
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    add-int v1, v0, p3

    iget v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    if-le v1, v3, :cond_1

    sub-int p3, v3, v0

    :cond_1
    move v0, p3

    :cond_2
    :goto_0
    if-lez v0, :cond_4

    .line 7
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    iget v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    array-length v1, v1

    .line 8
    iget v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    sub-int v3, v1, v3

    if-le v0, v3, :cond_3

    goto :goto_1

    :cond_3
    move v3, v0

    .line 9
    :goto_1
    iget-object v4, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    iget v5, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    iget v5, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    invoke-static {v4, v5, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v3

    .line 10
    iget v4, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    add-int/2addr v4, v3

    iput v4, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    sub-int/2addr v0, v3

    if-lt v4, v1, :cond_2

    .line 11
    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    iget-object v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v1, v3, :cond_2

    .line 12
    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    .line 13
    iput v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    .line 14
    iget-object v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    array-length v1, v1

    goto :goto_0

    .line 15
    :cond_4
    iget p1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    add-int/2addr p1, p3

    iput p1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    monitor-exit p0

    return p3

    .line 17
    :cond_5
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid start position ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") and length ("

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public declared-synchronized rewind()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized seek(JI)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    monitor-enter p0

    if-eqz p3, :cond_3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_2

    const/4 v0, 0x2

    if-ne p3, v0, :cond_1

    .line 1
    :try_start_0
    iget p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    :cond_0
    :goto_0
    int-to-long v0, p3

    add-long/2addr p1, v0

    goto :goto_1

    .line 2
    :cond_1
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Seek: unknown origin: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_2
    iget p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 4
    iget p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 5
    :cond_3
    :goto_1
    iget p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    int-to-long v0, p3

    cmp-long p3, p1, v0

    if-gtz p3, :cond_4

    long-to-int p3, p1

    .line 6
    iput p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->seekToPosition:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    return-wide p1

    .line 8
    :cond_4
    :try_start_1
    new-instance p3, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Maximal size of the byte array stream was reached by seek to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", maximal size is "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    monitor-exit p0

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method public declared-synchronized setBytes([BZ)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->init()V

    .line 2
    array-length v0, p1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 3
    new-array p2, v0, [B

    .line 4
    invoke-static {p1, v1, p2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, p2

    .line 5
    :cond_0
    iget-object p2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    .line 7
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    .line 8
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    .line 9
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setSize(J)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-direct {p0, p1, p2, v0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->setSize(JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized truncate()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->init()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public write([B)I
    .locals 2

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->write([BII)I

    move-result p1

    return p1
.end method

.method public declared-synchronized write([BII)I
    .locals 5

    monitor-enter p0

    if-ltz p2, :cond_5

    if-ltz p3, :cond_5

    .line 2
    :try_start_0
    array-length v0, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int v1, p2, p3

    if-lt v0, v1, :cond_5

    const/4 v0, 0x0

    if-nez p3, :cond_0

    .line 3
    monitor-exit p0

    return v0

    .line 4
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->performDelayedSeek()V

    .line 5
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->startWriting()V

    .line 6
    :cond_1
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    iget v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 7
    array-length v2, v1

    iget v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    sub-int/2addr v2, v3

    if-ge v2, p3, :cond_2

    goto :goto_0

    :cond_2
    move v2, p3

    .line 8
    :goto_0
    invoke-static {p1, p2, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    iget v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    add-int/2addr v3, v2

    iput v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    .line 10
    iget v4, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    add-int/2addr v4, v2

    iput v4, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    .line 11
    array-length v1, v1

    if-lt v3, v1, :cond_3

    .line 12
    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    .line 13
    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    .line 14
    iget-object v2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_3

    const/4 v1, -0x1

    .line 15
    invoke-direct {p0, v1}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->allocateNextChunk(I)V

    :cond_3
    if-gtz p3, :cond_1

    .line 16
    iget p2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    iget p3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    if-le p2, p3, :cond_4

    .line 17
    iput p2, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    .line 18
    :cond_4
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->endWriting()V

    .line 19
    array-length p1, p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    .line 20
    :cond_5
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid start position ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") and length ("

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized writeFromInputStream(Ljava/io/InputStream;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->performDelayedSeek()V

    .line 2
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-nez v0, :cond_5

    .line 3
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->init()V

    .line 4
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v0

    .line 5
    iget v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    if-gt v0, v3, :cond_4

    .line 6
    iget v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->initialSize:I

    if-le v0, v3, :cond_1

    .line 7
    new-array v0, v0, [B

    .line 8
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, v2, :cond_0

    .line 9
    monitor-exit p0

    return-void

    .line 10
    :cond_0
    :try_start_1
    iput v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    .line 11
    iput v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    .line 12
    iput v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    .line 13
    iput v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    .line 14
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    :cond_1
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->startWriting()V

    .line 16
    :cond_2
    :goto_0
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentChunkIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 17
    iget v1, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    array-length v3, v0

    sub-int/2addr v3, v1

    invoke-virtual {p1, v0, v1, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-ne v1, v2, :cond_3

    .line 18
    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    iput v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    .line 19
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->endWriting()V

    goto :goto_2

    .line 20
    :cond_3
    iget v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    add-int/2addr v3, v1

    iput v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPosition:I

    .line 21
    iget v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    add-int/2addr v3, v1

    iput v3, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->currentPositionInChunk:I

    .line 22
    array-length v0, v0

    sub-int/2addr v0, v3

    if-nez v0, :cond_2

    .line 23
    invoke-direct {p0, v2}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->allocateNextChunk(I)V

    goto :goto_0

    .line 24
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Maximal size of the byte array stream was reached. (Max size = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->maxSize:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    const/16 v0, 0x4000

    new-array v0, v0, [B

    .line 25
    :goto_1
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-ne v3, v2, :cond_7

    :goto_2
    if-eqz p2, :cond_6

    .line 26
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    :cond_6
    monitor-exit p0

    return-void

    .line 28
    :cond_7
    :try_start_2
    invoke-virtual {p0, v0, v1, v3}, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->write([BII)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method public declared-synchronized writeToOutputStream(Ljava/io/OutputStream;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->chunkList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    .line 2
    array-length v4, v3

    add-int/2addr v4, v2

    iget v5, p0, Lnet/sf/sevenzipjbinding/util/ByteArrayStream;->size:I

    if-le v4, v5, :cond_0

    sub-int/2addr v5, v2

    goto :goto_1

    :cond_0
    array-length v5, v3

    .line 3
    :goto_1
    invoke-virtual {p1, v3, v1, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v2, v5

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 4
    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 5
    :catch_0
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    if-eqz p2, :cond_3

    .line 6
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 7
    :catch_1
    :cond_3
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method
