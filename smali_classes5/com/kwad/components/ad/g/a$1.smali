.class final Lcom/kwad/components/ad/g/a$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/g/a;->a(Landroid/content/Context;Lcom/kwad/sdk/f/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic gq:Landroid/content/Context;

.field final synthetic ns:Lcom/kwad/sdk/f/a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/f/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/g/a$1;->gq:Landroid/content/Context;

    iput-object p2, p0, Lcom/kwad/components/ad/g/a$1;->ns:Lcom/kwad/sdk/f/a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/g/a$1;->gq:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/components/ad/g/a;->K(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/components/ad/g/a;->c(Ljava/util/Map;)Lorg/json/JSONArray;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/g/a$1;->ns:Lcom/kwad/sdk/f/a;

    invoke-interface {v1, v0}, Lcom/kwad/sdk/f/a;->accept(Ljava/lang/Object;)V

    return-void
.end method
