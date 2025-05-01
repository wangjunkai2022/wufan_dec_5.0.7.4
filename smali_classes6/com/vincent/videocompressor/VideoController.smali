.class public Lcom/vincent/videocompressor/VideoController;
.super Ljava/lang/Object;
.source "VideoController.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vincent/videocompressor/VideoController$c;,
        Lcom/vincent/videocompressor/VideoController$b;
    }
.end annotation


# static fields
.field static final c:I = 0x1

.field static final d:I = 0x2

.field static final e:I = 0x3

.field public static f:Ljava/io/File; = null

.field public static final g:Ljava/lang/String; = "video/avc"

.field private static final h:I = 0x0

.field private static final i:I = 0x1

.field private static final j:I = 0x2

.field private static final k:I = 0x3

.field private static final l:I = 0x4

.field private static final m:I = 0x5

.field private static volatile n:Lcom/vincent/videocompressor/VideoController;


# instance fields
.field public a:Ljava/lang/String;

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/vincent/videocompressor/VideoController;->b:Z

    return-void
.end method

.method public static b(Ljava/io/File;Ljava/io/File;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p0

    .line 2
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p1

    const-wide/16 v2, 0x1

    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v4

    move-object v1, p0

    move-object v6, p1

    invoke-virtual/range {v1 .. v6}, Ljava/nio/channels/FileChannel;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->close()V

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    if-eqz p0, :cond_1

    .line 6
    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->close()V

    :cond_1
    if-eqz p1, :cond_2

    .line 7
    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->close()V

    .line 8
    :cond_2
    throw v0
.end method

.method private c(ZZ)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcom/vincent/videocompressor/VideoController;->b:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/vincent/videocompressor/VideoController;->b:Z

    :cond_0
    return-void
.end method

.method public static native convertVideoFrame(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIII)I
.end method

.method public static d()Lcom/vincent/videocompressor/VideoController;
    .locals 2

    .line 1
    sget-object v0, Lcom/vincent/videocompressor/VideoController;->n:Lcom/vincent/videocompressor/VideoController;

    if-nez v0, :cond_1

    .line 2
    const-class v1, Lcom/vincent/videocompressor/VideoController;

    monitor-enter v1

    .line 3
    :try_start_0
    sget-object v0, Lcom/vincent/videocompressor/VideoController;->n:Lcom/vincent/videocompressor/VideoController;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/vincent/videocompressor/VideoController;

    invoke-direct {v0}, Lcom/vincent/videocompressor/VideoController;-><init>()V

    sput-object v0, Lcom/vincent/videocompressor/VideoController;->n:Lcom/vincent/videocompressor/VideoController;

    .line 5
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static e(I)Z
    .locals 1

    const/16 v0, 0x27

    if-eq p0, v0, :cond_0

    const v0, 0x7f000100

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return p0

    :cond_0
    :pswitch_0
    const/4 p0, 0x1

    return p0

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private f(Landroid/media/MediaExtractor;Lcom/vincent/videocompressor/b;Landroid/media/MediaCodec$BufferInfo;JJLjava/io/File;Z)J
    .locals 20
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p0

    move/from16 v6, p9

    .line 1
    invoke-direct {v5, v0, v6}, Lcom/vincent/videocompressor/VideoController;->j(Landroid/media/MediaExtractor;Z)I

    move-result v7

    if-ltz v7, :cond_9

    .line 2
    invoke-virtual {v0, v7}, Landroid/media/MediaExtractor;->selectTrack(I)V

    .line 3
    invoke-virtual {v0, v7}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v10

    .line 4
    invoke-virtual {v1, v10, v6}, Lcom/vincent/videocompressor/b;->a(Landroid/media/MediaFormat;Z)I

    move-result v11

    const-string v12, "max-input-size"

    .line 5
    invoke-virtual {v10, v12}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v10

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    cmp-long v15, v3, v12

    if-lez v15, :cond_0

    .line 6
    invoke-virtual {v0, v3, v4, v14}, Landroid/media/MediaExtractor;->seekTo(JI)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0, v12, v13, v14}, Landroid/media/MediaExtractor;->seekTo(JI)V

    .line 8
    :goto_0
    invoke-static {v10}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v10

    const/4 v15, 0x0

    const-wide/16 v16, -0x1

    :goto_1
    if-nez v15, :cond_8

    .line 9
    invoke-virtual/range {p1 .. p1}, Landroid/media/MediaExtractor;->getSampleTrackIndex()I

    move-result v8

    if-ne v8, v7, :cond_5

    .line 10
    invoke-virtual {v0, v10, v14}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v8

    iput v8, v2, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-gez v8, :cond_1

    .line 11
    iput v14, v2, Landroid/media/MediaCodec$BufferInfo;->size:I

    move-object v9, v10

    goto :goto_3

    :cond_1
    move-object/from16 p8, v10

    .line 12
    invoke-virtual/range {p1 .. p1}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v9

    iput-wide v9, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v8, v3, v12

    if-lez v8, :cond_2

    const-wide/16 v18, -0x1

    cmp-long v8, v16, v18

    if-nez v8, :cond_2

    move-wide/from16 v16, v9

    :cond_2
    cmp-long v8, p6, v12

    if-ltz v8, :cond_4

    cmp-long v8, v9, p6

    if-gez v8, :cond_3

    goto :goto_2

    :cond_3
    move-object/from16 v9, p8

    goto :goto_3

    .line 13
    :cond_4
    :goto_2
    iput v14, v2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 14
    invoke-virtual/range {p1 .. p1}, Landroid/media/MediaExtractor;->getSampleFlags()I

    move-result v8

    iput v8, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    move-object/from16 v9, p8

    .line 15
    invoke-virtual {v1, v11, v9, v2, v6}, Lcom/vincent/videocompressor/b;->q(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Z)Z

    .line 16
    invoke-virtual/range {p1 .. p1}, Landroid/media/MediaExtractor;->advance()Z

    goto :goto_4

    :cond_5
    move-object v9, v10

    const/4 v10, -0x1

    if-ne v8, v10, :cond_6

    :goto_3
    const/4 v8, 0x1

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v8, 0x0

    :goto_5
    if-eqz v8, :cond_7

    const/4 v15, 0x1

    :cond_7
    move-object v10, v9

    goto :goto_1

    .line 17
    :cond_8
    invoke-virtual {v0, v7}, Landroid/media/MediaExtractor;->unselectTrack(I)V

    return-wide v16

    :cond_9
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public static h(Ljava/lang/String;)Landroid/media/MediaCodecInfo;
    .locals 9

    .line 1
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_5

    .line 2
    invoke-static {v3}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v4

    .line 3
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_2

    .line 4
    :cond_0
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v5

    .line 5
    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_4

    aget-object v8, v5, v7

    .line 6
    invoke-virtual {v8, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 7
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v8, "OMX.SEC.avc.enc"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    return-object v4

    .line 8
    :cond_1
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v8, "OMX.SEC.AVC.Encoder"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v4

    :cond_2
    move-object v2, v4

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-object v2
.end method

.method public static i(Landroid/media/MediaCodecInfo;Ljava/lang/String;)I
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget-object v2, p1, Landroid/media/MediaCodecInfo$CodecCapabilities;->colorFormats:[I

    array-length v3, v2

    if-ge v0, v3, :cond_3

    .line 3
    aget v2, v2, v0

    .line 4
    invoke-static {v2}, Lcom/vincent/videocompressor/VideoController;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 5
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "OMX.SEC.AVC.Encoder"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x13

    if-eq v2, v1, :cond_0

    goto :goto_1

    :cond_0
    move v1, v2

    goto :goto_2

    :cond_1
    :goto_1
    return v2

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method private j(Landroid/media/MediaExtractor;Z)I
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 2
    invoke-virtual {p1, v1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v2

    const-string v3, "mime"

    .line 3
    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz p2, :cond_0

    const-string v3, "audio/"

    .line 4
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_0
    const-string v3, "video/"

    .line 5
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x5

    return p1
.end method

.method private k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/vincent/videocompressor/VideoController$c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;ILcom/vincent/videocompressor/VideoController$b;)Z
    .locals 49
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    move-object/from16 v11, p0

    move/from16 v0, p3

    move-object/from16 v1, p4

    const-string v12, "time = "

    move-object/from16 v2, p1

    .line 1
    iput-object v2, v11, Lcom/vincent/videocompressor/VideoController;->a:Ljava/lang/String;

    .line 2
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 3
    iget-object v3, v11, Lcom/vincent/videocompressor/VideoController;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    const/16 v3, 0x12

    .line 4
    invoke-virtual {v2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x13

    .line 5
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x18

    .line 6
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x9

    .line 7
    invoke-virtual {v2, v7}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    const-wide/16 v9, 0x3e8

    mul-long v7, v7, v9

    .line 8
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 10
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0xa

    const/4 v13, 0x3

    const/4 v14, 0x2

    if-eq v0, v14, :cond_1

    if-eq v0, v13, :cond_0

    mul-int/lit8 v0, v4, 0x2

    .line 11
    div-int/2addr v0, v13

    mul-int/lit8 v15, v5, 0x2

    .line 12
    div-int/2addr v15, v13

    mul-int v16, v0, v15

    mul-int/lit8 v16, v16, 0x1e

    :goto_0
    move/from16 v9, v16

    goto :goto_2

    .line 13
    :cond_0
    div-int/lit8 v0, v4, 0x2

    .line 14
    div-int/lit8 v15, v5, 0x2

    .line 15
    div-int/lit8 v16, v0, 0x2

    div-int/lit8 v17, v15, 0x2

    mul-int v16, v16, v17

    goto :goto_1

    .line 16
    :cond_1
    div-int/lit8 v0, v4, 0x2

    .line 17
    div-int/lit8 v15, v5, 0x2

    mul-int v16, v0, v15

    :goto_1
    mul-int/lit8 v16, v16, 0xa

    goto :goto_0

    .line 18
    :goto_2
    new-instance v10, Ljava/io/File;

    move-object/from16 v6, p2

    invoke-direct {v10, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 19
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v13, 0xb4

    const/16 v14, 0x5a

    move-wide/from16 v20, v7

    const/4 v7, 0x0

    if-ge v6, v3, :cond_2

    if-le v15, v0, :cond_2

    if-eq v0, v4, :cond_2

    if-eq v15, v5, :cond_2

    move v2, v0

    const/16 v13, 0x10e

    goto :goto_5

    :cond_2
    const/16 v8, 0x14

    if-le v6, v8, :cond_5

    if-ne v2, v14, :cond_3

    move v2, v0

    const/16 v13, 0x10e

    :goto_3
    const/4 v14, 0x0

    goto :goto_5

    :cond_3
    if-ne v2, v13, :cond_4

    move v2, v15

    const/4 v14, 0x0

    goto :goto_4

    :cond_4
    const/16 v8, 0x10e

    if-ne v2, v8, :cond_5

    move v2, v0

    const/16 v13, 0x5a

    goto :goto_3

    :cond_5
    move v14, v2

    move v2, v15

    const/4 v13, 0x0

    :goto_4
    move v15, v0

    .line 20
    :goto_5
    new-instance v8, Ljava/io/File;

    iget-object v0, v11, Lcom/vincent/videocompressor/VideoController;->a:Ljava/lang/String;

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v8}, Ljava/io/File;->canRead()Z

    move-result v0

    move/from16 p2, v6

    const/4 v6, 0x1

    if-nez v0, :cond_6

    .line 22
    invoke-direct {v11, v6, v6}, Lcom/vincent/videocompressor/VideoController;->c(ZZ)V

    return v7

    .line 23
    :cond_6
    iput-boolean v6, v11, Lcom/vincent/videocompressor/VideoController;->b:Z

    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v29

    if-eqz v15, :cond_50

    if-eqz v2, :cond_50

    .line 25
    :try_start_0
    new-instance v7, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v7}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 26
    new-instance v0, Lcom/vincent/videocompressor/c;

    invoke-direct {v0}, Lcom/vincent/videocompressor/c;-><init>()V

    .line 27
    invoke-virtual {v0, v10}, Lcom/vincent/videocompressor/c;->h(Ljava/io/File;)V

    .line 28
    invoke-virtual {v0, v14}, Lcom/vincent/videocompressor/c;->i(I)V

    .line 29
    invoke-virtual {v0, v15, v2}, Lcom/vincent/videocompressor/c;->j(II)V

    .line 30
    new-instance v14, Lcom/vincent/videocompressor/b;

    invoke-direct {v14}, Lcom/vincent/videocompressor/b;-><init>()V

    invoke-virtual {v14, v0}, Lcom/vincent/videocompressor/b;->c(Lcom/vincent/videocompressor/c;)Lcom/vincent/videocompressor/b;

    move-result-object v14
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_22
    .catchall {:try_start_0 .. :try_end_0} :catchall_e

    .line 31
    :try_start_1
    new-instance v6, Landroid/media/MediaExtractor;

    invoke-direct {v6}, Landroid/media/MediaExtractor;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_21
    .catchall {:try_start_1 .. :try_end_1} :catchall_d

    .line 32
    :try_start_2
    invoke-virtual {v8}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_20
    .catchall {:try_start_2 .. :try_end_2} :catchall_c

    const-wide/16 v32, -0x1

    if-ne v15, v4, :cond_9

    if-eq v2, v5, :cond_7

    goto :goto_7

    :cond_7
    const/4 v0, 0x0

    const-wide/16 v15, -0x1

    const-wide/16 v17, -0x1

    move-object/from16 v1, p0

    move-object v2, v6

    move-object v3, v14

    move-object v4, v7

    move-object v9, v6

    const/4 v13, 0x1

    move-wide v5, v15

    move-object/from16 v35, v7

    move-object/from16 v34, v8

    const/4 v15, 0x0

    move-wide/from16 v7, v17

    move-object/from16 v36, v9

    move-object v9, v10

    move-object/from16 v37, v10

    move v10, v0

    .line 33
    :try_start_3
    invoke-direct/range {v1 .. v10}, Lcom/vincent/videocompressor/VideoController;->f(Landroid/media/MediaExtractor;Lcom/vincent/videocompressor/b;Landroid/media/MediaCodec$BufferInfo;JJLjava/io/File;Z)J

    move-result-wide v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    cmp-long v2, v0, v32

    if-eqz v2, :cond_8

    move-wide/from16 v32, v0

    :cond_8
    move-object/from16 v38, v12

    move-object/from16 v6, v35

    move-object/from16 v8, v36

    const/4 v7, 0x1

    goto/16 :goto_45

    :catchall_0
    move-exception v0

    move-object v3, v0

    move-object v2, v11

    move-object v1, v12

    move-object/from16 v6, v36

    :goto_6
    const/4 v11, 0x0

    goto/16 :goto_4e

    :catch_0
    move-exception v0

    move-object v1, v12

    move-object/from16 v6, v36

    goto/16 :goto_49

    :cond_9
    :goto_7
    move-object/from16 v35, v7

    move-object/from16 v34, v8

    move-object/from16 v37, v10

    const/4 v7, 0x0

    const/4 v10, 0x1

    move-object v8, v6

    .line 34
    :try_start_4
    invoke-direct {v11, v8, v7}, Lcom/vincent/videocompressor/VideoController;->j(Landroid/media/MediaExtractor;Z)I

    move-result v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1f
    .catchall {:try_start_4 .. :try_end_4} :catchall_b

    if-ltz v4, :cond_48

    .line 35
    :try_start_5
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1a
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    const-string v7, "video/avc"

    move/from16 v10, p2

    if-ge v10, v3, :cond_12

    .line 36
    :try_start_6
    invoke-static {v7}, Lcom/vincent/videocompressor/VideoController;->h(Ljava/lang/String;)Landroid/media/MediaCodecInfo;

    move-result-object v3

    .line 37
    invoke-static {v3, v7}, Lcom/vincent/videocompressor/VideoController;->i(Landroid/media/MediaCodecInfo;Ljava/lang/String;)I

    move-result v22

    if-eqz v22, :cond_11

    .line 38
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v5, "OMX.qcom."

    .line 39
    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_c

    const/16 v5, 0x10

    if-ne v10, v5, :cond_b

    const-string v5, "lge"

    .line 40
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    const-string v5, "nokia"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    :cond_a
    const/4 v5, 0x1

    goto :goto_8

    :cond_b
    const/4 v5, 0x0

    :goto_8
    const/4 v6, 0x1

    goto :goto_9

    :cond_c
    const-string v5, "OMX.Intel."

    .line 41
    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_d

    const/4 v5, 0x0

    const/4 v6, 0x2

    goto :goto_9

    :cond_d
    const-string v5, "OMX.MTK.VIDEO.ENCODER.AVC"

    .line 42
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    const/4 v5, 0x0

    const/4 v6, 0x3

    goto :goto_9

    :cond_e
    const-string v5, "OMX.SEC.AVC.Encoder"

    .line 43
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    const/4 v5, 0x1

    const/4 v6, 0x4

    goto :goto_9

    :cond_f
    const-string v5, "OMX.TI.DUCATI1.VIDEO.H264E"

    .line 44
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/4 v5, 0x0

    const/4 v6, 0x5

    goto :goto_9

    :cond_10
    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_9
    move/from16 v24, v5

    .line 45
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v25, v6

    const-string v6, "codec = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " manufacturer = "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "device = "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v6, v22

    move/from16 v5, v24

    move/from16 v3, v25

    goto :goto_e

    .line 46
    :cond_11
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "no supported color format"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    move-object v3, v0

    move-object v6, v8

    move-object v2, v11

    move-object v1, v12

    goto/16 :goto_6

    :catch_1
    move-exception v0

    move/from16 v40, v4

    move-object/from16 v38, v12

    :goto_a
    move-object/from16 v6, v35

    const/4 v3, 0x0

    :goto_b
    const/4 v7, 0x1

    const/4 v9, 0x0

    const/16 v31, 0x0

    :goto_c
    const/16 v44, 0x0

    :goto_d
    move-object/from16 v35, v8

    goto/16 :goto_3f

    :cond_12
    const v22, 0x7f000789

    const/4 v3, 0x0

    const/4 v5, 0x0

    const v6, 0x7f000789

    :goto_e
    move-object/from16 v38, v12

    .line 47
    :try_start_7
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v39, v5

    const-string v5, "colorFormat = "

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    mul-int v5, v15, v2

    mul-int/lit8 v12, v5, 0x3

    const/16 v19, 0x2

    .line 48
    div-int/lit8 v12, v12, 0x2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_19
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    if-nez v3, :cond_13

    .line 49
    :try_start_8
    rem-int/lit8 v0, v2, 0x10

    if-eqz v0, :cond_16

    .line 50
    rem-int/lit8 v0, v2, 0x10

    const/16 v3, 0x10

    rsub-int/lit8 v5, v0, 0x10

    add-int/2addr v5, v2

    sub-int/2addr v5, v2

    mul-int v0, v15, v5

    mul-int/lit8 v3, v0, 0x5

    const/4 v5, 0x4

    .line 51
    div-int/2addr v3, v5

    add-int/2addr v12, v3

    :goto_f
    move v1, v0

    goto :goto_11

    :catchall_2
    move-exception v0

    move-object v3, v0

    move-object v6, v8

    move-object v2, v11

    goto/16 :goto_42

    :catch_2
    move-exception v0

    move/from16 v40, v4

    goto :goto_a

    :cond_13
    const/4 v1, 0x1

    if-ne v3, v1, :cond_14

    .line 52
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "lge"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    add-int/lit16 v0, v5, 0x7ff

    and-int/lit16 v0, v0, -0x800

    sub-int/2addr v0, v5

    add-int/2addr v12, v0

    goto :goto_f

    :cond_14
    const/4 v1, 0x5

    if-ne v3, v1, :cond_15

    goto :goto_10

    :cond_15
    const/4 v1, 0x3

    if-ne v3, v1, :cond_16

    const-string v1, "baidu"

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 54
    rem-int/lit8 v0, v2, 0x10

    const/16 v1, 0x10

    rsub-int/lit8 v5, v0, 0x10

    add-int/2addr v5, v2

    sub-int/2addr v5, v2

    mul-int v0, v15, v5

    mul-int/lit8 v1, v0, 0x5

    const/4 v3, 0x4

    .line 55
    div-int/2addr v1, v3
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    add-int/2addr v12, v1

    goto :goto_f

    :cond_16
    :goto_10
    const/4 v1, 0x0

    .line 56
    :goto_11
    :try_start_9
    invoke-virtual {v8, v4}, Landroid/media/MediaExtractor;->selectTrack(I)V

    move/from16 p3, v1

    const-wide/16 v0, 0x0

    const/4 v3, 0x0

    .line 57
    invoke-virtual {v8, v0, v1, v3}, Landroid/media/MediaExtractor;->seekTo(JI)V

    .line 58
    invoke-virtual {v8, v4}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v0

    .line 59
    rem-int/lit8 v1, v15, 0x2

    if-nez v1, :cond_17

    move v1, v15

    goto :goto_12

    :cond_17
    add-int/lit8 v1, v15, -0x1

    :goto_12
    rem-int/lit8 v3, v2, 0x2

    if-nez v3, :cond_18

    move v3, v2

    goto :goto_13

    :cond_18
    add-int/lit8 v3, v2, -0x1

    :goto_13
    invoke-static {v7, v1, v3}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v1

    const-string v3, "color-format"

    .line 60
    invoke-virtual {v1, v3, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v3, "bitrate"

    .line 61
    invoke-virtual {v1, v3, v9}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v3, "frame-rate"

    const/16 v5, 0x19

    .line 62
    invoke-virtual {v1, v3, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v3, "i-frame-interval"

    const/16 v5, 0xa

    .line 63
    invoke-virtual {v1, v3, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_19
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    const/16 v3, 0x12

    if-ge v10, v3, :cond_19

    :try_start_a
    const-string v3, "stride"

    add-int/lit8 v5, v15, 0x20

    .line 64
    invoke-virtual {v1, v3, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v3, "slice-height"

    .line 65
    invoke-virtual {v1, v3, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 66
    :cond_19
    :try_start_b
    invoke-static {v7}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v3
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_19
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    const/4 v5, 0x0

    const/4 v9, 0x1

    .line 67
    :try_start_c
    invoke-virtual {v3, v1, v5, v5, v9}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_18
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    const/16 v1, 0x12

    if-lt v10, v1, :cond_1a

    .line 68
    :try_start_d
    new-instance v5, Lcom/vincent/videocompressor/a;

    invoke-virtual {v3}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v1

    invoke-direct {v5, v1}, Lcom/vincent/videocompressor/a;-><init>(Landroid/view/Surface;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 69
    :try_start_e
    invoke-virtual {v5}, Lcom/vincent/videocompressor/a;->d()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    goto :goto_14

    :catch_3
    move-exception v0

    move/from16 v40, v4

    move-object/from16 v31, v5

    move-object/from16 v6, v35

    const/4 v7, 0x1

    const/4 v9, 0x0

    goto/16 :goto_c

    :catch_4
    move-exception v0

    move/from16 v40, v4

    move-object/from16 v6, v35

    goto/16 :goto_b

    :cond_1a
    const/4 v5, 0x0

    .line 70
    :goto_14
    :try_start_f
    invoke-virtual {v3}, Landroid/media/MediaCodec;->start()V

    const-string v1, "mime"

    .line 71
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v1
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_17
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    const/16 v9, 0x12

    if-lt v10, v9, :cond_1b

    .line 72
    :try_start_10
    new-instance v9, Lcom/vincent/videocompressor/d;

    invoke-direct {v9}, Lcom/vincent/videocompressor/d;-><init>()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_5
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    goto :goto_15

    :catch_5
    move-exception v0

    move-object/from16 v44, v1

    move/from16 v40, v4

    move-object/from16 v31, v5

    move-object/from16 v6, v35

    const/4 v7, 0x1

    const/4 v9, 0x0

    goto/16 :goto_d

    .line 73
    :cond_1b
    :try_start_11
    new-instance v9, Lcom/vincent/videocompressor/d;

    invoke-direct {v9, v15, v2, v13}, Lcom/vincent/videocompressor/d;-><init>(III)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_16
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 74
    :goto_15
    :try_start_12
    invoke-virtual {v9}, Lcom/vincent/videocompressor/d;->g()Landroid/view/Surface;

    move-result-object v13

    move/from16 v31, v6

    move/from16 p1, v12

    const/4 v6, 0x0

    const/4 v12, 0x0

    invoke-virtual {v1, v0, v13, v12, v6}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 75
    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_15
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    const/16 v13, 0x15

    if-ge v10, v13, :cond_1d

    .line 76
    :try_start_13
    invoke-virtual {v1}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 77
    invoke-virtual {v3}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v22

    const/16 v12, 0x12

    if-ge v10, v12, :cond_1c

    .line 78
    invoke-virtual {v3}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v10

    move-object v12, v10

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, -0x5

    move-object v10, v0

    move-object/from16 v0, v22

    goto :goto_17

    :cond_1c
    move-object v10, v0

    move-object/from16 v0, v22

    goto :goto_16

    :cond_1d
    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_16
    const/4 v12, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, -0x5

    :goto_17
    if-nez v40, :cond_44

    move-object/from16 v43, v7

    const-wide/16 v6, 0x9c4

    if-nez v41, :cond_23

    .line 79
    invoke-virtual {v8}, Landroid/media/MediaExtractor;->getSampleTrackIndex()I

    move-result v13

    if-ne v13, v4, :cond_21

    .line 80
    invoke-virtual {v1, v6, v7}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v13

    if-ltz v13, :cond_20

    .line 81
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x15

    if-ge v6, v7, :cond_1e

    .line 82
    aget-object v6, v10, v13

    goto :goto_18

    .line 83
    :cond_1e
    invoke-virtual {v1, v13}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    :goto_18
    const/4 v7, 0x0

    .line 84
    invoke-virtual {v8, v6, v7}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v25

    if-gez v25, :cond_1f

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x4

    move-object/from16 v22, v1

    move/from16 v23, v13

    .line 85
    invoke-virtual/range {v22 .. v28}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    const/4 v6, 0x1

    goto :goto_19

    :cond_1f
    const/16 v24, 0x0

    .line 86
    invoke-virtual {v8}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v26

    const/16 v28, 0x0

    move-object/from16 v22, v1

    move/from16 v23, v13

    invoke-virtual/range {v22 .. v28}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 87
    invoke-virtual {v8}, Landroid/media/MediaExtractor;->advance()Z

    :cond_20
    move/from16 v6, v41

    :goto_19
    move/from16 v41, v6

    goto :goto_1a

    :cond_21
    const/4 v6, -0x1

    if-ne v13, v6, :cond_22

    const/4 v7, 0x1

    goto :goto_1b

    :cond_22
    :goto_1a
    const/4 v7, 0x0

    :goto_1b
    if-eqz v7, :cond_23

    const-wide/16 v6, 0x9c4

    .line 88
    invoke-virtual {v1, v6, v7}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v23

    if-ltz v23, :cond_23

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x4

    move-object/from16 v22, v1

    .line 89
    invoke-virtual/range {v22 .. v28}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_15
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    const/16 v41, 0x1

    :cond_23
    move/from16 v13, v42

    const/4 v6, 0x1

    const/4 v7, 0x1

    :goto_1c
    if-nez v7, :cond_25

    if-eqz v6, :cond_24

    goto :goto_1d

    :cond_24
    move/from16 v42, v13

    move-object/from16 v7, v43

    const/16 v13, 0x15

    goto :goto_17

    :cond_25
    :goto_1d
    move/from16 v22, v6

    move/from16 v42, v7

    move-object/from16 v45, v10

    move-object/from16 v6, v35

    move-object/from16 v35, v8

    const-wide/16 v7, 0x9c4

    .line 90
    :try_start_14
    invoke-virtual {v3, v6, v7, v8}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v10
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    const/4 v7, -0x1

    if-ne v10, v7, :cond_26

    move/from16 v11, v40

    move-object/from16 v7, v43

    const/4 v8, 0x0

    :goto_1e
    const/16 v19, 0x2

    move-object/from16 v43, v0

    move/from16 v40, v4

    :goto_1f
    const/4 v4, -0x1

    goto/16 :goto_27

    :cond_26
    const/4 v7, -0x3

    if-ne v10, v7, :cond_28

    .line 91
    :try_start_15
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x15

    if-ge v7, v8, :cond_27

    .line 92
    invoke-virtual {v3}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    :cond_27
    :goto_20
    move/from16 v8, v22

    move/from16 v11, v40

    move-object/from16 v7, v43

    goto :goto_1e

    :catchall_3
    move-exception v0

    move-object v3, v0

    move-object v2, v11

    goto/16 :goto_3b

    :cond_28
    const/4 v7, -0x2

    if-ne v10, v7, :cond_29

    .line 93
    invoke-virtual {v3}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v7

    const/4 v8, -0x5

    if-ne v13, v8, :cond_27

    const/4 v8, 0x0

    .line 94
    invoke-virtual {v14, v7, v8}, Lcom/vincent/videocompressor/b;->a(Landroid/media/MediaFormat;Z)I

    move-result v13
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_14
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    goto :goto_20

    :cond_29
    if-ltz v10, :cond_43

    .line 95
    :try_start_16
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_14
    .catchall {:try_start_16 .. :try_end_16} :catchall_5

    const/16 v8, 0x15

    if-ge v7, v8, :cond_2a

    .line 96
    :try_start_17
    aget-object v7, v0, v10
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_14
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    goto :goto_21

    .line 97
    :cond_2a
    :try_start_18
    invoke-virtual {v3, v10}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v7
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_14
    .catchall {:try_start_18 .. :try_end_18} :catchall_5

    :goto_21
    if-eqz v7, :cond_42

    .line 98
    :try_start_19
    iget v8, v6, Landroid/media/MediaCodec$BufferInfo;->size:I
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_12
    .catchall {:try_start_19 .. :try_end_19} :catchall_5

    move/from16 v40, v4

    const/4 v4, 0x1

    if-le v8, v4, :cond_30

    .line 99
    :try_start_1a
    iget v4, v6, Landroid/media/MediaCodec$BufferInfo;->flags:I
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_7
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5

    const/16 v19, 0x2

    and-int/lit8 v4, v4, 0x2

    if-nez v4, :cond_2b

    const/4 v4, 0x0

    .line 100
    :try_start_1b
    invoke-virtual {v14, v13, v7, v6, v4}, Lcom/vincent/videocompressor/b;->q(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Z)Z

    move-result v7

    if-eqz v7, :cond_2f

    .line 101
    invoke-direct {v11, v4, v4}, Lcom/vincent/videocompressor/VideoController;->c(ZZ)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_7
    .catchall {:try_start_1b .. :try_end_1b} :catchall_3

    goto/16 :goto_24

    :cond_2b
    const/4 v4, -0x5

    if-ne v13, v4, :cond_2f

    .line 102
    :try_start_1c
    new-array v13, v8, [B

    .line 103
    iget v4, v6, Landroid/media/MediaCodec$BufferInfo;->offset:I

    add-int/2addr v4, v8

    invoke-virtual {v7, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 104
    iget v4, v6, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v7, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 105
    invoke-virtual {v7, v13}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 106
    iget v4, v6, Landroid/media/MediaCodec$BufferInfo;->size:I
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_7
    .catchall {:try_start_1c .. :try_end_1c} :catchall_5

    const/4 v7, 0x1

    sub-int/2addr v4, v7

    :goto_22
    if-ltz v4, :cond_2d

    const/4 v8, 0x3

    if-le v4, v8, :cond_2d

    .line 107
    :try_start_1d
    aget-byte v8, v13, v4
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_6
    .catchall {:try_start_1d .. :try_end_1d} :catchall_5

    if-ne v8, v7, :cond_2c

    add-int/lit8 v7, v4, -0x1

    :try_start_1e
    aget-byte v7, v13, v7

    if-nez v7, :cond_2c

    add-int/lit8 v7, v4, -0x2

    aget-byte v7, v13, v7

    if-nez v7, :cond_2c

    add-int/lit8 v7, v4, -0x3

    aget-byte v8, v13, v7

    if-nez v8, :cond_2c

    .line 108
    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 109
    iget v8, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    sub-int/2addr v8, v7

    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_7
    .catchall {:try_start_1e .. :try_end_1e} :catchall_5

    move-object/from16 v23, v0

    const/4 v11, 0x0

    .line 110
    :try_start_1f
    invoke-virtual {v4, v13, v11, v7}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 111
    iget v0, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    sub-int/2addr v0, v7

    invoke-virtual {v8, v13, v7, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_7
    .catchall {:try_start_1f .. :try_end_1f} :catchall_4

    goto :goto_23

    :catchall_4
    move-exception v0

    move-object/from16 v2, p0

    move-object v3, v0

    move-object/from16 v6, v35

    goto/16 :goto_46

    :cond_2c
    move-object/from16 v23, v0

    add-int/lit8 v4, v4, -0x1

    move-object/from16 v11, p0

    move-object/from16 v0, v23

    const/4 v7, 0x1

    goto :goto_22

    :catch_6
    move-exception v0

    move-object/from16 v44, v1

    move-object/from16 v31, v5

    goto/16 :goto_3f

    :cond_2d
    move-object/from16 v23, v0

    const/4 v4, 0x0

    const/4 v8, 0x0

    :goto_23
    move-object/from16 v7, v43

    .line 112
    :try_start_20
    invoke-static {v7, v15, v2}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v0

    if-eqz v4, :cond_2e

    if-eqz v8, :cond_2e

    const-string v11, "csd-0"

    .line 113
    invoke-virtual {v0, v11, v4}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    const-string v4, "csd-1"

    .line 114
    invoke-virtual {v0, v4, v8}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    :cond_2e
    const/4 v4, 0x0

    .line 115
    invoke-virtual {v14, v0, v4}, Lcom/vincent/videocompressor/b;->a(Landroid/media/MediaFormat;Z)I

    move-result v13
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_7
    .catchall {:try_start_20 .. :try_end_20} :catchall_5

    goto :goto_25

    :cond_2f
    :goto_24
    move-object/from16 v23, v0

    move-object/from16 v7, v43

    goto :goto_25

    :catch_7
    move-exception v0

    move-object/from16 v44, v1

    goto/16 :goto_38

    :cond_30
    move-object/from16 v23, v0

    move-object/from16 v7, v43

    const/16 v19, 0x2

    .line 116
    :goto_25
    :try_start_21
    iget v0, v6, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v4, 0x4

    and-int/2addr v0, v4

    if-eqz v0, :cond_31

    const/4 v0, 0x1

    goto :goto_26

    :cond_31
    const/4 v0, 0x0

    :goto_26
    const/4 v4, 0x0

    .line 117
    invoke-virtual {v3, v10, v4}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_11
    .catchall {:try_start_21 .. :try_end_21} :catchall_5

    move v11, v0

    move/from16 v8, v22

    move-object/from16 v43, v23

    goto/16 :goto_1f

    :goto_27
    if-eq v10, v4, :cond_32

    move/from16 v4, v40

    move-object/from16 v0, v43

    move-object/from16 v10, v45

    move-object/from16 v43, v7

    move/from16 v40, v11

    move/from16 v7, v42

    :goto_28
    move-object/from16 v11, p0

    move-object/from16 v48, v35

    move-object/from16 v35, v6

    move v6, v8

    move-object/from16 v8, v48

    goto/16 :goto_1c

    :cond_32
    move-object/from16 v44, v5

    const-wide/16 v4, 0x9c4

    .line 118
    :try_start_22
    invoke-virtual {v1, v6, v4, v5}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v0
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_10
    .catchall {:try_start_22 .. :try_end_22} :catchall_5

    const/4 v4, -0x1

    if-ne v0, v4, :cond_33

    move-wide/from16 v46, v20

    move-object/from16 v10, v44

    const-wide/16 v16, 0x3e8

    const/16 v42, 0x0

    goto :goto_2a

    :cond_33
    const/4 v5, -0x3

    if-ne v0, v5, :cond_34

    goto :goto_29

    :cond_34
    const/4 v5, -0x2

    if-ne v0, v5, :cond_35

    .line 119
    :try_start_23
    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    .line 120
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "newFormat = "

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_8
    .catchall {:try_start_23 .. :try_end_23} :catchall_5

    :goto_29
    move-wide/from16 v46, v20

    move-object/from16 v10, v44

    const-wide/16 v16, 0x3e8

    :goto_2a
    move-object/from16 v44, v1

    move-object/from16 v20, v7

    const/4 v7, 0x1

    move-object/from16 v1, p4

    goto/16 :goto_34

    :catch_8
    move-exception v0

    move-object/from16 v31, v44

    const/4 v7, 0x1

    move-object/from16 v44, v1

    goto/16 :goto_3f

    :cond_35
    if-ltz v0, :cond_41

    .line 121
    :try_start_24
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_10
    .catchall {:try_start_24 .. :try_end_24} :catchall_5

    const/16 v10, 0x12

    if-lt v5, v10, :cond_37

    .line 122
    :try_start_25
    iget v5, v6, Landroid/media/MediaCodec$BufferInfo;->size:I
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_8
    .catchall {:try_start_25 .. :try_end_25} :catchall_5

    if-eqz v5, :cond_36

    const/4 v5, 0x1

    goto :goto_2d

    :cond_36
    const/4 v5, 0x0

    goto :goto_2d

    .line 123
    :cond_37
    :try_start_26
    iget v5, v6, Landroid/media/MediaCodec$BufferInfo;->size:I
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_10
    .catchall {:try_start_26 .. :try_end_26} :catchall_5

    if-nez v5, :cond_39

    :try_start_27
    iget-wide v4, v6, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_8
    .catchall {:try_start_27 .. :try_end_27} :catchall_5

    const-wide/16 v22, 0x0

    cmp-long v10, v4, v22

    if-eqz v10, :cond_38

    goto :goto_2b

    :cond_38
    const/4 v4, 0x0

    goto :goto_2c

    :cond_39
    :goto_2b
    const/4 v4, 0x1

    :goto_2c
    move v5, v4

    .line 124
    :goto_2d
    :try_start_28
    invoke-virtual {v1, v0, v5}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_10
    .catchall {:try_start_28 .. :try_end_28} :catchall_5

    if-eqz v5, :cond_3d

    .line 125
    :try_start_29
    invoke-virtual {v9}, Lcom/vincent/videocompressor/d;->a()V
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_9
    .catchall {:try_start_29 .. :try_end_29} :catchall_5

    const/4 v0, 0x0

    goto :goto_2e

    :catch_9
    move-exception v0

    move-object v4, v0

    .line 126
    :try_start_2a
    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    const/4 v0, 0x1

    :goto_2e
    if-nez v0, :cond_3d

    .line 127
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_10
    .catchall {:try_start_2a .. :try_end_2a} :catchall_5

    const/16 v4, 0x12

    if-lt v0, v4, :cond_3c

    const/4 v5, 0x0

    .line 128
    :try_start_2b
    invoke-virtual {v9, v5}, Lcom/vincent/videocompressor/d;->d(Z)V
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2b} :catch_d
    .catchall {:try_start_2b .. :try_end_2b} :catchall_5

    move-object v4, v1

    .line 129
    :try_start_2c
    iget-wide v0, v6, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_2c} :catch_c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_5

    const-wide/16 v16, 0x3e8

    mul-long v0, v0, v16

    move-object/from16 v10, v44

    :try_start_2d
    invoke-virtual {v10, v0, v1}, Lcom/vincent/videocompressor/a;->f(J)V
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_2d} :catch_b
    .catchall {:try_start_2d .. :try_end_2d} :catchall_5

    move-object/from16 v1, p4

    if-eqz v1, :cond_3a

    move-object/from16 v44, v4

    .line 130
    :try_start_2e
    iget-wide v4, v6, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    long-to-float v0, v4

    move-wide/from16 v4, v20

    move-object/from16 v20, v7

    long-to-float v7, v4

    div-float/2addr v0, v7

    const/high16 v7, 0x42c80000    # 100.0f

    mul-float v0, v0, v7

    invoke-interface {v1, v0}, Lcom/vincent/videocompressor/VideoController$b;->onProgress(F)V

    goto :goto_2f

    :cond_3a
    move-object/from16 v44, v4

    move-wide/from16 v4, v20

    move-object/from16 v20, v7

    .line 131
    :goto_2f
    invoke-virtual {v10}, Lcom/vincent/videocompressor/a;->g()Z
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_2e .. :try_end_2e} :catch_a
    .catchall {:try_start_2e .. :try_end_2e} :catchall_5

    move-wide/from16 v46, v4

    :cond_3b
    const/4 v7, 0x1

    goto/16 :goto_32

    :catch_a
    move-exception v0

    goto :goto_31

    :catch_b
    move-exception v0

    goto :goto_30

    :catch_c
    move-exception v0

    move-object/from16 v10, v44

    :goto_30
    move-object/from16 v44, v4

    goto :goto_31

    :catch_d
    move-exception v0

    move-object/from16 v10, v44

    move-object/from16 v44, v1

    :goto_31
    move-object/from16 v31, v10

    goto/16 :goto_39

    :cond_3c
    move-wide/from16 v46, v20

    move-object/from16 v10, v44

    const-wide/16 v4, 0x9c4

    const-wide/16 v16, 0x3e8

    move-object/from16 v44, v1

    move-object/from16 v20, v7

    move-object/from16 v1, p4

    .line 132
    :try_start_2f
    invoke-virtual {v3, v4, v5}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v0
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_2f} :catch_e
    .catchall {:try_start_2f .. :try_end_2f} :catchall_5

    if-ltz v0, :cond_3b

    const/4 v7, 0x1

    .line 133
    :try_start_30
    invoke-virtual {v9, v7}, Lcom/vincent/videocompressor/d;->d(Z)V

    .line 134
    invoke-virtual {v9}, Lcom/vincent/videocompressor/d;->f()Ljava/nio/ByteBuffer;

    move-result-object v22

    .line 135
    aget-object v23, v12, v0

    .line 136
    invoke-virtual/range {v23 .. v23}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    move/from16 v24, v31

    move/from16 v25, v15

    move/from16 v26, v2

    move/from16 v27, p3

    move/from16 v28, v39

    .line 137
    invoke-static/range {v22 .. v28}, Lcom/vincent/videocompressor/VideoController;->convertVideoFrame(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIII)I

    const/16 v24, 0x0

    .line 138
    iget-wide v4, v6, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const/16 v28, 0x0

    move-object/from16 v22, v3

    move/from16 v23, v0

    move/from16 v25, p1

    move-wide/from16 v26, v4

    invoke-virtual/range {v22 .. v28}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    goto :goto_32

    :catch_e
    move-exception v0

    goto/16 :goto_37

    :cond_3d
    move-wide/from16 v46, v20

    move-object/from16 v10, v44

    const-wide/16 v16, 0x3e8

    move-object/from16 v44, v1

    move-object/from16 v20, v7

    const/4 v7, 0x1

    move-object/from16 v1, p4

    .line 139
    :goto_32
    iget v0, v6, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v4, 0x4

    and-int/2addr v0, v4

    if-eqz v0, :cond_40

    .line 140
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x12

    if-lt v0, v5, :cond_3e

    .line 141
    invoke-virtual {v3}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    goto :goto_33

    :cond_3e
    const-wide/16 v4, 0x9c4

    .line 142
    invoke-virtual {v3, v4, v5}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v23

    if-ltz v23, :cond_3f

    const/16 v24, 0x0

    const/16 v25, 0x1

    .line 143
    iget-wide v4, v6, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const/16 v28, 0x4

    move-object/from16 v22, v3

    move-wide/from16 v26, v4

    invoke-virtual/range {v22 .. v28}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    :cond_3f
    :goto_33
    const/16 v42, 0x0

    :cond_40
    :goto_34
    move-object v5, v10

    move/from16 v4, v40

    move/from16 v7, v42

    move-object/from16 v0, v43

    move-object/from16 v1, v44

    move-object/from16 v10, v45

    move/from16 v40, v11

    move-object/from16 v43, v20

    move-wide/from16 v20, v46

    goto/16 :goto_28

    :cond_41
    move-object/from16 v10, v44

    const/4 v7, 0x1

    move-object/from16 v44, v1

    .line 144
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unexpected result from decoder.dequeueOutputBuffer: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_30
    .catch Ljava/lang/Exception; {:try_start_30 .. :try_end_30} :catch_f
    .catchall {:try_start_30 .. :try_end_30} :catchall_5

    :catch_f
    move-exception v0

    goto :goto_35

    :catch_10
    move-exception v0

    move-object/from16 v10, v44

    const/4 v7, 0x1

    move-object/from16 v44, v1

    :goto_35
    move-object/from16 v31, v10

    goto/16 :goto_3f

    :catch_11
    move-exception v0

    move-object/from16 v44, v1

    goto :goto_36

    :catch_12
    move-exception v0

    move-object/from16 v44, v1

    move/from16 v40, v4

    :goto_36
    move-object v10, v5

    :goto_37
    const/4 v7, 0x1

    goto :goto_35

    :cond_42
    move-object/from16 v44, v1

    move/from16 v40, v4

    move-object/from16 v31, v5

    const/4 v7, 0x1

    .line 145
    :try_start_31
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encoderOutputBuffer "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " was null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_43
    move-object/from16 v44, v1

    move/from16 v40, v4

    move-object/from16 v31, v5

    const/4 v7, 0x1

    .line 146
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected result from encoder.dequeueOutputBuffer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_31} :catch_13
    .catchall {:try_start_31 .. :try_end_31} :catchall_5

    :catch_13
    move-exception v0

    goto/16 :goto_3f

    :catchall_5
    move-exception v0

    goto :goto_3a

    :catch_14
    move-exception v0

    move-object/from16 v44, v1

    move/from16 v40, v4

    :goto_38
    move-object/from16 v31, v5

    :goto_39
    const/4 v7, 0x1

    goto/16 :goto_3f

    :cond_44
    move-object/from16 v44, v1

    move/from16 v40, v4

    move-object/from16 v31, v5

    move-object/from16 v6, v35

    const/4 v7, 0x1

    move-object/from16 v35, v8

    move-object/from16 v5, v31

    move-object/from16 v8, v35

    move/from16 v2, v40

    move-object/from16 v1, v44

    const/4 v0, 0x0

    goto/16 :goto_40

    :catch_15
    move-exception v0

    move-object/from16 v44, v1

    move/from16 v40, v4

    move-object/from16 v31, v5

    move-object/from16 v6, v35

    const/4 v7, 0x1

    goto/16 :goto_d

    :catch_16
    move-exception v0

    move-object/from16 v44, v1

    move/from16 v40, v4

    move-object/from16 v31, v5

    move-object/from16 v6, v35

    const/4 v7, 0x1

    move-object/from16 v35, v8

    const/4 v9, 0x0

    goto :goto_3f

    :catch_17
    move-exception v0

    move/from16 v40, v4

    move-object/from16 v31, v5

    move-object/from16 v6, v35

    const/4 v7, 0x1

    move-object/from16 v35, v8

    const/4 v9, 0x0

    goto :goto_3e

    :catch_18
    move-exception v0

    move/from16 v40, v4

    move-object/from16 v6, v35

    const/4 v7, 0x1

    move-object/from16 v35, v8

    goto :goto_3d

    :catchall_6
    move-exception v0

    move-object/from16 v35, v8

    :goto_3a
    move-object/from16 v2, p0

    move-object v3, v0

    :goto_3b
    move-object/from16 v6, v35

    goto :goto_42

    :catch_19
    move-exception v0

    move/from16 v40, v4

    goto :goto_3c

    :catchall_7
    move-exception v0

    move-object/from16 v35, v8

    move-object/from16 v2, p0

    move-object v3, v0

    move-object v1, v12

    move-object/from16 v6, v35

    goto/16 :goto_6

    :catch_1a
    move-exception v0

    move/from16 v40, v4

    move-object/from16 v38, v12

    :goto_3c
    move-object/from16 v6, v35

    const/4 v7, 0x1

    move-object/from16 v35, v8

    const/4 v3, 0x0

    :goto_3d
    const/4 v9, 0x0

    const/16 v31, 0x0

    :goto_3e
    const/16 v44, 0x0

    .line 147
    :goto_3f
    :try_start_32
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_32 .. :try_end_32} :catch_1c
    .catchall {:try_start_32 .. :try_end_32} :catchall_9

    move-object/from16 v5, v31

    move-object/from16 v8, v35

    move/from16 v2, v40

    move-object/from16 v1, v44

    const/4 v0, 0x1

    .line 148
    :goto_40
    :try_start_33
    invoke-virtual {v8, v2}, Landroid/media/MediaExtractor;->unselectTrack(I)V

    if-eqz v9, :cond_45

    .line 149
    invoke-virtual {v9}, Lcom/vincent/videocompressor/d;->i()V

    :cond_45
    if-eqz v5, :cond_46

    .line 150
    invoke-virtual {v5}, Lcom/vincent/videocompressor/a;->e()V

    :cond_46
    if-eqz v1, :cond_47

    .line 151
    invoke-virtual {v1}, Landroid/media/MediaCodec;->stop()V

    .line 152
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    :cond_47
    if-eqz v3, :cond_49

    .line 153
    invoke-virtual {v3}, Landroid/media/MediaCodec;->stop()V

    .line 154
    invoke-virtual {v3}, Landroid/media/MediaCodec;->release()V
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_33} :catch_1b
    .catchall {:try_start_33 .. :try_end_33} :catchall_8

    goto :goto_44

    :catchall_8
    move-exception v0

    goto :goto_41

    :catch_1b
    move-exception v0

    goto :goto_43

    :catchall_9
    move-exception v0

    move-object/from16 v8, v35

    :goto_41
    move-object/from16 v2, p0

    move-object v3, v0

    move-object v6, v8

    :goto_42
    move-object/from16 v1, v38

    goto/16 :goto_6

    :catch_1c
    move-exception v0

    move-object/from16 v8, v35

    :goto_43
    move-object v6, v8

    move-object/from16 v1, v38

    goto/16 :goto_49

    :cond_48
    move-object/from16 v38, v12

    move-object/from16 v6, v35

    const/4 v7, 0x1

    const/4 v0, 0x0

    :cond_49
    :goto_44
    move v15, v0

    :goto_45
    if-nez v15, :cond_4a

    const/4 v10, 0x1

    const-wide/16 v11, -0x1

    move-object/from16 v1, p0

    move-object v2, v8

    move-object v3, v14

    move-object v4, v6

    const/4 v9, 0x0

    move-wide/from16 v5, v32

    move-object v13, v8

    const/16 v16, 0x1

    move-wide v7, v11

    const/4 v11, 0x0

    move-object/from16 v9, v37

    const/4 v12, 0x1

    .line 155
    :try_start_34
    invoke-direct/range {v1 .. v10}, Lcom/vincent/videocompressor/VideoController;->f(Landroid/media/MediaExtractor;Lcom/vincent/videocompressor/b;Landroid/media/MediaCodec$BufferInfo;JJLjava/io/File;Z)J
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_34} :catch_1d
    .catchall {:try_start_34 .. :try_end_34} :catchall_a

    goto :goto_47

    :catchall_a
    move-exception v0

    move-object/from16 v2, p0

    move-object v3, v0

    move-object v6, v13

    :goto_46
    move-object/from16 v1, v38

    goto/16 :goto_4e

    :catch_1d
    move-exception v0

    move-object v6, v13

    move-object/from16 v1, v38

    goto/16 :goto_4b

    :cond_4a
    move-object v13, v8

    const/4 v11, 0x0

    const/4 v12, 0x1

    .line 156
    :goto_47
    invoke-virtual {v13}, Landroid/media/MediaExtractor;->release()V

    if-eqz v14, :cond_4b

    .line 157
    :try_start_35
    invoke-virtual {v14, v11}, Lcom/vincent/videocompressor/b;->m(Z)V
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_35 .. :try_end_35} :catch_1e

    goto :goto_48

    :catch_1e
    move-exception v0

    move-object v1, v0

    .line 158
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    .line 159
    :cond_4b
    :goto_48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long v1, v1, v29

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move v6, v15

    goto/16 :goto_4d

    :catchall_b
    move-exception v0

    move-object v13, v8

    move-object v1, v12

    const/4 v11, 0x0

    move-object/from16 v2, p0

    move-object v3, v0

    move-object v6, v13

    goto/16 :goto_4e

    :catch_1f
    move-exception v0

    move-object v13, v8

    move-object v1, v12

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v6, v13

    goto :goto_4b

    :catchall_c
    move-exception v0

    move-object v13, v6

    move-object v1, v12

    const/4 v11, 0x0

    goto :goto_4a

    :catch_20
    move-exception v0

    move-object v13, v6

    move-object/from16 v34, v8

    move-object/from16 v37, v10

    move-object v1, v12

    :goto_49
    const/4 v11, 0x0

    const/4 v12, 0x1

    goto :goto_4b

    :catchall_d
    move-exception v0

    move-object v1, v12

    const/4 v11, 0x0

    const/4 v6, 0x0

    goto :goto_4a

    :catch_21
    move-exception v0

    move-object/from16 v34, v8

    move-object/from16 v37, v10

    move-object v1, v12

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v6, 0x0

    goto :goto_4b

    :catchall_e
    move-exception v0

    move-object v1, v12

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v14, 0x0

    :goto_4a
    move-object/from16 v2, p0

    move-object v3, v0

    goto :goto_4e

    :catch_22
    move-exception v0

    move-object/from16 v34, v8

    move-object/from16 v37, v10

    move-object v1, v12

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v6, 0x0

    const/4 v14, 0x0

    .line 160
    :goto_4b
    :try_start_36
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_f

    if-eqz v6, :cond_4c

    .line 161
    invoke-virtual {v6}, Landroid/media/MediaExtractor;->release()V

    :cond_4c
    if-eqz v14, :cond_4d

    .line 162
    :try_start_37
    invoke-virtual {v14, v11}, Lcom/vincent/videocompressor/b;->m(Z)V
    :try_end_37
    .catch Ljava/lang/Exception; {:try_start_37 .. :try_end_37} :catch_23

    goto :goto_4c

    :catch_23
    move-exception v0

    move-object v2, v0

    .line 163
    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    .line 164
    :cond_4d
    :goto_4c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long v1, v1, v29

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/4 v6, 0x1

    :goto_4d
    move-object/from16 v2, p0

    .line 165
    invoke-direct {v2, v12, v6}, Lcom/vincent/videocompressor/VideoController;->c(ZZ)V

    .line 166
    sput-object v37, Lcom/vincent/videocompressor/VideoController;->f:Ljava/io/File;

    .line 167
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v2, Lcom/vincent/videocompressor/VideoController;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v37 .. v37}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v34 .. v34}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v12

    :catchall_f
    move-exception v0

    goto :goto_4a

    :goto_4e
    if-eqz v6, :cond_4e

    .line 170
    invoke-virtual {v6}, Landroid/media/MediaExtractor;->release()V

    :cond_4e
    if-eqz v14, :cond_4f

    .line 171
    :try_start_38
    invoke-virtual {v14, v11}, Lcom/vincent/videocompressor/b;->m(Z)V
    :try_end_38
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_38} :catch_24

    goto :goto_4f

    :catch_24
    move-exception v0

    move-object v4, v0

    .line 172
    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    .line 173
    :cond_4f
    :goto_4f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v4, v4, v29

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 174
    throw v3

    :cond_50
    move-object v2, v11

    const/4 v11, 0x0

    const/4 v12, 0x1

    .line 175
    invoke-direct {v2, v12, v12}, Lcom/vincent/videocompressor/VideoController;->c(ZZ)V

    return v11
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/vincent/videocompressor/VideoController;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
