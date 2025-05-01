.class Lcom/join/mgps/fragment/ForumGroupPostsFragment$d;
.super Ljava/lang/Object;
.source "ForumGroupPostsFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ForumGroupPostsFragment;->i0()V
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
    iput-object p1, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$d;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$d;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->j0()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$d;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/activity/ForumActivity;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$d;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/ForumActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/ForumActivity;->w0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$d;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->F0()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$d;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    const/4 v1, 0x0

    iput v1, v0, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->r:I

    .line 6
    iput v1, v0, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->q:I

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->f0(I)V

    :cond_1
    return-void
.end method
