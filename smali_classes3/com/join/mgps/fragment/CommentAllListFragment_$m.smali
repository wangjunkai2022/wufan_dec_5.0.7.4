.class Lcom/join/mgps/fragment/CommentAllListFragment_$m;
.super Ljava/lang/Object;
.source "CommentAllListFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommentAllListFragment_;->g0(Ljava/util/List;Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;

.field final synthetic d:Lcom/join/mgps/fragment/CommentAllListFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/util/List;Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$m;->d:Lcom/join/mgps/fragment/CommentAllListFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$m;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$m;->c:Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$m;->d:Lcom/join/mgps/fragment/CommentAllListFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$m;->b:Ljava/util/List;

    iget-object v2, p0, Lcom/join/mgps/fragment/CommentAllListFragment_$m;->c:Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/CommentAllListFragment_;->l0(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/util/List;Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V

    return-void
.end method
