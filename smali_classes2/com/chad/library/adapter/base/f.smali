.class public final Lcom/chad/library/adapter/base/f;
.super Ljava/lang/Object;
.source "QuickAdapterHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/f$c;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQuickAdapterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickAdapterHelper.kt\ncom/chad/library/adapter/base/QuickAdapterHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n1#2:338\n1855#3,2:339\n1855#3,2:341\n*S KotlinDebug\n*F\n+ 1 QuickAdapterHelper.kt\ncom/chad/library/adapter/base/QuickAdapterHelper\n*L\n155#1:339,2\n219#1:341,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQuickAdapterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickAdapterHelper.kt\ncom/chad/library/adapter/base/QuickAdapterHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n1#2:338\n1855#3,2:339\n1855#3,2:341\n*S KotlinDebug\n*F\n+ 1 QuickAdapterHelper.kt\ncom/chad/library/adapter/base/QuickAdapterHelper\n*L\n155#1:339,2\n219#1:341,2\n*E\n"
    }
.end annotation


# instance fields
.field private final a:Lcom/chad/library/adapter/base/BaseQuickAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final f:Landroidx/recyclerview/widget/ConcatAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private g:Lcom/chad/library/adapter/base/BaseQuickAdapter$f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private h:Lcom/chad/library/adapter/base/BaseQuickAdapter$f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/ConcatAdapter$Config;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;",
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "*>;",
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "*>;",
            "Landroidx/recyclerview/widget/ConcatAdapter$Config;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/chad/library/adapter/base/f;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 3
    iput-object p2, p0, Lcom/chad/library/adapter/base/f;->b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    .line 4
    iput-object p3, p0, Lcom/chad/library/adapter/base/f;->c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    .line 7
    new-instance v0, Landroidx/recyclerview/widget/ConcatAdapter;

    new-array v1, v1, [Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-direct {v0, p4, v1}, Landroidx/recyclerview/widget/ConcatAdapter;-><init>(Landroidx/recyclerview/widget/ConcatAdapter$Config;[Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v0, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    if-eqz p2, :cond_0

    .line 8
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 9
    new-instance p2, Lcom/chad/library/adapter/base/f$a;

    invoke-direct {p2, p0}, Lcom/chad/library/adapter/base/f$a;-><init>(Lcom/chad/library/adapter/base/f;)V

    .line 10
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    .line 11
    iput-object p2, p0, Lcom/chad/library/adapter/base/f;->g:Lcom/chad/library/adapter/base/BaseQuickAdapter$f;

    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    if-eqz p3, :cond_1

    .line 13
    invoke-virtual {v0, p3}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 14
    new-instance p2, Lcom/chad/library/adapter/base/f$b;

    invoke-direct {p2, p0}, Lcom/chad/library/adapter/base/f$b;-><init>(Lcom/chad/library/adapter/base/f;)V

    .line 15
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    .line 16
    iput-object p2, p0, Lcom/chad/library/adapter/base/f;->h:Lcom/chad/library/adapter/base/BaseQuickAdapter$f;

    :cond_1
    return-void
.end method

.method public synthetic constructor <init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/ConcatAdapter$Config;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/chad/library/adapter/base/f;-><init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/ConcatAdapter$Config;)V

    return-void
.end method


# virtual methods
.method public final a(ILcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/f;
    .locals 2
    .param p2    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lcom/chad/library/adapter/base/f;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_2

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p1, v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 3
    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/f;->b(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/f;

    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ConcatAdapter;->getAdapters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ConcatAdapter;->getAdapters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    sub-int/2addr v0, v1

    add-int/2addr v0, p1

    .line 7
    iget-object p1, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {p1, v0, p2}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(ILandroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 8
    iget-object p1, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    return-object p0

    .line 9
    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index must be between 0 and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Given:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final b(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/f;
    .locals 2
    .param p1    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lcom/chad/library/adapter/base/f;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->h:Lcom/chad/library/adapter/base/BaseQuickAdapter$f;

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    .line 5
    :goto_0
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    if-nez v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    goto :goto_1

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ConcatAdapter;->getAdapters()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1, p1}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(ILandroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 9
    :goto_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final c(ILcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/f;
    .locals 2
    .param p2    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lcom/chad/library/adapter/base/f;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_3

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p1, v0, :cond_3

    if-nez p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->g:Lcom/chad/library/adapter/base/BaseQuickAdapter$f;

    if-eqz v0, :cond_1

    .line 3
    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    .line 6
    :goto_0
    invoke-virtual {p2, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 8
    :goto_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(ILandroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 9
    iget-object p1, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 10
    :cond_3
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index must be between 0 and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Given:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final d(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/f;
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lcom/chad/library/adapter/base/f;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/chad/library/adapter/base/f;->c(ILcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/f;

    return-object p0
.end method

.method public final e()Lcom/chad/library/adapter/base/f;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    .line 2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 3
    iget-object v2, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/ConcatAdapter;->removeAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 4
    iget-object v2, p0, Lcom/chad/library/adapter/base/f;->h:Lcom/chad/library/adapter/base/BaseQuickAdapter$f;

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-object p0
.end method

.method public final f()Lcom/chad/library/adapter/base/f;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    .line 2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 3
    iget-object v2, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/ConcatAdapter;->removeAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 4
    iget-object v2, p0, Lcom/chad/library/adapter/base/f;->g:Lcom/chad/library/adapter/base/BaseQuickAdapter$f;

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-object p0
.end method

.method public final g()Landroidx/recyclerview/widget/ConcatAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final j()Lcom/chad/library/adapter/base/BaseQuickAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    return-object v0
.end method

.method public final k()Lcom/chad/library/adapter/base/loadState/b;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->b()Lcom/chad/library/adapter/base/loadState/b;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    new-instance v0, Lcom/chad/library/adapter/base/loadState/b$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/chad/library/adapter/base/loadState/b$d;-><init>(Z)V

    :cond_1
    return-object v0
.end method

.method public final l()Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    return-object v0
.end method

.method public final m()Lcom/chad/library/adapter/base/loadState/b;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->b()Lcom/chad/library/adapter/base/loadState/b;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    new-instance v0, Lcom/chad/library/adapter/base/loadState/b$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/chad/library/adapter/base/loadState/b$d;-><init>(Z)V

    :cond_1
    return-object v0
.end method

.method public final n()Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    return-object v0
.end method

.method public final o(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/f;
    .locals 2
    .param p1    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lcom/chad/library/adapter/base/f;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->f:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ConcatAdapter;->removeAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 3
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->g:Lcom/chad/library/adapter/base/BaseQuickAdapter$f;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    .line 7
    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/chad/library/adapter/base/f;->d:Ljava/util/ArrayList;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    .line 10
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->h:Lcom/chad/library/adapter/base/BaseQuickAdapter$f;

    if-eqz v0, :cond_4

    .line 11
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    .line 12
    iget-object p1, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 13
    iget-object p1, p0, Lcom/chad/library/adapter/base/f;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    goto :goto_1

    .line 14
    :cond_3
    iget-object p1, p0, Lcom/chad/library/adapter/base/f;->e:Ljava/util/ArrayList;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$f;)V

    :cond_4
    :goto_1
    return-object p0
.end method

.method public final p(Lcom/chad/library/adapter/base/loadState/b;)V
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->f(Lcom/chad/library/adapter/base/loadState/b;)V

    :goto_0
    return-void
.end method

.method public final q(Lcom/chad/library/adapter/base/loadState/b;)V
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/f;->c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->f(Lcom/chad/library/adapter/base/loadState/b;)V

    :goto_0
    return-void
.end method
