.class Lcom/join/mgps/activity/GameMainActivity4$e;
.super Ljava/lang/Object;
.source "GameMainActivity4.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/GameMainActivity4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GameMainActivity4;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameMainActivity4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4$e;->b:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4$e$a;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4$e;->b:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-static {v1}, Lcom/join/mgps/activity/GameMainActivity4;->a1(Lcom/join/mgps/activity/GameMainActivity4;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/activity/GameMainActivity4$e$a;-><init>(Lcom/join/mgps/activity/GameMainActivity4$e;Landroid/content/Context;)V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4$e;->b:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-static {v1}, Lcom/join/mgps/activity/GameMainActivity4;->d1(Lcom/join/mgps/activity/GameMainActivity4;)I

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4$e;->b:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-static {v1}, Lcom/join/mgps/activity/GameMainActivity4;->c1(Lcom/join/mgps/activity/GameMainActivity4;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;->setTargetPosition(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$e;->b:Lcom/join/mgps/activity/GameMainActivity4;

    iget-object v1, v0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, v0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$e;->b:Lcom/join/mgps/activity/GameMainActivity4;

    iget-object v0, v0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
