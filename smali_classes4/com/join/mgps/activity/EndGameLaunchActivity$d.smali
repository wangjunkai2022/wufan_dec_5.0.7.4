.class Lcom/join/mgps/activity/EndGameLaunchActivity$d;
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
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$d;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$d;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->g0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->w0(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$d;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->g0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    move-result v0

    const/16 v1, 0x50

    if-gt v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$d;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->j0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$d;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->p0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x96

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
