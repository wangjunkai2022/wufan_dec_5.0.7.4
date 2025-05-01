.class public final Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;
.super Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;
.source "ModArchiveAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$ModArchiveType;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter<",
        "Lcom/psk/kotlin/util/CommonListMainData;",
        "Landroidx/databinding/ViewDataBinding;",
        ">;"
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final defaultDisplay:Landroid/view/Display;

.field private final height:I

.field private isChoice:Z

.field private listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final ratio:F

.field private final width:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;Z)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    iput-boolean p3, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->isChoice:Z

    const-string p2, "null cannot be cast to non-null type android.app.Activity"

    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->defaultDisplay:Landroid/view/Display;

    .line 4
    invoke-virtual {p1}, Landroid/view/Display;->getWidth()I

    move-result p2

    iput p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->width:I

    .line 5
    invoke-virtual {p1}, Landroid/view/Display;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->height:I

    if-le p2, p1, :cond_0

    int-to-float p2, p2

    int-to-float p1, p1

    div-float/2addr p2, p1

    goto :goto_0

    :cond_0
    int-to-float p1, p1

    int-to-float p2, p2

    div-float p2, p1, p2

    .line 6
    :goto_0
    iput p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->ratio:F

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItem$lambda$2(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItem$lambda$4(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V

    return-void
.end method

.method public static synthetic e(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItem$lambda$3(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItem$lambda$1(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItem$lambda$5(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItem$lambda$0(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V

    return-void
.end method

.method public static synthetic i(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItem$lambda$6(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V

    return-void
.end method

.method public static synthetic j(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItem$lambda$7(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V

    return-void
.end method

.method private static final onBindItem$lambda$0(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V
    .locals 6

    const-string v0, "$itemDatax"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;

    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-le v3, v2, :cond_1

    .line 4
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v4}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    :cond_1
    if-lez v3, :cond_4

    sub-int/2addr v3, v2

    .line 6
    invoke-virtual {v0, v3}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v0

    if-lez v0, :cond_2

    .line 7
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v4}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    .line 11
    :cond_3
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method private static final onBindItem$lambda$1(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 1

    const-string p2, "$binding"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$itemDatax"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    check-cast p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;

    iget-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    const-string/jumbo v0, "\u5c55\u5f00"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    .line 3
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->b:Landroid/widget/TextView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 4
    iget-object p0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    const-string/jumbo p1, "\u6536\u8d77"

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    .line 7
    iget-object p0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->b:Landroid/widget/TextView;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    :goto_0
    return-void
.end method

.method private static final onBindItem$lambda$2(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V
    .locals 6

    const-string v0, "$itemDatax"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;

    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-le v3, v2, :cond_1

    .line 4
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v4}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    :cond_1
    if-lez v3, :cond_4

    sub-int/2addr v3, v2

    .line 6
    invoke-virtual {v0, v3}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v0

    if-lez v0, :cond_2

    .line 7
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v4}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    .line 11
    :cond_3
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method private static final onBindItem$lambda$3(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 1

    const-string p2, "$binding"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$itemDatax"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    check-cast p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;

    iget-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    const-string/jumbo v0, "\u5c55\u5f00"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    .line 3
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->b:Landroid/widget/TextView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 4
    iget-object p0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    const-string/jumbo p1, "\u6536\u8d77"

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    .line 7
    iget-object p0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->b:Landroid/widget/TextView;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    :goto_0
    return-void
.end method

.method private static final onBindItem$lambda$4(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V
    .locals 6

    const-string v0, "$itemDatax"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;

    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-le v3, v2, :cond_1

    .line 4
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v4}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    :cond_1
    if-lez v3, :cond_4

    sub-int/2addr v3, v2

    .line 6
    invoke-virtual {v0, v3}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v0

    if-lez v0, :cond_2

    .line 7
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v4}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    .line 11
    :cond_3
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method private static final onBindItem$lambda$5(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 1

    const-string p2, "$binding"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$itemDatax"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    check-cast p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;

    iget-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    const-string/jumbo v0, "\u5c55\u5f00"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    .line 3
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->b:Landroid/widget/TextView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 4
    iget-object p0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    const-string/jumbo p1, "\u6536\u8d77"

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    .line 7
    iget-object p0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->b:Landroid/widget/TextView;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    :goto_0
    return-void
.end method

.method private static final onBindItem$lambda$6(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V
    .locals 6

    const-string v0, "$itemDatax"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;

    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-le v3, v2, :cond_1

    .line 4
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v4}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    :cond_1
    if-lez v3, :cond_4

    sub-int/2addr v3, v2

    .line 6
    invoke-virtual {v0, v3}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v0

    if-lez v0, :cond_2

    .line 7
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v4}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    goto :goto_0

    .line 11
    :cond_3
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p0, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method private static final onBindItem$lambda$7(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 1

    const-string p2, "$binding"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$itemDatax"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    check-cast p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;

    iget-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    const-string/jumbo v0, "\u5c55\u5f00"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    .line 3
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->b:Landroid/widget/TextView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 4
    iget-object p0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    const-string/jumbo p1, "\u6536\u8d77"

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setShowMoreStatus(I)V

    .line 7
    iget-object p0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->b:Landroid/widget/TextView;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getDefaultDisplay()Landroid/view/Display;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->defaultDisplay:Landroid/view/Display;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->height:I

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->getListDatas()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/psk/kotlin/util/CommonListMainData;

    invoke-virtual {p1}, Lcom/psk/kotlin/util/CommonListMainData;->getType()I

    move-result p1

    return p1
.end method

.method protected getLayoutResId(I)I
    .locals 3

    const/4 v0, 0x3

    const v1, 0x7f0c0645

    const v2, 0x40066666    # 2.1f

    if-eq p1, v0, :cond_5

    const/4 v0, 0x4

    if-eq p1, v0, :cond_3

    const/4 v0, 0x5

    if-eq p1, v0, :cond_2

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    return v1

    .line 1
    :cond_0
    iget p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->ratio:F

    cmpl-float p1, p1, v2

    if-ltz p1, :cond_1

    const p1, 0x7f0c0643

    goto :goto_0

    :cond_1
    const p1, 0x7f0c0644

    :goto_0
    return p1

    :cond_2
    const p1, 0x7f0c0642

    return p1

    .line 2
    :cond_3
    iget p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->ratio:F

    cmpl-float p1, p1, v2

    if-ltz p1, :cond_4

    const p1, 0x7f0c0647

    goto :goto_1

    :cond_4
    const p1, 0x7f0c0648

    :goto_1
    return p1

    .line 3
    :cond_5
    iget p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->ratio:F

    cmpl-float p1, p1, v2

    if-ltz p1, :cond_6

    goto :goto_2

    :cond_6
    const v1, 0x7f0c0646

    :goto_2
    return v1
.end method

.method public final getListener()Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    return-object v0
.end method

.method public final getRatio()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->ratio:F

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->width:I

    return v0
.end method

.method public final isChoice()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->isChoice:Z

    return v0
.end method

.method protected onBindItem(Landroidx/databinding/ViewDataBinding;Lcom/psk/kotlin/util/CommonListMainData;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 7
    .param p1    # Landroidx/databinding/ViewDataBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/psk/kotlin/util/CommonListMainData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p3, "binding"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;

    const/16 v0, 0x8

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string/jumbo v4, "\u5c55\u5f00"

    const/4 v5, 0x2

    const-string v6, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData"

    if-eqz p3, :cond_3

    .line 3
    new-instance p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    iput-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 4
    move-object v6, p2

    check-cast v6, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getAvatar()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setAvatar(Ljava/lang/String;)V

    .line 5
    move-object p2, p1

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;

    iget-object v6, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p2, v6}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->l(Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 6
    iget-object v6, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    invoke-virtual {p2, v6}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->i(Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;)V

    .line 7
    iget-object v6, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result v6

    if-eq v6, v5, :cond_1

    iget-object v5, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v5}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result v5

    if-ne v5, v1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 9
    :cond_1
    :goto_0
    iget-object v0, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v0, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 11
    iget-object v0, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    :goto_1
    iget-object v0, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->b:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    new-instance v1, Lcom/join/kotlin/ui/cloudarchive/adapter/g;

    invoke-direct {v1, p3, p1}, Lcom/join/kotlin/ui/cloudarchive/adapter/g;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 13
    :cond_2
    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->f:Landroid/widget/TextView;

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/adapter/b;

    invoke-direct {v0, p1, p3}, Lcom/join/kotlin/ui/cloudarchive/adapter/b;-><init>(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_8

    .line 14
    :cond_3
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;

    if-eqz p3, :cond_7

    .line 15
    new-instance p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    iput-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 16
    move-object v6, p2

    check-cast v6, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getAvatar()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setAvatar(Ljava/lang/String;)V

    .line 17
    move-object p2, p1

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;

    iget-object v6, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p2, v6}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->j(Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 18
    iget-object v6, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    invoke-virtual {p2, v6}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->h(Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;)V

    .line 19
    iget-boolean v6, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->isChoice:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {p2, v6}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->i(Ljava/lang/Boolean;)V

    .line 20
    iget-object v6, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result v6

    if-eq v6, v5, :cond_5

    iget-object v5, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v5}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result v5

    if-ne v5, v1, :cond_4

    goto :goto_2

    .line 21
    :cond_4
    iget-object v1, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 22
    :cond_5
    :goto_2
    iget-object v0, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v0, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 24
    iget-object v0, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 25
    :goto_3
    iget-object v0, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->b:Landroid/widget/TextView;

    if-eqz v0, :cond_6

    new-instance v1, Lcom/join/kotlin/ui/cloudarchive/adapter/e;

    invoke-direct {v1, p3, p1}, Lcom/join/kotlin/ui/cloudarchive/adapter/e;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 26
    :cond_6
    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItem2Binding;->f:Landroid/widget/TextView;

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/adapter/a;

    invoke-direct {v0, p1, p3}, Lcom/join/kotlin/ui/cloudarchive/adapter/a;-><init>(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_8

    .line 27
    :cond_7
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;

    if-eqz p3, :cond_b

    .line 28
    new-instance p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    iput-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 29
    move-object v6, p1

    check-cast v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v6, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h(Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 30
    iget-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    invoke-virtual {v6, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->g(Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;)V

    .line 31
    iget-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result p2

    if-eq p2, v5, :cond_9

    iget-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result p2

    if-ne p2, v1, :cond_8

    goto :goto_4

    .line 32
    :cond_8
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_5

    .line 33
    :cond_9
    :goto_4
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->b:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 35
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 36
    :goto_5
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->b:Landroid/widget/TextView;

    if-eqz p2, :cond_a

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/adapter/f;

    invoke-direct {v0, p3, p1}, Lcom/join/kotlin/ui/cloudarchive/adapter/f;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 37
    :cond_a
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h:Landroid/widget/TextView;

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/adapter/c;

    invoke-direct {v0, p1, p3}, Lcom/join/kotlin/ui/cloudarchive/adapter/c;-><init>(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_8

    .line 38
    :cond_b
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;

    if-eqz p3, :cond_f

    .line 39
    new-instance p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    iput-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 40
    move-object v6, p1

    check-cast v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v6, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h(Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 41
    iget-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    invoke-virtual {v6, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->g(Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;)V

    .line 42
    iget-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result p2

    if-eq p2, v5, :cond_d

    iget-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getShowMoreStatus()I

    move-result p2

    if-ne p2, v1, :cond_c

    goto :goto_6

    .line 43
    :cond_c
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_7

    .line 44
    :cond_d
    :goto_6
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->b:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 46
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 47
    :goto_7
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->b:Landroid/widget/TextView;

    if-eqz p2, :cond_e

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/adapter/h;

    invoke-direct {v0, p3, p1}, Lcom/join/kotlin/ui/cloudarchive/adapter/h;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 48
    :cond_e
    iget-object p2, v6, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItem2Binding;->h:Landroid/widget/TextView;

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/adapter/d;

    invoke-direct {v0, p1, p3}, Lcom/join/kotlin/ui/cloudarchive/adapter/d;-><init>(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_8

    .line 49
    :cond_f
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveGameDetailListItemBinding;

    if-eqz p3, :cond_10

    .line 50
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    .line 51
    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getAvatar()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setAvatar(Ljava/lang/String;)V

    .line 52
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveGameDetailListItemBinding;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveGameDetailListItemBinding;->j(Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 53
    iget-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveGameDetailListItemBinding;->h(Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;)V

    .line 54
    iget-boolean p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->isChoice:Z

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveGameDetailListItemBinding;->i(Ljava/lang/Boolean;)V

    goto/16 :goto_8

    .line 55
    :cond_10
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomainBinding;

    const-string v0, "override fun onBindItem(\u2026troller)\n\n        }\n    }"

    const-string v1, "null cannot be cast to non-null type com.join.mgps.dto.DomainInfoBean"

    if-eqz p3, :cond_11

    .line 56
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/mgps/dto/DomainInfoBean;

    .line 57
    move-object p3, p1

    check-cast p3, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomainBinding;

    invoke-virtual {p3, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomainBinding;->h(Lcom/join/mgps/dto/DomainInfoBean;)V

    .line 58
    iget-object v1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    invoke-virtual {p3, v1}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomainBinding;->g(Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;)V

    .line 59
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->newDraweeControllerBuilder()Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object v1

    .line 60
    iget-object v2, p3, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomainBinding;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2}, Lcom/facebook/drawee/view/DraweeView;->getController()Lo0/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->O(Lo0/a;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/backends/pipeline/e;

    .line 61
    new-instance v2, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$1;

    invoke-direct {v2, p1, p0}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$1;-><init>(Landroidx/databinding/ViewDataBinding;Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;)V

    invoke-virtual {v1, v2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->H(Lcom/facebook/drawee/controller/c;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/backends/pipeline/e;

    .line 62
    invoke-virtual {p2}, Lcom/join/mgps/dto/DomainInfoBean;->getPic()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/facebook/drawee/backends/pipeline/e;->d0(Ljava/lang/String;)Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->d()Lcom/facebook/drawee/controller/a;

    move-result-object p1

    .line 64
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object p2, p3, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomainBinding;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2, p1}, Lcom/facebook/drawee/view/DraweeView;->setController(Lo0/a;)V

    goto :goto_8

    .line 66
    :cond_11
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomain2Binding;

    if-eqz p3, :cond_12

    .line 67
    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/mgps/dto/DomainInfoBean;

    .line 68
    move-object p3, p1

    check-cast p3, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomain2Binding;

    invoke-virtual {p3, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomain2Binding;->h(Lcom/join/mgps/dto/DomainInfoBean;)V

    .line 69
    iget-object v1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    invoke-virtual {p3, v1}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomain2Binding;->g(Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;)V

    .line 70
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->newDraweeControllerBuilder()Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object v1

    .line 71
    iget-object v2, p3, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomain2Binding;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2}, Lcom/facebook/drawee/view/DraweeView;->getController()Lo0/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->O(Lo0/a;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/backends/pipeline/e;

    .line 72
    new-instance v2, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$2;

    invoke-direct {v2, p1, p0}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$2;-><init>(Landroidx/databinding/ViewDataBinding;Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;)V

    invoke-virtual {v1, v2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->H(Lcom/facebook/drawee/controller/c;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/backends/pipeline/e;

    .line 73
    invoke-virtual {p2}, Lcom/join/mgps/dto/DomainInfoBean;->getPic()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/facebook/drawee/backends/pipeline/e;->d0(Ljava/lang/String;)Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object p1

    .line 74
    invoke-virtual {p1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->d()Lcom/facebook/drawee/controller/a;

    move-result-object p1

    .line 75
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    iget-object p2, p3, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomain2Binding;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2, p1}, Lcom/facebook/drawee/view/DraweeView;->setController(Lo0/a;)V

    :cond_12
    :goto_8
    return-void
.end method

.method public bridge synthetic onBindItem(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/psk/kotlin/util/CommonListMainData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItem(Landroidx/databinding/ViewDataBinding;Lcom/psk/kotlin/util/CommonListMainData;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method protected onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Lcom/psk/kotlin/util/CommonListMainData;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 1
    .param p1    # Landroidx/databinding/ViewDataBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/psk/kotlin/util/CommonListMainData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p3, "binding"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;

    const-string v0, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData"

    if-eqz p3, :cond_0

    .line 3
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->l(Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 4
    iget-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListItemBinding;->i(Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;)V

    goto :goto_0

    .line 5
    :cond_0
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;

    if-eqz p3, :cond_1

    .line 6
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;

    invoke-virtual {p2}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->h(Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 7
    iget-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListLocalItemBinding;->g(Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/psk/kotlin/util/CommonListMainData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Lcom/psk/kotlin/util/CommonListMainData;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public final setChoice(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->isChoice:Z

    return-void
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
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->context:Landroid/content/Context;

    return-void
.end method

.method public final setListener(Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnClickArchiveListener;

    return-void
.end method
