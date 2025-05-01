.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/r/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "AMITAGBD"

    const-string v1, "onADClosed"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/a;)V
    .locals 2

    const-string v0, "AMITAGBD"

    const-string v1, "onAdLoaded"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;Lcom/aggmoread/sdk/z/a/a;)Lcom/aggmoread/sdk/z/a/a;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;)Lcom/aggmoread/sdk/z/a/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/a;->b()I

    move-result p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;II)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/b;->b(Ljava/util/Map;ILcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->d(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/g/e;)V
    .locals 2

    const-string v0, "AMITAGBD"

    const-string v1, "onAdError"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->a()I

    move-result v1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public e()V
    .locals 3

    const-string v0, "AMITAGBD"

    const-string v1, "onADExposure"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a$a;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;)V

    const-wide/16 v1, 0x1

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onAdClicked()V
    .locals 2

    const-string v0, "AMITAGBD"

    const-string v1, "onADClicked"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->e(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;)V

    return-void
.end method

.method public onAdShow()V
    .locals 2

    const-string v0, "AMITAGBD"

    const-string v1, "onADOpened"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;)V

    return-void
.end method
