.class public interface abstract Lcom/beizi/ad/internal/utilities/DownloadFactory$Download;
.super Ljava/lang/Object;
.source "DownloadFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/utilities/DownloadFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Download"
.end annotation


# virtual methods
.method public abstract cancel()V
    .annotation build Landroidx/annotation/UiThread;
    .end annotation
.end method

.method public abstract destroy()V
    .annotation build Landroidx/annotation/UiThread;
    .end annotation
.end method

.method public abstract pause()V
    .annotation build Landroidx/annotation/UiThread;
    .end annotation
.end method

.method public abstract register(Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;)V
    .annotation build Landroidx/annotation/UiThread;
    .end annotation
.end method

.method public abstract resume()V
    .annotation build Landroidx/annotation/UiThread;
    .end annotation
.end method

.method public abstract start(Lcom/beizi/ad/internal/utilities/DownloadFactory$Request;)V
    .annotation build Landroidx/annotation/UiThread;
    .end annotation
.end method
