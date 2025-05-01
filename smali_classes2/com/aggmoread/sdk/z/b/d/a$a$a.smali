.class Lcom/aggmoread/sdk/z/b/d/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/b/d/a$a;->a(I[BLcom/aggmoread/sdk/z/a/g/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/b/d/a$a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/d/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$a$a;->b:Lcom/aggmoread/sdk/z/b/d/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$a$a;->b:Lcom/aggmoread/sdk/z/b/d/a$a;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/b/d/a$a;->a:Lcom/aggmoread/sdk/z/a/r/d;

    instance-of v2, v1, Lcom/aggmoread/sdk/z/a/r/e;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/aggmoread/sdk/z/a/r/e;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/d/a$a;->c:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/z/a/r/e;->a(Lcom/aggmoread/sdk/z/a/a;)V

    :cond_0
    return-void
.end method
