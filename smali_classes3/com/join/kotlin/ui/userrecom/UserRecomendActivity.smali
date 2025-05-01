.class public final Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;
.super Lcom/join/kotlin/ui/base/BaseHasDownloadActivity;
.source "UserRecomendActivity.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUserRecomendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRecomendActivity.kt\ncom/join/kotlin/ui/userrecom/UserRecomendActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 UserRecomendActivity.kt\ncom/join/kotlin/ui/userrecom/UserRecomendActivity\n*L\n115#1:178,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUserRecomendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRecomendActivity.kt\ncom/join/kotlin/ui/userrecom/UserRecomendActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 UserRecomendActivity.kt\ncom/join/kotlin/ui/userrecom/UserRecomendActivity\n*L\n115#1:178,2\n*E\n"
    }
.end annotation


# instance fields
.field private adapter:Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public gestureDetector:Landroid/view/GestureDetector;

.field public manager:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public viewModle:Lcom/join/kotlin/ui/userrecom/RecomViewModle;

.field public viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivity;-><init>()V

    return-void
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g0(Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->onCreate$lambda$0(Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->onCreate$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreate$lambda$0(Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const-string/jumbo p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getGestureDetector()Landroid/view/GestureDetector;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onCreate$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getAdapter()Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->adapter:Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;

    return-object v0
.end method

.method public final getGestureDetector()Landroid/view/GestureDetector;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->gestureDetector:Landroid/view/GestureDetector;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "gestureDetector"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getManager()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->manager:Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "manager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->viewModle:Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "viewModle"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "viewdataBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final loadDatas()V
    .locals 6

    .line 1
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 3
    new-instance v1, Lcom/join/kotlin/ui/userrecom/UserRecomRequestArgs;

    invoke-direct {v1}, Lcom/join/kotlin/ui/userrecom/UserRecomRequestArgs;-><init>()V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->getDownloadTasksMap()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 5
    :goto_0
    iput-object v2, v1, Lcom/join/kotlin/ui/userrecom/UserRecomRequestArgs;->downloadedGameIdList:Ljava/util/List;

    .line 6
    new-instance v2, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v2, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->userLastStartAPP()Lorg/androidannotations/api/sharedpreferences/k;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "PrefDef_(this).userLastStartAPP().get()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    iput-wide v4, v1, Lcom/join/kotlin/ui/userrecom/UserRecomRequestArgs;->duration:J

    .line 8
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    iput v2, v1, Lcom/join/kotlin/ui/userrecom/UserRecomRequestArgs;->uid:I

    .line 9
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/kotlin/ui/userrecom/RecomViewModle;->getRequest()Lcom/join/kotlin/ui/userrecom/UserRecomRequest;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/kotlin/ui/userrecom/UserRecomRequest;->getUserRecomDatas(Lcom/join/mgps/dto/RequestModel;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c00a8

    .line 2
    invoke-static {p0, p1}, Landroidx/databinding/DataBindingUtil;->setContentView(Landroid/app/Activity;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    const-string v0, "setContentView(this, R.l\u2026ivity_userrecom_activity)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->setViewdataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;)V

    .line 3
    new-instance p1, Landroidx/lifecycle/ViewModelProvider;

    new-instance v0, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;

    invoke-direct {v0}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;-><init>()V

    invoke-direct {p1, p0, v0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v0, Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->setViewModle(Lcom/join/kotlin/ui/userrecom/RecomViewModle;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;->d:Landroid/widget/RelativeLayout;

    new-instance v0, Lcom/join/kotlin/ui/userrecom/a;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/userrecom/a;-><init>(Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f071263

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    .line 6
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$2;

    invoke-direct {v1, p1, p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$2;-><init>(ILcom/join/kotlin/ui/userrecom/UserRecomendActivity;)V

    invoke-direct {v0, p0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->setGestureDetector(Landroid/view/GestureDetector;)V

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "range"

    const-wide/16 v1, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/userrecom/RecomViewModle;->getTitleMessage()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "\u5929\u4e0d\u89c1\uff0c\u4e3a\u4f60\u63a8\u8350\u4ee5\u4e0b\u6e38\u620f"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 9
    new-instance p1, Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;

    invoke-direct {p1, p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->adapter:Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/userrecom/RecomViewModle;->getShowDataList()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object v0

    const/16 v1, 0x24

    invoke-virtual {p1, v1, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;

    move-result-object p1

    iget-object v0, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->adapter:Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;

    move-result-object p1

    const/4 v0, 0x7

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/userrecom/RecomViewModle;->getShowDataList()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$3;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$3;-><init>(Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;)V

    new-instance v1, Lcom/join/kotlin/ui/userrecom/b;

    invoke-direct {v1, v0}, Lcom/join/kotlin/ui/userrecom/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->setManager(Landroidx/recyclerview/widget/LinearLayoutManager;)V

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/userrecom/RecomViewModle;->getRequest()Lcom/join/kotlin/ui/userrecom/UserRecomRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/userrecom/UserRecomRequest;->getResultData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4;-><init>(Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;)V

    new-instance v1, Lcom/join/kotlin/ui/userrecom/c;

    invoke-direct {v1, v0}, Lcom/join/kotlin/ui/userrecom/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 17
    iget-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->adapter:Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$5;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$5;-><init>(Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->setOnItemClickListener(Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter$OnItemClickListener;)V

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->updataList()V

    .line 19
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->recGamesOldUser:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method public onDownloadStatusEventReceved(Lcom/join/mgps/event/n;)V
    .locals 1
    .param p1    # Lcom/join/mgps/event/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "downloadTaskEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->onEventMainThread(Lcom/join/mgps/event/n;)V

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->getDownloadTasksMap()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->updateProgressPartly()V

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->adapter:Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final setAdapter(Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->adapter:Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;

    return-void
.end method

.method public final setGestureDetector(Landroid/view/GestureDetector;)V
    .locals 1
    .param p1    # Landroid/view/GestureDetector;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->gestureDetector:Landroid/view/GestureDetector;

    return-void
.end method

.method public final setManager(Landroidx/recyclerview/widget/LinearLayoutManager;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/LinearLayoutManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->manager:Landroidx/recyclerview/widget/LinearLayoutManager;

    return-void
.end method

.method public final setViewModle(Lcom/join/kotlin/ui/userrecom/RecomViewModle;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/userrecom/RecomViewModle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->viewModle:Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    return-void
.end method

.method public final setViewdataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;

    return-void
.end method

.method public final updataList()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "listDatas"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0711ca

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 3
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/join/android/app/common/utils/n;->k(Landroid/app/Activity;)I

    move-result v2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f071239

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->t(Landroid/content/Context;)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result v3

    sub-int/2addr v2, v3

    .line 4
    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 6
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    mul-int v5, v5, v1

    if-le v5, v2, :cond_1

    .line 7
    iput v2, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    goto :goto_0

    .line 8
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    mul-int v1, v1, v2

    iput v1, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 9
    :goto_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUserrecomActivityBinding;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 12
    new-instance v4, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-direct {v4, v1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/16 v1, 0x90

    .line 13
    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 14
    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 15
    invoke-virtual {v4}, Lcom/join/mgps/dto/CollectionBeanSub;->getIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 17
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/kotlin/ui/userrecom/RecomViewModle;->getShowDataList()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/ArrayList;

    new-instance v9, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v3, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 18
    :cond_2
    iget-object v0, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->adapter:Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_3
    return-void
.end method

.method public final updateProgressPartly()V
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v1

    if-gt v0, v1, :cond_3

    .line 3
    :goto_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/join/kotlin/ui/userrecom/RecomViewModle;->getShowDataList()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v0, v2, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/join/kotlin/ui/userrecom/RecomViewModle;->getShowDataList()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "viewModle!!.showDataList.value!![index]"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/psk/kotlin/util/CommonListMainData;

    .line 5
    invoke-virtual {v2}, Lcom/psk/kotlin/util/CommonListMainData;->getType()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    .line 6
    invoke-virtual {v2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 7
    invoke-virtual {v2}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 8
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    if-eq v3, v4, :cond_1

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const/16 v3, 0xc

    if-ne v2, v3, :cond_2

    .line 9
    :cond_1
    iget-object v2, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->adapter:Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;

    if-eqz v2, :cond_2

    const-string v3, "progress"

    invoke-virtual {v2, v0, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    if-eq v0, v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    return-void
.end method
