.class final Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "QuarkSearchResultActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1;->invoke(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;)V
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
.field final synthetic this$0:Lcom/join/kotlin/quark/QuarkSearchResultActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/QuarkSearchResultActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/QuarkSearchResultActivity;

    invoke-static {v0}, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "loadSir"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    const-class v1, Lcom/join/kotlin/quark/loadCallBack/EmptyQuarkSourceCallback;

    invoke-virtual {v0, v1}, Lcom/kingja/loadsir/core/b;->g(Ljava/lang/Class;)V

    return-void
.end method
