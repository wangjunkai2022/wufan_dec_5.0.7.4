.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/j/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;)V

    return-void
.end method
