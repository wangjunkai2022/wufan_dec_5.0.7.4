.class Lcom/aggmoread/sdk/z/a/r/b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/r/b$a;->a(ILorg/json/JSONObject;Lcom/aggmoread/sdk/z/a/g/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/a/g/b;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/r/b$a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/r/b$a;Lcom/aggmoread/sdk/z/a/g/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/b$a$b;->c:Lcom/aggmoread/sdk/z/a/r/b$a;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/r/b$a$b;->b:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/b$a$b;->b:Lcom/aggmoread/sdk/z/a/g/b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/b$a$b;->c:Lcom/aggmoread/sdk/z/a/r/b$a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/a/r/b$a;->a:Lcom/aggmoread/sdk/z/a/i/b;

    check-cast v1, Lcom/aggmoread/sdk/z/a/l/a;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/l/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/b$a$b;->c:Lcom/aggmoread/sdk/z/a/r/b$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/r/b$a;->a:Lcom/aggmoread/sdk/z/a/i/b;

    new-instance v1, Lcom/aggmoread/sdk/z/a/g/e;

    const v2, 0xc353

    const-string v3, "SDK\u5185\u90e8\u5904\u7406\u5f02\u5e38!"

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    :goto_0
    return-void
.end method
