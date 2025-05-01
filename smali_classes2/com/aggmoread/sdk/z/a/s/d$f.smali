.class Lcom/aggmoread/sdk/z/a/s/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnBufferingUpdateListener;


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

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$f;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBufferingUpdate(Landroid/media/MediaPlayer;I)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d$f;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/d;->j(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/d$j;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d$f;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/d;->j(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/d$j;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/a/s/d$j;->g(Landroid/media/MediaPlayer;)V

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$f;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/s/d;->d(Lcom/aggmoread/sdk/z/a/s/d;I)I

    return-void
.end method
