.class final Lcom/kwad/components/core/o/a$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/o/a;->qJ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RS:Lcom/kwad/components/core/o/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/o/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/o/a$1;->RS:Lcom/kwad/components/core/o/a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    const-wide/16 v0, 0x8

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/collector/f;->Bg()Lorg/json/JSONArray;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/core/report/n;->azP:Lorg/json/JSONArray;

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method
