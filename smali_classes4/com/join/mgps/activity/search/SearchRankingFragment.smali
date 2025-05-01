.class public Lcom/join/mgps/activity/search/SearchRankingFragment;
.super Landroidx/fragment/app/Fragment;
.source "SearchRankingFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;,
        Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0737
.end annotation


# instance fields
.field activity:Lcom/join/mgps/activity/SearchHintActivity;

.field adapter:Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;

.field hotAdInfo:Lcom/join/mgps/activity/search/SearchHotAdInfo;

.field hotAdPosition:I

.field listDatas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field recyclerView:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field type:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/16 v0, 0x3e7

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdPosition:I

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->type:I

    return-void
.end method

.method public static getInstance(I)Lcom/join/mgps/activity/search/SearchRankingFragment;
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/search/SearchRankingFragment_;

    invoke-direct {v0}, Lcom/join/mgps/activity/search/SearchRankingFragment_;-><init>()V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "type"

    .line 3
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 4
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method afterVidew()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "type"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->type:I

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;-><init>(Lcom/join/mgps/activity/search/SearchRankingFragment;)V

    iput-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->adapter:Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/SearchHintActivity;

    iput-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->activity:Lcom/join/mgps/activity/SearchHintActivity;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->activity:Lcom/join/mgps/activity/SearchHintActivity;

    iget v2, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->type:I

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/SearchHintActivity;->y0(I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->activity:Lcom/join/mgps/activity/SearchHintActivity;

    iget v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->type:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/SearchHintActivity;->x0(I)Lcom/join/mgps/activity/search/SearchHotAdInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdInfo:Lcom/join/mgps/activity/search/SearchHotAdInfo;

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/activity/search/SearchHotAdInfo;->getJump_ad_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdInfo:Lcom/join/mgps/activity/search/SearchHotAdInfo;

    invoke-virtual {v0}, Lcom/join/mgps/activity/search/SearchHotAdInfo;->getPosition()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdPosition:I

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    iget-object v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdInfo:Lcom/join/mgps/activity/search/SearchHotAdInfo;

    invoke-virtual {v1}, Lcom/join/mgps/activity/search/SearchHotAdInfo;->getJump_ad_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    iget v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdPosition:I

    iget-object v2, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdInfo:Lcom/join/mgps/activity/search/SearchHotAdInfo;

    invoke-virtual {v2}, Lcom/join/mgps/activity/search/SearchHotAdInfo;->getJump_ad_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 14
    :goto_0
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdInfo:Lcom/join/mgps/activity/search/SearchHotAdInfo;

    invoke-virtual {v1}, Lcom/join/mgps/activity/search/SearchHotAdInfo;->getJump_ad_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 16
    new-instance v1, Lcom/papa/sim/statistic/Data;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 17
    iget-object v2, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdInfo:Lcom/join/mgps/activity/search/SearchHotAdInfo;

    invoke-virtual {v2}, Lcom/join/mgps/activity/search/SearchHotAdInfo;->getJump_ad_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Data;->setWhere(Ljava/lang/String;)Lcom/papa/sim/statistic/Data;

    .line 18
    iget-object v2, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->activity:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->hotSearchWordExp:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v2, v3, v0, v1}, Lcom/papa/sim/statistic/p;->T1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    .line 19
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment;->adapter:Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method
