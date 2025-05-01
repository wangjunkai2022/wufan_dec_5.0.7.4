.class Lcom/join/mgps/activity/ForumPostsActivity_$l;
.super Ljava/lang/Object;
.source "ForumPostsActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumPostsActivity_;->K2(Lcom/join/mgps/customview/RewardType;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/RewardType;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Lcom/join/mgps/activity/ForumPostsActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/customview/RewardType;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$l;->e:Lcom/join/mgps/activity/ForumPostsActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$l;->b:Lcom/join/mgps/customview/RewardType;

    iput p3, p0, Lcom/join/mgps/activity/ForumPostsActivity_$l;->c:I

    iput p4, p0, Lcom/join/mgps/activity/ForumPostsActivity_$l;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_$l;->e:Lcom/join/mgps/activity/ForumPostsActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$l;->b:Lcom/join/mgps/customview/RewardType;

    iget v2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$l;->c:I

    iget v3, p0, Lcom/join/mgps/activity/ForumPostsActivity_$l;->d:I

    invoke-static {v0, v1, v2, v3}, Lcom/join/mgps/activity/ForumPostsActivity_;->a4(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/customview/RewardType;II)V

    return-void
.end method
