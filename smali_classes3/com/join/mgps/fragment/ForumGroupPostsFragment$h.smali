.class Lcom/join/mgps/fragment/ForumGroupPostsFragment$h;
.super Ljava/lang/Object;
.source "ForumGroupPostsFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ForumGroupPostsFragment;->F0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/ForumGroupPostsFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$h;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$h;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->m:Lcom/join/mgps/customview/XListView2;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->v()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$h;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->m:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$h;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/activity/ForumActivity;

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$h;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/ForumActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/ForumActivity;->r0()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$h;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->X(Lcom/join/mgps/fragment/ForumGroupPostsFragment;)I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$h;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/ForumActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/ForumActivity;->I0()V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$h;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    iget v1, v0, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->r:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    .line 8
    iget-object v0, v0, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->m:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->setNoMore()V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$h;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->b0(I)V

    return-void

    :cond_2
    const/4 v1, 0x2

    .line 10
    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->b0(I)V

    return-void
.end method
