.class public interface abstract Lcom/beizi/ad/NativeAdResponse;
.super Ljava/lang/Object;
.source "NativeAdResponse.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/NativeAdResponse$b;,
        Lcom/beizi/ad/NativeAdResponse$a;
    }
.end annotation


# virtual methods
.method public abstract destroy()V
.end method

.method public abstract getAdUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;
.end method

.method public abstract getAdvertiser()Ljava/lang/String;
.end method

.method public abstract getApkInfo()Lcom/beizi/ad/lance/ApkBean;
.end method

.method public abstract getBody()Ljava/lang/String;
.end method

.method public abstract getCallToAction()Ljava/lang/String;
.end method

.method public abstract getClickTrackers()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getHeadline()Ljava/lang/String;
.end method

.method public abstract getIcon()Landroid/graphics/Bitmap;
.end method

.method public abstract getIconUrl()Ljava/lang/String;
.end method

.method public abstract getImage()Landroid/graphics/Bitmap;
.end method

.method public abstract getImageUrl()Ljava/lang/String;
.end method

.method public abstract getImageUrls()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getImpTrackers()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLandingPageUrl()Ljava/lang/String;
.end method

.method public abstract getNativeAdType()Lcom/beizi/ad/NativeAdResponse$b;
.end method

.method public abstract getNativeElements()Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNativeInfoListView()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNetworkIdentifier()Lcom/beizi/ad/NativeAdResponse$a;
.end method

.method public abstract getPrice()Ljava/lang/String;
.end method

.method public abstract getStarRating()D
.end method

.method public abstract getStore()Ljava/lang/String;
.end method

.method public abstract getTexts()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getVedioUrls()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getlogoUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;
.end method

.method public abstract handleClick(Landroid/content/Context;)V
.end method

.method public abstract handleClick(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract hasExpired()Z
.end method

.method public abstract regesterClickListener(Landroid/view/View;Lcom/beizi/ad/internal/nativead/NativeAdEventListener;)V
.end method

.method public abstract regesterShow(Landroid/view/View;)Z
.end method

.method public abstract regesterShow(Landroid/view/View;Lcom/beizi/ad/internal/nativead/NativeAdShownListener;)Z
.end method

.method public abstract registerView(Landroid/view/View;Lcom/beizi/ad/internal/nativead/NativeAdEventListener;)Z
.end method

.method public abstract registerViewList(Landroid/view/View;Ljava/util/List;Lcom/beizi/ad/internal/nativead/NativeAdEventListener;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Lcom/beizi/ad/internal/nativead/NativeAdEventListener;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract sendClickLog()V
.end method

.method public abstract sendImpLog()V
.end method

.method public abstract setIcon(Landroid/graphics/Bitmap;)V
.end method

.method public abstract setImage(Landroid/graphics/Bitmap;)V
.end method

.method public abstract setNativeInfoListView(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract unregisterViews()V
.end method
