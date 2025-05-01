.class public final Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;
.super Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;
.source "BtReginAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter<",
        "Lcom/psk/kotlin/util/CommonListMainData;",
        "Landroidx/databinding/ViewDataBinding;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBtReginAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BtReginAdapter.kt\ncom/join/kotlin/ui/modleregin/adapter/BtReginAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1#2:245\n1855#3,2:246\n*S KotlinDebug\n*F\n+ 1 BtReginAdapter.kt\ncom/join/kotlin/ui/modleregin/adapter/BtReginAdapter\n*L\n136#1:246,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBtReginAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BtReginAdapter.kt\ncom/join/kotlin/ui/modleregin/adapter/BtReginAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1#2:245\n1855#3,2:246\n*S KotlinDebug\n*F\n+ 1 BtReginAdapter.kt\ncom/join/kotlin/ui/modleregin/adapter/BtReginAdapter\n*L\n136#1:246,2\n*E\n"
    }
.end annotation


# instance fields
.field private context:Landroidx/appcompat/app/AppCompatActivity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final videoHelper:Lcom/join/android/app/component/video/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Lcom/join/android/app/component/video/c;)V
    .locals 1
    .param p1    # Landroidx/appcompat/app/AppCompatActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/android/app/component/video/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "videoHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p1, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->context:Landroidx/appcompat/app/AppCompatActivity;

    iput-object p2, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->videoHelper:Lcom/join/android/app/component/video/c;

    return-void
.end method


# virtual methods
.method public final getContext()Landroidx/appcompat/app/AppCompatActivity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->context:Landroidx/appcompat/app/AppCompatActivity;

    return-object v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->getListDatas()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    const/16 p1, 0x3e7

    goto :goto_2

    .line 2
    :cond_2
    invoke-virtual {p0}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->getListDatas()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/psk/kotlin/util/CommonListMainData;

    invoke-virtual {p1}, Lcom/psk/kotlin/util/CommonListMainData;->getType()I

    move-result p1

    :goto_2
    return p1
.end method

.method protected getLayoutResId(I)I
    .locals 0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const p1, 0x7f0c0165

    return p1

    :pswitch_1
    const p1, 0x7f0c0161

    return p1

    :pswitch_2
    const p1, 0x7f0c00e7

    return p1

    :pswitch_3
    const p1, 0x7f0c00ee

    return p1

    :pswitch_4
    const p1, 0x7f0c00ec

    return p1

    :pswitch_5
    const p1, 0x7f0c00ed

    return p1

    :pswitch_6
    const p1, 0x7f0c00e8

    return p1

    :pswitch_7
    const p1, 0x7f0c0166

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final getVideoHelper()Lcom/join/android/app/component/video/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->videoHelper:Lcom/join/android/app/component/video/c;

    return-object v0
.end method

.method protected onBindItem(Landroidx/databinding/ViewDataBinding;Lcom/psk/kotlin/util/CommonListMainData;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 11
    .param p1    # Landroidx/databinding/ViewDataBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/psk/kotlin/util/CommonListMainData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p3, "binding"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getType()I

    move-result p3

    const/4 v0, 0x0

    const/16 v1, 0x11

    const/16 v2, 0x9

    const/16 v3, 0x1c

    const/4 v4, 0x1

    packed-switch p3, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_4

    .line 3
    :pswitch_1
    move-object p3, p1

    check-cast p3, Lcom/join/android/app/mgsim/wufun/databinding/DatabBtHviewlistBinding;

    .line 4
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type kotlin.collections.List<com.join.kotlin.ui.modleregin.modle.BtTagSelecterBean>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/List;

    .line 5
    new-instance p3, Lcom/join/kotlin/ui/modleregin/adapter/BtTaglistAdapter;

    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->context:Landroidx/appcompat/app/AppCompatActivity;

    invoke-direct {p3, v0}, Lcom/join/kotlin/ui/modleregin/adapter/BtTaglistAdapter;-><init>(Landroid/content/Context;)V

    .line 6
    invoke-virtual {p1, v4, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 7
    invoke-virtual {p1, v3, p2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 8
    sget-object p1, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter$onBindItem$7;->INSTANCE:Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter$onBindItem$7;

    invoke-virtual {p3, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->setOnItemClickListener(Lkotlin/jvm/functions/Function3;)V

    goto/16 :goto_4

    .line 9
    :pswitch_2
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type kotlin.collections.List<com.join.mgps.business.CollectionBeanSubBusiness>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/List;

    .line 10
    invoke-virtual {p1, v3, p2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 11
    move-object p2, p1

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/BtHrecyclerviewGamelistLayoutBinding;

    .line 12
    iget-object p3, p2, Lcom/join/android/app/mgsim/wufun/databinding/BtHrecyclerviewGamelistLayoutBinding;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p3

    if-nez p3, :cond_0

    .line 13
    new-instance p2, Lcom/join/kotlin/ui/modleregin/adapter/HGamelistAdapter;

    iget-object p3, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->context:Landroidx/appcompat/app/AppCompatActivity;

    invoke-direct {p2, p3}, Lcom/join/kotlin/ui/modleregin/adapter/HGamelistAdapter;-><init>(Landroid/content/Context;)V

    .line 14
    new-instance p3, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter$onBindItem$3;

    invoke-direct {p3, p0}, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter$onBindItem$3;-><init>(Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;)V

    invoke-virtual {p2, p3}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->setOnItemClickListener(Lkotlin/jvm/functions/Function3;)V

    .line 15
    invoke-virtual {p1, v4, p2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    goto/16 :goto_4

    .line 16
    :cond_0
    iget-object p1, p2, Lcom/join/android/app/mgsim/wufun/databinding/BtHrecyclerviewGamelistLayoutBinding;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    goto/16 :goto_4

    .line 17
    :pswitch_3
    move-object p3, p1

    check-cast p3, Lcom/join/android/app/mgsim/wufun/databinding/BtViewpagerLayoutBinding;

    .line 18
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type kotlin.collections.List<com.join.kotlin.ui.modleregin.modle.BtOnlineGame>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/List;

    .line 19
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;

    .line 22
    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;->getOnlineTime()J

    move-result-wide v5

    const/16 v3, 0x3e8

    int-to-long v7, v3

    mul-long v5, v5, v7

    .line 23
    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;->getGameEntityList()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v3, 0x1

    :goto_2
    if-nez v3, :cond_1

    .line 24
    invoke-static {v5, v6}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string/jumbo v3, "\u4eca\u5929"

    goto :goto_3

    :cond_4
    const v3, 0x5265c00

    int-to-long v7, v3

    sub-long v9, v5, v7

    .line 25
    invoke-static {v9, v10}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string/jumbo v3, "\u660e\u5929"

    goto :goto_3

    :cond_5
    add-long/2addr v7, v5

    .line 26
    invoke-static {v7, v8}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string/jumbo v3, "\u6628\u5929"

    goto :goto_3

    :cond_6
    const-string v3, "MM-dd"

    .line 27
    invoke-static {v5, v6, v3}, Lcom/join/mgps/Util/y;->y(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_3
    const-string/jumbo v5, "timeShow"

    .line 28
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    new-instance v3, Lcom/join/kotlin/ui/modleregin/GameListFragment;

    invoke-direct {v3}, Lcom/join/kotlin/ui/modleregin/GameListFragment;-><init>()V

    .line 30
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 31
    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;->getOnlineTime()J

    move-result-wide v6

    const-string/jumbo v2, "time"

    invoke-virtual {v5, v2, v6, v7}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 32
    invoke-virtual {v3, v5}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 33
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    const/16 p2, 0xb

    .line 34
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->context:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    const/16 p2, 0x1f

    .line 35
    invoke-virtual {p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    const/16 p2, 0xc

    .line 36
    invoke-virtual {p1, p2, v1}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    const/16 p2, 0x23

    .line 37
    move-object p3, p1

    check-cast p3, Lcom/join/android/app/mgsim/wufun/databinding/BtViewpagerLayoutBinding;

    iget-object v0, p3, Lcom/join/android/app/mgsim/wufun/databinding/BtViewpagerLayoutBinding;->c:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, p2, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 38
    iget-object p1, p3, Lcom/join/android/app/mgsim/wufun/databinding/BtViewpagerLayoutBinding;->c:Landroidx/viewpager/widget/ViewPager;

    new-instance p2, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter$onBindItem$6;

    invoke-direct {p2}, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter$onBindItem$6;-><init>()V

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    goto/16 :goto_4

    .line 39
    :pswitch_4
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type kotlin.collections.List<com.join.mgps.dto.BannerBean>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/List;

    .line 40
    invoke-virtual {p1, v3, p2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 41
    new-instance p2, Lcom/join/kotlin/ui/modleregin/adapter/HTagAdapter;

    iget-object p3, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->context:Landroidx/appcompat/app/AppCompatActivity;

    invoke-direct {p2, p3}, Lcom/join/kotlin/ui/modleregin/adapter/HTagAdapter;-><init>(Landroid/content/Context;)V

    .line 42
    new-instance p3, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter$onBindItem$4;

    invoke-direct {p3, p0}, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter$onBindItem$4;-><init>(Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;)V

    invoke-virtual {p2, p3}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->setOnItemClickListener(Lkotlin/jvm/functions/Function3;)V

    .line 43
    invoke-virtual {p1, v4, p2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    goto/16 :goto_4

    .line 44
    :pswitch_5
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.MustplayItemBean"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;

    .line 45
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getGameinfo()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v0

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getReMarks()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    const/16 v0, 0x21

    .line 46
    iget-object v3, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->videoHelper:Lcom/join/android/app/component/video/c;

    invoke-virtual {p1, v0, v3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 47
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getGameinfo()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v3

    .line 49
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getReMarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Lcom/join/mgps/dto/ExtBean;->setReMarks(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    .line 50
    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 51
    invoke-virtual {p1, v2, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 52
    new-instance p2, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;

    .line 53
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getPosition()I

    move-result v2

    .line 54
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getGame_info_top_video_url()Ljava/lang/String;

    move-result-object v3

    .line 55
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getVideoCover()Ljava/lang/String;

    move-result-object v4

    .line 56
    invoke-direct {p2, v2, v3, v0, v4}, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;-><init>(ILjava/lang/String;Lcom/join/mgps/Util/IntentDateBean;Ljava/lang/String;)V

    const/16 v0, 0x20

    .line 57
    invoke-virtual {p1, v0, p2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 58
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getShowWhiteBack()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    goto :goto_4

    .line 59
    :pswitch_6
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p3

    const-string v1, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.BtGameListItem"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;

    const/4 v1, 0x3

    .line 60
    invoke-virtual {p1, v1, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 61
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getGameInfo()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v1

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getReMarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    .line 62
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getAppitemShow()Lcom/join/kotlin/domain/common/AppListItemShowBean;

    move-result-object p2

    if-nez p2, :cond_8

    .line 63
    new-instance p2, Lcom/join/kotlin/domain/common/AppListItemShowBean;

    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getGameInfo()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v1

    invoke-direct {p2, v1, v0}, Lcom/join/kotlin/domain/common/AppListItemShowBean;-><init>(Lcom/join/mgps/business/CollectionBeanSubBusiness;Z)V

    invoke-virtual {p3, p2}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->setAppitemShow(Lcom/join/kotlin/domain/common/AppListItemShowBean;)V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 64
    :cond_8
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getAppitemShow()Lcom/join/kotlin/domain/common/AppListItemShowBean;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getGameInfo()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/kotlin/domain/common/AppListItemShowBean;->updateItemNormal(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    :cond_9
    const/16 p2, 0x13

    .line 65
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getAppitemShow()Lcom/join/kotlin/domain/common/AppListItemShowBean;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    goto :goto_4

    .line 66
    :pswitch_7
    new-instance p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.TitleModle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/modleregin/modle/TitleModle;

    iput-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 67
    invoke-virtual {p1, v2, p2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    const/4 p2, 0x7

    .line 68
    new-instance v0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter$onBindItem$1;

    invoke-direct {v0, p1, p3}, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter$onBindItem$1;-><init>(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p1, p2, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 69
    iget-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lcom/join/kotlin/ui/modleregin/modle/TitleModle;

    invoke-virtual {p2}, Lcom/join/kotlin/ui/modleregin/modle/TitleModle;->getShowWhiteBack()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    :cond_a
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public bridge synthetic onBindItem(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/psk/kotlin/util/CommonListMainData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->onBindItem(Landroidx/databinding/ViewDataBinding;Lcom/psk/kotlin/util/CommonListMainData;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method protected onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Lcom/psk/kotlin/util/CommonListMainData;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 3
    .param p1    # Landroidx/databinding/ViewDataBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/psk/kotlin/util/CommonListMainData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p3, "binding"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getType()I

    move-result p3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_1

    const/4 v0, 0x4

    if-eq p3, v0, :cond_0

    goto/16 :goto_0

    .line 3
    :cond_0
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/MustplayItemLayoutBinding;

    .line 4
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.MustplayItemBean"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;

    .line 5
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getGameinfo()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v0

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getReMarks()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1, p3}, Lcom/join/android/app/mgsim/wufun/databinding/MustplayItemLayoutBinding;->h(Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;)V

    .line 7
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getGameinfo()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    .line 9
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getReMarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/join/mgps/dto/ExtBean;->setReMarks(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    .line 10
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 11
    new-instance p2, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;

    .line 12
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getPosition()I

    move-result v1

    .line 13
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getVideoUrl()Ljava/lang/String;

    move-result-object v2

    .line 14
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;->getVideoCover()Ljava/lang/String;

    move-result-object p3

    .line 15
    invoke-direct {p2, v1, v2, v0, p3}, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;-><init>(ILjava/lang/String;Lcom/join/mgps/Util/IntentDateBean;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/MustplayItemLayoutBinding;->i(Lcom/join/kotlin/ui/modleregin/modle/VideoModle;)V

    .line 16
    iget-object p2, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->videoHelper:Lcom/join/android/app/component/video/c;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/MustplayItemLayoutBinding;->j(Lcom/join/android/app/component/video/c;)V

    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.BtGameListItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;

    .line 18
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getGameInfo()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v0

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getReMarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    const/4 p2, 0x3

    .line 19
    invoke-virtual {p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 20
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getAppitemShow()Lcom/join/kotlin/domain/common/AppListItemShowBean;

    move-result-object p2

    if-nez p2, :cond_2

    .line 21
    new-instance p2, Lcom/join/kotlin/domain/common/AppListItemShowBean;

    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getGameInfo()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p2, v0, v1}, Lcom/join/kotlin/domain/common/AppListItemShowBean;-><init>(Lcom/join/mgps/business/CollectionBeanSubBusiness;Z)V

    invoke-virtual {p3, p2}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->setAppitemShow(Lcom/join/kotlin/domain/common/AppListItemShowBean;)V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    :cond_2
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getAppitemShow()Lcom/join/kotlin/domain/common/AppListItemShowBean;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getGameInfo()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    const-string v1, "data.gameInfo.downloadTask"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/join/kotlin/domain/common/AppListItemShowBean;->updateItemProgress(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_3
    const/16 p2, 0x13

    .line 23
    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;->getAppitemShow()Lcom/join/kotlin/domain/common/AppListItemShowBean;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public bridge synthetic onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/psk/kotlin/util/CommonListMainData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Lcom/psk/kotlin/util/CommonListMainData;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public final setContext(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 1
    .param p1    # Landroidx/appcompat/app/AppCompatActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;->context:Landroidx/appcompat/app/AppCompatActivity;

    return-void
.end method
