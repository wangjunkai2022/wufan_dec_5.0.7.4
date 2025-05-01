.class final Lcom/kwad/sdk/n/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/n/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final aUp:Lcom/kwad/sdk/n/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/n/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kwad/sdk/n/e;-><init>(B)V

    sput-object v0, Lcom/kwad/sdk/n/e$a;->aUp:Lcom/kwad/sdk/n/e;

    return-void
.end method

.method static synthetic OJ()Lcom/kwad/sdk/n/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/e$a;->aUp:Lcom/kwad/sdk/n/e;

    return-object v0
.end method
