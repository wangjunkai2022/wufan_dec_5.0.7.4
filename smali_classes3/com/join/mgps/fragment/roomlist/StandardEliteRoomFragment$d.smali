.class Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;
.super Ljava/lang/Object;
.source "StandardEliteRoomFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->W(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->V(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->W(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    iget v1, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->m:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_2

    .line 5
    iget-object v0, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0714ce

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3fa00000    # 1.25f

    mul-float v2, v2, v1

    cmpl-float v2, v0, v2

    if-lez v2, :cond_1

    .line 7
    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    div-float/2addr v0, v1

    iput v0, v2, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->m:F

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->m:F

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->b0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Lcom/join/mgps/adapter/GameListAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    iget v1, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->m:F

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/GameListAdapter;->h(F)V

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->W(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->V(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->b0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Lcom/join/mgps/adapter/GameListAdapter;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->b0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Lcom/join/mgps/adapter/GameListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    iget-boolean v1, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->n:Z

    if-eqz v1, :cond_4

    .line 13
    iget-object v1, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->p:Landroid/os/Handler;

    iget-wide v2, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->o:J

    invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    return-void
.end method
