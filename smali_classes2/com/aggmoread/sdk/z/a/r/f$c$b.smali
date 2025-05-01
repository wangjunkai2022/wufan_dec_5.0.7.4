.class Lcom/aggmoread/sdk/z/a/r/f$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/m/l$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/r/f$c;->a(Landroid/view/View;Lcom/aggmoread/sdk/z/a/g/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/r/f$c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/r/f$c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$c$b;->a:Lcom/aggmoread/sdk/z/a/r/f$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f$c$b;->a:Lcom/aggmoread/sdk/z/a/r/f$c;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/r/f$c;->a:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/r/f;->e(Lcom/aggmoread/sdk/z/a/r/f;)V

    return-void
.end method

.method public b()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/aggmoread/sdk/z/a/r/f$c$b$a;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/z/a/r/f$c$b$a;-><init>(Lcom/aggmoread/sdk/z/a/r/f$c$b;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    const/4 v1, 0x0

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public c()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/aggmoread/sdk/z/a/r/f$c$b$b;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/z/a/r/f$c$b$b;-><init>(Lcom/aggmoread/sdk/z/a/r/f$c$b;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    const/4 v1, 0x0

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method
