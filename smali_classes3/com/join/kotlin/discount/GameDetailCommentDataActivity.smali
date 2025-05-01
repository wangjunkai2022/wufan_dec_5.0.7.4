.class public final Lcom/join/kotlin/discount/GameDetailCommentDataActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbActivity;
.source "GameDetailCommentDataActivity.kt"

# interfaces
.implements Lcom/join/kotlin/discount/proxy/GameDetailCommentDataClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbActivity<",
        "Lcom/join/kotlin/discount/viewmodel/GameDetailCommentDataViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;",
        ">;",
        "Lcom/join/kotlin/discount/proxy/GameDetailCommentDataClickProxy;"
    }
.end annotation


# instance fields
.field private dataBean:Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private defaultIndex:I

.field private tabTitles:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->tabTitles:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic f0(Lcom/join/kotlin/discount/GameDetailCommentDataActivity;Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->initTabAndViewpager$lambda$0(Lcom/join/kotlin/discount/GameDetailCommentDataActivity;Lcom/google/android/material/tabs/TabLayout$Tab;I)V

    return-void
.end method

.method private static final initTabAndViewpager$lambda$0(Lcom/join/kotlin/discount/GameDetailCommentDataActivity;Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->tabTitles:Ljava/util/ArrayList;

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Lcom/google/android/material/tabs/TabLayout$Tab;->setText(Ljava/lang/CharSequence;)Lcom/google/android/material/tabs/TabLayout$Tab;

    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 0

    return-void
.end method

.method public final getDataBean()Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->dataBean:Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;

    return-object v0
.end method

.method public final getDefaultIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->defaultIndex:I

    return v0
.end method

.method public final initTabAndViewpager(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->dataBean:Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;->getAvg_duration()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-nez v0, :cond_3

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->tabTitles:Ljava/util/ArrayList;

    const-string/jumbo v1, "\u65f6\u957f\u6570\u636e"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 3
    :cond_3
    iget v0, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->defaultIndex:I

    if-ne v0, v2, :cond_4

    iput v1, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->defaultIndex:I

    .line 4
    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->tabTitles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 6
    :cond_5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;->f:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v1, Lcom/join/kotlin/discount/adapter/CommentDataViewpagerAdapter;

    iget-object v2, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->tabTitles:Ljava/util/ArrayList;

    invoke-direct {v1, v2, p1, p0}, Lcom/join/kotlin/discount/adapter/CommentDataViewpagerAdapter;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 7
    new-instance p1, Lcom/google/android/material/tabs/TabLayoutMediator;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;->e:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 8
    new-instance v2, Lcom/join/kotlin/discount/a;

    invoke-direct {v2, p0}, Lcom/join/kotlin/discount/a;-><init>(Lcom/join/kotlin/discount/GameDetailCommentDataActivity;)V

    .line 9
    invoke-direct {p1, v0, v1, v2}, Lcom/google/android/material/tabs/TabLayoutMediator;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/TabLayoutMediator$TabConfigurationStrategy;)V

    .line 10
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayoutMediator;->attach()V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;->f:Landroidx/viewpager2/widget/ViewPager2;

    iget v0, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->defaultIndex:I

    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    return-void
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentDataViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;->h(Lcom/join/kotlin/discount/viewmodel/GameDetailCommentDataViewModel;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityGameDetailCommentDataBinding;->g(Lcom/join/kotlin/discount/proxy/GameDetailCommentDataClickProxy;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "commentData"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v2, "defaultIndex"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    :cond_1
    iput v1, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->defaultIndex:I

    .line 6
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    .line 7
    const-class v1, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;

    invoke-virtual {v0, p1, v1}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;

    .line 8
    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->dataBean:Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;

    .line 9
    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->initTabAndViewpager(Ljava/lang/String;)V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final setDataBean(Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->dataBean:Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;

    return-void
.end method

.method public final setDefaultIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/discount/GameDetailCommentDataActivity;->defaultIndex:I

    return-void
.end method
