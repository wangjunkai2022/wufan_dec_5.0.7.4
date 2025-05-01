.class public Lcom/github/snowdream/android/app/downloader/a;
.super Ljava/lang/Thread;
.source "AsycDownloadTaskRunner.java"


# static fields
.field private static final A:I = 0x1

.field private static final B:I = 0x2

.field private static C:Ljava/lang/String;

.field private static final z:Ljava/lang/String;


# instance fields
.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field f:Z

.field g:Z

.field h:Z

.field i:Ljava/io/InputStream;

.field j:Ljava/io/RandomAccessFile;

.field k:Ljava/io/InputStream;

.field l:Ljava/io/RandomAccessFile;

.field m:Ljava/net/HttpURLConnection;

.field n:Ljava/net/HttpURLConnection;

.field o:Ljava/net/HttpURLConnection;

.field p:Ljava/net/HttpURLConnection;

.field q:Ljava/io/File;

.field r:Ljava/io/File;

.field s:J

.field t:J

.field u:J

.field v:J

.field w:Ljava/lang/String;

.field x:Z

.field y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/github/snowdream/android/app/downloader/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/github/snowdream/android/app/downloader/a;->z:Ljava/lang/String;

    .line 2
    sget-object v0, Lcom/join/mgps/Util/v;->g:Ljava/lang/String;

    sput-object v0, Lcom/github/snowdream/android/app/downloader/a;->C:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/github/snowdream/android/app/downloader/a;->b:J

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/github/snowdream/android/app/downloader/a;->f:Z

    .line 4
    iput-boolean v0, p0, Lcom/github/snowdream/android/app/downloader/a;->g:Z

    .line 5
    iput-boolean v0, p0, Lcom/github/snowdream/android/app/downloader/a;->h:Z

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->i:Ljava/io/InputStream;

    .line 7
    iput-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->j:Ljava/io/RandomAccessFile;

    .line 8
    iput-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->k:Ljava/io/InputStream;

    .line 9
    iput-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->l:Ljava/io/RandomAccessFile;

    .line 10
    iput-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    .line 11
    iput-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    .line 12
    iput-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    .line 13
    iput-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const-string v1, ""

    .line 14
    iput-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->w:Ljava/lang/String;

    .line 15
    iput-boolean v0, p0, Lcom/github/snowdream/android/app/downloader/a;->x:Z

    .line 16
    iput-boolean v0, p0, Lcom/github/snowdream/android/app/downloader/a;->y:Z

    .line 17
    iput-object p1, p0, Lcom/github/snowdream/android/app/downloader/a;->c:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    .line 19
    iput-object p3, p0, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-void
.end method

.method private a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSpeed(Ljava/lang/String;)V

    .line 2
    iget-wide v0, p0, Lcom/github/snowdream/android/app/downloader/a;->b:J

    const/16 v2, 0x20

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    .line 3
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/event/l;

    iget-object v3, p0, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    invoke-direct {v1, v3, v2}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/github/snowdream/android/app/downloader/a;->g:Z

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    const/4 v1, 0x2

    invoke-direct {p0, v0, v3, v4, v1}, Lcom/github/snowdream/android/app/downloader/a;->p(Lcom/github/snowdream/android/app/downloader/DownloadTask;JI)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    invoke-direct {p0, v0, v3, v4}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 7
    :goto_0
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/event/l;

    iget-object v3, p0, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    invoke-direct {v1, v3, v2}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    return-void
.end method

.method private b(Lcom/github/snowdream/android/app/downloader/DownloadTask;JI)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDuration()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDuration(J)V

    .line 2
    invoke-virtual {p1, p4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setInterrupt(I)V

    .line 3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p2

    const/4 p3, 0x5

    if-ne p2, p3, :cond_0

    const-wide/16 p2, 0x64

    invoke-virtual {p1, p2, p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 4
    :cond_0
    :try_start_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lp1/b;->update(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private c()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->k:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 3
    iput-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->k:Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 5
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->l:Ljava/io/RandomAccessFile;

    if-eqz v1, :cond_1

    .line 6
    :try_start_1
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 7
    iput-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->l:Ljava/io/RandomAccessFile;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 9
    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    if-eqz v1, :cond_2

    .line 10
    :try_start_2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 11
    iput-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_2
    return-void
.end method

.method private d()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->i:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 3
    iput-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->i:Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 5
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->j:Ljava/io/RandomAccessFile;

    if-eqz v1, :cond_1

    .line 6
    :try_start_1
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 7
    iput-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->j:Ljava/io/RandomAccessFile;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 9
    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    if-eqz v1, :cond_2

    .line 10
    :try_start_2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 11
    iput-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_2
    return-void
.end method

.method private g(Ljava/net/HttpURLConnection;)J
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_1

    :cond_0
    const-string v2, "Content-Length"

    .line 2
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    :goto_1
    return-wide v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private k(Lcom/join/mgps/dto/GameMd5Data;)Ljava/lang/String;
    .locals 3

    const-string v0, "skip"

    .line 1
    :try_start_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 2
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 3
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object p1

    invoke-interface {p1, v1}, Le2/i;->C1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object p1

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameMD5ResultInfo;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMD5ResultInfo;->getInfo()Lcom/join/mgps/dto/GameMD5ResultInfo$InfoBean;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameMD5ResultInfo;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMD5ResultInfo;->getInfo()Lcom/join/mgps/dto/GameMD5ResultInfo$InfoBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMD5ResultInfo$InfoBean;->getState()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    return-object v0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    return-object v0
.end method

.method private l(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x7

    if-ne v0, v2, :cond_0

    .line 2
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/event/l;

    iget-object v2, p0, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v3, 0x22

    invoke-direct {v0, v2, v3}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    return v1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    const/16 v0, 0x28

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private m(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x1b

    if-ne v0, v2, :cond_0

    .line 2
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/event/l;

    iget-object v2, p0, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v3, 0x23

    invoke-direct {v0, v2, v3}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    return v1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMobleNetNeedStop()I

    move-result p1

    if-ne p1, v1, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private n()V
    .locals 19

    move-object/from16 v1, p0

    const-string v2, "readFileSize: "

    const/4 v4, 0x3

    :goto_0
    if-lez v4, :cond_33

    .line 1
    iget-boolean v5, v1, Lcom/github/snowdream/android/app/downloader/a;->f:Z

    if-nez v5, :cond_33

    .line 2
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v8, :cond_28

    .line 4
    sget-object v8, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "downStatus:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 5
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_url_remote()Ljava/lang/String;

    move-result-object v8

    .line 6
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isMod()Z

    move-result v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v9, :cond_1

    :try_start_1
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v9}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_2

    .line 7
    :cond_0
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v9
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v3, v0

    move/from16 v16, v4

    :goto_1
    const/4 v4, 0x3

    goto/16 :goto_1a

    .line 8
    :cond_1
    :goto_2
    :try_start_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v8}, Lcom/join/mgps/Util/x0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ".mod"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 9
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v11, Lcom/github/snowdream/android/app/downloader/a;->C:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "mod/"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v11}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "/"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 10
    :goto_3
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v11, ""

    if-eqz v10, :cond_2

    move-object v9, v11

    .line 11
    :cond_2
    :try_start_3
    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v10, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    .line 12
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v9

    .line 13
    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v10, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iput-wide v9, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    .line 15
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v9
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v12, "openConnection first... "

    const-string v14, "audio/x-mod"

    const-string v15, "application/zip"

    const-string v5, "application/vnd.android.package-archive"

    const-string v6, "application/octet-stream"

    const-string v7, "Content-Type"

    const-string v10, "GET"

    const-string v13, "Keep-Alive"

    const-string v3, "Connection"

    move/from16 v16, v4

    const/4 v4, 0x1

    if-eqz v9, :cond_4

    :try_start_4
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v9

    if-eq v9, v4, :cond_4

    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v9

    const/4 v4, 0x3

    if-ne v9, v4, :cond_3

    goto :goto_4

    :cond_3
    const/4 v4, 0x1

    .line 16
    iput-boolean v4, v1, Lcom/github/snowdream/android/app/downloader/a;->x:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v17, v11

    move-object/from16 v18, v12

    move-object v9, v14

    move-object v8, v15

    goto/16 :goto_8

    :catch_1
    move-exception v0

    move-object v3, v0

    goto/16 :goto_1

    .line 17
    :cond_4
    :goto_4
    :try_start_5
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_url_remote()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_8
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v4, :cond_e

    .line 18
    :try_start_6
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    move-object v9, v14

    move-object/from16 v17, v15

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v14

    iput-wide v14, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    goto :goto_5

    :cond_5
    move-object v9, v14

    move-object/from16 v17, v15

    .line 19
    :goto_5
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v14, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v4, v14, v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_currentSize(J)V

    .line 20
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v8}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 21
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljava/net/HttpURLConnection;

    iput-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    .line 23
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v4

    new-instance v8, Lcom/join/mgps/event/l;

    iget-object v14, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v15, 0x15

    invoke-direct {v8, v14, v15}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v4, v8}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 24
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    const/16 v8, 0x3e8

    invoke-virtual {v4, v8}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 25
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v8}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 26
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v3, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 28
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    .line 29
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "openConnection ... status="

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    const/16 v8, 0xc8

    if-ne v4, v8, :cond_9

    .line 31
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v7}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 32
    invoke-static {v4}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    move-object v4, v11

    .line 33
    :cond_6
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    move-object/from16 v8, v17

    .line 36
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7

    .line 37
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 38
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getActual_size()J

    move-result-wide v14

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v4

    move-object/from16 v17, v11

    move-object/from16 v18, v12

    int-to-long v11, v4

    cmp-long v4, v14, v11

    if-nez v4, :cond_d

    goto :goto_6

    :cond_7
    move-object/from16 v17, v11

    move-object/from16 v18, v12

    goto :goto_6

    :cond_8
    move-object/from16 v18, v12

    move-object/from16 v8, v17

    move-object/from16 v17, v11

    .line 39
    :goto_6
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-direct {v1, v4}, Lcom/github/snowdream/android/app/downloader/a;->g(Ljava/net/HttpURLConnection;)J

    move-result-wide v11

    iput-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    .line 40
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4, v11, v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_actual_size(J)V

    const/4 v4, 0x1

    .line 41
    iput-boolean v4, v1, Lcom/github/snowdream/android/app/downloader/a;->x:Z

    goto/16 :goto_7

    :cond_9
    move-object/from16 v18, v12

    move-object/from16 v8, v17

    move-object/from16 v17, v11

    const/16 v11, 0x12e

    if-eq v4, v11, :cond_a

    const/16 v11, 0x12d

    if-eq v4, v11, :cond_a

    const/16 v11, 0x12f

    if-ne v4, v11, :cond_d

    .line 42
    :cond_a
    new-instance v4, Ljava/net/URL;

    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    const-string v12, "Location"

    invoke-virtual {v11, v12}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v4, v11}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljava/net/HttpURLConnection;

    iput-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    .line 44
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v4

    new-instance v11, Lcom/join/mgps/event/l;

    iget-object v12, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v14, 0x15

    invoke-direct {v11, v12, v14}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v4, v11}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 45
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    const/16 v11, 0x3e8

    invoke-virtual {v4, v11}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 46
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v11}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 47
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v3, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 49
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    .line 50
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    const/16 v11, 0xc8

    if-ne v4, v11, :cond_d

    .line 51
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v7}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 52
    invoke-static {v4}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_b

    move-object/from16 v4, v17

    .line 53
    :cond_b
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 54
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    .line 56
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    .line 57
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 58
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getActual_size()J

    move-result-wide v11

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v4

    int-to-long v14, v4

    cmp-long v4, v11, v14

    if-nez v4, :cond_d

    .line 59
    :cond_c
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-direct {v1, v4}, Lcom/github/snowdream/android/app/downloader/a;->g(Ljava/net/HttpURLConnection;)J

    move-result-wide v11

    iput-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    .line 60
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4, v11, v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_actual_size(J)V

    const/4 v4, 0x1

    .line 61
    iput-boolean v4, v1, Lcom/github/snowdream/android/app/downloader/a;->x:Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 62
    :cond_d
    :goto_7
    :try_start_7
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_8

    :catch_2
    move-exception v0

    move-object v4, v0

    .line 63
    :try_start_8
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_8

    :cond_e
    move-object/from16 v17, v11

    move-object/from16 v18, v12

    move-object v9, v14

    move-object v8, v15

    const/4 v4, 0x1

    .line 64
    :try_start_9
    iput-boolean v4, v1, Lcom/github/snowdream/android/app/downloader/a;->x:Z

    .line 65
    :goto_8
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v4
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    const/4 v12, 0x2

    if-eqz v4, :cond_10

    :try_start_a
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v4

    if-ne v4, v12, :cond_f

    goto :goto_9

    :cond_f
    const/4 v4, 0x1

    .line 66
    iput-boolean v4, v1, Lcom/github/snowdream/android/app/downloader/a;->y:Z
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-object/from16 v12, v17

    goto/16 :goto_13

    .line 67
    :cond_10
    :goto_9
    :try_start_b
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    if-nez v4, :cond_23

    .line 68
    :try_start_c
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_11

    .line 69
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v14

    iput-wide v14, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    goto :goto_a

    :cond_11
    const-wide/16 v14, 0x0

    .line 70
    iput-wide v14, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    .line 71
    :goto_a
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v4

    .line 72
    new-instance v14, Ljava/net/URL;

    invoke-direct {v14, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 73
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v15, v18

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    invoke-virtual {v14}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljava/net/HttpURLConnection;

    iput-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    const/16 v14, 0x3e8

    .line 75
    invoke-virtual {v4, v14}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 76
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v14}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 77
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v3, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 79
    sget-object v4, Lcom/join/mgps/Util/v;->s:Ljava/lang/String;

    .line 80
    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_13

    const-string v14, ","

    .line 81
    invoke-virtual {v4, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 82
    array-length v14, v4

    const/4 v15, 0x0

    :goto_b
    if-ge v15, v14, :cond_13

    aget-object v11, v4, v15

    .line 83
    iget-object v12, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v12, v11}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 84
    invoke-static {v11}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_12

    const-string v4, "\""

    move-object/from16 v12, v17

    .line 85
    invoke-virtual {v11, v4, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 86
    iput-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->w:Ljava/lang/String;

    goto :goto_c

    :cond_12
    move-object/from16 v12, v17

    add-int/lit8 v15, v15, 0x1

    const/4 v12, 0x2

    goto :goto_b

    :cond_13
    move-object/from16 v12, v17

    .line 87
    :goto_c
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    .line 88
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    const/16 v11, 0xc8

    if-ne v4, v11, :cond_1a

    .line 89
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v3, v7}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 90
    invoke-static {v3}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_14

    move-object v3, v12

    .line 91
    :cond_14
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    .line 92
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    .line 93
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    .line 94
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    .line 95
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 96
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getActual_size()J

    move-result-wide v3

    iget-object v5, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v5
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    int-to-long v5, v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_15

    goto :goto_f

    .line 97
    :cond_15
    :try_start_d
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_d

    :catch_3
    move-exception v0

    move-object v3, v0

    .line 98
    :try_start_e
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 99
    :goto_d
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 100
    :try_start_f
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    if-eqz v2, :cond_16

    .line 101
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v2, 0x0

    .line 102
    iput-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    .line 103
    :cond_16
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    if-eqz v2, :cond_17

    .line 104
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v2, 0x0

    .line 105
    iput-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    .line 106
    :cond_17
    iget-boolean v2, v1, Lcom/github/snowdream/android/app/downloader/a;->f:Z

    if-nez v2, :cond_18

    const-wide/16 v2, 0x4b0

    .line 107
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_4

    goto :goto_e

    :catch_4
    move-exception v0

    move-object v2, v0

    .line 108
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_18
    :goto_e
    return-void

    .line 109
    :cond_19
    :goto_f
    :try_start_10
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "  task.getSize  111 range= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 110
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-direct {v1, v3}, Lcom/github/snowdream/android/app/downloader/a;->g(Ljava/net/HttpURLConnection;)J

    move-result-wide v3

    iput-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    const/4 v3, 0x1

    .line 111
    iput-boolean v3, v1, Lcom/github/snowdream/android/app/downloader/a;->y:Z

    .line 112
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "  task.getSize  222  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto/16 :goto_12

    :cond_1a
    const/16 v11, 0x12e

    if-eq v4, v11, :cond_1b

    const/16 v11, 0x12d

    if-eq v4, v11, :cond_1b

    const/16 v11, 0x12f

    if-ne v4, v11, :cond_22

    .line 113
    :cond_1b
    new-instance v4, Ljava/net/URL;

    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    const-string v14, "Location"

    invoke-virtual {v11, v14}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v4, v11}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljava/net/HttpURLConnection;

    iput-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    .line 115
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v4

    new-instance v11, Lcom/join/mgps/event/l;

    iget-object v14, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v15, 0x15

    invoke-direct {v11, v14, v15}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v4, v11}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 116
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    const/16 v11, 0x3e8

    invoke-virtual {v4, v11}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 117
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v11}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 118
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v3, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v3, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 120
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    .line 121
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_22

    .line 122
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v3, v7}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 123
    invoke-static {v3}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1c

    move-object v3, v12

    .line 124
    :cond_1c
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    .line 125
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    .line 126
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    .line 127
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    .line 128
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 129
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getActual_size()J

    move-result-wide v3

    iget-object v5, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v5

    int-to-long v5, v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_1d

    goto :goto_11

    .line 130
    :cond_1d
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 131
    :try_start_11
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    if-eqz v2, :cond_1e

    .line 132
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v2, 0x0

    .line 133
    iput-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    .line 134
    :cond_1e
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    if-eqz v2, :cond_1f

    .line 135
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v2, 0x0

    .line 136
    iput-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    .line 137
    :cond_1f
    iget-boolean v2, v1, Lcom/github/snowdream/android/app/downloader/a;->f:Z

    if-nez v2, :cond_20

    const-wide/16 v2, 0x4b0

    .line 138
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5

    goto :goto_10

    :catch_5
    move-exception v0

    move-object v2, v0

    .line 139
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_20
    :goto_10
    return-void

    .line 140
    :cond_21
    :goto_11
    :try_start_12
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "  task.getSize  111 range= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 141
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-direct {v1, v3}, Lcom/github/snowdream/android/app/downloader/a;->g(Ljava/net/HttpURLConnection;)J

    move-result-wide v3

    iput-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    const/4 v3, 0x1

    .line 142
    iput-boolean v3, v1, Lcom/github/snowdream/android/app/downloader/a;->y:Z

    .line 143
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "  task.getSize  222  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_1
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 144
    :cond_22
    :goto_12
    :try_start_13
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_6
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    goto :goto_13

    :catch_6
    move-exception v0

    move-object v3, v0

    .line 145
    :try_start_14
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_1
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    goto :goto_13

    :cond_23
    move-object/from16 v12, v17

    const/4 v3, 0x1

    .line 146
    :try_start_15
    iput-boolean v3, v1, Lcom/github/snowdream/android/app/downloader/a;->y:Z

    .line 147
    :goto_13
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRes_actual_size()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 148
    iget-boolean v3, v1, Lcom/github/snowdream/android/app/downloader/a;->x:Z
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_8
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    if-eqz v3, :cond_24

    :try_start_16
    iget-boolean v3, v1, Lcom/github/snowdream/android/app/downloader/a;->y:Z
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_1
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    if-eqz v3, :cond_24

    const/4 v4, 0x1

    goto :goto_14

    :cond_24
    const/4 v4, 0x0

    :goto_14
    :try_start_17
    iput-boolean v4, v1, Lcom/github/snowdream/android/app/downloader/a;->f:Z

    if-eqz v4, :cond_29

    .line 149
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "readFileSize22222: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "----readResSize:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 150
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    add-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSize(J)V

    .line 151
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    add-long/2addr v5, v7

    long-to-float v5, v5

    const/high16 v6, 0x3f800000    # 1.0f

    mul-float v5, v5, v6

    const/high16 v6, 0x44800000    # 1024.0f

    div-float/2addr v5, v6

    div-float/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setShowSize(Ljava/lang/String;)V

    .line 152
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setShowSize:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowSize()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "curResSize:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "curFileSize:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "currentTotal:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    add-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "totalFile:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    add-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 153
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v3

    if-eqz v3, :cond_25

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_25

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v3
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_8
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    const/4 v4, 0x3

    if-ne v3, v4, :cond_26

    goto :goto_15

    :cond_25
    const/4 v4, 0x3

    .line 154
    :goto_15
    :try_start_18
    invoke-virtual/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->f()V

    .line 155
    :cond_26
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v3

    if-eqz v3, :cond_27

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v3

    const/4 v5, 0x2

    if-ne v3, v5, :cond_2a

    .line 156
    :cond_27
    invoke-virtual/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->e()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_7
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    goto :goto_16

    :catch_7
    move-exception v0

    goto :goto_19

    :catch_8
    move-exception v0

    goto :goto_18

    :cond_28
    move/from16 v16, v4

    :cond_29
    const/4 v4, 0x3

    .line 157
    :cond_2a
    :goto_16
    :try_start_19
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_2b

    .line 158
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v3, 0x0

    .line 159
    iput-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    .line 160
    :cond_2b
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_2c

    .line 161
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v3, 0x0

    .line 162
    iput-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    .line 163
    :cond_2c
    iget-boolean v3, v1, Lcom/github/snowdream/android/app/downloader/a;->f:Z

    if-nez v3, :cond_2f

    const-wide/16 v5, 0x4b0

    .line 164
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_a

    :goto_17
    add-int/lit8 v3, v16, -0x1

    goto :goto_1b

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_1c

    :catch_9
    move-exception v0

    move/from16 v16, v4

    :goto_18
    const/4 v4, 0x3

    :goto_19
    move-object v3, v0

    .line 165
    :goto_1a
    :try_start_1a
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V

    .line 166
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    .line 167
    :try_start_1b
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_2d

    .line 168
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v3, 0x0

    .line 169
    iput-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    .line 170
    :cond_2d
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_2e

    .line 171
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v3, 0x0

    .line 172
    iput-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    .line 173
    :cond_2e
    iget-boolean v3, v1, Lcom/github/snowdream/android/app/downloader/a;->f:Z

    if-nez v3, :cond_2f

    const-wide/16 v5, 0x4b0

    .line 174
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_a

    goto :goto_17

    :catch_a
    move-exception v0

    move-object v3, v0

    .line 175
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2f
    move/from16 v3, v16

    :goto_1b
    move v4, v3

    goto/16 :goto_0

    .line 176
    :goto_1c
    :try_start_1c
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_30

    .line 177
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v3, 0x0

    .line 178
    iput-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->n:Ljava/net/HttpURLConnection;

    .line 179
    :cond_30
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_31

    .line 180
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v3, 0x0

    .line 181
    iput-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->m:Ljava/net/HttpURLConnection;

    .line 182
    :cond_31
    iget-boolean v3, v1, Lcom/github/snowdream/android/app/downloader/a;->f:Z

    if-nez v3, :cond_32

    const-wide/16 v3, 0x4b0

    .line 183
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_b

    goto :goto_1d

    :catch_b
    move-exception v0

    move-object v3, v0

    .line 184
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 185
    :cond_32
    :goto_1d
    throw v2

    :cond_33
    move/from16 v16, v4

    .line 186
    iget-boolean v2, v1, Lcom/github/snowdream/android/app/downloader/a;->f:Z

    if-nez v2, :cond_34

    if-gtz v16, :cond_34

    .line 187
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V

    :cond_34
    return-void
.end method

.method private o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDuration()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDuration(J)V

    .line 2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p2

    const/4 p3, 0x5

    if-ne p2, p3, :cond_0

    const-wide/16 p2, 0x64

    invoke-virtual {p1, p2, p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 3
    :cond_0
    :try_start_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lp1/b;->update(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private p(Lcom/github/snowdream/android/app/downloader/DownloadTask;JI)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDuration()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDuration(J)V

    .line 2
    invoke-virtual {p1, p4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setInterrupt(I)V

    .line 3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p2

    const/4 p3, 0x5

    if-ne p2, p3, :cond_0

    const-wide/16 p2, 0x64

    invoke-virtual {p1, p2, p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 4
    :cond_0
    :try_start_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lp1/b;->update(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method e()V
    .locals 25

    move-object/from16 v1, p0

    const-string v2, "GET"

    const-string v3, "Keep-Alive"

    const-string v4, "Connection"

    const-string v5, "   range="

    const-string v6, "   task.getSize()="

    .line 1
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v7, :cond_45

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto/16 :goto_30

    :cond_0
    const/4 v7, 0x3

    .line 2
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v8

    .line 3
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    :goto_0
    if-lez v7, :cond_44

    .line 4
    :try_start_0
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v9

    .line 5
    iget-object v10, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMimeType()Ljava/lang/String;

    move-result-object v10

    .line 6
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v12, "tryCount="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v11}, Lcom/github/snowdream/android/app/downloader/a;->m(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v11

    if-nez v11, :cond_43

    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v11}, Lcom/github/snowdream/android/app/downloader/a;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v11

    if-eqz v11, :cond_1

    goto/16 :goto_2a

    .line 8
    :cond_1
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v12

    invoke-virtual {v11, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v12, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v11, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_13
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v15, v7

    move-object/from16 v16, v8

    const-wide/16 v7, 0x0

    cmp-long v17, v11, v13

    if-lez v17, :cond_3

    .line 10
    :try_start_1
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v11

    if-eqz v11, :cond_2

    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-static {v11}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 11
    :cond_2
    iput-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    .line 12
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v12, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v11, v12, v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCurrentSize(J)V

    .line 13
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v12, v7

    invoke-direct {v1, v11, v12, v13}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object/from16 v20, v3

    move-object v8, v4

    move-object v14, v5

    move-object/from16 v21, v6

    move v7, v15

    move-object v15, v2

    goto/16 :goto_2b

    .line 14
    :cond_3
    :goto_1
    :try_start_2
    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_12
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v11, 0x5

    const/16 v12, 0x1f

    const-wide/16 v13, 0x0

    cmp-long v19, v7, v13

    if-lez v19, :cond_5

    :try_start_3
    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    cmp-long v19, v7, v13

    if-nez v19, :cond_5

    .line 15
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, "The DownloadTask has already been downloaded.2"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v8, v13

    invoke-direct {v1, v7, v8, v9}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 17
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v7

    new-instance v8, Lcom/join/mgps/event/l;

    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    invoke-direct {v8, v9, v12}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v7, v8}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 18
    sget-object v7, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v7, v8, v11}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 19
    sget-boolean v7, Lcom/MApplication;->C1:Z

    if-eqz v7, :cond_4

    .line 20
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v7

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/join/android/app/common/servcie/i;->k(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 21
    :cond_4
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    return-void

    .line 22
    :cond_5
    :try_start_4
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v7

    .line 23
    new-instance v8, Ljava/net/URL;

    invoke-direct {v8, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 24
    iget-object v13, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v13}, Lcom/github/snowdream/android/app/downloader/a;->m(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v13

    if-nez v13, :cond_42

    iget-object v13, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v13}, Lcom/github/snowdream/android/app/downloader/a;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v13

    if-eqz v13, :cond_6

    goto/16 :goto_27

    .line 25
    :cond_6
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v13

    new-instance v14, Lcom/join/mgps/event/l;

    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v12, 0x16

    invoke-direct {v14, v11, v12}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v13, v14}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 26
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v8

    check-cast v8, Ljava/net/HttpURLConnection;

    iput-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    const/16 v11, 0x1388

    .line 27
    invoke-virtual {v8, v11}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 28
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    const/16 v12, 0x2710

    invoke-virtual {v8, v12}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 29
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v8, v4, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v8, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 31
    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_12
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v8, "Range"

    const-string v12, "set connection property:range="

    const-wide/16 v17, 0x0

    cmp-long v21, v13, v17

    if-lez v21, :cond_7

    .line 32
    :try_start_5
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v21, v12

    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v13, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "bytes="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move v13, v15

    :try_start_6
    iget-wide v14, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v12, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v14, "-"

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v8, v12}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    move v13, v15

    :goto_2
    move-object v15, v2

    move-object/from16 v20, v3

    move-object v8, v4

    move-object v14, v5

    move-object/from16 v21, v6

    :goto_3
    move v7, v13

    goto/16 :goto_2b

    :cond_7
    move-object/from16 v21, v12

    move v13, v15

    .line 34
    :goto_4
    :try_start_7
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v11

    .line 35
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "HTTP STATUS CODE: "

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_11
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v12, ""

    const/16 v14, 0xc8

    if-eq v11, v14, :cond_e

    const/16 v15, 0xce

    if-eq v11, v15, :cond_e

    packed-switch v11, :pswitch_data_0

    move-object v15, v2

    move-object/from16 v20, v3

    move-object v8, v4

    move-object v14, v5

    move-object/from16 v21, v6

    const/4 v2, 0x0

    :goto_5
    const/4 v3, 0x0

    goto/16 :goto_d

    .line 36
    :pswitch_0
    :try_start_8
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    const-string v11, "Location"

    invoke-virtual {v7, v11}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 37
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    const-string v15, "Set-Cookie"

    invoke-virtual {v11, v15}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_11
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 38
    :try_start_9
    iget-object v15, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v15}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_6

    :catch_3
    move-exception v0

    move-object v15, v0

    .line 39
    :try_start_a
    invoke-virtual {v15}, Ljava/lang/Exception;->printStackTrace()V

    .line 40
    :goto_6
    new-instance v15, Ljava/net/URL;

    invoke-direct {v15, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 41
    invoke-virtual {v15}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v15

    check-cast v15, Ljava/net/HttpURLConnection;

    iput-object v15, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    const/16 v14, 0x1388

    .line 42
    invoke-virtual {v15, v14}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 43
    iget-object v14, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    const/16 v15, 0x2710

    invoke-virtual {v14, v15}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 44
    iget-object v14, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v14, v4, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_11
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-eqz v11, :cond_8

    if-eq v11, v12, :cond_8

    .line 45
    :try_start_b
    iget-object v14, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    const-string v15, "Cookie"

    invoke-virtual {v14, v15, v11}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 46
    :cond_8
    :try_start_c
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v11, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 47
    iget-wide v14, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_11
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    const-wide/16 v17, 0x0

    cmp-long v11, v14, v17

    if-lez v11, :cond_9

    .line 48
    :try_start_d
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v14, v21

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v14, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v11, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    iget-object v11, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "bytes="

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-object v15, v2

    move-object/from16 v20, v3

    :try_start_e
    iget-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v14, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v8, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    goto :goto_9

    :catch_4
    move-exception v0

    goto :goto_7

    :catch_5
    move-exception v0

    move-object v15, v2

    move-object/from16 v20, v3

    :goto_7
    move-object v2, v0

    move-object v8, v4

    move-object v14, v5

    :goto_8
    move-object/from16 v21, v6

    goto/16 :goto_29

    :cond_9
    move-object v15, v2

    move-object/from16 v20, v3

    .line 50
    :goto_9
    :try_start_f
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Redirect Url : "

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_d

    if-ne v2, v3, :cond_b

    .line 52
    iget-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    move-object v8, v4

    move-object v14, v5

    const-wide/16 v4, 0x0

    cmp-long v11, v2, v4

    if-lez v11, :cond_c

    .line 53
    :try_start_10
    iput-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    .line 54
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    if-eqz v2, :cond_a

    :try_start_11
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_6
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    goto :goto_a

    :catch_6
    move-exception v0

    move-object v2, v0

    goto :goto_8

    .line 55
    :cond_a
    :goto_a
    :try_start_12
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCurrentSize(J)V

    .line 56
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    move-object/from16 v21, v6

    :try_start_13
    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    invoke-direct {v1, v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    goto :goto_b

    :catch_7
    move-exception v0

    goto/16 :goto_26

    :cond_b
    move-object v8, v4

    move-object v14, v5

    :cond_c
    move-object/from16 v21, v6

    :goto_b
    const/4 v2, 0x1

    goto :goto_c

    :cond_d
    move-object v8, v4

    move-object v14, v5

    move-object/from16 v21, v6

    const/4 v2, 0x1

    goto/16 :goto_5

    :catch_8
    move-exception v0

    goto/16 :goto_25

    :cond_e
    move-object v15, v2

    move-object/from16 v20, v3

    move-object v8, v4

    move-object v14, v5

    move-object/from16 v21, v6

    .line 57
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    const-string v3, "Transfer-Encoding"

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_f

    const-string v3, "chunked"

    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    :cond_f
    const/16 v2, 0xc8

    if-ne v11, v2, :cond_11

    .line 60
    iget-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_11

    .line 61
    iput-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    .line 62
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 63
    :cond_10
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCurrentSize(J)V

    .line 64
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    invoke-direct {v1, v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    :cond_11
    const/4 v2, 0x0

    :goto_c
    const/4 v3, 0x1

    :goto_d
    if-nez v2, :cond_12

    if-nez v3, :cond_12

    .line 65
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_10
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 66
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    return-void

    .line 67
    :cond_12
    :try_start_14
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/papa/sim/statistic/o;->p0(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    const-string v3, "Content-Type"

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 69
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_13

    move-object v2, v12

    .line 70
    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v3, "application/octet-stream"

    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    const-string v3, "application/vnd.android.package-archive"

    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    const-string v3, "application/zip"

    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    const-string v3, "audio/x-mod"

    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 75
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getActual_size()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_10
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    cmp-long v11, v3, v5

    if-nez v11, :cond_14

    goto :goto_f

    .line 76
    :cond_14
    :try_start_15
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "contentTypeConnection error. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_9
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    goto :goto_e

    :catch_9
    move-exception v0

    move-object v2, v0

    .line 78
    :try_start_16
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 79
    :goto_e
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_10
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    .line 80
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    return-void

    .line 81
    :cond_15
    :goto_f
    :try_start_17
    iget-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    const/16 v4, 0x2d

    const-wide/16 v5, 0x0

    cmp-long v11, v2, v5

    if-nez v11, :cond_25

    .line 82
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v2

    if-eq v10, v2, :cond_16

    .line 83
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v2

    .line 84
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setMimeType(Ljava/lang/String;)V

    .line 85
    :cond_16
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 86
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    const-string v3, "Content-Disposition"

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_18

    const-string v3, "filename="

    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3b

    .line 88
    invoke-virtual {v2, v5, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    add-int/lit8 v3, v3, 0x9

    if-lez v5, :cond_17

    goto :goto_10

    .line 89
    :cond_17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    :goto_10
    invoke-virtual {v2, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\""

    .line 90
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_19

    const-string v3, "\""

    .line 91
    invoke-virtual {v2, v3, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    goto :goto_11

    :cond_18
    const-string v2, "/"

    .line 92
    invoke-virtual {v7, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    .line 93
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v3

    .line 94
    invoke-virtual {v7, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 95
    :cond_19
    :goto_11
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1a

    const-string v3, "nt"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1b

    :cond_1a
    const-string v2, "/"

    .line 96
    invoke-virtual {v7, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    .line 97
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v3

    .line 98
    invoke-virtual {v7, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 99
    :cond_1b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v5, 0x32

    if-le v3, v5, :cond_1d

    const-string v3, "?"

    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1c

    const-string v3, "?"

    .line 101
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_12

    :cond_1c
    const/4 v3, 0x0

    .line 102
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_1d
    :goto_12
    move-object v9, v2

    .line 103
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setName(Ljava/lang/String;)V

    .line 104
    :cond_1e
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_23

    .line 105
    sget-object v2, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_1f

    goto :goto_13

    .line 106
    :cond_1f
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/github/snowdream/android/app/downloader/a;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/roms/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_14

    .line 107
    :cond_20
    :goto_13
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/github/snowdream/android/app/downloader/a;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "apk/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_10
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    .line 108
    :goto_14
    :try_start_18
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    .line 109
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    .line 110
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_21

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v3

    if-nez v3, :cond_21

    .line 111
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/event/l;

    iget-object v5, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v6, 0x20

    invoke-direct {v4, v5, v6}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v3, v4}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 112
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_a
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    .line 113
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    return-void

    .line 114
    :cond_21
    :try_start_19
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_22

    .line 115
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 116
    :cond_22
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPath(Ljava/lang/String;)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_a
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    move-object/from16 v16, v2

    goto :goto_15

    :catch_a
    move-exception v0

    move-object/from16 v16, v2

    goto/16 :goto_3

    .line 117
    :cond_23
    :goto_15
    :try_start_1a
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStartTime(J)V

    .line 118
    iget-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    iget-object v5, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v5

    cmp-long v7, v2, v5

    if-nez v7, :cond_25

    .line 119
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    invoke-direct {v1, v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 120
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x1f

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 121
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v4, 0x5

    invoke-static {v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 122
    sget-boolean v2, Lcom/MApplication;->C1:Z

    if-eqz v2, :cond_24

    .line 123
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/servcie/i;->k(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_10
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    .line 124
    :cond_24
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    return-void

    .line 125
    :cond_25
    :try_start_1b
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    .line 126
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_26

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-nez v2, :cond_26

    .line 127
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x20

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 128
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_10
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    .line 129
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    return-void

    .line 130
    :cond_26
    :try_start_1c
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v9, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v5, v9

    invoke-direct {v1, v2, v5, v6}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_10
    .catchall {:try_start_1c .. :try_end_1c} :catchall_0

    .line 131
    :try_start_1d
    new-instance v2, Ljava/io/RandomAccessFile;

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    const-string v5, "rw"

    invoke-direct {v2, v3, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->l:Ljava/io/RandomAccessFile;

    .line 132
    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v2, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V
    :try_end_1d
    .catch Ljava/io/FileNotFoundException; {:try_start_1d .. :try_end_1d} :catch_b
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_10
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    goto :goto_16

    :catch_b
    move-exception v0

    move-object v2, v0

    .line 133
    :try_start_1e
    invoke-virtual {v2}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 134
    invoke-virtual {v2}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "EISDIR"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_28

    .line 135
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_27

    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_27

    .line 136
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    const-wide/16 v2, 0x0

    .line 137
    iput-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    .line 138
    :cond_27
    new-instance v2, Ljava/io/RandomAccessFile;

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    const-string v5, "rw"

    invoke-direct {v2, v3, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->l:Ljava/io/RandomAccessFile;

    .line 139
    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v2, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 140
    :cond_28
    :goto_16
    new-instance v2, Ljava/io/BufferedInputStream;

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->o:Ljava/net/HttpURLConnection;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->k:Ljava/io/InputStream;

    .line 141
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v5, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v6, 0x14

    invoke-direct {v3, v5, v6}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 142
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v5, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v7, 0x17

    invoke-direct {v3, v5, v7}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    const/16 v2, 0x1000

    const/16 v3, 0x1000

    new-array v3, v3, [B

    .line 143
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    .line 144
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v5

    new-instance v7, Lcom/join/mgps/event/l;

    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v10, 0x18

    invoke-direct {v7, v9, v10}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v5, v7}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 145
    iget-object v5, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v5}, Lcom/github/snowdream/android/app/downloader/a;->m(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v5

    if-nez v5, :cond_41

    iget-object v5, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v5}, Lcom/github/snowdream/android/app/downloader/a;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v5

    if-eqz v5, :cond_29

    goto/16 :goto_24

    :cond_29
    const-wide/16 v9, -0x1

    .line 146
    :goto_17
    iget-object v5, v1, Lcom/github/snowdream/android/app/downloader/a;->k:Ljava/io/InputStream;

    const/4 v7, 0x0

    invoke-virtual {v5, v3, v7, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-lez v5, :cond_32

    .line 147
    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    const-wide/16 v17, 0x0

    cmp-long v22, v6, v17

    if-nez v22, :cond_2a

    const/4 v6, 0x1

    iput-boolean v6, v1, Lcom/github/snowdream/android/app/downloader/a;->g:Z

    .line 148
    :cond_2a
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->l:Ljava/io/RandomAccessFile;

    const/4 v7, 0x0

    invoke-virtual {v6, v3, v7, v5}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 149
    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    int-to-long v4, v5

    add-long/2addr v6, v4

    iput-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    .line 150
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v11

    const-wide/16 v6, 0x0

    cmp-long v23, v4, v6

    if-gez v23, :cond_2b

    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    :cond_2b
    const-wide/16 v6, 0x3e8

    cmp-long v23, v4, v6

    if-lez v23, :cond_2f

    .line 152
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "The Downloading "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    move-object/from16 v23, v3

    iget-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    add-long/2addr v6, v2

    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v2

    sub-long/2addr v6, v2

    const-wide/16 v2, 0x0

    cmp-long v24, v6, v2

    if-lez v24, :cond_2e

    .line 154
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    add-long/2addr v11, v6

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v6

    sub-long/2addr v11, v6

    const-wide/16 v6, 0x3e8

    mul-long v11, v11, v6

    div-long/2addr v11, v4

    invoke-static {v11, v12}, Lcom/join/mgps/Util/UtilsMy;->c(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSpeed(Ljava/lang/String;)V

    .line 155
    iget-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2c

    .line 156
    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    add-long/2addr v4, v6

    const-wide/16 v6, 0x64

    mul-long v4, v4, v6

    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    add-long/2addr v2, v6

    div-long v9, v4, v2

    :cond_2c
    const-wide/16 v2, 0x1

    cmp-long v4, v9, v2

    if-gez v4, :cond_2d

    const-wide/16 v9, 0x1

    .line 157
    :cond_2d
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v9, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 158
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    add-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCurrentSize(J)V

    .line 159
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    goto :goto_18

    .line 160
    :cond_2e
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    add-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCurrentSize(J)V

    .line 161
    :goto_18
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v4, 0x8

    invoke-static {v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 162
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x21

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    goto :goto_19

    :cond_2f
    move-object/from16 v23, v3

    .line 163
    :goto_19
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v2}, Lcom/github/snowdream/android/app/downloader/a;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_30

    goto :goto_1a

    .line 164
    :cond_30
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v2}, Lcom/github/snowdream/android/app/downloader/a;->m(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_31

    .line 165
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-string v3, "0"

    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSpeed(Ljava/lang/String;)V

    .line 166
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v4, 0x8

    invoke-static {v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 167
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x21

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    const/4 v2, 0x0

    goto :goto_1b

    :cond_31
    move-object/from16 v3, v23

    const/16 v2, 0x1000

    const/16 v4, 0x2d

    const/16 v6, 0x14

    goto/16 :goto_17

    :cond_32
    :goto_1a
    const/4 v2, 0x1

    .line 168
    :goto_1b
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    if-nez v2, :cond_34

    .line 169
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const/4 v3, 0x7

    if-eq v2, v3, :cond_33

    .line 170
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    const/4 v5, 0x1

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/github/snowdream/android/app/downloader/a;->b(Lcom/github/snowdream/android/app/downloader/DownloadTask;JI)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_10
    .catchall {:try_start_1e .. :try_end_1e} :catchall_0

    .line 171
    :cond_33
    :goto_1c
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    goto/16 :goto_2f

    .line 172
    :cond_34
    :try_start_1f
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    .line 173
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "range: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 174
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-static {v2}, Lcom/join/mgps/Util/x0;->c(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    .line 175
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->w:Ljava/lang/String;

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_36

    .line 176
    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->w:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_10
    .catchall {:try_start_1f .. :try_end_1f} :catchall_0

    if-eqz v3, :cond_35

    .line 177
    :try_start_20
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->downlooadmd5Complete:Lcom/papa/sim/statistic/Event;

    new-instance v4, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v4}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v5, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_c
    .catchall {:try_start_20 .. :try_end_20} :catchall_0

    goto/16 :goto_1f

    :catch_c
    move-exception v0

    move-object v2, v0

    .line 178
    :try_start_21
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_10
    .catchall {:try_start_21 .. :try_end_21} :catchall_0

    goto/16 :goto_1f

    .line 179
    :cond_35
    :try_start_22
    sget-object v3, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->downlooadmd5Incomplete:Lcom/papa/sim/statistic/Event;

    new-instance v5, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v5}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_d
    .catchall {:try_start_22 .. :try_end_22} :catchall_0

    goto :goto_1d

    :catch_d
    move-exception v0

    move-object v3, v0

    .line 180
    :try_start_23
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 181
    :goto_1d
    new-instance v3, Lcom/join/mgps/dto/GameMd5Data;

    invoke-direct {v3}, Lcom/join/mgps/dto/GameMd5Data;-><init>()V

    .line 182
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/GameMd5Data;->setGameId(Ljava/lang/String;)V

    .line 183
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->w:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/GameMd5Data;->setServerGameFileMd5(Ljava/lang/String;)V

    .line 184
    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/GameMd5Data;->setAppGameFileMd5(Ljava/lang/String;)V

    .line 185
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/GameMd5Data;->setGameDownLoadUrl(Ljava/lang/String;)V

    .line 186
    invoke-direct {v1, v3}, Lcom/github/snowdream/android/app/downloader/a;->k(Lcom/join/mgps/dto/GameMd5Data;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "retry"

    .line 187
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_10
    .catchall {:try_start_23 .. :try_end_23} :catchall_0

    if-eqz v2, :cond_37

    add-int/lit8 v7, v13, -0x1

    if-lez v7, :cond_38

    const-wide/16 v2, 0x0

    .line 188
    :try_start_24
    iput-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    .line 189
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    .line 190
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 191
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-wide/16 v3, 0x1

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 192
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCurrentSize(J)V

    .line 193
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    invoke-direct {v1, v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 194
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x14

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 195
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x2d

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    const-wide/16 v2, 0xfa0

    .line 196
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_f
    .catchall {:try_start_24 .. :try_end_24} :catchall_0

    goto/16 :goto_23

    .line 197
    :cond_36
    :try_start_25
    sget-object v3, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->Md5FailureAchieve:Lcom/papa/sim/statistic/Event;

    new-instance v5, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v5}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_e
    .catchall {:try_start_25 .. :try_end_25} :catchall_0

    goto :goto_1e

    :catch_e
    move-exception v0

    move-object v3, v0

    .line 198
    :try_start_26
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 199
    :goto_1e
    new-instance v3, Lcom/join/mgps/dto/GameMd5Data;

    invoke-direct {v3}, Lcom/join/mgps/dto/GameMd5Data;-><init>()V

    .line 200
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/GameMd5Data;->setGameId(Ljava/lang/String;)V

    .line 201
    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->w:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/GameMd5Data;->setServerGameFileMd5(Ljava/lang/String;)V

    .line 202
    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/GameMd5Data;->setAppGameFileMd5(Ljava/lang/String;)V

    .line 203
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/GameMd5Data;->setGameDownLoadUrl(Ljava/lang/String;)V

    .line 204
    invoke-direct {v1, v3}, Lcom/github/snowdream/android/app/downloader/a;->k(Lcom/join/mgps/dto/GameMd5Data;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "retry"

    .line 205
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_10
    .catchall {:try_start_26 .. :try_end_26} :catchall_0

    if-eqz v2, :cond_37

    add-int/lit8 v7, v13, -0x1

    if-lez v7, :cond_38

    const-wide/16 v2, 0x0

    .line 206
    :try_start_27
    iput-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    .line 207
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    .line 208
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 209
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCurrentSize(J)V

    .line 210
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    invoke-direct {v1, v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 211
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-wide/16 v3, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 212
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x14

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 213
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x2d

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    const-wide/16 v2, 0xfa0

    .line 214
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    goto/16 :goto_23

    :cond_37
    :goto_1f
    move v7, v13

    .line 215
    :cond_38
    iget-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3d

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_3d

    .line 216
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFinishTime(J)V

    .line 217
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRes_currentSize()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    add-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCurrentSize(J)V

    .line 218
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v4, 0x8

    invoke-static {v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 219
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x21

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 220
    iget-boolean v2, v1, Lcom/github/snowdream/android/app/downloader/a;->g:Z

    if-eqz v2, :cond_3a

    .line 221
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/github/snowdream/android/app/downloader/a;->p(Lcom/github/snowdream/android/app/downloader/DownloadTask;JI)V

    .line 222
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/join/mgps/enums/Dtype;->apk:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_39

    .line 223
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x24

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    goto :goto_20

    .line 224
    :cond_39
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x1f

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 225
    :goto_20
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v4, 0x5

    invoke-static {v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 226
    sget-boolean v2, Lcom/MApplication;->C1:Z

    if-eqz v2, :cond_3c

    .line 227
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/servcie/i;->k(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    goto :goto_22

    .line 228
    :cond_3a
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    const/4 v5, 0x1

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/github/snowdream/android/app/downloader/a;->p(Lcom/github/snowdream/android/app/downloader/DownloadTask;JI)V

    .line 229
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/join/mgps/enums/Dtype;->apk:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3b

    .line 230
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x24

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    goto :goto_21

    .line 231
    :cond_3b
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x1f

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 232
    :goto_21
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v4, 0x5

    invoke-static {v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 233
    sget-boolean v2, Lcom/MApplication;->C1:Z

    if-eqz v2, :cond_3c

    .line 234
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    iget-object v3, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/servcie/i;->k(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 235
    :cond_3c
    :goto_22
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    goto/16 :goto_1c

    .line 236
    :cond_3d
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const/4 v3, 0x7

    if-ne v2, v3, :cond_3e

    .line 237
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    goto/16 :goto_1c

    .line 238
    :cond_3e
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3f

    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    iget-wide v4, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_40

    :cond_3f
    add-int/lit8 v7, v7, -0x1

    if-lez v7, :cond_40

    const-wide/16 v2, 0x0

    .line 239
    iput-wide v2, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    .line 240
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->q:Ljava/io/File;

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 241
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-wide/16 v3, 0x1

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 242
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v3, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCurrentSize(J)V

    .line 243
    iget-object v2, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v3, v5

    invoke-direct {v1, v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 244
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v5, 0x14

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 245
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_f
    .catchall {:try_start_27 .. :try_end_27} :catchall_0

    :goto_23
    add-int/lit8 v7, v7, -0x1

    .line 246
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    goto :goto_2d

    .line 247
    :cond_40
    :try_start_28
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V

    .line 248
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_f
    .catchall {:try_start_28 .. :try_end_28} :catchall_0

    goto/16 :goto_1c

    :catch_f
    move-exception v0

    goto :goto_2b

    .line 249
    :cond_41
    :goto_24
    :try_start_29
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_10
    .catchall {:try_start_29 .. :try_end_29} :catchall_0

    .line 250
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    return-void

    :catch_10
    move-exception v0

    goto :goto_28

    :catch_11
    move-exception v0

    move-object v15, v2

    move-object/from16 v20, v3

    :goto_25
    move-object v8, v4

    move-object v14, v5

    :goto_26
    move-object/from16 v21, v6

    goto :goto_28

    :cond_42
    :goto_27
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    return-void

    :catch_12
    move-exception v0

    move-object/from16 v20, v3

    move-object v8, v4

    move-object v14, v5

    move-object/from16 v21, v6

    move v13, v15

    move-object v15, v2

    :goto_28
    move-object v2, v0

    :goto_29
    move v7, v13

    goto :goto_2c

    :cond_43
    :goto_2a
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_2e

    :catch_13
    move-exception v0

    move-object v15, v2

    move-object/from16 v20, v3

    move-object v14, v5

    move-object/from16 v21, v6

    move v13, v7

    move-object/from16 v16, v8

    move-object v8, v4

    :goto_2b
    move-object v2, v0

    .line 251
    :goto_2c
    :try_start_2a
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V

    .line 252
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_0

    goto :goto_23

    :goto_2d
    move-object v4, v8

    move-object v5, v14

    move-object v2, v15

    move-object/from16 v8, v16

    move-object/from16 v3, v20

    move-object/from16 v6, v21

    goto/16 :goto_0

    .line 253
    :goto_2e
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    .line 254
    throw v2

    .line 255
    :cond_44
    :goto_2f
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->c()V

    :cond_45
    :goto_30
    return-void

    :pswitch_data_0
    .packed-switch 0x12d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method f()V
    .locals 26

    move-object/from16 v1, p0

    const-string v2, "rw"

    const-string v3, "GET"

    const-string v4, "Keep-Alive"

    const-string v5, "Connection"

    .line 1
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v6, :cond_4a

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_url_remote()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_28

    :cond_0
    const/4 v7, 0x3

    :goto_0
    if-lez v7, :cond_49

    .line 2
    :try_start_0
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMimeType()Ljava/lang/String;

    move-result-object v8

    .line 3
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_url_remote()Ljava/lang/String;

    move-result-object v9

    .line 4
    iget-object v10, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isMod()Z

    move-result v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v11, "mod/"

    const-string v12, "/"

    if-nez v10, :cond_2

    :try_start_1
    iget-object v10, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v10}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_2

    .line 5
    :cond_1
    iget-object v10, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v10

    .line 6
    iget-object v13, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v13
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v6, v0

    move/from16 v16, v7

    :goto_1
    const/4 v7, 0x3

    goto/16 :goto_24

    .line 7
    :cond_2
    :goto_2
    :try_start_2
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9}, Lcom/join/mgps/Util/x0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ".mod"

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 8
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v14, Lcom/github/snowdream/android/app/downloader/a;->C:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v14, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 9
    :goto_3
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v14, :cond_3

    .line 10
    :try_start_3
    new-instance v14, Ljava/io/File;

    invoke-direct {v14, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v14, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 11
    :cond_3
    :try_start_4
    new-instance v14, Ljava/net/URL;

    invoke-direct {v14, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 12
    iget-object v15, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v15}, Lcom/github/snowdream/android/app/downloader/a;->m(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v15

    if-nez v15, :cond_48

    iget-object v15, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v15}, Lcom/github/snowdream/android/app/downloader/a;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v15
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v15, :cond_4

    goto/16 :goto_21

    :cond_4
    move/from16 v16, v7

    .line 13
    :try_start_5
    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    move-object/from16 v17, v8

    move-object/from16 v18, v9

    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v19, v11

    move-object/from16 v20, v12

    const-wide/16 v11, 0x0

    cmp-long v21, v6, v8

    if-lez v21, :cond_6

    .line 14
    :try_start_6
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-static {v6}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 15
    :cond_5
    iput-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    .line 16
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6, v11, v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_currentSize(J)V

    .line 17
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v7, v11

    invoke-direct {v1, v6, v7, v8}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_4

    :catch_1
    move-exception v0

    move-object v6, v0

    goto/16 :goto_1

    .line 18
    :cond_6
    :goto_4
    :try_start_7
    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const/4 v11, 0x1

    const-wide/16 v21, 0x0

    cmp-long v12, v6, v21

    if-lez v12, :cond_9

    :try_start_8
    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    cmp-long v23, v6, v8

    if-nez v23, :cond_9

    .line 19
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-wide v9, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v7, v9

    invoke-direct {v1, v6, v7, v8}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 20
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v6

    if-eq v6, v11, :cond_7

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v6

    const/4 v7, 0x3

    if-ne v6, v7, :cond_8

    .line 21
    :cond_7
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v6

    new-instance v7, Lcom/join/mgps/event/l;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v9, 0x1f

    invoke-direct {v7, v8, v9}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 22
    sget-object v6, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v8, 0x5

    invoke-static {v6, v7, v8}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 23
    sget-boolean v6, Lcom/MApplication;->C1:Z

    if-eqz v6, :cond_8

    .line 24
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v6

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/join/android/app/common/servcie/i;->k(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 25
    :cond_8
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    .line 26
    :cond_9
    :try_start_9
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v6}, Lcom/github/snowdream/android/app/downloader/a;->m(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v6

    if-nez v6, :cond_47

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v6}, Lcom/github/snowdream/android/app/downloader/a;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto/16 :goto_20

    .line 27
    :cond_a
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v6

    new-instance v7, Lcom/join/mgps/event/l;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v9, 0x16

    invoke-direct {v7, v8, v9}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 28
    invoke-virtual {v14}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v6

    check-cast v6, Ljava/net/HttpURLConnection;

    iput-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const/16 v7, 0x1388

    .line 29
    invoke-virtual {v6, v7}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 30
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const/16 v8, 0x2710

    invoke-virtual {v6, v8}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 31
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v6, v5, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v6, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    move-object v9, v13

    .line 33
    iget-wide v12, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    const-string v14, "-"

    const-string v6, "bytes="

    const-string v15, "Range"

    const-string v11, "set connection property:range="

    const-wide/16 v21, 0x0

    cmp-long v24, v12, v21

    if-lez v24, :cond_b

    .line 34
    :try_start_a
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v24, v9

    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v12, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 35
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v25, v8

    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, v25

    invoke-virtual {v8, v15, v7}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_5

    :cond_b
    move-object/from16 v24, v9

    .line 36
    :goto_5
    :try_start_b
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v7

    .line 37
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "HTTP STATUS CODE: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    const-string v8, ""

    const/16 v9, 0xc8

    if-eq v7, v9, :cond_13

    const/16 v13, 0xce

    if-eq v7, v13, :cond_13

    packed-switch v7, :pswitch_data_0

    move-object/from16 v9, v18

    const/4 v6, 0x0

    :goto_6
    const/4 v12, 0x0

    goto/16 :goto_9

    .line 38
    :pswitch_0
    :try_start_c
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const-string v13, "Location"

    invoke-virtual {v7, v13}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 39
    iget-object v13, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const-string v12, "Set-Cookie"

    invoke-virtual {v13, v12}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 40
    :try_start_d
    iget-object v13, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v13}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_2
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_7

    :catch_2
    move-exception v0

    move-object v13, v0

    .line 41
    :try_start_e
    invoke-virtual {v13}, Ljava/lang/Exception;->printStackTrace()V

    .line 42
    :goto_7
    new-instance v13, Ljava/net/URL;

    invoke-direct {v13, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v13}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v13

    check-cast v13, Ljava/net/HttpURLConnection;

    iput-object v13, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const/16 v9, 0x1388

    .line 44
    invoke-virtual {v13, v9}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 45
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const/16 v13, 0x2710

    invoke-virtual {v9, v13}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 46
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v9, v5, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v12, :cond_c

    if-eq v12, v8, :cond_c

    .line 47
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const-string v13, "Cookie"

    invoke-virtual {v9, v13, v12}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    :cond_c
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v9, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 49
    iget-wide v12, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    const-wide/16 v21, 0x0

    cmp-long v9, v12, v21

    if-lez v9, :cond_d

    .line 50
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v9, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 51
    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v12, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v11, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v15, v6}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :cond_d
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v6

    const/16 v9, 0xc8

    if-ne v6, v9, :cond_f

    .line 53
    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    const-wide/16 v13, 0x0

    cmp-long v6, v11, v13

    if-lez v6, :cond_f

    .line 54
    iput-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    .line 55
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_e

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-static {v6}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 56
    :cond_e
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v6, v11, v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_currentSize(J)V

    .line 57
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v11, v13

    invoke-direct {v1, v6, v11, v12}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 58
    :cond_f
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v6

    .line 59
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Redirect Url : "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0xc8

    if-ne v6, v9, :cond_12

    if-ne v6, v9, :cond_11

    .line 60
    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    const-wide/16 v13, 0x0

    cmp-long v6, v11, v13

    if-lez v6, :cond_11

    .line 61
    iput-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    .line 62
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    if-eqz v6, :cond_10

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_10

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-static {v6}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 63
    :cond_10
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v6, v11, v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_currentSize(J)V

    .line 64
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v11, v13

    invoke-direct {v1, v6, v11, v12}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :cond_11
    move-object v9, v7

    const/4 v6, 0x1

    goto :goto_8

    :cond_12
    move-object v9, v7

    const/4 v6, 0x0

    :goto_8
    const/4 v12, 0x1

    goto :goto_9

    .line 65
    :cond_13
    :try_start_f
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const-string v9, "Transfer-Encoding"

    invoke-virtual {v6, v9}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 66
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    if-nez v9, :cond_14

    :try_start_10
    const-string v9, "chunked"

    .line 67
    invoke-virtual {v6, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    :cond_14
    const/16 v6, 0xc8

    if-ne v7, v6, :cond_16

    .line 68
    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    const-wide/16 v11, 0x0

    cmp-long v9, v6, v11

    if-lez v9, :cond_16

    .line 69
    iput-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    .line 70
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    if-eqz v6, :cond_15

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_15

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-static {v6}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 71
    :cond_15
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v6, v11, v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_currentSize(J)V

    .line 72
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v11, v13

    invoke-direct {v1, v6, v11, v12}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    :cond_16
    move-object/from16 v9, v18

    const/4 v6, 0x1

    goto/16 :goto_6

    :goto_9
    if-nez v12, :cond_17

    if-nez v6, :cond_17

    .line 73
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 74
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    .line 75
    :cond_17
    :try_start_11
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/papa/sim/statistic/o;->p0(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const-string v7, "Content-Type"

    invoke-virtual {v6, v7}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 77
    invoke-static {v6}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_18

    move-object v6, v8

    .line 78
    :cond_18
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    const-string v7, "application/octet-stream"

    .line 79
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_7
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    if-nez v7, :cond_1a

    :try_start_12
    const-string v7, "application/vnd.android.package-archive"

    .line 80
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    const-string v7, "application/zip"

    .line 81
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    const-string v7, "audio/x-mod"

    .line 82
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 83
    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getActual_size()J

    move-result-wide v11

    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_1
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    cmp-long v7, v11, v13

    if-nez v7, :cond_19

    goto :goto_b

    .line 84
    :cond_19
    :try_start_13
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "contentTypeConnection error. "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    goto :goto_a

    :catch_3
    move-exception v0

    move-object v6, v0

    .line 86
    :try_start_14
    invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V

    .line 87
    :goto_a
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_1
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 88
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    .line 89
    :cond_1a
    :goto_b
    :try_start_15
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_7
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    if-eqz v6, :cond_21

    .line 90
    :try_start_16
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    const-string v7, "Content-Disposition"

    invoke-virtual {v6, v7}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1d

    const-string v7, "filename="

    .line 91
    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    const/16 v10, 0x3b

    .line 92
    invoke-virtual {v6, v10, v7}, Ljava/lang/String;->indexOf(II)I

    move-result v10

    add-int/lit8 v7, v7, 0x9

    if-lez v10, :cond_1b

    goto :goto_c

    .line 93
    :cond_1b
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v10

    :goto_c
    invoke-virtual {v6, v7, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "\""

    .line 94
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1c

    const-string v7, "\""

    .line 95
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    :cond_1c
    move-object v7, v6

    move-object/from16 v6, v20

    goto :goto_d

    :cond_1d
    move-object/from16 v6, v20

    .line 96
    invoke-virtual {v9, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    const/4 v10, 0x1

    add-int/2addr v7, v10

    .line 97
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    .line 98
    invoke-virtual {v9, v7, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 99
    :goto_d
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1f

    const-string v8, "nt"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1e

    goto :goto_f

    :cond_1e
    :goto_e
    move-object v10, v7

    goto :goto_10

    .line 100
    :cond_1f
    :goto_f
    invoke-virtual {v9, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    add-int/2addr v7, v8

    .line 101
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v8

    .line 102
    invoke-virtual {v9, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    goto :goto_e

    .line 103
    :goto_10
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v8, 0x32

    if-le v7, v8, :cond_22

    const-string v7, "?"

    .line 104
    invoke-virtual {v10, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_20

    const-string v7, "?"

    .line 105
    invoke-virtual {v10, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x0

    invoke-virtual {v10, v8, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    goto :goto_11

    :cond_20
    const/16 v7, 0x2d

    const/4 v8, 0x0

    .line 106
    invoke-virtual {v10, v8, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_1
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    goto :goto_11

    :cond_21
    move-object/from16 v6, v20

    .line 107
    :cond_22
    :goto_11
    :try_start_17
    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_7
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    const-wide/16 v11, 0x0

    cmp-long v9, v7, v11

    if-nez v9, :cond_2b

    .line 108
    :try_start_18
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, v17

    if-eq v8, v7, :cond_23

    .line 109
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    .line 110
    :cond_23
    invoke-static/range {v24 .. v24}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_28

    .line 111
    sget-object v7, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_25

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v7}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v7

    if-eqz v7, :cond_24

    goto :goto_12

    .line 112
    :cond_24
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/github/snowdream/android/app/downloader/a;->C:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "/roms/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_13

    .line 113
    :cond_25
    :goto_12
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/github/snowdream/android/app/downloader/a;->C:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v8, v19

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 114
    :goto_13
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    .line 115
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    .line 116
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-nez v8, :cond_26

    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    move-result v7

    if-nez v7, :cond_26

    .line 117
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v6

    new-instance v7, Lcom/join/mgps/event/l;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v9, 0x20

    invoke-direct {v7, v8, v9}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 118
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_1
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    .line 119
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    .line 120
    :cond_26
    :try_start_19
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_27

    .line 121
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->createNewFile()Z

    .line 122
    :cond_27
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setResource_path(Ljava/lang/String;)V

    .line 123
    :cond_28
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStartTime(J)V

    .line 124
    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    cmp-long v10, v6, v8

    if-nez v10, :cond_2b

    .line 125
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_currentSize(J)V

    .line 126
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_29

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v6

    const/4 v7, 0x3

    if-ne v6, v7, :cond_2a

    .line 127
    :cond_29
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-wide v9, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v7, v9

    invoke-direct {v1, v6, v7, v8}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 128
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v6

    new-instance v7, Lcom/join/mgps/event/l;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v9, 0x1f

    invoke-direct {v7, v8, v9}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 129
    sget-boolean v6, Lcom/MApplication;->C1:Z

    if-eqz v6, :cond_2a

    .line 130
    sget-object v6, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v8, 0x5

    invoke-static {v6, v7, v8}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 131
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v6

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/join/android/app/common/servcie/i;->k(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_1
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    .line 132
    :cond_2a
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    .line 133
    :cond_2b
    :try_start_1a
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    .line 134
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_7
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    if-nez v8, :cond_2c

    :try_start_1b
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    move-result v7

    if-nez v7, :cond_2c

    .line 135
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v6

    new-instance v7, Lcom/join/mgps/event/l;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v9, 0x20

    invoke-direct {v7, v8, v9}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 136
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_1
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    .line 137
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    .line 138
    :cond_2c
    :try_start_1c
    new-instance v7, Ljava/io/RandomAccessFile;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-direct {v7, v8, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->j:Ljava/io/RandomAccessFile;

    .line 139
    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v7, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V
    :try_end_1c
    .catch Ljava/io/FileNotFoundException; {:try_start_1c .. :try_end_1c} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_1
    .catchall {:try_start_1c .. :try_end_1c} :catchall_0

    goto :goto_14

    :catch_4
    move-exception v0

    move-object v7, v0

    .line 140
    :try_start_1d
    invoke-virtual {v7}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 141
    invoke-virtual {v7}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v7

    const-string v8, "EISDIR"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_7
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    if-eqz v7, :cond_2e

    .line 142
    :try_start_1e
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_2d

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_2d

    .line 143
    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-static {v7}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 144
    :cond_2d
    new-instance v7, Ljava/io/RandomAccessFile;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-direct {v7, v8, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->j:Ljava/io/RandomAccessFile;

    .line 145
    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v7, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_1
    .catchall {:try_start_1e .. :try_end_1e} :catchall_0

    .line 146
    :cond_2e
    :goto_14
    :try_start_1f
    new-instance v7, Ljava/io/BufferedInputStream;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->p:Ljava/net/HttpURLConnection;

    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->i:Ljava/io/InputStream;

    .line 147
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v7

    new-instance v8, Lcom/join/mgps/event/l;

    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v10, 0x14

    invoke-direct {v8, v9, v10}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v7, v8}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 148
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v7

    new-instance v8, Lcom/join/mgps/event/l;

    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v10, 0x17

    invoke-direct {v8, v9, v10}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v7, v8}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    const/16 v7, 0x1000

    const/16 v8, 0x1000

    new-array v8, v8, [B

    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    .line 150
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v13

    new-instance v14, Lcom/join/mgps/event/l;

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v9, 0x18

    invoke-direct {v14, v6, v9}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v13, v14}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 151
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v6}, Lcom/github/snowdream/android/app/downloader/a;->m(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v6

    if-nez v6, :cond_46

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v6}, Lcom/github/snowdream/android/app/downloader/a;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v6

    if-eqz v6, :cond_2f

    goto/16 :goto_1f

    :cond_2f
    const-wide/16 v9, -0x1

    .line 152
    :goto_15
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->i:Ljava/io/InputStream;

    const/4 v13, 0x0

    invoke-virtual {v6, v8, v13, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v6
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_7
    .catchall {:try_start_1f .. :try_end_1f} :catchall_0

    if-lez v6, :cond_3a

    .line 153
    :try_start_20
    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    const-wide/16 v18, 0x0

    cmp-long v20, v13, v18

    if-nez v20, :cond_30

    const/4 v13, 0x1

    iput-boolean v13, v1, Lcom/github/snowdream/android/app/downloader/a;->g:Z

    .line 154
    :cond_30
    iget-object v13, v1, Lcom/github/snowdream/android/app/downloader/a;->j:Ljava/io/RandomAccessFile;

    const/4 v14, 0x0

    invoke-virtual {v13, v8, v14, v6}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 155
    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    move-object/from16 v19, v8

    int-to-long v7, v6

    add-long/2addr v13, v7

    iput-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    .line 156
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v11

    const-wide/16 v13, 0x0

    cmp-long v8, v6, v13

    if-gez v8, :cond_31

    .line 157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    :cond_31
    const-wide/16 v13, 0x3e8

    cmp-long v8, v6, v13

    if-lez v8, :cond_37

    .line 158
    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRes_currentSize()J

    move-result-wide v24

    sub-long v13, v13, v24

    const-wide/16 v20, 0x0

    cmp-long v8, v13, v20

    if-lez v8, :cond_36

    .line 159
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-wide/16 v11, 0x3e8

    iget-wide v13, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRes_currentSize()J

    move-result-wide v24

    sub-long v13, v13, v24

    mul-long v13, v13, v11

    div-long/2addr v13, v6

    invoke-static {v13, v14}, Lcom/join/mgps/Util/UtilsMy;->c(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSpeed(Ljava/lang/String;)V

    .line 160
    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    const-wide/16 v11, 0x0

    cmp-long v8, v6, v11

    if-eqz v8, :cond_34

    .line 161
    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    const-wide/16 v8, 0x64

    mul-long v6, v6, v8

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRes_currentSize()J

    move-result-wide v8

    add-long/2addr v6, v8

    .line 162
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v8

    if-eqz v8, :cond_33

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v8

    const/4 v9, 0x2

    if-ne v8, v9, :cond_32

    goto :goto_16

    .line 163
    :cond_32
    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    goto :goto_17

    .line 164
    :cond_33
    :goto_16
    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    iget-wide v10, v1, Lcom/github/snowdream/android/app/downloader/a;->u:J

    add-long/2addr v8, v10

    .line 165
    :goto_17
    div-long/2addr v6, v8

    .line 166
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "downloadResProgress: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo v11, "totalSize\uff1a"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-wide v9, v6

    :cond_34
    const-wide/16 v6, 0x1

    cmp-long v8, v9, v6

    if-gez v8, :cond_35

    const-wide/16 v6, 0x1

    move-wide v9, v6

    .line 167
    :cond_35
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6, v9, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 168
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v6, v7, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_currentSize(J)V

    .line 169
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->s:J

    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    add-long/2addr v7, v11

    invoke-virtual {v6, v7, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCurrentSize(J)V

    .line 170
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    goto :goto_18

    .line 171
    :cond_36
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v6, v7, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_currentSize(J)V

    .line 172
    :goto_18
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v6

    new-instance v7, Lcom/join/mgps/event/l;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v13, 0x21

    invoke-direct {v7, v8, v13}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 173
    :cond_37
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v6}, Lcom/github/snowdream/android/app/downloader/a;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v6

    if-eqz v6, :cond_38

    goto :goto_19

    .line 174
    :cond_38
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v1, v6}, Lcom/github/snowdream/android/app/downloader/a;->m(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v6

    if-eqz v6, :cond_39

    .line 175
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-string v7, "0"

    invoke-virtual {v6, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSpeed(Ljava/lang/String;)V

    .line 176
    sget-object v6, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v8, 0x8

    invoke-static {v6, v7, v8}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 177
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v6

    new-instance v7, Lcom/join/mgps/event/l;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v9, 0x21

    invoke-direct {v7, v8, v9}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_1
    .catchall {:try_start_20 .. :try_end_20} :catchall_0

    const/4 v6, 0x0

    goto :goto_1a

    :cond_39
    move-object/from16 v8, v19

    const/16 v7, 0x1000

    goto/16 :goto_15

    :cond_3a
    :goto_19
    const/4 v6, 0x1

    .line 178
    :goto_1a
    :try_start_21
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_7
    .catchall {:try_start_21 .. :try_end_21} :catchall_0

    if-nez v6, :cond_3c

    .line 179
    :try_start_22
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v6

    const/4 v7, 0x7

    if-eq v6, v7, :cond_3b

    .line 180
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-wide v9, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v7, v9

    const/4 v9, 0x1

    invoke-direct {v1, v6, v7, v8, v9}, Lcom/github/snowdream/android/app/downloader/a;->b(Lcom/github/snowdream/android/app/downloader/DownloadTask;JI)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_1
    .catchall {:try_start_22 .. :try_end_22} :catchall_0

    .line 181
    :cond_3b
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    goto/16 :goto_27

    .line 182
    :cond_3c
    :try_start_23
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v6

    iput-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    .line 183
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "range: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v7, " size: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 184
    iget-wide v6, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-eqz v10, :cond_41

    iget-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J

    cmp-long v10, v6, v8

    if-nez v10, :cond_41

    .line 185
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFinishTime(J)V

    .line 186
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v7, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v6, v7, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_currentSize(J)V

    .line 187
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v7, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setResource_path(Ljava/lang/String;)V

    .line 188
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_3e

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v6
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_7
    .catchall {:try_start_23 .. :try_end_23} :catchall_0

    const/4 v7, 0x3

    if-ne v6, v7, :cond_3d

    goto :goto_1b

    .line 189
    :cond_3d
    :try_start_24
    sget-object v6, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v9, 0x8

    invoke-static {v6, v8, v9}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 190
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v6

    new-instance v8, Lcom/join/mgps/event/l;

    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v10, 0x21

    invoke-direct {v8, v9, v10}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6, v8}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    goto :goto_1c

    :cond_3e
    const/4 v7, 0x3

    .line 191
    :goto_1b
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-wide v10, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v8, v10

    invoke-direct {v1, v6, v8, v9}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 192
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v6

    new-instance v8, Lcom/join/mgps/event/l;

    iget-object v9, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v10, 0x1f

    invoke-direct {v8, v9, v10}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6, v8}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 193
    sget-object v6, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v9, 0x5

    invoke-static {v6, v8, v9}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 194
    sget-boolean v6, Lcom/MApplication;->C1:Z

    if-eqz v6, :cond_3f

    .line 195
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v6

    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Lcom/join/android/app/common/servcie/i;->k(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 196
    :cond_3f
    :goto_1c
    iget-boolean v6, v1, Lcom/github/snowdream/android/app/downloader/a;->g:Z

    if-eqz v6, :cond_40

    .line 197
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-wide v10, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v8, v10

    const/4 v10, 0x0

    invoke-direct {v1, v6, v8, v9, v10}, Lcom/github/snowdream/android/app/downloader/a;->p(Lcom/github/snowdream/android/app/downloader/DownloadTask;JI)V

    .line 198
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lcom/join/mgps/enums/Dtype;->apk:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_1d

    .line 199
    :cond_40
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-wide v10, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v8, v10

    const/4 v10, 0x1

    invoke-direct {v1, v6, v8, v9, v10}, Lcom/github/snowdream/android/app/downloader/a;->p(Lcom/github/snowdream/android/app/downloader/DownloadTask;JI)V

    .line 200
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lcom/join/mgps/enums/Dtype;->apk:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    :goto_1d
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_6
    .catchall {:try_start_24 .. :try_end_24} :catchall_0

    .line 202
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    :cond_41
    const/4 v7, 0x3

    .line 203
    :try_start_25
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v6

    const/4 v8, 0x7

    if-ne v6, v8, :cond_42

    .line 204
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_6
    .catchall {:try_start_25 .. :try_end_25} :catchall_0

    .line 205
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    .line 206
    :cond_42
    :try_start_26
    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_43

    iget-object v6, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v8

    iget-wide v10, v1, Lcom/github/snowdream/android/app/downloader/a;->v:J
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_6
    .catchall {:try_start_26 .. :try_end_26} :catchall_0

    cmp-long v6, v8, v10

    if-eqz v6, :cond_45

    :cond_43
    add-int/lit8 v6, v16, -0x1

    if-lez v6, :cond_44

    .line 207
    :try_start_27
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->r:Ljava/io/File;

    invoke-static {v8}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    const-wide/16 v8, 0x0

    .line 208
    iput-wide v8, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    .line 209
    iget-object v10, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10, v8, v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 210
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-wide v9, v1, Lcom/github/snowdream/android/app/downloader/a;->t:J

    invoke-virtual {v8, v9, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_currentSize(J)V

    .line 211
    iget-object v8, v1, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iget-wide v11, v1, Lcom/github/snowdream/android/app/downloader/a;->b:J

    sub-long/2addr v9, v11

    invoke-direct {v1, v8, v9, v10}, Lcom/github/snowdream/android/app/downloader/a;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;J)V

    .line 212
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v8

    new-instance v9, Lcom/join/mgps/event/l;

    iget-object v10, v1, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v11, 0x14

    invoke-direct {v9, v10, v11}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v8, v9}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 213
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_5
    .catchall {:try_start_27 .. :try_end_27} :catchall_0

    add-int/lit8 v6, v6, -0x1

    .line 214
    :goto_1e
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    goto :goto_25

    :catch_5
    move-exception v0

    move/from16 v16, v6

    goto :goto_23

    :cond_44
    move/from16 v16, v6

    .line 215
    :cond_45
    :try_start_28
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V

    .line 216
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_6
    .catchall {:try_start_28 .. :try_end_28} :catchall_0

    .line 217
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    :cond_46
    :goto_1f
    const/4 v7, 0x3

    .line 218
    :try_start_29
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_6
    .catchall {:try_start_29 .. :try_end_29} :catchall_0

    .line 219
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    :catch_6
    move-exception v0

    goto :goto_23

    :cond_47
    :goto_20
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    :catch_7
    move-exception v0

    goto :goto_22

    :cond_48
    :goto_21
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_26

    :catch_8
    move-exception v0

    move/from16 v16, v7

    :goto_22
    const/4 v7, 0x3

    :goto_23
    move-object v6, v0

    .line 220
    :goto_24
    :try_start_2a
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V

    .line 221
    invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_0

    add-int/lit8 v6, v16, -0x1

    goto :goto_1e

    :goto_25
    move v7, v6

    goto/16 :goto_0

    .line 222
    :goto_26
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    .line 223
    throw v2

    .line 224
    :cond_49
    :goto_27
    invoke-direct/range {p0 .. p0}, Lcom/github/snowdream/android/app/downloader/a;->d()V

    :cond_4a
    :goto_28
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x12d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/github/snowdream/android/app/downloader/a;->h:Z

    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/snowdream/android/app/downloader/a;->c:Ljava/lang/String;

    return-void
.end method

.method public run()V
    .locals 4

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setPriority(I)V

    const/16 v0, 0x13

    .line 2
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 3
    iget-boolean v0, p0, Lcom/github/snowdream/android/app/downloader/a;->h:Z

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    sget-object v0, Lcom/join/mgps/Util/v;->e:Ljava/lang/String;

    sput-object v0, Lcom/github/snowdream/android/app/downloader/a;->C:Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0}, Lcom/join/android/app/common/utils/o;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 6
    iget-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isValid()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    iget-boolean v0, p0, Lcom/github/snowdream/android/app/downloader/a;->h:Z

    if-eqz v0, :cond_2

    return-void

    .line 8
    :cond_2
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/event/l;

    iget-object v2, p0, Lcom/github/snowdream/android/app/downloader/a;->d:Ljava/lang/String;

    const/16 v3, 0x14

    invoke-direct {v1, v2, v3}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 9
    iget-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, v0}, Lcom/github/snowdream/android/app/downloader/a;->m(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/github/snowdream/android/app/downloader/a;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, v0}, Lcom/github/snowdream/android/app/downloader/a;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 10
    :cond_3
    invoke-direct {p0}, Lcom/github/snowdream/android/app/downloader/a;->n()V

    :cond_4
    :goto_0
    return-void

    .line 11
    :cond_5
    :goto_1
    invoke-direct {p0}, Lcom/github/snowdream/android/app/downloader/a;->a()V

    return-void
.end method
