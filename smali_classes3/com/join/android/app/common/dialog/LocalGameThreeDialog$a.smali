.class Lcom/join/android/app/common/dialog/LocalGameThreeDialog$a;
.super Ljava/lang/Object;
.source "LocalGameThreeDialog.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/common/dialog/LocalGameThreeDialog;->initViewPager()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/android/app/common/dialog/LocalGameThreeDialog;


# direct methods
.method constructor <init>(Lcom/join/android/app/common/dialog/LocalGameThreeDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/common/dialog/LocalGameThreeDialog$a;->b:Lcom/join/android/app/common/dialog/LocalGameThreeDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/android/app/common/dialog/LocalGameThreeDialog$a;->b:Lcom/join/android/app/common/dialog/LocalGameThreeDialog;

    iput p1, v0, Lcom/join/android/app/common/dialog/LocalGameThreeDialog;->l:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 2
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/join/android/app/common/dialog/LocalGameThreeDialog$a$a;

    invoke-direct {v0, p0}, Lcom/join/android/app/common/dialog/LocalGameThreeDialog$a$a;-><init>(Lcom/join/android/app/common/dialog/LocalGameThreeDialog$a;)V

    const-wide/16 v1, 0x12c

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 0

    return-void
.end method
