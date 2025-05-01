.class Lcom/aggmoread/sdk/z/b/e/a$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/t/h$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/b/e/a$a;-><init>(Lcom/aggmoread/sdk/z/b/e/a;Landroid/content/Context;Ljava/lang/String;Lcom/aggmoread/sdk/z/b/e/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/b/e/a$a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/e/a$a;Lcom/aggmoread/sdk/z/b/e/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/e/a$a$c;->b:Lcom/aggmoread/sdk/z/b/e/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "AIWTAG"

    const-string v1, "sd cp"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/e/a$a$c;->b:Lcom/aggmoread/sdk/z/b/e/a$a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/e/a$a;->a(Lcom/aggmoread/sdk/z/b/e/a$a;)Lcom/aggmoread/sdk/z/b/e/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/e/a$a$c;->b:Lcom/aggmoread/sdk/z/b/e/a$a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/e/a$a;->a(Lcom/aggmoread/sdk/z/b/e/a$a;)Lcom/aggmoread/sdk/z/b/e/a$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/b/e/a$b;->onRenderSuccess()V

    :cond_0
    return-void
.end method
