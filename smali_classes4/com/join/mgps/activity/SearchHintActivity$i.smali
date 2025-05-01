.class Lcom/join/mgps/activity/SearchHintActivity$i;
.super Ljava/lang/Object;
.source "SearchHintActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchHintActivity;->afterViews()V
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
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/SearchHintActivity;->g0(Lcom/join/mgps/activity/SearchHintActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    .line 2
    instance-of p2, p1, Lcom/join/mgps/dto/SearchAutoDataBean;

    const/4 p3, 0x2

    if-eqz p2, :cond_0

    .line 3
    check-cast p1, Lcom/join/mgps/dto/SearchAutoDataBean;

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/SearchAutoDataBean;->getGame_name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p2

    .line 5
    iget-object p4, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-virtual {p1}, Lcom/join/mgps/dto/SearchAutoDataBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p2, p5, p3}, Lcom/join/mgps/activity/SearchHintActivity;->D0(Ljava/lang/String;Ljava/lang/String;I)V

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/SearchAutoDataBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p1

    .line 7
    iget-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {p3, p2, p1}, Lcom/join/mgps/activity/SearchHintActivity;->h0(Lcom/join/mgps/activity/SearchHintActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-virtual {p2, p1}, Lcom/join/mgps/activity/SearchHintActivity;->Y0(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 9
    :cond_0
    instance-of p2, p1, Lcom/join/mgps/dto/CollectionBeanSub;

    if-eqz p2, :cond_1

    .line 10
    check-cast p1, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 11
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {p3}, Lcom/join/mgps/activity/SearchHintActivity;->i0(Lcom/join/mgps/activity/SearchHintActivity;)Landroid/content/Context;

    move-result-object p3

    iget-object p4, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p5

    invoke-virtual {p4, p5}, Lcom/join/mgps/activity/SearchHintActivity;->s0(Lcom/join/mgps/Util/IntentDateBean;)Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p2, p3, p4}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 12
    new-instance p2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string p3, "searchSuggest"

    .line 13
    invoke-virtual {p2, p3}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/SearchHintActivity;->i0(Lcom/join/mgps/activity/SearchHintActivity;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p3, Lcom/papa/sim/statistic/Event;->clickDetailFromSearchResult:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1, p3, p2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    .line 16
    :cond_1
    instance-of p2, p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz p2, :cond_4

    .line 17
    check-cast p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-nez p1, :cond_2

    return-void

    .line 18
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->isAdInfo()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 19
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {p3}, Lcom/join/mgps/activity/SearchHintActivity;->i0(Lcom/join/mgps/activity/SearchHintActivity;)Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p2, p3, p4}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 20
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    sget-object p3, Lcom/papa/sim/statistic/Event;->searchThinkAdWordClick:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p4}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object p1

    const-string p5, "2"

    invoke-static {p2, p3, p5, p4, p1}, Lcom/join/mgps/activity/SearchHintActivity;->j0(Lcom/join/mgps/activity/SearchHintActivity;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 21
    :cond_3
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchHintActivity;->j:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p4, ""

    .line 22
    iget-object p5, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-virtual {p5, p2, p4, p3}, Lcom/join/mgps/activity/SearchHintActivity;->D0(Ljava/lang/String;Ljava/lang/String;I)V

    .line 23
    iget-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {p3, p2, p4}, Lcom/join/mgps/activity/SearchHintActivity;->h0(Lcom/join/mgps/activity/SearchHintActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-virtual {p2, p4}, Lcom/join/mgps/activity/SearchHintActivity;->Y0(Ljava/lang/String;)V

    .line 25
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$i;->b:Lcom/join/mgps/activity/SearchHintActivity;

    sget-object p3, Lcom/papa/sim/statistic/Event;->searchThinkAdWordClick:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p4}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object p1

    const-string p5, "1"

    invoke-static {p2, p3, p5, p4, p1}, Lcom/join/mgps/activity/SearchHintActivity;->j0(Lcom/join/mgps/activity/SearchHintActivity;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method
