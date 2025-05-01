.class final Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CommonZoneActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/zone/CommonZoneActivity;->createObserver()V
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
        "Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $this_run:Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

.field final synthetic this$0:Lcom/join/kotlin/zone/CommonZoneActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;Lcom/join/kotlin/zone/CommonZoneActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;->$this_run:Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    iput-object p2, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/zone/CommonZoneActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/state/ResultState;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;->invoke(Lcom/join/kotlin/base/state/ResultState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/base/state/ResultState;)V
    .locals 9
    .param p1    # Lcom/join/kotlin/base/state/ResultState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/base/state/ResultState<",
            "Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;->$this_run:Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    invoke-virtual {p1}, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    .line 3
    new-instance v0, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 4
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/zone/CommonZoneActivity;

    new-instance v4, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1;

    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;->$this_run:Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    invoke-direct {v4, v0, v2}, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1;-><init>(Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;Lcom/join/kotlin/zone/CommonZoneActivity;)V

    new-instance v5, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$2;

    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;->$this_run:Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    invoke-direct {v5, v0}, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$2;-><init>(Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;)V

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v3, p1

    invoke-static/range {v2 .. v8}, Lcom/join/kotlin/base/ext/BaseViewModelExtKt;->parseState$default(Lcom/join/kotlin/base/activity/BaseVmActivity;Lcom/join/kotlin/base/state/ResultState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
