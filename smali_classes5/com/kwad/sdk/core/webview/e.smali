.class public final Lcom/kwad/sdk/core/webview/e;
.super Lcom/kwad/sdk/core/webview/b;
.source "SourceFile"


# instance fields
.field private xo:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/webview/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILcom/kwad/sdk/widget/e;Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/webview/b;->mScreenOrientation:I

    .line 2
    iput-object p2, p0, Lcom/kwad/sdk/core/webview/b;->aEW:Lcom/kwad/sdk/widget/e;

    .line 3
    iput-object p3, p0, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    .line 4
    iput-object p4, p0, Lcom/kwad/sdk/core/webview/e;->xo:Ljava/lang/String;

    return-void
.end method
