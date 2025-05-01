.class final Lcom/kwad/components/core/a/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final Jk:Lcom/kwad/components/core/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/a/a;

    invoke-direct {v0}, Lcom/kwad/components/core/a/a;-><init>()V

    sput-object v0, Lcom/kwad/components/core/a/a$a;->Jk:Lcom/kwad/components/core/a/a;

    return-void
.end method

.method static synthetic mT()Lcom/kwad/components/core/a/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/a/a$a;->Jk:Lcom/kwad/components/core/a/a;

    return-object v0
.end method
