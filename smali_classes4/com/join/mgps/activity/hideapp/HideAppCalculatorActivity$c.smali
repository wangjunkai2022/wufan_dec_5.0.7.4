.class Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$c;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "HideAppCalculatorActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$c;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->f0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)Ljava/util/List;

    move-result-object p1

    const v0, 0x7f0c03d0

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;)V
    .locals 4
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0914f9

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "DEL"

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v1, 0x7f0908d7

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f0911a2

    .line 5
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/cardview/widget/CardView;

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$c;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;)V

    return-void
.end method
