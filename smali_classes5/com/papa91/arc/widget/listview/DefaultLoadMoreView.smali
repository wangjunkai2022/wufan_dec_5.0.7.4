.class public Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;
.super Landroid/widget/RelativeLayout;
.source "DefaultLoadMoreView.java"

# interfaces
.implements Lcom/papa91/arc/widget/listview/ILoadMoreView;


# instance fields
.field private mPbLoading:Landroid/widget/ProgressBar;

.field private mTvMessage:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->init(Landroid/content/Context;)V

    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget v0, Lorg/ppsspp/ppsspp/R$layout;->loading_view_final_footer_default:I

    invoke-static {p1, v0, p0}, Landroid/widget/RelativeLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget p1, Lorg/ppsspp/ppsspp/R$id;->pb_loading:I

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->mPbLoading:Landroid/widget/ProgressBar;

    .line 3
    sget p1, Lorg/ppsspp/ppsspp/R$id;->tv_loading_msg:I

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->mTvMessage:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public getFooterView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public showFail()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->mPbLoading:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->mTvMessage:Landroid/widget/TextView;

    sget v1, Lorg/ppsspp/ppsspp/R$string;->loading_view_net_error:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public showLoading()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->mPbLoading:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->mTvMessage:Landroid/widget/TextView;

    sget v1, Lorg/ppsspp/ppsspp/R$string;->loading_view_loading:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public showNoMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->mPbLoading:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->mTvMessage:Landroid/widget/TextView;

    sget v1, Lorg/ppsspp/ppsspp/R$string;->loading_view_no_more:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public showNormal()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->mPbLoading:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;->mTvMessage:Landroid/widget/TextView;

    sget v1, Lorg/ppsspp/ppsspp/R$string;->loading_view_click_loading_more:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method
