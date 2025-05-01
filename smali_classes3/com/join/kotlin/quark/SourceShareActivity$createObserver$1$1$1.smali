.class final Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceShareActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1;->invoke(Lcom/join/kotlin/base/state/ResultState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/quark/model/bean/SourceTabListBean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSourceShareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceShareActivity.kt\ncom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n29#2,2:269\n32#2,3:273\n29#2,2:276\n32#2,3:281\n1855#3,2:271\n1864#3,3:278\n1#4:284\n*S KotlinDebug\n*F\n+ 1 SourceShareActivity.kt\ncom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1\n*L\n104#1:269,2\n104#1:273,3\n126#1:276,2\n126#1:281,3\n108#1:271,2\n128#1:278,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSourceShareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceShareActivity.kt\ncom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n29#2,2:269\n32#2,3:273\n29#2,2:276\n32#2,3:281\n1855#3,2:271\n1864#3,3:278\n1#4:284\n*S KotlinDebug\n*F\n+ 1 SourceShareActivity.kt\ncom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1\n*L\n104#1:269,2\n104#1:273,3\n126#1:276,2\n126#1:281,3\n108#1:271,2\n128#1:278,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/SourceShareActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/SourceShareActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/join/kotlin/quark/SourceShareActivity;Ljava/util/List;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1;->invoke$lambda$10$lambda$2$lambda$1(Lcom/join/kotlin/quark/SourceShareActivity;Ljava/util/List;I)V

    return-void
.end method

.method private static final invoke$lambda$10$lambda$2$lambda$1(Lcom/join/kotlin/quark/SourceShareActivity;Ljava/util/List;I)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    .line 2
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/quark/model/bean/SourceTabListBean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1;->invoke(Lcom/join/kotlin/quark/model/bean/SourceTabListBean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/quark/model/bean/SourceTabListBean;)V
    .locals 12
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceTabListBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    invoke-static {v1}, Lcom/join/kotlin/quark/SourceShareActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/SourceShareActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "loadSir"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1}, Lcom/kingja/loadsir/core/b;->h()V

    if-eqz p1, :cond_b

    .line 4
    iget-object v1, p0, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    .line 5
    invoke-virtual {p1}, Lcom/join/kotlin/quark/model/bean/SourceTabListBean;->getBanner()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 6
    invoke-virtual {v1}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v3

    check-cast v3, Lcom/join/kotlin/quark/viewmodel/SourceShareViewModel;

    invoke-virtual {v3}, Lcom/join/kotlin/quark/viewmodel/SourceShareViewModel;->getShowBanner()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 7
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 9
    invoke-virtual {v5}, Lcom/join/mgps/dto/CommonGameInfoBean;->getCoverPicUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v1}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v4

    check-cast v4, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareBinding;

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareBinding;->d:Lcom/youth/banner/Banner;

    invoke-virtual {v4, v3}, Lcom/youth/banner/Banner;->z(Ljava/util/List;)Lcom/youth/banner/Banner;

    move-result-object v3

    const/16 v4, 0x7d0

    .line 11
    invoke-virtual {v3, v4}, Lcom/youth/banner/Banner;->x(I)Lcom/youth/banner/Banner;

    move-result-object v3

    .line 12
    new-instance v4, Lcom/papa91/arc/view/GlideImageLoader;

    invoke-direct {v4}, Lcom/papa91/arc/view/GlideImageLoader;-><init>()V

    invoke-virtual {v3, v4}, Lcom/youth/banner/Banner;->y(Lcom/youth/banner/loader/ImageLoaderInterface;)Lcom/youth/banner/Banner;

    move-result-object v3

    .line 13
    new-instance v4, Lcom/join/kotlin/quark/s;

    invoke-direct {v4, v1, v2}, Lcom/join/kotlin/quark/s;-><init>(Lcom/join/kotlin/quark/SourceShareActivity;Ljava/util/List;)V

    invoke-virtual {v3, v4}, Lcom/youth/banner/Banner;->D(Lm3/b;)Lcom/youth/banner/Banner;

    move-result-object v2

    .line 14
    invoke-virtual {v2}, Lcom/youth/banner/Banner;->I()Lcom/youth/banner/Banner;

    goto :goto_1

    .line 15
    :cond_2
    invoke-virtual {v1}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/viewmodel/SourceShareViewModel;

    invoke-virtual {v2}, Lcom/join/kotlin/quark/viewmodel/SourceShareViewModel;->getShowBanner()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 16
    :goto_1
    invoke-virtual {v1}, Lcom/join/kotlin/quark/SourceShareActivity;->getFragments()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 17
    invoke-virtual {p1}, Lcom/join/kotlin/quark/model/bean/SourceTabListBean;->getTabs()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_8

    .line 18
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v4, 0x1

    if-gez v4, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v6, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;

    .line 19
    new-instance v8, Lcom/join/kotlin/quark/SourceShareFragment;

    invoke-direct {v8}, Lcom/join/kotlin/quark/SourceShareFragment;-><init>()V

    .line 20
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    if-eqz v6, :cond_4

    .line 21
    invoke-virtual {v6}, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;->getTab_id()Ljava/lang/Integer;

    move-result-object v10

    if-eqz v10, :cond_4

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    const-string v11, "_tab_id"

    .line 22
    invoke-virtual {v9, v11, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 23
    invoke-virtual {v8, v9}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 24
    new-instance v9, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    invoke-virtual {v6}, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 25
    invoke-virtual {v1}, Lcom/join/kotlin/quark/SourceShareActivity;->getFragments()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    if-eqz v6, :cond_5

    .line 26
    invoke-virtual {v6}, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;->getActive()Ljava/lang/Boolean;

    move-result-object v6

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    if-eqz v6, :cond_6

    move v5, v4

    :cond_6
    move v4, v7

    goto :goto_2

    :cond_7
    move v3, v5

    .line 27
    :cond_8
    invoke-virtual {v1}, Lcom/join/kotlin/quark/SourceShareActivity;->getAdapter()Lcom/join/mgps/adapter/FragmentPagerAdapter;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 28
    invoke-virtual {v1}, Lcom/join/kotlin/quark/SourceShareActivity;->getFragments()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->e(Ljava/util/List;)V

    .line 29
    invoke-virtual {v2}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 30
    :cond_9
    invoke-virtual {v1}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v2

    check-cast v2, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareBinding;

    iget-object v2, v2, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareBinding;->p:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2, v3}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 31
    invoke-virtual {p1}, Lcom/join/kotlin/quark/model/bean/SourceTabListBean;->getTabs()Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-static {v1, p1, v3}, Lcom/join/kotlin/quark/SourceShareActivity;->access$getView(Lcom/join/kotlin/quark/SourceShareActivity;Ljava/util/ArrayList;I)V

    .line 32
    :cond_a
    invoke-virtual {v1}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareBinding;->m:Lcom/google/android/material/tabs/TabLayout;

    new-instance v2, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1$1$7;

    invoke-direct {v2, v1}, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1$1$7;-><init>(Lcom/join/kotlin/quark/SourceShareActivity;)V

    invoke-virtual {p1, v2}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    .line 33
    invoke-virtual {v1}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/quark/viewmodel/SourceShareViewModel;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/quark/viewmodel/SourceShareViewModel;->setShowData(Ljava/util/List;)V

    :cond_b
    return-void
.end method
