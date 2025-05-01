.class public final Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;
.super Lcom/join/kotlin/ui/base/BasViewModleActivity;
.source "UnbindThirdPartyActivity.kt"

# interfaces
.implements Lcom/join/kotlin/ui/notice/ClickProxy;


# instance fields
.field public viewModle:Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/ui/base/BasViewModleActivity;-><init>()V

    return-void
.end method

.method public static final synthetic access$getViewBinding(Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;)Landroidx/databinding/ViewDataBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/base/BasViewModleActivity;->getViewBinding()Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getDataBindingConfig()Lcom/join/kotlin/ui/base/DataBindingConfig;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/kotlin/ui/base/DataBindingConfig;

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object v1

    const v2, 0x7f0c078d

    const/16 v3, 0x22

    .line 3
    invoke-direct {v0, v2, v3, v1}, Lcom/join/kotlin/ui/base/DataBindingConfig;-><init>(IILandroidx/lifecycle/ViewModel;)V

    const/4 v1, 0x7

    .line 4
    invoke-virtual {v0, v1, p0}, Lcom/join/kotlin/ui/base/DataBindingConfig;->addBindingParam(ILjava/lang/Object;)Lcom/join/kotlin/ui/base/DataBindingConfig;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->viewModle:Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "viewModle"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initViewModel()V
    .locals 1

    .line 1
    const-class v0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/base/BasViewModleActivity;->getActivityScopeViewModel(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->setViewModle(Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;)V

    return-void
.end method

.method public onClickBack()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->setBreakCodeCountDown(Z)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onClickItem(Lcom/join/mgps/dto/BTActivityBean;)V
    .locals 2
    .param p1    # Lcom/join/mgps/dto/BTActivityBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Not yet implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/join/kotlin/ui/base/BasViewModleActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string/jumbo v0, "type"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->setPlatform(Ljava/lang/String;)V

    if-eqz p1, :cond_6

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x553b4e9e

    if-eq v0, v1, :cond_4

    const v1, -0xb52f41c

    if-eq v0, v1, :cond_2

    const v1, 0x581604d9

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "WB_OPENID"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->getTitle()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    const-string/jumbo v0, "\u89e3\u7ed1\u5fae\u535a"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const-string v0, "QQ_OPENID"

    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 7
    :cond_3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->getTitle()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    const-string/jumbo v0, "\u89e3\u7ed1QQ"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    const-string v0, "WEIXIN_OPENID"

    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    .line 9
    :cond_5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->getTitle()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    const-string/jumbo v0, "\u89e3\u7ed1\u5fae\u4fe1"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 10
    :cond_6
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->getAccount()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "\u4f60\u7684\u5e10\u53f7\u4e3a\uff1a "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getAccount()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->getMoble()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->z()Ljava/lang/String;

    move-result-object p1

    const-string v1, "accountBean.mobile"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->setMobleNumber(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->sendsmsCode(Landroid/content/Context;)V

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->getCallStatus()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$1;-><init>(Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;)V

    new-instance v1, Lcom/join/kotlin/ui/account/a;

    invoke-direct {v1, v0}, Lcom/join/kotlin/ui/account/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->getHidesoftWard()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$2;-><init>(Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;)V

    new-instance v1, Lcom/join/kotlin/ui/account/b;

    invoke-direct {v1, v0}, Lcom/join/kotlin/ui/account/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onPause()V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->getViewModle()Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->setBreakCodeCountDown(Z)V

    return-void
.end method

.method public final setViewModle(Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->viewModle:Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    return-void
.end method
