.class public final Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;
.super Ljava/lang/Object;
.source "DownloadFactory.java"

# interfaces
.implements Lcom/beizi/ad/internal/utilities/DownloadFactory$Download;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/utilities/DownloadFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DownloadImpl"
.end annotation


# instance fields
.field private mDelegate:Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mHandlerThread:Landroid/os/HandlerThread;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mMainHandler:Landroid/os/Handler;

.field private mRequest:Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

.field private mThreadHandler:Landroid/os/Handler;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mMainHandler:Landroid/os/Handler;

    .line 3
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "download"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mHandlerThread:Landroid/os/HandlerThread;

    .line 4
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 5
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mThreadHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$500(Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;)Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mDelegate:Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;

    return-object p0
.end method

.method private onCheck(Ljava/io/File;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mDelegate:Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;->onCheck(Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private onFail(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mMainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$3;

    invoke-direct {v1, p0, p1}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$3;-><init>(Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private onProgress(JJ)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mMainHandler:Landroid/os/Handler;

    new-instance v7, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$1;

    move-object v1, v7

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$1;-><init>(Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;JJ)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private onSuccess(Ljava/io/File;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mMainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$2;

    invoke-direct {v1, p0, p1}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$2;-><init>(Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;Ljava/io/File;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mRequest:Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mUserCancel:Z

    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mHandlerThread:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_0
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mThreadHandler:Landroid/os/Handler;

    .line 3
    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mHandlerThread:Landroid/os/HandlerThread;

    return-void
.end method

.method public pause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mRequest:Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mUserPause:Z

    :cond_0
    return-void
.end method

.method public register(Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mDelegate:Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;

    return-void
.end method

.method public resume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mRequest:Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mUserPause:Z

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mRequest:Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mUserPause:Z

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mThreadHandler:Landroid/os/Handler;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

    iget-object v1, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mRequest:Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

    invoke-direct {v0, v1}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;-><init>(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)V

    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->start(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public run()V
    .locals 15
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mRequest:Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

    const/4 v1, 0x1

    .line 2
    iput-boolean v1, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mDownloading:Z

    .line 3
    new-instance v2, Ljava/io/File;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$000(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 5
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x3

    .line 6
    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->onFail(I)V

    return-void

    .line 7
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$000(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$100(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 8
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 9
    :try_start_0
    new-instance v6, Ljava/net/URL;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$200(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v6

    check-cast v6, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_b
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 11
    :try_start_1
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$300(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v11, v7, v9

    if-eqz v11, :cond_1

    const-string v7, "Range"

    .line 12
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "bytes="

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$300(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)J

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v11, "-"

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const-string v7, "Connection"

    const-string v8, "Keep-Alive"

    .line 13
    invoke-virtual {v6, v7, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v7

    const/16 v8, 0xc8

    if-eq v7, v8, :cond_2

    const/16 v11, 0xce

    if-eq v7, v11, :cond_2

    .line 15
    iput-boolean v5, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mDownloading:Z

    const/4 v1, 0x2

    .line 16
    invoke-direct {p0, v1}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->onFail(I)V

    move-object v7, v4

    goto/16 :goto_3

    :cond_2
    const-string v11, "Content-Disposition"

    .line 17
    invoke-virtual {v6, v11}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 18
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v12

    .line 19
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x18

    if-lt v13, v14, :cond_3

    .line 20
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getContentLengthLong()J

    move-result-wide v13

    goto :goto_0

    .line 21
    :cond_3
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v13

    int-to-long v13, v13

    :goto_0
    if-ne v7, v8, :cond_4

    .line 22
    invoke-static {v0, v9, v10}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$302(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;J)J

    .line 23
    invoke-static {v0, v13, v14}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$402(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;J)J

    .line 24
    :cond_4
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_a
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v8, 0x2000

    :try_start_2
    new-array v8, v8, [B

    .line 26
    new-instance v9, Ljava/io/RandomAccessFile;

    const-string v10, "rw"

    invoke-direct {v9, v2, v10}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 27
    :try_start_3
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$300(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    .line 28
    :cond_5
    :goto_1
    invoke-virtual {v7, v8}, Ljava/io/InputStream;->read([B)I

    move-result v4

    const/4 v10, -0x1

    if-eq v4, v10, :cond_8

    add-int/2addr v2, v1

    .line 29
    invoke-virtual {v9, v8, v5, v4}, Ljava/io/RandomAccessFile;->write([BII)V

    int-to-long v10, v4

    .line 30
    invoke-static {v0, v10, v11}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$314(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;J)J

    .line 31
    rem-int/lit8 v4, v2, 0x40

    if-nez v4, :cond_5

    .line 32
    iget-boolean v4, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mUserCancel:Z

    if-eqz v4, :cond_6

    .line 33
    iput-boolean v5, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mDownloading:Z

    .line 34
    invoke-direct {p0, v1}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->onFail(I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 35
    :try_start_4
    invoke-virtual {v9}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 36
    :catch_0
    :try_start_5
    invoke-virtual {v9}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 37
    :catch_1
    :try_start_6
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 38
    :catch_2
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void

    .line 39
    :cond_6
    :try_start_7
    iget-boolean v4, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mUserPause:Z

    if-eqz v4, :cond_7

    .line 40
    iput-boolean v5, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mDownloading:Z

    const/4 v1, 0x6

    .line 41
    invoke-direct {p0, v1}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->onFail(I)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 42
    :try_start_8
    invoke-virtual {v9}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 43
    :catch_3
    :try_start_9
    invoke-virtual {v9}, Ljava/io/RandomAccessFile;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 44
    :catch_4
    :try_start_a
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    .line 45
    :catch_5
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void

    .line 46
    :cond_7
    :try_start_b
    rem-int/lit8 v4, v2, 0x10

    if-nez v4, :cond_5

    .line 47
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$300(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)J

    move-result-wide v10

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->access$400(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)J

    move-result-wide v12

    invoke-direct {p0, v10, v11, v12, v13}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->onProgress(JJ)V

    goto :goto_1

    .line 48
    :cond_8
    invoke-virtual {v9}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/FileDescriptor;->sync()V

    .line 49
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->onCheck(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 50
    iput-boolean v5, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mDownloading:Z

    const/4 v1, 0x4

    .line 51
    invoke-direct {p0, v1}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->onFail(I)V

    goto :goto_2

    .line 52
    :cond_9
    iput-boolean v5, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mDownloading:Z

    .line 53
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->onSuccess(Ljava/io/File;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_8
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :goto_2
    move-object v4, v9

    :goto_3
    if-eqz v4, :cond_a

    .line 54
    :try_start_c
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    goto :goto_4

    :catch_6
    nop

    :cond_a
    :goto_4
    if-eqz v4, :cond_b

    .line 55
    :try_start_d
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    goto :goto_5

    :catch_7
    nop

    :cond_b
    :goto_5
    if-eqz v7, :cond_f

    .line 56
    :try_start_e
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_f

    goto :goto_a

    :catchall_0
    move-exception v0

    move-object v4, v9

    goto :goto_b

    :catch_8
    move-exception v1

    move-object v4, v9

    goto :goto_6

    :catch_9
    move-exception v1

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v7, v4

    goto :goto_b

    :catch_a
    move-exception v1

    move-object v7, v4

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v6, v4

    move-object v7, v6

    goto :goto_b

    :catch_b
    move-exception v1

    move-object v6, v4

    move-object v7, v6

    .line 57
    :goto_6
    :try_start_f
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 58
    iput-boolean v5, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mDownloading:Z

    const/4 v0, 0x5

    .line 59
    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->onFail(I)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    if-eqz v4, :cond_c

    .line 60
    :try_start_10
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_c

    goto :goto_7

    :catch_c
    nop

    :cond_c
    :goto_7
    if-eqz v4, :cond_d

    .line 61
    :try_start_11
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_d

    goto :goto_8

    :catch_d
    nop

    :cond_d
    :goto_8
    if-eqz v7, :cond_e

    .line 62
    :try_start_12
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_e

    goto :goto_9

    :catch_e
    nop

    :cond_e
    :goto_9
    if-eqz v6, :cond_10

    .line 63
    :catch_f
    :cond_f
    :goto_a
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_10
    return-void

    :catchall_3
    move-exception v0

    :goto_b
    if-eqz v4, :cond_11

    .line 64
    :try_start_13
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_10

    goto :goto_c

    :catch_10
    nop

    :cond_11
    :goto_c
    if-eqz v4, :cond_12

    .line 65
    :try_start_14
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_11

    goto :goto_d

    :catch_11
    nop

    :cond_12
    :goto_d
    if-eqz v7, :cond_13

    .line 66
    :try_start_15
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_12

    goto :goto_e

    :catch_12
    nop

    :cond_13
    :goto_e
    if-eqz v6, :cond_14

    .line 67
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 68
    :cond_14
    goto :goto_10

    :goto_f
    throw v0

    :goto_10
    goto :goto_f
.end method

.method public start(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mDownloading:Z

    if-nez v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mRequest:Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mRequest:Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->mUserCancel:Z

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mRequest:Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;

    .line 5
    invoke-virtual {p1}, Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;->reset()V

    .line 6
    iget-object p1, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->mThreadHandler:Landroid/os/Handler;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid request,it\'s downloading"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
