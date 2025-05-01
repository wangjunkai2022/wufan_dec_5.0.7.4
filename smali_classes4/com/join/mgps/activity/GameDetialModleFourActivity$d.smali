.class Lcom/join/mgps/activity/GameDetialModleFourActivity$d;
.super Ljava/lang/Object;
.source "GameDetialModleFourActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/GameDetialModleFourActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GameDetialModleFourActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$d;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$d;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->c0(Lcom/join/mgps/activity/GameDetialModleFourActivity;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$d;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isHidden()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$d;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    iget-object v0, v0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v1, v0}, Lcom/join/android/app/component/video/c;->q(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_0
    return-void
.end method
