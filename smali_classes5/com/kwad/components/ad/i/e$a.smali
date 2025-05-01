.class final Lcom/kwad/components/ad/i/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/i/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final og:Lcom/kwad/components/ad/i/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/i/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/i/e;-><init>(B)V

    sput-object v0, Lcom/kwad/components/ad/i/e$a;->og:Lcom/kwad/components/ad/i/e;

    return-void
.end method

.method static synthetic eX()Lcom/kwad/components/ad/i/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/ad/i/e$a;->og:Lcom/kwad/components/ad/i/e;

    return-object v0
.end method
