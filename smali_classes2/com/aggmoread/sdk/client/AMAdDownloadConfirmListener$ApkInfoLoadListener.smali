.class public interface abstract Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ApkInfoLoadListener"
.end annotation


# virtual methods
.method public abstract onApkInfo(Lcom/aggmoread/sdk/client/AMAdApkInfo;)V
.end method

.method public abstract onApkInfoLoadFailed(Lcom/aggmoread/sdk/client/AMError;)V
.end method

.method public abstract onApkInfoLoading()V
.end method
