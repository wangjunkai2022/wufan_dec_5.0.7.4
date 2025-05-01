.class final Lcom/kwad/sdk/h/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/h/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final aKB:Lcom/kwad/sdk/h/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/h/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kwad/sdk/h/h;-><init>(B)V

    sput-object v0, Lcom/kwad/sdk/h/h$a;->aKB:Lcom/kwad/sdk/h/h;

    return-void
.end method

.method static synthetic JV()Lcom/kwad/sdk/h/h;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/h/h$a;->aKB:Lcom/kwad/sdk/h/h;

    return-object v0
.end method
