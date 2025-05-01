.class public final Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "EverdayNewFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/EverdayNewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolderGame"
.end annotation


# instance fields
.field private appSize:Landroid/widget/TextView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private describe:Landroid/widget/TextView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private downloadViewStroke:Lcom/join/mgps/customview/DownloadViewStroke;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private giftPackageSwich:Landroid/widget/ImageView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private icon:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private line:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private linearLayout2:Landroid/widget/LinearLayout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private lodingInfo:Landroid/widget/TextView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private name:Landroid/widget/TextView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private openTest:Landroid/widget/LinearLayout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private progressBar:Landroid/widget/ProgressBar;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private progressBarZip:Landroid/widget/ProgressBar;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private relateLayoutApp:Landroid/widget/RelativeLayout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private testTime:Landroid/widget/TextView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private testType:Landroid/widget/TextView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private tipsLayout:Landroid/widget/LinearLayout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;)V
    .locals 2
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "convertView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->a()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 2
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v1, "convertView.mgListviewItemIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 3
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->e:Landroid/widget/ImageView;

    const-string v1, "convertView.giftPackageSwich"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->giftPackageSwich:Landroid/widget/ImageView;

    .line 4
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->j:Landroid/widget/TextView;

    const-string v1, "convertView.mgListviewItemAppname"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->name:Landroid/widget/TextView;

    .line 5
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->d:Lcom/join/mgps/customview/DownloadViewStroke;

    const-string v1, "convertView.downloadView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->downloadViewStroke:Lcom/join/mgps/customview/DownloadViewStroke;

    .line 6
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->p:Landroid/widget/RelativeLayout;

    const-string v1, "convertView.relateLayoutApp"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->relateLayoutApp:Landroid/widget/RelativeLayout;

    .line 7
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->f:Landroid/view/View;

    const-string v1, "convertView.line"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->line:Landroid/view/View;

    .line 8
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->k:Landroid/widget/TextView;

    const-string v1, "convertView.mgListviewItemDescribe"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->describe:Landroid/widget/TextView;

    .line 9
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->h:Landroid/widget/LinearLayout;

    const-string v1, "convertView.linearLayout2"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->linearLayout2:Landroid/widget/LinearLayout;

    .line 10
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->s:Landroid/widget/LinearLayout;

    const-string v1, "convertView.tipsLayout"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->tipsLayout:Landroid/widget/LinearLayout;

    .line 11
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->c:Landroid/widget/TextView;

    const-string v1, "convertView.appSize"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->appSize:Landroid/widget/TextView;

    .line 12
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->i:Landroid/widget/TextView;

    const-string v1, "convertView.lodingInfo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->lodingInfo:Landroid/widget/TextView;

    .line 13
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->n:Landroid/widget/ProgressBar;

    const-string v1, "convertView.progressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->progressBar:Landroid/widget/ProgressBar;

    .line 14
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->o:Landroid/widget/ProgressBar;

    const-string v1, "convertView.progressBarZip"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->progressBarZip:Landroid/widget/ProgressBar;

    .line 15
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->m:Landroid/widget/LinearLayout;

    const-string v1, "convertView.openTest"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->openTest:Landroid/widget/LinearLayout;

    .line 16
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->q:Landroid/widget/TextView;

    const-string v1, "convertView.testTime"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->testTime:Landroid/widget/TextView;

    .line 17
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemSimulatorDownloadViewBinding;->r:Landroid/widget/TextView;

    const-string v0, "convertView.testType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->testType:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final getAppSize()Landroid/widget/TextView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->appSize:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getDescribe()Landroid/widget/TextView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->describe:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getDownloadViewStroke()Lcom/join/mgps/customview/DownloadViewStroke;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->downloadViewStroke:Lcom/join/mgps/customview/DownloadViewStroke;

    return-object v0
.end method

.method public final getGiftPackageSwich()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->giftPackageSwich:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getIcon()Lcom/facebook/drawee/view/SimpleDraweeView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-object v0
.end method

.method public final getLine()Landroid/view/View;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->line:Landroid/view/View;

    return-object v0
.end method

.method public final getLinearLayout2()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->linearLayout2:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getLodingInfo()Landroid/widget/TextView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->lodingInfo:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getName()Landroid/widget/TextView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->name:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getOpenTest()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->openTest:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getProgressBar()Landroid/widget/ProgressBar;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->progressBar:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public final getProgressBarZip()Landroid/widget/ProgressBar;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->progressBarZip:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public final getRelateLayoutApp()Landroid/widget/RelativeLayout;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->relateLayoutApp:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getTestTime()Landroid/widget/TextView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->testTime:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTestType()Landroid/widget/TextView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->testType:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTipsLayout()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->tipsLayout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final setAppSize(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->appSize:Landroid/widget/TextView;

    return-void
.end method

.method public final setDescribe(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->describe:Landroid/widget/TextView;

    return-void
.end method

.method public final setDownloadViewStroke(Lcom/join/mgps/customview/DownloadViewStroke;)V
    .locals 1
    .param p1    # Lcom/join/mgps/customview/DownloadViewStroke;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->downloadViewStroke:Lcom/join/mgps/customview/DownloadViewStroke;

    return-void
.end method

.method public final setGiftPackageSwich(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->giftPackageSwich:Landroid/widget/ImageView;

    return-void
.end method

.method public final setIcon(Lcom/facebook/drawee/view/SimpleDraweeView;)V
    .locals 1
    .param p1    # Lcom/facebook/drawee/view/SimpleDraweeView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-void
.end method

.method public final setLine(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->line:Landroid/view/View;

    return-void
.end method

.method public final setLinearLayout2(Landroid/widget/LinearLayout;)V
    .locals 1
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->linearLayout2:Landroid/widget/LinearLayout;

    return-void
.end method

.method public final setLodingInfo(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->lodingInfo:Landroid/widget/TextView;

    return-void
.end method

.method public final setName(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->name:Landroid/widget/TextView;

    return-void
.end method

.method public final setOpenTest(Landroid/widget/LinearLayout;)V
    .locals 1
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->openTest:Landroid/widget/LinearLayout;

    return-void
.end method

.method public final setProgressBar(Landroid/widget/ProgressBar;)V
    .locals 1
    .param p1    # Landroid/widget/ProgressBar;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->progressBar:Landroid/widget/ProgressBar;

    return-void
.end method

.method public final setProgressBarZip(Landroid/widget/ProgressBar;)V
    .locals 1
    .param p1    # Landroid/widget/ProgressBar;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->progressBarZip:Landroid/widget/ProgressBar;

    return-void
.end method

.method public final setRelateLayoutApp(Landroid/widget/RelativeLayout;)V
    .locals 1
    .param p1    # Landroid/widget/RelativeLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->relateLayoutApp:Landroid/widget/RelativeLayout;

    return-void
.end method

.method public final setTestTime(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->testTime:Landroid/widget/TextView;

    return-void
.end method

.method public final setTestType(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->testType:Landroid/widget/TextView;

    return-void
.end method

.method public final setTipsLayout(Landroid/widget/LinearLayout;)V
    .locals 1
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;->tipsLayout:Landroid/widget/LinearLayout;

    return-void
.end method
