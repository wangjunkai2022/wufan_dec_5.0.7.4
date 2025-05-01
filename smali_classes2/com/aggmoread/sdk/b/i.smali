.class public Lcom/aggmoread/sdk/b/i;
.super Lcom/aggmoread/sdk/b/c;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAd;


# instance fields
.field private b:Lcom/aggmoread/sdk/z/c/a/a/c/p/b;

.field private c:Lcom/aggmoread/sdk/z/c/a/a/c/p/a;

.field private d:Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdInteractionListener;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/c/p/b;Lcom/aggmoread/sdk/b/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/b/c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/a;Lcom/aggmoread/sdk/b/d;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/b/i;->b:Lcom/aggmoread/sdk/z/c/a/a/c/p/b;

    new-instance p1, Lcom/aggmoread/sdk/b/i$a;

    invoke-direct {p1, p0}, Lcom/aggmoread/sdk/b/i$a;-><init>(Lcom/aggmoread/sdk/b/i;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/b/i;->c:Lcom/aggmoread/sdk/z/c/a/a/c/p/a;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/b/i;)Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdInteractionListener;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/b/i;->d:Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdInteractionListener;

    return-object p0
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

    iget-object v0, p0, Lcom/aggmoread/sdk/b/i;->b:Lcom/aggmoread/sdk/z/c/a/a/c/p/b;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/a;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/i;->b:Lcom/aggmoread/sdk/z/c/a/a/c/p/b;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/p/b;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/b/i;->d:Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdInteractionListener;

    iput-object v0, p0, Lcom/aggmoread/sdk/b/i;->c:Lcom/aggmoread/sdk/z/c/a/a/c/p/a;

    return-void
.end method

.method public show(Landroid/app/Activity;Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdInteractionListener;)V
    .locals 1

    iput-object p2, p0, Lcom/aggmoread/sdk/b/i;->d:Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdInteractionListener;

    iget-object p2, p0, Lcom/aggmoread/sdk/b/i;->b:Lcom/aggmoread/sdk/z/c/a/a/c/p/b;

    iget-object v0, p0, Lcom/aggmoread/sdk/b/i;->c:Lcom/aggmoread/sdk/z/c/a/a/c/p/a;

    invoke-interface {p2, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/p/b;->a(Lcom/aggmoread/sdk/z/c/a/a/c/p/a;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/b/i;->b:Lcom/aggmoread/sdk/z/c/a/a/c/p/b;

    invoke-interface {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/p/b;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public show(Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdInteractionListener;)V
    .locals 1

    iput-object p1, p0, Lcom/aggmoread/sdk/b/i;->d:Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdInteractionListener;

    iget-object p1, p0, Lcom/aggmoread/sdk/b/i;->b:Lcom/aggmoread/sdk/z/c/a/a/c/p/b;

    iget-object v0, p0, Lcom/aggmoread/sdk/b/i;->c:Lcom/aggmoread/sdk/z/c/a/a/c/p/a;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/p/b;->a(Lcom/aggmoread/sdk/z/c/a/a/c/p/a;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/b/i;->b:Lcom/aggmoread/sdk/z/c/a/a/c/p/b;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/p/b;->b()V

    return-void
.end method
