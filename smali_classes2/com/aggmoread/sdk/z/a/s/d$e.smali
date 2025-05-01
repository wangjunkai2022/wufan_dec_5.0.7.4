.class Lcom/aggmoread/sdk/z/a/s/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/s/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/s/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/s/d;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$e;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$e;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/d;->m(Lcom/aggmoread/sdk/z/a/s/d;)Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$e;->a:Lcom/aggmoread/sdk/z/a/s/d;

    const/4 v0, -0x1

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/a/s/d;->h(Lcom/aggmoread/sdk/z/a/s/d;I)I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$e;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/a/s/d;->c(Lcom/aggmoread/sdk/z/a/s/d;I)I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$e;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/d;->u(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$e;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/d;->u(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/s/a;->n()V

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$e;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/d;->l(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer$OnErrorListener;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$e;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/d;->l(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer$OnErrorListener;

    move-result-object p1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d$e;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/s/d;->e(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-interface {p1, v1, p2, p3}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    :cond_1
    return v0
.end method
