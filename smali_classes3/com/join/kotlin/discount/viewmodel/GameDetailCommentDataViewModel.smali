.class public final Lcom/join/kotlin/discount/viewmodel/GameDetailCommentDataViewModel;
.super Lcom/join/kotlin/base/viewmodel/BaseViewModel;
.source "GameDetailCommentDataViewModel.kt"


# instance fields
.field private final title:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/viewmodel/BaseViewModel;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    const-string/jumbo v1, "\u6807\u9898"

    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentDataViewModel;->title:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method


# virtual methods
.method public final getTitle()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentDataViewModel;->title:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method
