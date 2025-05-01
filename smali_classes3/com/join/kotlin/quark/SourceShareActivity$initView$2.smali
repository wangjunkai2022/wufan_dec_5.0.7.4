.class final Lcom/join/kotlin/quark/SourceShareActivity$initView$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceShareActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/SourceShareActivity;->initView(Landroid/os/Bundle;)V
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
.field final synthetic this$0:Lcom/join/kotlin/quark/SourceShareActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/SourceShareActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareActivity$initView$2;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/quark/SourceShareActivity$initView$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareActivity$initView$2;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceShareViewModel;

    iget-object v1, p0, Lcom/join/kotlin/quark/SourceShareActivity$initView$2;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getInstance_(this).uid"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/viewmodel/SourceShareViewModel;->getWebDiskHome(Ljava/lang/String;)V

    return-void
.end method
