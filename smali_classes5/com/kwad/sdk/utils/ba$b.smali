.class final Lcom/kwad/sdk/utils/ba$b;
.super Lcom/kwad/sdk/utils/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/utils/ba;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/sdk/utils/j<",
        "Lcom/kwad/sdk/k/a/f;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/utils/j;-><init>(Z)V

    return-void
.end method

.method private static df(Landroid/content/Context;)Lcom/kwad/sdk/k/a/f;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/sdk/k/a/f;

    invoke-direct {v0}, Lcom/kwad/sdk/k/a/f;-><init>()V

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->cR(Landroid/content/Context;)I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/k/a/f;->aOl:I

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->cP(Landroid/content/Context;)I

    move-result p0

    iput p0, v0, Lcom/kwad/sdk/k/a/f;->aOk:I

    return-object v0
.end method


# virtual methods
.method protected final synthetic cc(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/utils/ba$b;->df(Landroid/content/Context;)Lcom/kwad/sdk/k/a/f;

    move-result-object p1

    return-object p1
.end method
