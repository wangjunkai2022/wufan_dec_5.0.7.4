.class public Lcom/aggmoread/sdk/b/h;
.super Lcom/aggmoread/sdk/b/c;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;


# instance fields
.field private b:Lcom/aggmoread/sdk/z/c/a/a/c/o/c;

.field protected c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

.field private d:Lcom/aggmoread/sdk/z/c/a/a/c/o/b;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;Lcom/aggmoread/sdk/b/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/b/c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/a;Lcom/aggmoread/sdk/b/d;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/b/h;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/c;

    new-instance p1, Lcom/aggmoread/sdk/b/h$a;

    invoke-direct {p1, p0}, Lcom/aggmoread/sdk/b/h$a;-><init>(Lcom/aggmoread/sdk/b/h;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/b/h;->d:Lcom/aggmoread/sdk/z/c/a/a/c/o/b;

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

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/c;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/a;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/c;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/c;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/b/h;->d:Lcom/aggmoread/sdk/z/c/a/a/c/o/b;

    iput-object v0, p0, Lcom/aggmoread/sdk/b/h;->c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/c;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/c;->getView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public recycle()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/c;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/c;->destroy()V

    return-void
.end method

.method public render()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/c;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/c;->render()V

    return-void
.end method

.method public renderActivity(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/c;

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/c;->renderActivity(Landroid/app/Activity;)V

    return-void
.end method

.method public setInteractionListener(Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;)V
    .locals 1

    iput-object p1, p0, Lcom/aggmoread/sdk/b/h;->c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/c;

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h;->d:Lcom/aggmoread/sdk/z/c/a/a/c/o/b;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/c;->a(Lcom/aggmoread/sdk/z/c/a/a/c/o/b;)V

    return-void
.end method

.method public setMediaListener(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;)V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/c;

    new-instance v1, Lcom/aggmoread/sdk/b/h$b;

    invoke-direct {v1, p0, p1}, Lcom/aggmoread/sdk/b/h$b;-><init>(Lcom/aggmoread/sdk/b/h;Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/c;->a(Lcom/aggmoread/sdk/z/c/a/a/c/o/a;)V

    return-void
.end method
