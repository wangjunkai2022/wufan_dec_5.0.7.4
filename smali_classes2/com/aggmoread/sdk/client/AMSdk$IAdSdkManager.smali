.class interface abstract Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/client/AMSdk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x60a
    name = "IAdSdkManager"
.end annotation


# virtual methods
.method public abstract init(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdConfig;)V
.end method

.method public abstract preLoad(Landroid/content/Context;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/client/AMChannelIdInfo;",
            ">;)V"
        }
    .end annotation
.end method
