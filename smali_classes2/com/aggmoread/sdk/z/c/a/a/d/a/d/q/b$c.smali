.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

.field final synthetic d:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$c;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$c;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iput-object p4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$c;->d:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$c;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$c;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$c;->d:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;

    const/4 v3, 0x0

    const-string v4, "timeOut"

    invoke-static {v0, v1, v2, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method
