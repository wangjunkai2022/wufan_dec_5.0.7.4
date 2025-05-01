.class Lcom/join/mgps/ad/a$d;
.super Lcom/join/mgps/ad/s;
.source "AdManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/ad/a;->e(Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic r:Z

.field final synthetic s:Lcom/join/mgps/ad/a;


# direct methods
.method constructor <init>(Lcom/join/mgps/ad/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    iput-boolean p5, p0, Lcom/join/mgps/ad/a$d;->r:Z

    invoke-direct {p0, p2, p3, p4}, Lcom/join/mgps/ad/s;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/ad/d;->a(Ljava/lang/String;II)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/join/mgps/ad/n;->a(Ljava/lang/String;II)V

    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/d;->b(Z)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/join/mgps/ad/n;->b(Z)V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/d;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/join/mgps/ad/n;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onADClick()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onADClick()V

    .line 2
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/MApplication;->G(Z)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0}, Lcom/join/mgps/ad/n;->onADClick()V

    :cond_0
    return-void
.end method

.method public onADClose()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onADClose()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0}, Lcom/join/mgps/ad/n;->onADClose()V

    :cond_0
    return-void
.end method

.method public onADExpose()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onADExpose()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0}, Lcom/join/mgps/ad/n;->onADExpose()V

    :cond_0
    return-void
.end method

.method public onADShow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onADShow()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0}, Lcom/join/mgps/ad/n;->onADShow()V

    :cond_0
    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/join/mgps/ad/n;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onInitSuccess()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onInitSuccess()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/ad/a$d;->r:Z

    invoke-virtual {p0, v0}, Lcom/join/mgps/ad/s;->h(Z)V

    return-void
.end method

.method public onReward(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/d;->onReward(Ljava/util/Map;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/join/mgps/ad/n;->onReward(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onVideoCached()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onVideoCached()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0}, Lcom/join/mgps/ad/n;->onVideoCached()V

    :cond_0
    return-void
.end method

.method public onVideoComplete()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onVideoComplete()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/a$d;->s:Lcom/join/mgps/ad/a;

    invoke-static {v0}, Lcom/join/mgps/ad/a;->a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;

    move-result-object v0

    invoke-interface {v0}, Lcom/join/mgps/ad/n;->onVideoComplete()V

    :cond_0
    return-void
.end method
