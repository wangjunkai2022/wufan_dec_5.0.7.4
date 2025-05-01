.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->onAdSkip(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a$c;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a$c;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;)[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a([Ljava/lang/Object;I)V

    return-void
.end method
