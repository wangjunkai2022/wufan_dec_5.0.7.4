.class Lcom/join/mgps/activity/ForumMyPostsActivity_$k;
.super Ljava/lang/Object;
.source "ForumMyPostsActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumMyPostsActivity_;->k0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/activity/ForumMyPostsActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumMyPostsActivity_;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumMyPostsActivity_$k;->c:Lcom/join/mgps/activity/ForumMyPostsActivity_;

    iput p2, p0, Lcom/join/mgps/activity/ForumMyPostsActivity_$k;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumMyPostsActivity_$k;->c:Lcom/join/mgps/activity/ForumMyPostsActivity_;

    iget v1, p0, Lcom/join/mgps/activity/ForumMyPostsActivity_$k;->b:I

    invoke-static {v0, v1}, Lcom/join/mgps/activity/ForumMyPostsActivity_;->N0(Lcom/join/mgps/activity/ForumMyPostsActivity_;I)V

    return-void
.end method
