.class public abstract Lcom/aggmoread/sdk/b/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/client/AMAdInterface;


# instance fields
.field private a:Lcom/aggmoread/sdk/z/c/a/a/c/a;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/c/a;Lcom/aggmoread/sdk/b/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/b/c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/a;

    return-void
.end method


# virtual methods
.method protected abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public final getAdExtras()Lcom/aggmoread/sdk/client/AMAdExtras;
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/client/AMAdExtras;

    invoke-virtual {p0}, Lcom/aggmoread/sdk/b/c;->a()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/client/AMAdExtras;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public getID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/a;->getID()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public notifyBidFail(IILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/c/a;->a(IILjava/lang/String;)V

    return-void
.end method

.method public notifyBidSuccess(I)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/a;

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/a;->a(I)V

    return-void
.end method

.method public setDownloadConfirmListener(Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener;)V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/a;

    new-instance v1, Lcom/aggmoread/sdk/b/b;

    invoke-direct {v1, p1}, Lcom/aggmoread/sdk/b/b;-><init>(Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/c;)V

    return-void
.end method
