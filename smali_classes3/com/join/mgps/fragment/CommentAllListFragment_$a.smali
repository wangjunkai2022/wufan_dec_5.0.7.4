.class Lcom/join/mgps/fragment/CommentAllListFragment_$a;
.super Ljava/lang/Object;
.source "CommentAllListFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommentAllListFragment_;->W(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/fragment/CommentAllListFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommentAllListFragment_;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$a;->d:Lcom/join/mgps/fragment/CommentAllListFragment_;

    iput p2, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$a;->b:I

    iput p3, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$a;->d:Lcom/join/mgps/fragment/CommentAllListFragment_;

    iget v1, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$a;->b:I

    iget v2, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$a;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/CommentAllListFragment_;->q0(Lcom/join/mgps/fragment/CommentAllListFragment_;II)V

    return-void
.end method
