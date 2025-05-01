.class Lcom/aggmoread/sdk/z/a/r/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/r/g$a;->a(I[BLcom/aggmoread/sdk/z/a/g/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/a/r/g$b;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/r/g$a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/r/g$a;Lcom/aggmoread/sdk/z/a/r/g$b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/g$a$a;->c:Lcom/aggmoread/sdk/z/a/r/g$a;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/r/g$a$a;->b:Lcom/aggmoread/sdk/z/a/r/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/g$a$a;->c:Lcom/aggmoread/sdk/z/a/r/g$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/r/g$a;->a:Lcom/aggmoread/sdk/z/a/r/g$c;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/g$a$a;->b:Lcom/aggmoread/sdk/z/a/r/g$b;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/r/g$c;->a(Lcom/aggmoread/sdk/z/a/r/g$b;)V

    return-void
.end method
