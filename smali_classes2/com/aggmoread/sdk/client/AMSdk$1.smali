.class final Lcom/aggmoread/sdk/client/AMSdk$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/k$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/client/AMSdk;->getSDKBidInfo(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/client/AMSdk$SDKBidInfoCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$callback:Lcom/aggmoread/sdk/client/AMSdk$SDKBidInfoCallback;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/client/AMSdk$SDKBidInfoCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMSdk$1;->val$callback:Lcom/aggmoread/sdk/client/AMSdk$SDKBidInfoCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public callback(Lcom/aggmoread/sdk/z/c/a/a/c/k$f;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/aggmoread/sdk/z/c/a/a/c/k$f;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/c/k$f;->b:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMSdk$1;->val$callback:Lcom/aggmoread/sdk/client/AMSdk$SDKBidInfoCallback;

    invoke-interface {v1, v0, p1}, Lcom/aggmoread/sdk/client/AMSdk$SDKBidInfoCallback;->onResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
