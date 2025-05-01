.class Lcom/join/mgps/fragment/ForumPostsFragment$g;
.super Ljava/lang/Object;
.source "ForumPostsFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ForumPostsFragment;->E0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/ForumPostsFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/ForumPostsFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/ForumPostsFragment$g;->b:Lcom/join/mgps/fragment/ForumPostsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, "XListView"

    const-string/jumbo v1, "stopXlistRefreshAndLoadMore"

    .line 1
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumPostsFragment$g;->b:Lcom/join/mgps/fragment/ForumPostsFragment;

    iget-object v1, v1, Lcom/join/mgps/fragment/ForumPostsFragment;->m:Lcom/join/mgps/customview/XListView2;

    if-nez v1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {v1}, Lcom/join/mgps/customview/XListView2;->v()V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumPostsFragment$g;->b:Lcom/join/mgps/fragment/ForumPostsFragment;

    iget-object v1, v1, Lcom/join/mgps/fragment/ForumPostsFragment;->m:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v1}, Lcom/join/mgps/customview/XListView2;->u()V

    const-string/jumbo v1, "stopXlistRefreshAndLoadMore111111111111"

    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumPostsFragment$g;->b:Lcom/join/mgps/fragment/ForumPostsFragment;

    iget v1, v1, Lcom/join/mgps/fragment/ForumPostsFragment;->p:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    const-string/jumbo v1, "stopXlistRefreshAndLoadMore222222222"

    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumPostsFragment$g;->b:Lcom/join/mgps/fragment/ForumPostsFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/ForumPostsFragment;->m:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->setNoMore()V

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumPostsFragment$g;->b:Lcom/join/mgps/fragment/ForumPostsFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/fragment/ForumIndexFragment;

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumPostsFragment$g;->b:Lcom/join/mgps/fragment/ForumPostsFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/fragment/ForumIndexFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->i0()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumPostsFragment$g;->b:Lcom/join/mgps/fragment/ForumPostsFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/ForumPostsFragment;->X(Lcom/join/mgps/fragment/ForumPostsFragment;)I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumPostsFragment$g;->b:Lcom/join/mgps/fragment/ForumPostsFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/fragment/ForumIndexFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->L0()V

    :cond_2
    return-void
.end method
