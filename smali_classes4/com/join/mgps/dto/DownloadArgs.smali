.class public Lcom/join/mgps/dto/DownloadArgs;
.super Ljava/lang/Object;
.source "DownloadArgs.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private from:I

.field private gameInfo:Lcom/join/mgps/dto/CollectionBeanSub;

.field private webDiskInfo:Lcom/join/mgps/dto/WebDiskInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/join/mgps/dto/DownloadArgs;->from:I

    return-void
.end method

.method public constructor <init>(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/join/mgps/dto/DownloadArgs;->from:I

    .line 3
    iput-object p1, p0, Lcom/join/mgps/dto/DownloadArgs;->downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-void
.end method


# virtual methods
.method public getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DownloadArgs;->downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object v0
.end method

.method public getFrom()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/DownloadArgs;->from:I

    return v0
.end method

.method public getGameInfo()Lcom/join/mgps/dto/CollectionBeanSub;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DownloadArgs;->gameInfo:Lcom/join/mgps/dto/CollectionBeanSub;

    return-object v0
.end method

.method public getWebDiskInfo()Lcom/join/mgps/dto/WebDiskInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DownloadArgs;->webDiskInfo:Lcom/join/mgps/dto/WebDiskInfo;

    return-object v0
.end method

.method public setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DownloadArgs;->downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-void
.end method

.method public setFrom(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/DownloadArgs;->from:I

    return-void
.end method

.method public setGameInfo(Lcom/join/mgps/dto/CollectionBeanSub;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DownloadArgs;->gameInfo:Lcom/join/mgps/dto/CollectionBeanSub;

    return-void
.end method

.method public setWebDiskInfo(Lcom/join/mgps/dto/WebDiskInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DownloadArgs;->webDiskInfo:Lcom/join/mgps/dto/WebDiskInfo;

    return-void
.end method
