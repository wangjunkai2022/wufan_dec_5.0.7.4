.class Lcom/join/mgps/fragment/EndGameDetailRankingFragment$a;
.super Ljava/lang/Object;
.source "EndGameDetailRankingFragment.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->b0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$a;->a:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMoreRequested()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$a;->a:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->X(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;)I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$a;->a:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->W(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->d0(I)V

    return-void
.end method
