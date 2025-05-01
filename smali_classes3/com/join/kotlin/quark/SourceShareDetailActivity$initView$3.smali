.class final Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceShareDetailActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/SourceShareDetailActivity;->initView(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/SourceShareDetailActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/SourceShareDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$3;->this$0:Lcom/join/kotlin/quark/SourceShareDetailActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$3;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$3;->this$0:Lcom/join/kotlin/quark/SourceShareDetailActivity;

    invoke-static {v0}, Lcom/join/kotlin/quark/SourceShareDetailActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/SourceShareDetailActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "loadSir"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$3;->this$0:Lcom/join/kotlin/quark/SourceShareDetailActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/SourceShareDetailActivity;->getItemBean()Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$3;->this$0:Lcom/join/kotlin/quark/SourceShareDetailActivity;

    .line 4
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getDisk_url()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v1}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getDisk_url()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
