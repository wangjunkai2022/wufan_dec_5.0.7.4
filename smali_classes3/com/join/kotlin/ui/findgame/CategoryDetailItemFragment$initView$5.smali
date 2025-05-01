.class final Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$initView$5;
.super Lkotlin/jvm/internal/Lambda;
.source "CategoryDetailItemFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;->initView()V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCategoryDetailItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryDetailItemFragment.kt\ncom/join/kotlin/ui/findgame/CategoryDetailItemFragment$initView$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n1#2:327\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCategoryDetailItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryDetailItemFragment.kt\ncom/join/kotlin/ui/findgame/CategoryDetailItemFragment$initView$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n1#2:327\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$initView$5;->this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$initView$5;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$initView$5;->this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$initView$5;->this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;->getCategoryPrensenter()Lcom/join/kotlin/presenter/CategoryPrensenter;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;->getRequestArgs()Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/join/kotlin/presenter/CategoryPrensenter;->loadCategoryData(Landroid/content/Context;Lcom/join/kotlin/ui/findgame/data/CategoryRequest;)V

    :cond_0
    return-void
.end method
