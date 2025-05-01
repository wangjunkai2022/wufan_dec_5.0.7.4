.class Lcom/join/mgps/activity/SearchHintActivity$b;
.super Ljava/lang/Object;
.source "SearchHintActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchHintActivity;->O0(Landroid/content/Context;Lcom/join/mgps/dto/SearchGameZoneBean;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SearchGameZoneBean;

.field final synthetic c:Lcom/join/mgps/activity/SearchHintActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchHintActivity;Lcom/join/mgps/dto/SearchGameZoneBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$b;->c:Lcom/join/mgps/activity/SearchHintActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$b;->b:Lcom/join/mgps/dto/SearchGameZoneBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$b;->b:Lcom/join/mgps/dto/SearchGameZoneBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/SearchGameZoneBean;->getZone_id()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$b;->c:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$b;->b:Lcom/join/mgps/dto/SearchGameZoneBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SearchGameZoneBean;->getZone_name()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/activity/SearchHintActivity;->C0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {p1}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/16 v0, 0x21

    .line 4
    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$b;->b:Lcom/join/mgps/dto/SearchGameZoneBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SearchGameZoneBean;->getZone_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$b;->c:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/SearchHintActivity;->i0(Lcom/join/mgps/activity/SearchHintActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 7
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$b;->c:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/SearchHintActivity;->i0(Lcom/join/mgps/activity/SearchHintActivity;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->clickSearchRecommend:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v2, "0"

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method
