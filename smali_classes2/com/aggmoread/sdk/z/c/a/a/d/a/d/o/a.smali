.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/b/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Lcom/aggmoread/sdk/z/c/a/a/d/b/a;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/d/a;

    invoke-direct {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/d/a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-object v0
.end method

.method public e(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Lcom/aggmoread/sdk/z/c/a/a/d/b/a;
    .locals 3

    iget-object v0, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->S:Ljava/lang/Object;

    const-string v2, "2"

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/c;

    invoke-direct {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;

    invoke-direct {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-object v0
.end method

.method public f(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Lcom/aggmoread/sdk/z/c/a/a/d/b/a;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-direct {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-object v0
.end method

.method public h(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Lcom/aggmoread/sdk/z/c/a/a/d/b/a;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/g/a;

    invoke-direct {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/g/a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-object v0
.end method
