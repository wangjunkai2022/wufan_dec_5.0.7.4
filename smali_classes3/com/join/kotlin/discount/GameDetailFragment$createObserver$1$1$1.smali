.class final Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;->invoke(Lcom/join/kotlin/base/state/ResultState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailFragment.kt\ncom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1080:1\n1855#2,2:1081\n1855#2,2:1083\n*S KotlinDebug\n*F\n+ 1 GameDetailFragment.kt\ncom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1\n*L\n482#1:1081,2\n492#1:1083,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailFragment.kt\ncom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1080:1\n1855#2,2:1081\n1855#2,2:1083\n*S KotlinDebug\n*F\n+ 1 GameDetailFragment.kt\ncom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1\n*L\n482#1:1081,2\n492#1:1083,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1;->invoke(Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;)V
    .locals 10
    .param p1    # Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1a

    .line 2
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;->getDiscount_data()Lcom/join/kotlin/discount/model/bean/GameDetailBean;

    move-result-object p1

    if-eqz p1, :cond_1a

    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    .line 3
    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getLoadSir$p(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/kingja/loadsir/core/b;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "loadSir"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/kingja/loadsir/core/b;->h()V

    .line 4
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getDefaultBtnImage()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_4

    .line 5
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->getBasic_info()Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v5

    check-cast v5, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v5}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getDefaultBtnImage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;->setDownload_btn_pic(Ljava/lang/String;)V

    .line 6
    :cond_4
    :goto_2
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->getTop_bg_color()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, "#503835"

    :cond_5
    invoke-static {v0, v1}, Lcom/join/kotlin/discount/GameDetailFragment;->access$setTopBgColor$p(Lcom/join/kotlin/discount/GameDetailFragment;Ljava/lang/String;)V

    .line 7
    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailFragment;->access$setTopMask(Lcom/join/kotlin/discount/GameDetailFragment;)V

    .line 8
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 9
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getGameInfo()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->getBasic_info()Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;->getOn_off()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_7

    const/4 v1, 0x1

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v1, 0x0

    :goto_4
    const/4 v5, 0x2

    if-eqz v1, :cond_8

    .line 11
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getProgress()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getBtnText()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    const-string/jumbo v6, "\u5df2\u4e0b\u67b6"

    invoke-virtual {v1, v6}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 13
    :cond_8
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->getBooking_info()Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;->getGame_status()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v5, :cond_a

    const/4 v1, 0x1

    goto :goto_6

    :cond_a
    :goto_5
    const/4 v1, 0x0

    :goto_6
    if-eqz v1, :cond_b

    .line 14
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getProgress()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 15
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getBtnText()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    const-string/jumbo v6, "\u5373\u5c06\u4e0a\u7ebf"

    invoke-virtual {v1, v6}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 16
    :cond_b
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->getBasic_info()Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    move-result-object v1

    const-wide/16 v6, 0x0

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;->getApp_size()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_7

    :cond_c
    move-wide v8, v6

    :goto_7
    cmp-long v1, v8, v6

    if-lez v1, :cond_11

    .line 17
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getDownloadTask()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 18
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getDownloadTask()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    if-nez v1, :cond_d

    const/4 v1, 0x1

    goto :goto_8

    :cond_d
    const/4 v1, 0x0

    :goto_8
    if-nez v1, :cond_10

    .line 19
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getDownloadTask()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/4 v6, 0x7

    if-ne v1, v6, :cond_e

    const/4 v1, 0x1

    goto :goto_9

    :cond_e
    const/4 v1, 0x0

    :goto_9
    if-nez v1, :cond_10

    .line 20
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getDownloadTask()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/4 v6, 0x6

    if-ne v1, v6, :cond_f

    const/4 v1, 0x1

    goto :goto_a

    :cond_f
    const/4 v1, 0x0

    :goto_a
    if-eqz v1, :cond_11

    .line 21
    :cond_10
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getProgress()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    const/16 v6, 0x64

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 22
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getBtnText()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    const-string/jumbo v6, "\u4e0b\u8f7d"

    invoke-virtual {v1, v6}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 23
    :cond_11
    :goto_b
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->getPic_video_info()Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    move-result-object v6

    if-eqz v6, :cond_16

    .line 25
    invoke-virtual {v6}, Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;->getVideo_url()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_12

    .line 26
    new-instance v7, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;

    invoke-direct {v7, v3, v6}, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;-><init>(ILjava/lang/Object;)V

    .line 27
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    :cond_12
    invoke-virtual {v6}, Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;->getPic_position()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_13

    goto :goto_d

    :cond_13
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-nez v7, :cond_14

    .line 29
    invoke-virtual {v6}, Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;->getPics()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_16

    .line 30
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 31
    new-instance v8, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;

    invoke-direct {v8, v5, v7}, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;-><init>(ILjava/lang/Object;)V

    .line 32
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 33
    :cond_14
    :goto_d
    invoke-virtual {v6}, Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;->getPic_position()Ljava/lang/Integer;

    move-result-object v5

    if-nez v5, :cond_15

    goto :goto_f

    :cond_15
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_16

    .line 34
    invoke-virtual {v6}, Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;->getPics()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_16

    .line 35
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 36
    new-instance v7, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;

    const/4 v8, 0x4

    invoke-direct {v7, v8, v6}, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;-><init>(ILjava/lang/Object;)V

    .line 37
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 38
    :cond_16
    :goto_f
    new-instance v5, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;

    const/4 v6, 0x5

    invoke-direct {v5, v6, v2}, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;-><init>(ILjava/lang/Object;)V

    .line 39
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getBannerAdapter(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;->setClick(Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;)V

    .line 41
    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getBannerAdapter(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;

    move-result-object v5

    invoke-virtual {v5, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->submitList(Ljava/util/List;)V

    .line 42
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v5

    check-cast v5, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object v5, v5, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v5}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 43
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-gt v3, v1, :cond_18

    const/4 v5, 0x1

    .line 44
    :goto_10
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    const v7, 0x7f0c0387

    .line 45
    invoke-static {v6, v7, v2, v4}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    move-result-object v6

    const-string v7, "inflate(\n               \u2026                        )"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/join/android/app/mgsim/wufun/databinding/ItemDetailBannerIndicatorBinding;

    if-ne v5, v3, :cond_17

    const/4 v7, 0x1

    goto :goto_11

    :cond_17
    const/4 v7, 0x0

    .line 46
    :goto_11
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDetailBannerIndicatorBinding;->f(Ljava/lang/Boolean;)V

    .line 47
    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v7

    check-cast v7, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object v7, v7, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v6}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    if-eq v5, v1, :cond_18

    add-int/lit8 v5, v5, 0x1

    goto :goto_10

    .line 48
    :cond_18
    invoke-virtual {v0}, Lcom/join/kotlin/discount/GameDetailFragment;->playVideo()V

    .line 49
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->getBasic_info()Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    move-result-object v2

    if-eqz v2, :cond_19

    .line 51
    new-instance v3, Lcom/join/kotlin/discount/model/bean/GameDetailInfoItemBean;

    const v4, 0x7f080636

    .line 52
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 53
    invoke-virtual {v2}, Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;->getFit_age()Ljava/lang/String;

    move-result-object v5

    .line 54
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string/jumbo v7, "\u9002\u5408\u5e74\u9f84"

    .line 55
    invoke-direct {v3, v4, v7, v5, v6}, Lcom/join/kotlin/discount/model/bean/GameDetailInfoItemBean;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 56
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    new-instance v3, Lcom/join/kotlin/discount/model/bean/GameDetailInfoItemBean;

    const v4, 0x7f080639

    .line 58
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 59
    invoke-virtual {v2}, Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;->getCompany_name()Ljava/lang/String;

    move-result-object v5

    .line 60
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string/jumbo v8, "\u5382\u5546\u4fe1\u606f"

    .line 61
    invoke-direct {v3, v4, v8, v5, v7}, Lcom/join/kotlin/discount/model/bean/GameDetailInfoItemBean;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 62
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    new-instance v3, Lcom/join/kotlin/discount/model/bean/GameDetailInfoItemBean;

    const v4, 0x7f08063a

    .line 64
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 65
    invoke-virtual {v2}, Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;->getVer_name()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v5, "\u8f6f\u4ef6\u7248\u672c"

    .line 66
    invoke-direct {v3, v4, v5, v2, v7}, Lcom/join/kotlin/discount/model/bean/GameDetailInfoItemBean;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 67
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    new-instance v2, Lcom/join/kotlin/discount/model/bean/GameDetailInfoItemBean;

    const v3, 0x7f080637

    .line 69
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string/jumbo v4, "\u6743\u9650\u4fe1\u606f"

    const-string/jumbo v5, "\u67e5\u770b"

    .line 70
    invoke-direct {v2, v3, v4, v5, v6}, Lcom/join/kotlin/discount/model/bean/GameDetailInfoItemBean;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 71
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    new-instance v2, Lcom/join/kotlin/discount/model/bean/GameDetailInfoItemBean;

    const v3, 0x7f080638

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string/jumbo v4, "\u9690\u79c1\u653f\u7b56"

    .line 74
    invoke-direct {v2, v3, v4, v5, v6}, Lcom/join/kotlin/discount/model/bean/GameDetailInfoItemBean;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 75
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    :cond_19
    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getInfoAdapter(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/join/kotlin/discount/adapter/GameDetailInfoAdapter;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->submitList(Ljava/util/List;)V

    .line 77
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->getBenefits()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1a

    .line 78
    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getReleaseWelfareAdapter(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/join/kotlin/discount/adapter/GameDetailReleaseWelfareAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->submitList(Ljava/util/List;)V

    .line 79
    :cond_1a
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getAutoDownload()Z

    move-result p1

    if-eqz p1, :cond_1b

    .line 80
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/discount/GameDetailFragment;->downBtnClick()V

    .line 81
    :cond_1b
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {p1}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getShowNewServer$p(Lcom/join/kotlin/discount/GameDetailFragment;)Z

    move-result p1

    if-eqz p1, :cond_1c

    .line 82
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/discount/GameDetailFragment;->goServer()V

    :cond_1c
    return-void
.end method
