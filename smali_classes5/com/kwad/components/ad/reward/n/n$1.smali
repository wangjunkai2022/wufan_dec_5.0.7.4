.class final Lcom/kwad/components/ad/reward/n/n$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/n/n;->a(Lcom/kwad/sdk/core/response/model/AdProductInfo;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zI:Lcom/kwad/sdk/core/response/model/AdProductInfo;

.field final synthetic zJ:Lcom/kwad/components/ad/reward/n/n;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/n/n;Lcom/kwad/sdk/core/response/model/AdProductInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/n$1;->zJ:Lcom/kwad/components/ad/reward/n/n;

    iput-object p2, p0, Lcom/kwad/components/ad/reward/n/n$1;->zI:Lcom/kwad/sdk/core/response/model/AdProductInfo;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/n$1;->zI:Lcom/kwad/sdk/core/response/model/AdProductInfo;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/AdProductInfo;->getCouponList()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/core/response/model/CouponInfo;

    .line 3
    iget-object v2, p0, Lcom/kwad/components/ad/reward/n/n$1;->zJ:Lcom/kwad/components/ad/reward/n/n;

    invoke-static {v2}, Lcom/kwad/components/ad/reward/n/n;->a(Lcom/kwad/components/ad/reward/n/n;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/kwad/components/ad/reward/n/n$1;->zJ:Lcom/kwad/components/ad/reward/n/n;

    .line 4
    invoke-static {v4}, Lcom/kwad/components/ad/reward/n/n;->a(Lcom/kwad/components/ad/reward/n/n;)Landroid/widget/LinearLayout;

    move-result-object v4

    .line 5
    invoke-static {v2, v3, v1, v4}, Lcom/kwad/components/ad/reward/n/n;->a(Lcom/kwad/components/ad/reward/n/n;Landroid/content/Context;Lcom/kwad/sdk/core/response/model/CouponInfo;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const/4 v3, -0x1

    const/4 v4, -0x2

    if-nez v2, :cond_0

    .line 7
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v4, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    goto :goto_1

    .line 8
    :cond_0
    iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 9
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 10
    :goto_1
    iget-object v3, p0, Lcom/kwad/components/ad/reward/n/n$1;->zJ:Lcom/kwad/components/ad/reward/n/n;

    invoke-static {v3}, Lcom/kwad/components/ad/reward/n/n;->a(Lcom/kwad/components/ad/reward/n/n;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    new-instance v1, Lcom/kwad/components/core/widget/e;

    invoke-direct {v1}, Lcom/kwad/components/core/widget/e;-><init>()V

    .line 12
    iget-object v2, p0, Lcom/kwad/components/ad/reward/n/n$1;->zJ:Lcom/kwad/components/ad/reward/n/n;

    invoke-static {v2}, Lcom/kwad/components/ad/reward/n/n;->a(Lcom/kwad/components/ad/reward/n/n;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kwad/components/core/s/i;->a(Lcom/kwad/components/core/widget/e;Landroid/view/ViewGroup;)V

    goto :goto_0

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/n$1;->zJ:Lcom/kwad/components/ad/reward/n/n;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/n;->b(Lcom/kwad/components/ad/reward/n/n;)Lcom/kwad/components/ad/reward/n/n$a;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 14
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/n$1;->zJ:Lcom/kwad/components/ad/reward/n/n;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/n;->a(Lcom/kwad/components/ad/reward/n/n;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/n$1;->zJ:Lcom/kwad/components/ad/reward/n/n;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/n;->a(Lcom/kwad/components/ad/reward/n/n;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/ad/reward/n/n$1$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/n/n$1$1;-><init>(Lcom/kwad/components/ad/reward/n/n$1;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 16
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/n$1;->zJ:Lcom/kwad/components/ad/reward/n/n;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/n;->b(Lcom/kwad/components/ad/reward/n/n;)Lcom/kwad/components/ad/reward/n/n$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/ad/reward/n/n$a;->hu()V

    :cond_3
    return-void
.end method
