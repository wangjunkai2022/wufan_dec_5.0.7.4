.class final Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$adapterx$2;
.super Lkotlin/jvm/internal/Lambda;
.source "EndGameSlotListActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$adapterx$2;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;

    iget-object v1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$adapterx$2;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$adapterx$2;->invoke()Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;

    move-result-object v0

    return-object v0
.end method
