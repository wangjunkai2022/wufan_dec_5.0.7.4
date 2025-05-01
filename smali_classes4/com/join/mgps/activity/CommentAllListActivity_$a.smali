.class Lcom/join/mgps/activity/CommentAllListActivity_$a;
.super Ljava/lang/Object;
.source "CommentAllListActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CommentAllListActivity_;->o0(Ljava/lang/String;ZII)V
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

.field final synthetic f:Lcom/join/mgps/activity/CommentAllListActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/lang/String;ZII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CommentAllListActivity_$a;->f:Lcom/join/mgps/activity/CommentAllListActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/CommentAllListActivity_$a;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/join/mgps/activity/CommentAllListActivity_$a;->c:Z

    iput p4, p0, Lcom/join/mgps/activity/CommentAllListActivity_$a;->d:I

    iput p5, p0, Lcom/join/mgps/activity/CommentAllListActivity_$a;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity_$a;->f:Lcom/join/mgps/activity/CommentAllListActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/CommentAllListActivity_$a;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/join/mgps/activity/CommentAllListActivity_$a;->c:Z

    iget v3, p0, Lcom/join/mgps/activity/CommentAllListActivity_$a;->d:I

    iget v4, p0, Lcom/join/mgps/activity/CommentAllListActivity_$a;->e:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/activity/CommentAllListActivity_;->E0(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/lang/String;ZII)V

    return-void
.end method
