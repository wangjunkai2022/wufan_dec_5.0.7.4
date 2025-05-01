.class public interface abstract Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;
.super Ljava/lang/Object;
.source "EmusArchiveAdapter.kt"


# virtual methods
.method public abstract onClickDislike(Lcom/join/mgps/dto/CloudListDataBean;)V
    .param p1    # Lcom/join/mgps/dto/CloudListDataBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onClickImage(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onClickMore(Landroid/view/View;Lcom/join/mgps/dto/CloudListDataBean;)V
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/CloudListDataBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onClickRun(Lcom/join/mgps/dto/CloudListDataBean;)V
    .param p1    # Lcom/join/mgps/dto/CloudListDataBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onPraise(Lcom/join/mgps/dto/CloudListDataBean;)V
    .param p1    # Lcom/join/mgps/dto/CloudListDataBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract uploadCloud()V
.end method
