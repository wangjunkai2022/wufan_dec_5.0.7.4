.class final Lcom/kwad/components/ad/splashscreen/presenter/n$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/splashscreen/presenter/n;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic DV:Lcom/kwad/components/ad/splashscreen/presenter/n;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/n$1;->DV:Lcom/kwad/components/ad/splashscreen/presenter/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FFFF)V
    .locals 6

    sub-float/2addr p3, p1

    float-to-double v0, p3

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 1
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    sub-float/2addr p4, p2

    float-to-double p1, p4

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    add-double/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    .line 2
    iget-object p3, p0, Lcom/kwad/components/ad/splashscreen/presenter/n$1;->DV:Lcom/kwad/components/ad/splashscreen/presenter/n;

    invoke-static {p3}, Lcom/kwad/components/ad/splashscreen/presenter/n;->a(Lcom/kwad/components/ad/splashscreen/presenter/n;)Landroid/content/Context;

    move-result-object p3

    double-to-float p1, p1

    invoke-static {p3, p1}, Lcom/kwad/sdk/c/a/a;->px2dip(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    float-to-double p2, p1

    .line 3
    iget-object p4, p0, Lcom/kwad/components/ad/splashscreen/presenter/n$1;->DV:Lcom/kwad/components/ad/splashscreen/presenter/n;

    invoke-static {p4}, Lcom/kwad/components/ad/splashscreen/presenter/n;->b(Lcom/kwad/components/ad/splashscreen/presenter/n;)D

    move-result-wide v0

    cmpl-double p4, p2, v0

    if-ltz p4, :cond_0

    .line 4
    iget-object p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/n$1;->DV:Lcom/kwad/components/ad/splashscreen/presenter/n;

    iget-object v0, p2, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 5
    invoke-static {p2}, Lcom/kwad/components/ad/splashscreen/presenter/n;->c(Lcom/kwad/components/ad/splashscreen/presenter/n;)Landroid/content/Context;

    move-result-object v2

    const/16 v3, 0x99

    const/4 v4, 0x2

    new-instance v5, Lcom/kwad/components/ad/splashscreen/presenter/n$1$1;

    invoke-direct {v5, p0, p1}, Lcom/kwad/components/ad/splashscreen/presenter/n$1$1;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/n$1;F)V

    invoke-virtual/range {v0 .. v5}, Lcom/kwad/components/ad/splashscreen/h;->a(ILandroid/content/Context;IILcom/kwad/components/ad/splashscreen/h$a;)V

    :cond_0
    return-void
.end method

.method public final lv()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/n$1;->DV:Lcom/kwad/components/ad/splashscreen/presenter/n;

    .line 2
    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/n;->e(Lcom/kwad/components/ad/splashscreen/presenter/n;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/h;->n(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/n$1;->DV:Lcom/kwad/components/ad/splashscreen/presenter/n;

    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    .line 4
    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/n;->f(Lcom/kwad/components/ad/splashscreen/presenter/n;)Landroid/content/Context;

    move-result-object v0

    const/16 v3, 0x35

    const/4 v4, 0x2

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/kwad/components/ad/splashscreen/h;->c(ILandroid/content/Context;II)V

    :cond_0
    return-void
.end method
