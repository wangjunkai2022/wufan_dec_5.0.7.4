.class Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$2;
.super Ljava/lang/Object;
.source "SearchRankingFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->onBindViewHolder(Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;

.field final synthetic val$gameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$2;->this$1:Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;

    iput-object p2, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$2;->val$gameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$2;->this$1:Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;

    iget-object v0, v0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/search/SearchRankingFragment;->activity:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$2;->val$gameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$2;->this$1:Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;

    iget-object v0, v0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdInfo:Lcom/join/mgps/activity/search/SearchHotAdInfo;

    invoke-virtual {v0}, Lcom/join/mgps/activity/search/SearchHotAdInfo;->getJump_ad_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance v0, Lcom/papa/sim/statistic/Data;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$2;->this$1:Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;

    iget-object v1, v1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v1, v1, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdInfo:Lcom/join/mgps/activity/search/SearchHotAdInfo;

    invoke-virtual {v1}, Lcom/join/mgps/activity/search/SearchHotAdInfo;->getJump_ad_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Data;->setWhere(Ljava/lang/String;)Lcom/papa/sim/statistic/Data;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$2;->this$1:Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;

    iget-object v1, v1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v1, v1, Lcom/join/mgps/activity/search/SearchRankingFragment;->activity:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->hotSearchWordClick:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1, v2, p1, v0}, Lcom/papa/sim/statistic/p;->T1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    return-void
.end method
