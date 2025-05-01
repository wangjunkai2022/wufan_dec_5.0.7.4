.class Lcom/join/mgps/activity/CommentAllListActivity_$o;
.super Ljava/lang/Object;
.source "CommentAllListActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CommentAllListActivity_;->i0(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/activity/CommentAllListActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CommentAllListActivity_;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CommentAllListActivity_$o;->d:Lcom/join/mgps/activity/CommentAllListActivity_;

    iput p2, p0, Lcom/join/mgps/activity/CommentAllListActivity_$o;->b:I

    iput p3, p0, Lcom/join/mgps/activity/CommentAllListActivity_$o;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity_$o;->d:Lcom/join/mgps/activity/CommentAllListActivity_;

    iget v1, p0, Lcom/join/mgps/activity/CommentAllListActivity_$o;->b:I

    iget v2, p0, Lcom/join/mgps/activity/CommentAllListActivity_$o;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_;->D0(Lcom/join/mgps/activity/CommentAllListActivity_;II)V

    return-void
.end method
