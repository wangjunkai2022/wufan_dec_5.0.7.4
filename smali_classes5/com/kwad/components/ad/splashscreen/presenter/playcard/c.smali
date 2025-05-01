.class public final Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private Fa:F

.field private Fk:Lcom/kwad/sdk/utils/ad;

.field private Fl:Lcom/kwad/sdk/utils/ad;

.field private Fm:Lcom/kwad/sdk/utils/ad;

.field private Fn:Lcom/kwad/sdk/utils/ad;

.field private Fo:Lcom/kwad/sdk/utils/ad;

.field private Fp:Lcom/kwad/sdk/utils/ad;

.field private Fq:I

.field private Fr:I

.field private Fs:I

.field private Ft:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    const/16 v0, 0x22

    .line 3
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fq:I

    const/16 v0, 0x13

    .line 4
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fr:I

    const/16 v0, 0x8

    .line 5
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fs:I

    const/16 v0, 0xc

    .line 6
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Ft:I

    return-void
.end method

.method public static c(F)Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;
    .locals 8

    .line 1
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;-><init>()V

    const/16 v1, 0xae

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 2
    invoke-static/range {v1 .. v6}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fk:Lcom/kwad/sdk/utils/ad;

    const/16 v2, 0x21

    const/16 v3, 0x21

    const/4 v7, 0x0

    .line 3
    invoke-static/range {v2 .. v7}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fl:Lcom/kwad/sdk/utils/ad;

    const/4 v2, 0x0

    const/16 v3, 0x1a

    const/16 v5, 0xb

    .line 4
    invoke-static/range {v2 .. v7}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fm:Lcom/kwad/sdk/utils/ad;

    const/16 v2, 0xae

    const/16 v3, 0xab

    const/4 v5, 0x6

    .line 5
    invoke-static/range {v2 .. v7}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fn:Lcom/kwad/sdk/utils/ad;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 6
    invoke-static/range {v2 .. v7}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fo:Lcom/kwad/sdk/utils/ad;

    const/4 v5, 0x7

    .line 7
    invoke-static/range {v2 .. v7}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fp:Lcom/kwad/sdk/utils/ad;

    const/16 v1, 0x15

    .line 8
    iput v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fq:I

    const/16 v1, 0xc

    .line 9
    iput v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fr:I

    const/4 v1, 0x6

    .line 10
    iput v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fs:I

    .line 11
    iput p0, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    const/16 p0, 0x8

    .line 12
    iput p0, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Ft:I

    return-object v0
.end method

.method public static lZ()Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;
    .locals 8

    .line 1
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;-><init>()V

    const/16 v1, 0x116

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 2
    invoke-static/range {v1 .. v6}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fk:Lcom/kwad/sdk/utils/ad;

    const/16 v2, 0x35

    const/16 v3, 0x35

    const/4 v7, 0x0

    .line 3
    invoke-static/range {v2 .. v7}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fl:Lcom/kwad/sdk/utils/ad;

    const/4 v2, 0x0

    const/16 v3, 0x2b

    const/16 v5, 0xb

    .line 4
    invoke-static/range {v2 .. v7}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fm:Lcom/kwad/sdk/utils/ad;

    const/16 v2, 0x116

    const/16 v3, 0x112

    const/16 v5, 0x8

    .line 5
    invoke-static/range {v2 .. v7}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fn:Lcom/kwad/sdk/utils/ad;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 6
    invoke-static/range {v2 .. v7}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fo:Lcom/kwad/sdk/utils/ad;

    const/16 v5, 0xa

    .line 7
    invoke-static/range {v2 .. v7}, Lcom/kwad/sdk/utils/ad;->a(IIIIII)Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fp:Lcom/kwad/sdk/utils/ad;

    return-object v0
.end method


# virtual methods
.method public final S(Landroid/content/Context;)Lcom/kwad/sdk/utils/ad;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fk:Lcom/kwad/sdk/utils/ad;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    invoke-virtual {v0, p1, v1}, Lcom/kwad/sdk/utils/ad;->c(Landroid/content/Context;F)Lcom/kwad/sdk/utils/ad;

    move-result-object p1

    return-object p1
.end method

.method public final T(Landroid/content/Context;)Lcom/kwad/sdk/utils/ad;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fl:Lcom/kwad/sdk/utils/ad;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    invoke-virtual {v0, p1, v1}, Lcom/kwad/sdk/utils/ad;->c(Landroid/content/Context;F)Lcom/kwad/sdk/utils/ad;

    move-result-object p1

    return-object p1
.end method

.method public final U(Landroid/content/Context;)Lcom/kwad/sdk/utils/ad;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fm:Lcom/kwad/sdk/utils/ad;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    invoke-virtual {v0, p1, v1}, Lcom/kwad/sdk/utils/ad;->c(Landroid/content/Context;F)Lcom/kwad/sdk/utils/ad;

    move-result-object p1

    return-object p1
.end method

.method public final V(Landroid/content/Context;)Lcom/kwad/sdk/utils/ad;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fn:Lcom/kwad/sdk/utils/ad;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    invoke-virtual {v0, p1, v1}, Lcom/kwad/sdk/utils/ad;->c(Landroid/content/Context;F)Lcom/kwad/sdk/utils/ad;

    move-result-object p1

    return-object p1
.end method

.method public final W(Landroid/content/Context;)Lcom/kwad/sdk/utils/ad;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fo:Lcom/kwad/sdk/utils/ad;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    invoke-virtual {v0, p1, v1}, Lcom/kwad/sdk/utils/ad;->c(Landroid/content/Context;F)Lcom/kwad/sdk/utils/ad;

    move-result-object p1

    return-object p1
.end method

.method public final X(Landroid/content/Context;)Lcom/kwad/sdk/utils/ad;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fp:Lcom/kwad/sdk/utils/ad;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    invoke-virtual {v0, p1, v1}, Lcom/kwad/sdk/utils/ad;->c(Landroid/content/Context;F)Lcom/kwad/sdk/utils/ad;

    move-result-object p1

    return-object p1
.end method

.method public final Y(Landroid/content/Context;)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fq:I

    int-to-float v0, v0

    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->b(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iget v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    mul-float p1, p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final Z(Landroid/content/Context;)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fr:I

    int-to-float v0, v0

    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->b(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iget v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    mul-float p1, p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final aa(Landroid/content/Context;)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fs:I

    int-to-float v0, v0

    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->b(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iget v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Fa:F

    mul-float p1, p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final ma()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/c;->Ft:I

    return v0
.end method
