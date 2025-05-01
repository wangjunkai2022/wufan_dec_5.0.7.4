.class Lcom/join/mgps/activity/SearchListActivity1$d;
.super Ljava/lang/Object;
.source "SearchListActivity1.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchListActivity1;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/SearchListActivity1;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchListActivity1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

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
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-static {p1}, Lcom/join/mgps/activity/SearchListActivity1;->i0(Lcom/join/mgps/activity/SearchListActivity1;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchListActivity1;->i:Landroid/widget/ListView;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/ListView;->setVisibility(I)V

    .line 3
    instance-of p2, p1, Lcom/join/mgps/dto/SearchAutoDataBean;

    if-eqz p2, :cond_0

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    const/4 p3, 0x0

    iput-boolean p3, p2, Lcom/join/mgps/activity/SearchListActivity1;->F:Z

    .line 5
    check-cast p1, Lcom/join/mgps/dto/SearchAutoDataBean;

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/SearchAutoDataBean;->getGame_name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p2

    .line 7
    iget-object p3, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {p1}, Lcom/join/mgps/dto/SearchAutoDataBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p3, Lcom/join/mgps/activity/SearchListActivity1;->q:Ljava/lang/String;

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-static {p1, p2}, Lcom/join/mgps/activity/SearchListActivity1;->j0(Lcom/join/mgps/activity/SearchListActivity1;Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    iget-object p1, p1, Lcom/join/mgps/activity/SearchListActivity1;->f:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    iget-object p1, p1, Lcom/join/mgps/activity/SearchListActivity1;->f:Landroid/widget/EditText;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setSelection(I)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {p1}, Lcom/join/mgps/activity/SearchListActivity1;->B0()V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    iget-object p1, p1, Lcom/join/mgps/activity/SearchListActivity1;->f:Landroid/widget/EditText;

    invoke-static {p1}, Lo2/a;->b(Landroid/view/View;)V

    goto/16 :goto_0

    .line 13
    :cond_0
    instance-of p2, p1, Lcom/join/mgps/dto/CollectionBeanSub;

    if-eqz p2, :cond_1

    .line 14
    check-cast p1, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 15
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-static {p3}, Lcom/join/mgps/activity/SearchListActivity1;->k0(Lcom/join/mgps/activity/SearchListActivity1;)Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p2, p3, p4}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 16
    new-instance p2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string p3, "searchSuggest"

    .line 17
    invoke-virtual {p2, p3}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 18
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-static {p1}, Lcom/join/mgps/activity/SearchListActivity1;->k0(Lcom/join/mgps/activity/SearchListActivity1;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p3, Lcom/papa/sim/statistic/Event;->clickDetailFromSearchResult:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1, p3, p2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_0

    .line 20
    :cond_1
    instance-of p2, p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz p2, :cond_5

    .line 21
    check-cast p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-nez p1, :cond_2

    return-void

    .line 22
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->isAdInfo()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 23
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-static {p3}, Lcom/join/mgps/activity/SearchListActivity1;->k0(Lcom/join/mgps/activity/SearchListActivity1;)Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p2, p3, p4}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 24
    iget-object p2, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    sget-object p3, Lcom/papa/sim/statistic/Event;->searchThinkAdWordClick:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p4}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object p1

    const-string p5, "2"

    invoke-static {p2, p3, p5, p4, p1}, Lcom/join/mgps/activity/SearchListActivity1;->l0(Lcom/join/mgps/activity/SearchListActivity1;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 25
    :cond_3
    iget-object p2, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchListActivity1;->f:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 26
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object p3

    if-eqz p3, :cond_4

    .line 27
    iget-object p3, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object p4

    invoke-virtual {p4}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p3, Lcom/join/mgps/activity/SearchListActivity1;->q:Ljava/lang/String;

    .line 28
    :cond_4
    iget-object p3, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-static {p3, p2}, Lcom/join/mgps/activity/SearchListActivity1;->j0(Lcom/join/mgps/activity/SearchListActivity1;Ljava/lang/String;)V

    .line 29
    iget-object p2, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {p2}, Lcom/join/mgps/activity/SearchListActivity1;->B0()V

    .line 30
    iget-object p2, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchListActivity1;->f:Landroid/widget/EditText;

    invoke-static {p2}, Lo2/a;->b(Landroid/view/View;)V

    .line 31
    iget-object p2, p0, Lcom/join/mgps/activity/SearchListActivity1$d;->b:Lcom/join/mgps/activity/SearchListActivity1;

    sget-object p3, Lcom/papa/sim/statistic/Event;->searchThinkAdWordClick:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p4}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object p1

    const-string p5, "1"

    invoke-static {p2, p3, p5, p4, p1}, Lcom/join/mgps/activity/SearchListActivity1;->l0(Lcom/join/mgps/activity/SearchListActivity1;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method
