.class Lcom/join/mgps/activity/SearchHintActivity$m;
.super Ljava/lang/Object;
.source "SearchHintActivity.java"

# interfaces
.implements Lm3/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchHintActivity;->H0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/SearchHintActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchHintActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$m;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OnBannerClick(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$m;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/SearchHintActivity;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$m;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/SearchHintActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SScrollingTxtBeanV2;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->getJumpModelDto()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$m;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/SearchHintActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SScrollingTxtBeanV2;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->getJumpModelDto()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v0

    const/16 v1, 0xa4

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 5
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/SearchHintActivity$m;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/SearchHintActivity;->i0(Lcom/join/mgps/activity/SearchHintActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$m;->b:Lcom/join/mgps/activity/SearchHintActivity;

    sget-object v1, Lcom/papa/sim/statistic/Event;->searchReturnClickGamePic:Lcom/papa/sim/statistic/Event;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/activity/SearchHintActivity;->l0(Lcom/join/mgps/activity/SearchHintActivity;Lcom/papa/sim/statistic/Event;I)V

    :cond_0
    return-void
.end method
