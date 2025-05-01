.class final Lcom/kwad/sdk/utils/bc$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/utils/bc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final aRe:Lcom/kwad/sdk/utils/bc;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/bc;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kwad/sdk/utils/bc;-><init>(B)V

    sput-object v0, Lcom/kwad/sdk/utils/bc$a;->aRe:Lcom/kwad/sdk/utils/bc;

    return-void
.end method

.method static synthetic Nr()Lcom/kwad/sdk/utils/bc;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/utils/bc$a;->aRe:Lcom/kwad/sdk/utils/bc;

    return-object v0
.end method
