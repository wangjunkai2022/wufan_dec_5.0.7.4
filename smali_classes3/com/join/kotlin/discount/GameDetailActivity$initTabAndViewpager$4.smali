.class public final Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$4;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "GameDetailActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailActivity;->initTabAndViewpager()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$4;->this$0:Lcom/join/kotlin/discount/GameDetailActivity;

    .line 1
    invoke-direct {p0, p1}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$4;->this$0:Lcom/join/kotlin/discount/GameDetailActivity;

    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailActivity;->access$getFragments$p(Lcom/join/kotlin/discount/GameDetailActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "fragments[position]"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/fragment/app/Fragment;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$4;->this$0:Lcom/join/kotlin/discount/GameDetailActivity;

    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailActivity;->access$getFragments$p(Lcom/join/kotlin/discount/GameDetailActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
