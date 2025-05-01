.class public final Lcom/kwad/components/ad/interstitial/g/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/interstitial/g/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private lZ:Z

.field private ma:Z

.field private mb:I

.field private mc:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->lZ:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->ma:Z

    .line 4
    iput v0, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->mb:I

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->mc:Z

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/g/d$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->lZ:Z

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/g/d$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->ma:Z

    return p0
.end method


# virtual methods
.method public final F(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->mb:I

    return-void
.end method

.method public final ek()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->mb:I

    return v0
.end method

.method public final el()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->mc:Z

    return v0
.end method

.method public final v(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->lZ:Z

    return-void
.end method

.method public final w(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->ma:Z

    return-void
.end method

.method public final x(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/g/d$a;->mc:Z

    return-void
.end method
