.class Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;
.super Ljava/lang/Object;
.source "OnlineGameInstallCheckActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->i0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->g0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->e(Z)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->j0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->g0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->g0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->e:Landroid/widget/ProgressBar;

    invoke-static {v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->g0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->h0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)I

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->g0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->i0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->q:Landroid/os/Handler;

    const-wide/16 v1, 0x15e

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;->b:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)V

    :goto_0
    return-void
.end method
