.class Lcom/join/mgps/fragment/CommonWebviewFragment$d;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CommonWebviewFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$d;->b:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$d;->b:Lcom/join/mgps/fragment/CommonWebviewFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/CommonWebviewFragment;->b:Ljava/lang/String;

    const-string v0, "onKeyDown() called."

    invoke-static {p1, v0}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x4

    if-ne p2, v0, :cond_2

    .line 2
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p2

    if-nez p2, :cond_2

    .line 3
    iget-object p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$d;->b:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-virtual {p2}, Lcom/join/mgps/fragment/CommonWebviewFragment;->inCustomView()Z

    move-result p2

    const/4 p3, 0x1

    if-eqz p2, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$d;->b:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->V(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/webkit/WebChromeClient;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    return p3

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$d;->b:Lcom/join/mgps/fragment/CommonWebviewFragment;

    iget-object p2, p2, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    const-string v0, "?"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 6
    iget-object p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$d;->b:Lcom/join/mgps/fragment/CommonWebviewFragment;

    iget-object v1, p2, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    .line 7
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$d;->b:Lcom/join/mgps/fragment/CommonWebviewFragment;

    iget-object p2, p2, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {p2}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$d;->b:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "javascript:papaBackPageUp()"

    .line 9
    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return p3

    :cond_2
    return p1
.end method
