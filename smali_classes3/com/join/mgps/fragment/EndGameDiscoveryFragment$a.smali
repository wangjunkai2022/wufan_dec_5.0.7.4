.class Lcom/join/mgps/fragment/EndGameDiscoveryFragment$a;
.super Ljava/lang/Object;
.source "EndGameDiscoveryFragment.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$a;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$a;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->d:Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameEndgameVo()Ljava/util/List;

    move-result-object p1

    .line 2
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$a;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/activity/EndGameDetailActivity_;->C0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p2

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->a(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p2

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->b(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p2

    invoke-virtual {p2}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 3
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$a;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->V(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;Ljava/lang/String;)V

    return-void
.end method
