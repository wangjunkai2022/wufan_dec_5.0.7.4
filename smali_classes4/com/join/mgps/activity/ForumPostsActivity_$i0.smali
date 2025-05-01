.class Lcom/join/mgps/activity/ForumPostsActivity_$i0;
.super Ljava/lang/Object;
.source "ForumPostsActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumPostsActivity_;->V2(Landroidx/recyclerview/widget/RecyclerView;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Lcom/join/mgps/activity/ForumPostsActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity_;Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$i0;->f:Lcom/join/mgps/activity/ForumPostsActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$i0;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput p3, p0, Lcom/join/mgps/activity/ForumPostsActivity_$i0;->c:I

    iput p4, p0, Lcom/join/mgps/activity/ForumPostsActivity_$i0;->d:I

    iput p5, p0, Lcom/join/mgps/activity/ForumPostsActivity_$i0;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_$i0;->f:Lcom/join/mgps/activity/ForumPostsActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$i0;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget v2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$i0;->c:I

    iget v3, p0, Lcom/join/mgps/activity/ForumPostsActivity_$i0;->d:I

    iget v4, p0, Lcom/join/mgps/activity/ForumPostsActivity_$i0;->e:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/activity/ForumPostsActivity_;->v3(Lcom/join/mgps/activity/ForumPostsActivity_;Landroidx/recyclerview/widget/RecyclerView;III)V

    return-void
.end method
