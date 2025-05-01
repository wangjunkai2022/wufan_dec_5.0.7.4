.class final Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$2;
.super Lkotlin/jvm/internal/Lambda;
.source "UnbindThirdPartyActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$2;->this$0:Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$2;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 1

    .line 2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$2;->this$0:Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;

    invoke-static {p1}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->access$getViewBinding(Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/UnbindThridpartActivityBinding;

    .line 5
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/UnbindThridpartActivityBinding;->c:Landroid/widget/TextView;

    invoke-static {p1}, Lo2/a;->b(Landroid/view/View;)V

    :cond_0
    return-void
.end method
