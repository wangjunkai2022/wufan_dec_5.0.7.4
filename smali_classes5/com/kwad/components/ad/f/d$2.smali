.class final Lcom/kwad/components/ad/f/d$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/d;->a(Landroid/app/Activity;Landroid/view/ViewGroup;ILandroid/view/View;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kz:Landroid/view/ViewGroup;

.field final synthetic mA:Landroid/view/View;

.field final synthetic mB:Landroid/app/Activity;

.field final synthetic mC:I

.field final synthetic mD:Z

.field final synthetic mx:Lcom/kwad/components/ad/f/d;

.field private my:[I

.field final synthetic mz:Lcom/kwad/sdk/utils/ac$a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/d;Lcom/kwad/sdk/utils/ac$a;Landroid/view/ViewGroup;Landroid/view/View;Landroid/app/Activity;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/d$2;->mx:Lcom/kwad/components/ad/f/d;

    iput-object p2, p0, Lcom/kwad/components/ad/f/d$2;->mz:Lcom/kwad/sdk/utils/ac$a;

    iput-object p3, p0, Lcom/kwad/components/ad/f/d$2;->kz:Landroid/view/ViewGroup;

    iput-object p4, p0, Lcom/kwad/components/ad/f/d$2;->mA:Landroid/view/View;

    iput-object p5, p0, Lcom/kwad/components/ad/f/d$2;->mB:Landroid/app/Activity;

    iput p6, p0, Lcom/kwad/components/ad/f/d$2;->mC:I

    iput-boolean p7, p0, Lcom/kwad/components/ad/f/d$2;->mD:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/f/d$2;->my:[I

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$2;->mz:Lcom/kwad/sdk/utils/ac$a;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    iget-object v4, p0, Lcom/kwad/components/ad/f/d$2;->my:[I

    aget v4, v4, v1

    int-to-float v4, v4

    sub-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    iget-object v4, p0, Lcom/kwad/components/ad/f/d$2;->my:[I

    aget v4, v4, v2

    int-to-float v4, v4

    sub-float/2addr p2, v4

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    .line 4
    invoke-virtual {v0, v3, p2}, Lcom/kwad/sdk/utils/ac$a;->g(FF)V

    .line 5
    iget-object p2, p0, Lcom/kwad/components/ad/f/d$2;->mx:Lcom/kwad/components/ad/f/d;

    iget-object v0, p0, Lcom/kwad/components/ad/f/d$2;->mz:Lcom/kwad/sdk/utils/ac$a;

    invoke-static {p2, v0}, Lcom/kwad/components/ad/f/d;->a(Lcom/kwad/components/ad/f/d;Lcom/kwad/sdk/utils/ac$a;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 6
    iget-object p2, p0, Lcom/kwad/components/ad/f/d$2;->mA:Landroid/view/View;

    invoke-virtual {p2, v1}, Landroid/view/View;->setPressed(Z)V

    .line 7
    iget-object v2, p0, Lcom/kwad/components/ad/f/d$2;->mx:Lcom/kwad/components/ad/f/d;

    iget-object v3, p0, Lcom/kwad/components/ad/f/d$2;->mB:Landroid/app/Activity;

    iget-object v5, p0, Lcom/kwad/components/ad/f/d$2;->mz:Lcom/kwad/sdk/utils/ac$a;

    iget v6, p0, Lcom/kwad/components/ad/f/d$2;->mC:I

    iget-boolean v7, p0, Lcom/kwad/components/ad/f/d$2;->mD:Z

    const/16 v8, 0x99

    move-object v4, p1

    invoke-static/range {v2 .. v8}, Lcom/kwad/components/ad/f/d;->a(Lcom/kwad/components/ad/f/d;Landroid/app/Activity;Landroid/view/View;Lcom/kwad/sdk/utils/ac$a;IZI)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cf()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 9
    iget-object p2, p0, Lcom/kwad/components/ad/f/d$2;->mx:Lcom/kwad/components/ad/f/d;

    iget-object v0, p0, Lcom/kwad/components/ad/f/d$2;->mz:Lcom/kwad/sdk/utils/ac$a;

    invoke-static {p2, v0}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;Lcom/kwad/sdk/utils/ac$a;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 10
    iget-object v3, p0, Lcom/kwad/components/ad/f/d$2;->mx:Lcom/kwad/components/ad/f/d;

    iget-object v4, p0, Lcom/kwad/components/ad/f/d$2;->mB:Landroid/app/Activity;

    iget-object v6, p0, Lcom/kwad/components/ad/f/d$2;->mz:Lcom/kwad/sdk/utils/ac$a;

    iget v7, p0, Lcom/kwad/components/ad/f/d$2;->mC:I

    iget-boolean v8, p0, Lcom/kwad/components/ad/f/d$2;->mD:Z

    const/4 v9, 0x0

    move-object v5, p1

    invoke-static/range {v3 .. v9}, Lcom/kwad/components/ad/f/d;->a(Lcom/kwad/components/ad/f/d;Landroid/app/Activity;Landroid/view/View;Lcom/kwad/sdk/utils/ac$a;IZI)V

    :cond_2
    return v2

    .line 11
    :cond_3
    iget-object p1, p0, Lcom/kwad/components/ad/f/d$2;->mz:Lcom/kwad/sdk/utils/ac$a;

    iget-object v0, p0, Lcom/kwad/components/ad/f/d$2;->kz:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    iget-object v3, p0, Lcom/kwad/components/ad/f/d$2;->kz:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getHeight()I

    move-result v3

    invoke-virtual {p1, v0, v3}, Lcom/kwad/sdk/utils/ac$a;->z(II)V

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/f/d$2;->kz:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/kwad/components/ad/f/d$2;->my:[I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    .line 13
    iget-object p1, p0, Lcom/kwad/components/ad/f/d$2;->mz:Lcom/kwad/sdk/utils/ac$a;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iget-object v3, p0, Lcom/kwad/components/ad/f/d$2;->my:[I

    aget v3, v3, v1

    int-to-float v3, v3

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 14
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    iget-object v3, p0, Lcom/kwad/components/ad/f/d$2;->my:[I

    aget v2, v3, v2

    int-to-float v2, v2

    sub-float/2addr p2, v2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    .line 15
    invoke-virtual {p1, v0, p2}, Lcom/kwad/sdk/utils/ac$a;->f(FF)V

    :cond_4
    :goto_0
    return v1
.end method
