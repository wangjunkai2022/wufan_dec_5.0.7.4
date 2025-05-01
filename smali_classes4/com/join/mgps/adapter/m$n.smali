.class Lcom/join/mgps/adapter/m$n;
.super Ljava/lang/Object;
.source "DownloadCenterAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/m;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/m;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/m$n;->b:Lcom/join/mgps/adapter/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance p1, Lcom/join/mgps/customview/o;

    iget-object v0, p0, Lcom/join/mgps/adapter/m$n;->b:Lcom/join/mgps/adapter/m;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    const v1, 0x7f110191

    invoke-direct {p1, v0, v1}, Lcom/join/mgps/customview/o;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f0c0167

    .line 2
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setContentView(I)V

    const v0, 0x7f09041f

    .line 3
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const v1, 0x7f09145c

    .line 4
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const-string v2, "\u5220\u9664\u4efb\u52a1"

    .line 5
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f090428

    .line 6
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const-string v2, "\u4f60\u786e\u5b9a\u8981\u6e05\u7a7a\u6240\u6709\u4e0b\u8f7d\u5386\u53f2\uff1f"

    .line 7
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    new-instance v1, Lcom/join/mgps/adapter/m$n$a;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/adapter/m$n$a;-><init>(Lcom/join/mgps/adapter/m$n;Landroid/app/Dialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f090425

    .line 9
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "\u6e05\u7a7a\u5386\u53f2"

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 11
    new-instance v1, Lcom/join/mgps/adapter/m$n$b;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/adapter/m$n$b;-><init>(Lcom/join/mgps/adapter/m$n;Landroid/app/Dialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method
