.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/baidu/mobads/sdk/api/NativeResponse$AdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onADExposed()V
    .locals 5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onADExposed "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->g:J

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/e/k;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->f:Ljava/lang/Object;

    const-string v4, "-1"

    invoke-virtual {v2, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v0, v1, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->d()V

    return-void
.end method

.method public onADExposureFailed(I)V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "onADError %d"

    invoke-static {v0, v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const/16 v2, -0x3e8

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public onADStatusChanged()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onADStatusChanged"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onAdClick()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onADClicked"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->f:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->f:I

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)V

    return-void
.end method

.method public onAdUnionClick()V
    .locals 0

    return-void
.end method
