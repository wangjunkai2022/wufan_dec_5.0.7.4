.class Lcom/join/mgps/activity/ForumPostsActivity$u;
.super Ljava/lang/Object;
.source "ForumPostsActivity.java"

# interfaces
.implements Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$f;


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
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$u;->a:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;III)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$u;->a:Lcom/join/mgps/activity/ForumPostsActivity;

    iget-object p2, p1, Lcom/join/mgps/activity/ForumPostsActivity;->K:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p2, p4}, Lcom/join/mgps/activity/ForumPostsActivity;->W2(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$u;->a:Lcom/join/mgps/activity/ForumPostsActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {p1, p4}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->onScrollStateChanged(I)V

    return-void
.end method
