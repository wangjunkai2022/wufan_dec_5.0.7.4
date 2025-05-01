.class final Lcom/kwad/sdk/core/download/b/a$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/download/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private static d(Landroid/content/Intent;)V
    .locals 1
    .param p0    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/download/b/a$c;->f(Landroid/content/Intent;)Lcom/kwad/sdk/DownloadTask;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/c;->yq()Lcom/kwad/sdk/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kwad/sdk/DownloadTask;->getId()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/c;->bU(I)V

    return-void
.end method

.method private static e(Landroid/content/Intent;)V
    .locals 1
    .param p0    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/download/b/a$c;->f(Landroid/content/Intent;)Lcom/kwad/sdk/DownloadTask;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/DownloadTask;->setNotificationRemoved(Z)V

    return-void
.end method

.method private static f(Landroid/content/Intent;)Lcom/kwad/sdk/DownloadTask;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "taskId"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/c;->yq()Lcom/kwad/sdk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/c;->bS(I)Lcom/kwad/sdk/DownloadTask;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    if-eqz p2, :cond_2

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.ksad.action.ACTION_NOTIFICATION_CLICK_CONTROL_BTN"

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {p2}, Lcom/kwad/sdk/core/download/b/a$c;->d(Landroid/content/Intent;)V

    return-void

    :cond_1
    const-string v0, "com.ksad.action.ACTION_NOTIFICATION_REMOVED"

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    invoke-static {p2}, Lcom/kwad/sdk/core/download/b/a$c;->e(Landroid/content/Intent;)V

    :cond_2
    :goto_0
    return-void
.end method
