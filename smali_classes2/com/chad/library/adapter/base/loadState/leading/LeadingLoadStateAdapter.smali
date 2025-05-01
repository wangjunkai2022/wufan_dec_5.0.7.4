.class public abstract Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
.super Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;
.source "LeadingLoadStateAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VH:",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">",
        "Lcom/chad/library/adapter/base/loadState/LoadStateAdapter<",
        "TVH;>;"
    }
.end annotation


# instance fields
.field private c:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private d:Z

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->d:Z

    return-void
.end method

.method public static synthetic g(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)V
    .locals 0

    invoke-static {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->n(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)V

    return-void
.end method

.method private final m()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->d:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->c:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->b()Lcom/chad/library/adapter/base/loadState/b;

    move-result-object v0

    instance-of v0, v0, Lcom/chad/library/adapter/base/loadState/b$d;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->b()Lcom/chad/library/adapter/base/loadState/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/chad/library/adapter/base/loadState/b;->a()Z

    move-result v0

    if-nez v0, :cond_4

    .line 3
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    .line 4
    :cond_2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->isComputingLayout()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 5
    new-instance v1, Ly/a;

    invoke-direct {v1, p0}, Ly/a;-><init>(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 6
    :cond_3
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->k()V

    :cond_4
    :goto_0
    return-void
.end method

.method private static final n(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->k()V

    return-void
.end method


# virtual methods
.method public a(Lcom/chad/library/adapter/base/loadState/b;)Z
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "loadState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of p1, p1, Lcom/chad/library/adapter/base/loadState/b$b;

    return p1
.end method

.method public final h(I)V
    .locals 1

    if-gez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->e:I

    if-gt p1, v0, :cond_1

    .line 2
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->m()V

    :cond_1
    return-void
.end method

.method public final i()Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->c:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;

    return-object v0
.end method

.method public final j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->e:I

    return v0
.end method

.method public final k()V
    .locals 1

    .line 1
    sget-object v0, Lcom/chad/library/adapter/base/loadState/b$b;->b:Lcom/chad/library/adapter/base/loadState/b$b;

    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->f(Lcom/chad/library/adapter/base/loadState/b;)V

    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->c:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;->b()V

    :cond_0
    return-void
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->d:Z

    return v0
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->d:Z

    return-void
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->m()V

    return-void
.end method

.method public final p(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;)Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;",
            ")",
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "TVH;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->c:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;

    return-object p0
.end method

.method public final q(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->e:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n            LeadingLoadStateAdapter ->\n            [isLoadEnable: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-boolean v1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->d:Z

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "],\n            [preloadSize: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    iget v1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->e:I

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "],\n            [loadState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->b()Lcom/chad/library/adapter/base/loadState/b;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]\n        "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {v0}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
