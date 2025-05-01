.class public Lcom/beizi/ad/a;
.super Ljava/lang/Object;
.source "AdSize.java"


# static fields
.field public static final a:Lcom/beizi/ad/a;

.field public static final b:Lcom/beizi/ad/a;

.field public static final c:Lcom/beizi/ad/a;

.field public static final d:Lcom/beizi/ad/a;

.field public static final e:Lcom/beizi/ad/a;

.field public static final f:Lcom/beizi/ad/a;

.field public static final g:Lcom/beizi/ad/a;

.field public static final h:Lcom/beizi/ad/a;

.field public static final i:Lcom/beizi/ad/a;


# instance fields
.field private final j:I

.field private final k:I

.field private final l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/beizi/ad/a;

    const/16 v1, 0x140

    const/16 v2, 0x32

    const-string v3, "320x50_mb"

    invoke-direct {v0, v1, v2, v3}, Lcom/beizi/ad/a;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/beizi/ad/a;->a:Lcom/beizi/ad/a;

    .line 2
    new-instance v0, Lcom/beizi/ad/a;

    const/16 v2, 0x1d4

    const/16 v3, 0x3c

    const-string v4, "468x60_as"

    invoke-direct {v0, v2, v3, v4}, Lcom/beizi/ad/a;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/beizi/ad/a;->b:Lcom/beizi/ad/a;

    .line 3
    new-instance v0, Lcom/beizi/ad/a;

    const/16 v2, 0x64

    const-string v3, "320x100_as"

    invoke-direct {v0, v1, v2, v3}, Lcom/beizi/ad/a;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/beizi/ad/a;->c:Lcom/beizi/ad/a;

    .line 4
    new-instance v0, Lcom/beizi/ad/a;

    const/16 v1, 0x2d8

    const/16 v2, 0x5a

    const-string v3, "728x90_as"

    invoke-direct {v0, v1, v2, v3}, Lcom/beizi/ad/a;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/beizi/ad/a;->d:Lcom/beizi/ad/a;

    .line 5
    new-instance v0, Lcom/beizi/ad/a;

    const/16 v1, 0x12c

    const/16 v2, 0xfa

    const-string v3, "300x250_as"

    invoke-direct {v0, v1, v2, v3}, Lcom/beizi/ad/a;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/beizi/ad/a;->e:Lcom/beizi/ad/a;

    .line 6
    new-instance v0, Lcom/beizi/ad/a;

    const/16 v1, 0xa0

    const/16 v2, 0x258

    const-string v3, "160x600_as"

    invoke-direct {v0, v1, v2, v3}, Lcom/beizi/ad/a;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/beizi/ad/a;->f:Lcom/beizi/ad/a;

    .line 7
    new-instance v0, Lcom/beizi/ad/a;

    const/4 v1, -0x1

    const/4 v2, -0x2

    const-string v3, "smart_banner"

    invoke-direct {v0, v1, v2, v3}, Lcom/beizi/ad/a;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/beizi/ad/a;->g:Lcom/beizi/ad/a;

    .line 8
    new-instance v0, Lcom/beizi/ad/a;

    const/4 v1, -0x3

    const/4 v2, -0x4

    const-string v3, "fluid"

    invoke-direct {v0, v1, v2, v3}, Lcom/beizi/ad/a;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/beizi/ad/a;->h:Lcom/beizi/ad/a;

    .line 9
    new-instance v0, Lcom/beizi/ad/a;

    const/4 v2, 0x0

    const-string v3, "search_v2"

    invoke-direct {v0, v1, v2, v3}, Lcom/beizi/ad/a;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/beizi/ad/a;->i:Lcom/beizi/ad/a;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    const-string v1, "FULL"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, -0x2

    if-ne p2, v1, :cond_1

    const-string v1, "AUTO"

    goto :goto_1

    :cond_1
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_as"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/beizi/ad/a;-><init>(IILjava/lang/String;)V

    return-void
.end method

.method private constructor <init>(IILjava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-gez p1, :cond_1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    const/4 v0, -0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid width for AdSize: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-gez p2, :cond_3

    const/4 v0, -0x2

    if-eq p2, v0, :cond_3

    const/4 v0, -0x4

    if-ne p2, v0, :cond_2

    goto :goto_1

    .line 4
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid height for AdSize: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_3
    :goto_1
    iput p1, p0, Lcom/beizi/ad/a;->j:I

    .line 6
    iput p2, p0, Lcom/beizi/ad/a;->k:I

    .line 7
    iput-object p3, p0, Lcom/beizi/ad/a;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/a;->k:I

    return v0
.end method

.method public a(Landroid/content/Context;)I
    .locals 2

    .line 2
    iget v0, p0, Lcom/beizi/ad/a;->k:I

    const/4 v1, -0x4

    if-eq v0, v1, :cond_1

    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    int-to-float v0, v0

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    invoke-static {v1, v0, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    return p1

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/a;->j:I

    return v0
.end method

.method public b(Landroid/content/Context;)I
    .locals 3

    .line 2
    iget v0, p0, Lcom/beizi/ad/a;->j:I

    const/4 v1, -0x4

    const/4 v2, -0x1

    if-eq v0, v1, :cond_1

    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    if-eq v0, v2, :cond_0

    const/4 v1, 0x1

    int-to-float v0, v0

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    invoke-static {v1, v0, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    return p1

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    return p1

    :cond_1
    return v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/beizi/ad/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lcom/beizi/ad/a;

    .line 3
    iget v1, p0, Lcom/beizi/ad/a;->j:I

    iget v3, p1, Lcom/beizi/ad/a;->j:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Lcom/beizi/ad/a;->k:I

    iget v3, p1, Lcom/beizi/ad/a;->k:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/beizi/ad/a;->l:Ljava/lang/String;

    iget-object p1, p1, Lcom/beizi/ad/a;->l:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/a;->l:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/a;->l:Ljava/lang/String;

    return-object v0
.end method
