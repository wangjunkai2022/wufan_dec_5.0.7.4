.class public final Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$5;
.super Ljava/lang/Object;
.source "FindGameClassfyFragment.kt"

# interfaces
.implements Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$5;->this$0:Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemselected(Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V
    .locals 3
    .param p1    # Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$5;->this$0:Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$5;->this$0:Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getSelectedType()I

    move-result v1

    const-string/jumbo v2, "typeId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 3
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v1

    const-string/jumbo v2, "tagId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 4
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getTitle()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v1, "tagName"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$5;->this$0:Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
