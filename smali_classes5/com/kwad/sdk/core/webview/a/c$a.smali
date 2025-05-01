.class public final Lcom/kwad/sdk/core/webview/a/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/webview/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private OP:I

.field private Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

.field private aFk:Z

.field private aFl:Lcom/kwad/sdk/core/webview/KsAdWebView$e;

.field private aFm:Lcom/kwad/sdk/core/webview/KsAdWebView$b;

.field private aFn:Lcom/kwad/sdk/core/webview/KsAdWebView$d;

.field private aFo:Z

.field private aFp:Z

.field private aFq:Z

.field private aFr:Z

.field private aFs:Z

.field private aFt:J

.field private aFu:J

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFp:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFq:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFk:Z

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFs:Z

    const-wide/16 v0, 0x258

    .line 6
    iput-wide v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFt:J

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFu:J

    .line 8
    iput-object p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->mContext:Landroid/content/Context;

    return-void
.end method

.method private HA()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFs:Z

    return v0
.end method


# virtual methods
.method public final HB()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFq:Z

    return v0
.end method

.method public final HC()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFk:Z

    return v0
.end method

.method public final HD()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFp:Z

    return v0
.end method

.method public final HE()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFr:Z

    return v0
.end method

.method public final HF()Z
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/webview/a/c$a;->HA()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 3
    iget-wide v4, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFu:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_0

    sub-long/2addr v2, v4

    iget-wide v4, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFt:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v1
.end method

.method public final Hz()Lcom/kwad/sdk/core/webview/KsAdWebView$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFn:Lcom/kwad/sdk/core/webview/KsAdWebView$d;

    return-object v0
.end method

.method public final a(Lcom/kwad/sdk/core/webview/KsAdWebView$b;)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFm:Lcom/kwad/sdk/core/webview/KsAdWebView$b;

    return-object p0
.end method

.method public final a(Lcom/kwad/sdk/core/webview/KsAdWebView$d;)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFn:Lcom/kwad/sdk/core/webview/KsAdWebView$d;

    return-object p0
.end method

.method public final aC(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFu:J

    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/webview/KsAdWebView$e;)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFl:Lcom/kwad/sdk/core/webview/KsAdWebView$e;

    return-object p0
.end method

.method public final bs(Z)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFs:Z

    return-object p0
.end method

.method public final bt(Z)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFo:Z

    return-object p0
.end method

.method public final bu(Z)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFq:Z

    return-object p0
.end method

.method public final bv(Z)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFp:Z

    return-object p0
.end method

.method public final bw(Z)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFr:Z

    return-object p0
.end method

.method public final c(Lcom/kwad/sdk/core/webview/KsAdWebView$c;)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    return-object p0
.end method

.method public final dx(I)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->OP:I

    return-object p0
.end method

.method public final ek(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method public final getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public final ik()Lcom/kwad/sdk/core/webview/KsAdWebView$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFl:Lcom/kwad/sdk/core/webview/KsAdWebView$e;

    return-object v0
.end method

.method public final mH()Lcom/kwad/sdk/core/webview/KsAdWebView$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFm:Lcom/kwad/sdk/core/webview/KsAdWebView$b;

    return-object v0
.end method

.method public final ok()Lcom/kwad/sdk/core/adlog/c/a;
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/adlog/c/a;->BZ()Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    iget v1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->OP:I

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/a;->cI(I)Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    .line 3
    iget-boolean v1, p0, Lcom/kwad/sdk/core/webview/a/c$a;->aFo:Z

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/a;->cJ(I)Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    return-object v0
.end method

.method public final qa()Lcom/kwad/sdk/core/webview/KsAdWebView$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/a/c$a;->Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    return-object v0
.end method
