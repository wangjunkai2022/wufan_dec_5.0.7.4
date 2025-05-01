.class Lcom/join/mgps/activity/CommentCreatActivity_$c;
.super Ljava/lang/Object;
.source "CommentCreatActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CommentCreatActivity_;->k0(IDLjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:D

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/join/mgps/activity/CommentCreatActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CommentCreatActivity_;IDLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CommentCreatActivity_$c;->f:Lcom/join/mgps/activity/CommentCreatActivity_;

    iput p2, p0, Lcom/join/mgps/activity/CommentCreatActivity_$c;->b:I

    iput-wide p3, p0, Lcom/join/mgps/activity/CommentCreatActivity_$c;->c:D

    iput-object p5, p0, Lcom/join/mgps/activity/CommentCreatActivity_$c;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/join/mgps/activity/CommentCreatActivity_$c;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CommentCreatActivity_$c;->f:Lcom/join/mgps/activity/CommentCreatActivity_;

    iget v1, p0, Lcom/join/mgps/activity/CommentCreatActivity_$c;->b:I

    iget-wide v2, p0, Lcom/join/mgps/activity/CommentCreatActivity_$c;->c:D

    iget-object v4, p0, Lcom/join/mgps/activity/CommentCreatActivity_$c;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/join/mgps/activity/CommentCreatActivity_$c;->e:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lcom/join/mgps/activity/CommentCreatActivity_;->q0(Lcom/join/mgps/activity/CommentCreatActivity_;IDLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
