.class Lcom/aggmoread/sdk/z/a/s/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnInfoListener;


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

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0x2bd

    if-eq p2, v2, :cond_2

    const/16 v2, 0x2be

    if-eq p2, v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/s/d;->m(Lcom/aggmoread/sdk/z/a/s/d;)Ljava/lang/String;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/s/d;->j(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/d$j;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/s/d;->j(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/d$j;

    move-result-object v2

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v3}, Lcom/aggmoread/sdk/z/a/s/d;->e(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/aggmoread/sdk/z/a/s/d$j;->b(Landroid/media/MediaPlayer;)V

    :cond_1
    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/s/d;->u(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/a;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/s/d;->u(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/a/s/a;->g()V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/s/d;->m(Lcom/aggmoread/sdk/z/a/s/d;)Ljava/lang/String;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/s/d;->j(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/d$j;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/s/d;->j(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/d$j;

    move-result-object v2

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v3}, Lcom/aggmoread/sdk/z/a/s/d;->e(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/aggmoread/sdk/z/a/s/d$j;->c(Landroid/media/MediaPlayer;)V

    :cond_3
    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/s/d;->u(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/a;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/s/d;->u(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/a/s/a;->o()V

    :cond_4
    :goto_0
    const/4 v2, 0x1

    :goto_1
    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v3}, Lcom/aggmoread/sdk/z/a/s/d;->k(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer$OnInfoListener;

    move-result-object v3

    if-eqz v3, :cond_7

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/d$d;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v3}, Lcom/aggmoread/sdk/z/a/s/d;->k(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer$OnInfoListener;

    move-result-object v3

    invoke-interface {v3, p1, p2, p3}, Landroid/media/MediaPlayer$OnInfoListener;->onInfo(Landroid/media/MediaPlayer;II)Z

    move-result p1

    if-nez p1, :cond_6

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :cond_6
    :goto_2
    return v0

    :cond_7
    return v2
.end method
