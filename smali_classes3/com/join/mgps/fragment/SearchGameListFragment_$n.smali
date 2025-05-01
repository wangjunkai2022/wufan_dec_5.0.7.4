.class Lcom/join/mgps/fragment/SearchGameListFragment_$n;
.super Ljava/lang/Object;
.source "SearchGameListFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SearchGameListFragment_;->s0(Lcom/join/mgps/dto/SearchGameListBean;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SearchGameListBean;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/fragment/SearchGameListFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SearchGameListFragment_;Lcom/join/mgps/dto/SearchGameListBean;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$n;->d:Lcom/join/mgps/fragment/SearchGameListFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$n;->b:Lcom/join/mgps/dto/SearchGameListBean;

    iput p3, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$n;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$n;->d:Lcom/join/mgps/fragment/SearchGameListFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$n;->b:Lcom/join/mgps/dto/SearchGameListBean;

    iget v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$n;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/SearchGameListFragment_;->I0(Lcom/join/mgps/fragment/SearchGameListFragment_;Lcom/join/mgps/dto/SearchGameListBean;I)V

    return-void
.end method
