.class public final Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "FindTypeListAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$FindClassifyType;,
        Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;,
        Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeImage;,
        Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeText;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private listener:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private showdatas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private typeId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/util/List;Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;",
            "Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showdatas"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->context:Landroid/content/Context;

    iput p2, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->typeId:I

    iput-object p3, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->showdatas:Ljava/util/List;

    iput-object p4, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->listener:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->showdatas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->showdatas:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/psk/kotlin/util/CommonListMainData;

    invoke-virtual {p1}, Lcom/psk/kotlin/util/CommonListMainData;->getType()I

    move-result p1

    return p1
.end method

.method public final getListener()Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->listener:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;

    return-object v0
.end method

.method public final getShowdatas()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->showdatas:Ljava/util/List;

    return-object v0
.end method

.method public final getTypeId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->typeId:I

    return v0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 4
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0, p2}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x3

    const-string v2, "holder.binding.root"

    const-string v3, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.GameSubTypeData"

    if-eq v0, v1, :cond_1

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    check-cast p1, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeText;

    .line 3
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->showdatas:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/psk/kotlin/util/CommonListMainData;

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    iput-object p2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 4
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeText;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;->c:Landroid/widget/TextView;

    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeText;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;->a()Landroid/widget/LinearLayout;

    move-result-object p2

    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setSelected(Z)V

    .line 6
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeText;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;->c:Landroid/widget/TextView;

    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 7
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeText;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;->a()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$onBindViewHolder$2;

    invoke-direct {p2, p0, v0}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$onBindViewHolder$2;-><init>(Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-static {p1, p2}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    .line 8
    :cond_1
    check-cast p1, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeImage;

    .line 9
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->showdatas:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/psk/kotlin/util/CommonListMainData;

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    iput-object p2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 10
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeImage;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;->a()Landroid/widget/LinearLayout;

    move-result-object p2

    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setSelected(Z)V

    .line 11
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeImage;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;->d:Landroid/widget/TextView;

    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 12
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeImage;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getPic()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeImage;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;->d:Landroid/widget/TextView;

    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeImage;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;->a()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$onBindViewHolder$1;

    invoke-direct {p2, p0, v0}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$onBindViewHolder$1;-><init>(Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-static {p1, p2}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "viewgroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    const-string v1, "inflate(LayoutInflater.f\u2026ntext), viewgroup, false)"

    const/4 v2, 0x0

    if-eq p2, v0, :cond_1

    const/4 v0, 0x7

    if-eq p2, v0, :cond_0

    .line 1
    new-instance p2, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeText;

    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0, p1, v2}, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeText;-><init>(Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;)V

    return-object p2

    .line 2
    :cond_0
    new-instance p2, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeText;

    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0, p1, v2}, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeText;-><init>(Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeTextLayoutBinding;)V

    return-object p2

    .line 3
    :cond_1
    new-instance p2, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeImage;

    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0, p1, v2}, Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$ViewTypeImage;-><init>(Lcom/join/android/app/mgsim/wufun/databinding/ClassfyTypeImageLayoutBinding;)V

    return-object p2
.end method

.method public final setContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->context:Landroid/content/Context;

    return-void
.end method

.method public final setListener(Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->listener:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;

    return-void
.end method

.method public final setShowdatas(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->showdatas:Ljava/util/List;

    return-void
.end method

.method public final setTypeId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->typeId:I

    return-void
.end method

.method public final updateDatas(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->typeId:I

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
