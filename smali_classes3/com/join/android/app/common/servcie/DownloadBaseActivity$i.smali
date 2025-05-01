.class Lcom/join/android/app/common/servcie/DownloadBaseActivity$i;
.super Ljava/lang/Object;
.source "DownloadBaseActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/common/servcie/DownloadBaseActivity;->retryOnSomeTime()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/android/app/common/servcie/DownloadBaseActivity;


# direct methods
.method constructor <init>(Lcom/join/android/app/common/servcie/DownloadBaseActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/common/servcie/DownloadBaseActivity$i;->b:Lcom/join/android/app/common/servcie/DownloadBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/android/app/common/servcie/DownloadBaseActivity;->access$400()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->k(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Lcom/join/android/app/common/utils/j;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/android/app/common/servcie/DownloadBaseActivity$i;->b:Lcom/join/android/app/common/servcie/DownloadBaseActivity;

    invoke-static {v0}, Lcom/join/android/app/common/servcie/DownloadBaseActivity;->access$200(Lcom/join/android/app/common/servcie/DownloadBaseActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/android/app/common/servcie/DownloadBaseActivity$i;->b:Lcom/join/android/app/common/servcie/DownloadBaseActivity;

    invoke-static {v0}, Lcom/join/android/app/common/servcie/DownloadBaseActivity;->access$200(Lcom/join/android/app/common/servcie/DownloadBaseActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 4
    :cond_0
    sget-object v0, Lcom/join/android/app/common/servcie/DownloadBaseActivity;->future:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    goto :goto_0

    .line 5
    :cond_1
    sget-object v0, Lcom/join/android/app/common/servcie/DownloadBaseActivity;->future:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_2
    :goto_0
    return-void
.end method
