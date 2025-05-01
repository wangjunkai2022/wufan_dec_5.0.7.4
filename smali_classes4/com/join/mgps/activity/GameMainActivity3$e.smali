.class Lcom/join/mgps/activity/GameMainActivity3$e;
.super Ljava/lang/Object;
.source "GameMainActivity3.java"

# interfaces
.implements Lcom/join/mgps/ad/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameMainActivity3;->R1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/join/mgps/ad/c$a<",
        "Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/GameMainActivity3;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameMainActivity3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3$e;->a:Lcom/join/mgps/activity/GameMainActivity3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameMainActivity3$e;->b(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)V

    return-void
.end method

.method public b(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)V
    .locals 0

    return-void
.end method

.method public onADLoaded(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3$e;->a:Lcom/join/mgps/activity/GameMainActivity3;

    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->v2:Ljava/util/List;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->v2:Ljava/util/List;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3$e;->a:Lcom/join/mgps/activity/GameMainActivity3;

    iget-object v0, v0, Lcom/join/mgps/activity/GameMainActivity3;->v2:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3$e;->a:Lcom/join/mgps/activity/GameMainActivity3;

    iget-object p1, p1, Lcom/join/mgps/activity/GameMainActivity3;->v2:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x6

    if-ge p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3$e;->a:Lcom/join/mgps/activity/GameMainActivity3;

    invoke-static {p1}, Lcom/join/mgps/activity/GameMainActivity3;->b1(Lcom/join/mgps/activity/GameMainActivity3;)V

    :cond_1
    return-void
.end method

.method public onAdClick()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3$e;->a:Lcom/join/mgps/activity/GameMainActivity3;

    sget-object v1, Lcom/papa/sim/statistic/Event;->Exit_flowad_click:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3$e;->a:Lcom/join/mgps/activity/GameMainActivity3;

    iget-object v2, v2, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/activity/GameMainActivity3;->k2(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/MApplication;->G(Z)V

    return-void
.end method

.method public onAdShow()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3$e;->a:Lcom/join/mgps/activity/GameMainActivity3;

    sget-object v1, Lcom/papa/sim/statistic/Event;->Exit_flowad_pop_tt:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3$e;->a:Lcom/join/mgps/activity/GameMainActivity3;

    iget-object v2, v2, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/activity/GameMainActivity3;->k2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
