.class public interface abstract Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/client/AMAdInterface;


# virtual methods
.method public abstract bindAdToView(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;)Landroid/view/View;
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/View;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            "Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation
.end method

.method public abstract bindMediaAdToView(Lcom/aggmoread/sdk/client/AMAdMediaView;Lcom/aggmoread/sdk/client/AMAdMediaListener;)V
    .param p1    # Lcom/aggmoread/sdk/client/AMAdMediaView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract destroy()V
.end method

.method public abstract getAdPatternType()I
.end method

.method public abstract getAppInfo()Lcom/aggmoread/sdk/client/AMAppInfo;
.end method

.method public abstract getAppPrice()D
.end method

.method public abstract getAppScore()I
.end method

.method public abstract getAppStatus()I
.end method

.method public abstract getDesc()Ljava/lang/String;
.end method

.method public abstract getDownloadCount()J
.end method

.method public abstract getIconUrl()Ljava/lang/String;
.end method

.method public abstract getImageUrl()Ljava/lang/String;
.end method

.method public abstract getImageUrlList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPictureHeight()I
.end method

.method public abstract getPictureWidth()I
.end method

.method public abstract getProgress()I
.end method

.method public abstract getTitle()Ljava/lang/String;
.end method

.method public abstract getVideoCurrentPosition()I
.end method

.method public abstract getVideoDuration()I
.end method

.method public abstract isAppAd()Z
.end method

.method public abstract isVideoAd()Z
.end method

.method public abstract pauseVideo()V
.end method

.method public abstract resume()V
.end method

.method public abstract resumeVideo()V
.end method

.method public abstract setVideoMute(Z)V
.end method

.method public abstract startVideo()V
.end method

.method public abstract stopVideo()V
.end method
