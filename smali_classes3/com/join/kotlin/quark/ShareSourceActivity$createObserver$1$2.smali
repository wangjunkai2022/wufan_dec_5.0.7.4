.class final Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "ShareSourceActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/ShareSourceActivity;->createObserver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/base/state/ResultState<",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/ShareSourceActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/ShareSourceActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/quark/ShareSourceActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/state/ResultState;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2;->invoke(Lcom/join/kotlin/base/state/ResultState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/base/state/ResultState;)V
    .locals 7
    .param p1    # Lcom/join/kotlin/base/state/ResultState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/base/state/ResultState<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/quark/ShareSourceActivity;

    invoke-virtual {v0}, Lcom/BaseAppCompatActivity;->dismissLoading()V

    if-nez p1, :cond_0

    const-string/jumbo p1, "\u5171\u4eab\u8d44\u6e90\u5931\u8d25"

    .line 3
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/quark/ShareSourceActivity;

    new-instance v2, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2$1;

    invoke-direct {v2, v0}, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2$1;-><init>(Lcom/join/kotlin/quark/ShareSourceActivity;)V

    sget-object v3, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2$2;->INSTANCE:Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2$2;

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/join/kotlin/base/ext/BaseViewModelExtKt;->parseState$default(Lcom/join/kotlin/base/activity/BaseVmDialogActivity;Lcom/join/kotlin/base/state/ResultState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
