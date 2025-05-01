.class public final Lcom/kwad/components/ad/interstitial/e/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/interstitial/e/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private kj:I

.field private kk:Z

.field private kl:I

.field private km:Z

.field private kn:Lcom/kwad/sdk/utils/ac$a;

.field public ko:D

.field public kp:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->context:Landroid/content/Context;

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/interstitial/e/c$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->kl:I

    return p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/interstitial/e/c$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->km:Z

    return p0
.end method


# virtual methods
.method public final A(I)Lcom/kwad/components/ad/interstitial/e/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->kl:I

    return-object p0
.end method

.method public final a(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/components/ad/interstitial/e/c$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->kn:Lcom/kwad/sdk/utils/ac$a;

    return-object p0
.end method

.method public final c(D)Lcom/kwad/components/ad/interstitial/e/c$b;
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->ko:D

    return-object p0
.end method

.method public final cV()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->kj:I

    return v0
.end method

.method public final cW()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->kk:Z

    return v0
.end method

.method public final cX()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->km:Z

    return v0
.end method

.method public final cY()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->kl:I

    return v0
.end method

.method public final cZ()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->ko:D

    return-wide v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getTouchCoords()Lcom/kwad/sdk/utils/ac$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->kn:Lcom/kwad/sdk/utils/ac$a;

    return-object v0
.end method

.method public final k(Z)Lcom/kwad/components/ad/interstitial/e/c$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->kk:Z

    return-object p0
.end method

.method public final l(Z)Lcom/kwad/components/ad/interstitial/e/c$b;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->km:Z

    return-object p0
.end method

.method public final m(Z)Lcom/kwad/components/ad/interstitial/e/c$b;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->kp:Z

    return-object p0
.end method

.method public final z(I)Lcom/kwad/components/ad/interstitial/e/c$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/interstitial/e/c$b;->kj:I

    return-object p0
.end method
