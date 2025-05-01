.class public interface abstract Lcom/join/kotlin/presenter/view/CategoryView;
.super Ljava/lang/Object;
.source "CategoryView.kt"

# interfaces
.implements Lcom/psk/kotlin/base/presenter/view/BaseView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/presenter/view/CategoryView$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract onLoadDataSuccess(ILcom/join/kotlin/ui/findgame/data/CategoryListMain;)V
    .param p2    # Lcom/join/kotlin/ui/findgame/data/CategoryListMain;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
