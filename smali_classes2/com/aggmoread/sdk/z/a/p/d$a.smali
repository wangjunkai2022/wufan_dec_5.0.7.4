.class Lcom/aggmoread/sdk/z/a/p/d$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/p/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/p/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/p/d;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/p/d$a;->a:Lcom/aggmoread/sdk/z/a/p/d;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/p/d$a;->a:Lcom/aggmoread/sdk/z/a/p/d;

    iget-boolean v0, p2, Lcom/aggmoread/sdk/z/a/p/d;->c:Z

    invoke-virtual {p2, p1}, Lcom/aggmoread/sdk/z/a/p/d;->a(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p2, Lcom/aggmoread/sdk/z/a/p/d;->c:Z

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/p/d$a;->a:Lcom/aggmoread/sdk/z/a/p/d;

    iget-boolean p1, p1, Lcom/aggmoread/sdk/z/a/p/d;->c:Z

    if-eq v0, p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "connectivity changed, isConnected: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/p/d$a;->a:Lcom/aggmoread/sdk/z/a/p/d;

    iget-boolean p2, p2, Lcom/aggmoread/sdk/z/a/p/d;->c:Z

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ConnectivityListener"

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/a/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/p/d$a;->a:Lcom/aggmoread/sdk/z/a/p/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/p/d;->a(Lcom/aggmoread/sdk/z/a/p/d;)Lcom/aggmoread/sdk/z/a/p/c;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/p/d$a;->a:Lcom/aggmoread/sdk/z/a/p/d;

    iget-boolean p2, p2, Lcom/aggmoread/sdk/z/a/p/d;->c:Z

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/a/p/c;->a(Z)V

    :cond_0
    return-void
.end method
