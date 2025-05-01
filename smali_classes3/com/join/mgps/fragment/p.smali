.class public final synthetic Lcom/join/mgps/fragment/p;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

.field public final synthetic c:Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/p;->b:Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

    iput-object p2, p0, Lcom/join/mgps/fragment/p;->c:Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/fragment/p;->b:Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

    iget-object v1, p0, Lcom/join/mgps/fragment/p;->c:Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;->a(Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;Landroid/view/View;)V

    return-void
.end method
