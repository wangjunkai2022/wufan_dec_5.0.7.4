.class Lcom/join/mgps/activity/ForumPostsActivity$x;
.super Lcom/join/mgps/customview/CustomLoadingView$e;
.source "ForumPostsActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/ForumPostsActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity;Lcom/join/mgps/customview/CustomLoadingView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$x;->b:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-direct {p0, p2}, Lcom/join/mgps/customview/CustomLoadingView$e;-><init>(Lcom/join/mgps/customview/CustomLoadingView;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$x;->b:Lcom/join/mgps/activity/ForumPostsActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->v0(Lcom/join/mgps/activity/ForumPostsActivity;Z)V

    return-void
.end method
