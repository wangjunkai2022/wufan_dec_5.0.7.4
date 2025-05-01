.class public final Lcom/kwad/components/core/webview/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/webview/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

.field private Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

.field private Wj:Landroid/view/ViewGroup;

.field private Wn:Z

.field private fY:Lcom/kwad/components/core/webview/c;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

.field private mPageUrl:Ljava/lang/String;

.field private mReportExtData:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/c;)Lcom/kwad/components/core/webview/b$a;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/b$a;->fY:Lcom/kwad/components/core/webview/c;

    return-object p0
.end method

.method public final aA(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/webview/b$a;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/b$a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method public final aH(Ljava/lang/String;)Lcom/kwad/components/core/webview/b$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/b$a;->mPageUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final aS(Z)Lcom/kwad/components/core/webview/b$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/webview/b$a;->Wn:Z

    return-object p0
.end method

.method public final b(Lcom/kwad/sdk/core/webview/KsAdWebView$c;)Lcom/kwad/components/core/webview/b$a;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/b$a;->Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    return-object p0
.end method

.method public final d(Lcom/kwad/sdk/core/webview/KsAdWebView;)Lcom/kwad/components/core/webview/b$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/b$a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-object p0
.end method

.method public final e(Lorg/json/JSONObject;)Lcom/kwad/components/core/webview/b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/b$a;->mReportExtData:Lorg/json/JSONObject;

    return-object p0
.end method

.method public final f(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/webview/b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/b$a;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-object p0
.end method

.method public final getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b$a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object v0
.end method

.method public final ha()Lcom/kwad/components/core/e/d/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b$a;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-object v0
.end method

.method public final k(Landroid/view/ViewGroup;)Lcom/kwad/components/core/webview/b$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/b$a;->Wj:Landroid/view/ViewGroup;

    return-object p0
.end method

.method public final pF()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b$a;->mPageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final qa()Lcom/kwad/sdk/core/webview/KsAdWebView$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b$a;->Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    return-object v0
.end method

.method public final sM()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b$a;->Wj:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final sN()Lcom/kwad/sdk/core/webview/KsAdWebView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b$a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-object v0
.end method

.method public final sO()Lcom/kwad/components/core/webview/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b$a;->fY:Lcom/kwad/components/core/webview/c;

    return-object v0
.end method

.method public final sP()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/webview/b$a;->Wn:Z

    return v0
.end method
