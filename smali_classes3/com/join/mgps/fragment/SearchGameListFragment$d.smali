.class Lcom/join/mgps/fragment/SearchGameListFragment$d;
.super Ljava/lang/Object;
.source "SearchGameListFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SearchGameListFragment;->u0(ZLcom/join/mgps/dto/DomainInfoBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/DomainInfoBean;

.field final synthetic c:Lcom/join/mgps/fragment/SearchGameListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SearchGameListFragment;Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment$d;->c:Lcom/join/mgps/fragment/SearchGameListFragment;

    iput-object p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment$d;->b:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment$d;->c:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->d0(Lcom/join/mgps/fragment/SearchGameListFragment;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->pdGameWishClick:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment$d;->b:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setIsResultPage(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment$d;->b:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment$d;->c:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$d;->b:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v0

    const-string v1, "game_search_wish"

    invoke-static {p1, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->h4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
