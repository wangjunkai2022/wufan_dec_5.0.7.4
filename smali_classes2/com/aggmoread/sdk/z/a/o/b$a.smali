.class Lcom/aggmoread/sdk/z/a/o/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/o/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/o/b;->a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/r/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/r/c;

.field final synthetic b:Lcom/aggmoread/sdk/z/a/o/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/o/b;Lcom/aggmoread/sdk/z/a/r/c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/o/b$a;->b:Lcom/aggmoread/sdk/z/a/o/b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/o/b$a;->a:Lcom/aggmoread/sdk/z/a/r/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b$a;->b:Lcom/aggmoread/sdk/z/a/o/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/o/b;->c(Lcom/aggmoread/sdk/z/a/o/b;)V

    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b$a;->a:Lcom/aggmoread/sdk/z/a/r/c;

    new-instance v1, Lcom/aggmoread/sdk/z/a/g/e;

    invoke-direct {v1, p1, p2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b$a;->b:Lcom/aggmoread/sdk/z/a/o/b;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/o/b;->a(Lcom/aggmoread/sdk/z/a/o/b;Landroid/app/Activity;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/r/a;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b$a;->b:Lcom/aggmoread/sdk/z/a/o/b;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/o/b;->a(Lcom/aggmoread/sdk/z/a/o/b;Lcom/aggmoread/sdk/z/a/r/a;)Lcom/aggmoread/sdk/z/a/r/a;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/o/b$a;->b:Lcom/aggmoread/sdk/z/a/o/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/o/b;->a(Lcom/aggmoread/sdk/z/a/o/b;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/o/b$a;->b:Lcom/aggmoread/sdk/z/a/o/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/o/b;->b(Lcom/aggmoread/sdk/z/a/o/b;)V

    return-void
.end method
