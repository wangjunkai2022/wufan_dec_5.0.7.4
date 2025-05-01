.class Lcom/aggmoread/sdk/z/a/f/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/f/b;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/f/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/f/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/f/b$h;->c:Lcom/aggmoread/sdk/z/a/f/b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/f/b$h;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/f/b$h;->c:Lcom/aggmoread/sdk/z/a/f/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/f/b;->f(Lcom/aggmoread/sdk/z/a/f/b;)Lcom/aggmoread/sdk/z/a/f/b$l;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/f/b$h;->c:Lcom/aggmoread/sdk/z/a/f/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/f/b;->f(Lcom/aggmoread/sdk/z/a/f/b;)Lcom/aggmoread/sdk/z/a/f/b$l;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/f/b$h;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/a/f/b$l;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
