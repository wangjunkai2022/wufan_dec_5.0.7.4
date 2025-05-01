.class public Lcom/join/mgps/fragment/SearchWebFragment;
.super Lcom/join/mgps/fragment/BaseFragment;
.source "SearchWebFragment.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c029b
.end annotation


# instance fields
.field b:Lcom/join/mgps/customview/LJWebView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/BaseFragment;-><init>()V

    return-void
.end method


# virtual methods
.method V()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchWebFragment;->b:Lcom/join/mgps/customview/LJWebView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchWebFragment;->b:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07156b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJWebView;->setBarHeight(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchWebFragment;->b:Lcom/join/mgps/customview/LJWebView;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJWebView;->setClickable(Z)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchWebFragment;->b:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJWebView;->setUseWideViewPort(Z)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchWebFragment;->b:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->setSupportZoom(Z)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchWebFragment;->b:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->setBuiltInZoomControls(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchWebFragment;->b:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJWebView;->setJavaScriptEnabled(Z)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchWebFragment;->b:Lcom/join/mgps/customview/LJWebView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->setCacheMode(I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchWebFragment;->b:Lcom/join/mgps/customview/LJWebView;

    new-instance v1, Lcom/join/mgps/fragment/SearchWebFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/SearchWebFragment$a;-><init>(Lcom/join/mgps/fragment/SearchWebFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchWebFragment;->b:Lcom/join/mgps/customview/LJWebView;

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchWebFragment;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected lazyLoad()V
    .locals 0

    return-void
.end method
