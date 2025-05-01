.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/baidu/mobads/sdk/api/INativeVideoListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Lcom/baidu/mobads/sdk/api/XNativeView;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoCompleted()V

    return-void
.end method

.method public onError()V
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const/16 v1, -0x3e8

    const-string v2, "\u5e7f\u544a\u5c55\u793a\u5931\u8d25"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoPause()V

    return-void
.end method

.method public onRenderingStart()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoStart()V

    return-void
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$c;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoResume()V

    return-void
.end method
