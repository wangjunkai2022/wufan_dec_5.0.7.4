.class Lcom/join/mgps/activity/ForumMyPostsActivity$b;
.super Ljava/lang/Object;
.source "ForumMyPostsActivity.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumMyPostsActivity;->q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/join/mgps/activity/ForumMyPostsActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumMyPostsActivity;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumMyPostsActivity$b;->c:Lcom/join/mgps/activity/ForumMyPostsActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/ForumMyPostsActivity$b;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumMyPostsActivity$b;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumMyPostsActivity$b;->c:Lcom/join/mgps/activity/ForumMyPostsActivity;

    const v1, 0x7f100299

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/ForumMyPostsActivity;->showToast(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumMyPostsActivity$b;->c:Lcom/join/mgps/activity/ForumMyPostsActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/ForumMyPostsActivity;->F0()V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumMyPostsActivity$b;->c:Lcom/join/mgps/activity/ForumMyPostsActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/ForumMyPostsActivity;->h0(Lcom/join/mgps/activity/ForumMyPostsActivity;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/ForumMyPostsActivity;->o0(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumMyPostsActivity$b;->c:Lcom/join/mgps/activity/ForumMyPostsActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/ForumMyPostsActivity;->f0(Lcom/join/mgps/activity/ForumMyPostsActivity;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumMyPostsActivity$b;->c:Lcom/join/mgps/activity/ForumMyPostsActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/ForumMyPostsActivity;->F0()V

    :cond_1
    return-void
.end method
