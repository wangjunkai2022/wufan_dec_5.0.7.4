.class Lcom/join/mgps/fragment/CommentAllListFragment$a;
.super Ljava/lang/Object;
.source "CommentAllListFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/LoadMoreRecyclerView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommentAllListFragment;->afterView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/CommentAllListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommentAllListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommentAllListFragment$a;->a:Lcom/join/mgps/fragment/CommentAllListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment$a;->a:Lcom/join/mgps/fragment/CommentAllListFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/CommentAllListFragment;->X()V

    return-void
.end method
