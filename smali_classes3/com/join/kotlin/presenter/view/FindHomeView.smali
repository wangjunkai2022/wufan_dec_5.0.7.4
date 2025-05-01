.class public interface abstract Lcom/join/kotlin/presenter/view/FindHomeView;
.super Ljava/lang/Object;
.source "FindHomeView.kt"

# interfaces
.implements Lcom/psk/kotlin/base/presenter/view/BaseView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/presenter/view/FindHomeView$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract onLoadDataSuccess(ILcom/join/kotlin/ui/findgame/data/FindChoiceResultData;)V
    .param p2    # Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onLoadDataSuccessV9(ILcom/join/kotlin/ui/findgame/data/FindClassifyResultData;)V
    .param p2    # Lcom/join/kotlin/ui/findgame/data/FindClassifyResultData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
