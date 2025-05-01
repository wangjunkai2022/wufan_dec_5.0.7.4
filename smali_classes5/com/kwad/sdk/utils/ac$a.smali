.class public final Lcom/kwad/sdk/utils/ac$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/utils/ac;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private aQo:I

.field private aQp:I

.field private aQq:I

.field private aQr:I

.field private mHeight:I

.field private mWidth:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->mWidth:I

    .line 3
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->mHeight:I

    .line 4
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQo:I

    .line 5
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQp:I

    .line 6
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQq:I

    .line 7
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQr:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->mWidth:I

    .line 10
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->mHeight:I

    .line 11
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQo:I

    .line 12
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQp:I

    .line 13
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQq:I

    .line 14
    iput v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQr:I

    .line 15
    iput p1, p0, Lcom/kwad/sdk/utils/ac$a;->mWidth:I

    .line 16
    iput p2, p0, Lcom/kwad/sdk/utils/ac$a;->mHeight:I

    return-void
.end method


# virtual methods
.method public final MD()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQo:I

    return v0
.end method

.method public final ME()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQp:I

    return v0
.end method

.method public final MF()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQq:I

    return v0
.end method

.method public final MG()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/ac$a;->aQr:I

    return v0
.end method

.method public final f(FF)V
    .locals 0

    float-to-int p1, p1

    .line 1
    iput p1, p0, Lcom/kwad/sdk/utils/ac$a;->aQo:I

    float-to-int p1, p2

    .line 2
    iput p1, p0, Lcom/kwad/sdk/utils/ac$a;->aQp:I

    return-void
.end method

.method public final g(FF)V
    .locals 0

    float-to-int p1, p1

    .line 1
    iput p1, p0, Lcom/kwad/sdk/utils/ac$a;->aQq:I

    float-to-int p1, p2

    .line 2
    iput p1, p0, Lcom/kwad/sdk/utils/ac$a;->aQr:I

    return-void
.end method

.method public final getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/ac$a;->mHeight:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/ac$a;->mWidth:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TouchCoords{mWidth="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/kwad/sdk/utils/ac$a;->mWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/kwad/sdk/utils/ac$a;->mHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDownX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/kwad/sdk/utils/ac$a;->aQo:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDownY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/kwad/sdk/utils/ac$a;->aQp:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mUpX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/kwad/sdk/utils/ac$a;->aQq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mUpY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/kwad/sdk/utils/ac$a;->aQr:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/utils/ac$a;->mWidth:I

    .line 2
    iput p2, p0, Lcom/kwad/sdk/utils/ac$a;->mHeight:I

    return-void
.end method
