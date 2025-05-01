.class Lcom/join/mgps/activity/ForumPostsActivity_$n;
.super Ljava/lang/Object;
.source "ForumPostsActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumPostsActivity_;->x2(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

.field final synthetic c:Z

.field final synthetic d:Lcom/join/mgps/activity/ForumPostsActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$n;->d:Lcom/join/mgps/activity/ForumPostsActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$n;->b:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    iput-boolean p3, p0, Lcom/join/mgps/activity/ForumPostsActivity_$n;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_$n;->d:Lcom/join/mgps/activity/ForumPostsActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$n;->b:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    iget-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$n;->c:Z

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/ForumPostsActivity_;->b3(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Z)V

    return-void
.end method
