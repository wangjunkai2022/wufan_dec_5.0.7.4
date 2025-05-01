.class Lcom/join/mgps/fragment/CommentAllListFragment_$b;
.super Ljava/lang/Object;
.source "CommentAllListFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommentAllListFragment_;->d0(Ljava/lang/String;ZII)V
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

.field final synthetic f:Lcom/join/mgps/fragment/CommentAllListFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/lang/String;ZII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$b;->f:Lcom/join/mgps/fragment/CommentAllListFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$b;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$b;->c:Z

    iput p4, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$b;->d:I

    iput p5, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$b;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$b;->f:Lcom/join/mgps/fragment/CommentAllListFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$b;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$b;->c:Z

    iget v3, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$b;->d:I

    iget v4, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$b;->e:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/fragment/CommentAllListFragment_;->r0(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/lang/String;ZII)V

    return-void
.end method
