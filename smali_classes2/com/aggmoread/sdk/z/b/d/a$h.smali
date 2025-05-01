.class Lcom/aggmoread/sdk/z/b/d/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/r/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/b/d/a;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/b/d/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/d/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$h;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$h;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->e(Lcom/aggmoread/sdk/z/b/d/a;)V

    return-void
.end method

.method public a(J)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$h;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->m(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/d;

    move-result-object v0

    instance-of v0, v0, Lcom/aggmoread/sdk/z/a/r/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$h;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->m(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/d;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/a/r/e;

    invoke-interface {v0, p1, p2}, Lcom/aggmoread/sdk/z/a/r/e;->onAdTick(J)V

    :cond_0
    return-void
.end method
