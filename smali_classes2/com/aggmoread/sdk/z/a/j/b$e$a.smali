.class Lcom/aggmoread/sdk/z/a/j/b$e$a;
.super Lcom/aggmoread/sdk/z/a/j/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/j/b$e;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/a/j/b$e;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/j/b$e;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e$a;->b:Lcom/aggmoread/sdk/z/a/j/b$e;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e$a;->b:Lcom/aggmoread/sdk/z/a/j/b$e;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/b$e;->a(Lcom/aggmoread/sdk/z/a/j/b$e;)Lcom/aggmoread/sdk/z/a/j/c;

    move-result-object p1

    iget-object p3, p0, Lcom/aggmoread/sdk/z/a/j/b$e$a;->b:Lcom/aggmoread/sdk/z/a/j/b$e;

    iget-object p3, p3, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p3}, Lcom/aggmoread/sdk/z/a/j/b;->b(Lcom/aggmoread/sdk/z/a/j/b;)I

    move-result p3

    int-to-long v0, p3

    const/16 p3, -0x7d3

    const-string v2, "click notification open apk"

    invoke-virtual {p1, v0, v1, p3, v2}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e$a;->b:Lcom/aggmoread/sdk/z/a/j/b$e;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-virtual {p1, p4}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/aggmoread/sdk/z/a/j/e;->a(Ljava/lang/String;)V

    return-void
.end method
