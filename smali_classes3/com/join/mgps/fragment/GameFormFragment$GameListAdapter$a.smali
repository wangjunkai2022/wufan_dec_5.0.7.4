.class Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter$a;
.super Ljava/lang/Object;
.source "GameFormFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;

.field final synthetic c:Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter$a;->c:Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;

    iput-object p2, p0, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter$a;->b:Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter$a;->c:Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;

    iget-object p1, p1, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;->a:Lcom/join/mgps/fragment/GameFormFragment;

    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter$a;->b:Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;->getId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter$a;->b:Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;->getUid()I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/join/mgps/fragment/GameFormFragment;->b0(Lcom/join/mgps/fragment/GameFormFragment;Ljava/lang/String;I)V

    .line 2
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v0, "fromGameDetailP2"

    .line 3
    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter$a;->b:Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/Ext;->setArticleId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter$a;->c:Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;

    iget-object v0, v0, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;->a:Lcom/join/mgps/fragment/GameFormFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/GameFormFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->enterUserGameList:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0, v1, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method
