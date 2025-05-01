.class Lcom/join/mgps/activity/ForumPostsActivity_$h0;
.super Ljava/lang/Object;
.source "ForumPostsActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumPostsActivity_;->W2(Landroidx/recyclerview/widget/RecyclerView;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/activity/ForumPostsActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity_;Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$h0;->d:Lcom/join/mgps/activity/ForumPostsActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$h0;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput p3, p0, Lcom/join/mgps/activity/ForumPostsActivity_$h0;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_$h0;->d:Lcom/join/mgps/activity/ForumPostsActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$h0;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget v2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$h0;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/ForumPostsActivity_;->u3(Lcom/join/mgps/activity/ForumPostsActivity_;Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method
