.class public Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private blurRadius:I

.field private cacheInMemory:Z

.field private cacheOnDisk:Z

.field private considerExifParams:Z

.field private cornerRound:I

.field private decodingOptions:Landroid/graphics/BitmapFactory$Options;

.field private delayBeforeLoading:I

.field private imageForEmptyUri:Landroid/graphics/drawable/Drawable;

.field private imageOnFail:Landroid/graphics/drawable/Drawable;

.field private imageOnLoading:Landroid/graphics/drawable/Drawable;

.field private imageResForEmptyUri:I

.field private imageResOnFail:I

.field private imageResOnLoading:I

.field private isCircle:Z

.field private isFrameSequence:Z

.field private isSyncLoading:Z

.field private resetViewBeforeLoading:Z

.field private strokeColor:I

.field private strokeWidth:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResOnLoading:I

    .line 3
    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResForEmptyUri:I

    .line 4
    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResOnFail:I

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageOnLoading:Landroid/graphics/drawable/Drawable;

    .line 6
    iput-object v1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageForEmptyUri:Landroid/graphics/drawable/Drawable;

    .line 7
    iput-object v1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageOnFail:Landroid/graphics/drawable/Drawable;

    .line 8
    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->resetViewBeforeLoading:Z

    .line 9
    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheInMemory:Z

    .line 10
    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheOnDisk:Z

    .line 11
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-object v1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->decodingOptions:Landroid/graphics/BitmapFactory$Options;

    .line 12
    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->delayBeforeLoading:I

    .line 13
    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->considerExifParams:Z

    .line 14
    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->isSyncLoading:Z

    return-void
.end method

.method static synthetic access$000(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResOnLoading:I

    return p0
.end method

.method static synthetic access$100(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResForEmptyUri:I

    return p0
.end method

.method static synthetic access$1000(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->delayBeforeLoading:I

    return p0
.end method

.method static synthetic access$1100(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->considerExifParams:Z

    return p0
.end method

.method static synthetic access$1200(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->isSyncLoading:Z

    return p0
.end method

.method static synthetic access$1300(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->blurRadius:I

    return p0
.end method

.method static synthetic access$1400(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->isFrameSequence:Z

    return p0
.end method

.method static synthetic access$1500(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cornerRound:I

    return p0
.end method

.method static synthetic access$1600(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->isCircle:Z

    return p0
.end method

.method static synthetic access$1700(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->strokeColor:I

    return p0
.end method

.method static synthetic access$1800(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->strokeWidth:F

    return p0
.end method

.method static synthetic access$200(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResOnFail:I

    return p0
.end method

.method static synthetic access$300(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageOnLoading:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method static synthetic access$400(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageForEmptyUri:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method static synthetic access$500(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageOnFail:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method static synthetic access$600(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->resetViewBeforeLoading:Z

    return p0
.end method

.method static synthetic access$700(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheInMemory:Z

    return p0
.end method

.method static synthetic access$800(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheOnDisk:Z

    return p0
.end method

.method static synthetic access$900(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;)Landroid/graphics/BitmapFactory$Options;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->decodingOptions:Landroid/graphics/BitmapFactory$Options;

    return-object p0
.end method


# virtual methods
.method public bitmapConfig(Landroid/graphics/Bitmap$Config;)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->decodingOptions:Landroid/graphics/BitmapFactory$Options;

    iput-object p1, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bitmapConfig can\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public build()Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;-><init>(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$1;)V

    return-object v0
.end method

.method public cacheInMemory()Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheInMemory:Z

    return-object p0
.end method

.method public cacheInMemory(Z)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheInMemory:Z

    return-object p0
.end method

.method public cacheOnDisc()Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheOnDisk(Z)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;

    move-result-object v0

    return-object v0
.end method

.method public cacheOnDisc(Z)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheOnDisk(Z)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;

    move-result-object p1

    return-object p1
.end method

.method public cacheOnDisk(Z)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheOnDisk:Z

    return-object p0
.end method

.method public cloneFrom(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$1900(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResOnLoading:I

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$2000(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResForEmptyUri:I

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$2100(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResOnFail:I

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$2200(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageOnLoading:Landroid/graphics/drawable/Drawable;

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$2300(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageForEmptyUri:Landroid/graphics/drawable/Drawable;

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$2400(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageOnFail:Landroid/graphics/drawable/Drawable;

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$2500(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->resetViewBeforeLoading:Z

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$2600(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheInMemory:Z

    .line 9
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$2700(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cacheOnDisk:Z

    .line 10
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$2800(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->decodingOptions:Landroid/graphics/BitmapFactory$Options;

    .line 11
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$2900(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->delayBeforeLoading:I

    .line 12
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$3000(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->considerExifParams:Z

    .line 13
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$3100(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->isSyncLoading:Z

    .line 14
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$3200(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->blurRadius:I

    .line 15
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$3300(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->isFrameSequence:Z

    .line 16
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$3400(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cornerRound:I

    .line 17
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$3500(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->isCircle:Z

    .line 18
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$3600(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->strokeColor:I

    .line 19
    invoke-static {p1}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;->access$3700(Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;)F

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->strokeWidth:F

    return-object p0
.end method

.method public considerExifParams(Z)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->considerExifParams:Z

    return-object p0
.end method

.method public setBlurRadius(I)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->blurRadius:I

    return-object p0
.end method

.method public setCircle(Z)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->isCircle:Z

    return-object p0
.end method

.method public setCornerRound(I)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->cornerRound:I

    return-object p0
.end method

.method public setFrameSequence(Z)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->isFrameSequence:Z

    return-object p0
.end method

.method public setStrokeColor(I)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->strokeColor:I

    return-object p0
.end method

.method public setStrokeWidth(F)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->strokeWidth:F

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->isCircle:Z

    :cond_0
    return-object p0
.end method

.method public showImageForEmptyUri(I)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResForEmptyUri:I

    return-object p0
.end method

.method public showImageForEmptyUri(Landroid/graphics/drawable/Drawable;)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageForEmptyUri:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public showImageOnFail(I)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResOnFail:I

    return-object p0
.end method

.method public showImageOnFail(Landroid/graphics/drawable/Drawable;)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageOnFail:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public showImageOnLoading(I)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResOnLoading:I

    return-object p0
.end method

.method public showImageOnLoading(Landroid/graphics/drawable/Drawable;)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageOnLoading:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public showStubImage(I)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->imageResOnLoading:I

    return-object p0
.end method
