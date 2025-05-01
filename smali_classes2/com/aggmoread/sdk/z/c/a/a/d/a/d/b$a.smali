.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/b/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/aggmoread/sdk/z/c/a/a/d/b/a$c<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b$a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "title "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "XXXXX"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->i(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->C:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->l:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->a(Ljava/util/Map;Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;)V

    return-void
.end method
