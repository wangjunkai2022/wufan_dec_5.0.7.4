.class public final Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$23;
.super Ljava/lang/Object;
.source "CategoryDetailListActivity.kt"

# interfaces
.implements Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$23;->this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemselected(Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V
    .locals 2
    .param p1    # Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$23;->this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getDatas()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->access$onfindTypeSelected(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;Ljava/util/List;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V

    return-void
.end method
