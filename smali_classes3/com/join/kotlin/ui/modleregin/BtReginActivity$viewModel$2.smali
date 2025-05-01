.class final Lcom/join/kotlin/ui/modleregin/BtReginActivity$viewModel$2;
.super Lkotlin/jvm/internal/Lambda;
.source "BtReginActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/modleregin/BtReginActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/modleregin/BtReginActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/modleregin/BtReginActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity$viewModel$2;->this$0:Lcom/join/kotlin/ui/modleregin/BtReginActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 3
    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity$viewModel$2;->this$0:Lcom/join/kotlin/ui/modleregin/BtReginActivity;

    .line 4
    new-instance v2, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;

    invoke-direct {v2}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;-><init>()V

    .line 5
    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    .line 6
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity$viewModel$2;->invoke()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object v0

    return-object v0
.end method
