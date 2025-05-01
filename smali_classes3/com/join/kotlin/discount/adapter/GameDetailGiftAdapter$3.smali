.class public final Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$3;
.super Ljava/lang/Object;
.source "GameDetailGiftAdapter.kt"

# interfaces
.implements Lcom/chad/library/adapter/base/BaseMultiItemAdapter$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/chad/library/adapter/base/BaseMultiItemAdapter$a<",
        "Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemViewType(ILjava/util/List;)I
    .locals 1
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;",
            ">;)I"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_0

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 2
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;

    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->getViewType()I

    move-result p1

    :cond_0
    return p1
.end method
