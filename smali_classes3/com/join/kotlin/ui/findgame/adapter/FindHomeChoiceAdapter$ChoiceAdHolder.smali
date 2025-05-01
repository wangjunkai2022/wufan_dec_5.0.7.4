.class public final Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$ChoiceAdHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "FindHomeChoiceAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ChoiceAdHolder"
.end annotation


# instance fields
.field private binding:Lcom/join/android/app/mgsim/wufun/databinding/ChoiceMainadLayoutBinding;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/join/android/app/mgsim/wufun/databinding/ChoiceMainadLayoutBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/ChoiceMainadLayoutBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "bindingi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/ChoiceMainadLayoutBinding;->a()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$ChoiceAdHolder;->binding:Lcom/join/android/app/mgsim/wufun/databinding/ChoiceMainadLayoutBinding;

    return-void
.end method


# virtual methods
.method public final getBinding()Lcom/join/android/app/mgsim/wufun/databinding/ChoiceMainadLayoutBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$ChoiceAdHolder;->binding:Lcom/join/android/app/mgsim/wufun/databinding/ChoiceMainadLayoutBinding;

    return-object v0
.end method

.method public final setBinding(Lcom/join/android/app/mgsim/wufun/databinding/ChoiceMainadLayoutBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/ChoiceMainadLayoutBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$ChoiceAdHolder;->binding:Lcom/join/android/app/mgsim/wufun/databinding/ChoiceMainadLayoutBinding;

    return-void
.end method
