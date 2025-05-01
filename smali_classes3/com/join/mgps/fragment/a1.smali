.class public final synthetic Lcom/join/mgps/fragment/a1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/join/mgps/customview/f;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/RankingItemFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/RankingItemFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/a1;->b:Lcom/join/mgps/fragment/RankingItemFragment;

    return-void
.end method


# virtual methods
.method public final onLoadMore()V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/fragment/a1;->b:Lcom/join/mgps/fragment/RankingItemFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/RankingItemFragment;->X(Lcom/join/mgps/fragment/RankingItemFragment;)V

    return-void
.end method
