.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/a$c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c$b$a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a$c;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
