.class public final Lcom/kwad/components/core/video/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/video/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private VH:J

.field private VI:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/kwad/components/core/video/i$a;->VH:J

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/kwad/components/core/video/i$a;->VI:I

    return-void
.end method


# virtual methods
.method public final accumulate(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/video/i$a;->VH:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/kwad/components/core/video/i$a;->VH:J

    .line 2
    iget p1, p0, Lcom/kwad/components/core/video/i$a;->VI:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/kwad/components/core/video/i$a;->VI:I

    return-void
.end method

.method public final reset()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    iput-wide v0, p0, Lcom/kwad/components/core/video/i$a;->VH:J

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/components/core/video/i$a;->VI:I

    return-void
.end method

.method public final sA()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/video/i$a;->VI:I

    return v0
.end method

.method public final sB()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/video/i$a;->VH:J

    return-wide v0
.end method
