.class Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;
.super Ljava/lang/Thread;
.source "PlugDownDialogAcitivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ProgressMonitor"
.end annotation


# instance fields
.field mFile:Ljava/io/File;

.field private monitor:Z

.field final synthetic this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;Ljava/io/File;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->monitor:Z

    .line 3
    iput-object p2, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->mFile:Ljava/io/File;

    .line 4
    invoke-static {p2}, Lcom/join/mgps/Util/UtilsMy;->J1(Ljava/io/File;)J

    move-result-wide v0

    iput-wide v0, p1, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;->initSize:J

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 2
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->monitor:Z

    if-eqz v0, :cond_3

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;

    invoke-static {v0}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;->access$200(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->mFile:Ljava/io/File;

    if-nez v0, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->J1(Ljava/io/File;)J

    move-result-wide v0

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zip currentSize ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide/16 v2, 0x2

    .line 7
    iget-object v4, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;

    invoke-static {v4}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;->access$200(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRes_actual_size()J

    move-result-wide v4

    mul-long v4, v4, v2

    const-wide/16 v2, 0x0

    cmp-long v6, v4, v2

    if-gtz v6, :cond_2

    const-wide/16 v4, 0x1

    .line 8
    :cond_2
    iget-object v2, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;

    iget-object v6, v2, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-wide v2, v2, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;->initSize:J

    sub-long v7, v0, v2

    const-wide/16 v9, 0x64

    sub-long/2addr v0, v2

    mul-long v0, v0, v9

    div-long/2addr v0, v4

    long-to-int v11, v0

    move-wide v9, v4

    invoke-virtual/range {v6 .. v11}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->updateUnzipRes(JJI)V

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "totalSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ";zip progress ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;

    invoke-static {v1}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;->access$200(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide/16 v0, 0x3e8

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 11
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->monitor:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    return-void

    .line 13
    :goto_1
    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public setMonitor(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread$ProgressMonitor;->monitor:Z

    return-void
.end method
