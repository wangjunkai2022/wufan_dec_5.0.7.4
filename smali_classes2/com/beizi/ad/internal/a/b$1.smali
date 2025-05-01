.class Lcom/beizi/ad/internal/a/b$1;
.super Ljava/lang/Object;
.source "MediationAdViewController.java"

# interfaces
.implements Lcom/beizi/ad/internal/network/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/a/b;


# virtual methods
.method public a()Lcom/beizi/ad/internal/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/a/b$1;->a:Lcom/beizi/ad/internal/a/b;

    iget-object v0, v0, Lcom/beizi/ad/internal/a/b;->a:Lcom/beizi/ad/internal/j;

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()Lcom/beizi/ad/internal/view/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/a/b$1;->a:Lcom/beizi/ad/internal/a/b;

    iget-object v0, v0, Lcom/beizi/ad/internal/a/b;->e:Lcom/beizi/ad/internal/a/e;

    return-object v0
.end method

.method public d()Lcom/beizi/ad/NativeAdResponse;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/a/b$1;->a:Lcom/beizi/ad/internal/a/b;

    iget-object v0, v0, Lcom/beizi/ad/internal/a/b;->e:Lcom/beizi/ad/internal/a/e;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/a/e;->destroy()V

    return-void
.end method
