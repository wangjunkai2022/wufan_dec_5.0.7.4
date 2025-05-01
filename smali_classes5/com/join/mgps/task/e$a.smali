.class Lcom/join/mgps/task/e$a;
.super Ljava/lang/Thread;
.source "UNAndroidZIPThread.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/task/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private b:Z

.field c:Ljava/io/File;

.field d:Ljava/io/File;

.field e:Ljava/io/File;

.field final synthetic f:Lcom/join/mgps/task/e;


# direct methods
.method public constructor <init>(Lcom/join/mgps/task/e;Ljava/io/File;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/task/e$a;->f:Lcom/join/mgps/task/e;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/task/e$a;->b:Z

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/join/mgps/task/e$a;->e:Ljava/io/File;

    .line 4
    iput-object p2, p0, Lcom/join/mgps/task/e$a;->c:Ljava/io/File;

    .line 5
    iput-object p3, p0, Lcom/join/mgps/task/e$a;->e:Ljava/io/File;

    return-void
.end method

.method public constructor <init>(Lcom/join/mgps/task/e;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/join/mgps/task/e$a;->f:Lcom/join/mgps/task/e;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/join/mgps/task/e$a;->b:Z

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/join/mgps/task/e$a;->e:Ljava/io/File;

    .line 9
    iput-object p2, p0, Lcom/join/mgps/task/e$a;->c:Ljava/io/File;

    .line 10
    iput-object p3, p0, Lcom/join/mgps/task/e$a;->d:Ljava/io/File;

    .line 11
    iput-object p4, p0, Lcom/join/mgps/task/e$a;->e:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/task/e$a;->b:Z

    return-void
.end method

.method public run()V
    .locals 10

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v1, 0xa

    .line 3
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x32

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x50

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 5
    :goto_0
    iget-boolean v4, p0, Lcom/join/mgps/task/e$a;->b:Z

    if-eqz v4, :cond_3

    const/4 v4, 0x3

    if-ge v1, v4, :cond_0

    .line 6
    div-int/lit8 v4, v2, 0x3

    :goto_1
    add-int/2addr v3, v4

    goto :goto_2

    :cond_0
    if-lt v1, v4, :cond_1

    const/16 v4, 0xf

    if-ge v1, v4, :cond_1

    sub-int v4, v0, v2

    .line 7
    div-int/lit8 v4, v4, 0xc

    goto :goto_1

    .line 8
    :cond_1
    :goto_2
    iget-object v4, p0, Lcom/join/mgps/task/e$a;->f:Lcom/join/mgps/task/e;

    invoke-static {v4}, Lcom/join/mgps/task/e;->b(Lcom/join/mgps/task/e;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    int-to-long v5, v3

    invoke-virtual {v4, v5, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 9
    iget-object v4, p0, Lcom/join/mgps/task/e$a;->f:Lcom/join/mgps/task/e;

    invoke-static {v4}, Lcom/join/mgps/task/e;->b(Lcom/join/mgps/task/e;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->w4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 10
    iget-object v4, p0, Lcom/join/mgps/task/e$a;->f:Lcom/join/mgps/task/e;

    iget-boolean v4, v4, Lcom/join/mgps/task/e;->e:Z

    if-eqz v4, :cond_2

    .line 11
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v4

    new-instance v5, Lcom/join/mgps/event/x;

    const/4 v6, 0x6

    iget-object v7, p0, Lcom/join/mgps/task/e$a;->f:Lcom/join/mgps/task/e;

    invoke-static {v7}, Lcom/join/mgps/task/e;->b(Lcom/join/mgps/task/e;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/join/mgps/task/e$a;->f:Lcom/join/mgps/task/e;

    invoke-static {v8}, Lcom/join/mgps/task/e;->b(Lcom/join/mgps/task/e;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v8

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v8

    invoke-direct {v5, v6, v7, v8, v9}, Lcom/join/mgps/event/x;-><init>(ILjava/lang/String;J)V

    invoke-virtual {v4, v5}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    :cond_2
    const-wide/16 v4, 0x3e8

    .line 12
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/task/e$a;->f:Lcom/join/mgps/task/e;

    invoke-virtual {v0}, Lcom/join/mgps/task/e;->a()V

    :cond_3
    return-void
.end method
