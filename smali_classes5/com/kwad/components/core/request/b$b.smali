.class final Lcom/kwad/components/core/request/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/request/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field private static final RX:Lcom/kwad/components/core/request/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/request/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kwad/components/core/request/b;-><init>(B)V

    sput-object v0, Lcom/kwad/components/core/request/b$b;->RX:Lcom/kwad/components/core/request/b;

    return-void
.end method

.method static synthetic qQ()Lcom/kwad/components/core/request/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/request/b$b;->RX:Lcom/kwad/components/core/request/b;

    return-object v0
.end method
