.class public Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;
.super Ljava/lang/Object;
.source "VolumedArchiveInStream.java"

# interfaces
.implements Lnet/sf/sevenzipjbinding/IInStream;


# static fields
.field private static final SEVEN_ZIP_FIRST_VOLUME_POSTFIX:Ljava/lang/String; = ".7z.001"


# instance fields
.field private absoluteLength:J

.field private absoluteOffset:J

.field private final archiveOpenVolumeCallback:Lnet/sf/sevenzipjbinding/IArchiveOpenVolumeCallback;

.field private currentInStream:Lnet/sf/sevenzipjbinding/IInStream;

.field private currentIndex:I

.field private currentVolumeLength:J

.field private currentVolumeOffset:J

.field private cuttedVolumeFilename:Ljava/lang/String;

.field private volumePositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/sf/sevenzipjbinding/IArchiveOpenVolumeCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteLength:J

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentIndex:I

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    .line 6
    iput-object p2, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->archiveOpenVolumeCallback:Lnet/sf/sevenzipjbinding/IArchiveOpenVolumeCallback;

    const-wide/16 v1, 0x0

    .line 7
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p2, ".7z.001"

    .line 8
    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->cuttedVolumeFilename:Ljava/lang/String;

    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p1}, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->openVolume(IZ)V

    return-void

    .line 11
    :cond_0
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The first 7z volume filename \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' don\'t ends with the postfix: \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'. Can\'t proceed"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Lnet/sf/sevenzipjbinding/IArchiveOpenVolumeCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/sf/sevenzipjbinding/PropID;->NAME:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {p1, v0}, Lnet/sf/sevenzipjbinding/IArchiveOpenVolumeCallback;->getProperty(Lnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;-><init>(Ljava/lang/String;Lnet/sf/sevenzipjbinding/IArchiveOpenVolumeCallback;)V

    return-void
.end method

.method private openVolume(IZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentIndex:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    if-ge v0, p1, :cond_1

    iget-wide v4, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteLength:J

    cmp-long v6, v4, v1

    if-nez v6, :cond_1

    .line 3
    invoke-direct {p0, v0, v3}, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->openVolume(IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4
    :cond_1
    iget-wide v4, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteLength:J

    cmp-long v0, v4, v1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, p1, :cond_2

    return-void

    .line 5
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->cuttedVolumeFilename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v4, "{0,number,000}"

    invoke-static {v4, v2}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    iget-object v2, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->archiveOpenVolumeCallback:Lnet/sf/sevenzipjbinding/IArchiveOpenVolumeCallback;

    invoke-interface {v2, v0}, Lnet/sf/sevenzipjbinding/IArchiveOpenVolumeCallback;->getStream(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/IInStream;

    move-result-object v0

    if-nez v0, :cond_3

    .line 7
    iget-object p1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p2, v1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteLength:J

    return-void

    .line 8
    :cond_3
    iput-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentInStream:Lnet/sf/sevenzipjbinding/IInStream;

    .line 9
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    if-ne v0, p1, :cond_5

    .line 10
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentInStream:Lnet/sf/sevenzipjbinding/IInStream;

    const/4 v4, 0x2

    invoke-interface {v0, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ISeekableStream;->seek(JI)J

    move-result-wide v4

    iput-wide v4, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentVolumeLength:J

    cmp-long v0, v4, v1

    if-eqz v0, :cond_4

    .line 11
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    add-int/lit8 v4, p1, -0x1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-wide v6, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentVolumeLength:J

    add-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p2, :cond_6

    .line 12
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentInStream:Lnet/sf/sevenzipjbinding/IInStream;

    invoke-interface {v0, v1, v2, v3}, Lnet/sf/sevenzipjbinding/ISeekableStream;->seek(JI)J

    goto :goto_1

    .line 13
    :cond_4
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Volume "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is empty"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 14
    :cond_5
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    add-int/lit8 v5, p1, -0x1

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long/2addr v3, v5

    iput-wide v3, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentVolumeLength:J

    :cond_6
    :goto_1
    if-eqz p2, :cond_7

    .line 15
    iput-wide v1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentVolumeOffset:J

    .line 16
    iget-object p2, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    add-int/lit8 v0, p1, -0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    .line 17
    :cond_7
    iput p1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentIndex:I

    return-void
.end method

.method private openVolumeToAbsoluteOffset()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 2
    iget-wide v1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteLength:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    cmp-long v7, v5, v1

    if-ltz v7, :cond_0

    return-void

    .line 3
    :cond_0
    :goto_0
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-wide v5, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    cmp-long v7, v1, v5

    if-lez v7, :cond_1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    add-int/lit8 v0, v0, 0x1

    .line 5
    invoke-direct {p0, v0, v2}, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->openVolume(IZ)V

    return-void

    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 6
    invoke-direct {p0, v0, v2}, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->openVolume(IZ)V

    .line 7
    iget-wide v5, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteLength:J

    cmp-long v1, v5, v3

    if-eqz v1, :cond_3

    iget-wide v7, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    cmp-long v1, v7, v5

    if-gez v1, :cond_4

    :cond_3
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    .line 8
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-wide v7, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    cmp-long v1, v5, v7

    if-lez v1, :cond_2

    :cond_4
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "close() method not supported. The user should implement its own caching and closing stratagies within the IArchiveOpenVolumeCallback.getStream() implementation."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public declared-synchronized read([B)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-wide v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteLength:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v2, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    const/4 p1, 0x0

    .line 2
    monitor-exit p0

    return p1

    .line 3
    :cond_0
    :try_start_1
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentInStream:Lnet/sf/sevenzipjbinding/IInStream;

    invoke-interface {v0, p1}, Lnet/sf/sevenzipjbinding/ISequentialInStream;->read([B)I

    move-result p1

    .line 4
    iget-wide v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    .line 5
    iget-wide v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentVolumeOffset:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentVolumeOffset:J

    .line 6
    iget-wide v2, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentVolumeLength:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 7
    iget v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentIndex:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-direct {p0, v0, v1}, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->openVolume(IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    :cond_1
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized seek(JI)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    monitor-enter p0

    const-wide/16 v0, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_3

    if-eq p3, v2, :cond_2

    const/4 v4, 0x2

    if-ne p3, v4, :cond_1

    .line 1
    :try_start_0
    iget-wide v4, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteLength:J

    cmp-long p3, v4, v0

    if-nez p3, :cond_0

    const p3, 0x7fffffff

    .line 2
    invoke-direct {p0, p3, v3}, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->openVolume(IZ)V

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 3
    :goto_0
    iget-wide v4, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteLength:J

    add-long/2addr p1, v4

    goto :goto_2

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Seek: unknown origin: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_2
    iget-wide v4, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    add-long/2addr p1, v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    :goto_1
    const/4 p3, 0x0

    .line 6
    :goto_2
    iget-wide v4, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v6, p1, v4

    if-nez v6, :cond_4

    if-nez p3, :cond_4

    .line 7
    monitor-exit p0

    return-wide p1

    .line 8
    :cond_4
    :try_start_1
    iput-wide p1, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    .line 9
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->openVolumeToAbsoluteOffset()V

    .line 10
    iget-wide v4, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteLength:J

    cmp-long p3, v4, v0

    if-eqz p3, :cond_5

    iget-wide v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    cmp-long p3, v4, v0

    if-gtz p3, :cond_5

    .line 11
    iput-wide v4, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    monitor-exit p0

    return-wide v4

    .line 13
    :cond_5
    :try_start_2
    iget-wide v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->absoluteOffset:J

    iget-object p3, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->volumePositions:Ljava/util/List;

    iget v4, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentIndex:I

    sub-int/2addr v4, v2

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v0, v4

    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentVolumeOffset:J

    .line 14
    iget-object p3, p0, Lnet/sf/sevenzipjbinding/impl/VolumedArchiveInStream;->currentInStream:Lnet/sf/sevenzipjbinding/IInStream;

    invoke-interface {p3, v0, v1, v3}, Lnet/sf/sevenzipjbinding/ISeekableStream;->seek(JI)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15
    monitor-exit p0

    return-wide p1

    :goto_3
    monitor-exit p0

    throw p1
.end method
