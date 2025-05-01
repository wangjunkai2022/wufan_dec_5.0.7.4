.class final Lcom/kwad/components/ad/l/a$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/l/a;->ar()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ij:Lcom/kwad/components/ad/l/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/l/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget-object v0, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->d(Lcom/kwad/components/ad/l/a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getX()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    .line 2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget-object v0, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->d(Lcom/kwad/components/ad/l/a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getX()F

    move-result v0

    sub-float/2addr p1, v0

    iget-object v0, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->d(Lcom/kwad/components/ad/l/a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget-object v0, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->d(Lcom/kwad/components/ad/l/a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getY()F

    move-result v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    .line 4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget-object v0, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->d(Lcom/kwad/components/ad/l/a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getY()F

    move-result v0

    sub-float/2addr p1, v0

    iget-object v0, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->d(Lcom/kwad/components/ad/l/a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    const-string p1, "LandingPageWebCard"

    const-string p2, "onClick backIcon"

    .line 5
    invoke-static {p1, p2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 6
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {p1, v2, v3}, Lcom/kwad/components/ad/l/a;->a(Lcom/kwad/components/ad/l/a;J)J

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_3

    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object p1, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {p1}, Lcom/kwad/components/ad/l/a;->e(Lcom/kwad/components/ad/l/a;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 10
    iget-object p1, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {p1}, Lcom/kwad/components/ad/l/a;->e(Lcom/kwad/components/ad/l/a;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-lez p1, :cond_2

    const-wide/16 v4, 0x1e

    cmp-long p1, v2, v4

    if-lez p1, :cond_2

    const-wide/16 v4, 0x1f4

    cmp-long p1, v2, v4

    if-gez p1, :cond_2

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {p1}, Lcom/kwad/components/ad/l/a;->f(Lcom/kwad/components/ad/l/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    const/16 v0, 0x9b

    iget-object v2, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    .line 12
    invoke-static {v2}, Lcom/kwad/components/ad/l/a;->g(Lcom/kwad/components/ad/l/a;)Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v2

    .line 13
    invoke-static {p1, v0, v2}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILcom/kwad/sdk/utils/ac$a;)V

    .line 14
    iget-object p1, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {p1}, Lcom/kwad/components/ad/l/a;->h(Lcom/kwad/components/ad/l/a;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {p1, p2}, Lcom/kwad/components/ad/l/a;->d(Lcom/kwad/components/ad/l/a;Z)Z

    .line 16
    iget-object p1, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {p1}, Lcom/kwad/components/ad/l/a;->i(Lcom/kwad/components/ad/l/a;)Lcom/kwad/sdk/core/webview/d/a/a;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 17
    new-instance p1, Lcom/kwad/sdk/core/webview/d/b/a;

    invoke-direct {p1}, Lcom/kwad/sdk/core/webview/d/b/a;-><init>()V

    const/4 p2, 0x3

    .line 18
    iput p2, p1, Lcom/kwad/sdk/core/webview/d/b/a;->Yn:I

    .line 19
    iget-object p2, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {p2}, Lcom/kwad/components/ad/l/a;->i(Lcom/kwad/components/ad/l/a;)Lcom/kwad/sdk/core/webview/d/a/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/kwad/sdk/core/webview/d/a/a;->a(Lcom/kwad/sdk/core/webview/d/b/a;)V

    .line 20
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/ad/l/a$5;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {p1, v6, v7}, Lcom/kwad/components/ad/l/a;->a(Lcom/kwad/components/ad/l/a;J)J

    :cond_3
    :goto_0
    return v1
.end method
