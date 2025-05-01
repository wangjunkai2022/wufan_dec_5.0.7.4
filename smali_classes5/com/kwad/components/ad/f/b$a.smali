.class final Lcom/kwad/components/ad/f/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/f/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final mi:Lcom/kwad/components/ad/f/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/f/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/f/b;-><init>()V

    sput-object v0, Lcom/kwad/components/ad/f/b$a;->mi:Lcom/kwad/components/ad/f/b;

    return-void
.end method

.method static synthetic en()Lcom/kwad/components/ad/f/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/ad/f/b$a;->mi:Lcom/kwad/components/ad/f/b;

    return-object v0
.end method
