.class public Lcom/join/kotlin/presenter/BasePresenter;
.super Ljava/lang/Object;
.source "BasePresenter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/psk/kotlin/base/presenter/view/BaseView;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public mView:Lcom/psk/kotlin/base/presenter/view/BaseView;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMView()Lcom/psk/kotlin/base/presenter/view/BaseView;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/presenter/BasePresenter;->mView:Lcom/psk/kotlin/base/presenter/view/BaseView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final setMView(Lcom/psk/kotlin/base/presenter/view/BaseView;)V
    .locals 1
    .param p1    # Lcom/psk/kotlin/base/presenter/view/BaseView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/presenter/BasePresenter;->mView:Lcom/psk/kotlin/base/presenter/view/BaseView;

    return-void
.end method
