.class Lcom/join/mgps/customview/MyUserIconTitleLayout$a;
.super Ljava/lang/Object;
.source "MyUserIconTitleLayout.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/MyUserIconTitleLayout;->setUserIcon()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/MyUserIconTitleLayout;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/MyUserIconTitleLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/MyUserIconTitleLayout$a;->b:Lcom/join/mgps/customview/MyUserIconTitleLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/MyUserIconTitleLayout$a;->b:Lcom/join/mgps/customview/MyUserIconTitleLayout;

    invoke-static {v0}, Lcom/join/mgps/customview/MyUserIconTitleLayout;->a(Lcom/join/mgps/customview/MyUserIconTitleLayout;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/MyUserIconTitleLayout$a;->b:Lcom/join/mgps/customview/MyUserIconTitleLayout;

    invoke-static {v0}, Lcom/join/mgps/customview/MyUserIconTitleLayout;->b(Lcom/join/mgps/customview/MyUserIconTitleLayout;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v0

    const v1, 0x7f080f33

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageResource(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/MyUserIconTitleLayout$a;->b:Lcom/join/mgps/customview/MyUserIconTitleLayout;

    invoke-static {v0}, Lcom/join/mgps/customview/MyUserIconTitleLayout;->c(Lcom/join/mgps/customview/MyUserIconTitleLayout;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/customview/MyUserIconTitleLayout$a;->b:Lcom/join/mgps/customview/MyUserIconTitleLayout;

    invoke-static {v1}, Lcom/join/mgps/customview/MyUserIconTitleLayout;->b(Lcom/join/mgps/customview/MyUserIconTitleLayout;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->t(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 5
    :try_start_0
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->G()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/b;->vl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    :catch_0
    iget-object v2, p0, Lcom/join/mgps/customview/MyUserIconTitleLayout$a;->b:Lcom/join/mgps/customview/MyUserIconTitleLayout;

    invoke-static {v2}, Lcom/join/mgps/customview/MyUserIconTitleLayout;->d(Lcom/join/mgps/customview/MyUserIconTitleLayout;)Lcom/join/mgps/customview/VipView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->j1()I

    move-result v0

    invoke-virtual {v2, v1, v0}, Lcom/join/mgps/customview/VipView;->setVipData(II)V

    :goto_0
    return-void
.end method
