.class public Lcom/aggmoread/sdk/b/g;
.super Lcom/aggmoread/sdk/b/c;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/client/draw/AMDrawAd;


# instance fields
.field private b:Lcom/aggmoread/sdk/z/c/a/a/c/n/a;

.field protected c:Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/c/n/a;Lcom/aggmoread/sdk/b/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/b/c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/a;Lcom/aggmoread/sdk/b/d;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/b/g;->b:Lcom/aggmoread/sdk/z/c/a/a/c/n/a;

    new-instance p2, Lcom/aggmoread/sdk/b/g$a;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/b/g$a;-><init>(Lcom/aggmoread/sdk/b/g;)V

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/n/a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/n/b;)V

    return-void
.end method


# virtual methods
.method protected a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g;->b:Lcom/aggmoread/sdk/z/c/a/a/c/n/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/a;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g;->b:Lcom/aggmoread/sdk/z/c/a/a/c/n/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/a;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/b/g;->c:Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;

    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g;->b:Lcom/aggmoread/sdk/z/c/a/a/c/n/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/a;->getView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public recycle()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g;->b:Lcom/aggmoread/sdk/z/c/a/a/c/n/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/a;->destroy()V

    return-void
.end method

.method public render()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g;->b:Lcom/aggmoread/sdk/z/c/a/a/c/n/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/a;->render()V

    return-void
.end method

.method public renderActivity(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g;->b:Lcom/aggmoread/sdk/z/c/a/a/c/n/a;

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/a;->renderActivity(Landroid/app/Activity;)V

    return-void
.end method

.method public setInteractionListener(Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/b/g;->c:Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;

    return-void
.end method

.method public setVideoListener(Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;)V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g;->b:Lcom/aggmoread/sdk/z/c/a/a/c/n/a;

    new-instance v1, Lcom/aggmoread/sdk/b/g$b;

    invoke-direct {v1, p0, p1}, Lcom/aggmoread/sdk/b/g$b;-><init>(Lcom/aggmoread/sdk/b/g;Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/n/d;)V

    return-void
.end method
