.class public Lcom/join/mgps/dto/DownloadScanEvent;
.super Ljava/lang/Object;
.source "DownloadScanEvent.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private pkg:Ljava/lang/String;

.field private status:I

.field private task:Lcom/github/snowdream/android/app/downloader/DownloadTask;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPkg()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DownloadScanEvent;->pkg:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/DownloadScanEvent;->status:I

    return v0
.end method

.method public getTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DownloadScanEvent;->task:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object v0
.end method

.method public setPkg(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DownloadScanEvent;->pkg:Ljava/lang/String;

    return-void
.end method

.method public setStatus(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/DownloadScanEvent;->status:I

    return-void
.end method

.method public setTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DownloadScanEvent;->task:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-void
.end method
