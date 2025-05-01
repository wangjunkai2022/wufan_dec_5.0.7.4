.class Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$1;
.super Ljava/lang/Object;
.source "PlugDownDialogAcitivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->onStart(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$1;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$1;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;

    iget-object v0, v0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object v0, v0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$1;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;

    iget-object v0, v0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object v0, v0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->info:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u52a0\u8f7d\u6e38\u620f\u9700\u521d\u59cb\u5316"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$1;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;

    iget-object v2, v2, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object v2, v2, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->gameTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->X1(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u8d44\u6e90\u6587\u4ef6\uff0c\u8bf7\u7a0d\u540e\u2026"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$1;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;

    iget-object v0, v0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object v0, v0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->appSize:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u6b63\u5728\u4e0b\u8f7d\uff08"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$1;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;

    iget-object v2, v2, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object v2, v2, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->gameTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRes_currentSize()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4$1;->this$1:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;

    iget-object v2, v2, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity$4;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;

    iget-object v2, v2, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity;->gameTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRes_actual_size()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
