.class final Lcom/aggmoread/sdk/z/c/a/a/c/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/c/k;->a(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/c/k$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/c/k$e;


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/c/k$e;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/k$a;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/c/k$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/k$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;[BLcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 1

    const-string p2, "S2S_TAG"

    if-nez p3, :cond_0

    if-eqz p1, :cond_0

    const-string p3, "callback success "

    invoke-static {p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/c/k$a;->a:Ljava/util/Map;

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/k;->a(Ljava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Lcom/aggmoread/sdk/z/c/a/a/c/k$f;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/c/k$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/k$e;

    invoke-interface {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/k$e;->callback(Lcom/aggmoread/sdk/z/c/a/a/c/k$f;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "callback fail "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/k$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/k$e;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/k$e;->callback(Lcom/aggmoread/sdk/z/c/a/a/c/k$f;)V

    :goto_0
    return-void
.end method
