.class public final Lcom/kwad/components/core/widget/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final adc:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field


# instance fields
.field private add:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "#FFFE3666"

    .line 1
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/kwad/components/core/widget/e;->adc:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Lcom/kwad/components/core/widget/e;->adc:I

    iput v0, p0, Lcom/kwad/components/core/widget/e;->add:I

    return-void
.end method


# virtual methods
.method public final tX()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/widget/e;->add:I

    return v0
.end method
