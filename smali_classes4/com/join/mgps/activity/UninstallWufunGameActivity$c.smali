.class Lcom/join/mgps/activity/UninstallWufunGameActivity$c;
.super Ljava/lang/Object;
.source "UninstallWufunGameActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/UninstallWufunGameActivity;->m0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/join/mgps/activity/UninstallWufunGameActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/UninstallWufunGameActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$c;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$c;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->j:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$c;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->k:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$c;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$c;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->v0()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$c;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->w0()V

    :cond_1
    return-void
.end method
