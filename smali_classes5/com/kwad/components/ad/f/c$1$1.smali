.class final Lcom/kwad/components/ad/f/c$1$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/c$1;->onError(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic cd:I

.field final synthetic ce:Ljava/lang/String;

.field final synthetic mm:Lcom/kwad/components/ad/f/c$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/c$1;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/c$1$1;->mm:Lcom/kwad/components/ad/f/c$1;

    iput p2, p0, Lcom/kwad/components/ad/f/c$1$1;->cd:I

    iput-object p3, p0, Lcom/kwad/components/ad/f/c$1$1;->ce:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "loadNativeAd onError:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/kwad/components/ad/f/c$1$1;->cd:I

    .line 2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/kwad/components/ad/f/c$1$1;->ce:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "code:%s__msg:%s"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "KsAdNativeLoadManager"

    .line 3
    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/f/c$1$1;->mm:Lcom/kwad/components/ad/f/c$1;

    iget-object v0, v0, Lcom/kwad/components/ad/f/c$1;->ml:Lcom/kwad/sdk/api/KsLoadManager$NativeAdListener;

    iget v1, p0, Lcom/kwad/components/ad/f/c$1$1;->cd:I

    iget-object v2, p0, Lcom/kwad/components/ad/f/c$1$1;->ce:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/api/KsLoadManager$NativeAdListener;->onError(ILjava/lang/String;)V

    return-void
.end method
