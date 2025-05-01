.class public final Lcom/chad/library/adapter/base/f$c;
.super Ljava/lang/Object;
.source "QuickAdapterHelper.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/chad/library/adapter/base/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
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

.field private b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private d:Landroidx/recyclerview/widget/ConcatAdapter$Config;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)V"
        }
    .end annotation

    const-string v0, "contentAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/chad/library/adapter/base/f$c;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 2
    sget-object p1, Landroidx/recyclerview/widget/ConcatAdapter$Config;->DEFAULT:Landroidx/recyclerview/widget/ConcatAdapter$Config;

    const-string v0, "DEFAULT"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/chad/library/adapter/base/f$c;->d:Landroidx/recyclerview/widget/ConcatAdapter$Config;

    return-void
.end method


# virtual methods
.method public final a()Lcom/chad/library/adapter/base/f;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v6, Lcom/chad/library/adapter/base/f;

    .line 2
    iget-object v1, p0, Lcom/chad/library/adapter/base/f$c;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 3
    iget-object v2, p0, Lcom/chad/library/adapter/base/f$c;->b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    .line 4
    iget-object v3, p0, Lcom/chad/library/adapter/base/f$c;->c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    .line 5
    iget-object v4, p0, Lcom/chad/library/adapter/base/f$c;->d:Landroidx/recyclerview/widget/ConcatAdapter$Config;

    const/4 v5, 0x0

    move-object v0, v6

    .line 6
    invoke-direct/range {v0 .. v5}, Lcom/chad/library/adapter/base/f;-><init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/ConcatAdapter$Config;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final b(Landroidx/recyclerview/widget/ConcatAdapter$Config;)Lcom/chad/library/adapter/base/f$c;
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/ConcatAdapter$Config;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/chad/library/adapter/base/f$c;->d:Landroidx/recyclerview/widget/ConcatAdapter$Config;

    return-object p0
.end method

.method public final c(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;)Lcom/chad/library/adapter/base/f$c;
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;

    invoke-direct {v0}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->p(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$a;)Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    .line 3
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/f$c;->d(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)Lcom/chad/library/adapter/base/f$c;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)Lcom/chad/library/adapter/base/f$c;
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "*>;)",
            "Lcom/chad/library/adapter/base/f$c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/chad/library/adapter/base/f$c;->b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    return-object p0
.end method

.method public final e(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;)Lcom/chad/library/adapter/base/f$c;
    .locals 4
    .param p1    # Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->x(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;)Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    .line 3
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/f$c;->f(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)Lcom/chad/library/adapter/base/f$c;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)Lcom/chad/library/adapter/base/f$c;
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "*>;)",
            "Lcom/chad/library/adapter/base/f$c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/chad/library/adapter/base/f$c;->c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    return-object p0
.end method
