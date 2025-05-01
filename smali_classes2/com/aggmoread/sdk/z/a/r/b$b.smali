.class final Lcom/aggmoread/sdk/z/a/r/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/a/g/e;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/i/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/g/e;Lcom/aggmoread/sdk/z/a/i/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/b$b;->b:Lcom/aggmoread/sdk/z/a/g/e;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/r/b$b;->c:Lcom/aggmoread/sdk/z/a/i/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/b$b;->b:Lcom/aggmoread/sdk/z/a/g/e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "ADRIML"

    const-string v2, "NFE %s"

    invoke-static {v1, v2, v0}, Lcom/aggmoread/sdk/z/a/d;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/b$b;->c:Lcom/aggmoread/sdk/z/a/i/b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/b$b;->b:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/a/i/b;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void
.end method
