.class public final Lcom/join/kotlin/discount/CommonBottomDialogActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;
.source "CommonBottomDialogActivity.kt"

# interfaces
.implements Lcom/join/kotlin/discount/proxy/CommonBottomDialogClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity<",
        "Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountCommonBottomDialogBinding;",
        ">;",
        "Lcom/join/kotlin/discount/proxy/CommonBottomDialogClickProxy;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 0

    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountCommonBottomDialogBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountCommonBottomDialogBinding;->c:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountCommonBottomDialogBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountCommonBottomDialogBinding;->h(Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountCommonBottomDialogBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountCommonBottomDialogBinding;->g(Lcom/join/kotlin/discount/proxy/CommonBottomDialogClickProxy;)V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;->getTitle()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    const-string/jumbo v1, "title"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;->getContent()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;->getBtnConfirmText()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    const-string v1, "btnText"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/CommonBottomDialogViewModel;->getBtnCancelText()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    const-string v1, "btnCancelText"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    const/4 v0, 0x0

    const-string v1, "content_gravity"

    .line 9
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountCommonBottomDialogBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountCommonBottomDialogBinding;->e:Landroid/widget/TextView;

    if-nez p1, :cond_0

    const/16 p1, 0x11

    goto :goto_0

    :cond_0
    const p1, 0x800003

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    :cond_1
    return-void
.end method

.method public onCancelClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    return-void
.end method

.method public onConfirmClick()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    return-void
.end method
