.class public final Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$initView$3;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "CategoryDetailItemFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$initView$3;->this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$initView$3;->this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    invoke-static {p1}, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;->access$expDiscountGame(Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;)V

    :cond_0
    return-void
.end method
