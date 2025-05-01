.class public Lcom/aggmoread/sdk/z/a/j/m;
.super Lcom/aggmoread/sdk/z/a/j/i;
.source "SourceFile"


# instance fields
.field private b:Lcom/aggmoread/sdk/z/a/j/i;

.field private c:Lcom/aggmoread/sdk/z/a/j/k;

.field private d:I

.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/a/j/i;Lcom/aggmoread/sdk/z/a/j/k;)V
    .locals 3

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/i;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/aggmoread/sdk/z/a/j/m$a;

    invoke-direct {v2, p0}, Lcom/aggmoread/sdk/z/a/j/m$a;-><init>(Lcom/aggmoread/sdk/z/a/j/m;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    if-nez p1, :cond_0

    sget-object p1, Lcom/aggmoread/sdk/z/a/j/i;->a:Lcom/aggmoread/sdk/z/a/j/i;

    :cond_0
    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/m;->b:Lcom/aggmoread/sdk/z/a/j/i;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/j/m;->c:Lcom/aggmoread/sdk/z/a/j/k;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/j/m;->c:Lcom/aggmoread/sdk/z/a/j/k;

    return-object p0
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/i;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/j/m;->b:Lcom/aggmoread/sdk/z/a/j/i;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public a(IJJ)V
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/m;->d:I

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    long-to-int p3, p2

    const/4 p2, 0x1

    invoke-static {v0, p2, p1, p3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object p2

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    iput-object p3, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object p3, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    invoke-virtual {p3, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    iput p1, p0, Lcom/aggmoread/sdk/z/a/j/m;->d:I

    :cond_0
    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    const/4 p2, 0x4

    invoke-static {p1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public a(Ljava/io/File;)V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/m;->e:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
