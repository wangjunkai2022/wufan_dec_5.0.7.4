.class Lcom/join/mgps/activity/CommentCreatActivity_$d;
.super Ljava/lang/Object;
.source "CommentCreatActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CommentCreatActivity_;->l0(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:Lcom/join/mgps/activity/CommentCreatActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CommentCreatActivity_;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CommentCreatActivity_$d;->d:Lcom/join/mgps/activity/CommentCreatActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/CommentCreatActivity_$d;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/join/mgps/activity/CommentCreatActivity_$d;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CommentCreatActivity_$d;->d:Lcom/join/mgps/activity/CommentCreatActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/CommentCreatActivity_$d;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/join/mgps/activity/CommentCreatActivity_$d;->c:Z

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/CommentCreatActivity_;->r0(Lcom/join/mgps/activity/CommentCreatActivity_;Ljava/lang/String;Z)V

    return-void
.end method
