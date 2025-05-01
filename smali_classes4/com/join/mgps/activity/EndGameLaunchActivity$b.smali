.class Lcom/join/mgps/activity/EndGameLaunchActivity$b;
.super Ljava/lang/Object;
.source "EndGameLaunchActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/EndGameLaunchActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/EndGameLaunchActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameLaunchActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->g0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    move-result v0

    const/16 v1, 0x50

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->i0(Lcom/join/mgps/activity/EndGameLaunchActivity;I)I

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->g0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->w0(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->g0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    move-result v0

    const/16 v1, 0x64

    if-ge v0, v1, :cond_2

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->j0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->m0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-static {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->n0(Lcom/join/mgps/activity/EndGameLaunchActivity;Landroid/os/Handler;)Landroid/os/Handler;

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->o0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->v0()V

    :goto_0
    return-void
.end method
