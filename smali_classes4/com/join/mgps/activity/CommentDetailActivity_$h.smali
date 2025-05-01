.class Lcom/join/mgps/activity/CommentDetailActivity_$h;
.super Ljava/lang/Object;
.source "CommentDetailActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CommentDetailActivity_;->c1(Ljava/lang/String;ZII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Lcom/join/mgps/activity/CommentDetailActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CommentDetailActivity_;Ljava/lang/String;ZII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CommentDetailActivity_$h;->f:Lcom/join/mgps/activity/CommentDetailActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/CommentDetailActivity_$h;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/join/mgps/activity/CommentDetailActivity_$h;->c:Z

    iput p4, p0, Lcom/join/mgps/activity/CommentDetailActivity_$h;->d:I

    iput p5, p0, Lcom/join/mgps/activity/CommentDetailActivity_$h;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CommentDetailActivity_$h;->f:Lcom/join/mgps/activity/CommentDetailActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/CommentDetailActivity_$h;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/join/mgps/activity/CommentDetailActivity_$h;->c:Z

    iget v3, p0, Lcom/join/mgps/activity/CommentDetailActivity_$h;->d:I

    iget v4, p0, Lcom/join/mgps/activity/CommentDetailActivity_$h;->e:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/activity/CommentDetailActivity_;->v1(Lcom/join/mgps/activity/CommentDetailActivity_;Ljava/lang/String;ZII)V

    return-void
.end method
