.class final Lcom/kwad/sdk/commercial/h/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/commercial/h/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final apK:Lcom/kwad/sdk/commercial/h/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/h/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kwad/sdk/commercial/h/a;-><init>(B)V

    sput-object v0, Lcom/kwad/sdk/commercial/h/a$a;->apK:Lcom/kwad/sdk/commercial/h/a;

    return-void
.end method

.method static synthetic BA()Lcom/kwad/sdk/commercial/h/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/commercial/h/a$a;->apK:Lcom/kwad/sdk/commercial/h/a;

    return-object v0
.end method
