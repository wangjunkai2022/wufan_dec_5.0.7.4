.class final Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/splashscreen/widget/SkipView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private Gf:I

.field private HE:Ljava/lang/String;

.field private HF:Ljava/lang/String;

.field private HG:I

.field private HH:Z

.field private HI:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "\u8df3\u8fc7"

    .line 2
    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HE:Ljava/lang/String;

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HF:Ljava/lang/String;

    const/4 v0, 0x5

    .line 4
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HG:I

    .line 5
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->Gf:I

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HH:Z

    .line 7
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HI:Z

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HF:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HH:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HG:I

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HE:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HI:Z

    return p1
.end method

.method static synthetic c(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->Gf:I

    return p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->Gf:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->Gf:I

    return v0
.end method

.method static synthetic e(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HE:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HH:Z

    return p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HI:Z

    return p0
.end method

.method static synthetic h(Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->mA()Z

    move-result p0

    return p0
.end method

.method private mA()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HH:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HI:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final X(Ljava/lang/String;)V
    .locals 1

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->Gf:I

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HF:Ljava/lang/String;

    return-void
.end method

.method public final ad(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HG:I

    .line 2
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->Gf:I

    return-void
.end method

.method public final my()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->Gf:I

    if-gez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HF:Ljava/lang/String;

    return-object v0

    :cond_0
    if-nez v0, :cond_1

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HF:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 4
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->HF:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->Gf:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final mz()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/SkipView$b;->Gf:I

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
