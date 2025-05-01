.class Lcom/join/mgps/fragment/ForumGroupPostsFragment$i;
.super Ljava/lang/Object;
.source "ForumGroupPostsFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ForumGroupPostsFragment;->w0()V
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
    iput-object p1, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$i;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$i;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->j0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/fragment/ForumGroupPostsFragment$i;->b:Lcom/join/mgps/fragment/ForumGroupPostsFragment;

    iget v1, v0, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->q:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/ForumGroupPostsFragment;->f0(I)V

    :cond_0
    return-void
.end method
