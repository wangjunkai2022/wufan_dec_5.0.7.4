.class Lcom/aggmoread/sdk/z/a/j/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/j/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/a/j/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/j/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$c;->b:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$c;->b:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/b;->c(Lcom/aggmoread/sdk/z/a/j/b;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/b$c;->b:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/j/b;->g(Lcom/aggmoread/sdk/z/a/j/b;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/b;->a(Lcom/aggmoread/sdk/z/a/j/b;Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$c;->b:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/b;->a(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$c;->b:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/b;->a(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/c;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b$c;->b:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/b;->b(Lcom/aggmoread/sdk/z/a/j/b;)I

    move-result v1

    int-to-long v1, v1

    const/16 v3, -0x7d5

    const-string v4, "user cancel install"

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    :cond_0
    return-void
.end method
