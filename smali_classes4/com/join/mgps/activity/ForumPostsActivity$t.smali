.class Lcom/join/mgps/activity/ForumPostsActivity$t;
.super Ljava/lang/Object;
.source "ForumPostsActivity.java"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumPostsActivity;->q1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/ForumPostsActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$t;->a:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$t;->a:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$t;->a:Lcom/join/mgps/activity/ForumPostsActivity;

    const v1, 0x7f100299

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$t;->a:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$t;->a:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/ForumPostsActivity;->t0(Lcom/join/mgps/activity/ForumPostsActivity;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->v1(ZZI)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$t;->a:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/ForumPostsActivity;->u0(Lcom/join/mgps/activity/ForumPostsActivity;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$t;->a:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    :cond_1
    return-void
.end method

.method public onRefresh()V
    .locals 0

    return-void
.end method
