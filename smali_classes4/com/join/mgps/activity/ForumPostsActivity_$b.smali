.class Lcom/join/mgps/activity/ForumPostsActivity_$b;
.super Ljava/lang/Object;
.source "ForumPostsActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumPostsActivity_;->y1(ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/activity/ForumPostsActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity_;ZI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$b;->d:Lcom/join/mgps/activity/ForumPostsActivity_;

    iput-boolean p2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$b;->b:Z

    iput p3, p0, Lcom/join/mgps/activity/ForumPostsActivity_$b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_$b;->d:Lcom/join/mgps/activity/ForumPostsActivity_;

    iget-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$b;->b:Z

    iget v2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$b;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/ForumPostsActivity_;->Y2(Lcom/join/mgps/activity/ForumPostsActivity_;ZI)V

    return-void
.end method
