.class Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;
.super Ljava/lang/Object;
.source "PlugDownDialogAcitivity.java"

# interfaces
.implements Lcom/github/snowdream/android/app/downloader/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->initPreDownloadFactory()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object p1, p1, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->callback:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$IStartEmuGameCallback;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$IStartEmuGameCallback;->onStartEmuGame()V

    :cond_0
    return-void
.end method

.method public onFinish(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onFinish onStart - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/w0;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->access$100()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/snowdream/android/app/downloader/c;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object v1, v1, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->gameTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/c;->j()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setResource_path(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object v1, v1, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->gameTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v1}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    new-instance v0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;

    iget-object v1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object v2, v1, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->gameTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v0, v1, v2, v1}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$UNZIPResThread;-><init>(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 6
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 7
    invoke-static {}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->access$100()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onProgress(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PreDownloadPlug onProgress - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " progress="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " speed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 v1, 0x0

    aput-object p3, v0, v1

    const-string p3, "PreDownloadPlug"

    invoke-static {p3, v0}, Lcom/join/mgps/Util/w0;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object p3, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    new-instance v0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$2;-><init>(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;Ljava/lang/String;I)V

    invoke-virtual {p3, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStart(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PreDownloadPlug onStart - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/w0;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    new-instance v0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$1;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$1;-><init>(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStop(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onWait(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public updateSize(Ljava/lang/String;J)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object p1, p1, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->gameTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1, p2, p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_actual_size(J)V

    :cond_0
    return-void
.end method
