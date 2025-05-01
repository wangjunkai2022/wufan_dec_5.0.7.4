.class Lcom/aggmoread/sdk/z/a/s/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;


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

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$a;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 0

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d$a;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result p3

    invoke-static {p2, p3}, Lcom/aggmoread/sdk/z/a/s/d;->a(Lcom/aggmoread/sdk/z/a/s/d;I)I

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d$a;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result p1

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/a/s/d;->b(Lcom/aggmoread/sdk/z/a/s/d;I)I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$a;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/d;->m(Lcom/aggmoread/sdk/z/a/s/d;)Ljava/lang/String;

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d$a;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p2}, Lcom/aggmoread/sdk/z/a/s/d;->a(Lcom/aggmoread/sdk/z/a/s/d;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x0

    aput-object p2, p1, p3

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d$a;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p2}, Lcom/aggmoread/sdk/z/a/s/d;->b(Lcom/aggmoread/sdk/z/a/s/d;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, p1, p3

    const-string p2, "onVideoSizeChanged width=%d,height=%d"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$a;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/d;->a(Lcom/aggmoread/sdk/z/a/s/d;)I

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$a;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/d;->b(Lcom/aggmoread/sdk/z/a/s/d;)I

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$a;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/d;->s(Lcom/aggmoread/sdk/z/a/s/d;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d$a;->a:Lcom/aggmoread/sdk/z/a/s/d;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->requestLayout()V

    :cond_0
    return-void
.end method
