.class Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;
.super Landroid/widget/BaseAdapter;
.source "UsercenterFragmentNew.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/login/UsercenterFragmentNew;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private isChange:Z

.field private mDatas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/UserCenterBean$UserCenterItem;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/join/mgps/activity/login/UsercenterFragmentNew;

.field private totalnum:I


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/login/UsercenterFragmentNew;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/UserCenterBean$UserCenterItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->this$0:Lcom/join/mgps/activity/login/UsercenterFragmentNew;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->totalnum:I

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->isChange:Z

    .line 4
    iput-object p2, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->mDatas:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->mDatas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->mDatas:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-nez p2, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c0433

    invoke-virtual {v2, v3, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 2
    new-instance p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;

    invoke-direct {p3, p0}, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;-><init>(Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;)V

    const v2, 0x7f09094f

    .line 3
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v2, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->iv_module_icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v2, 0x7f091631

    .line 4
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->tv_module_name:Landroid/widget/TextView;

    const v2, 0x7f091630

    .line 5
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->tv_module_doings:Landroid/widget/TextView;

    const v2, 0x7f090ce3

    .line 6
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->ll_content:Landroid/widget/LinearLayout;

    const v2, 0x7f0904dc

    .line 7
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->emptyDivider:Landroid/view/View;

    const v2, 0x7f090dfc

    .line 8
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->messageBadge:Landroid/widget/TextView;

    .line 9
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object v2, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->emptyDivider:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;

    .line 13
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->mDatas:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/UserCenterBean$UserCenterItem;

    .line 14
    iget-object v3, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->this$0:Lcom/join/mgps/activity/login/UsercenterFragmentNew;

    invoke-static {v3}, Lcom/join/mgps/activity/login/UsercenterFragmentNew;->access$000(Lcom/join/mgps/activity/login/UsercenterFragmentNew;)Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v3

    if-nez v3, :cond_4

    if-nez p1, :cond_3

    .line 15
    iget p1, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->totalnum:I

    if-lez p1, :cond_2

    .line 16
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->messageBadge:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    iget p1, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->totalnum:I

    const/16 v3, 0x63

    if-le p1, v3, :cond_1

    .line 18
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->messageBadge:Landroid/widget/TextView;

    const-string v3, "+99"

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 19
    :cond_1
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->messageBadge:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->totalnum:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 20
    :cond_2
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->messageBadge:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 21
    :cond_3
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->messageBadge:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/join/mgps/dto/UserCenterBean$UserCenterItem;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 23
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->emptyDivider:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->ll_content:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_4

    .line 25
    :cond_5
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->emptyDivider:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    invoke-virtual {v2}, Lcom/join/mgps/dto/UserCenterBean$UserCenterItem;->isPlaceHolder()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 27
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->ll_content:Landroid/widget/LinearLayout;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 28
    :cond_6
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->ll_content:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 29
    :goto_2
    invoke-virtual {v2}, Lcom/join/mgps/dto/UserCenterBean$UserCenterItem;->getMain()Lcom/join/mgps/dto/UserCenterItemBean;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 30
    invoke-virtual {v2}, Lcom/join/mgps/dto/UserCenterBean$UserCenterItem;->getMain()Lcom/join/mgps/dto/UserCenterItemBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/UserCenterItemBean;->getPic_remote()Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 32
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->iv_module_icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v0, "res:///2131232629"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->m(Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/net/Uri;)V

    goto :goto_3

    .line 33
    :cond_7
    iget-object v0, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->iv_module_icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    sget-object v1, Lcom/facebook/drawee/drawable/r$c;->c:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {v0, p1, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->i(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    .line 34
    :goto_3
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->tv_module_name:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/join/mgps/dto/UserCenterBean$UserCenterItem;->getMain()Lcom/join/mgps/dto/UserCenterItemBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/UserCenterItemBean;->getSub_title()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    iget-object p1, p3, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter$ViewHolder;->tv_module_doings:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/join/mgps/dto/UserCenterBean$UserCenterItem;->getMain()Lcom/join/mgps/dto/UserCenterItemBean;

    move-result-object p3

    invoke-virtual {p3}, Lcom/join/mgps/dto/UserCenterItemBean;->getLabel()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    :goto_4
    return-object p2
.end method

.method public setTotalnum(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->isChange:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->isChange:Z

    .line 2
    iput p1, p0, Lcom/join/mgps/activity/login/UsercenterFragmentNew$MyAdapter;->totalnum:I

    return-void
.end method
