.class Lcom/join/mgps/activity/GameMainActivity3$l;
.super Ljava/lang/Object;
.source "GameMainActivity3.java"

# interfaces
.implements Lcom/join/mgps/dialog/l1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameMainActivity3;->s2(Lcom/join/mgps/dto/DomainInfoBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/dto/DomainInfoBean;

.field final synthetic b:Lcom/join/mgps/activity/GameMainActivity3;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameMainActivity3;Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3$l;->b:Lcom/join/mgps/activity/GameMainActivity3;

    iput-object p2, p0, Lcom/join/mgps/activity/GameMainActivity3$l;->a:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3$l;->b:Lcom/join/mgps/activity/GameMainActivity3;

    invoke-static {v0}, Lcom/join/mgps/activity/GameMainActivity3;->Z0(Lcom/join/mgps/activity/GameMainActivity3;)Lcom/join/mgps/dialog/l1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dialog/p;->dismiss()V

    return-void
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3$l;->b:Lcom/join/mgps/activity/GameMainActivity3;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3$l;->a:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v1

    const-string v2, "simulator_start_win"

    invoke-static {v0, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->h4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3$l;->b:Lcom/join/mgps/activity/GameMainActivity3;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->pdSimulatorStartWinClick:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3$l;->b:Lcom/join/mgps/activity/GameMainActivity3;

    iget-object v3, v3, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3$l;->a:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3$l;->a:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method
