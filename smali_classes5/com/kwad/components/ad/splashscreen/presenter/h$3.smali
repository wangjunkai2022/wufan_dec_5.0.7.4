.class final Lcom/kwad/components/ad/splashscreen/presenter/h$3;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/splashscreen/presenter/h;->a(Landroid/widget/ImageView;Lcom/kwad/sdk/core/response/model/AdInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ds:Lcom/kwad/components/ad/splashscreen/presenter/h;

.field final synthetic Dw:Landroid/widget/ImageView;

.field final synthetic Dx:Lcom/kwad/sdk/core/response/model/AdInfo$CutRuleInfo;

.field final synthetic si:Lcom/kwad/sdk/core/response/model/AdInfo;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/h;Landroid/widget/ImageView;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/sdk/core/response/model/AdInfo$CutRuleInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$3;->Ds:Lcom/kwad/components/ad/splashscreen/presenter/h;

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$3;->Dw:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$3;->si:Lcom/kwad/sdk/core/response/model/AdInfo;

    iput-object p4, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$3;->Dx:Lcom/kwad/sdk/core/response/model/AdInfo$CutRuleInfo;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$3;->Dw:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$3;->Dw:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$3;->si:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aT(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;

    move-result-object v2

    iget v2, v2, Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;->width:I

    int-to-double v2, v2

    .line 4
    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$3;->Dx:Lcom/kwad/sdk/core/response/model/AdInfo$CutRuleInfo;

    iget v5, v4, Lcom/kwad/sdk/core/response/model/AdInfo$CutRuleInfo;->picHeight:I

    int-to-double v5, v5

    .line 5
    iget v7, v4, Lcom/kwad/sdk/core/response/model/AdInfo$CutRuleInfo;->viewTopMargin:I

    int-to-double v7, v7

    .line 6
    iget v4, v4, Lcom/kwad/sdk/core/response/model/AdInfo$CutRuleInfo;->safeAreaHeight:I

    int-to-double v9, v4

    const-wide/16 v11, 0x0

    cmpg-double v4, v5, v11

    if-lez v4, :cond_1

    cmpg-double v4, v9, v11

    if-gtz v4, :cond_0

    goto :goto_0

    :cond_0
    int-to-double v11, v1

    .line 7
    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v11, v2

    .line 8
    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v1, v5, v9

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    div-double v1, v7, v1

    .line 9
    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v11

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v11

    int-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v5, v3

    mul-double v1, v1, v5

    sub-double v0, v7, v1

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v5, v2

    sub-double/2addr v7, v0

    sub-double/2addr v5, v7

    mul-double v5, v5, v2

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$3;->Dw:Landroid/widget/ImageView;

    .line 11
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    double-to-int v1, v5

    .line 12
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 13
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$3;->Dw:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    :goto_0
    return-void
.end method
