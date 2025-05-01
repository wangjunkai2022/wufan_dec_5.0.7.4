.class final Lcom/kwad/components/ad/splashscreen/presenter/h$1$1$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/splashscreen/presenter/h$1$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Du:Landroid/graphics/Bitmap;

.field final synthetic Dv:Lcom/kwad/components/ad/splashscreen/presenter/h$1$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/h$1$1;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$1$1$1;->Dv:Lcom/kwad/components/ad/splashscreen/presenter/h$1$1;

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$1$1$1;->Du:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$1$1$1;->Dv:Lcom/kwad/components/ad/splashscreen/presenter/h$1$1;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/presenter/h$1$1;->Dt:Lcom/kwad/components/ad/splashscreen/presenter/h$1;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/presenter/h$1;->Ds:Lcom/kwad/components/ad/splashscreen/presenter/h;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/h;->c(Lcom/kwad/components/ad/splashscreen/presenter/h;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$1$1$1;->Dv:Lcom/kwad/components/ad/splashscreen/presenter/h$1$1;

    iget-object v2, v2, Lcom/kwad/components/ad/splashscreen/presenter/h$1$1;->Dt:Lcom/kwad/components/ad/splashscreen/presenter/h$1;

    iget-object v2, v2, Lcom/kwad/components/ad/splashscreen/presenter/h$1;->Ds:Lcom/kwad/components/ad/splashscreen/presenter/h;

    .line 2
    invoke-static {v2}, Lcom/kwad/components/ad/splashscreen/presenter/h;->d(Lcom/kwad/components/ad/splashscreen/presenter/h;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/presenter/h$1$1$1;->Du:Landroid/graphics/Bitmap;

    invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
